package typings.pixiJs.mod

import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class provides renderer-specific plugins for exporting content from a renderer.
  * For instance, these plugins can be used for saving an Image, Canvas element or for exporting the raw image data (pixels).
  *
  * Do not instantiate these plugins directly. It is available from the `renderer.plugins` property.
  * See {@link PIXI.CanvasRenderer#plugins} or {@link PIXI.Renderer#plugins}.
  * @example
  * // Create a new app (will auto-add extract plugin to renderer)
  * const app = new PIXI.Application();
  *
  * // Draw a red circle
  * const graphics = new PIXI.Graphics()
  *     .beginFill(0xFF0000)
  *     .drawCircle(0, 0, 50);
  *
  * // Render the graphics as an HTMLImageElement
  * const image = app.renderer.plugins.extract.image(graphics);
  * document.body.appendChild(image);
  * @memberof PIXI
  */
@JSImport("pixi.js", "Extract")
@js.native
open class Extract protected ()
  extends typings.pixiExtract.mod.Extract {
  /**
    * @param renderer - A reference to the current renderer
    */
  def this(renderer: typings.pixiCore.mod.Renderer) = this()
}
object Extract {
  
  @JSImport("pixi.js", "Extract")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Takes premultiplied pixel data and produces regular pixel data
    * @private
    * @param pixels - array of pixel data
    * @param out - output array
    */
  /* static member */
  inline def arrayPostDivide(pixels: js.Array[Double], out: js.Array[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayPostDivide")(pixels.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def arrayPostDivide(pixels: js.Array[Double], out: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayPostDivide")(pixels.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def arrayPostDivide(pixels: js.Array[Double], out: js.typedarray.Uint8ClampedArray): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayPostDivide")(pixels.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def arrayPostDivide(pixels: js.typedarray.Uint8Array, out: js.Array[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayPostDivide")(pixels.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def arrayPostDivide(pixels: js.typedarray.Uint8Array, out: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayPostDivide")(pixels.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def arrayPostDivide(pixels: js.typedarray.Uint8Array, out: js.typedarray.Uint8ClampedArray): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayPostDivide")(pixels.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def arrayPostDivide(pixels: js.typedarray.Uint8ClampedArray, out: js.Array[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayPostDivide")(pixels.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def arrayPostDivide(pixels: js.typedarray.Uint8ClampedArray, out: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayPostDivide")(pixels.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def arrayPostDivide(pixels: js.typedarray.Uint8ClampedArray, out: js.typedarray.Uint8ClampedArray): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayPostDivide")(pixels.asInstanceOf[js.Any], out.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** @ignore */
  /* static member */
  @JSImport("pixi.js", "Extract.extension")
  @js.native
  val `extension`: ExtensionMetadata = js.native
}
