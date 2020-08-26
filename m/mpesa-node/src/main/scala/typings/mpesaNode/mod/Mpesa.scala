package typings.mpesaNode.mod

import typings.axios.mod.AxiosPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mpesa extends js.Object {
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

