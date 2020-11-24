package typings.maximMazurokGapiClientSearchconsole.gapi.client.searchconsole

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UrlTestingToolsResource extends js.Object {
  
  var mobileFriendlyTest: MobileFriendlyTestResource = js.native
}
object UrlTestingToolsResource {
  
  @scala.inline
  def apply(mobileFriendlyTest: MobileFriendlyTestResource): UrlTestingToolsResource = {
    val __obj = js.Dynamic.literal(mobileFriendlyTest = mobileFriendlyTest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlTestingToolsResource]
  }
  
  @scala.inline
  implicit class UrlTestingToolsResourceOps[Self <: UrlTestingToolsResource] (val x: Self) extends AnyVal {
    
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
    def setMobileFriendlyTest(value: MobileFriendlyTestResource): Self = this.set("mobileFriendlyTest", value.asInstanceOf[js.Any])
  }
}
