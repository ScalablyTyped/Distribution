package typings.polished

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object desaturateMod {
  
  @JSImport("polished/lib/color/desaturate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(amount: String): js.Function1[/* color */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(amount.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* color */ String, String]]
  inline def default(amount: String, color: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(amount.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(amount: Double): js.Function1[/* color */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(amount.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* color */ String, String]]
  inline def default(amount: Double, color: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(amount.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[String]
}
