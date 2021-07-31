package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileReference extends StObject {
  
  /** A path to a file in Google Cloud Storage. Example: gs://build-app-1414623860166/app%40debug-unaligned.apk These paths are expected to be url encoded (percent encoding) */
  var gcsPath: js.UndefOr[String] = js.undefined
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
    def setGcsPath(value: String): Self = StObject.set(x, "gcsPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcsPathUndefined: Self = StObject.set(x, "gcsPath", js.undefined)
  }
}
