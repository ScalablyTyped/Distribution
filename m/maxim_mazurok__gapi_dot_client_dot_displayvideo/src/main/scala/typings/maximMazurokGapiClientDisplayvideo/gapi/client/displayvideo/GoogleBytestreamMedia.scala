package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleBytestreamMedia extends StObject {
  
  /** Name of the media resource. */
  var resourceName: js.UndefOr[String] = js.undefined
}
object GoogleBytestreamMedia {
  
  @scala.inline
  def apply(): GoogleBytestreamMedia = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleBytestreamMedia]
  }
  
  @scala.inline
  implicit class GoogleBytestreamMediaMutableBuilder[Self <: GoogleBytestreamMedia] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
  }
}
