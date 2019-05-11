package typings
package phaserLib.PhaserNs.DisplayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Display.Canvas")
@js.native
object CanvasNs extends js.Object {
  /**
    * Sets the touch-action property on the canvas style. Can be used to disable default browser touch actions.
    * @param canvas The canvas element to have the style applied to.
    * @param value The touch action value to set on the canvas. Set to `none` to disable touch actions. Default 'none'.
    */
  def TouchAction(canvas: stdLib.HTMLCanvasElement): stdLib.HTMLCanvasElement = js.native
  def TouchAction(canvas: stdLib.HTMLCanvasElement, value: java.lang.String): stdLib.HTMLCanvasElement = js.native
  /**
    * Sets the user-select property on the canvas style. Can be used to disable default browser selection actions.
    * @param canvas The canvas element to have the style applied to.
    * @param value The touch callout value to set on the canvas. Set to `none` to disable touch callouts. Default 'none'.
    */
  def UserSelect(canvas: stdLib.HTMLCanvasElement): stdLib.HTMLCanvasElement = js.native
  def UserSelect(canvas: stdLib.HTMLCanvasElement, value: java.lang.String): stdLib.HTMLCanvasElement = js.native
  @JSName("CanvasInterpolation")
  @js.native
  object CanvasInterpolationNs extends js.Object {
    /**
      * Sets the CSS image-rendering property on the given canvas to be 'bicubic' (aka 'auto').
      * @param canvas The canvas object to have the style set on.
      */
    def setBicubic(canvas: stdLib.HTMLCanvasElement): stdLib.HTMLCanvasElement = js.native
    /**
      * Sets the CSS image-rendering property on the given canvas to be 'crisp' (aka 'optimize contrast' on webkit).
      * @param canvas The canvas object to have the style set on.
      */
    def setCrisp(canvas: stdLib.HTMLCanvasElement): stdLib.HTMLCanvasElement = js.native
  }
  
  /**
    * The CanvasPool is a global static object, that allows Phaser to recycle and pool 2D Context Canvas DOM elements.
    * It does not pool WebGL Contexts, because once the context options are set they cannot be modified again, 
    * which is useless for some of the Phaser pipelines / renderer.
    * 
    * This singleton is instantiated as soon as Phaser loads, before a Phaser.Game instance has even been created.
    * Which means all instances of Phaser Games on the same page can share the one single pool.
    */
  @JSName("CanvasPool")
  @js.native
  object CanvasPoolNs extends js.Object {
    /**
      * Creates a new Canvas DOM element, or pulls one from the pool if free.
      * @param parent The parent of the Canvas object.
      * @param width The width of the Canvas. Default 1.
      * @param height The height of the Canvas. Default 1.
      * @param canvasType The type of the Canvas. Either `Phaser.CANVAS` or `Phaser.WEBGL`. Default Phaser.CANVAS.
      * @param selfParent Use the generated Canvas element as the parent? Default false.
      */
    def create(parent: js.Any): stdLib.HTMLCanvasElement = js.native
    def create(parent: js.Any, width: phaserLib.integer): stdLib.HTMLCanvasElement = js.native
    def create(parent: js.Any, width: phaserLib.integer, height: phaserLib.integer): stdLib.HTMLCanvasElement = js.native
    def create(parent: js.Any, width: phaserLib.integer, height: phaserLib.integer, canvasType: phaserLib.integer): stdLib.HTMLCanvasElement = js.native
    def create(
      parent: js.Any,
      width: phaserLib.integer,
      height: phaserLib.integer,
      canvasType: phaserLib.integer,
      selfParent: scala.Boolean
    ): stdLib.HTMLCanvasElement = js.native
    /**
      * Creates a new Canvas DOM element, or pulls one from the pool if free.
      * @param parent The parent of the Canvas object.
      * @param width The width of the Canvas. Default 1.
      * @param height The height of the Canvas. Default 1.
      */
    def create2D(parent: js.Any): stdLib.HTMLCanvasElement = js.native
    def create2D(parent: js.Any, width: phaserLib.integer): stdLib.HTMLCanvasElement = js.native
    def create2D(parent: js.Any, width: phaserLib.integer, height: phaserLib.integer): stdLib.HTMLCanvasElement = js.native
    /**
      * Creates a new Canvas DOM element, or pulls one from the pool if free.
      * @param parent The parent of the Canvas object.
      * @param width The width of the Canvas. Default 1.
      * @param height The height of the Canvas. Default 1.
      */
    def createWebGL(parent: js.Any): stdLib.HTMLCanvasElement = js.native
    def createWebGL(parent: js.Any, width: phaserLib.integer): stdLib.HTMLCanvasElement = js.native
    def createWebGL(parent: js.Any, width: phaserLib.integer, height: phaserLib.integer): stdLib.HTMLCanvasElement = js.native
    /**
      * Disable context smoothing on any new Canvas element created.
      */
    def disableSmoothing(): scala.Unit = js.native
    /**
      * Enable context smoothing on any new Canvas element created.
      */
    def enableSmoothing(): scala.Unit = js.native
    /**
      * Gets the first free canvas index from the pool.
      * @param canvasType The type of the Canvas. Either `Phaser.CANVAS` or `Phaser.WEBGL`. Default Phaser.CANVAS.
      */
    def first(): stdLib.HTMLCanvasElement = js.native
    def first(canvasType: phaserLib.integer): stdLib.HTMLCanvasElement = js.native
    /**
      * Gets the total number of free canvas elements in the pool.
      */
    def free(): phaserLib.integer = js.native
    /**
      * Looks up a canvas based on its parent, and if found puts it back in the pool, freeing it up for re-use.
      * The canvas has its width and height set to 1, and its parent attribute nulled.
      * @param parent The canvas or the parent of the canvas to free.
      */
    def remove(parent: js.Any): scala.Unit = js.native
    /**
      * Gets the total number of used canvas elements in the pool.
      */
    def total(): phaserLib.integer = js.native
  }
  
