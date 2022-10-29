package typings.pixiExtract

import typings.pixiCore.mod.Renderer
import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@pixi/extract", "Extract")
  @js.native
  open class Extract protected ()
    extends typings.pixiExtract.libExtractMod.Extract {
    /**
      * @param renderer - A reference to the current renderer
      */
    def this(renderer: Renderer) = this()
  }
  /* static members */
  object Extract {
    
    @JSImport("@pixi/extract", "Extract")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Takes premultiplied pixel data and produces regular pixel data
      * @private
      * @param pixels - array of pixel data
      * @param out - output array
      */
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
    @JSImport("@pixi/extract", "Extract.extension")
    @js.native
    val `extension`: ExtensionMetadata = js.native
  }
}
