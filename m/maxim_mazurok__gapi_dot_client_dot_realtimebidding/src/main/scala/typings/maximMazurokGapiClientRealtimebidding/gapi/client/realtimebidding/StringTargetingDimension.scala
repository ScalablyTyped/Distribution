package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StringTargetingDimension extends js.Object {
  
  /** How the items in this list should be targeted. */
  var targetingMode: js.UndefOr[String] = js.native
  
  /** The values specified. */
  var values: js.UndefOr[js.Array[String]] = js.native
}
object StringTargetingDimension {
  
  @scala.inline
  def apply(): StringTargetingDimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringTargetingDimension]
  }
  
  @scala.inline
  implicit class StringTargetingDimensionOps[Self <: StringTargetingDimension] (val x: Self) extends AnyVal {
    
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
    def setTargetingMode(value: String): Self = this.set("targetingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetingMode: Self = this.set("targetingMode", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
}
