package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSecurityAuthTokenMod {
  
  inline def apply(scope: String): Unit = ^.asInstanceOf[js.Dynamic].apply(scope.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(scope: String, data: String): Unit = (^.asInstanceOf[js.Dynamic].apply(scope.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(scope: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].apply(scope.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(scope: js.Array[String], data: String): Unit = (^.asInstanceOf[js.Dynamic].apply(scope.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(scope: Double): Unit = ^.asInstanceOf[js.Dynamic].apply(scope.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(scope: Double, data: String): Unit = (^.asInstanceOf[js.Dynamic].apply(scope.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(scope: DBKey): Unit = ^.asInstanceOf[js.Dynamic].apply(scope.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(scope: DBKey, data: String): Unit = (^.asInstanceOf[js.Dynamic].apply(scope.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/security/AuthToken", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with AuthToken {
    def this(scope: String) = this()
    def this(scope: js.Array[String]) = this()
    def this(scope: Double) = this()
    def this(scope: DBKey) = this()
    def this(scope: String, data: String) = this()
    def this(scope: js.Array[String], data: String) = this()
    def this(scope: Double, data: String) = this()
    def this(scope: DBKey, data: String) = this()
    
    /* CompleteClass */
    var data: String = js.native
    
    /* CompleteClass */
    var description: String = js.native
    
    /* CompleteClass */
    var expires: js.Date = js.native
    
    /* CompleteClass */
    var scope: String = js.native
    
    /* CompleteClass */
    var userKey: Double | DBKey = js.native
  }
  @JSImport("@nginstack/engine/lib/security/AuthToken", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait AuthToken extends StObject {
    
    var data: String
    
    var description: String
    
    var expires: js.Date
    
    var scope: String
    
    var userKey: Double | DBKey
  }
  object AuthToken {
    
    inline def apply(data: String, description: String, expires: js.Date, scope: String, userKey: Double | DBKey): AuthToken = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], userKey = userKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthToken]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AuthToken] (val x: Self) extends AnyVal {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setExpires(value: js.Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setUserKey(value: Double | DBKey): Self = StObject.set(x, "userKey", value.asInstanceOf[js.Any])
    }
  }
  
  type DBKey = typings.nginstackEngine.libDbkeyDbkeyMod.^
}
