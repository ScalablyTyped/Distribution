package typings.polished

import typings.polished.anon.FnCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libColorMixMod {
  
  @JSImport("polished/lib/color/mix", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(weight: String): FnCall = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(weight.asInstanceOf[js.Any]).asInstanceOf[FnCall]
  inline def default(weight: String, color: String): js.Function1[/* otherColor */ String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(weight.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* otherColor */ String, String]]
  inline def default(weight: String, color: String, otherColor: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(weight.asInstanceOf[js.Any], color.asInstanceOf[js.Any], otherColor.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(weight: Double): FnCall = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(weight.asInstanceOf[js.Any]).asInstanceOf[FnCall]
  inline def default(weight: Double, color: String): js.Function1[/* otherColor */ String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(weight.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* otherColor */ String, String]]
  inline def default(weight: Double, color: String, otherColor: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(weight.asInstanceOf[js.Any], color.asInstanceOf[js.Any], otherColor.asInstanceOf[js.Any])).asInstanceOf[String]
}
