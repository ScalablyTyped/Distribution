package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  id :number,   node_id :string,   type :string,   wait_timer :@octokit/openapi-types.@octokit/openapi-types.components['schemas']['wait-timer'] | undefined}> & std.Partial<{  id :number,   node_id :string,   type :string,   reviewers :std.Array<{  type :@octokit/openapi-types.@octokit/openapi-types.components['schemas']['deployment-reviewer-type'] | undefined,   reviewer :std.Partial<@octokit/openapi-types.@octokit/openapi-types.components['schemas']['simple-user']> & std.Partial<@octokit/openapi-types.@octokit/openapi-types.components['schemas']['team']> | undefined}> | undefined}> & std.Partial<{  id :number,   node_id :string,   type :string}> */
trait Partialidnumbernodeidstri extends StObject {
  
  var id: js.UndefOr[Double] = js.undefined
  
  var node_id: js.UndefOr[String] = js.undefined
  
  var reviewers: js.UndefOr[js.Array[ReviewerType]] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var wait_timer: js.UndefOr[Double] = js.undefined
}
object Partialidnumbernodeidstri {
  
  inline def apply(): Partialidnumbernodeidstri = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialidnumbernodeidstri]
  }
  
  extension [Self <: Partialidnumbernodeidstri](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setNode_idUndefined: Self = StObject.set(x, "node_id", js.undefined)
    
    inline def setReviewers(value: js.Array[ReviewerType]): Self = StObject.set(x, "reviewers", value.asInstanceOf[js.Any])
    
    inline def setReviewersUndefined: Self = StObject.set(x, "reviewers", js.undefined)
    
    inline def setReviewersVarargs(value: ReviewerType*): Self = StObject.set(x, "reviewers", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setWait_timer(value: Double): Self = StObject.set(x, "wait_timer", value.asInstanceOf[js.Any])
    
    inline def setWait_timerUndefined: Self = StObject.set(x, "wait_timer", js.undefined)
  }
}
