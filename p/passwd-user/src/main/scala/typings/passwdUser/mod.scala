package typings.passwdUser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("passwd-user", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def passwdUser(): js.Promise[js.UndefOr[UserData]] = ^.asInstanceOf[js.Dynamic].applyDynamic("passwdUser")().asInstanceOf[js.Promise[js.UndefOr[UserData]]]
  inline def passwdUser(username: String): js.Promise[js.UndefOr[UserData]] = ^.asInstanceOf[js.Dynamic].applyDynamic("passwdUser")(username.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[UserData]]]
  inline def passwdUser(username: Double): js.Promise[js.UndefOr[UserData]] = ^.asInstanceOf[js.Dynamic].applyDynamic("passwdUser")(username.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[UserData]]]
  
  inline def passwdUserSync(): js.UndefOr[UserData] = ^.asInstanceOf[js.Dynamic].applyDynamic("passwdUserSync")().asInstanceOf[js.UndefOr[UserData]]
  inline def passwdUserSync(username: String): js.UndefOr[UserData] = ^.asInstanceOf[js.Dynamic].applyDynamic("passwdUserSync")(username.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[UserData]]
  inline def passwdUserSync(username: Double): js.UndefOr[UserData] = ^.asInstanceOf[js.Dynamic].applyDynamic("passwdUserSync")(username.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[UserData]]
  
  trait UserData extends StObject {
    
    /**
    	Name of user.
    	*/
    val fullName: String
    
    /**
    	Also known as [GID](https://en.wikipedia.org/wiki/Group_identifier).
    	*/
    val groupIdentifier: Double
    
    /**
    	Home directory.
    	*/
    val homeDirectory: String
    
    val password: String
    
    /**
    	Default shell.
    	*/
    val shell: String
    
    /**
    	Also known as [UID](https://en.wikipedia.org/wiki/User_identifier).
    	*/
    val userIdentifier: Double
    
    val username: String
  }
  object UserData {
    
    inline def apply(
      fullName: String,
      groupIdentifier: Double,
      homeDirectory: String,
      password: String,
      shell: String,
      userIdentifier: Double,
      username: String
    ): UserData = {
      val __obj = js.Dynamic.literal(fullName = fullName.asInstanceOf[js.Any], groupIdentifier = groupIdentifier.asInstanceOf[js.Any], homeDirectory = homeDirectory.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any], userIdentifier = userIdentifier.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserData]
    }
    
    extension [Self <: UserData](x: Self) {
      
      inline def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
      
      inline def setGroupIdentifier(value: Double): Self = StObject.set(x, "groupIdentifier", value.asInstanceOf[js.Any])
      
      inline def setHomeDirectory(value: String): Self = StObject.set(x, "homeDirectory", value.asInstanceOf[js.Any])
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setShell(value: String): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
      
      inline def setUserIdentifier(value: Double): Self = StObject.set(x, "userIdentifier", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
