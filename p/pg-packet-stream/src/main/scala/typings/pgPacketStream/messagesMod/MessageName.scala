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
  def authenticationCleartextPassword: typings.pgPacketStream.pgPacketStreamStrings.authenticationCleartextPassword = "authenticationCleartextPassword".asInstanceOf[typings.pgPacketStream.pgPacketStreamStrings.authenticationCleartextPassword]
  @scala.inline
  def authenticationMD5Password: typings.pgPacketStream.pgPacketStreamStrings.authenticationMD5Password = "authenticationMD5Password".asInstanceOf[typings.pgPacketStream.pgPacketStreamStrings.authenticationMD5Password]
  @scala.inline
  def authenticationOk: typings.pgPacketStream.pgPacketStreamStrings.authenticationOk = "authenticationOk".asInstanceOf[typings.pgPacketStream.pgPacketStreamStrings.authenticationOk]
  @scala.inline
  def authenticationSASL: typings.pgPacketStream.pgPacketStreamStrings.authenticationSASL = "authenticationSASL".asInstanceOf[typings.pgPacketStream.pgPacketStreamStrings.authenticationSASL]
  @scala.inline
  def authenticationSASLContinue: typings.pgPacketStream.pgPacketStreamStrings.authenticationSASLContinue = "authenticationSASLContinue".asInstanceOf[typings.pgPacketStream.pgPacketStreamStrings.authenticationSASLContinue]
  @scala.inline
  def authenticationSASLFinal: typings.pgPacketStream.pgPacketStreamStrings.authenticationSASLFinal = "authenticationSASLFinal".asInstanceOf[typings.pgPacketStream.pgPacketStreamStrings.authenticationSASLFinal]
  @scala.inline
  def backendKeyData: typings.pgPacketStream.pgPacketStreamStrings.backendKeyData = "backendKeyData".asInstanceOf[typings.pgPacketStream.pgPacketStreamStrings.backendKeyData]
  @scala.inline
  def bindComplete: typings.pgPacketStream.pgPacketStreamStrings.bindComplete = "bindComplete".asInstanceOf[typings.pgPacketStream.pgPacketStreamStrings.bindComplete]
  @scala.inline
  def closeComplete: typings.pgPacketStream.pgPacketStreamStrings.closeComplete = "closeComplete".asInstanceOf[typings.pgPacketStream.pgPacketStreamStrings.closeComplete]
  @scala.inline
  def commandComplete: typings.pgPacketStream.pgPacketStreamStrings.commandComplete = "commandComplete".asInstanceOf[typings.pgPacketStream.pgPacketStreamStrings.commandComplete]
  @scala.inline
  def copyData: typings.pgPacketStream.pgPacketStreamStrings.copyData = "copyData".asInstanceOf[typings.pgPacketStream.pgPacketStreamStrings.copyData]
  @scala.inline
  def copyDone: typings.pgPacketStream.pgPacketStreamStrings.copyDone = "copyDone".asInstanceOf[typings.pgPacketStream.pgPacketStreamStrings.copyDone]
  @scala.inline
  def copyInResponse: typings.pgPacketStream.pgPacketStreamStrings.copyInResponse = "copyInResponse".asInstanceOf[typings.pgPacketStream.pgPacketStreamStrings.copyInResponse]
  @scala.inline
  def copyOutResponse: typings.pgPacketStream.pgPacketStreamStrings.copyOutResponse = "copyOutResponse".asInstanceOf[typings.pgPacketStream.pgPacketStreamStrings.copyOutResponse]
  @scala.inline
  def dataRow: typings.pgPacketStream.pgPacketStreamStrings.dataRow = "dataRow".asInstanceOf[typings.pgPacketStream.pgPacketStreamStrings.dataRow]
  @scala.inline
  def emptyQuery: typings.pgPacketStream.pgPacketStreamStrings.emptyQuery = "emptyQuery".asInstanceOf[typings.pgPacketStream.pgPacketStreamStrings.emptyQuery]
  @scala.inline
  def error: typings.pgPacketStream.pgPacketStreamStrings.error = "error".asInstanceOf[typings.pgPacketStream.pgPacketStreamStrings.error]
  @scala.inline
  def noData: typings.pgPacketStream.pgPacketStreamStrings.noData = "noData".asInstanceOf[typings.pgPacketStream.pgPacketStreamStrings.noData]
  @scala.inline
  def notice: typings.pgPacketStream.pgPacketStreamStrings.notice = "notice".asInstanceOf[typings.pgPacketStream.pgPacketStreamStrings.notice]
  @scala.inline
  def notification: typings.pgPacketStream.pgPacketStreamStrings.notification = "notification".asInstanceOf[typings.pgPacketStream.pgPacketStreamStrings.notification]
  @scala.inline
  def parameterStatus: typings.pgPacketStream.pgPacketStreamStrings.parameterStatus = "parameterStatus".asInstanceOf[typings.pgPacketStream.pgPacketStreamStrings.parameterStatus]
  @scala.inline
  def parseComplete: typings.pgPacketStream.pgPacketStreamStrings.parseComplete = "parseComplete".asInstanceOf[typings.pgPacketStream.pgPacketStreamStrings.parseComplete]
  @scala.inline
  def portalSuspended: typings.pgPacketStream.pgPacketStreamStrings.portalSuspended = "portalSuspended".asInstanceOf[typings.pgPacketStream.pgPacketStreamStrings.portalSuspended]
  @scala.inline
  def readyForQuery: typings.pgPacketStream.pgPacketStreamStrings.readyForQuery = "readyForQuery".asInstanceOf[typings.pgPacketStream.pgPacketStreamStrings.readyForQuery]
  @scala.inline
  def replicationStart: typings.pgPacketStream.pgPacketStreamStrings.replicationStart = "replicationStart".asInstanceOf[typings.pgPacketStream.pgPacketStreamStrings.replicationStart]
  @scala.inline
  def rowDescription: typings.pgPacketStream.pgPacketStreamStrings.rowDescription = "rowDescription".asInstanceOf[typings.pgPacketStream.pgPacketStreamStrings.rowDescription]
}

