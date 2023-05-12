package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libOtpHotpMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/otp/HOTP", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with HOTP
  @JSImport("@nginstack/engine/lib/otp/HOTP", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generate(key: String, counter: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(key.asInstanceOf[js.Any], counter.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def generate(key: String, counter: Double, options: HOTPOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(key.asInstanceOf[js.Any], counter.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def generate(key: js.typedarray.ArrayBuffer, counter: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(key.asInstanceOf[js.Any], counter.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def generate(key: js.typedarray.ArrayBuffer, counter: Double, options: HOTPOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(key.asInstanceOf[js.Any], counter.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def generate(key: js.typedarray.Uint8Array, counter: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(key.asInstanceOf[js.Any], counter.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def generate(key: js.typedarray.Uint8Array, counter: Double, options: HOTPOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(key.asInstanceOf[js.Any], counter.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def verify(otp: String, key: String, counter: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(otp.asInstanceOf[js.Any], key.asInstanceOf[js.Any], counter.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def verify(otp: String, key: String, counter: Double, options: HOTPOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(otp.asInstanceOf[js.Any], key.asInstanceOf[js.Any], counter.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def verify(otp: String, key: js.typedarray.ArrayBuffer, counter: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(otp.asInstanceOf[js.Any], key.asInstanceOf[js.Any], counter.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def verify(otp: String, key: js.typedarray.ArrayBuffer, counter: Double, options: HOTPOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(otp.asInstanceOf[js.Any], key.asInstanceOf[js.Any], counter.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def verify(otp: String, key: js.typedarray.Uint8Array, counter: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(otp.asInstanceOf[js.Any], key.asInstanceOf[js.Any], counter.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def verify(otp: String, key: js.typedarray.Uint8Array, counter: Double, options: HOTPOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(otp.asInstanceOf[js.Any], key.asInstanceOf[js.Any], counter.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait HOTP extends StObject
  
  trait HOTPOptions extends StObject {
    
    var algorithm: js.UndefOr[String] = js.undefined
    
    var digits: js.UndefOr[Double] = js.undefined
  }
  object HOTPOptions {
    
    inline def apply(): HOTPOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HOTPOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HOTPOptions] (val x: Self) extends AnyVal {
      
      inline def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
      
      inline def setDigits(value: Double): Self = StObject.set(x, "digits", value.asInstanceOf[js.Any])
      
      inline def setDigitsUndefined: Self = StObject.set(x, "digits", js.undefined)
    }
  }
}
