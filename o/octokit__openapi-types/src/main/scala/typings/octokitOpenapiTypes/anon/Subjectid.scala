package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.issue
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.organization
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.pull_request
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.repository
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Subjectid extends StObject {
  
  /** Uses the ID for the `subject_type` you specified. **Required** when using `subject_type`. */
  var subject_id: js.UndefOr[String] = js.undefined
  
  /** Identifies which additional information you'd like to receive about the person's hovercard. Can be `organization`, `repository`, `issue`, `pull_request`. **Required** when using `subject_id`. */
  var subject_type: js.UndefOr[organization | repository | issue | pull_request] = js.undefined
}
object Subjectid {
  
  inline def apply(): Subjectid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Subjectid]
  }
  
  extension [Self <: Subjectid](x: Self) {
    
    inline def setSubject_id(value: String): Self = StObject.set(x, "subject_id", value.asInstanceOf[js.Any])
    
    inline def setSubject_idUndefined: Self = StObject.set(x, "subject_id", js.undefined)
    
    inline def setSubject_type(value: organization | repository | issue | pull_request): Self = StObject.set(x, "subject_type", value.asInstanceOf[js.Any])
    
    inline def setSubject_typeUndefined: Self = StObject.set(x, "subject_type", js.undefined)
  }
}
