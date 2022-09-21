package typings.nivoWaffle

import typings.nivoWaffle.nivoWaffleStrings.animate
import typings.nivoWaffle.nivoWaffleStrings.borderColor
import typings.nivoWaffle.nivoWaffleStrings.borderWidth
import typings.nivoWaffle.nivoWaffleStrings.colors
import typings.nivoWaffle.nivoWaffleStrings.columns
import typings.nivoWaffle.nivoWaffleStrings.data
import typings.nivoWaffle.nivoWaffleStrings.emptyColor
import typings.nivoWaffle.nivoWaffleStrings.emptyOpacity
import typings.nivoWaffle.nivoWaffleStrings.fillDirection
import typings.nivoWaffle.nivoWaffleStrings.isInteractive
import typings.nivoWaffle.nivoWaffleStrings.layers
import typings.nivoWaffle.nivoWaffleStrings.margin
import typings.nivoWaffle.nivoWaffleStrings.motionConfig
import typings.nivoWaffle.nivoWaffleStrings.onClick
import typings.nivoWaffle.nivoWaffleStrings.onMouseEnter
import typings.nivoWaffle.nivoWaffleStrings.onMouseLeave
import typings.nivoWaffle.nivoWaffleStrings.onMouseMove
import typings.nivoWaffle.nivoWaffleStrings.padding
import typings.nivoWaffle.nivoWaffleStrings.role
import typings.nivoWaffle.nivoWaffleStrings.rows
import typings.nivoWaffle.nivoWaffleStrings.theme
import typings.nivoWaffle.nivoWaffleStrings.tooltip
import typings.nivoWaffle.nivoWaffleStrings.total
import typings.nivoWaffle.nivoWaffleStrings.valueFormat
import typings.nivoWaffle.typesTypesMod.Datum
import typings.nivoWaffle.typesTypesMod.HtmlProps
import typings.react.mod.global.JSX.Element
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object responsiveWaffleHtmlMod {
  
  @JSImport("@nivo/waffle/dist/types/ResponsiveWaffleHtml", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ResponsiveWaffleHtml[RawDatum /* <: Datum */](
    props: Pick[
      HtmlProps[RawDatum], 
      onMouseEnter | onMouseLeave | onClick | onMouseMove | data | animate | valueFormat | fillDirection | padding | colors | emptyColor | borderColor | margin | theme | emptyOpacity | borderWidth | isInteractive | tooltip | role | total | rows | columns | motionConfig | layers
    ]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ResponsiveWaffleHtml")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
