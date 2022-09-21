package typings.nivoStream

import typings.nivoStream.typesMod.TooltipProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layerTooltipMod {
  
  @JSImport("@nivo/stream/dist/types/LayerTooltip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def LayerTooltip(hasLayer: TooltipProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("LayerTooltip")(hasLayer.asInstanceOf[js.Any]).asInstanceOf[Element]
}
