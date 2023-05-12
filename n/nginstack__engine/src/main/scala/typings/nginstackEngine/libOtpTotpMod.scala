package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libOtpTotpMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/otp/TOTP", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with TOTP
  @JSImport("@nginstack/engine/lib/otp/TOTP", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatKeyUri(key: String, userName: String, issuer: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatKeyUri")(key.asInstanceOf[js.Any], userName.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatKeyUri(key: String, userName: String, issuer: String, options: TOTPOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatKeyUri")(key.asInstanceOf[js.Any], userName.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatKeyUri(key: js.typedarray.ArrayBuffer, userName: String, issuer: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatKeyUri")(key.asInstanceOf[js.Any], userName.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatKeyUri(key: js.typedarray.ArrayBuffer, userName: String, issuer: String, options: TOTPOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatKeyUri")(key.asInstanceOf[js.Any], userName.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatKeyUri(key: js.typedarray.Uint8Array, userName: String, issuer: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatKeyUri")(key.asInstanceOf[js.Any], userName.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatKeyUri(key: js.typedarray.Uint8Array, userName: String, issuer: String, options: TOTPOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatKeyUri")(key.asInstanceOf[js.Any], userName.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def generate(key: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(key.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def generate(key: String, options: TOTPOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def generate(key: js.typedarray.ArrayBuffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(key.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def generate(key: js.typedarray.ArrayBuffer, options: TOTPOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def generate(key: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(key.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def generate(key: js.typedarray.Uint8Array, options: TOTPOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def verify(otp: String, key: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(otp.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def verify(otp: String, key: String, options: TOTPOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(otp.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def verify(otp: String, key: js.typedarray.ArrayBuffer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(otp.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def verify(otp: String, key: js.typedarray.ArrayBuffer, options: TOTPOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(otp.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def verify(otp: String, key: js.typedarray.Uint8Array): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(otp.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def verify(otp: String, key: js.typedarray.Uint8Array, options: TOTPOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(otp.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait TOTP extends StObject
  
  trait TOTPOptions extends StObject {
    
    var algorithm: js.UndefOr[String] = js.undefined
    
    var currentTimestamp: js.UndefOr[Double] = js.undefined
    
    var digits: js.UndefOr[Double] = js.undefined
    
    var timeStep: js.UndefOr[Double] = js.undefined
    
    var tolerance: js.UndefOr[Double] = js.undefined
  }
  object TOTPOptions {
    
    inline def apply(): TOTPOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TOTPOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TOTPOptions] (val x: Self) extends AnyVal {
      
      inline def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
      
      inline def setCurrentTimestamp(value: Double): Self = StObject.set(x, "currentTimestamp", value.asInstanceOf[js.Any])
      
      inline def setCurrentTimestampUndefined: Self = StObject.set(x, "currentTimestamp", js.undefined)
      
      inline def setDigits(value: Double): Self = StObject.set(x, "digits", value.asInstanceOf[js.Any])
      
      inline def setDigitsUndefined: Self = StObject.set(x, "digits", js.undefined)
      
      inline def setTimeStep(value: Double): Self = StObject.set(x, "timeStep", value.asInstanceOf[js.Any])
      
      inline def setTimeStepUndefined: Self = StObject.set(x, "timeStep", js.undefined)
      
      inline def setTolerance(value: Double): Self = StObject.set(x, "tolerance", value.asInstanceOf[js.Any])
      
      inline def setToleranceUndefined: Self = StObject.set(x, "tolerance", js.undefined)
    }
  }
}
