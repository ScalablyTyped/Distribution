package typings.pgProtocol.messagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.pgProtocol.pgProtocolStrings.parseComplete
  - typings.pgProtocol.pgProtocolStrings.bindComplete
  - typings.pgProtocol.pgProtocolStrings.closeComplete
  - typings.pgProtocol.pgProtocolStrings.noData
  - typings.pgProtocol.pgProtocolStrings.portalSuspended
  - typings.pgProtocol.pgProtocolStrings.replicationStart
  - typings.pgProtocol.pgProtocolStrings.emptyQuery
  - typings.pgProtocol.pgProtocolStrings.copyDone
  - typings.pgProtocol.pgProtocolStrings.copyData
  - typings.pgProtocol.pgProtocolStrings.rowDescription
  - typings.pgProtocol.pgProtocolStrings.parameterStatus
  - typings.pgProtocol.pgProtocolStrings.backendKeyData
  - typings.pgProtocol.pgProtocolStrings.notification
  - typings.pgProtocol.pgProtocolStrings.readyForQuery
  - typings.pgProtocol.pgProtocolStrings.commandComplete
  - typings.pgProtocol.pgProtocolStrings.dataRow
  - typings.pgProtocol.pgProtocolStrings.copyInResponse
  - typings.pgProtocol.pgProtocolStrings.copyOutResponse
  - typings.pgProtocol.pgProtocolStrings.authenticationOk
  - typings.pgProtocol.pgProtocolStrings.authenticationMD5Password
  - typings.pgProtocol.pgProtocolStrings.authenticationCleartextPassword
  - typings.pgProtocol.pgProtocolStrings.authenticationSASL
  - typings.pgProtocol.pgProtocolStrings.authenticationSASLContinue
  - typings.pgProtocol.pgProtocolStrings.authenticationSASLFinal
  - typings.pgProtocol.pgProtocolStrings.error
  - typings.pgProtocol.pgProtocolStrings.notice
*/
trait MessageName extends js.Object
object MessageName {
  
  @scala.inline
  def authenticationCleartextPassword: typings.pgProtocol.pgProtocolStrings.authenticationCleartextPassword = "authenticationCleartextPassword".asInstanceOf[typings.pgProtocol.pgProtocolStrings.authenticationCleartextPassword]
  
  @scala.inline
  def authenticationMD5Password: typings.pgProtocol.pgProtocolStrings.authenticationMD5Password = "authenticationMD5Password".asInstanceOf[typings.pgProtocol.pgProtocolStrings.authenticationMD5Password]
  
  @scala.inline
  def authenticationOk: typings.pgProtocol.pgProtocolStrings.authenticationOk = "authenticationOk".asInstanceOf[typings.pgProtocol.pgProtocolStrings.authenticationOk]
  
  @scala.inline
  def authenticationSASL: typings.pgProtocol.pgProtocolStrings.authenticationSASL = "authenticationSASL".asInstanceOf[typings.pgProtocol.pgProtocolStrings.authenticationSASL]
  
  @scala.inline
  def authenticationSASLContinue: typings.pgProtocol.pgProtocolStrings.authenticationSASLContinue = "authenticationSASLContinue".asInstanceOf[typings.pgProtocol.pgProtocolStrings.authenticationSASLContinue]
  
  @scala.inline
  def authenticationSASLFinal: typings.pgProtocol.pgProtocolStrings.authenticationSASLFinal = "authenticationSASLFinal".asInstanceOf[typings.pgProtocol.pgProtocolStrings.authenticationSASLFinal]
  
  @scala.inline
  def backendKeyData: typings.pgProtocol.pgProtocolStrings.backendKeyData = "backendKeyData".asInstanceOf[typings.pgProtocol.pgProtocolStrings.backendKeyData]
  
  @scala.inline
  def bindComplete: typings.pgProtocol.pgProtocolStrings.bindComplete = "bindComplete".asInstanceOf[typings.pgProtocol.pgProtocolStrings.bindComplete]
  
