package typings.passport

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.Handler
import typings.passport.mod.AuthenticateOptions
import typings.passport.mod.Authenticator
import typings.passport.mod.Strategy
import typings.passport.mod.StrategyCreatedStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0`
    extends StObject
       with Instantiable0[Strategy & StrategyCreatedStatic]
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var message: js.UndefOr[String] = js.undefined
  }
  object Dictkey {
    
    inline def apply(): Dictkey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dictkey]
    }
    
    extension [Self <: Dictkey](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
  
  trait FamilyName extends StObject {
    
    var familyName: String
    
    var givenName: String
    
    var middleName: js.UndefOr[String] = js.undefined
  }
  object FamilyName {
    
    inline def apply(familyName: String, givenName: String): FamilyName = {
      val __obj = js.Dynamic.literal(familyName = familyName.asInstanceOf[js.Any], givenName = givenName.asInstanceOf[js.Any])
      __obj.asInstanceOf[FamilyName]
    }
    
    extension [Self <: FamilyName](x: Self) {
      
      inline def setFamilyName(value: String): Self = StObject.set(x, "familyName", value.asInstanceOf[js.Any])
      
      inline def setGivenName(value: String): Self = StObject.set(x, "givenName", value.asInstanceOf[js.Any])
      
      inline def setMiddleName(value: String): Self = StObject.set(x, "middleName", value.asInstanceOf[js.Any])
      
      inline def setMiddleNameUndefined: Self = StObject.set(x, "middleName", js.undefined)
    }
  }
  
  @js.native
  trait Instantiable
    extends StObject
       with Instantiable0[Authenticator[Handler, Any, Any, AuthenticateOptions]]
  
  trait KeepSessionInfo extends StObject {
    
    var keepSessionInfo: js.UndefOr[Boolean] = js.undefined
  }
  object KeepSessionInfo {
    
    inline def apply(): KeepSessionInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeepSessionInfo]
    }
    
    extension [Self <: KeepSessionInfo](x: Self) {
      
      inline def setKeepSessionInfo(value: Boolean): Self = StObject.set(x, "keepSessionInfo", value.asInstanceOf[js.Any])
      
      inline def setKeepSessionInfoUndefined: Self = StObject.set(x, "keepSessionInfo", js.undefined)
    }
  }
  
  trait PauseStream extends StObject {
    
    var pauseStream: Boolean
  }
  object PauseStream {
    
    inline def apply(pauseStream: Boolean): PauseStream = {
      val __obj = js.Dynamic.literal(pauseStream = pauseStream.asInstanceOf[js.Any])
      __obj.asInstanceOf[PauseStream]
    }
    
    extension [Self <: PauseStream](x: Self) {
      
      inline def setPauseStream(value: Boolean): Self = StObject.set(x, "pauseStream", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type extends StObject {
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var value: String
  }
  object Type {
    
    inline def apply(value: String): Type = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    extension [Self <: Type](x: Self) {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait UserProperty extends StObject {
    
    var userProperty: String
  }
  object UserProperty {
    
    inline def apply(userProperty: String): UserProperty = {
      val __obj = js.Dynamic.literal(userProperty = userProperty.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserProperty]
    }
    
    extension [Self <: UserProperty](x: Self) {
      
      inline def setUserProperty(value: String): Self = StObject.set(x, "userProperty", value.asInstanceOf[js.Any])
    }
  }
  
  trait Value extends StObject {
    
    var value: String
  }
  object Value {
    
    inline def apply(value: String): Value = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    extension [Self <: Value](x: Self) {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
