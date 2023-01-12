package typings.playable

import typings.std.Event
import typings.std.EventListener
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesRootContainerTypesMod {
  
  trait IRootContainer extends StObject {
    
    def appendComponentElement(element: HTMLElement): Unit
    
    def attachToElement(element: HTMLElement): Unit
    
    def destroy(): Unit
    
    def getElement(): HTMLElement
    
    def getHeight(): Double
    
    def getWidth(): Double
    
    def hide(): Unit
    
    def setFillAllSpace(flag: Boolean): Unit
    
    def setHeight(height: Double): Unit
    
    def setRtl(rtl: Boolean): Unit
    
    def setWidth(width: Double): Unit
    
    def show(): Unit
  }
  object IRootContainer {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: IRootContainer] (val x: Self) extends AnyVal {
      
      inline def setAppendComponentElement(value: HTMLElement => Unit): Self = StObject.set(x, "appendComponentElement", js.Any.fromFunction1(value))
      
      inline def setAttachToElement(value: HTMLElement => Unit): Self = StObject.set(x, "attachToElement", js.Any.fromFunction1(value))
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setGetElement(value: () => HTMLElement): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
      
      inline def setGetHeight(value: () => Double): Self = StObject.set(x, "getHeight", js.Any.fromFunction0(value))
      
      inline def setGetWidth(value: () => Double): Self = StObject.set(x, "getWidth", js.Any.fromFunction0(value))
      
      inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      inline def setSetFillAllSpace(value: Boolean => Unit): Self = StObject.set(x, "setFillAllSpace", js.Any.fromFunction1(value))
      
      inline def setSetHeight(value: Double => Unit): Self = StObject.set(x, "setHeight", js.Any.fromFunction1(value))
      
      inline def setSetRtl(value: Boolean => Unit): Self = StObject.set(x, "setRtl", js.Any.fromFunction1(value))
      
      inline def setSetWidth(value: Double => Unit): Self = StObject.set(x, "setWidth", js.Any.fromFunction1(value))
      
      inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    }
  }
  
  trait IRootContainerAPI extends StObject {
    
    var attachToElement: js.UndefOr[js.Function1[/* element */ HTMLElement, Unit]] = js.undefined
    
    var getElement: js.UndefOr[js.Function0[HTMLElement]] = js.undefined
    
    var getHeight: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var getWidth: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var hide: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var setFillAllSpace: js.UndefOr[js.Function1[/* flag */ Boolean, Unit]] = js.undefined
    
    var setHeight: js.UndefOr[js.Function1[/* height */ Double, Unit]] = js.undefined
    
    var setRtl: js.UndefOr[js.Function1[/* rtl */ Boolean, Unit]] = js.undefined
    
    var setWidth: js.UndefOr[js.Function1[/* width */ Double, Unit]] = js.undefined
    
    var show: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object IRootContainerAPI {
    
    inline def apply(): IRootContainerAPI = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRootContainerAPI]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IRootContainerAPI] (val x: Self) extends AnyVal {
      
      inline def setAttachToElement(value: /* element */ HTMLElement => Unit): Self = StObject.set(x, "attachToElement", js.Any.fromFunction1(value))
      
      inline def setAttachToElementUndefined: Self = StObject.set(x, "attachToElement", js.undefined)
      
      inline def setGetElement(value: () => HTMLElement): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
      
      inline def setGetElementUndefined: Self = StObject.set(x, "getElement", js.undefined)
      
      inline def setGetHeight(value: () => Double): Self = StObject.set(x, "getHeight", js.Any.fromFunction0(value))
      
      inline def setGetHeightUndefined: Self = StObject.set(x, "getHeight", js.undefined)
      
      inline def setGetWidth(value: () => Double): Self = StObject.set(x, "getWidth", js.Any.fromFunction0(value))
      
      inline def setGetWidthUndefined: Self = StObject.set(x, "getWidth", js.undefined)
      
      inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
      
      inline def setSetFillAllSpace(value: /* flag */ Boolean => Unit): Self = StObject.set(x, "setFillAllSpace", js.Any.fromFunction1(value))
      
      inline def setSetFillAllSpaceUndefined: Self = StObject.set(x, "setFillAllSpace", js.undefined)
      
      inline def setSetHeight(value: /* height */ Double => Unit): Self = StObject.set(x, "setHeight", js.Any.fromFunction1(value))
      
      inline def setSetHeightUndefined: Self = StObject.set(x, "setHeight", js.undefined)
      
      inline def setSetRtl(value: /* rtl */ Boolean => Unit): Self = StObject.set(x, "setRtl", js.Any.fromFunction1(value))
      
      inline def setSetRtlUndefined: Self = StObject.set(x, "setRtl", js.undefined)
      
      inline def setSetWidth(value: /* width */ Double => Unit): Self = StObject.set(x, "setWidth", js.Any.fromFunction1(value))
      
      inline def setSetWidthUndefined: Self = StObject.set(x, "setWidth", js.undefined)
      
      inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    }
  }
  
  trait IRootContainerViewCallbacks extends StObject {
    
    def onMouseEnter(evt: Event): Unit
    @JSName("onMouseEnter")
    var onMouseEnter_Original: EventListener
    
    def onMouseLeave(evt: Event): Unit
    @JSName("onMouseLeave")
    var onMouseLeave_Original: EventListener
    
    def onMouseMove(evt: Event): Unit
    @JSName("onMouseMove")
    var onMouseMove_Original: EventListener
  }
  object IRootContainerViewCallbacks {
    
    inline def apply(
      onMouseEnter: /* evt */ Event => Unit,
      onMouseLeave: /* evt */ Event => Unit,
      onMouseMove: /* evt */ Event => Unit
    ): IRootContainerViewCallbacks = {
      val __obj = js.Dynamic.literal(onMouseEnter = js.Any.fromFunction1(onMouseEnter), onMouseLeave = js.Any.fromFunction1(onMouseLeave), onMouseMove = js.Any.fromFunction1(onMouseMove))
      __obj.asInstanceOf[IRootContainerViewCallbacks]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IRootContainerViewCallbacks] (val x: Self) extends AnyVal {
      
      inline def setOnMouseEnter(value: /* evt */ Event => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeave(value: /* evt */ Event => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseMove(value: /* evt */ Event => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
    }
  }
  
  trait IRootContainerViewConfig extends StObject {
    
    var callbacks: IRootContainerViewCallbacks
    
    var fillAllSpace: Boolean
    
    var height: Double
    
    var rtl: Boolean
    
    var width: Double
  }
  object IRootContainerViewConfig {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: IRootContainerViewConfig] (val x: Self) extends AnyVal {
      
      inline def setCallbacks(value: IRootContainerViewCallbacks): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      inline def setFillAllSpace(value: Boolean): Self = StObject.set(x, "fillAllSpace", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait IRootContainerViewStyles extends StObject {
    
    var container: String
    
    var fillAllSpace: String
    
    var fullScreen: String
    
    var hidden: String
    
    var rtl: Boolean
  }
  object IRootContainerViewStyles {
    
    inline def apply(container: String, fillAllSpace: String, fullScreen: String, hidden: String, rtl: Boolean): IRootContainerViewStyles = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], fillAllSpace = fillAllSpace.asInstanceOf[js.Any], fullScreen = fullScreen.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], rtl = rtl.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRootContainerViewStyles]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IRootContainerViewStyles] (val x: Self) extends AnyVal {
      
      inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setFillAllSpace(value: String): Self = StObject.set(x, "fillAllSpace", value.asInstanceOf[js.Any])
      
      inline def setFullScreen(value: String): Self = StObject.set(x, "fullScreen", value.asInstanceOf[js.Any])
      
      inline def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
    }
  }
}
