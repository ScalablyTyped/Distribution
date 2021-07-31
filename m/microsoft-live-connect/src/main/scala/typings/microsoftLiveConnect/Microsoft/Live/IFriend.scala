package typings.microsoftLiveConnect.Microsoft.Live

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Friend object contains info about a user's friends. A Friend object
  * represents a user's contact whose is_friend value is set to true. The
  * Live Connect REST API supports reading Friend objects.
  */
trait IFriend extends StObject {
  
  /**
    * The friend's ID.
    */
  var id: String
  
  /**
    * The friend's full name, formatted for locale.
    */
  var name: String
}
object IFriend {
  
  @scala.inline
  def apply(id: String, name: String): IFriend = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFriend]
  }
  
  @scala.inline
  implicit class IFriendMutableBuilder[Self <: IFriend] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
