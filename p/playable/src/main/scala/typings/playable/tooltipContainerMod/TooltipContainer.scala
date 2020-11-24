package typings.playable.tooltipContainerMod

import typings.playable.anon.Bottom
import typings.playable.anon.Left
import typings.playable.coreTypesMod.IStyles
import typings.playable.tooltipTypesMod.ITooltipPositionFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooltipContainer
  extends typings.playable.stylableMod.default[IStyles]
     with ITooltipContainer {
  
  @JSName("_$rootElement")
  var _$rootElement: js.Any = js.native
  
  var _getTooltipLeftX: js.Any = js.native
  
  var _initDOM: js.Any = js.native
  
  var _tooltip: js.Any = js.native
  
  def getTooltipPositionStyles(position: ITooltipPositionFunction): Bottom | Left = js.native
}
