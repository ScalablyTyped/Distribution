package typings.nivoColors

import typings.nivoColors.anon.Datum
import typings.nivoColors.anon.From
import typings.nivoColors.anon.Scheme
import typings.nivoColors.anon.Theme
import typings.propTypes.mod.InferProps
import typings.propTypes.mod.Requireable
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPropsMod {
  
  @JSImport("@nivo/colors/dist/types/props", "inheritedColorPropType")
  @js.native
  val inheritedColorPropType: Requireable[
    NonNullable[
      js.UndefOr[
        String | (js.Function1[/* repeated */ Any, Any]) | (InferProps[From | Theme]) | Null
      ]
    ]
  ] = js.native
  
  @JSImport("@nivo/colors/dist/types/props", "ordinalColorsPropType")
  @js.native
  val ordinalColorsPropType: Requireable[
    NonNullable[
      js.UndefOr[
        String | (js.Function1[/* repeated */ Any, Any]) | (js.Array[js.UndefOr[String | Null]]) | (InferProps[Datum | Scheme]) | Null
      ]
    ]
  ] = js.native
}
