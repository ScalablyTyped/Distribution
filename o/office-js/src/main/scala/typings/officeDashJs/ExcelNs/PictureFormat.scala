package typings.officeDashJs.ExcelNs

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
  sealed trait bmp extends PictureFormat
  
  /**
    *
    * Graphics Interchange Format.
    *
    */
  @js.native
  sealed trait gif extends PictureFormat
  
  /**
    *
    * Joint Photographic Experts Group.
    *
    */
  @js.native
  sealed trait jpeg extends PictureFormat
  
  /**
    *
    * Portable Network Graphics.
    *
    */
  @js.native
  sealed trait png extends PictureFormat
  
  /**
    *
    * Scalable Vector Graphic.
    *
    */
  @js.native
  sealed trait svg extends PictureFormat
  
  @js.native
  sealed trait unknown extends PictureFormat
  
  /* "BMP" */ val bmp: typings.officeDashJs.ExcelNs.PictureFormat.bmp with String = js.native
  /* "GIF" */ val gif: typings.officeDashJs.ExcelNs.PictureFormat.gif with String = js.native
  /* "JPEG" */ val jpeg: typings.officeDashJs.ExcelNs.PictureFormat.jpeg with String = js.native
  /* "PNG" */ val png: typings.officeDashJs.ExcelNs.PictureFormat.png with String = js.native
  /* "SVG" */ val svg: typings.officeDashJs.ExcelNs.PictureFormat.svg with String = js.native
  /* "UNKNOWN" */ val unknown: typings.officeDashJs.ExcelNs.PictureFormat.unknown with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PictureFormat with String] = js.native
}

