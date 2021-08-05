package typings.microsoftLiveConnect.Microsoft.Live

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Success response to a new file creation request.
  */
trait INewFileResponse extends StObject {
  
  /**
    * ID of the new item.
    */
  var id: String
  
  /**
    * The file's name and file extension.
    */
  var name: String
  
  /**
    * URL where the item can be downloaded from.
    */
  var source: String
}
object INewFileResponse {
  
  inline def apply(id: String, name: String, source: String): INewFileResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[INewFileResponse]
  }
  
  extension [Self <: INewFileResponse](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
