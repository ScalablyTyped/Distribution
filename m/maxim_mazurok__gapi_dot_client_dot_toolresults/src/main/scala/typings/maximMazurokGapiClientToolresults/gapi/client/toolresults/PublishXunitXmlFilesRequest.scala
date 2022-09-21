package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublishXunitXmlFilesRequest extends StObject {
  
  /** URI of the Xunit XML files to publish. The maximum size of the file this reference is pointing to is 50MB. Required. */
  var xunitXmlFiles: js.UndefOr[js.Array[FileReference]] = js.undefined
}
object PublishXunitXmlFilesRequest {
  
  inline def apply(): PublishXunitXmlFilesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublishXunitXmlFilesRequest]
  }
  
  extension [Self <: PublishXunitXmlFilesRequest](x: Self) {
    
    inline def setXunitXmlFiles(value: js.Array[FileReference]): Self = StObject.set(x, "xunitXmlFiles", value.asInstanceOf[js.Any])
    
    inline def setXunitXmlFilesUndefined: Self = StObject.set(x, "xunitXmlFiles", js.undefined)
    
    inline def setXunitXmlFilesVarargs(value: FileReference*): Self = StObject.set(x, "xunitXmlFiles", js.Array(value*))
  }
}
