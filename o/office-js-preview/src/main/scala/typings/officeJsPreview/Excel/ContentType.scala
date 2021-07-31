package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContentType extends StObject
/**
  * [Api set: ExcelApi 1.10]
  */
@JSGlobal("Excel.ContentType")
@js.native
object ContentType extends StObject {
  
  /**
    * Comment content containing mentions.
    *
    */
  @js.native
  sealed trait mention
    extends StObject
       with ContentType
  
  /**
    * Indicates plain format type of the comment content.
    *
    */
  @js.native
  sealed trait plain
    extends StObject
       with ContentType
}
