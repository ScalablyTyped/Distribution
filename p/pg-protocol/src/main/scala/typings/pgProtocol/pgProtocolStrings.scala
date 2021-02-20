package typings.pgProtocol

import typings.pgProtocol.messagesMod.MessageName
import typings.pgProtocol.messagesMod.Mode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pgProtocolStrings {
  
  @js.native
  sealed trait P extends StObject
  @scala.inline
  def P: P = "P".asInstanceOf[P]
  
  @js.native
  sealed trait S extends StObject
  @scala.inline
  def S: S = "S".asInstanceOf[S]
  
  @js.native
  sealed trait authenticationCleartextPassword extends MessageName
  @scala.inline
  def authenticationCleartextPassword: authenticationCleartextPassword = "authenticationCleartextPassword".asInstanceOf[authenticationCleartextPassword]
  
  @js.native
  sealed trait authenticationMD5Password extends MessageName
  @scala.inline
  def authenticationMD5Password: authenticationMD5Password = "authenticationMD5Password".asInstanceOf[authenticationMD5Password]
  
  @js.native
  sealed trait authenticationOk extends MessageName
  @scala.inline
  def authenticationOk: authenticationOk = "authenticationOk".asInstanceOf[authenticationOk]
  
  @js.native
  sealed trait authenticationSASL extends MessageName
  @scala.inline
  def authenticationSASL: authenticationSASL = "authenticationSASL".asInstanceOf[authenticationSASL]
  
  @js.native
  sealed trait authenticationSASLContinue extends MessageName
  @scala.inline
  def authenticationSASLContinue: authenticationSASLContinue = "authenticationSASLContinue".asInstanceOf[authenticationSASLContinue]
  
  @js.native
  sealed trait authenticationSASLFinal extends MessageName
  @scala.inline
  def authenticationSASLFinal: authenticationSASLFinal = "authenticationSASLFinal".asInstanceOf[authenticationSASLFinal]
  
  @js.native
  sealed trait backendKeyData extends MessageName
  @scala.inline
  def backendKeyData: backendKeyData = "backendKeyData".asInstanceOf[backendKeyData]
  
  @js.native
  sealed trait binary extends Mode
  @scala.inline
  def binary: binary = "binary".asInstanceOf[binary]
  
  @js.native
  sealed trait bindComplete extends MessageName
  @scala.inline
  def bindComplete: bindComplete = "bindComplete".asInstanceOf[bindComplete]
  
  @js.native
  sealed trait closeComplete extends MessageName
  @scala.inline
  def closeComplete: closeComplete = "closeComplete".asInstanceOf[closeComplete]
  
  @js.native
  sealed trait commandComplete extends MessageName
  @scala.inline
  def commandComplete: commandComplete = "commandComplete".asInstanceOf[commandComplete]
  
  @js.native
  sealed trait copyData extends MessageName
  @scala.inline
  def copyData: copyData = "copyData".asInstanceOf[copyData]
  
  @js.native
  sealed trait copyDone extends MessageName
  @scala.inline
  def copyDone: copyDone = "copyDone".asInstanceOf[copyDone]
  
  @js.native
  sealed trait copyInResponse extends MessageName
  @scala.inline
  def copyInResponse: copyInResponse = "copyInResponse".asInstanceOf[copyInResponse]
  
  @js.native
  sealed trait copyOutResponse extends MessageName
  @scala.inline
  def copyOutResponse: copyOutResponse = "copyOutResponse".asInstanceOf[copyOutResponse]
  
  @js.native
  sealed trait dataRow extends MessageName
  @scala.inline
  def dataRow: dataRow = "dataRow".asInstanceOf[dataRow]
  
  @js.native
  sealed trait emptyQuery extends MessageName
  @scala.inline
  def emptyQuery: emptyQuery = "emptyQuery".asInstanceOf[emptyQuery]
  
  @js.native
  sealed trait error extends MessageName
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait noData extends MessageName
  @scala.inline
  def noData: noData = "noData".asInstanceOf[noData]
  
  @js.native
  sealed trait notice extends MessageName
  @scala.inline
  def notice: notice = "notice".asInstanceOf[notice]
  
  @js.native
  sealed trait notification extends MessageName
  @scala.inline
  def notification: notification = "notification".asInstanceOf[notification]
  
  @js.native
  sealed trait parameterStatus extends MessageName
  @scala.inline
  def parameterStatus: parameterStatus = "parameterStatus".asInstanceOf[parameterStatus]
  
  @js.native
  sealed trait parseComplete extends MessageName
  @scala.inline
  def parseComplete: parseComplete = "parseComplete".asInstanceOf[parseComplete]
  
  @js.native
  sealed trait portalSuspended extends MessageName
  @scala.inline
  def portalSuspended: portalSuspended = "portalSuspended".asInstanceOf[portalSuspended]
  
  @js.native
  sealed trait readyForQuery extends MessageName
  @scala.inline
  def readyForQuery: readyForQuery = "readyForQuery".asInstanceOf[readyForQuery]
  
  @js.native
  sealed trait replicationStart extends MessageName
  @scala.inline
  def replicationStart: replicationStart = "replicationStart".asInstanceOf[replicationStart]
  
  @js.native
  sealed trait rowDescription extends MessageName
  @scala.inline
  def rowDescription: rowDescription = "rowDescription".asInstanceOf[rowDescription]
  
  @js.native
  sealed trait text extends Mode
  @scala.inline
  def text: text = "text".asInstanceOf[text]
}
