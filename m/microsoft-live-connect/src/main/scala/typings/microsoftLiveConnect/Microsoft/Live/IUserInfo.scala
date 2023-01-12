package typings.microsoftLiveConnect.Microsoft.Live

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#region REST Object Information
/**
  * Sub object of REST objects that contains information about a user.
  */
trait IUserInfo extends StObject {
  
  /**
    * The Live ID of the user.
    */
  var id: String
  
  /**
    * The name of the user.
    */
  var name: String
}
object IUserInfo {
  
  inline def apply(id: String, name: String): IUserInfo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUserInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IUserInfo] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
