package typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListMatcher extends js.Object {
  
  /** If specified, at least one of the values in the list must match the value specified. */
  var oneOf: js.UndefOr[ValueMatcher] = js.native
}
object ListMatcher {
  
  @scala.inline
  def apply(): ListMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMatcher]
  }
  
  @scala.inline
  implicit class ListMatcherOps[Self <: ListMatcher] (val x: Self) extends AnyVal {
    
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
    def setOneOf(value: ValueMatcher): Self = this.set("oneOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOneOf: Self = this.set("oneOf", js.undefined)
  }
}
