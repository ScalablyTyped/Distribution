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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipContainerMod {
  
  @JSImport("playable/dist/src/modules/ui/core/tooltip/tooltip-container", JSImport.Default)
  @js.native
  class default protected () extends TooltipContainer {
    def this(tooltip: typings.playable.tooltipTooltipMod.default) = this()
  }
  
  @js.native
  trait ITooltipContainer extends StObject {
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def getTooltipPositionStyles(position: ITooltipPosition): StringDictionary[String | Double] = js.native
  }
  object ITooltipContainer {
    
    @scala.inline
    def apply(
      destroy: () => Unit,
      getElement: () => HTMLElement,
      getTooltipPositionStyles: ITooltipPosition => StringDictionary[String | Double]
    ): ITooltipContainer = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), getTooltipPositionStyles = js.Any.fromFunction1(getTooltipPositionStyles))
      __obj.asInstanceOf[ITooltipContainer]
    }
    
    @scala.inline
    implicit class ITooltipContainerMutableBuilder[Self <: ITooltipContainer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetElement(value: () => HTMLElement): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTooltipPositionStyles(value: ITooltipPosition => StringDictionary[String | Double]): Self = StObject.set(x, "getTooltipPositionStyles", js.Any.fromFunction1(value))
    }
  }
  
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
}
