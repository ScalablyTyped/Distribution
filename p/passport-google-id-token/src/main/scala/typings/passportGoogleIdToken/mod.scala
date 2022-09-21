package typings.passportGoogleIdToken

import typings.passport.mod.Strategy
import typings.passportGoogleIdToken.anon.Email
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("passport-google-id-token", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Strategy {
    def this(opt: StrategyOptions, verify: VerifyCallback) = this()
  }
  
  type GoogleTokenStrategy = Strategy
  
  /**
    * The decoded token from google that includes basic user information
    */
  trait ParsedToken extends StObject {
    
    var payload: Email
  }
  object ParsedToken {
    
    inline def apply(payload: Email): ParsedToken = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedToken]
    }
    
    extension [Self <: ParsedToken](x: Self) {
      
      inline def setPayload(value: Email): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
  
  trait StrategyOptions extends StObject {
    
    /**
      * Google client id
      */
    var clientID: String
    
    /**
      * Return the Google certificate that will be used for signature validation.
      *
      * A custom function can be used instead when passed as an option in the Strategy
      * constructor. It can be interesting e.g. if caching is needed.
      *
      * @param kid The key id specified in the token
      * @param callback
      */
    var getGoogleCerts: js.UndefOr[
        js.Function2[
          /* kid */ String, 
          /* callback */ js.Function2[/* err */ Any, /* cert */ String, Unit], 
          Unit
        ]
      ] = js.undefined
  }
  object StrategyOptions {
    
    inline def apply(clientID: String): StrategyOptions = {
      val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any])
      __obj.asInstanceOf[StrategyOptions]
    }
    
    extension [Self <: StrategyOptions](x: Self) {
      
      inline def setClientID(value: String): Self = StObject.set(x, "clientID", value.asInstanceOf[js.Any])
      
      inline def setGetGoogleCerts(
        value: (/* kid */ String, /* callback */ js.Function2[/* err */ Any, /* cert */ String, Unit]) => Unit
      ): Self = StObject.set(x, "getGoogleCerts", js.Any.fromFunction2(value))
      
      inline def setGetGoogleCertsUndefined: Self = StObject.set(x, "getGoogleCerts", js.undefined)
    }
  }
  
  type VerifiedCallback = js.Function3[/* error */ Any, /* user */ js.UndefOr[Any], /* info */ js.UndefOr[Any], Unit]
  
  type VerifyCallback = js.Function3[
    /* parsedToken */ ParsedToken, 
    /* googleId */ String, 
    /* done */ VerifiedCallback, 
    Unit
  ]
}
