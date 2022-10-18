package typings.nextAuth

import typings.nextAuth.coreMod.OutgoingResponse
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreRoutesProvidersMod {
  
  @JSImport("next-auth/core/routes/providers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    providers: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternalProvider */ Any
    ]
  ): OutgoingResponse[Record[String, PublicProvider]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(providers.asInstanceOf[js.Any]).asInstanceOf[OutgoingResponse[Record[String, PublicProvider]]]
  
  trait PublicProvider extends StObject {
    
    var callbackUrl: String
    
    var id: String
    
    var name: String
    
    var signinUrl: String
    
    var `type`: String
  }
  object PublicProvider {
    
    inline def apply(callbackUrl: String, id: String, name: String, signinUrl: String, `type`: String): PublicProvider = {
      val __obj = js.Dynamic.literal(callbackUrl = callbackUrl.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], signinUrl = signinUrl.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PublicProvider]
    }
    
    extension [Self <: PublicProvider](x: Self) {
      
      inline def setCallbackUrl(value: String): Self = StObject.set(x, "callbackUrl", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSigninUrl(value: String): Self = StObject.set(x, "signinUrl", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
