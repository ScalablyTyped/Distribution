package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.TopLevel
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
    * Bitmap image.
    *
    */
  @js.native
  sealed trait bmp extends PictureFormat
  
  /**
    * Graphics Interchange Format.
    *
    */
  @js.native
  sealed trait gif extends PictureFormat
  
  /**
    * Joint Photographic Experts Group.
    *
    */
  @js.native
  sealed trait jpeg extends PictureFormat
  
  /**
    * Portable Network Graphics.
    *
    */
  @js.native
  sealed trait png extends PictureFormat
  
  /**
    * Scalable Vector Graphic.
    *
    */
  @js.native
  sealed trait svg extends PictureFormat
  
  @js.native
  sealed trait unknown extends PictureFormat
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PictureFormat with String] = js.native
  /* "BMP" */ @js.native
  object bmp extends TopLevel[bmp with String]
  
  /* "GIF" */ @js.native
  object gif extends TopLevel[gif with String]
  
  /* "JPEG" */ @js.native
  object jpeg extends TopLevel[jpeg with String]
  
  /* "PNG" */ @js.native
  object png extends TopLevel[png with String]
  
  /* "SVG" */ @js.native
  object svg extends TopLevel[svg with String]
  
  /* "UNKNOWN" */ @js.native
  object unknown extends TopLevel[unknown with String]
  
}

