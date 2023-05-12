package typings.ol

import typings.ol.extentMod.Extent
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageCanvasMod {
  
  /**
    * A function that is called to trigger asynchronous canvas drawing.  It is
    * called with a "done" callback that should be called when drawing is done.
    * If any error occurs during drawing, the "done" callback should be called with
    * that error.
    *
    * @typedef {function(function(Error=): void): void} Loader
    */
  @JSImport("ol/ImageCanvas", JSImport.Default)
  @js.native
  open class default protected () extends ImageCanvas {
    /**
      * @param {import("./extent.js").Extent} extent Extent.
      * @param {number} resolution Resolution.
      * @param {number} pixelRatio Pixel ratio.
      * @param {HTMLCanvasElement} canvas Canvas.
      * @param {Loader} [loader] Optional loader function to
      *     support asynchronous canvas drawing.
      */
    def this(extent: Extent, resolution: Double, pixelRatio: Double, canvas: HTMLCanvasElement) = this()
    def this(extent: Extent, resolution: Double, pixelRatio: Double, canvas: HTMLCanvasElement, loader: Loader) = this()
  }
  
  /**
    * A function that is called to trigger asynchronous canvas drawing.  It is
    * called with a "done" callback that should be called when drawing is done.
    * If any error occurs during drawing, the "done" callback should be called with
    * that error.
    *
    * @typedef {function(function(Error=): void): void} Loader
    */
  @js.native
  trait ImageCanvas
    extends typings.ol.imageBaseMod.default {
    
    /**
      * @private
      * @type {HTMLCanvasElement}
      */
    /* private */ var canvas_ : Any = js.native
    
    /**
      * @private
      * @type {?Error}
      */
    /* private */ var error_ : Any = js.native
    
    /**
      * Get any error associated with asynchronous rendering.
      * @return {?Error} Any error that occurred during rendering.
      */
    def getError(): js.Error | Null = js.native
    
    /**
      * Handle async drawing complete.
      * @param {Error} [err] Any error during drawing.
      * @private
      */
    /* private */ var handleLoad_ : Any = js.native
    
    /**
      * Optional canvas loader function.
      * @type {?Loader}
      * @private
      */
    /* private */ var loader_ : Any = js.native
  }
  
  type Loader = js.Function1[/* arg0 */ js.Function1[/* arg0 */ js.UndefOr[js.Error], Unit], Unit]
}
