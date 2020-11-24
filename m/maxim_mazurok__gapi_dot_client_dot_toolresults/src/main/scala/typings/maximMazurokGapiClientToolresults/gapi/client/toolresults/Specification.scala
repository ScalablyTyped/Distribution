package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Specification extends js.Object {
  
  /** An Android mobile test execution specification. */
  var androidTest: js.UndefOr[AndroidTest] = js.native
  
  /** An iOS mobile test execution specification. */
  var iosTest: js.UndefOr[IosTest] = js.native
}
object Specification {
  
  @scala.inline
  def apply(): Specification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Specification]
  }
  
  @scala.inline
  implicit class SpecificationOps[Self <: Specification] (val x: Self) extends AnyVal {
    
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
    def setAndroidTest(value: AndroidTest): Self = this.set("androidTest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAndroidTest: Self = this.set("androidTest", js.undefined)
    
    @scala.inline
    def setIosTest(value: IosTest): Self = this.set("iosTest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIosTest: Self = this.set("iosTest", js.undefined)
  }
}
