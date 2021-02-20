package typings.microsoftLiveConnect.Microsoft.Live

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a new calendar item.
  */
@js.native
trait INewCalendar extends StObject {
  
  /**
    * Description of the calendar.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Name of the calendar.
    */
  var name: String = js.native
}
object INewCalendar {
  
  @scala.inline
  def apply(name: String): INewCalendar = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[INewCalendar]
  }
  
  @scala.inline
  implicit class INewCalendarMutableBuilder[Self <: INewCalendar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
