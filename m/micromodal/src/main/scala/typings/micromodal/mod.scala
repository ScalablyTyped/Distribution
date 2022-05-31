package typings.micromodal

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * MicroModal controller
    */
  object default {
    
    @JSImport("micromodal", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Closes the active modal
      */
    inline def close(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("close")().asInstanceOf[Unit]
    inline def close(targetModal: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("close")(targetModal.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Binds click handlers to all modal triggers
      * @param config configuration options
      */
    inline def init(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[Unit]
    inline def init(config: MicroModalConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Shows a particular modal
      * @param targetModal The id of the modal to display
      * @param config configuration options
      */
    inline def show(targetModal: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("show")(targetModal.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def show(targetModal: String, config: MicroModalConfig): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("show")(targetModal.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  trait MicroModalConfig extends StObject {
    
    /**
      * Set this to true if using css animations to hide the modal.
      * This allows it to wait for the animation to finish before removing it from the DOM. Default is false
      */
    var awaitCloseAnimation: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set this to true if using css animations to open the modal.
      * This allows it to wait for the animation to finish before focusing on an element inside the modal. Default is false
      */
    var awaitOpenAnimation: js.UndefOr[Boolean] = js.undefined
    
    /** Custom data attribute to close modal. Default is data-micromodal-close. */
    var closeTrigger: js.UndefOr[String] = js.undefined
    
    /** This option suppresses the console warnings if passed as true. The default value is false. */
    var debugMode: js.UndefOr[Boolean] = js.undefined
    
    /** Disable auto focus on first focusable element. Default is false */
    var disableFocus: js.UndefOr[Boolean] = js.undefined
    
    /** This disables scrolling on the page while the modal is open. The default value is false. */
    var disableScroll: js.UndefOr[Boolean] = js.undefined
    
    /** This is fired when the modal is closing. */
    var onClose: js.UndefOr[js.Function1[/* modal */ js.UndefOr[HTMLElement], Unit]] = js.undefined
    
    /** This is fired when the modal is opening. */
    var onShow: js.UndefOr[js.Function1[/* modal */ js.UndefOr[HTMLElement], Unit]] = js.undefined
    
    /** Custom class to be applied when modal is open. Default class is is-open. */
    var openClass: js.UndefOr[String] = js.undefined
    
    /** Custom data attribute to open modal. Default is data-micromodal-trigger. */
    var openTrigger: js.UndefOr[String] = js.undefined
  }
  object MicroModalConfig {
    
    inline def apply(): MicroModalConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MicroModalConfig]
    }
    
    extension [Self <: MicroModalConfig](x: Self) {
      
      inline def setAwaitCloseAnimation(value: Boolean): Self = StObject.set(x, "awaitCloseAnimation", value.asInstanceOf[js.Any])
      
      inline def setAwaitCloseAnimationUndefined: Self = StObject.set(x, "awaitCloseAnimation", js.undefined)
      
      inline def setAwaitOpenAnimation(value: Boolean): Self = StObject.set(x, "awaitOpenAnimation", value.asInstanceOf[js.Any])
      
      inline def setAwaitOpenAnimationUndefined: Self = StObject.set(x, "awaitOpenAnimation", js.undefined)
      
      inline def setCloseTrigger(value: String): Self = StObject.set(x, "closeTrigger", value.asInstanceOf[js.Any])
      
      inline def setCloseTriggerUndefined: Self = StObject.set(x, "closeTrigger", js.undefined)
      
      inline def setDebugMode(value: Boolean): Self = StObject.set(x, "debugMode", value.asInstanceOf[js.Any])
      
      inline def setDebugModeUndefined: Self = StObject.set(x, "debugMode", js.undefined)
      
      inline def setDisableFocus(value: Boolean): Self = StObject.set(x, "disableFocus", value.asInstanceOf[js.Any])
      
      inline def setDisableFocusUndefined: Self = StObject.set(x, "disableFocus", js.undefined)
      
      inline def setDisableScroll(value: Boolean): Self = StObject.set(x, "disableScroll", value.asInstanceOf[js.Any])
      
      inline def setDisableScrollUndefined: Self = StObject.set(x, "disableScroll", js.undefined)
      
      inline def setOnClose(value: /* modal */ js.UndefOr[HTMLElement] => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnShow(value: /* modal */ js.UndefOr[HTMLElement] => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction1(value))
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setOpenClass(value: String): Self = StObject.set(x, "openClass", value.asInstanceOf[js.Any])
      
      inline def setOpenClassUndefined: Self = StObject.set(x, "openClass", js.undefined)
      
      inline def setOpenTrigger(value: String): Self = StObject.set(x, "openTrigger", value.asInstanceOf[js.Any])
      
      inline def setOpenTriggerUndefined: Self = StObject.set(x, "openTrigger", js.undefined)
    }
  }
}
