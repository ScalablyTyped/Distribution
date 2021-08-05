package typings.meteorAccountsPhone

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Accounts {
    
    @JSGlobal("Accounts")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createUserWithPhone(options: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createUserWithPhone")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def createUserWithPhone(options: js.Object, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createUserWithPhone")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def isPhoneVerified(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPhoneVerified")().asInstanceOf[Boolean]
    
    inline def onPhoneVerification(func: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onPhoneVerification")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    object options {
      
      @JSGlobal("Accounts._options")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Accounts._options.adminPhoneNumbers")
      @js.native
      def adminPhoneNumbers: js.UndefOr[js.Array[String]] = js.native
      inline def adminPhoneNumbers_=(x: js.UndefOr[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("adminPhoneNumbers")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Accounts._options.forbidClientAccountCreation")
      @js.native
      def forbidClientAccountCreation: js.UndefOr[Boolean] = js.native
      inline def forbidClientAccountCreation_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forbidClientAccountCreation")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Accounts._options.phoneVerificationMasterCode")
      @js.native
      def phoneVerificationMasterCode: js.UndefOr[js.Array[String]] = js.native
      inline def phoneVerificationMasterCode_=(x: js.UndefOr[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("phoneVerificationMasterCode")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Accounts._options.sendPhoneVerificationCodeOnCreation")
      @js.native
      def sendPhoneVerificationCodeOnCreation: js.UndefOr[Boolean] = js.native
      inline def sendPhoneVerificationCodeOnCreation_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sendPhoneVerificationCodeOnCreation")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Accounts._options.verificationCodeLength")
      @js.native
      def verificationCodeLength: js.UndefOr[Double] = js.native
      inline def verificationCodeLength_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("verificationCodeLength")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Accounts._options.verificationMaxRetries")
      @js.native
      def verificationMaxRetries: js.UndefOr[Double] = js.native
      inline def verificationMaxRetries_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("verificationMaxRetries")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Accounts._options.verificationRetriesWaitTime")
      @js.native
      def verificationRetriesWaitTime: js.UndefOr[Double] = js.native
      inline def verificationRetriesWaitTime_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("verificationRetriesWaitTime")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Accounts._options.verificationWaitTime")
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
  
  object Meteor {
    
    @JSGlobal("Meteor")
    @js.native
    val ^ : js.Any = js.native
    
    inline def loginWithPhoneAndPassword(selector: String, password: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithPhoneAndPassword")(selector.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loginWithPhoneAndPassword(selector: String, password: String, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithPhoneAndPassword")(selector.asInstanceOf[js.Any], password.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loginWithPhoneAndPassword(selector: js.Object, password: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithPhoneAndPassword")(selector.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loginWithPhoneAndPassword(selector: js.Object, password: String, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithPhoneAndPassword")(selector.asInstanceOf[js.Any], password.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  object SMS {
    
    @JSGlobal("SMS")
    @js.native
    val ^ : js.Any = js.native
    
    object phoneTemplate {
      
      @JSGlobal("SMS.phoneTemplate")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("SMS.phoneTemplate.from")
      @js.native
      def from: String = js.native
      inline def from_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("from")(x.asInstanceOf[js.Any])
      
      @JSGlobal("SMS.phoneTemplate.text")
      @js.native
      def text: js.Function = js.native
      inline def text_=(x: js.Function): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("text")(x.asInstanceOf[js.Any])
    }
    
    inline def send(options: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("send")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def send(options: js.Object, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    object twilio {
      
      @JSGlobal("SMS.twilio")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("SMS.twilio.ACCOUNT_SID")
      @js.native
      def ACCOUNT_SID: js.UndefOr[String] = js.native
      inline def ACCOUNT_SID_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ACCOUNT_SID")(x.asInstanceOf[js.Any])
      
      @JSGlobal("SMS.twilio.AUTH_TOKEN")
      @js.native
      def AUTH_TOKEN: js.UndefOr[String] = js.native
      inline def AUTH_TOKEN_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUTH_TOKEN")(x.asInstanceOf[js.Any])
      
      @JSGlobal("SMS.twilio.FROM")
      @js.native
      def FROM: js.UndefOr[String] = js.native
      inline def FROM_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FROM")(x.asInstanceOf[js.Any])
    }
  }
}
