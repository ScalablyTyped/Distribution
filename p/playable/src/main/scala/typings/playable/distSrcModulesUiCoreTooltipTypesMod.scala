package typings.playable

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiCoreTooltipTypesMod {
  
  @js.native
  sealed trait TooltipPositionPlacement extends StObject
  @JSImport("playable/dist/src/modules/ui/core/tooltip/types", "TooltipPositionPlacement")
  @js.native
  object TooltipPositionPlacement extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TooltipPositionPlacement & String] = js.native
    
    @js.native
    sealed trait BOTTOM
      extends StObject
         with TooltipPositionPlacement
    /* "bottom" */ val BOTTOM: typings.playable.distSrcModulesUiCoreTooltipTypesMod.TooltipPositionPlacement.BOTTOM & String = js.native
    
    @js.native
    sealed trait TOP
      extends StObject
         with TooltipPositionPlacement
    /* "top" */ val TOP: typings.playable.distSrcModulesUiCoreTooltipTypesMod.TooltipPositionPlacement.TOP & String = js.native
  }
  
  trait ITooltip extends StObject {
    
    def destroy(): Unit
    
    def getElement(): HTMLElement
    
    def hide(): Unit
    
    var isHidden: Boolean
    
    def setStyle(style: StringDictionary[String | Double]): Unit
    
    def setText(text: String): Unit
    
    def show(): Unit
  }
  object ITooltip {
    
    inline def apply(
      destroy: () => Unit,
      getElement: () => HTMLElement,
      hide: () => Unit,
      isHidden: Boolean,
      setStyle: StringDictionary[String | Double] => Unit,
      setText: String => Unit,
      show: () => Unit
    ): ITooltip = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), hide = js.Any.fromFunction0(hide), isHidden = isHidden.asInstanceOf[js.Any], setStyle = js.Any.fromFunction1(setStyle), setText = js.Any.fromFunction1(setText), show = js.Any.fromFunction0(show))
      __obj.asInstanceOf[ITooltip]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ITooltip] (val x: Self) extends AnyVal {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setGetElement(value: () => HTMLElement): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
      
      inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      inline def setIsHidden(value: Boolean): Self = StObject.set(x, "isHidden", value.asInstanceOf[js.Any])
      
      inline def setSetStyle(value: StringDictionary[String | Double] => Unit): Self = StObject.set(x, "setStyle", js.Any.fromFunction1(value))
      
      inline def setSetText(value: String => Unit): Self = StObject.set(x, "setText", js.Any.fromFunction1(value))
      
      inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    }
  }
  
  trait ITooltipPosition extends StObject {
    
    var placement: TooltipPositionPlacement
    
    var x: Double
  }
  object ITooltipPosition {
    
    inline def apply(placement: TooltipPositionPlacement, x: Double): ITooltipPosition = {
      val __obj = js.Dynamic.literal(placement = placement.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITooltipPosition]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ITooltipPosition] (val x: Self) extends AnyVal {
      
      inline def setPlacement(value: TooltipPositionPlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    }
  }
  
  type ITooltipPositionFunction = js.Function1[/* tooltipContainerElement */ HTMLElement, ITooltipPosition]
  
  trait ITooltipReference extends StObject {
    
    def destroy(): Unit
    
    def disable(): Unit
    
    def enable(): Unit
    
    def hide(): Unit
    
    var isDisabled: Boolean
    
    var isHidden: Boolean
    
    def setText(text: String): Unit
    
    def show(): Unit
  }
  object ITooltipReference {
    
    inline def apply(
      destroy: () => Unit,
      disable: () => Unit,
      enable: () => Unit,
      hide: () => Unit,
      isDisabled: Boolean,
      isHidden: Boolean,
      setText: String => Unit,
      show: () => Unit
    ): ITooltipReference = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), hide = js.Any.fromFunction0(hide), isDisabled = isDisabled.asInstanceOf[js.Any], isHidden = isHidden.asInstanceOf[js.Any], setText = js.Any.fromFunction1(setText), show = js.Any.fromFunction0(show))
      __obj.asInstanceOf[ITooltipReference]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ITooltipReference] (val x: Self) extends AnyVal {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setDisable(value: () => Unit): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
      
      inline def setEnable(value: () => Unit): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
      
      inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      inline def setIsHidden(value: Boolean): Self = StObject.set(x, "isHidden", value.asInstanceOf[js.Any])
      
      inline def setSetText(value: String => Unit): Self = StObject.set(x, "setText", js.Any.fromFunction1(value))
      
      inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    }
  }
  
  trait ITooltipReferenceOptions extends StObject {
    
    var element: js.UndefOr[HTMLElement] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
  }
  object ITooltipReferenceOptions {
    
    inline def apply(): ITooltipReferenceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITooltipReferenceOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ITooltipReferenceOptions] (val x: Self) extends AnyVal {
      
      inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait ITooltipService extends StObject {
    
    def createReference(reference: HTMLElement, options: ITooltipReferenceOptions): ITooltipReference
    
    def destroy(): Unit
    
    def hide(): Unit
    
    var isHidden: Boolean
    
    def setText(text: String): Unit
    
    def show(options: ITooltipShowOptions): Unit
    
    var tooltipContainerElement: HTMLElement
  }
  object ITooltipService {
    
    inline def apply(
      createReference: (HTMLElement, ITooltipReferenceOptions) => ITooltipReference,
      destroy: () => Unit,
      hide: () => Unit,
      isHidden: Boolean,
      setText: String => Unit,
      show: ITooltipShowOptions => Unit,
      tooltipContainerElement: HTMLElement
    ): ITooltipService = {
      val __obj = js.Dynamic.literal(createReference = js.Any.fromFunction2(createReference), destroy = js.Any.fromFunction0(destroy), hide = js.Any.fromFunction0(hide), isHidden = isHidden.asInstanceOf[js.Any], setText = js.Any.fromFunction1(setText), show = js.Any.fromFunction1(show), tooltipContainerElement = tooltipContainerElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITooltipService]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ITooltipService] (val x: Self) extends AnyVal {
      
      inline def setCreateReference(value: (HTMLElement, ITooltipReferenceOptions) => ITooltipReference): Self = StObject.set(x, "createReference", js.Any.fromFunction2(value))
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      inline def setIsHidden(value: Boolean): Self = StObject.set(x, "isHidden", value.asInstanceOf[js.Any])
      
      inline def setSetText(value: String => Unit): Self = StObject.set(x, "setText", js.Any.fromFunction1(value))
      
      inline def setShow(value: ITooltipShowOptions => Unit): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
      
      inline def setTooltipContainerElement(value: HTMLElement): Self = StObject.set(x, "tooltipContainerElement", value.asInstanceOf[js.Any])
    }
  }
  
  trait ITooltipShowOptions extends StObject {
    
    var element: js.UndefOr[HTMLElement] = js.undefined
    
    var position: ITooltipPosition | ITooltipPositionFunction
    
    var text: js.UndefOr[String] = js.undefined
  }
  object ITooltipShowOptions {
    
    inline def apply(position: ITooltipPosition | ITooltipPositionFunction): ITooltipShowOptions = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITooltipShowOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ITooltipShowOptions] (val x: Self) extends AnyVal {
      
      inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setPosition(value: ITooltipPosition | ITooltipPositionFunction): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionFunction1(value: /* tooltipContainerElement */ HTMLElement => ITooltipPosition): Self = StObject.set(x, "position", js.Any.fromFunction1(value))
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait ITooltipStyles extends StObject {
    
    var showAsElement: String
    
    var showAsText: String
    
    var tooltip: String
    
    var tooltipInner: String
    
    var tooltipVisible: String
  }
  object ITooltipStyles {
    
    inline def apply(
      showAsElement: String,
      showAsText: String,
      tooltip: String,
      tooltipInner: String,
      tooltipVisible: String
    ): ITooltipStyles = {
      val __obj = js.Dynamic.literal(showAsElement = showAsElement.asInstanceOf[js.Any], showAsText = showAsText.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], tooltipInner = tooltipInner.asInstanceOf[js.Any], tooltipVisible = tooltipVisible.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITooltipStyles]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ITooltipStyles] (val x: Self) extends AnyVal {
      
      inline def setShowAsElement(value: String): Self = StObject.set(x, "showAsElement", value.asInstanceOf[js.Any])
      
      inline def setShowAsText(value: String): Self = StObject.set(x, "showAsText", value.asInstanceOf[js.Any])
      
      inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipInner(value: String): Self = StObject.set(x, "tooltipInner", value.asInstanceOf[js.Any])
      
      inline def setTooltipVisible(value: String): Self = StObject.set(x, "tooltipVisible", value.asInstanceOf[js.Any])
    }
  }
}
