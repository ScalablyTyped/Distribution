package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublishXunitXmlFilesRequest extends StObject {
  
  /** URI of the Xunit XML files to publish. The maximum size of the file this reference is pointing to is 50MB. Required. */
  var xunitXmlFiles: js.UndefOr[js.Array[FileReference]] = js.native
}
object PublishXunitXmlFilesRequest {
  
  @scala.inline
  def apply(): PublishXunitXmlFilesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublishXunitXmlFilesRequest]
  }
  
  @scala.inline
  implicit class PublishXunitXmlFilesRequestMutableBuilder[Self <: PublishXunitXmlFilesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setXunitXmlFiles(value: js.Array[FileReference]): Self = StObject.set(x, "xunitXmlFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXunitXmlFilesUndefined: Self = StObject.set(x, "xunitXmlFiles", js.undefined)
    
    @scala.inline
    def setXunitXmlFilesVarargs(value: FileReference*): Self = StObject.set(x, "xunitXmlFiles", js.Array(value :_*))
  }
}
