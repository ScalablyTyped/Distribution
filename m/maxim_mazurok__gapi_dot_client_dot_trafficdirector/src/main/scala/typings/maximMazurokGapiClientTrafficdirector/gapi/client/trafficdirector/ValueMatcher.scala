package typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValueMatcher extends js.Object {
  
  /** If specified, a match occurs if and only if the target value is a bool value and is equal to this field. */
  var boolMatch: js.UndefOr[Boolean] = js.native
  
  /** If specified, a match occurs if and only if the target value is a double value and is matched to this field. */
  var doubleMatch: js.UndefOr[DoubleMatcher] = js.native
  
  /** If specified, a match occurs if and only if the target value is a list value and is matched to this field. */
  var listMatch: js.UndefOr[ListMatcher] = js.native
  
  /** If specified, a match occurs if and only if the target value is a NullValue. */
  var nullMatch: js.UndefOr[js.Any] = js.native
  
  /**
    * If specified, value match will be performed based on whether the path is referring to a valid primitive value in the metadata. If the path is referring to a non-primitive value, the
    * result is always not matched.
    */
  var presentMatch: js.UndefOr[Boolean] = js.native
  
  /** If specified, a match occurs if and only if the target value is a string value and is matched to this field. */
  var stringMatch: js.UndefOr[StringMatcher] = js.native
}
object ValueMatcher {
  
  @scala.inline
  def apply(): ValueMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValueMatcher]
  }
  
  @scala.inline
  implicit class ValueMatcherOps[Self <: ValueMatcher] (val x: Self) extends AnyVal {
    
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
    def setBoolMatch(value: Boolean): Self = this.set("boolMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoolMatch: Self = this.set("boolMatch", js.undefined)
    
    @scala.inline
    def setDoubleMatch(value: DoubleMatcher): Self = this.set("doubleMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoubleMatch: Self = this.set("doubleMatch", js.undefined)
    
    @scala.inline
    def setListMatch(value: ListMatcher): Self = this.set("listMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListMatch: Self = this.set("listMatch", js.undefined)
    
    @scala.inline
    def setNullMatch(value: js.Any): Self = this.set("nullMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNullMatch: Self = this.set("nullMatch", js.undefined)
    
    @scala.inline
    def setPresentMatch(value: Boolean): Self = this.set("presentMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePresentMatch: Self = this.set("presentMatch", js.undefined)
    
    @scala.inline
    def setStringMatch(value: StringMatcher): Self = this.set("stringMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStringMatch: Self = this.set("stringMatch", js.undefined)
  }
}
