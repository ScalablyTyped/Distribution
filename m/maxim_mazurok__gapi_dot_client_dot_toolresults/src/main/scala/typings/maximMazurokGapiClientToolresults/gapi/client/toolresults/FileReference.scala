package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileReference extends StObject {
  
  /**
    * The URI of a file stored in Google Cloud Storage. For example: http://storage.googleapis.com/mybucket/path/to/test.xml or in gsutil format: gs://mybucket/path/to/test.xml with
    * version-specific info, gs://mybucket/path/to/test.xml#1360383693690000 An INVALID_ARGUMENT error will be returned if the URI format is not supported. - In response: always set - In
    * create/update request: always set
    */
  var fileUri: js.UndefOr[String] = js.undefined
}
object FileReference {
  
  @scala.inline
  def apply(): FileReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileReference]
  }
  
  @scala.inline
  implicit class FileReferenceMutableBuilder[Self <: FileReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileUri(value: String): Self = StObject.set(x, "fileUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileUriUndefined: Self = StObject.set(x, "fileUri", js.undefined)
  }
}
