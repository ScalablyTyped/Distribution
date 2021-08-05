package typings.pacResolver

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shExpMatchMod {
  
  @JSImport("pac-resolver/dist/shExpMatch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(str: String, shexp: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any], shexp.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
