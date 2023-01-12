package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Projecturl extends StObject {
  
  var column_name: String
  
  var id: Double
  
  var previous_column_name: js.UndefOr[String] = js.undefined
  
  var project_id: Double
  
  /** Format: uri */
  var project_url: String
  
  /** Format: uri */
  var url: String
}
object Projecturl {
  
  inline def apply(column_name: String, id: Double, project_id: Double, project_url: String, url: String): Projecturl = {
    val __obj = js.Dynamic.literal(column_name = column_name.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], project_id = project_id.asInstanceOf[js.Any], project_url = project_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Projecturl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Projecturl] (val x: Self) extends AnyVal {
    
    inline def setColumn_name(value: String): Self = StObject.set(x, "column_name", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPrevious_column_name(value: String): Self = StObject.set(x, "previous_column_name", value.asInstanceOf[js.Any])
    
    inline def setPrevious_column_nameUndefined: Self = StObject.set(x, "previous_column_name", js.undefined)
    
    inline def setProject_id(value: Double): Self = StObject.set(x, "project_id", value.asInstanceOf[js.Any])
    
    inline def setProject_url(value: String): Self = StObject.set(x, "project_url", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
