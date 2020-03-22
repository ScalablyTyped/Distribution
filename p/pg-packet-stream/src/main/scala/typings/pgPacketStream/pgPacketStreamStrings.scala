package typings.pgPacketStream

import typings.pgPacketStream.messagesMod.MessageName
import typings.pgPacketStream.messagesMod.Mode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object pgPacketStreamStrings {
  @js.native
  sealed trait authenticationCleartextPassword extends MessageName
  
  @js.native
  sealed trait authenticationMD5Password extends MessageName
  
  @js.native
  sealed trait authenticationOk extends MessageName
  
  @js.native
  sealed trait authenticationSASL extends MessageName
  
  @js.native
  sealed trait authenticationSASLContinue extends MessageName
  
  @js.native
  sealed trait authenticationSASLFinal extends MessageName
  
  @js.native
  sealed trait backendKeyData extends MessageName
  
  @js.native
  sealed trait binary extends Mode
  
  @js.native
  sealed trait bindComplete extends MessageName
  
  @js.native
  sealed trait closeComplete extends MessageName
  
  @js.native
  sealed trait commandComplete extends MessageName
  
  @js.native
  sealed trait copyData extends MessageName
  
  @js.native
  sealed trait copyDone extends MessageName
  
  @js.native
  sealed trait copyInResponse extends MessageName
  
  @js.native
  sealed trait copyOutResponse extends MessageName
  
  @js.native
  sealed trait dataRow extends MessageName
  
  @js.native
  sealed trait emptyQuery extends MessageName
  
  @js.native
  sealed trait error extends MessageName
  
  @js.native
  sealed trait noData extends MessageName
  
  @js.native
  sealed trait notice extends MessageName
  
  @js.native
  sealed trait notification extends MessageName
  
  @js.native
  sealed trait parameterStatus extends MessageName
  
  @js.native
  sealed trait parseComplete extends MessageName
  
  @js.native
  sealed trait portalSuspended extends MessageName
  
  @js.native
  sealed trait readyForQuery extends MessageName
  
  @js.native
  sealed trait replicationStart extends MessageName
  
  @js.native
  sealed trait rowDescription extends MessageName
  
  @js.native
  sealed trait text extends Mode
  
  @scala.inline
  def authenticationCleartextPassword: authenticationCleartextPassword = "authenticationCleartextPassword".asInstanceOf[authenticationCleartextPassword]
  @scala.inline
  def authenticationMD5Password: authenticationMD5Password = "authenticationMD5Password".asInstanceOf[authenticationMD5Password]
  @scala.inline
  def authenticationOk: authenticationOk = "authenticationOk".asInstanceOf[authenticationOk]
  @scala.inline
  def authenticationSASL: authenticationSASL = "authenticationSASL".asInstanceOf[authenticationSASL]
  @scala.inline
  def authenticationSASLContinue: authenticationSASLContinue = "authenticationSASLContinue".asInstanceOf[authenticationSASLContinue]
  @scala.inline
  def authenticationSASLFinal: authenticationSASLFinal = "authenticationSASLFinal".asInstanceOf[authenticationSASLFinal]
  @scala.inline
  def backendKeyData: backendKeyData = "backendKeyData".asInstanceOf[backendKeyData]
  @scala.inline
  def binary: binary = "binary".asInstanceOf[binary]
  @scala.inline
  def bindComplete: bindComplete = "bindComplete".asInstanceOf[bindComplete]
  @scala.inline
  def closeComplete: closeComplete = "closeComplete".asInstanceOf[closeComplete]
  @scala.inline
  def commandComplete: commandComplete = "commandComplete".asInstanceOf[commandComplete]
  @scala.inline
  def copyData: copyData = "copyData".asInstanceOf[copyData]
  @scala.inline
  def copyDone: copyDone = "copyDone".asInstanceOf[copyDone]
  @scala.inline
  def copyInResponse: copyInResponse = "copyInResponse".asInstanceOf[copyInResponse]
  @scala.inline
  def copyOutResponse: copyOutResponse = "copyOutResponse".asInstanceOf[copyOutResponse]
  @scala.inline
  def dataRow: dataRow = "dataRow".asInstanceOf[dataRow]
  @scala.inline
  def emptyQuery: emptyQuery = "emptyQuery".asInstanceOf[emptyQuery]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def noData: noData = "noData".asInstanceOf[noData]
  @scala.inline
  def notice: notice = "notice".asInstanceOf[notice]
  @scala.inline
  def notification: notification = "notification".asInstanceOf[notification]
  @scala.inline
  def parameterStatus: parameterStatus = "parameterStatus".asInstanceOf[parameterStatus]
  @scala.inline
  def parseComplete: parseComplete = "parseComplete".asInstanceOf[parseComplete]
  @scala.inline
  def portalSuspended: portalSuspended = "portalSuspended".asInstanceOf[portalSuspended]
  @scala.inline
  def readyForQuery: readyForQuery = "readyForQuery".asInstanceOf[readyForQuery]
  @scala.inline
  def replicationStart: replicationStart = "replicationStart".asInstanceOf[replicationStart]
  @scala.inline
  def rowDescription: rowDescription = "rowDescription".asInstanceOf[rowDescription]
  @scala.inline
  def text: text = "text".asInstanceOf[text]
}

