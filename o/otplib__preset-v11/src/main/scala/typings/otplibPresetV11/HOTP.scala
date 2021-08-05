package typings.otplibPresetV11

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HOTP extends StObject {
  
  var HOTP: Instantiable0[typings.otplibPresetV11.HOTP]
  
  def check(token: String, secret: String, counter: Double): Boolean
  
  var defaultOptions: HotpOptionsInterface
  
  def generate(secret: String, counter: Double): String
  
  var options: HotpOptionsInterface
  
  var optionsAll: HotpOptionsInterface
  
  def resetOptions(): this.type
  
  def verify(opts: HotpVerifyOptionsInterface): Boolean
}
object HOTP {
  
  inline def apply(
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
  
  extension [Self <: HOTP](x: Self) {
    
    inline def setCheck(value: (String, String, Double) => Boolean): Self = StObject.set(x, "check", js.Any.fromFunction3(value))
    
    inline def setDefaultOptions(value: HotpOptionsInterface): Self = StObject.set(x, "defaultOptions", value.asInstanceOf[js.Any])
    
    inline def setGenerate(value: (String, Double) => String): Self = StObject.set(x, "generate", js.Any.fromFunction2(value))
    
    inline def setHOTP(value: Instantiable0[HOTP]): Self = StObject.set(x, "HOTP", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: HotpOptionsInterface): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsAll(value: HotpOptionsInterface): Self = StObject.set(x, "optionsAll", value.asInstanceOf[js.Any])
    
    inline def setResetOptions(value: () => HOTP): Self = StObject.set(x, "resetOptions", js.Any.fromFunction0(value))
    
    inline def setVerify(value: HotpVerifyOptionsInterface => Boolean): Self = StObject.set(x, "verify", js.Any.fromFunction1(value))
  }
}
