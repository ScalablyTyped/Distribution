package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IModelLanguageChangedEvent extends StObject {
  
  /**
    * New language
    */
  val newLanguage: String
  
  /**
    * Previous language
    */
  val oldLanguage: String
}
object IModelLanguageChangedEvent {
  
  inline def apply(newLanguage: String, oldLanguage: String): IModelLanguageChangedEvent = {
    val __obj = js.Dynamic.literal(newLanguage = newLanguage.asInstanceOf[js.Any], oldLanguage = oldLanguage.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModelLanguageChangedEvent]
  }
  
  extension [Self <: IModelLanguageChangedEvent](x: Self) {
    
    inline def setNewLanguage(value: String): Self = StObject.set(x, "newLanguage", value.asInstanceOf[js.Any])
    
    inline def setOldLanguage(value: String): Self = StObject.set(x, "oldLanguage", value.asInstanceOf[js.Any])
  }
}
