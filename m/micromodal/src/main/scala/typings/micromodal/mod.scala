package typings.micromodal

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * MicroModal controller
    */
  object default {
    
    /**
      * Closes the active modal
      */
    @JSImport("micromodal", "default.close")
    @js.native
    def close(): Unit = js.native
    @JSImport("micromodal", "default.close")
    @js.native
    def close(targetModal: String): Unit = js.native
    
    /**
      * Binds click handlers to all modal triggers
      * @param config configuration options
      */
    @JSImport("micromodal", "default.init")
    @js.native
    def init(): Unit = js.native
    @JSImport("micromodal", "default.init")
    @js.native
    def init(config: MicroModalConfig): Unit = js.native
    
    /**
      * Shows a particular modal
      * @param targetModal The id of the modal to display
      * @param config configuration options
      */
    @JSImport("micromodal", "default.show")
    @js.native
    def show(targetModal: String): Unit = js.native
    @JSImport("micromodal", "default.show")
    @js.native
    def show(targetModal: String, config: MicroModalConfig): Unit = js.native
  }
  
  /**
    * MicroModal controller
    */
  object MicroModal
  
  @js.native
  trait MicroModalConfig extends StObject {
    
    /**
      * Set this to true if using css animations to hide the modal.
      * This allows it to wait for the animation to finish before removing it from the DOM. Default is false
      */
    var awaitCloseAnimation: js.UndefOr[Boolean] = js.native
    
    /**
      * Set this to true if using css animations to open the modal.
      * This allows it to wait for the animation to finish before focusing on an element inside the modal. Default is false
      */
    var awaitOpenAnimation: js.UndefOr[Boolean] = js.native
    
    /** Custom data attribute to close modal. Default is data-micromodal-close. */
    var closeTrigger: js.UndefOr[String] = js.native
    
    /** This option suppresses the console warnings if passed as true. The default value is false. */
    var debugMode: js.UndefOr[Boolean] = js.native
    
    /** Disable auto focus on first focusable element. Default is false */
    var disableFocus: js.UndefOr[Boolean] = js.native
    
    /** This disables scrolling on the page while the modal is open. The default value is false. */
    var disableScroll: js.UndefOr[Boolean] = js.native
    
    /** This is fired when the modal is closing. */
    var onClose: js.UndefOr[js.Function1[/* modal */ js.UndefOr[HTMLElement], Unit]] = js.native
    
    /** This is fired when the modal is opening. */
    var onShow: js.UndefOr[js.Function1[/* modal */ js.UndefOr[HTMLElement], Unit]] = js.native
    
    /** Custom class to be applied when modal is open. Default class is is-open. */
    var openClass: js.UndefOr[String] = js.native
    
    /** Custom data attribute to open modal. Default is data-micromodal-trigger. */
    var openTrigger: js.UndefOr[String] = js.native
  }
  object MicroModalConfig {
    
    @scala.inline
    def apply(): MicroModalConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MicroModalConfig]
    }
    
    @scala.inline
    implicit class MicroModalConfigMutableBuilder[Self <: MicroModalConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAwaitCloseAnimation(value: Boolean): Self = StObject.set(x, "awaitCloseAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAwaitCloseAnimationUndefined: Self = StObject.set(x, "awaitCloseAnimation", js.undefined)
      
      @scala.inline
      def setAwaitOpenAnimation(value: Boolean): Self = StObject.set(x, "awaitOpenAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAwaitOpenAnimationUndefined: Self = StObject.set(x, "awaitOpenAnimation", js.undefined)
      
      @scala.inline
      def setCloseTrigger(value: String): Self = StObject.set(x, "closeTrigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseTriggerUndefined: Self = StObject.set(x, "closeTrigger", js.undefined)
      
      @scala.inline
      def setDebugMode(value: Boolean): Self = StObject.set(x, "debugMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugModeUndefined: Self = StObject.set(x, "debugMode", js.undefined)
      
      @scala.inline
      def setDisableFocus(value: Boolean): Self = StObject.set(x, "disableFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableFocusUndefined: Self = StObject.set(x, "disableFocus", js.undefined)
      
      @scala.inline
      def setDisableScroll(value: Boolean): Self = StObject.set(x, "disableScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableScrollUndefined: Self = StObject.set(x, "disableScroll", js.undefined)
      
      @scala.inline
      def setOnClose(value: /* modal */ js.UndefOr[HTMLElement] => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnShow(value: /* modal */ js.UndefOr[HTMLElement] => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      @scala.inline
      def setOpenClass(value: String): Self = StObject.set(x, "openClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenClassUndefined: Self = StObject.set(x, "openClass", js.undefined)
      
      @scala.inline
      def setOpenTrigger(value: String): Self = StObject.set(x, "openTrigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenTriggerUndefined: Self = StObject.set(x, "openTrigger", js.undefined)
    }
  }
}
