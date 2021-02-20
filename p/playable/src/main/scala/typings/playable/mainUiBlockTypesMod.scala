package typings.playable

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mainUiBlockTypesMod {
  
  @js.native
  trait IMainUIBlock extends StObject {
    
    def destroy(): Unit = js.native
    
    def disableShowingContent(): Unit = js.native
    
    def enableShowingContent(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def setShouldAlwaysShow(flag: Boolean): Unit = js.native
    
    def show(): Unit = js.native
  }
  object IMainUIBlock {
    
    @scala.inline
    def apply(
      destroy: () => Unit,
      disableShowingContent: () => Unit,
      enableShowingContent: () => Unit,
      getElement: () => HTMLElement,
      hide: () => Unit,
      setShouldAlwaysShow: Boolean => Unit,
      show: () => Unit
    ): IMainUIBlock = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), disableShowingContent = js.Any.fromFunction0(disableShowingContent), enableShowingContent = js.Any.fromFunction0(enableShowingContent), getElement = js.Any.fromFunction0(getElement), hide = js.Any.fromFunction0(hide), setShouldAlwaysShow = js.Any.fromFunction1(setShouldAlwaysShow), show = js.Any.fromFunction0(show))
      __obj.asInstanceOf[IMainUIBlock]
    }
    
    @scala.inline
    implicit class IMainUIBlockMutableBuilder[Self <: IMainUIBlock] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDisableShowingContent(value: () => Unit): Self = StObject.set(x, "disableShowingContent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEnableShowingContent(value: () => Unit): Self = StObject.set(x, "enableShowingContent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetElement(value: () => HTMLElement): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetShouldAlwaysShow(value: Boolean => Unit): Self = StObject.set(x, "setShouldAlwaysShow", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait IMainUIBlockAPI extends StObject {
    
    var setMainUIShouldAlwaysShow: js.UndefOr[js.Function1[/* flag */ Boolean, Unit]] = js.native
  }
  object IMainUIBlockAPI {
    
    @scala.inline
    def apply(): IMainUIBlockAPI = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IMainUIBlockAPI]
    }
    
    @scala.inline
    implicit class IMainUIBlockAPIMutableBuilder[Self <: IMainUIBlockAPI] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSetMainUIShouldAlwaysShow(value: /* flag */ Boolean => Unit): Self = StObject.set(x, "setMainUIShouldAlwaysShow", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetMainUIShouldAlwaysShowUndefined: Self = StObject.set(x, "setMainUIShouldAlwaysShow", js.undefined)
    }
  }
  
  @js.native
  trait IMainUIBlockViewConfig extends StObject {
    
    var elements: IMainUIBlockViewElements = js.native
  }
  object IMainUIBlockViewConfig {
    
    @scala.inline
    def apply(elements: IMainUIBlockViewElements): IMainUIBlockViewConfig = {
      val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMainUIBlockViewConfig]
    }
    
    @scala.inline
    implicit class IMainUIBlockViewConfigMutableBuilder[Self <: IMainUIBlockViewConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElements(value: IMainUIBlockViewElements): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IMainUIBlockViewElements extends StObject {
    
    var bottomBlock: HTMLElement = js.native
    
    var tooltipContainer: HTMLElement = js.native
    
    var topBlock: HTMLElement = js.native
  }
  object IMainUIBlockViewElements {
    
    @scala.inline
    def apply(bottomBlock: HTMLElement, tooltipContainer: HTMLElement, topBlock: HTMLElement): IMainUIBlockViewElements = {
      val __obj = js.Dynamic.literal(bottomBlock = bottomBlock.asInstanceOf[js.Any], tooltipContainer = tooltipContainer.asInstanceOf[js.Any], topBlock = topBlock.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMainUIBlockViewElements]
    }
    
    @scala.inline
    implicit class IMainUIBlockViewElementsMutableBuilder[Self <: IMainUIBlockViewElements] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottomBlock(value: HTMLElement): Self = StObject.set(x, "bottomBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipContainer(value: HTMLElement): Self = StObject.set(x, "tooltipContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopBlock(value: HTMLElement): Self = StObject.set(x, "topBlock", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IMainUIBlockViewStyles extends StObject {
    
    var hidden: String = js.native
    
    var mainUiBlock: String = js.native
    
    var tooltipContainerWrapper: String = js.native
  }
  object IMainUIBlockViewStyles {
    
    @scala.inline
    def apply(hidden: String, mainUiBlock: String, tooltipContainerWrapper: String): IMainUIBlockViewStyles = {
      val __obj = js.Dynamic.literal(hidden = hidden.asInstanceOf[js.Any], mainUiBlock = mainUiBlock.asInstanceOf[js.Any], tooltipContainerWrapper = tooltipContainerWrapper.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMainUIBlockViewStyles]
    }
    
    @scala.inline
    implicit class IMainUIBlockViewStylesMutableBuilder[Self <: IMainUIBlockViewStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMainUiBlock(value: String): Self = StObject.set(x, "mainUiBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipContainerWrapper(value: String): Self = StObject.set(x, "tooltipContainerWrapper", value.asInstanceOf[js.Any])
    }
  }
}
