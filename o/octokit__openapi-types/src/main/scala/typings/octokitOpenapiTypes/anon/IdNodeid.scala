package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdNodeid extends StObject {
  
  /** @example 3755 */
  var id: Double
  
  /** @example MDQ6R2F0ZTM3NTU= */
  var node_id: String
  
  /** @description The people or teams that may approve jobs that reference the environment. You can list up to six users or teams as reviewers. The reviewers must have at least read access to the repository. Only one of the required reviewers needs to approve the job for it to proceed. */
  var reviewers: js.UndefOr[js.Array[Reviewer]] = js.undefined
  
  /** @example required_reviewers */
  var `type`: String
}
object IdNodeid {
  
  inline def apply(id: Double, node_id: String, `type`: String): IdNodeid = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdNodeid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdNodeid] (val x: Self) extends AnyVal {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setReviewers(value: js.Array[Reviewer]): Self = StObject.set(x, "reviewers", value.asInstanceOf[js.Any])
    
    inline def setReviewersUndefined: Self = StObject.set(x, "reviewers", js.undefined)
    
    inline def setReviewersVarargs(value: Reviewer*): Self = StObject.set(x, "reviewers", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
