package typings.phonegap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContactField extends StObject {
  
  var pref: Boolean
  
  var `type`: String
  
  var value: String
}
object ContactField {
  
  @scala.inline
  def apply(pref: Boolean, `type`: String, value: String): ContactField = {
    val __obj = js.Dynamic.literal(pref = pref.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactField]
  }
  
  @scala.inline
  implicit class ContactFieldMutableBuilder[Self <: ContactField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPref(value: Boolean): Self = StObject.set(x, "pref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
