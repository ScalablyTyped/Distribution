package typings.playable

import typings.std.Event
import typings.std.EventListener
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rootContainerTypesMod {
  
  @js.native
  trait IRootContainer extends StObject {
    
    def appendComponentElement(element: HTMLElement): Unit = js.native
    
    def attachToElement(element: HTMLElement): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def getHeight(): Double = js.native
    
    def getWidth(): Double = js.native
    
    def hide(): Unit = js.native
    
    def setFillAllSpace(flag: Boolean): Unit = js.native
    
    def setHeight(height: Double): Unit = js.native
    
    def setRtl(rtl: Boolean): Unit = js.native
    
    def setWidth(width: Double): Unit = js.native
    
    def show(): Unit = js.native
  }
  object IRootContainer {
    
    @scala.inline
    def apply(
      appendComponentElement: HTMLElement => Unit,
      attachToElement: HTMLElement => Unit,
      destroy: () => Unit,
      getElement: () => HTMLElement,
      getHeight: () => Double,
      getWidth: () => Double,
      hide: () => Unit,
      setFillAllSpace: Boolean => Unit,
      setHeight: Double => Unit,
      setRtl: Boolean => Unit,
      setWidth: Double => Unit,
      show: () => Unit
    ): IRootContainer = {
      val __obj = js.Dynamic.literal(appendComponentElement = js.Any.fromFunction1(appendComponentElement), attachToElement = js.Any.fromFunction1(attachToElement), destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), getHeight = js.Any.fromFunction0(getHeight), getWidth = js.Any.fromFunction0(getWidth), hide = js.Any.fromFunction0(hide), setFillAllSpace = js.Any.fromFunction1(setFillAllSpace), setHeight = js.Any.fromFunction1(setHeight), setRtl = js.Any.fromFunction1(setRtl), setWidth = js.Any.fromFunction1(setWidth), show = js.Any.fromFunction0(show))
      __obj.asInstanceOf[IRootContainer]
    }
    
    @scala.inline
    implicit class IRootContainerMutableBuilder[Self <: IRootContainer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppendComponentElement(value: HTMLElement => Unit): Self = StObject.set(x, "appendComponentElement", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAttachToElement(value: HTMLElement => Unit): Self = StObject.set(x, "attachToElement", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetElement(value: () => HTMLElement): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetHeight(value: () => Double): Self = StObject.set(x, "getHeight", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetWidth(value: () => Double): Self = StObject.set(x, "getWidth", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetFillAllSpace(value: Boolean => Unit): Self = StObject.set(x, "setFillAllSpace", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetHeight(value: Double => Unit): Self = StObject.set(x, "setHeight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetRtl(value: Boolean => Unit): Self = StObject.set(x, "setRtl", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetWidth(value: Double => Unit): Self = StObject.set(x, "setWidth", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait IRootContainerAPI extends StObject {
    
    var attachToElement: js.UndefOr[js.Function1[/* element */ HTMLElement, Unit]] = js.native
    
    var getElement: js.UndefOr[js.Function0[HTMLElement]] = js.native
    
    var getHeight: js.UndefOr[js.Function0[Double]] = js.native
    
    var getWidth: js.UndefOr[js.Function0[Double]] = js.native
    
    var hide: js.UndefOr[js.Function0[Unit]] = js.native
    
    var setFillAllSpace: js.UndefOr[js.Function1[/* flag */ Boolean, Unit]] = js.native
    
    var setHeight: js.UndefOr[js.Function1[/* height */ Double, Unit]] = js.native
    
    var setRtl: js.UndefOr[js.Function1[/* rtl */ Boolean, Unit]] = js.native
    
    var setWidth: js.UndefOr[js.Function1[/* width */ Double, Unit]] = js.native
    
    var show: js.UndefOr[js.Function0[Unit]] = js.native
  }
  object IRootContainerAPI {
    
    @scala.inline
    def apply(): IRootContainerAPI = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRootContainerAPI]
    }
    
    @scala.inline
    implicit class IRootContainerAPIMutableBuilder[Self <: IRootContainerAPI] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttachToElement(value: /* element */ HTMLElement => Unit): Self = StObject.set(x, "attachToElement", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAttachToElementUndefined: Self = StObject.set(x, "attachToElement", js.undefined)
      
      @scala.inline
      def setGetElement(value: () => HTMLElement): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetElementUndefined: Self = StObject.set(x, "getElement", js.undefined)
      
      @scala.inline
      def setGetHeight(value: () => Double): Self = StObject.set(x, "getHeight", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetHeightUndefined: Self = StObject.set(x, "getHeight", js.undefined)
      
      @scala.inline
      def setGetWidth(value: () => Double): Self = StObject.set(x, "getWidth", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetWidthUndefined: Self = StObject.set(x, "getWidth", js.undefined)
      
      @scala.inline
      def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
      
      @scala.inline
      def setSetFillAllSpace(value: /* flag */ Boolean => Unit): Self = StObject.set(x, "setFillAllSpace", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetFillAllSpaceUndefined: Self = StObject.set(x, "setFillAllSpace", js.undefined)
      
      @scala.inline
      def setSetHeight(value: /* height */ Double => Unit): Self = StObject.set(x, "setHeight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetHeightUndefined: Self = StObject.set(x, "setHeight", js.undefined)
      
      @scala.inline
      def setSetRtl(value: /* rtl */ Boolean => Unit): Self = StObject.set(x, "setRtl", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetRtlUndefined: Self = StObject.set(x, "setRtl", js.undefined)
      
      @scala.inline
      def setSetWidth(value: /* width */ Double => Unit): Self = StObject.set(x, "setWidth", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetWidthUndefined: Self = StObject.set(x, "setWidth", js.undefined)
      
      @scala.inline
      def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    }
  }
  
  @js.native
  trait IRootContainerViewCallbacks extends StObject {
    
    def onMouseEnter(evt: Event): Unit = js.native
    @JSName("onMouseEnter")
    var onMouseEnter_Original: EventListener = js.native
    
    def onMouseLeave(evt: Event): Unit = js.native
    @JSName("onMouseLeave")
    var onMouseLeave_Original: EventListener = js.native
    
    def onMouseMove(evt: Event): Unit = js.native
    @JSName("onMouseMove")
    var onMouseMove_Original: EventListener = js.native
  }
  
  @js.native
  trait IRootContainerViewConfig extends StObject {
    
    var callbacks: IRootContainerViewCallbacks = js.native
    
    var fillAllSpace: Boolean = js.native
    
    var height: Double = js.native
    
    var rtl: Boolean = js.native
    
    var width: Double = js.native
  }
  object IRootContainerViewConfig {
    
    @scala.inline
    def apply(
      callbacks: IRootContainerViewCallbacks,
      fillAllSpace: Boolean,
      height: Double,
      rtl: Boolean,
      width: Double
    ): IRootContainerViewConfig = {
      val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any], fillAllSpace = fillAllSpace.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], rtl = rtl.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRootContainerViewConfig]
    }
    
    @scala.inline
    implicit class IRootContainerViewConfigMutableBuilder[Self <: IRootContainerViewConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallbacks(value: IRootContainerViewCallbacks): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillAllSpace(value: Boolean): Self = StObject.set(x, "fillAllSpace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IRootContainerViewStyles extends StObject {
    
    var container: String = js.native
    
    var fillAllSpace: String = js.native
    
    var fullScreen: String = js.native
    
    var hidden: String = js.native
    
    var rtl: Boolean = js.native
  }
  object IRootContainerViewStyles {
    
    @scala.inline
    def apply(container: String, fillAllSpace: String, fullScreen: String, hidden: String, rtl: Boolean): IRootContainerViewStyles = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], fillAllSpace = fillAllSpace.asInstanceOf[js.Any], fullScreen = fullScreen.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], rtl = rtl.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRootContainerViewStyles]
    }
    
    @scala.inline
    implicit class IRootContainerViewStylesMutableBuilder[Self <: IRootContainerViewStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillAllSpace(value: String): Self = StObject.set(x, "fillAllSpace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullScreen(value: String): Self = StObject.set(x, "fullScreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
    }
  }
}
