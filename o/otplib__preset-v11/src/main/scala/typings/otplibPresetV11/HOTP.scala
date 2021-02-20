package typings.otplibPresetV11

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HOTP extends StObject {
  
  var HOTP: Instantiable0[typings.otplibPresetV11.HOTP] = js.native
  
  def check(token: String, secret: String, counter: Double): Boolean = js.native
  
  var defaultOptions: HotpOptionsInterface = js.native
  
  def generate(secret: String, counter: Double): String = js.native
  
  var options: HotpOptionsInterface = js.native
  
  var optionsAll: HotpOptionsInterface = js.native
  
  def resetOptions(): this.type = js.native
  
  def verify(opts: HotpVerifyOptionsInterface): Boolean = js.native
}
object HOTP {
  
  @scala.inline
  def apply(
    HOTP: Instantiable0[HOTP],
    check: (String, String, Double) => Boolean,
    defaultOptions: HotpOptionsInterface,
    generate: (String, Double) => String,
    options: HotpOptionsInterface,
    optionsAll: HotpOptionsInterface,
    resetOptions: () => HOTP,
    verify: HotpVerifyOptionsInterface => Boolean
  ): HOTP = {
    val __obj = js.Dynamic.literal(HOTP = HOTP.asInstanceOf[js.Any], check = js.Any.fromFunction3(check), defaultOptions = defaultOptions.asInstanceOf[js.Any], generate = js.Any.fromFunction2(generate), options = options.asInstanceOf[js.Any], optionsAll = optionsAll.asInstanceOf[js.Any], resetOptions = js.Any.fromFunction0(resetOptions), verify = js.Any.fromFunction1(verify))
    __obj.asInstanceOf[HOTP]
  }
  
  @scala.inline
  implicit class HOTPMutableBuilder[Self <: HOTP] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheck(value: (String, String, Double) => Boolean): Self = StObject.set(x, "check", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDefaultOptions(value: HotpOptionsInterface): Self = StObject.set(x, "defaultOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerate(value: (String, Double) => String): Self = StObject.set(x, "generate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHOTP(value: Instantiable0[HOTP]): Self = StObject.set(x, "HOTP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: HotpOptionsInterface): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsAll(value: HotpOptionsInterface): Self = StObject.set(x, "optionsAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetOptions(value: () => HOTP): Self = StObject.set(x, "resetOptions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setVerify(value: HotpVerifyOptionsInterface => Boolean): Self = StObject.set(x, "verify", js.Any.fromFunction1(value))
  }
}
