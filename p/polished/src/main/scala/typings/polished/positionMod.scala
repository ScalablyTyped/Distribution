package typings.polished

import typings.polished.styleMod.Styles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object positionMod {
  
  @JSImport("polished/lib/shorthands/position", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(firstValue: String, values: (Null | Unit | String | Double)*): Styles = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(firstValue.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Styles]
  inline def default(firstValue: Double, values: (Null | Unit | String | Double)*): Styles = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(firstValue.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Styles]
  inline def default(firstValue: Null, values: (Null | Unit | String | Double)*): Styles = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(firstValue.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Styles]
}
