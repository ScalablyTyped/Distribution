package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageData
  extends ImageBitmapSource
     with TexImageSource {
  /**
    * Returns the one-dimensional array containing the data in RGBA order, as integers in the
    * range 0 to 255.
    */
  val data: stdLib.Uint8ClampedArray
  /**
    * Returns the actual dimensions of the data in the ImageData object, in
    * pixels.
    */
  val height: scala.Double
  val width: scala.Double
}

@JSGlobal("ImageData")
@js.native
object ImageData
  extends org.scalablytyped.runtime.Instantiable2[/* width */ scala.Double, /* height */ scala.Double, ImageData]
     with org.scalablytyped.runtime.Instantiable3[
      /* array */ stdLib.Uint8ClampedArray, 
      /* width */ scala.Double, 
      /* height */ scala.Double, 
      ImageData
    ]

