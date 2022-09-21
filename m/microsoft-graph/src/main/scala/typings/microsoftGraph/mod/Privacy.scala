package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Privacy extends StObject {
  
  var subjectRightsRequests: js.UndefOr[NullableOption[js.Array[SubjectRightsRequest]]] = js.undefined
}
object Privacy {
  
  inline def apply(): Privacy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Privacy]
  }
  
  extension [Self <: Privacy](x: Self) {
    
    inline def setSubjectRightsRequests(value: NullableOption[js.Array[SubjectRightsRequest]]): Self = StObject.set(x, "subjectRightsRequests", value.asInstanceOf[js.Any])
    
    inline def setSubjectRightsRequestsNull: Self = StObject.set(x, "subjectRightsRequests", null)
    
    inline def setSubjectRightsRequestsUndefined: Self = StObject.set(x, "subjectRightsRequests", js.undefined)
    
    inline def setSubjectRightsRequestsVarargs(value: SubjectRightsRequest*): Self = StObject.set(x, "subjectRightsRequests", js.Array(value*))
  }
}
