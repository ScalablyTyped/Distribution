package typings.maximMazurokGapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelTestMatrixResponse extends js.Object {
  
  /** The current rolled-up state of the test matrix. If this state is already final, then the cancelation request will have no effect. */
  var testState: js.UndefOr[String] = js.native
}
object CancelTestMatrixResponse {
  
  @scala.inline
  def apply(): CancelTestMatrixResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelTestMatrixResponse]
  }
  
  @scala.inline
  implicit class CancelTestMatrixResponseOps[Self <: CancelTestMatrixResponse] (val x: Self) extends AnyVal {
    
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
    def setTestState(value: String): Self = this.set("testState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestState: Self = this.set("testState", js.undefined)
  }
}
