package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object idtokenMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/gcp/IDToken", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with IDToken {
    
    /* private */ /* CompleteClass */
    var credentialsContentCache_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var credentialsPathCache_ : Any = js.native
    
    /* CompleteClass */
    override def fetchFromComputeEngine(targetAudience: String): String = js.native
    
    /* CompleteClass */
    override def fetchFromServiceAccount(targetAudience: String): String = js.native
    
    /* private */ /* CompleteClass */
    var formatJWT_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var getResponsePlainObject_ : Any = js.native
  }
  @JSImport("@nginstack/engine/lib/gcp/IDToken", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait IDToken extends StObject {
    
    /* private */ var credentialsContentCache_ : Any
    
    /* private */ var credentialsPathCache_ : Any
    
    def fetchFromComputeEngine(targetAudience: String): String
    
    def fetchFromServiceAccount(targetAudience: String): String
    
    /* private */ var formatJWT_ : Any
    
    /* private */ var getResponsePlainObject_ : Any
  }
  object IDToken {
    
    inline def apply(
      credentialsContentCache_ : Any,
      credentialsPathCache_ : Any,
      fetchFromComputeEngine: String => String,
      fetchFromServiceAccount: String => String,
      formatJWT_ : Any,
      getResponsePlainObject_ : Any
    ): IDToken = {
      val __obj = js.Dynamic.literal(credentialsContentCache_ = credentialsContentCache_.asInstanceOf[js.Any], credentialsPathCache_ = credentialsPathCache_.asInstanceOf[js.Any], fetchFromComputeEngine = js.Any.fromFunction1(fetchFromComputeEngine), fetchFromServiceAccount = js.Any.fromFunction1(fetchFromServiceAccount), formatJWT_ = formatJWT_.asInstanceOf[js.Any], getResponsePlainObject_ = getResponsePlainObject_.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDToken]
    }
    
    extension [Self <: IDToken](x: Self) {
      
      inline def setCredentialsContentCache_(value: Any): Self = StObject.set(x, "credentialsContentCache_", value.asInstanceOf[js.Any])
      
      inline def setCredentialsPathCache_(value: Any): Self = StObject.set(x, "credentialsPathCache_", value.asInstanceOf[js.Any])
      
      inline def setFetchFromComputeEngine(value: String => String): Self = StObject.set(x, "fetchFromComputeEngine", js.Any.fromFunction1(value))
      
      inline def setFetchFromServiceAccount(value: String => String): Self = StObject.set(x, "fetchFromServiceAccount", js.Any.fromFunction1(value))
      
      inline def setFormatJWT_(value: Any): Self = StObject.set(x, "formatJWT_", value.asInstanceOf[js.Any])
      
      inline def setGetResponsePlainObject_(value: Any): Self = StObject.set(x, "getResponsePlainObject_", value.asInstanceOf[js.Any])
    }
  }
}
