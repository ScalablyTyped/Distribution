package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the user prompt properties for the data validation.
  *
  * @remarks
  * [Api set: ExcelApi 1.8]
  */
trait DataValidationPrompt extends StObject {
  
  /**
    * Specifies the message of the prompt.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var message: String
  
  /**
    * Specifies if a prompt is shown when a user selects a cell with data validation.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var showPrompt: Boolean
  
  /**
    * Specifies the title for the prompt.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var title: String
}
object DataValidationPrompt {
  
  inline def apply(message: String, showPrompt: Boolean, title: String): DataValidationPrompt = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], showPrompt = showPrompt.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataValidationPrompt]
  }
  
  extension [Self <: DataValidationPrompt](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setShowPrompt(value: Boolean): Self = StObject.set(x, "showPrompt", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
