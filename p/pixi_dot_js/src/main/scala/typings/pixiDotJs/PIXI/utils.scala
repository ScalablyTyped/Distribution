package typings.pixiDotJs.PIXI

import typings.pixiDotJs.Anon_Prefixed
import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.utils")
@js.native
object utils extends js.Object {
  // https://github.com/primus/eventemitter3
  @js.native
  /**
    * Minimal EventEmitter interface that is molded against the Node.js
    * EventEmitter interface.
    *
    * @constructor
    * @api public
    */
  class EventEmitter () extends js.Object {
    /**
      * Alias method for `on`
      */
    def addListener(event: String, fn: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
    def addListener(event: String, fn: js.Function1[/* repeated */ js.Any, _], context: js.Any): this.type = js.native
    def addListener(event: js.Symbol, fn: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
    def addListener(event: js.Symbol, fn: js.Function1[/* repeated */ js.Any, _], context: js.Any): this.type = js.native
    /**
      * Calls each of the listeners registered for a given event.
      *
      * @param event The event name.
      * @param args Arguments that are passed to registered listeners
      * @returns `true` if the event had listeners, else `false`.
      */
    def emit(event: String, args: js.Any*): Boolean = js.native
    def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
    /**
      * Return an array listing the events for which the emitter has registered listeners.
      *
      * @returns
      */
    def eventNames(): js.Array[String | js.Symbol] = js.native
    /**
      * Return the listeners registered for a given event.
      *
      * @param {(string | symbol)} event The event name.
      * @returns
      */
    //tslint:disable-next-line:ban-types forbidden-types
    def listeners(event: String): js.Array[js.Function] = js.native
    /**
      * Check if there listeners for a given event.
      * If `exists` argument is not `true` lists listeners.
      *
      * @param event The event name.
      * @param exists Only check if there are listeners.
      * @returns
      */
    def listeners(event: String, exists: Boolean): Boolean = js.native
    def listeners(event: js.Symbol): js.Array[js.Function] = js.native
    def listeners(event: js.Symbol, exists: Boolean): Boolean = js.native
    /**
      * Alias method for `removeListener`
      */
    def off(event: String): this.type = js.native
    def off(event: String, fn: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
    def off(event: String, fn: js.Function1[/* repeated */ js.Any, _], context: js.Any): this.type = js.native
    def off(event: String, fn: js.Function1[/* repeated */ js.Any, _], context: js.Any, once: Boolean): this.type = js.native
    def off(event: js.Symbol): this.type = js.native
    def off(event: js.Symbol, fn: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
    def off(event: js.Symbol, fn: js.Function1[/* repeated */ js.Any, _], context: js.Any): this.type = js.native
    def off(event: js.Symbol, fn: js.Function1[/* repeated */ js.Any, _], context: js.Any, once: Boolean): this.type = js.native
    /**
      * Add a listener for a given event.
      *
      * @param event The event name.
      * @param fn The listener function.
      * @param [context=this] The context to invoke the listener with.
      * @returns `this`
      */
    def on(event: String, fn: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
    def on(event: String, fn: js.Function1[/* repeated */ js.Any, _], context: js.Any): this.type = js.native
    def on(event: js.Symbol, fn: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
    def on(event: js.Symbol, fn: js.Function1[/* repeated */ js.Any, _], context: js.Any): this.type = js.native
    /**
      * Add a one-time listener for a given event.
      *
      * @param event The event name.
      * @param fn The listener function.
      * @param [context=this] The context to invoke the listener with.
      * @returns `this`
      */
    def once(event: String, fn: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
    def once(event: String, fn: js.Function1[/* repeated */ js.Any, _], context: js.Any): this.type = js.native
    def once(event: js.Symbol, fn: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
    def once(event: js.Symbol, fn: js.Function1[/* repeated */ js.Any, _], context: js.Any): this.type = js.native
    /**
      * Remove all listeners, or those of the specified event.
      *
      * @param event The event name.
      * @returns `this`.
      */
    def removeAllListeners(): this.type = js.native
    def removeAllListeners(event: String): this.type = js.native
    def removeAllListeners(event: js.Symbol): this.type = js.native
    /**
      * Remove the listeners of a given event.
      *
      * @param event The event name.
      * @param fn Only remove the listeners that match this function.
      * @param context Only remove the listeners that have this context.
      * @param once Only remove one-time listeners.
      * @returns `this`
      */
    def removeListener(event: String): this.type = js.native
    def removeListener(event: String, fn: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
    def removeListener(event: String, fn: js.Function1[/* repeated */ js.Any, _], context: js.Any): this.type = js.native
    def removeListener(event: String, fn: js.Function1[/* repeated */ js.Any, _], context: js.Any, once: Boolean): this.type = js.native
    def removeListener(event: js.Symbol): this.type = js.native
    def removeListener(event: js.Symbol, fn: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
    def removeListener(event: js.Symbol, fn: js.Function1[/* repeated */ js.Any, _], context: js.Any): this.type = js.native
    def removeListener(event: js.Symbol, fn: js.Function1[/* repeated */ js.Any, _], context: js.Any, once: Boolean): this.type = js.native
    /**
      * This function doesn"t apply anymore.
      * @deprecated
      */
    def setMaxListeners(): this.type = js.native
  }
  
  val BaseTextureCache: js.Any = js.native
  val TextureCache: js.Any = js.native
  val premultiplyBlendMode: js.Array[js.Array[Double]] = js.native
  def canUseNewCanvasBlendModes(): Boolean = js.native
  def clearTextureCache(): Unit = js.native
  def correctBlendMode(blendMode: Double, premultiplied: Boolean): Double = js.native
  def decomposeDataUri(dataUri: String): DecomposedDataUri | Unit = js.native
  def destroyTextureCache(): Unit = js.native
  def getResolutionOfUrl(url: String): Double = js.native
  def getResolutionOfUrl(url: String, defaultValue: Double): Double = js.native
  def getSvgSize(svgString: String): js.Any = js.native
  def getUrlFileExtension(url: String): String | Unit = js.native
  def hex2rgb(hex: Double): js.Array[Double] = js.native
  def hex2rgb(hex: Double, out: js.Array[Double]): js.Array[Double] = js.native
  def hex2string(hex: Double): String = js.native
  def isWebGLSupported(): Boolean = js.native
  def premultiplyRgba(rgb: js.Array[Double], alpha: Double): Float32Array = js.native
  def premultiplyRgba(rgb: js.Array[Double], alpha: Double, out: Float32Array): Float32Array = js.native
  def premultiplyRgba(rgb: js.Array[Double], alpha: Double, out: Float32Array, premultiply: Boolean): Float32Array = js.native
  def premultiplyRgba(rgb: Float32Array, alpha: Double): Float32Array = js.native
  def premultiplyRgba(rgb: Float32Array, alpha: Double, out: Float32Array): Float32Array = js.native
  def premultiplyRgba(rgb: Float32Array, alpha: Double, out: Float32Array, premultiply: Boolean): Float32Array = js.native
  def premultiplyTint(tint: Double, alpha: Double): Double = js.native
  def premultiplyTintToRgba(tint: Double, alpha: Double): Float32Array = js.native
  def premultiplyTintToRgba(tint: Double, alpha: Double, out: Float32Array): Float32Array = js.native
  def premultiplyTintToRgba(tint: Double, alpha: Double, out: Float32Array, premultiply: Boolean): Float32Array = js.native
  /**
    * Remove a range of items from an array
    *
    * @param arr The target array
    * @param startIdx The index to begin removing from (inclusive)
    * @param removeCount How many items to remove
    */
  def removeItems[T](arr: js.Array[T], startIdx: Double, removeCount: Double): Unit = js.native
  def rgb2hex(rgb: js.Array[Double]): Double = js.native
  def sayHello(`type`: String): Unit = js.native
  def sign(n: Double): Double = js.native
  def skipHello(): Unit = js.native
  def uid(): Double = js.native
  /* static members */
  @js.native
  object EventEmitter extends js.Object {
    var EventEmitter: Anon_Prefixed = js.native
    var prefixed: String | Boolean = js.native
  }
  
  // https://github.com/kaimallea/isMobile
  @js.native
  object isMobile extends js.Object {
    val any: Boolean = js.native
    val phone: Boolean = js.native
    val seven_inch: Boolean = js.native
    val tablet: Boolean = js.native
    @js.native
    object amazon extends js.Object {
      var device: Boolean = js.native
      var phone: Boolean = js.native
      var tablet: Boolean = js.native
    }
    
    @js.native
    object android extends js.Object {
      var device: Boolean = js.native
      var phone: Boolean = js.native
      var tablet: Boolean = js.native
    }
    
    @js.native
    object apple extends js.Object {
      var device: Boolean = js.native
      var ipod: Boolean = js.native
      var phone: Boolean = js.native
      var tablet: Boolean = js.native
    }
    
    @js.native
    object other extends js.Object {
      var blackberry: Boolean = js.native
      var blackberry10: Boolean = js.native
      var chrome: Boolean = js.native
      var device: Boolean = js.native
      var firefox: Boolean = js.native
      var opera: Boolean = js.native
    }
    
    @js.native
    object windows extends js.Object {
      var device: Boolean = js.native
      var phone: Boolean = js.native
      var tablet: Boolean = js.native
    }
    
  }
  
}

