package typings.maximMazurokGapiClientRecommender.gapi.client.recommender

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommenderV1OperationGroup extends js.Object {
  
  /** List of operations across one or more resources that belong to this group. Loosely based on RFC6902 and should be performed in the order they appear. */
  var operations: js.UndefOr[js.Array[GoogleCloudRecommenderV1Operation]] = js.native
}
object GoogleCloudRecommenderV1OperationGroup {
  
  @scala.inline
  def apply(): GoogleCloudRecommenderV1OperationGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommenderV1OperationGroup]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommenderV1OperationGroupOps[Self <: GoogleCloudRecommenderV1OperationGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOperationsVarargs(value: GoogleCloudRecommenderV1Operation*): Self = this.set("operations", js.Array(value :_*))
    
    @scala.inline
    def setOperations(value: js.Array[GoogleCloudRecommenderV1Operation]): Self = this.set("operations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperations: Self = this.set("operations", js.undefined)
  }
}
