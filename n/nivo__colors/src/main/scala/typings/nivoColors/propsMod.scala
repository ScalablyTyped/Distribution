package typings.nivoColors

import typings.nivoColors.anon.Datum
import typings.nivoColors.anon.From
import typings.nivoColors.anon.Scheme
import typings.nivoColors.anon.Theme
import typings.propTypes.mod.InferProps
import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object propsMod {
  
  @JSImport("@nivo/colors/dist/types/props", "inheritedColorPropType")
  @js.native
  val inheritedColorPropType: Requireable[String | (js.Function1[/* repeated */ Any, Any]) | (InferProps[From | Theme])] = js.native
  
  @JSImport("@nivo/colors/dist/types/props", "ordinalColorsPropType")
  @js.native
  val ordinalColorsPropType: Requireable[
    String | (js.Function1[/* repeated */ Any, Any]) | (js.Array[js.UndefOr[String | Null]]) | (InferProps[Datum | Scheme])
  ] = js.native
}
