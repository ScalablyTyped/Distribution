package typings.meteorAccountsPhone

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Accounts {
    
    @JSGlobal("Accounts.createUserWithPhone")
    @js.native
    def createUserWithPhone(options: js.Object): Unit = js.native
    @JSGlobal("Accounts.createUserWithPhone")
    @js.native
    def createUserWithPhone(options: js.Object, callback: js.Function): Unit = js.native
    
    @JSGlobal("Accounts.isPhoneVerified")
    @js.native
    def isPhoneVerified(): Boolean = js.native
    
    @JSGlobal("Accounts.onPhoneVerification")
    @js.native
    def onPhoneVerification(func: js.Function): Unit = js.native
    
    object options {
      
      @JSGlobal("Accounts._options")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Accounts._options.adminPhoneNumbers")
      @js.native
      def adminPhoneNumbers: js.UndefOr[js.Array[String]] = js.native
      @scala.inline
      def adminPhoneNumbers_=(x: js.UndefOr[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("adminPhoneNumbers")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Accounts._options.forbidClientAccountCreation")
      @js.native
      def forbidClientAccountCreation: js.UndefOr[Boolean] = js.native
      @scala.inline
      def forbidClientAccountCreation_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forbidClientAccountCreation")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Accounts._options.phoneVerificationMasterCode")
      @js.native
      def phoneVerificationMasterCode: js.UndefOr[js.Array[String]] = js.native
      @scala.inline
      def phoneVerificationMasterCode_=(x: js.UndefOr[js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("phoneVerificationMasterCode")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Accounts._options.sendPhoneVerificationCodeOnCreation")
      @js.native
      def sendPhoneVerificationCodeOnCreation: js.UndefOr[Boolean] = js.native
      @scala.inline
      def sendPhoneVerificationCodeOnCreation_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sendPhoneVerificationCodeOnCreation")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Accounts._options.verificationCodeLength")
      @js.native
      def verificationCodeLength: js.UndefOr[Double] = js.native
      @scala.inline
      def verificationCodeLength_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("verificationCodeLength")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Accounts._options.verificationMaxRetries")
      @js.native
      def verificationMaxRetries: js.UndefOr[Double] = js.native
      @scala.inline
      def verificationMaxRetries_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("verificationMaxRetries")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Accounts._options.verificationRetriesWaitTime")
      @js.native
      def verificationRetriesWaitTime: js.UndefOr[Double] = js.native
      @scala.inline
      def verificationRetriesWaitTime_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("verificationRetriesWaitTime")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Accounts._options.verificationWaitTime")
      @js.native
      def verificationWaitTime: js.UndefOr[Double] = js.native
      @scala.inline
      def verificationWaitTime_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("verificationWaitTime")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("Accounts.requestPhoneVerification")
    @js.native
    def requestPhoneVerification(phone: String): Unit = js.native
    @JSGlobal("Accounts.requestPhoneVerification")
    @js.native
    def requestPhoneVerification(phone: String, callback: js.Function): Unit = js.native
    
    @JSGlobal("Accounts.verifyPhone")
    @js.native
    def verifyPhone(phone: String, code: String): Unit = js.native
    @JSGlobal("Accounts.verifyPhone")
    @js.native
    def verifyPhone(phone: String, code: String, newPassword: js.UndefOr[scala.Nothing], callback: js.Function): Unit = js.native
    @JSGlobal("Accounts.verifyPhone")
    @js.native
    def verifyPhone(phone: String, code: String, newPassword: String): Unit = js.native
    @JSGlobal("Accounts.verifyPhone")
    @js.native
    def verifyPhone(phone: String, code: String, newPassword: String, callback: js.Function): Unit = js.native
    @JSGlobal("Accounts.verifyPhone")
    @js.native
    def verifyPhone(phone: String, code: String, newPassword: js.Function): Unit = js.native
    @JSGlobal("Accounts.verifyPhone")
    @js.native
    def verifyPhone(phone: String, code: String, newPassword: js.Function, callback: js.Function): Unit = js.native
  }
  
  object Meteor {
    
    @JSGlobal("Meteor.loginWithPhoneAndPassword")
    @js.native
    def loginWithPhoneAndPassword(selector: String, password: String): Unit = js.native
    @JSGlobal("Meteor.loginWithPhoneAndPassword")
    @js.native
    def loginWithPhoneAndPassword(selector: String, password: String, callback: js.Function): Unit = js.native
    @JSGlobal("Meteor.loginWithPhoneAndPassword")
    @js.native
    def loginWithPhoneAndPassword(selector: js.Object, password: String): Unit = js.native
    @JSGlobal("Meteor.loginWithPhoneAndPassword")
    @js.native
    def loginWithPhoneAndPassword(selector: js.Object, password: String, callback: js.Function): Unit = js.native
  }
  
  object SMS {
    
    object phoneTemplate {
      
      @JSGlobal("SMS.phoneTemplate")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("SMS.phoneTemplate.from")
      @js.native
      def from: String = js.native
      @scala.inline
      def from_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("from")(x.asInstanceOf[js.Any])
      
      @JSGlobal("SMS.phoneTemplate.text")
      @js.native
      def text: js.Function = js.native
      @scala.inline
      def text_=(x: js.Function): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("text")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("SMS.send")
    @js.native
    def send(options: js.Object): Unit = js.native
    @JSGlobal("SMS.send")
    @js.native
    def send(options: js.Object, callback: js.Function): Unit = js.native
    
    object twilio {
      
      @JSGlobal("SMS.twilio")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("SMS.twilio.ACCOUNT_SID")
      @js.native
      def ACCOUNT_SID: js.UndefOr[String] = js.native
      @scala.inline
      def ACCOUNT_SID_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ACCOUNT_SID")(x.asInstanceOf[js.Any])
      
      @JSGlobal("SMS.twilio.AUTH_TOKEN")
      @js.native
      def AUTH_TOKEN: js.UndefOr[String] = js.native
      @scala.inline
      def AUTH_TOKEN_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUTH_TOKEN")(x.asInstanceOf[js.Any])
      
      @JSGlobal("SMS.twilio.FROM")
      @js.native
      def FROM: js.UndefOr[String] = js.native
      @scala.inline
      def FROM_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FROM")(x.asInstanceOf[js.Any])
    }
  }
}
