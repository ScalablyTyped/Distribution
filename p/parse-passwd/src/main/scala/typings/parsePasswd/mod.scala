package typings.parsePasswd

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(passwdText: String): js.Array[PasswdEntry] = ^.asInstanceOf[js.Dynamic].apply(passwdText.asInstanceOf[js.Any]).asInstanceOf[js.Array[PasswdEntry]]
  
  @JSImport("parse-passwd", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait PasswdEntry extends StObject {
    
    var gecos: String
    
    var gid: String
    
    var homedir: String
    
    var password: String
    
    var shell: String
    
    var uid: String
    
    var username: String
  }
  object PasswdEntry {
    
    inline def apply(
      gecos: String,
      gid: String,
      homedir: String,
      password: String,
      shell: String,
      uid: String,
      username: String
    ): PasswdEntry = {
      val __obj = js.Dynamic.literal(gecos = gecos.asInstanceOf[js.Any], gid = gid.asInstanceOf[js.Any], homedir = homedir.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[PasswdEntry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PasswdEntry] (val x: Self) extends AnyVal {
      
      inline def setGecos(value: String): Self = StObject.set(x, "gecos", value.asInstanceOf[js.Any])
      
      inline def setGid(value: String): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      inline def setHomedir(value: String): Self = StObject.set(x, "homedir", value.asInstanceOf[js.Any])
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setShell(value: String): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
      
      inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
