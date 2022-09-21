package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContentType extends StObject
/**
  * @remarks
  * [Api set: ExcelApi 1.10]
  */
@JSGlobal("Excel.ContentType")
@js.native
object ContentType extends StObject {
  
  /**
    * Comment content containing mentions.
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  @js.native
  sealed trait mention
    extends StObject
       with ContentType
  
  /**
    * Indicates a plain format type for the comment content.
    * @remarks
    * [Api set: ExcelApi 1.10]
    */
  @js.native
  sealed trait plain
    extends StObject
       with ContentType
}
