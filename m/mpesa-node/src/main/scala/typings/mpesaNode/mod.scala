package typings.mpesaNode

import typings.axios.mod.AxiosPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mpesa-node", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Mpesa {
    def this(config: ConfigOptions) = this()
  }
  
  trait ConfigOptions extends StObject {
    
    var certPath: js.UndefOr[String] = js.undefined
    
    var consumerKey: String
    
    var consumerSecret: String
    
    var enviroment: js.UndefOr[String] = js.undefined
    
    var initiatorName: js.UndefOr[String] = js.undefined
    
    var lipaNaMpesaShortCode: js.UndefOr[String] = js.undefined
    
    var lipaNaMpesaShortPass: js.UndefOr[String] = js.undefined
    
    var securityCredential: js.UndefOr[String] = js.undefined
    
    var shortCode: js.UndefOr[String] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(consumerKey: String, consumerSecret: String): ConfigOptions = {
      val __obj = js.Dynamic.literal(consumerKey = consumerKey.asInstanceOf[js.Any], consumerSecret = consumerSecret.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigOptions]
    }
    
    extension [Self <: ConfigOptions](x: Self) {
      
      inline def setCertPath(value: String): Self = StObject.set(x, "certPath", value.asInstanceOf[js.Any])
      
      inline def setCertPathUndefined: Self = StObject.set(x, "certPath", js.undefined)
      
      inline def setConsumerKey(value: String): Self = StObject.set(x, "consumerKey", value.asInstanceOf[js.Any])
      
      inline def setConsumerSecret(value: String): Self = StObject.set(x, "consumerSecret", value.asInstanceOf[js.Any])
      
      inline def setEnviroment(value: String): Self = StObject.set(x, "enviroment", value.asInstanceOf[js.Any])
      
      inline def setEnviromentUndefined: Self = StObject.set(x, "enviroment", js.undefined)
      
      inline def setInitiatorName(value: String): Self = StObject.set(x, "initiatorName", value.asInstanceOf[js.Any])
      
      inline def setInitiatorNameUndefined: Self = StObject.set(x, "initiatorName", js.undefined)
      
      inline def setLipaNaMpesaShortCode(value: String): Self = StObject.set(x, "lipaNaMpesaShortCode", value.asInstanceOf[js.Any])
      
      inline def setLipaNaMpesaShortCodeUndefined: Self = StObject.set(x, "lipaNaMpesaShortCode", js.undefined)
      
      inline def setLipaNaMpesaShortPass(value: String): Self = StObject.set(x, "lipaNaMpesaShortPass", value.asInstanceOf[js.Any])
      
      inline def setLipaNaMpesaShortPassUndefined: Self = StObject.set(x, "lipaNaMpesaShortPass", js.undefined)
      
      inline def setSecurityCredential(value: String): Self = StObject.set(x, "securityCredential", value.asInstanceOf[js.Any])
      
      inline def setSecurityCredentialUndefined: Self = StObject.set(x, "securityCredential", js.undefined)
      
      inline def setShortCode(value: String): Self = StObject.set(x, "shortCode", value.asInstanceOf[js.Any])
      
      inline def setShortCodeUndefined: Self = StObject.set(x, "shortCode", js.undefined)
    }
  }
  
  @js.native
  trait Mpesa extends StObject {
    
    def accountBalance(shortCode: String, idType: String, queueUrl: String, resultUrl: String): AxiosPromise[Any] = js.native
    def accountBalance(shortCode: String, idType: String, queueUrl: String, resultUrl: String, remarks: String): AxiosPromise[Any] = js.native
    def accountBalance(
      shortCode: String,
      idType: String,
      queueUrl: String,
      resultUrl: String,
      remarks: String,
      initiator: String
    ): AxiosPromise[Any] = js.native
    def accountBalance(
      shortCode: String,
      idType: String,
      queueUrl: String,
      resultUrl: String,
      remarks: String,
      initiator: String,
      commandId: String
    ): AxiosPromise[Any] = js.native
    def accountBalance(
      shortCode: String,
      idType: String,
      queueUrl: String,
      resultUrl: String,
      remarks: String,
      initiator: Unit,
      commandId: String
    ): AxiosPromise[Any] = js.native
    def accountBalance(
      shortCode: String,
      idType: String,
      queueUrl: String,
      resultUrl: String,
      remarks: Unit,
      initiator: String
    ): AxiosPromise[Any] = js.native
    def accountBalance(
      shortCode: String,
      idType: String,
      queueUrl: String,
      resultUrl: String,
      remarks: Unit,
      initiator: String,
      commandId: String
    ): AxiosPromise[Any] = js.native
    def accountBalance(
      shortCode: String,
      idType: String,
      queueUrl: String,
      resultUrl: String,
      remarks: Unit,
      initiator: Unit,
      commandId: String
    ): AxiosPromise[Any] = js.native
    
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
    ): AxiosPromise[Any] = js.native
    
    def b2c(senderParty: String, receiverParty: String, amount: Double, queueUrl: String, resultUrl: String): AxiosPromise[Any] = js.native
    def b2c(
      senderParty: String,
      receiverParty: String,
      amount: Double,
      queueUrl: String,
      resultUrl: String,
      commandId: String
    ): AxiosPromise[Any] = js.native
    def b2c(
      senderParty: String,
      receiverParty: String,
      amount: Double,
      queueUrl: String,
      resultUrl: String,
      commandId: String,
      initiatorName: String
    ): AxiosPromise[Any] = js.native
    def b2c(
      senderParty: String,
      receiverParty: String,
      amount: Double,
      queueUrl: String,
      resultUrl: String,
      commandId: String,
      initiatorName: String,
      remarks: String
    ): AxiosPromise[Any] = js.native
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
    ): AxiosPromise[Any] = js.native
    def b2c(
      senderParty: String,
      receiverParty: String,
      amount: Double,
      queueUrl: String,
      resultUrl: String,
      commandId: String,
      initiatorName: String,
      remarks: Unit,
      occasion: String
    ): AxiosPromise[Any] = js.native
    def b2c(
      senderParty: String,
      receiverParty: String,
      amount: Double,
      queueUrl: String,
      resultUrl: String,
      commandId: String,
      initiatorName: Unit,
      remarks: String
    ): AxiosPromise[Any] = js.native
    def b2c(
      senderParty: String,
      receiverParty: String,
      amount: Double,
      queueUrl: String,
      resultUrl: String,
      commandId: String,
      initiatorName: Unit,
      remarks: String,
      occasion: String
    ): AxiosPromise[Any] = js.native
    def b2c(
      senderParty: String,
      receiverParty: String,
      amount: Double,
      queueUrl: String,
      resultUrl: String,
      commandId: String,
      initiatorName: Unit,
      remarks: Unit,
      occasion: String
    ): AxiosPromise[Any] = js.native
    def b2c(
      senderParty: String,
      receiverParty: String,
      amount: Double,
      queueUrl: String,
      resultUrl: String,
      commandId: Unit,
      initiatorName: String
    ): AxiosPromise[Any] = js.native
    def b2c(
      senderParty: String,
      receiverParty: String,
      amount: Double,
      queueUrl: String,
      resultUrl: String,
      commandId: Unit,
      initiatorName: String,
      remarks: String
    ): AxiosPromise[Any] = js.native
    def b2c(
      senderParty: String,
      receiverParty: String,
      amount: Double,
      queueUrl: String,
      resultUrl: String,
      commandId: Unit,
      initiatorName: String,
      remarks: String,
      occasion: String
    ): AxiosPromise[Any] = js.native
    def b2c(
      senderParty: String,
      receiverParty: String,
      amount: Double,
      queueUrl: String,
      resultUrl: String,
      commandId: Unit,
      initiatorName: String,
      remarks: Unit,
      occasion: String
    ): AxiosPromise[Any] = js.native
    def b2c(
      senderParty: String,
      receiverParty: String,
      amount: Double,
      queueUrl: String,
      resultUrl: String,
      commandId: Unit,
      initiatorName: Unit,
      remarks: String
    ): AxiosPromise[Any] = js.native
    def b2c(
      senderParty: String,
      receiverParty: String,
      amount: Double,
      queueUrl: String,
      resultUrl: String,
      commandId: Unit,
      initiatorName: Unit,
      remarks: String,
      occasion: String
    ): AxiosPromise[Any] = js.native
    def b2c(
      senderParty: String,
      receiverParty: String,
      amount: Double,
      queueUrl: String,
      resultUrl: String,
      commandId: Unit,
      initiatorName: Unit,
      remarks: Unit,
      occasion: String
    ): AxiosPromise[Any] = js.native
    
    def c2bRegister(confirmationUrl: String, validationUrl: String): AxiosPromise[Any] = js.native
    def c2bRegister(confirmationUrl: String, validationUrl: String, shortCode: String): AxiosPromise[Any] = js.native
    def c2bRegister(confirmationUrl: String, validationUrl: String, shortCode: String, responseType: String): AxiosPromise[Any] = js.native
    def c2bRegister(confirmationUrl: String, validationUrl: String, shortCode: Unit, responseType: String): AxiosPromise[Any] = js.native
    
    def c2bSimulate(msisdn: String, amount: Double, billRefNumber: String): AxiosPromise[Any] = js.native
    def c2bSimulate(msisdn: String, amount: Double, billRefNumber: String, commandId: String): AxiosPromise[Any] = js.native
    def c2bSimulate(msisdn: String, amount: Double, billRefNumber: String, commandId: String, shortCode: String): AxiosPromise[Any] = js.native
    def c2bSimulate(msisdn: String, amount: Double, billRefNumber: String, commandId: Unit, shortCode: String): AxiosPromise[Any] = js.native
    
    def lipaNaMpesaOnline(senderMsisdn: String, amount: Double, callbackUrl: String, accountRef: String): AxiosPromise[Any] = js.native
    def lipaNaMpesaOnline(
      senderMsisdn: String,
      amount: Double,
      callbackUrl: String,
      accountRef: String,
      transactionDesc: String
    ): AxiosPromise[Any] = js.native
    def lipaNaMpesaOnline(
      senderMsisdn: String,
      amount: Double,
      callbackUrl: String,
      accountRef: String,
      transactionDesc: String,
      transactionType: String
    ): AxiosPromise[Any] = js.native
    def lipaNaMpesaOnline(
      senderMsisdn: String,
      amount: Double,
      callbackUrl: String,
      accountRef: String,
      transactionDesc: String,
      transactionType: String,
      shortCode: String
    ): AxiosPromise[Any] = js.native
    def lipaNaMpesaOnline(
      senderMsisdn: String,
      amount: Double,
      callbackUrl: String,
      accountRef: String,
      transactionDesc: String,
      transactionType: String,
      shortCode: String,
      passKey: String
    ): AxiosPromise[Any] = js.native
    def lipaNaMpesaOnline(
      senderMsisdn: String,
      amount: Double,
      callbackUrl: String,
      accountRef: String,
      transactionDesc: String,
      transactionType: String,
      shortCode: Unit,
      passKey: String
    ): AxiosPromise[Any] = js.native
    def lipaNaMpesaOnline(
      senderMsisdn: String,
      amount: Double,
      callbackUrl: String,
      accountRef: String,
      transactionDesc: String,
      transactionType: Unit,
      shortCode: String
    ): AxiosPromise[Any] = js.native
    def lipaNaMpesaOnline(
      senderMsisdn: String,
      amount: Double,
      callbackUrl: String,
      accountRef: String,
      transactionDesc: String,
      transactionType: Unit,
      shortCode: String,
      passKey: String
    ): AxiosPromise[Any] = js.native
    def lipaNaMpesaOnline(
      senderMsisdn: String,
      amount: Double,
      callbackUrl: String,
      accountRef: String,
      transactionDesc: String,
      transactionType: Unit,
      shortCode: Unit,
      passKey: String
    ): AxiosPromise[Any] = js.native
    def lipaNaMpesaOnline(
      senderMsisdn: String,
      amount: Double,
      callbackUrl: String,
      accountRef: String,
      transactionDesc: Unit,
      transactionType: String
    ): AxiosPromise[Any] = js.native
    def lipaNaMpesaOnline(
      senderMsisdn: String,
      amount: Double,
      callbackUrl: String,
      accountRef: String,
      transactionDesc: Unit,
      transactionType: String,
      shortCode: String
    ): AxiosPromise[Any] = js.native
    def lipaNaMpesaOnline(
      senderMsisdn: String,
      amount: Double,
      callbackUrl: String,
      accountRef: String,
      transactionDesc: Unit,
      transactionType: String,
      shortCode: String,
      passKey: String
    ): AxiosPromise[Any] = js.native
    def lipaNaMpesaOnline(
      senderMsisdn: String,
      amount: Double,
      callbackUrl: String,
      accountRef: String,
      transactionDesc: Unit,
      transactionType: String,
      shortCode: Unit,
      passKey: String
    ): AxiosPromise[Any] = js.native
    def lipaNaMpesaOnline(
      senderMsisdn: String,
      amount: Double,
      callbackUrl: String,
      accountRef: String,
      transactionDesc: Unit,
      transactionType: Unit,
      shortCode: String
    ): AxiosPromise[Any] = js.native
    def lipaNaMpesaOnline(
      senderMsisdn: String,
      amount: Double,
      callbackUrl: String,
      accountRef: String,
      transactionDesc: Unit,
      transactionType: Unit,
      shortCode: String,
      passKey: String
    ): AxiosPromise[Any] = js.native
    def lipaNaMpesaOnline(
      senderMsisdn: String,
      amount: Double,
      callbackUrl: String,
      accountRef: String,
      transactionDesc: Unit,
      transactionType: Unit,
      shortCode: Unit,
      passKey: String
    ): AxiosPromise[Any] = js.native
    
    def lipaNaMpesaQuery(checkoutRequestId: String): AxiosPromise[Any] = js.native
    def lipaNaMpesaQuery(checkoutRequestId: String, shortCode: String): AxiosPromise[Any] = js.native
    def lipaNaMpesaQuery(checkoutRequestId: String, shortCode: String, passKey: String): AxiosPromise[Any] = js.native
    def lipaNaMpesaQuery(checkoutRequestId: String, shortCode: Unit, passKey: String): AxiosPromise[Any] = js.native
    
    def oAuth(consumerKey: String, consumerSecret: String): AxiosPromise[Any] = js.native
    def oAuth(consumerKey: String, consumerSecret: String, baseURL: String): AxiosPromise[Any] = js.native
    
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
    ): AxiosPromise[Any] = js.native
    
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
    ): AxiosPromise[Any] = js.native
  }
}
