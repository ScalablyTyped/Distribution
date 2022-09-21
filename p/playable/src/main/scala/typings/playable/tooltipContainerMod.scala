package typings.playable

import org.scalablytyped.runtime.StringDictionary
import typings.playable.anon.Bottom
import typings.playable.anon.Left
import typings.playable.coreTypesMod.IStyles
import typings.playable.tooltipTypesMod.ITooltipPosition
import typings.playable.tooltipTypesMod.ITooltipPositionFunction
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipContainerMod {
  
  @JSImport("playable/dist/src/modules/ui/core/tooltip/tooltip-container", JSImport.Default)
  @js.native
  open class default protected () extends TooltipContainer {
    def this(tooltip: typings.playable.tooltipTooltipMod.default) = this()
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def getElement(): HTMLElement = js.native
    
    /* CompleteClass */
    override def getTooltipPositionStyles(position: ITooltipPosition): StringDictionary[String | Double] = js.native
  }
  
  trait ITooltipContainer extends StObject {
    
    def destroy(): Unit
    
    def getElement(): HTMLElement
    
    def getTooltipPositionStyles(position: ITooltipPosition): StringDictionary[String | Double]
  }
  object ITooltipContainer {
    
    inline def apply(
      destroy: () => Unit,
      getElement: () => HTMLElement,
      getTooltipPositionStyles: ITooltipPosition => StringDictionary[String | Double]
    ): ITooltipContainer = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), getTooltipPositionStyles = js.Any.fromFunction1(getTooltipPositionStyles))
      __obj.asInstanceOf[ITooltipContainer]
    }
    
    extension [Self <: ITooltipContainer](x: Self) {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setGetElement(value: () => HTMLElement): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
      
      inline def setGetTooltipPositionStyles(value: ITooltipPosition => StringDictionary[String | Double]): Self = StObject.set(x, "getTooltipPositionStyles", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait TooltipContainer
    extends typings.playable.stylableMod.default[IStyles]
       with ITooltipContainer {
    
    /* private */ @JSName("_$rootElement")
    var _$rootElement: Any = js.native
    
    /* private */ var _getTooltipLeftX: Any = js.native
    
    /* private */ var _initDOM: Any = js.native
    
    /* private */ var _tooltip: Any = js.native
    
    def getTooltipPositionStyles(position: ITooltipPositionFunction): Bottom | Left = js.native
  }
}
