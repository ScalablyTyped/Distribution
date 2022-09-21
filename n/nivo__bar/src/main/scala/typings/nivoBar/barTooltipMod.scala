package typings.nivoBar

import typings.nivoBar.typesMod.BarTooltipProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object barTooltipMod {
  
  @JSImport("@nivo/bar/dist/types/BarTooltip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def BarTooltip[RawDatum](hasColorLabelData: BarTooltipProps[RawDatum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("BarTooltip")(hasColorLabelData.asInstanceOf[js.Any]).asInstanceOf[Element]
}
