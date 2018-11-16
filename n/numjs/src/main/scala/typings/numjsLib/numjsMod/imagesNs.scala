package typings
package numjsLib.numjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("numjs", "images")
@js.native
object imagesNs extends js.Object {
  def areaSum[T](
    h0: scala.Double,
    w0: scala.Double,
    H: scala.Double,
    W: scala.Double,
    SAT: numjsLib.numjsMod.NdArray[T]
  ): scala.Double = js.native
  def areaValue[T](img: numjsLib.numjsMod.NdArray[T]): scala.Double = js.native
  def flip[T, O](img: numjsLib.numjsMod.NdArray[T]): numjsLib.numjsMod.NdArray[O] = js.native
  def read(input: java.lang.String): numjsLib.numjsMod.NdArray[stdLib.Uint8Array] = js.native
  def resize[T](img: numjsLib.numjsMod.NdArray[T], height: scala.Double, width: scala.Double): numjsLib.numjsMod.NdArray[stdLib.Uint8Array] = js.native
  def rgb2gray[T](img: numjsLib.numjsMod.NdArray[T]): numjsLib.numjsMod.NdArray[stdLib.Uint8Array] = js.native
  def sat[T](img: numjsLib.numjsMod.NdArray[T]): numjsLib.numjsMod.NdArray[stdLib.Uint32Array] = js.native
  def save[T](img: numjsLib.numjsMod.NdArray[T], dest: java.lang.String): scala.Unit = js.native
  def scharr[T](img: numjsLib.numjsMod.NdArray[T]): numjsLib.numjsMod.NdArray[stdLib.Float32Array] = js.native
  def sobel[T](img: numjsLib.numjsMod.NdArray[T]): numjsLib.numjsMod.NdArray[stdLib.Float32Array] = js.native
  def ssat[T](img: numjsLib.numjsMod.NdArray[T]): numjsLib.numjsMod.NdArray[stdLib.Uint32Array] = js.native
  @JSName("data")
  @js.native
  object dataNs extends js.Object {
    /**  28x28 grayscale image with an handwritten digit extracted from MNIST database */
    val digit: numjsLib.numjsMod.NdArray[scala.Double] = js.native
    /** 28x28 grayscale image with an handwritten digit extracted from MNIST database */
    val five: numjsLib.numjsMod.NdArray[scala.Double] = js.native
    /**
    		 * The standard, yet sometimes controversial
    		 * Lena test image was scanned from the November 1972 edition of
    		 * Playboy magazine. From an image processing perspective, this image
    		 * is useful because it contains smooth, textured, shaded as well as
    		 * detail areas.
    		 */
    val lena: numjsLib.numjsMod.NdArray[scala.Double] = js.native
    /**
    		 * The standard, yet sometimes
    		 * controversial Lena test image was scanned from the November 1972
    		 * edition of Playboy magazine. From an image processing perspective,
    		 * this image is useful because it contains smooth, textured, shaded as
    		 * well as detail areas.
    		 */
    val lenna: numjsLib.numjsMod.NdArray[scala.Double] = js.native
    /**
    		 * This low-contrast image of the surface of
    		 * the moon is useful for illustrating histogram equalization and
    		 * contrast stretching.
    		 */
    val moon: numjsLib.numjsMod.NdArray[scala.Double] = js.native
    /** 300x600 COLOR image representing Node.js's logo */
    val node: numjsLib.numjsMod.NdArray[scala.Double] = js.native
  }
  
}

