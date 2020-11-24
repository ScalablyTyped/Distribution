package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NonSdkApiUsageViolation extends js.Object {
  
  /** Signatures of a subset of those hidden API's. */
  var apiSignatures: js.UndefOr[js.Array[String]] = js.native
  
  /** Total number of unique hidden API's accessed. */
  var uniqueApis: js.UndefOr[Double] = js.native
}
object NonSdkApiUsageViolation {
  
  @scala.inline
  def apply(): NonSdkApiUsageViolation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NonSdkApiUsageViolation]
  }
  
  @scala.inline
  implicit class NonSdkApiUsageViolationOps[Self <: NonSdkApiUsageViolation] (val x: Self) extends AnyVal {
    
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
    def setApiSignaturesVarargs(value: String*): Self = this.set("apiSignatures", js.Array(value :_*))
    
    @scala.inline
    def setApiSignatures(value: js.Array[String]): Self = this.set("apiSignatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiSignatures: Self = this.set("apiSignatures", js.undefined)
    
    @scala.inline
    def setUniqueApis(value: Double): Self = this.set("uniqueApis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUniqueApis: Self = this.set("uniqueApis", js.undefined)
  }
}
