package typings.passport

import org.scalablytyped.runtime.Instantiable0
import typings.express.mod.Handler
import typings.passport.mod.AuthenticateOptions
import typings.passport.mod.Authenticator
import typings.passport.mod.Strategy
import typings.passport.mod.StrategyCreatedStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0` extends Instantiable0[Strategy with StrategyCreatedStatic]
  
  @js.native
  trait FamilyName extends StObject {
    
    var familyName: String = js.native
    
    var givenName: String = js.native
    
    var middleName: js.UndefOr[String] = js.native
  }
  object FamilyName {
    
    @scala.inline
    def apply(familyName: String, givenName: String): FamilyName = {
      val __obj = js.Dynamic.literal(familyName = familyName.asInstanceOf[js.Any], givenName = givenName.asInstanceOf[js.Any])
      __obj.asInstanceOf[FamilyName]
    }
    
    @scala.inline
    implicit class FamilyNameMutableBuilder[Self <: FamilyName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFamilyName(value: String): Self = StObject.set(x, "familyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGivenName(value: String): Self = StObject.set(x, "givenName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMiddleName(value: String): Self = StObject.set(x, "middleName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMiddleNameUndefined: Self = StObject.set(x, "middleName", js.undefined)
    }
  }
  
  @js.native
  trait Instantiable
    extends Instantiable0[Authenticator[Handler, js.Any, js.Any, AuthenticateOptions]]
  
  @js.native
  trait PauseStream extends StObject {
    
    var pauseStream: Boolean = js.native
  }
  object PauseStream {
    
    @scala.inline
    def apply(pauseStream: Boolean): PauseStream = {
      val __obj = js.Dynamic.literal(pauseStream = pauseStream.asInstanceOf[js.Any])
      __obj.asInstanceOf[PauseStream]
    }
    
    @scala.inline
    implicit class PauseStreamMutableBuilder[Self <: PauseStream] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPauseStream(value: Boolean): Self = StObject.set(x, "pauseStream", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Type extends StObject {
    
    var `type`: js.UndefOr[String] = js.native
    
    var value: String = js.native
  }
  object Type {
    
    @scala.inline
    def apply(value: String): Type = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UserProperty extends StObject {
    
    var userProperty: String = js.native
  }
  object UserProperty {
    
    @scala.inline
    def apply(userProperty: String): UserProperty = {
      val __obj = js.Dynamic.literal(userProperty = userProperty.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserProperty]
    }
    
    @scala.inline
    implicit class UserPropertyMutableBuilder[Self <: UserProperty] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUserProperty(value: String): Self = StObject.set(x, "userProperty", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Value extends StObject {
    
    var value: String = js.native
  }
  object Value {
    
    @scala.inline
    def apply(value: String): Value = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    @scala.inline
    implicit class ValueMutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
