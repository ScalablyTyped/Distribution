package typings.microsoftLiveConnect.Microsoft.Live

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Returns when you perform a GET request to /FILE_ID/content.
  */
trait IFileDownloadLink extends StObject {
  
  /**
    * A URL download link for the file.
    */
  var location: String
}
object IFileDownloadLink {
  
  inline def apply(location: String): IFileDownloadLink = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileDownloadLink]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IFileDownloadLink] (val x: Self) extends AnyVal {
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
  }
}
