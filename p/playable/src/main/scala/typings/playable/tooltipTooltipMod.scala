package typings.playable

import org.scalablytyped.runtime.StringDictionary
import typings.playable.tooltipTypesMod.ITooltip
import typings.playable.tooltipTypesMod.ITooltipStyles
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipTooltipMod {
  
  @JSImport("playable/dist/src/modules/ui/core/tooltip/tooltip", JSImport.Default)
  @js.native
  class default () extends Tooltip {
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def getElement(): HTMLElement = js.native
    
    /* CompleteClass */
    override def hide(): Unit = js.native
    
    /* CompleteClass */
    var isHidden: Boolean = js.native
    
    /* CompleteClass */
    override def setStyle(style: StringDictionary[String | Double]): Unit = js.native
    
    /* CompleteClass */
    override def setText(text: String): Unit = js.native
    
    /* CompleteClass */
    override def show(): Unit = js.native
  }
  
  @js.native
  trait Tooltip
    extends typings.playable.stylableMod.default[ITooltipStyles]
       with ITooltip {
    
    @JSName("_$rootElement")
    var _$rootElement: js.Any = js.native
    
    @JSName("_$tooltipInner")
    var _$tooltipInner: js.Any = js.native
    
    var _initDOM: js.Any = js.native
    
    var _isHidden: js.Any = js.native
    
    var _showAsElement: js.Any = js.native
    
    var _showAsText: js.Any = js.native
    
    def clearElement(): Unit = js.native
    
    @JSName("isHidden")
    def isHidden_MTooltip: Boolean = js.native
    
    def setElement(element: HTMLElement): Unit = js.native
    
    def setStyle(style: js.Any): Unit = js.native
  }
}
