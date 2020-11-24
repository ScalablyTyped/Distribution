package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecuteBatchDmlResponse extends js.Object {
  
  /**
    * One ResultSet for each statement in the request that ran successfully, in the same order as the statements in the request. Each ResultSet does not contain any rows. The
    * ResultSetStats in each ResultSet contain the number of rows modified by the statement. Only the first ResultSet in the response contains valid ResultSetMetadata.
    */
  var resultSets: js.UndefOr[js.Array[ResultSet]] = js.native
  
  /** If all DML statements are executed successfully, the status is `OK`. Otherwise, the error status of the first failed statement. */
  var status: js.UndefOr[Status] = js.native
}
object ExecuteBatchDmlResponse {
  
  @scala.inline
  def apply(): ExecuteBatchDmlResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecuteBatchDmlResponse]
  }
  
  @scala.inline
  implicit class ExecuteBatchDmlResponseOps[Self <: ExecuteBatchDmlResponse] (val x: Self) extends AnyVal {
    
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
    def setResultSetsVarargs(value: ResultSet*): Self = this.set("resultSets", js.Array(value :_*))
    
    @scala.inline
    def setResultSets(value: js.Array[ResultSet]): Self = this.set("resultSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResultSets: Self = this.set("resultSets", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
