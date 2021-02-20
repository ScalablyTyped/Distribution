package typings.moveto

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("moveto", JSImport.Namespace)
  @js.native
  /**
    * MoveTo Constructor
    * @param options Options
    * @param easeFunctions Custom ease functions
    */
  class ^ () extends MoveTo {
    def this(options: MoveToOptions) = this()
    def this(options: js.UndefOr[scala.Nothing], easeFunctions: MoveToEaseFunctionsObject) = this()
    def this(options: MoveToOptions, easeFunctions: MoveToEaseFunctionsObject) = this()
  }
  
  @js.native
  trait MoveTo extends StObject {
    
    /**
      * Adds custom ease function
      * @param name Ease function name
      * @param fn Ease function
      */
    def addEaseFunction(name: String, fn: MoveToEaseFunction): Unit = js.native
    
    /**
      * Custom ease functions
      */
    var easeFunctions: MoveToEaseFunctionsObject = js.native
    
    def move(target: Double): Unit = js.native
    def move(target: Double, options: MoveToOptions): Unit = js.native
    /**
      * Start scroll animation from current position to the anchor point
      * @param target Target element/position to be scrolled. Target position is the scrolling distance. It must be negative if the upward movement is desired
      * @param options Custom options
      */
    def move(target: HTMLElement): Unit = js.native
    def move(target: HTMLElement, options: MoveToOptions): Unit = js.native
    
    /**
      * Options
      */
    var options: MoveToOptions = js.native
    
    /**
      * Register a dom element as trigger
      * @param dom The trigger element for starting to scroll when on click
      * @param callback Callback function to be run after the scroll complete. This will overwrite the callback option
      * @return Unregister function
      */
    def registerTrigger(dom: HTMLElement): unregisterTriggerType = js.native
    def registerTrigger(dom: HTMLElement, callback: callbackType): unregisterTriggerType = js.native
  }
  
  /**
    * Easing Function
    * @param t Current time
    * @param b Start value
    * @param c Change in value
    * @param d Duration
    * @return Calculated value
    */
  type MoveToEaseFunction = js.Function4[/* t */ Double, /* b */ Double, /* c */ Double, /* d */ Double, Double]
  
  type MoveToEaseFunctionsObject = StringDictionary[MoveToEaseFunction]
  
  @js.native
  trait MoveToOptions extends StObject {
    
    /**
      * The function to be run after scrolling complete. Target passes as the first argument
      */
    var callback: js.UndefOr[callbackType] = js.native
    
    /**
      * The container been computed and scrolled
      */
    var container: js.UndefOr[Window | HTMLElement] = js.native
    
    /**
      * Duration of scrolling, in milliseconds
      */
    var duration: js.UndefOr[Double] = js.native
    
    /**
      * Ease function name
      */
    var easing: js.UndefOr[String] = js.native
    
    /**
      * The tolerance of the target to be scrolled, can be negative or positive
      */
    var tolerance: js.UndefOr[Double] = js.native
  }
  object MoveToOptions {
    
    @scala.inline
    def apply(): MoveToOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MoveToOptions]
    }
    
    @scala.inline
    implicit class MoveToOptionsMutableBuilder[Self <: MoveToOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: /* target */ HTMLElement | Double => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setContainer(value: Window | HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      @scala.inline
      def setTolerance(value: Double): Self = StObject.set(x, "tolerance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToleranceUndefined: Self = StObject.set(x, "tolerance", js.undefined)
    }
  }
  
  /**
    * Callback function to be run after the scroll complete.
    */
  type callbackType = js.Function1[/* target */ HTMLElement | Double, Unit]
  
  type unregisterTriggerType = js.Function0[Unit]
}
