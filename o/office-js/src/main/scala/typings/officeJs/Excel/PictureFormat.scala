package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PictureFormat extends StObject
/**
  *
  * The format of the image.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.PictureFormat")
@js.native
object PictureFormat extends StObject {
  
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
}
