package typings.maximMazurokGapiClientSearchconsole.gapi.client.searchconsole

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UrlTestingToolsResource extends StObject {
  
  var mobileFriendlyTest: MobileFriendlyTestResource = js.native
}
object UrlTestingToolsResource {
  
  @scala.inline
  def apply(mobileFriendlyTest: MobileFriendlyTestResource): UrlTestingToolsResource = {
    val __obj = js.Dynamic.literal(mobileFriendlyTest = mobileFriendlyTest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlTestingToolsResource]
  }
  
  @scala.inline
  implicit class UrlTestingToolsResourceMutableBuilder[Self <: UrlTestingToolsResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMobileFriendlyTest(value: MobileFriendlyTestResource): Self = StObject.set(x, "mobileFriendlyTest", value.asInstanceOf[js.Any])
  }
}
