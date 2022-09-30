package typings.otplib

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import typings.otplibPresetV11.HotpOptionsInterface
import typings.otplibPresetV11.HotpVerifyOptionsInterface
import typings.otplibPresetV11.TotpOptionsInterface
import typings.otplibPresetV11.TotpVerifyOptionsInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v11Mod {
  
  object authenticator extends Shortcut {
    
    @JSImport("otplib/v11", "authenticator")
    @js.native
    val ^ : typings.otplibPresetV11.Authenticator = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("otplib/v11", "authenticator.Authenticator")
    @js.native
    open class Authenticator ()
      extends StObject
         with typings.otplibPresetV11.Authenticator {
      
      /* CompleteClass */
      var HOTP: Instantiable0[typings.otplibPresetV11.HOTP] = js.native
      
      /* CompleteClass */
      var TOTP: Instantiable0[typings.otplibPresetV11.TOTP] = js.native
      
      /* CompleteClass */
      override def check(token: String, secret: String): Boolean = js.native
      /* CompleteClass */
      override def check(token: String, secret: String, counter: Double): Boolean = js.native
      
      /* CompleteClass */
      override def checkDelta(token: String, secret: String): Double | Null = js.native
      
      /* CompleteClass */
      var defaultOptions: HotpOptionsInterface = js.native
      /* CompleteClass */
      @JSName("defaultOptions")
      var defaultOptions_TOTP: TotpOptionsInterface = js.native
      
      /* CompleteClass */
      override def generate(secret: String): String = js.native
      /* CompleteClass */
      override def generate(secret: String, counter: Double): String = js.native
      
      /* CompleteClass */
      var options: HotpOptionsInterface = js.native
      
      /* CompleteClass */
      var optionsAll: HotpOptionsInterface = js.native
      /* CompleteClass */
      @JSName("optionsAll")
      var optionsAll_TOTP: TotpOptionsInterface = js.native
      
      /* CompleteClass */
      @JSName("options")
      var options_TOTP: TotpOptionsInterface = js.native
      
      /* CompleteClass */
      override def resetOptions(): this.type = js.native
      
      /* CompleteClass */
      override def timeRemaining(): Double = js.native
      
      /* CompleteClass */
      override def timeUsed(): Double = js.native
      
      /* CompleteClass */
      override def verify(opts: HotpVerifyOptionsInterface): Boolean = js.native
      /* CompleteClass */
      override def verify(opts: TotpVerifyOptionsInterface): Boolean = js.native
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("otplib/v11", "authenticator.HOTP")
    @js.native
    open class HOTP ()
      extends StObject
         with typings.otplibPresetV11.HOTP {
      
      /* CompleteClass */
      var HOTP: Instantiable0[typings.otplibPresetV11.HOTP] = js.native
      
      /* CompleteClass */
      override def check(token: String, secret: String, counter: Double): Boolean = js.native
      
      /* CompleteClass */
      var defaultOptions: HotpOptionsInterface = js.native
      
      /* CompleteClass */
      override def generate(secret: String, counter: Double): String = js.native
      
      /* CompleteClass */
      var options: HotpOptionsInterface = js.native
      
      /* CompleteClass */
      var optionsAll: HotpOptionsInterface = js.native
      
      /* CompleteClass */
      override def resetOptions(): this.type = js.native
      
      /* CompleteClass */
      override def verify(opts: HotpVerifyOptionsInterface): Boolean = js.native
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("otplib/v11", "authenticator.TOTP")
    @js.native
    open class TOTP ()
      extends StObject
         with typings.otplibPresetV11.TOTP {
      
      /* CompleteClass */
      var HOTP: Instantiable0[typings.otplibPresetV11.HOTP] = js.native
      
      /* CompleteClass */
      var TOTP: Instantiable0[typings.otplibPresetV11.TOTP] = js.native
      
      /* CompleteClass */
      override def check(token: String, secret: String): Boolean = js.native
      /* CompleteClass */
      override def check(token: String, secret: String, counter: Double): Boolean = js.native
      
      /* CompleteClass */
      override def checkDelta(token: String, secret: String): Double | Null = js.native
      
      /* CompleteClass */
      var defaultOptions: HotpOptionsInterface = js.native
      /* CompleteClass */
      @JSName("defaultOptions")
      var defaultOptions_TOTP: TotpOptionsInterface = js.native
      
      /* CompleteClass */
      override def generate(secret: String): String = js.native
      /* CompleteClass */
      override def generate(secret: String, counter: Double): String = js.native
      
      /* CompleteClass */
      var options: HotpOptionsInterface = js.native
      
      /* CompleteClass */
      var optionsAll: HotpOptionsInterface = js.native
      /* CompleteClass */
      @JSName("optionsAll")
      var optionsAll_TOTP: TotpOptionsInterface = js.native
      
      /* CompleteClass */
      @JSName("options")
      var options_TOTP: TotpOptionsInterface = js.native
      
      /* CompleteClass */
      override def resetOptions(): this.type = js.native
      
      /* CompleteClass */
      override def timeRemaining(): Double = js.native
      
      /* CompleteClass */
      override def timeUsed(): Double = js.native
      
      /* CompleteClass */
      override def verify(opts: HotpVerifyOptionsInterface): Boolean = js.native
      /* CompleteClass */
      override def verify(opts: TotpVerifyOptionsInterface): Boolean = js.native
    }
    
    type _To = typings.otplibPresetV11.Authenticator
    
    /* This means you don't have to write `^`, but can instead just say `authenticator.foo` */
    override def _to: typings.otplibPresetV11.Authenticator = ^
  }
  
  object hotp extends Shortcut {
    
    @JSImport("otplib/v11", "hotp")
    @js.native
    val ^ : typings.otplibPresetV11.HOTP = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("otplib/v11", "hotp.HOTP")
    @js.native
    open class HOTP ()
      extends StObject
         with typings.otplibPresetV11.HOTP {
      
      /* CompleteClass */
      var HOTP: Instantiable0[typings.otplibPresetV11.HOTP] = js.native
      
      /* CompleteClass */
      override def check(token: String, secret: String, counter: Double): Boolean = js.native
      
      /* CompleteClass */
      var defaultOptions: HotpOptionsInterface = js.native
      
      /* CompleteClass */
      override def generate(secret: String, counter: Double): String = js.native
      
      /* CompleteClass */
      var options: HotpOptionsInterface = js.native
      
      /* CompleteClass */
      var optionsAll: HotpOptionsInterface = js.native
      
      /* CompleteClass */
      override def resetOptions(): this.type = js.native
      
      /* CompleteClass */
      override def verify(opts: HotpVerifyOptionsInterface): Boolean = js.native
    }
    
    type _To = typings.otplibPresetV11.HOTP
    
    /* This means you don't have to write `^`, but can instead just say `hotp.foo` */
    override def _to: typings.otplibPresetV11.HOTP = ^
  }
  
  object totp extends Shortcut {
    
    @JSImport("otplib/v11", "totp")
    @js.native
    val ^ : typings.otplibPresetV11.TOTP = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("otplib/v11", "totp.HOTP")
    @js.native
    open class HOTP ()
      extends StObject
         with typings.otplibPresetV11.HOTP {
      
      /* CompleteClass */
      var HOTP: Instantiable0[typings.otplibPresetV11.HOTP] = js.native
      
      /* CompleteClass */
      override def check(token: String, secret: String, counter: Double): Boolean = js.native
      
      /* CompleteClass */
      var defaultOptions: HotpOptionsInterface = js.native
      
      /* CompleteClass */
      override def generate(secret: String, counter: Double): String = js.native
      
      /* CompleteClass */
      var options: HotpOptionsInterface = js.native
      
      /* CompleteClass */
      var optionsAll: HotpOptionsInterface = js.native
      
      /* CompleteClass */
      override def resetOptions(): this.type = js.native
      
      /* CompleteClass */
      override def verify(opts: HotpVerifyOptionsInterface): Boolean = js.native
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("otplib/v11", "totp.TOTP")
    @js.native
    open class TOTP ()
      extends StObject
         with typings.otplibPresetV11.TOTP {
      
      /* CompleteClass */
      var HOTP: Instantiable0[typings.otplibPresetV11.HOTP] = js.native
      
      /* CompleteClass */
      var TOTP: Instantiable0[typings.otplibPresetV11.TOTP] = js.native
      
      /* CompleteClass */
      override def check(token: String, secret: String): Boolean = js.native
      /* CompleteClass */
      override def check(token: String, secret: String, counter: Double): Boolean = js.native
      
      /* CompleteClass */
      override def checkDelta(token: String, secret: String): Double | Null = js.native
      
      /* CompleteClass */
      var defaultOptions: HotpOptionsInterface = js.native
      /* CompleteClass */
      @JSName("defaultOptions")
      var defaultOptions_TOTP: TotpOptionsInterface = js.native
      
      /* CompleteClass */
      override def generate(secret: String): String = js.native
      /* CompleteClass */
      override def generate(secret: String, counter: Double): String = js.native
      
      /* CompleteClass */
      var options: HotpOptionsInterface = js.native
      
      /* CompleteClass */
      var optionsAll: HotpOptionsInterface = js.native
      /* CompleteClass */
      @JSName("optionsAll")
      var optionsAll_TOTP: TotpOptionsInterface = js.native
      
      /* CompleteClass */
      @JSName("options")
      var options_TOTP: TotpOptionsInterface = js.native
      
      /* CompleteClass */
      override def resetOptions(): this.type = js.native
      
      /* CompleteClass */
      override def timeRemaining(): Double = js.native
      
      /* CompleteClass */
      override def timeUsed(): Double = js.native
      
      /* CompleteClass */
      override def verify(opts: HotpVerifyOptionsInterface): Boolean = js.native
      /* CompleteClass */
      override def verify(opts: TotpVerifyOptionsInterface): Boolean = js.native
    }
    
    type _To = typings.otplibPresetV11.TOTP
    
    /* This means you don't have to write `^`, but can instead just say `totp.foo` */
    override def _to: typings.otplibPresetV11.TOTP = ^
  }
}
