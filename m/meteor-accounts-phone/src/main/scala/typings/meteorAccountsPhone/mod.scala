package typings.meteorAccountsPhone

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object Accounts {
    
    @JSImport("meteor/accounts-base", "Accounts")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createUserWithPhone(options: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createUserWithPhone")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def createUserWithPhone(options: js.Object, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createUserWithPhone")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def isPhoneVerified(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPhoneVerified")().asInstanceOf[Boolean]
    
    inline def onPhoneVerification(func: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onPhoneVerification")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    object options {
      
      @JSImport("meteor/accounts-base", "Accounts._options")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("meteor/accounts-base", "Accounts._options.adminPhoneNumbers")
      @js.native
      def adminPhoneNumbers: js.UndefOr[js.Array[String]] = js.native
      inline def adminPhoneNumbers_=(x: js.UndefOr[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("adminPhoneNumbers")(x.asInstanceOf[js.Any])
      
      @JSImport("meteor/accounts-base", "Accounts._options.forbidClientAccountCreation")
      @js.native
      def forbidClientAccountCreation: js.UndefOr[Boolean] = js.native
      inline def forbidClientAccountCreation_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forbidClientAccountCreation")(x.asInstanceOf[js.Any])
      
      @JSImport("meteor/accounts-base", "Accounts._options.phoneVerificationMasterCode")
      @js.native
      def phoneVerificationMasterCode: js.UndefOr[js.Array[String]] = js.native
      inline def phoneVerificationMasterCode_=(x: js.UndefOr[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("phoneVerificationMasterCode")(x.asInstanceOf[js.Any])
      
      @JSImport("meteor/accounts-base", "Accounts._options.sendPhoneVerificationCodeOnCreation")
      @js.native
      def sendPhoneVerificationCodeOnCreation: js.UndefOr[Boolean] = js.native
      inline def sendPhoneVerificationCodeOnCreation_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sendPhoneVerificationCodeOnCreation")(x.asInstanceOf[js.Any])
      
      @JSImport("meteor/accounts-base", "Accounts._options.verificationCodeLength")
      @js.native
      def verificationCodeLength: js.UndefOr[Double] = js.native
      inline def verificationCodeLength_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("verificationCodeLength")(x.asInstanceOf[js.Any])
      
      @JSImport("meteor/accounts-base", "Accounts._options.verificationMaxRetries")
      @js.native
      def verificationMaxRetries: js.UndefOr[Double] = js.native
      inline def verificationMaxRetries_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("verificationMaxRetries")(x.asInstanceOf[js.Any])
      
      @JSImport("meteor/accounts-base", "Accounts._options.verificationRetriesWaitTime")
      @js.native
      def verificationRetriesWaitTime: js.UndefOr[Double] = js.native
      inline def verificationRetriesWaitTime_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("verificationRetriesWaitTime")(x.asInstanceOf[js.Any])
      
      @JSImport("meteor/accounts-base", "Accounts._options.verificationWaitTime")
      @js.native
      def verificationWaitTime: js.UndefOr[Double] = js.native
      inline def verificationWaitTime_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("verificationWaitTime")(x.asInstanceOf[js.Any])
    }
    
    inline def requestPhoneVerification(phone: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("requestPhoneVerification")(phone.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def requestPhoneVerification(phone: String, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("requestPhoneVerification")(phone.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def verifyPhone(phone: String, code: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyPhone")(phone.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def verifyPhone(phone: String, code: String, newPassword: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyPhone")(phone.asInstanceOf[js.Any], code.asInstanceOf[js.Any], newPassword.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def verifyPhone(phone: String, code: String, newPassword: String, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyPhone")(phone.asInstanceOf[js.Any], code.asInstanceOf[js.Any], newPassword.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def verifyPhone(phone: String, code: String, newPassword: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyPhone")(phone.asInstanceOf[js.Any], code.asInstanceOf[js.Any], newPassword.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def verifyPhone(phone: String, code: String, newPassword: js.Function, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyPhone")(phone.asInstanceOf[js.Any], code.asInstanceOf[js.Any], newPassword.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def verifyPhone(phone: String, code: String, newPassword: Unit, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyPhone")(phone.asInstanceOf[js.Any], code.asInstanceOf[js.Any], newPassword.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
