package typings.pgPacketStream.messagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.pgPacketStream.pgPacketStreamStrings.parseComplete
  - typings.pgPacketStream.pgPacketStreamStrings.bindComplete
  - typings.pgPacketStream.pgPacketStreamStrings.closeComplete
  - typings.pgPacketStream.pgPacketStreamStrings.noData
  - typings.pgPacketStream.pgPacketStreamStrings.portalSuspended
  - typings.pgPacketStream.pgPacketStreamStrings.replicationStart
  - typings.pgPacketStream.pgPacketStreamStrings.emptyQuery
  - typings.pgPacketStream.pgPacketStreamStrings.copyDone
  - typings.pgPacketStream.pgPacketStreamStrings.copyData
  - typings.pgPacketStream.pgPacketStreamStrings.rowDescription
  - typings.pgPacketStream.pgPacketStreamStrings.parameterStatus
  - typings.pgPacketStream.pgPacketStreamStrings.backendKeyData
  - typings.pgPacketStream.pgPacketStreamStrings.notification
  - typings.pgPacketStream.pgPacketStreamStrings.readyForQuery
  - typings.pgPacketStream.pgPacketStreamStrings.commandComplete
  - typings.pgPacketStream.pgPacketStreamStrings.dataRow
  - typings.pgPacketStream.pgPacketStreamStrings.copyInResponse
  - typings.pgPacketStream.pgPacketStreamStrings.copyOutResponse
  - typings.pgPacketStream.pgPacketStreamStrings.authenticationOk
  - typings.pgPacketStream.pgPacketStreamStrings.authenticationMD5Password
  - typings.pgPacketStream.pgPacketStreamStrings.authenticationCleartextPassword
  - typings.pgPacketStream.pgPacketStreamStrings.authenticationSASL
  - typings.pgPacketStream.pgPacketStreamStrings.authenticationSASLContinue
  - typings.pgPacketStream.pgPacketStreamStrings.authenticationSASLFinal
  - typings.pgPacketStream.pgPacketStreamStrings.error
  - typings.pgPacketStream.pgPacketStreamStrings.notice
*/
trait MessageName extends js.Object

object MessageName {
  @scala.inline
  def authenticationCleartextPassword: typings.pgPacketStream.pgPacketStreamStrings.authenticationCleartextPassword = this.cast("authenticationCleartextPassword")
  @scala.inline
  def authenticationMD5Password: typings.pgPacketStream.pgPacketStreamStrings.authenticationMD5Password = this.cast("authenticationMD5Password")
  @scala.inline
  def authenticationOk: typings.pgPacketStream.pgPacketStreamStrings.authenticationOk = this.cast("authenticationOk")
  @scala.inline
  def authenticationSASL: typings.pgPacketStream.pgPacketStreamStrings.authenticationSASL = this.cast("authenticationSASL")
  @scala.inline
  def authenticationSASLContinue: typings.pgPacketStream.pgPacketStreamStrings.authenticationSASLContinue = this.cast("authenticationSASLContinue")
  @scala.inline
  def authenticationSASLFinal: typings.pgPacketStream.pgPacketStreamStrings.authenticationSASLFinal = this.cast("authenticationSASLFinal")
  @scala.inline
  def backendKeyData: typings.pgPacketStream.pgPacketStreamStrings.backendKeyData = this.cast("backendKeyData")
  @scala.inline
  def bindComplete: typings.pgPacketStream.pgPacketStreamStrings.bindComplete = this.cast("bindComplete")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def closeComplete: typings.pgPacketStream.pgPacketStreamStrings.closeComplete = this.cast("closeComplete")
  @scala.inline
  def commandComplete: typings.pgPacketStream.pgPacketStreamStrings.commandComplete = this.cast("commandComplete")
  @scala.inline
  def copyData: typings.pgPacketStream.pgPacketStreamStrings.copyData = this.cast("copyData")
  @scala.inline
  def copyDone: typings.pgPacketStream.pgPacketStreamStrings.copyDone = this.cast("copyDone")
  @scala.inline
  def copyInResponse: typings.pgPacketStream.pgPacketStreamStrings.copyInResponse = this.cast("copyInResponse")
  @scala.inline
  def copyOutResponse: typings.pgPacketStream.pgPacketStreamStrings.copyOutResponse = this.cast("copyOutResponse")
  @scala.inline
  def dataRow: typings.pgPacketStream.pgPacketStreamStrings.dataRow = this.cast("dataRow")
  @scala.inline
  def emptyQuery: typings.pgPacketStream.pgPacketStreamStrings.emptyQuery = this.cast("emptyQuery")
  @scala.inline
  def error: typings.pgPacketStream.pgPacketStreamStrings.error = this.cast("error")
  @scala.inline
  def noData: typings.pgPacketStream.pgPacketStreamStrings.noData = this.cast("noData")
  @scala.inline
  def notice: typings.pgPacketStream.pgPacketStreamStrings.notice = this.cast("notice")
  @scala.inline
  def notification: typings.pgPacketStream.pgPacketStreamStrings.notification = this.cast("notification")
  @scala.inline
  def parameterStatus: typings.pgPacketStream.pgPacketStreamStrings.parameterStatus = this.cast("parameterStatus")
  @scala.inline
  def parseComplete: typings.pgPacketStream.pgPacketStreamStrings.parseComplete = this.cast("parseComplete")
  @scala.inline
  def portalSuspended: typings.pgPacketStream.pgPacketStreamStrings.portalSuspended = this.cast("portalSuspended")
  @scala.inline
  def readyForQuery: typings.pgPacketStream.pgPacketStreamStrings.readyForQuery = this.cast("readyForQuery")
  @scala.inline
  def replicationStart: typings.pgPacketStream.pgPacketStreamStrings.replicationStart = this.cast("replicationStart")
  @scala.inline
  def rowDescription: typings.pgPacketStream.pgPacketStreamStrings.rowDescription = this.cast("rowDescription")
}

