package typings.mpesaNode

import typings.axios.mod.AxiosPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mpesa-node", JSImport.Namespace)
  @js.native
  class ^ protected () extends Mpesa {
    def this(config: ConfigOptions) = this()
  }
  
  @js.native
  trait ConfigOptions extends StObject {
    
    var certPath: js.UndefOr[String] = js.native
    
    var consumerKey: String = js.native
    
    var consumerSecret: String = js.native
    
    var enviroment: js.UndefOr[String] = js.native
    
    var initiatorName: js.UndefOr[String] = js.native
    
    var lipaNaMpesaShortCode: js.UndefOr[String] = js.native
    
    var lipaNaMpesaShortPass: js.UndefOr[String] = js.native
    
    var securityCredential: js.UndefOr[String] = js.native
    
    var shortCode: js.UndefOr[String] = js.native
  }
  object ConfigOptions {
    
    @scala.inline
    def apply(consumerKey: String, consumerSecret: String): ConfigOptions = {
      val __obj = js.Dynamic.literal(consumerKey = consumerKey.asInstanceOf[js.Any], consumerSecret = consumerSecret.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit class ConfigOptionsMutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCertPath(value: String): Self = StObject.set(x, "certPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertPathUndefined: Self = StObject.set(x, "certPath", js.undefined)
      
      @scala.inline
      def setConsumerKey(value: String): Self = StObject.set(x, "consumerKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsumerSecret(value: String): Self = StObject.set(x, "consumerSecret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnviroment(value: String): Self = StObject.set(x, "enviroment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnviromentUndefined: Self = StObject.set(x, "enviroment", js.undefined)
      
      @scala.inline
      def setInitiatorName(value: String): Self = StObject.set(x, "initiatorName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitiatorNameUndefined: Self = StObject.set(x, "initiatorName", js.undefined)
      
      @scala.inline
      def setLipaNaMpesaShortCode(value: String): Self = StObject.set(x, "lipaNaMpesaShortCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLipaNaMpesaShortCodeUndefined: Self = StObject.set(x, "lipaNaMpesaShortCode", js.undefined)
      
      @scala.inline
      def setLipaNaMpesaShortPass(value: String): Self = StObject.set(x, "lipaNaMpesaShortPass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLipaNaMpesaShortPassUndefined: Self = StObject.set(x, "lipaNaMpesaShortPass", js.undefined)
      
      @scala.inline
      def setSecurityCredential(value: String): Self = StObject.set(x, "securityCredential", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityCredentialUndefined: Self = StObject.set(x, "securityCredential", js.undefined)
      
      @scala.inline
      def setShortCode(value: String): Self = StObject.set(x, "shortCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortCodeUndefined: Self = StObject.set(x, "shortCode", js.undefined)
    }
  }
  
  @js.native
  trait Mpesa extends StObject {
    
    def accountBalance(shortCode: String, idType: String, queueUrl: String, resultUrl: String): AxiosPromise[_] = js.native
    def accountBalance(
      shortCode: String,
      idType: String,
      queueUrl: String,
      resultUrl: String,
      remarks: js.UndefOr[scala.Nothing],
      initiator: js.UndefOr[scala.Nothing],
      commandId: String
    ): AxiosPromise[_] = js.native
    def accountBalance(
      shortCode: String,
      idType: String,
      queueUrl: String,
      resultUrl: String,
      remarks: js.UndefOr[scala.Nothing],
      initiator: String
    ): AxiosPromise[_] = js.native
    def accountBalance(
      shortCode: String,
      idType: String,
      queueUrl: String,
      resultUrl: String,
      remarks: js.UndefOr[scala.Nothing],
      initiator: String,
      commandId: String
    ): AxiosPromise[_] = js.native
    def accountBalance(shortCode: String, idType: String, queueUrl: String, resultUrl: String, remarks: String): AxiosPromise[_] = js.native
    def accountBalance(
      shortCode: String,
      idType: String,
      queueUrl: String,
      resultUrl: String,
      remarks: String,
      initiator: js.UndefOr[scala.Nothing],
      commandId: String
    ): AxiosPromise[_] = js.native
    def accountBalance(
      shortCode: String,
      idType: String,
      queueUrl: String,
      resultUrl: String,
      remarks: String,
      initiator: String
    ): AxiosPromise[_] = js.native
    def accountBalance(
      shortCode: String,
      idType: String,
      queueUrl: String,
      resultUrl: String,
      remarks: String,
      initiator: String,
      commandId: String
    ): AxiosPromise[_] = js.native
    
    def b2b(
      senderParty: String,
      receiverParty: String,
      amount: Double,
      queueUrl: String,
      resultUrl: String,
      senderType: js.UndefOr[Double],
      receiverType: js.UndefOr[Double],
      initiator: js.UndefOr[String],
      commandId: js.UndefOr[String],
      accountRef: js.UndefOr[String],
      remarks: js.UndefOr[String]
    ): AxiosPromise[_] = js.native
    
    def b2c(senderParty: String, receiverParty: String, amount: Double, queueUrl: String, resultUrl: String): AxiosPromise[_] = js.native
    def b2c(
      senderParty: String,
      receiverParty: String,
      amount: Double,
      queueUrl: String,
      resultUrl: String,
      commandId: js.UndefOr[scala.Nothing],
      initiatorName: js.UndefOr[scala.Nothing],
      remarks: js.UndefOr[scala.Nothing],
      occasion: String
    ): AxiosPromise[_] = js.native
    def b2c(
      senderParty: String,
      receiverParty: String,
      amount: Double,
      queueUrl: String,
      resultUrl: String,
      commandId: js.UndefOr[scala.Nothing],
      initiatorName: js.UndefOr[scala.Nothing],
      remarks: String
    ): AxiosPromise[_] = js.native
    def b2c(
      senderParty: String,
      receiverParty: String,
      amount: Double,
      queueUrl: String,
      resultUrl: String,
      commandId: js.UndefOr[scala.Nothing],
      initiatorName: js.UndefOr[scala.Nothing],
      remarks: String,
      occasion: String
    ): AxiosPromise[_] = js.native
    def b2c(
      senderParty: String,
      receiverParty: String,
      amount: Double,
      queueUrl: String,
      resultUrl: String,
      commandId: js.UndefOr[scala.Nothing],
      initiatorName: String
    ): AxiosPromise[_] = js.native
    def b2c(
      senderParty: String,
      receiverParty: String,
      amount: Double,
      queueUrl: String,
      resultUrl: String,
      commandId: js.UndefOr[scala.Nothing],
      initiatorName: String,
      remarks: js.UndefOr[scala.Nothing],
      occasion: String
    ): AxiosPromise[_] = js.native
    def b2c(
      senderParty: String,
      receiverParty: String,
      amount: Double,
      queueUrl: String,
      resultUrl: String,
      commandId: js.UndefOr[scala.Nothing],
      initiatorName: String,
      remarks: String
    ): AxiosPromise[_] = js.native
    def b2c(
      senderParty: String,
      receiverParty: String,
      amount: Double,
      queueUrl: String,
      resultUrl: String,
      commandId: js.UndefOr[scala.Nothing],
      initiatorName: String,
      remarks: String,
      occasion: String
    ): AxiosPromise[_] = js.native
    def b2c(
      senderParty: String,
      receiverParty: String,
      amount: Double,
      queueUrl: String,
      resultUrl: String,
      commandId: String
    ): AxiosPromise[_] = js.native
    def b2c(
      senderParty: String,
      receiverParty: String,
      amount: Double,
      queueUrl: String,
      resultUrl: String,
      commandId: String,
      initiatorName: js.UndefOr[scala.Nothing],
      remarks: js.UndefOr[scala.Nothing],
      occasion: String
    ): AxiosPromise[_] = js.native
    def b2c(
      senderParty: String,
      receiverParty: String,
      amount: Double,
      queueUrl: String,
      resultUrl: String,
      commandId: String,
      initiatorName: js.UndefOr[scala.Nothing],
      remarks: String
    ): AxiosPromise[_] = js.native
    def b2c(
      senderParty: String,
      receiverParty: String,
      amount: Double,
      queueUrl: String,
      resultUrl: String,
      commandId: String,
      initiatorName: js.UndefOr[scala.Nothing],
      remarks: String,
      occasion: String
    ): AxiosPromise[_] = js.native
    def b2c(
      senderParty: String,
      receiverParty: String,
      amount: Double,
      queueUrl: String,
      resultUrl: String,
      commandId: String,
      initiatorName: String
    ): AxiosPromise[_] = js.native
    def b2c(
      senderParty: String,
      receiverParty: String,
      amount: Double,
      queueUrl: String,
      resultUrl: String,
      commandId: String,
      initiatorName: String,
      remarks: js.UndefOr[scala.Nothing],
      occasion: String
    ): AxiosPromise[_] = js.native
    def b2c(
      senderParty: String,
      receiverParty: String,
      amount: Double,
      queueUrl: String,
      resultUrl: String,
      commandId: String,
      initiatorName: String,
      remarks: String
    ): AxiosPromise[_] = js.native
    def b2c(
      senderParty: String,
      receiverParty: String,
      amount: Double,
      queueUrl: String,
      resultUrl: String,
      commandId: String,
      initiatorName: String,
      remarks: String,
      occasion: String
    ): AxiosPromise[_] = js.native
    
    def c2bRegister(confirmationUrl: String, validationUrl: String): AxiosPromise[_] = js.native
    def c2bRegister(
      confirmationUrl: String,
      validationUrl: String,
      shortCode: js.UndefOr[scala.Nothing],
      responseType: String
    ): AxiosPromise[_] = js.native
    def c2bRegister(confirmationUrl: String, validationUrl: String, shortCode: String): AxiosPromise[_] = js.native
    def c2bRegister(confirmationUrl: String, validationUrl: String, shortCode: String, responseType: String): AxiosPromise[_] = js.native
    
    def c2bSimulate(msisdn: String, amount: Double, billRefNumber: String): AxiosPromise[_] = js.native
    def c2bSimulate(
      msisdn: String,
      amount: Double,
      billRefNumber: String,
      commandId: js.UndefOr[scala.Nothing],
      shortCode: String
    ): AxiosPromise[_] = js.native
    def c2bSimulate(msisdn: String, amount: Double, billRefNumber: String, commandId: String): AxiosPromise[_] = js.native
    def c2bSimulate(msisdn: String, amount: Double, billRefNumber: String, commandId: String, shortCode: String): AxiosPromise[_] = js.native
    
    def lipaNaMpesaOnline(senderMsisdn: String, amount: Double, callbackUrl: String, accountRef: String): AxiosPromise[_] = js.native
    def lipaNaMpesaOnline(
      senderMsisdn: String,
      amount: Double,
      callbackUrl: String,
      accountRef: String,
      transactionDesc: js.UndefOr[scala.Nothing],
      transactionType: js.UndefOr[scala.Nothing],
      shortCode: js.UndefOr[scala.Nothing],
      passKey: String
    ): AxiosPromise[_] = js.native
    def lipaNaMpesaOnline(
      senderMsisdn: String,
      amount: Double,
      callbackUrl: String,
      accountRef: String,
      transactionDesc: js.UndefOr[scala.Nothing],
      transactionType: js.UndefOr[scala.Nothing],
      shortCode: String
    ): AxiosPromise[_] = js.native
    def lipaNaMpesaOnline(
      senderMsisdn: String,
      amount: Double,
      callbackUrl: String,
      accountRef: String,
      transactionDesc: js.UndefOr[scala.Nothing],
      transactionType: js.UndefOr[scala.Nothing],
      shortCode: String,
      passKey: String
    ): AxiosPromise[_] = js.native
    def lipaNaMpesaOnline(
      senderMsisdn: String,
      amount: Double,
      callbackUrl: String,
      accountRef: String,
      transactionDesc: js.UndefOr[scala.Nothing],
      transactionType: String
    ): AxiosPromise[_] = js.native
    def lipaNaMpesaOnline(
      senderMsisdn: String,
      amount: Double,
      callbackUrl: String,
      accountRef: String,
      transactionDesc: js.UndefOr[scala.Nothing],
      transactionType: String,
      shortCode: js.UndefOr[scala.Nothing],
      passKey: String
    ): AxiosPromise[_] = js.native
    def lipaNaMpesaOnline(
      senderMsisdn: String,
      amount: Double,
      callbackUrl: String,
      accountRef: String,
      transactionDesc: js.UndefOr[scala.Nothing],
      transactionType: String,
      shortCode: String
    ): AxiosPromise[_] = js.native
    def lipaNaMpesaOnline(
      senderMsisdn: String,
      amount: Double,
      callbackUrl: String,
      accountRef: String,
      transactionDesc: js.UndefOr[scala.Nothing],
      transactionType: String,
      shortCode: String,
      passKey: String
    ): AxiosPromise[_] = js.native
    def lipaNaMpesaOnline(
      senderMsisdn: String,
      amount: Double,
      callbackUrl: String,
      accountRef: String,
      transactionDesc: String
    ): AxiosPromise[_] = js.native
    def lipaNaMpesaOnline(
      senderMsisdn: String,
      amount: Double,
      callbackUrl: String,
      accountRef: String,
      transactionDesc: String,
      transactionType: js.UndefOr[scala.Nothing],
      shortCode: js.UndefOr[scala.Nothing],
      passKey: String
    ): AxiosPromise[_] = js.native
    def lipaNaMpesaOnline(
      senderMsisdn: String,
      amount: Double,
      callbackUrl: String,
      accountRef: String,
      transactionDesc: String,
      transactionType: js.UndefOr[scala.Nothing],
      shortCode: String
    ): AxiosPromise[_] = js.native
    def lipaNaMpesaOnline(
      senderMsisdn: String,
      amount: Double,
      callbackUrl: String,
      accountRef: String,
      transactionDesc: String,
      transactionType: js.UndefOr[scala.Nothing],
      shortCode: String,
      passKey: String
    ): AxiosPromise[_] = js.native
    def lipaNaMpesaOnline(
      senderMsisdn: String,
      amount: Double,
      callbackUrl: String,
      accountRef: String,
      transactionDesc: String,
      transactionType: String
    ): AxiosPromise[_] = js.native
    def lipaNaMpesaOnline(
      senderMsisdn: String,
      amount: Double,
      callbackUrl: String,
      accountRef: String,
      transactionDesc: String,
      transactionType: String,
      shortCode: js.UndefOr[scala.Nothing],
      passKey: String
    ): AxiosPromise[_] = js.native
    def lipaNaMpesaOnline(
      senderMsisdn: String,
      amount: Double,
      callbackUrl: String,
      accountRef: String,
      transactionDesc: String,
      transactionType: String,
      shortCode: String
    ): AxiosPromise[_] = js.native
    def lipaNaMpesaOnline(
      senderMsisdn: String,
      amount: Double,
      callbackUrl: String,
      accountRef: String,
      transactionDesc: String,
      transactionType: String,
      shortCode: String,
      passKey: String
    ): AxiosPromise[_] = js.native
    
    def lipaNaMpesaQuery(checkoutRequestId: String): AxiosPromise[_] = js.native
    def lipaNaMpesaQuery(checkoutRequestId: String, shortCode: js.UndefOr[scala.Nothing], passKey: String): AxiosPromise[_] = js.native
    def lipaNaMpesaQuery(checkoutRequestId: String, shortCode: String): AxiosPromise[_] = js.native
    def lipaNaMpesaQuery(checkoutRequestId: String, shortCode: String, passKey: String): AxiosPromise[_] = js.native
    
    def oAuth(consumerKey: String, consumerSecret: String): AxiosPromise[_] = js.native
    def oAuth(consumerKey: String, consumerSecret: String, baseURL: String): AxiosPromise[_] = js.native
    
    def reversal(
      transactionId: String,
      amount: Double,
      queueUrl: String,
      resultUrl: String,
      shortCode: js.UndefOr[String],
      remarks: js.UndefOr[String],
      occasion: js.UndefOr[String],
      initiator: js.UndefOr[String],
      receiverIdType: js.UndefOr[String],
      commandId: js.UndefOr[String]
    ): AxiosPromise[_] = js.native
    
    def transactionStatus(
      transactionId: String,
      amount: Double,
      queueUrl: String,
      resultUrl: String,
      shortCode: js.UndefOr[String],
      remarks: js.UndefOr[String],
      occasion: js.UndefOr[String],
      initiator: js.UndefOr[String],
      receiverIdType: js.UndefOr[String],
      commandId: js.UndefOr[String]
    ): AxiosPromise[_] = js.native
  }
}
