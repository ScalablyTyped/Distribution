package typings.pacResolver

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isResolvableMod {
  
  @JSImport("pac-resolver/dist/isResolvable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(host: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(host.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
}
