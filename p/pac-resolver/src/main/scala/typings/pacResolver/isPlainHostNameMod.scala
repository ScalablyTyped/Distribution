package typings.pacResolver

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isPlainHostNameMod {
  
  @JSImport("pac-resolver/dist/isPlainHostName", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(host: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(host.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
