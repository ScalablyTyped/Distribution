package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PictureFormat extends js.Object

/**
  *
  * The format of the image.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.PictureFormat")
@js.native
object PictureFormat extends js.Object {
  /**
    *
    * Bitmap image.
    *
    */
  @js.native
  sealed trait bmp
    extends officeDashJsLib.ExcelNs.PictureFormat
  
  /**
    *
    * Graphics Interchange Format.
    *
    */
  @js.native
  sealed trait gif
    extends officeDashJsLib.ExcelNs.PictureFormat
  
  /**
    *
    * Joint Photographic Experts Group.
    *
    */
  @js.native
  sealed trait jpeg
    extends officeDashJsLib.ExcelNs.PictureFormat
  
  /**
    *
    * Portable Network Graphics.
    *
    */
  @js.native
  sealed trait png
    extends officeDashJsLib.ExcelNs.PictureFormat
  
  /**
    *
    * Scalable Vector Graphic.
    *
    */
  @js.native
  sealed trait svg
    extends officeDashJsLib.ExcelNs.PictureFormat
  
  @js.native
  sealed trait unknown
    extends officeDashJsLib.ExcelNs.PictureFormat
  
  /* "BMP" */ val bmp: bmp with java.lang.String = js.native
  /* "GIF" */ val gif: gif with java.lang.String = js.native
  /* "JPEG" */ val jpeg: jpeg with java.lang.String = js.native
  /* "PNG" */ val png: png with java.lang.String = js.native
  /* "SVG" */ val svg: svg with java.lang.String = js.native
  /* "UNKNOWN" */ val unknown: unknown with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.PictureFormat with java.lang.String] = js.native
}

