package typings.pixiJs.PIXI

import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Generalized convenience utilities for PIXI.
  * @example
  * // Extend PIXI's internal Event Emitter.
  * class MyEmitter extends PIXI.utils.EventEmitter {
  *   constructor() {
  *      super();
  *      console.log("Emitter created!");
  *   }
  * }
  *
  * // Get info on current device
  * console.log(PIXI.utils.isMobile);
  *
  * // Convert hex color to string
  * console.log(PIXI.utils.hex2string(0xff00ff)); // returns: "#ff00ff"
  * @namespace PIXI.utils
  */
object utils {
  
  /**
    * Creates a Canvas element of the given size to be used as a target for rendering to.
    *
    * @class
    * @memberof PIXI.utils
    */
  @js.native
  trait CanvasRenderTarget extends StObject {
    
    /**
      * The Canvas object that belongs to this CanvasRenderTarget.
      *
      * @member {HTMLCanvasElement} PIXI.utils.CanvasRenderTarget#canvas
      */
    var canvas: HTMLCanvasElement = js.native
    
    /**
      * A CanvasRenderingContext2D object representing a two-dimensional rendering context.
      *
      * @member {CanvasRenderingContext2D} PIXI.utils.CanvasRenderTarget#context
      */
    var context: CanvasRenderingContext2D = js.native
    
    /**
      * Destroys this canvas.
      *
      */
    def destroy(): Unit = js.native
    
    /**
      * The height of the canvas buffer in pixels.
      *
      * @member {number}
      */
    var height: Double = js.native
    
    /**
      * Resizes the canvas to the specified width and height.
      *
      * @param {number} width - the new width of the canvas
      * @param {number} height - the new height of the canvas
      */
    def resize(width: Double, height: Double): Unit = js.native
    
    /**
      * The width of the canvas buffer in pixels.
      *
      * @member {number}
      */
    var width: Double = js.native
  }
  object CanvasRenderTarget {
    
    @scala.inline
    def apply(
      canvas: HTMLCanvasElement,
      context: CanvasRenderingContext2D,
      destroy: () => Unit,
      height: Double,
      resize: (Double, Double) => Unit,
      width: Double
    ): CanvasRenderTarget = {
      val __obj = js.Dynamic.literal(canvas = canvas.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), height = height.asInstanceOf[js.Any], resize = js.Any.fromFunction2(resize), width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[CanvasRenderTarget]
    }
    
    @scala.inline
    implicit class CanvasRenderTargetMutableBuilder[Self <: CanvasRenderTarget] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanvas(value: HTMLCanvasElement): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContext(value: CanvasRenderingContext2D): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResize(value: (Double, Double) => Unit): Self = StObject.set(x, "resize", js.Any.fromFunction2(value))
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @memberof PIXI.utils
    * @interface DecomposedDataUri
    */
  @js.native
  trait DecomposedDataUri extends StObject {
    
    /**
      * @memberof PIXI.utils.DecomposedDataUri#
      * @member {string} charset
      */
    var charset: String = js.native
    
    /**
      * The actual data
      * @memberof PIXI.utils.DecomposedDataUri#
      * @member {string} data
      */
    var data: String = js.native
    
    /**
      * Data encoding, eg. `base64`
      * @memberof PIXI.utils.DecomposedDataUri#
      * @member {string} encoding
      */
    var encoding: String = js.native
    
    /**
      * type, eg. `image`
      * @memberof PIXI.utils.DecomposedDataUri#
      * @member {string} mediaType
      */
    var mediaType: String = js.native
    
    /**
      * Sub type, eg. `png`
      * @memberof PIXI.utils.DecomposedDataUri#
      * @member {string} subType
      */
    var subType: String = js.native
  }
  object DecomposedDataUri {
    
    @scala.inline
    def apply(charset: String, data: String, encoding: String, mediaType: String, subType: String): DecomposedDataUri = {
      val __obj = js.Dynamic.literal(charset = charset.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], subType = subType.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecomposedDataUri]
    }
    
