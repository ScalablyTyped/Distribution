package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.issue_
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.organization_
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.pull_request
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.repository_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Subjectid extends StObject {
  
  /** @description Uses the ID for the `subject_type` you specified. **Required** when using `subject_type`. */
  var subject_id: js.UndefOr[String] = js.undefined
  
  /** @description Identifies which additional information you'd like to receive about the person's hovercard. Can be `organization`, `repository`, `issue`, `pull_request`. **Required** when using `subject_id`. */
  var subject_type: js.UndefOr[organization_ | repository_ | issue_ | pull_request] = js.undefined
}
object Subjectid {
  
  inline def apply(): Subjectid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Subjectid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Subjectid] (val x: Self) extends AnyVal {
    
    inline def setSubject_id(value: String): Self = StObject.set(x, "subject_id", value.asInstanceOf[js.Any])
    
    inline def setSubject_idUndefined: Self = StObject.set(x, "subject_id", js.undefined)
    
    inline def setSubject_type(value: organization_ | repository_ | issue_ | pull_request): Self = StObject.set(x, "subject_type", value.asInstanceOf[js.Any])
    
    inline def setSubject_typeUndefined: Self = StObject.set(x, "subject_type", js.undefined)
  }
}
