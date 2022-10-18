package typings.nivoPie

import typings.nivoPie.anon.Datum
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPieTooltipMod {
  
  @JSImport("@nivo/pie/dist/types/PieTooltip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[RawDatum](hasDatum: Datum[RawDatum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasDatum.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def PieTooltip[RawDatum](hasDatum: Datum[RawDatum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("PieTooltip")(hasDatum.asInstanceOf[js.Any]).asInstanceOf[Element]
}
