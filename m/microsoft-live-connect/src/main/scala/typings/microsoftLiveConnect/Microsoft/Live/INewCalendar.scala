package typings.microsoftLiveConnect.Microsoft.Live

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a new calendar item.
  */
trait INewCalendar extends StObject {
  
  /**
    * Description of the calendar.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the calendar.
    */
  var name: String
}
object INewCalendar {
  
  inline def apply(name: String): INewCalendar = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[INewCalendar]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: INewCalendar] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
