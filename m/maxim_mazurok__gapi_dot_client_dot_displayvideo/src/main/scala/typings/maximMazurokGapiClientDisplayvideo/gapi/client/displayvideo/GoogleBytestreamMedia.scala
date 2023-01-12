package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleBytestreamMedia extends StObject {
  
  /** Name of the media resource. */
  var resourceName: js.UndefOr[String] = js.undefined
}
object GoogleBytestreamMedia {
  
  inline def apply(): GoogleBytestreamMedia = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleBytestreamMedia]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleBytestreamMedia] (val x: Self) extends AnyVal {
    
    inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
  }
}
