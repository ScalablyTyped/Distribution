package typings.maximMazurokGapiClientRecommender.gapi.client.recommender

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRecommenderV1OperationGroup extends StObject {
  
  /** List of operations across one or more resources that belong to this group. Loosely based on RFC6902 and should be performed in the order they appear. */
  var operations: js.UndefOr[js.Array[GoogleCloudRecommenderV1Operation]] = js.undefined
}
object GoogleCloudRecommenderV1OperationGroup {
  
  inline def apply(): GoogleCloudRecommenderV1OperationGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommenderV1OperationGroup]
  }
  
  extension [Self <: GoogleCloudRecommenderV1OperationGroup](x: Self) {
    
    inline def setOperations(value: js.Array[GoogleCloudRecommenderV1Operation]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    inline def setOperationsVarargs(value: GoogleCloudRecommenderV1Operation*): Self = StObject.set(x, "operations", js.Array(value*))
  }
}
