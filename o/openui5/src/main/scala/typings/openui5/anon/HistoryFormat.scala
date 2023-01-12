package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistoryFormat extends StObject {
  
  /**
    * The name of the file. It should have extension .support-assistant.json". Example: myfile.support-assistant.json
    * **Note:** Extension ".support-assistant.json" will be appended automatically, if it is not already given.
    * If only ".json" extension is given, it will be turned to ".support-assistant.json"
    */
  var fileName: js.UndefOr[String] = js.undefined
  
  /**
    * The format into which the history object will be converted.
    */
  var historyFormat: js.UndefOr[/* was: sap.ui.support.HistoryFormats */ Any] = js.undefined
}
object HistoryFormat {
  
  inline def apply(): HistoryFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistoryFormat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HistoryFormat] (val x: Self) extends AnyVal {
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    inline def setHistoryFormat(value: /* was: sap.ui.support.HistoryFormats */ Any): Self = StObject.set(x, "historyFormat", value.asInstanceOf[js.Any])
    
    inline def setHistoryFormatUndefined: Self = StObject.set(x, "historyFormat", js.undefined)
  }
}
