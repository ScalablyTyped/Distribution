package typings.octokitTypes.anon

import typings.octokitTypes.octokitTypesStrings.error
import typings.octokitTypes.octokitTypesStrings.none
import typings.octokitTypes.octokitTypesStrings.note
import typings.octokitTypes.octokitTypesStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Severity extends StObject {
  
  /**
    * A short description of the rule used to detect the alert.
    */
  var description: String
  
  /**
    * A unique identifier for the rule used to detect the alert.
    */
  var id: String
  
  /**
    * The severity of the alert.
    */
  var severity: none | note | warning | error
}
object Severity {
  
  @scala.inline
  def apply(description: String, id: String, severity: none | note | warning | error): Severity = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Severity]
  }
  
  @scala.inline
  implicit class SeverityMutableBuilder[Self <: Severity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeverity(value: none | note | warning | error): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
  }
}
