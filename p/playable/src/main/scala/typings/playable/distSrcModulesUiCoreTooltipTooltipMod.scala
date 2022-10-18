package typings.playable

import org.scalablytyped.runtime.StringDictionary
import typings.playable.distSrcModulesUiCoreTooltipTypesMod.ITooltip
import typings.playable.distSrcModulesUiCoreTooltipTypesMod.ITooltipStyles
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiCoreTooltipTooltipMod {
  
  @JSImport("playable/dist/src/modules/ui/core/tooltip/tooltip", JSImport.Default)
  @js.native
  open class default () extends Tooltip {
    
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
    extends typings.playable.distSrcModulesUiCoreStylableMod.default[ITooltipStyles]
       with ITooltip {
    
    /* private */ @JSName("_$rootElement")
    var _$rootElement: Any = js.native
    
    /* private */ @JSName("_$tooltipInner")
    var _$tooltipInner: Any = js.native
    
    /* private */ var _initDOM: Any = js.native
    
    /* private */ var _isHidden: Any = js.native
    
    /* private */ var _showAsElement: Any = js.native
    
    /* private */ var _showAsText: Any = js.native
    
    def clearElement(): Unit = js.native
    
    @JSName("isHidden")
    def isHidden_MTooltip: Boolean = js.native
    
    def setElement(element: HTMLElement): Unit = js.native
    
    def setStyle(style: Any): Unit = js.native
  }
}
