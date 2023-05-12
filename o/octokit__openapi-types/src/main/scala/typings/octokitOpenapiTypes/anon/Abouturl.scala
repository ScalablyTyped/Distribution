package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Abouturl extends StObject {
  
  /** Format: uri */
  var about_url: String
  
  var name: String
  
  var `type`: String
  
  /** Format: uri */
  var url: String
  
  var vendor: String
}
object Abouturl {
  
  inline def apply(about_url: String, name: String, `type`: String, url: String, vendor: String): Abouturl = {
    val __obj = js.Dynamic.literal(about_url = about_url.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Abouturl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Abouturl] (val x: Self) extends AnyVal {
    
    inline def setAbout_url(value: String): Self = StObject.set(x, "about_url", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
  }
}
