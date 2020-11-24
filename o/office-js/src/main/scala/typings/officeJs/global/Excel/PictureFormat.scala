package typings.officeJs.global.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * The format of the image.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.PictureFormat")
@js.native
object PictureFormat extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.officeJs.Excel.PictureFormat with String] = js.native
  
  /* "BMP" */ val bmp: typings.officeJs.Excel.PictureFormat.bmp with String = js.native
  
  /* "GIF" */ val gif: typings.officeJs.Excel.PictureFormat.gif with String = js.native
  
  /* "JPEG" */ val jpeg: typings.officeJs.Excel.PictureFormat.jpeg with String = js.native
  
  /* "PNG" */ val png: typings.officeJs.Excel.PictureFormat.png with String = js.native
  
  /* "SVG" */ val svg: typings.officeJs.Excel.PictureFormat.svg with String = js.native
  
  /* "UNKNOWN" */ val unknown: typings.officeJs.Excel.PictureFormat.unknown with String = js.native
}