    @scala.inline
    implicit class DecomposedDataUriMutableBuilder[Self <: DecomposedDataUri] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaType(value: String): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubType(value: String): Self = StObject.set(x, "subType", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * A high performance event emitter
    *
    * @see {@link https://github.com/primus/eventemitter3}
    *
    * @memberof PIXI.utils
    * @class EventEmitter
    * @type {EventEmitter}
    */
  @js.native
  trait EventEmitter extends StObject {
    
    /**
      * Alias method for `on`
      */
    //tslint:disable-next-line:ban-types forbidden-types
    def addListener(event: String, fn: js.Function): this.type = js.native
    def addListener(event: String, fn: js.Function, context: js.Any): this.type = js.native
    def addListener(event: js.Symbol, fn: js.Function): this.type = js.native
    def addListener(event: js.Symbol, fn: js.Function, context: js.Any): this.type = js.native
    
    /**
      * Calls each of the listeners registered for a given event.
      *
      * @param {(string | symbol)} event The event name.
      * @param {...*} args Arguments that are passed to registered listeners
      * @returns {boolean} `true` if the event had listeners, else `false`.
      */
    def emit(event: String, args: js.Any*): Boolean = js.native
    def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
    
    /**
      * Return an array listing the events for which the emitter has registered listeners.
      *
      * @returns {(string | symbol)[]}
      */
    def eventNames(): js.Array[String | js.Symbol] = js.native
    
    /**
      * Return the number of listeners listening to a given event.
      *
      * @param {(string | symbol)} event The event name.
      * @returns {number}
      */
    def listenerCount(event: String): Double = js.native
    def listenerCount(event: js.Symbol): Double = js.native
    
    /**
      * Return the listeners registered for a given event.
      *
      * @param {(string | symbol)} event The event name.
      * @returns {Function[]}
      */
    //tslint:disable-next-line:ban-types forbidden-types
    def listeners(event: String): js.Array[js.Function] = js.native
    def listeners(event: js.Symbol): js.Array[js.Function] = js.native
    
    /**
      * Alias method for `removeListener`
      */
    //tslint:disable-next-line:ban-types forbidden-types
    def off(event: String): this.type = js.native
    def off(event: String, fn: js.UndefOr[scala.Nothing], context: js.UndefOr[scala.Nothing], once: Boolean): this.type = js.native
    def off(event: String, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
    def off(event: String, fn: js.UndefOr[scala.Nothing], context: js.Any, once: Boolean): this.type = js.native
    def off(event: String, fn: js.Function): this.type = js.native
    def off(event: String, fn: js.Function, context: js.UndefOr[scala.Nothing], once: Boolean): this.type = js.native
    def off(event: String, fn: js.Function, context: js.Any): this.type = js.native
    def off(event: String, fn: js.Function, context: js.Any, once: Boolean): this.type = js.native
    def off(event: js.Symbol): this.type = js.native
    def off(event: js.Symbol, fn: js.UndefOr[scala.Nothing], context: js.UndefOr[scala.Nothing], once: Boolean): this.type = js.native
    def off(event: js.Symbol, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
    def off(event: js.Symbol, fn: js.UndefOr[scala.Nothing], context: js.Any, once: Boolean): this.type = js.native
    def off(event: js.Symbol, fn: js.Function): this.type = js.native
    def off(event: js.Symbol, fn: js.Function, context: js.UndefOr[scala.Nothing], once: Boolean): this.type = js.native
    def off(event: js.Symbol, fn: js.Function, context: js.Any): this.type = js.native
    def off(event: js.Symbol, fn: js.Function, context: js.Any, once: Boolean): this.type = js.native
    
    /**
      * Add a listener for a given event.
      *
      * @param {(string | symbol)} event The event name.
      * @param {Function} fn The listener function.
      * @param {*} [context=this] The context to invoke the listener with.
      * @returns {EventEmitter} `this`.
      */
    //tslint:disable-next-line:ban-types forbidden-types
    def on(event: String, fn: js.Function): this.type = js.native
    def on(event: String, fn: js.Function, context: js.Any): this.type = js.native
    def on(event: js.Symbol, fn: js.Function): this.type = js.native
    def on(event: js.Symbol, fn: js.Function, context: js.Any): this.type = js.native
    
    /**
      * Add a one-time listener for a given event.
      *
      * @param {(string | symbol)} event The event name.
      * @param {Function} fn The listener function.
      * @param {*} [context=this] The context to invoke the listener with.
      * @returns {EventEmitter} `this`.
      */
    //tslint:disable-next-line:ban-types forbidden-types
    def once(event: String, fn: js.Function): this.type = js.native
    def once(event: String, fn: js.Function, context: js.Any): this.type = js.native
    def once(event: js.Symbol, fn: js.Function): this.type = js.native
    def once(event: js.Symbol, fn: js.Function, context: js.Any): this.type = js.native
    
    /**
      * Remove all listeners, or those of the specified event.
      *
      * @param {(string | symbol)} event The event name.
      * @returns {EventEmitter} `this`.
      */
    def removeAllListeners(): this.type = js.native
    def removeAllListeners(event: String): this.type = js.native
    def removeAllListeners(event: js.Symbol): this.type = js.native
    
    /**
      * Remove the listeners of a given event.
      *
      * @param {(string | symbol)} event The event name.
      * @param {Function} fn Only remove the listeners that match this function.
      * @param {*} context Only remove the listeners that have this context.
      * @param {boolean} once Only remove one-time listeners.
      * @returns {EventEmitter} `this`.
      */
    //tslint:disable-next-line:ban-types forbidden-types
    def removeListener(event: String): this.type = js.native
    def removeListener(event: String, fn: js.UndefOr[scala.Nothing], context: js.UndefOr[scala.Nothing], once: Boolean): this.type = js.native
    def removeListener(event: String, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
    def removeListener(event: String, fn: js.UndefOr[scala.Nothing], context: js.Any, once: Boolean): this.type = js.native
    def removeListener(event: String, fn: js.Function): this.type = js.native
    def removeListener(event: String, fn: js.Function, context: js.UndefOr[scala.Nothing], once: Boolean): this.type = js.native
    def removeListener(event: String, fn: js.Function, context: js.Any): this.type = js.native
    def removeListener(event: String, fn: js.Function, context: js.Any, once: Boolean): this.type = js.native
    def removeListener(event: js.Symbol): this.type = js.native
    def removeListener(event: js.Symbol, fn: js.UndefOr[scala.Nothing], context: js.UndefOr[scala.Nothing], once: Boolean): this.type = js.native
    def removeListener(event: js.Symbol, fn: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
    def removeListener(event: js.Symbol, fn: js.UndefOr[scala.Nothing], context: js.Any, once: Boolean): this.type = js.native
    def removeListener(event: js.Symbol, fn: js.Function): this.type = js.native
    def removeListener(event: js.Symbol, fn: js.Function, context: js.UndefOr[scala.Nothing], once: Boolean): this.type = js.native
    def removeListener(event: js.Symbol, fn: js.Function, context: js.Any): this.type = js.native
    def removeListener(event: js.Symbol, fn: js.Function, context: js.Any, once: Boolean): this.type = js.native
  }
}