  @JSName("Smoothing")
  @js.native
  object SmoothingNs extends js.Object {
    /**
      * Sets the Image Smoothing property on the given context. Set to false to disable image smoothing.
      * By default browsers have image smoothing enabled, which isn't always what you visually want, especially
      * when using pixel art in a game. Note that this sets the property on the context itself, so that any image
      * drawn to the context will be affected. This sets the property across all current browsers but support is
      * patchy on earlier browsers, especially on mobile.
      * @param context The context on which to disable smoothing.
      */
    def disable(context: stdLib.CanvasRenderingContext2D): stdLib.CanvasRenderingContext2D | stdLib.WebGLRenderingContext = js.native
    def disable(context: stdLib.WebGLRenderingContext): stdLib.CanvasRenderingContext2D | stdLib.WebGLRenderingContext = js.native
    /**
      * Sets the Image Smoothing property on the given context. Set to false to disable image smoothing.
      * By default browsers have image smoothing enabled, which isn't always what you visually want, especially
      * when using pixel art in a game. Note that this sets the property on the context itself, so that any image
      * drawn to the context will be affected. This sets the property across all current browsers but support is
      * patchy on earlier browsers, especially on mobile.
      * @param context The context on which to enable smoothing.
      */
    def enable(context: stdLib.CanvasRenderingContext2D): stdLib.CanvasRenderingContext2D | stdLib.WebGLRenderingContext = js.native
    def enable(context: stdLib.WebGLRenderingContext): stdLib.CanvasRenderingContext2D | stdLib.WebGLRenderingContext = js.native
    /**
      * Gets the Smoothing Enabled vendor prefix being used on the given context, or null if not set.
      * @param context The canvas context to check.
      */
    def getPrefix(context: stdLib.CanvasRenderingContext2D): java.lang.String = js.native
    def getPrefix(context: stdLib.WebGLRenderingContext): java.lang.String = js.native
    /**
      * Returns `true` if the given context has image smoothing enabled, otherwise returns `false`.
      * Returns null if no smoothing prefix is available.
      * @param context The context to check.
      */
    def isEnabled(context: stdLib.CanvasRenderingContext2D): scala.Boolean = js.native
    def isEnabled(context: stdLib.WebGLRenderingContext): scala.Boolean = js.native
  }
  
}

