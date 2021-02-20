package typings.nodeValidator

import typings.std.Number
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ValidatorOptions {
  
  @js.native
  trait IsDateOptions extends Options {
    
    var format: js.UndefOr[String] = js.native
    
    var message: js.UndefOr[String] = js.native
  }
  object IsDateOptions {
    
    @scala.inline
    def apply(): IsDateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IsDateOptions]
    }
    
    @scala.inline
    implicit class IsDateOptionsMutableBuilder[Self <: IsDateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
  
  @js.native
  trait IsNumberOptions extends Options {
    
    var max: js.UndefOr[Number] = js.native
    
    var min: js.UndefOr[Number] = js.native
  }
  object IsNumberOptions {
    
    @scala.inline
    def apply(): IsNumberOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IsNumberOptions]
    }
    
    @scala.inline
    implicit class IsNumberOptionsMutableBuilder[Self <: IsNumberOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax(value: Number): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Number): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    }
  }
  
  @js.native
  trait IsStringOptions extends Options {
    
    var message: js.UndefOr[String] = js.native
    
    var regex: js.UndefOr[RegExp] = js.native
  }
  object IsStringOptions {
    
    @scala.inline
    def apply(): IsStringOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IsStringOptions]
    }
    
    @scala.inline
    implicit class IsStringOptionsMutableBuilder[Self <: IsStringOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setRegex(value: RegExp): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodeValidator.ValidatorOptions.IsStringOptions
    - typings.nodeValidator.ValidatorOptions.IsNumberOptions
    - typings.nodeValidator.ValidatorOptions.IsDateOptions
  */
  trait Options extends StObject
  object Options {
    
    @scala.inline
    def IsDateOptions(): typings.nodeValidator.ValidatorOptions.IsDateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.nodeValidator.ValidatorOptions.IsDateOptions]
    }
    
    @scala.inline
    def IsNumberOptions(): typings.nodeValidator.ValidatorOptions.IsNumberOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.nodeValidator.ValidatorOptions.IsNumberOptions]
    }
    
    @scala.inline
    def IsStringOptions(): typings.nodeValidator.ValidatorOptions.IsStringOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.nodeValidator.ValidatorOptions.IsStringOptions]
    }
  }
}
