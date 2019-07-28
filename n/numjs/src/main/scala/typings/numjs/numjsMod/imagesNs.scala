package typings.numjs.numjsMod

import typings.std.Float32Array
import typings.std.Uint32Array
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("numjs", "images")
@js.native
object imagesNs extends js.Object {
  def areaSum[T](h0: Double, w0: Double, H: Double, W: Double, SAT: NdArray[T]): Double = js.native
  def areaValue[T](img: NdArray[T]): Double = js.native
  def flip[T, O](img: NdArray[T]): NdArray[O] = js.native
  def read(input: String): NdArray[Uint8Array] = js.native
  def resize[T](img: NdArray[T], height: Double, width: Double): NdArray[Uint8Array] = js.native
  def rgb2gray[T](img: NdArray[T]): NdArray[Uint8Array] = js.native
  def sat[T](img: NdArray[T]): NdArray[Uint32Array] = js.native
  def save[T](img: NdArray[T], dest: String): Unit = js.native
  def scharr[T](img: NdArray[T]): NdArray[Float32Array] = js.native
  def sobel[T](img: NdArray[T]): NdArray[Float32Array] = js.native
  def ssat[T](img: NdArray[T]): NdArray[Uint32Array] = js.native
  @JSName("data")
  @js.native
  object dataNs extends js.Object {
    /**  28x28 grayscale image with an handwritten digit extracted from MNIST database */
    val digit: NdArray[Double] = js.native
    /** 28x28 grayscale image with an handwritten digit extracted from MNIST database */
    val five: NdArray[Double] = js.native
    /**
    		 * The standard, yet sometimes controversial
    		 * Lena test image was scanned from the November 1972 edition of
    		 * Playboy magazine. From an image processing perspective, this image
    		 * is useful because it contains smooth, textured, shaded as well as
    		 * detail areas.
    		 */
    val lena: NdArray[Double] = js.native
    /**
    		 * The standard, yet sometimes
    		 * controversial Lena test image was scanned from the November 1972
    		 * edition of Playboy magazine. From an image processing perspective,
    		 * this image is useful because it contains smooth, textured, shaded as
    		 * well as detail areas.
    		 */
    val lenna: NdArray[Double] = js.native
    /**
    		 * This low-contrast image of the surface of
    		 * the moon is useful for illustrating histogram equalization and
    		 * contrast stretching.
    		 */
    val moon: NdArray[Double] = js.native
    /** 300x600 COLOR image representing Node.js's logo */
    val node: NdArray[Double] = js.native
  }
  
}

