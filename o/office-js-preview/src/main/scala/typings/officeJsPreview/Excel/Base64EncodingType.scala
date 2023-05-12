package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Base64EncodingType extends StObject
/**
  * The file type represented by the base64 encoding.
  *
  * @remarks
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.Base64EncodingType")
@js.native
object Base64EncodingType extends StObject {
  
  /**
    * The JPG file type.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait JPG
    extends StObject
       with Base64EncodingType
  
  /**
    * The PNG file type.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait PNG
    extends StObject
       with Base64EncodingType
}
