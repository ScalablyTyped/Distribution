package typings.playable

import typings.std.Event
import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object screenTypesMod {
  
  @js.native
  sealed trait VideoViewMode extends StObject
  @JSImport("playable/dist/src/modules/ui/screen/types", "VideoViewMode")
  @js.native
  object VideoViewMode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[VideoViewMode & String] = js.native
    
    @js.native
    sealed trait BLUR
      extends StObject
         with VideoViewMode
    /* "BLUR" */ val BLUR: typings.playable.screenTypesMod.VideoViewMode.BLUR & String = js.native
    
    @js.native
    sealed trait FILL
      extends StObject
         with VideoViewMode
    /* "FILL" */ val FILL: typings.playable.screenTypesMod.VideoViewMode.FILL & String = js.native
    
    @js.native
    sealed trait REGULAR
      extends StObject
         with VideoViewMode
    /* "REGULAR" */ val REGULAR: typings.playable.screenTypesMod.VideoViewMode.REGULAR & String = js.native
  }
  
  trait IScreen extends StObject {
    
    def destroy(): Unit
    
    def getElement(): HTMLElement
    
    def hide(): Unit
    
    def hideCursor(): Unit
    
    def setVideoViewMode(viewMode: VideoViewMode): Unit
    
    def show(): Unit
    
    def showCursor(): Unit
  }
  object IScreen {
    
    @scala.inline
    def apply(
      destroy: () => Unit,
      getElement: () => HTMLElement,
      hide: () => Unit,
      hideCursor: () => Unit,
      setVideoViewMode: VideoViewMode => Unit,
      show: () => Unit,
      showCursor: () => Unit
    ): IScreen = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), hide = js.Any.fromFunction0(hide), hideCursor = js.Any.fromFunction0(hideCursor), setVideoViewMode = js.Any.fromFunction1(setVideoViewMode), show = js.Any.fromFunction0(show), showCursor = js.Any.fromFunction0(showCursor))
      __obj.asInstanceOf[IScreen]
    }
    
    @scala.inline
    implicit class IScreenMutableBuilder[Self <: IScreen] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetElement(value: () => HTMLElement): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHideCursor(value: () => Unit): Self = StObject.set(x, "hideCursor", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetVideoViewMode(value: VideoViewMode => Unit): Self = StObject.set(x, "setVideoViewMode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShowCursor(value: () => Unit): Self = StObject.set(x, "showCursor", js.Any.fromFunction0(value))
    }
  }
  
  trait IScreenAPI extends StObject {
    
    var setVideoViewMode: js.UndefOr[js.Function1[/* viewMode */ VideoViewMode, Unit]] = js.undefined
  }
  object IScreenAPI {
    
    @scala.inline
    def apply(): IScreenAPI = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IScreenAPI]
    }
    
    @scala.inline
    implicit class IScreenAPIMutableBuilder[Self <: IScreenAPI] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSetVideoViewMode(value: /* viewMode */ VideoViewMode => Unit): Self = StObject.set(x, "setVideoViewMode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetVideoViewModeUndefined: Self = StObject.set(x, "setVideoViewMode", js.undefined)
    }
  }
  
  trait IScreenViewCallbacks extends StObject {
    
    var onWrapperMouseClick: EventListenerOrEventListenerObject
    
    var onWrapperMouseDblClick: EventListenerOrEventListenerObject
  }
  object IScreenViewCallbacks {
    
    @scala.inline
    def apply(
      onWrapperMouseClick: EventListenerOrEventListenerObject,
      onWrapperMouseDblClick: EventListenerOrEventListenerObject
    ): IScreenViewCallbacks = {
      val __obj = js.Dynamic.literal(onWrapperMouseClick = onWrapperMouseClick.asInstanceOf[js.Any], onWrapperMouseDblClick = onWrapperMouseDblClick.asInstanceOf[js.Any])
      __obj.asInstanceOf[IScreenViewCallbacks]
    }
    
    @scala.inline
    implicit class IScreenViewCallbacksMutableBuilder[Self <: IScreenViewCallbacks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnWrapperMouseClick(value: EventListenerOrEventListenerObject): Self = StObject.set(x, "onWrapperMouseClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnWrapperMouseClickFunction1(value: /* evt */ Event => Unit): Self = StObject.set(x, "onWrapperMouseClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnWrapperMouseDblClick(value: EventListenerOrEventListenerObject): Self = StObject.set(x, "onWrapperMouseDblClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnWrapperMouseDblClickFunction1(value: /* evt */ Event => Unit): Self = StObject.set(x, "onWrapperMouseDblClick", js.Any.fromFunction1(value))
    }
  }
  
  trait IScreenViewConfig extends StObject {
    
    var callbacks: IScreenViewCallbacks
    
    var nativeControls: Boolean
    
    var playbackViewElement: HTMLElement
  }
  object IScreenViewConfig {
    
    @scala.inline
    def apply(callbacks: IScreenViewCallbacks, nativeControls: Boolean, playbackViewElement: HTMLElement): IScreenViewConfig = {
      val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any], nativeControls = nativeControls.asInstanceOf[js.Any], playbackViewElement = playbackViewElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[IScreenViewConfig]
    }
    
    @scala.inline
    implicit class IScreenViewConfigMutableBuilder[Self <: IScreenViewConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallbacks(value: IScreenViewCallbacks): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNativeControls(value: Boolean): Self = StObject.set(x, "nativeControls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaybackViewElement(value: HTMLElement): Self = StObject.set(x, "playbackViewElement", value.asInstanceOf[js.Any])
    }
  }
  
  trait IScreenViewStyles extends StObject {
    
    var blurMode: String
    
    var fillMode: String
    
    var hidden: String
    
    var hiddenCursor: String
    
    var horizontalStripes: String
    
    var regularMode: String
    
    var screen: String
    
    var screenBottomBackground: String
    
    var screenTopBackground: String
    
    var verticalStripes: String
    
    var visible: String
  }
  object IScreenViewStyles {
    
    @scala.inline
    def apply(
      blurMode: String,
      fillMode: String,
      hidden: String,
      hiddenCursor: String,
      horizontalStripes: String,
      regularMode: String,
      screen: String,
      screenBottomBackground: String,
      screenTopBackground: String,
      verticalStripes: String,
      visible: String
    ): IScreenViewStyles = {
      val __obj = js.Dynamic.literal(blurMode = blurMode.asInstanceOf[js.Any], fillMode = fillMode.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], hiddenCursor = hiddenCursor.asInstanceOf[js.Any], horizontalStripes = horizontalStripes.asInstanceOf[js.Any], regularMode = regularMode.asInstanceOf[js.Any], screen = screen.asInstanceOf[js.Any], screenBottomBackground = screenBottomBackground.asInstanceOf[js.Any], screenTopBackground = screenTopBackground.asInstanceOf[js.Any], verticalStripes = verticalStripes.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[IScreenViewStyles]
    }
    
    @scala.inline
    implicit class IScreenViewStylesMutableBuilder[Self <: IScreenViewStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlurMode(value: String): Self = StObject.set(x, "blurMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillMode(value: String): Self = StObject.set(x, "fillMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenCursor(value: String): Self = StObject.set(x, "hiddenCursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalStripes(value: String): Self = StObject.set(x, "horizontalStripes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegularMode(value: String): Self = StObject.set(x, "regularMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreen(value: String): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreenBottomBackground(value: String): Self = StObject.set(x, "screenBottomBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreenTopBackground(value: String): Self = StObject.set(x, "screenTopBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalStripes(value: String): Self = StObject.set(x, "verticalStripes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisible(value: String): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
}
