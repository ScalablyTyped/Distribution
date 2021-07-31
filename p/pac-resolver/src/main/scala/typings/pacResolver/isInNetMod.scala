package typings.pacResolver

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isInNetMod {
  
  @JSImport("pac-resolver/dist/isInNet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(host: String, pattern: String, mask: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(host.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
}
