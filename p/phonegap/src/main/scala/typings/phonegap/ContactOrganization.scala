package typings.phonegap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContactOrganization extends StObject {
  
  var department: String
  
  var name: String
  
  var pref: Boolean
  
  var title: String
  
  var `type`: String
}
object ContactOrganization {
  
  inline def apply(department: String, name: String, pref: Boolean, title: String, `type`: String): ContactOrganization = {
    val __obj = js.Dynamic.literal(department = department.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pref = pref.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactOrganization]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContactOrganization] (val x: Self) extends AnyVal {
    
    inline def setDepartment(value: String): Self = StObject.set(x, "department", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPref(value: Boolean): Self = StObject.set(x, "pref", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
