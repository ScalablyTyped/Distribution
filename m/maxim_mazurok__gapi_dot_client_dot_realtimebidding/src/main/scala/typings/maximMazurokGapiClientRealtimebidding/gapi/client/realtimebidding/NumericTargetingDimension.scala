package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumericTargetingDimension extends js.Object {
  
  /** The IDs excluded in a configuration. */
  var excludedIds: js.UndefOr[js.Array[String]] = js.native
  
  /** The IDs included in a configuration. */
  var includedIds: js.UndefOr[js.Array[String]] = js.native
}
object NumericTargetingDimension {
  
  @scala.inline
  def apply(): NumericTargetingDimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumericTargetingDimension]
  }
  
  @scala.inline
  implicit class NumericTargetingDimensionOps[Self <: NumericTargetingDimension] (val x: Self) extends AnyVal {
    
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
    def setExcludedIdsVarargs(value: String*): Self = this.set("excludedIds", js.Array(value :_*))
    
    @scala.inline
    def setExcludedIds(value: js.Array[String]): Self = this.set("excludedIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludedIds: Self = this.set("excludedIds", js.undefined)
    
    @scala.inline
    def setIncludedIdsVarargs(value: String*): Self = this.set("includedIds", js.Array(value :_*))
    
    @scala.inline
    def setIncludedIds(value: js.Array[String]): Self = this.set("includedIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludedIds: Self = this.set("includedIds", js.undefined)
  }
}
