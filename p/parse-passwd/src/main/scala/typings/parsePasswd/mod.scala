package typings.parsePasswd

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("parse-passwd", JSImport.Namespace)
  @js.native
  def apply(passwdText: String): js.Array[PasswdEntry] = js.native
  
  @js.native
  trait PasswdEntry extends StObject {
    
    var gecos: String = js.native
    
    var gid: String = js.native
    
    var homedir: String = js.native
    
    var password: String = js.native
    
    var shell: String = js.native
    
    var uid: String = js.native
    
    var username: String = js.native
  }
  object PasswdEntry {
    
    @scala.inline
    def apply(
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
    implicit class PasswdEntryMutableBuilder[Self <: PasswdEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGecos(value: String): Self = StObject.set(x, "gecos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGid(value: String): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHomedir(value: String): Self = StObject.set(x, "homedir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShell(value: String): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
