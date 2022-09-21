package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Contentreportsenabled extends StObject {
  
  /** @example true */
  var content_reports_enabled: js.UndefOr[Boolean] = js.undefined
  
  /** @example My first repository on GitHub! */
  var description: String | Null
  
  /** @example example.com */
  var documentation: String | Null
  
  var files: Codeofconduct
  
  /** @example 100 */
  var health_percentage: Double
  
  /**
    * Format: date-time
    * @example 2017-02-28T19:09:29Z
    */
  var updated_at: String | Null
}
object Contentreportsenabled {
  
  inline def apply(files: Codeofconduct, health_percentage: Double): Contentreportsenabled = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], health_percentage = health_percentage.asInstanceOf[js.Any], description = null, documentation = null, updated_at = null)
    __obj.asInstanceOf[Contentreportsenabled]
  }
  
  extension [Self <: Contentreportsenabled](x: Self) {
    
    inline def setContent_reports_enabled(value: Boolean): Self = StObject.set(x, "content_reports_enabled", value.asInstanceOf[js.Any])
    
    inline def setContent_reports_enabledUndefined: Self = StObject.set(x, "content_reports_enabled", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDocumentation(value: String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setDocumentationNull: Self = StObject.set(x, "documentation", null)
    
    inline def setFiles(value: Codeofconduct): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setHealth_percentage(value: Double): Self = StObject.set(x, "health_percentage", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUpdated_atNull: Self = StObject.set(x, "updated_at", null)
  }
}
