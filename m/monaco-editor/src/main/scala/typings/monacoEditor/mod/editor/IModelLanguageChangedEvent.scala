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
  
  /**
    * Source of the call that caused the event.
    */
  val source: String
}
object IModelLanguageChangedEvent {
  
  inline def apply(newLanguage: String, oldLanguage: String, source: String): IModelLanguageChangedEvent = {
    val __obj = js.Dynamic.literal(newLanguage = newLanguage.asInstanceOf[js.Any], oldLanguage = oldLanguage.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModelLanguageChangedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IModelLanguageChangedEvent] (val x: Self) extends AnyVal {
    
    inline def setNewLanguage(value: String): Self = StObject.set(x, "newLanguage", value.asInstanceOf[js.Any])
    
    inline def setOldLanguage(value: String): Self = StObject.set(x, "oldLanguage", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