  @scala.inline
  def closeComplete: typings.pgProtocol.pgProtocolStrings.closeComplete = "closeComplete".asInstanceOf[typings.pgProtocol.pgProtocolStrings.closeComplete]
  
  @scala.inline
  def commandComplete: typings.pgProtocol.pgProtocolStrings.commandComplete = "commandComplete".asInstanceOf[typings.pgProtocol.pgProtocolStrings.commandComplete]
  
  @scala.inline
  def copyData: typings.pgProtocol.pgProtocolStrings.copyData = "copyData".asInstanceOf[typings.pgProtocol.pgProtocolStrings.copyData]
  
  @scala.inline
  def copyDone: typings.pgProtocol.pgProtocolStrings.copyDone = "copyDone".asInstanceOf[typings.pgProtocol.pgProtocolStrings.copyDone]
  
  @scala.inline
  def copyInResponse: typings.pgProtocol.pgProtocolStrings.copyInResponse = "copyInResponse".asInstanceOf[typings.pgProtocol.pgProtocolStrings.copyInResponse]
  
  @scala.inline
  def copyOutResponse: typings.pgProtocol.pgProtocolStrings.copyOutResponse = "copyOutResponse".asInstanceOf[typings.pgProtocol.pgProtocolStrings.copyOutResponse]
  
  @scala.inline
  def dataRow: typings.pgProtocol.pgProtocolStrings.dataRow = "dataRow".asInstanceOf[typings.pgProtocol.pgProtocolStrings.dataRow]
  
  @scala.inline
  def emptyQuery: typings.pgProtocol.pgProtocolStrings.emptyQuery = "emptyQuery".asInstanceOf[typings.pgProtocol.pgProtocolStrings.emptyQuery]
  
  @scala.inline
  def error: typings.pgProtocol.pgProtocolStrings.error = "error".asInstanceOf[typings.pgProtocol.pgProtocolStrings.error]
  
  @scala.inline
  def noData: typings.pgProtocol.pgProtocolStrings.noData = "noData".asInstanceOf[typings.pgProtocol.pgProtocolStrings.noData]
  
  @scala.inline
  def notice: typings.pgProtocol.pgProtocolStrings.notice = "notice".asInstanceOf[typings.pgProtocol.pgProtocolStrings.notice]
  
  @scala.inline
  def notification: typings.pgProtocol.pgProtocolStrings.notification = "notification".asInstanceOf[typings.pgProtocol.pgProtocolStrings.notification]
  
  @scala.inline
  def parameterStatus: typings.pgProtocol.pgProtocolStrings.parameterStatus = "parameterStatus".asInstanceOf[typings.pgProtocol.pgProtocolStrings.parameterStatus]
  
  @scala.inline
  def parseComplete: typings.pgProtocol.pgProtocolStrings.parseComplete = "parseComplete".asInstanceOf[typings.pgProtocol.pgProtocolStrings.parseComplete]
  
  @scala.inline
  def portalSuspended: typings.pgProtocol.pgProtocolStrings.portalSuspended = "portalSuspended".asInstanceOf[typings.pgProtocol.pgProtocolStrings.portalSuspended]
  
  @scala.inline
  def readyForQuery: typings.pgProtocol.pgProtocolStrings.readyForQuery = "readyForQuery".asInstanceOf[typings.pgProtocol.pgProtocolStrings.readyForQuery]
  
  @scala.inline
  def replicationStart: typings.pgProtocol.pgProtocolStrings.replicationStart = "replicationStart".asInstanceOf[typings.pgProtocol.pgProtocolStrings.replicationStart]
  
  @scala.inline
  def rowDescription: typings.pgProtocol.pgProtocolStrings.rowDescription = "rowDescription".asInstanceOf[typings.pgProtocol.pgProtocolStrings.rowDescription]
}
