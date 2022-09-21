package typings.otplibPresetV11

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("Authenticator")
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
  
  @JSGlobal("HOTP")
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
  
  @JSGlobal("TOTP")
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
}
