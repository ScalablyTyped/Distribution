package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PictureFormat extends StObject
/**
  * The format of the image.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.PictureFormat")
@js.native
object PictureFormat extends StObject {
  
  /**
    * Bitmap image.
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait bmp
    extends StObject
       with PictureFormat
  
  /**
    * Graphics Interchange Format.
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait gif
    extends StObject
       with PictureFormat
  
  /**
    * Joint Photographic Experts Group.
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait jpeg
    extends StObject
       with PictureFormat
  
  /**
    * Portable Network Graphics.
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait png
    extends StObject
       with PictureFormat
  
  /**
    * Scalable Vector Graphic.
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait svg
    extends StObject
       with PictureFormat
  
  /**
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  @js.native
  sealed trait unknown
    extends StObject
       with PictureFormat
}
