package typings.modernizr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputTypesBoolean extends StObject {
  
  var color: Boolean
  
  var date: Boolean
  
  var datetime: Boolean
  
  var `datetime-local`: Boolean
  
  var email: Boolean
  
  var month: Boolean
  
  var number: Boolean
  
  var range: Boolean
  
  var search: Boolean
  
  var tel: Boolean
  
  var time: Boolean
  
  var url: Boolean
  
  var week: Boolean
}
object InputTypesBoolean {
  
  @scala.inline
  def apply(
    color: Boolean,
    date: Boolean,
    datetime: Boolean,
    `datetime-local`: Boolean,
    email: Boolean,
    month: Boolean,
    number: Boolean,
    range: Boolean,
    search: Boolean,
    tel: Boolean,
    time: Boolean,
    url: Boolean,
    week: Boolean
  ): InputTypesBoolean = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], datetime = datetime.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], tel = tel.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], week = week.asInstanceOf[js.Any])
    __obj.updateDynamic("datetime-local")(`datetime-local`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputTypesBoolean]
  }
  
  @scala.inline
  implicit class InputTypesBooleanMutableBuilder[Self <: InputTypesBoolean] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: Boolean): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: Boolean): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatetime(value: Boolean): Self = StObject.set(x, "datetime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDatetime-local`(value: Boolean): Self = StObject.set(x, "datetime-local", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: Boolean): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonth(value: Boolean): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: Boolean): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: Boolean): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearch(value: Boolean): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTel(value: Boolean): Self = StObject.set(x, "tel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Boolean): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: Boolean): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeek(value: Boolean): Self = StObject.set(x, "week", value.asInstanceOf[js.Any])
  }
}
