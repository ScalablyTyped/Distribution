package typings.notp

import typings.node.Buffer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object hotp {
    
    /**
      * Generate a counter based One Time Password.
      * @param key Key for the one time password. This should be unique and secret
      * for every user as this is the seed that is used to calculate the HMAC.
      * @param opt HOTP generate options.
      */
    @JSImport("notp", "hotp.gen")
    @js.native
    def gen(key: String): String = js.native
    @JSImport("notp", "hotp.gen")
    @js.native
    def gen(key: String, opt: HOTPGenOpt): String = js.native
    @JSImport("notp", "hotp.gen")
    @js.native
    def gen(key: Buffer): String = js.native
    @JSImport("notp", "hotp.gen")
    @js.native
    def gen(key: Buffer, opt: HOTPGenOpt): String = js.native
    @JSImport("notp", "hotp.gen")
    @js.native
    def gen(key: Uint8Array): String = js.native
    @JSImport("notp", "hotp.gen")
    @js.native
    def gen(key: Uint8Array, opt: HOTPGenOpt): String = js.native
    
    /**
      * Check a One Time Password based on a counter.
      * @param token Passcode to validate.
      * @param key Key for the one time password. This should be unique and secret for
      * every user as it is the seed used to calculate the HMAC.
      * @param opt HOTP verify options.
      */
    @JSImport("notp", "hotp.verify")
    @js.native
    def verify(token: String, key: String): VerifyResult | Null = js.native
    @JSImport("notp", "hotp.verify")
    @js.native
    def verify(token: String, key: String, opt: HOTPVerifyOpt): VerifyResult | Null = js.native
    @JSImport("notp", "hotp.verify")
    @js.native
    def verify(token: String, key: Buffer): VerifyResult | Null = js.native
    @JSImport("notp", "hotp.verify")
    @js.native
    def verify(token: String, key: Buffer, opt: HOTPVerifyOpt): VerifyResult | Null = js.native
    @JSImport("notp", "hotp.verify")
    @js.native
    def verify(token: String, key: Uint8Array): VerifyResult | Null = js.native
    @JSImport("notp", "hotp.verify")
    @js.native
    def verify(token: String, key: Uint8Array, opt: HOTPVerifyOpt): VerifyResult | Null = js.native
  }
  
  object totp {
    
    /**
      * Generate a time based One Time Password.
      * @param key Key for the one time password. This should be unique and secret
      * for every user as it is the seed used to calculate the HMAC.
      * @param opt TOTP Generate options.
      *
      */
    @JSImport("notp", "totp.gen")
    @js.native
    def gen(key: String): String = js.native
    @JSImport("notp", "totp.gen")
    @js.native
    def gen(key: String, opt: TOTPGenOpt): String = js.native
    @JSImport("notp", "totp.gen")
    @js.native
    def gen(key: Buffer): String = js.native
    @JSImport("notp", "totp.gen")
    @js.native
    def gen(key: Buffer, opt: TOTPGenOpt): String = js.native
    @JSImport("notp", "totp.gen")
    @js.native
    def gen(key: Uint8Array): String = js.native
    @JSImport("notp", "totp.gen")
    @js.native
    def gen(key: Uint8Array, opt: TOTPGenOpt): String = js.native
    
    /**
      * Check a One Time Password based on a timer.
      * @param token Passcode to validate.
      * @param key Key for the one time password. This should be unique and secret
      * @param opt TOTP verify options.
      *
      */
    @JSImport("notp", "totp.verify")
    @js.native
    def verify(token: String, key: String): VerifyResult | Null = js.native
    @JSImport("notp", "totp.verify")
    @js.native
    def verify(token: String, key: String, opt: TOTPVerifyOpt): VerifyResult | Null = js.native
    @JSImport("notp", "totp.verify")
    @js.native
    def verify(token: String, key: Buffer): VerifyResult | Null = js.native
    @JSImport("notp", "totp.verify")
    @js.native
    def verify(token: String, key: Buffer, opt: TOTPVerifyOpt): VerifyResult | Null = js.native
    @JSImport("notp", "totp.verify")
    @js.native
    def verify(token: String, key: Uint8Array): VerifyResult | Null = js.native
    @JSImport("notp", "totp.verify")
    @js.native
    def verify(token: String, key: Uint8Array, opt: TOTPVerifyOpt): VerifyResult | Null = js.native
  }
  
  @js.native
  trait HOTPGenOpt extends StObject {
    
    /**
      * Counter value used in generating the token. This should be stored by the
      * application, must be user specific, and be incremented for each request.
      */
    var counter: js.UndefOr[Double] = js.native
  }
  object HOTPGenOpt {
    
    @scala.inline
    def apply(): HOTPGenOpt = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HOTPGenOpt]
    }
    
    @scala.inline
    implicit class HOTPGenOptMutableBuilder[Self <: HOTPGenOpt] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCounter(value: Double): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCounterUndefined: Self = StObject.set(x, "counter", js.undefined)
    }
  }
  
  @js.native
  trait HOTPVerifyOpt extends HOTPGenOpt {
    
    /**
      * The allowable margin for the counter. The function will check 'W' codes in
      * the future against the provided passcode. Note, it is the calling
      * applications responsibility to keep track of 'W' and increment it for each
      * password check, and also to adjust it accordingly in the case where the
      * client and server become out of sync (second argument returns non zero).
      *
      * E.g. if W = 100, and C = 5, this function will check the passcode against
      * all One Time Passcodes between 5 and 105.
      *
      * Default - 50
      */
    var window: js.UndefOr[Double] = js.native
  }
  object HOTPVerifyOpt {
    
    @scala.inline
    def apply(): HOTPVerifyOpt = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HOTPVerifyOpt]
    }
    
    @scala.inline
    implicit class HOTPVerifyOptMutableBuilder[Self <: HOTPVerifyOpt] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWindow(value: Double): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
    }
  }
  
  @js.native
  trait TOTPGenOpt extends StObject {
    
    /**
      * UNIX Epoch time (overwrite time in test environment, NODE_ENV=test)
      */
    var _t: js.UndefOr[Double] = js.native
    
    /**
      * The time step of the counter. This must be the same for every request and is
      * used to calculat C.
      *
      * Default - 30
      */
    var time: js.UndefOr[Double] = js.native
  }
  object TOTPGenOpt {
    
    @scala.inline
    def apply(): TOTPGenOpt = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TOTPGenOpt]
    }
    
    @scala.inline
    implicit class TOTPGenOptMutableBuilder[Self <: TOTPGenOpt] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
      
      @scala.inline
      def set_t(value: Double): Self = StObject.set(x, "_t", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_tUndefined: Self = StObject.set(x, "_t", js.undefined)
    }
  }
  
  @js.native
  trait TOTPVerifyOpt extends TOTPGenOpt {
    
    /**
      * The allowable margin for the counter. The function will check 'W' codes in
      * the future against the provided passcode. Note, it is the calling
      * applications responsibility to keep track of 'W' and increment it for each
      * password check, and also to adjust it accordingly in the case where the
      * client and server become out of sync (second argument returns non zero).
      *
      * E.g. if W = 100, and C = 5, this function will check the passcode against
      * all One Time Passcodes between 5 and 105.
      *
      * Default - 50
      */
    var window: js.UndefOr[Double] = js.native
  }
  object TOTPVerifyOpt {
    
    @scala.inline
    def apply(): TOTPVerifyOpt = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TOTPVerifyOpt]
    }
    
    @scala.inline
    implicit class TOTPVerifyOptMutableBuilder[Self <: TOTPVerifyOpt] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWindow(value: Double): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
    }
  }
  
  @js.native
  trait VerifyResult extends StObject {
    
    /**
      * Time step difference between the client and the server.
      */
    var delta: Double = js.native
  }
  object VerifyResult {
    
    @scala.inline
    def apply(delta: Double): VerifyResult = {
      val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerifyResult]
    }
    
    @scala.inline
    implicit class VerifyResultMutableBuilder[Self <: VerifyResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    }
  }
}
