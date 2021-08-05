package typings.pgProtocol

import typings.pgProtocol.messagesMod.MessageName
import typings.pgProtocol.messagesMod.Mode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pgProtocolStrings {
  
  @js.native
  sealed trait P extends StObject
  inline def P: P = "P".asInstanceOf[P]
  
  @js.native
  sealed trait S extends StObject
  inline def S: S = "S".asInstanceOf[S]
  
  @js.native
  sealed trait authenticationCleartextPassword
    extends StObject
       with MessageName
  inline def authenticationCleartextPassword: authenticationCleartextPassword = "authenticationCleartextPassword".asInstanceOf[authenticationCleartextPassword]
  
  @js.native
  sealed trait authenticationMD5Password
    extends StObject
       with MessageName
  inline def authenticationMD5Password: authenticationMD5Password = "authenticationMD5Password".asInstanceOf[authenticationMD5Password]
  
  @js.native
  sealed trait authenticationOk
    extends StObject
       with MessageName
  inline def authenticationOk: authenticationOk = "authenticationOk".asInstanceOf[authenticationOk]
  
  @js.native
  sealed trait authenticationSASL
    extends StObject
       with MessageName
  inline def authenticationSASL: authenticationSASL = "authenticationSASL".asInstanceOf[authenticationSASL]
  
  @js.native
  sealed trait authenticationSASLContinue
    extends StObject
       with MessageName
  inline def authenticationSASLContinue: authenticationSASLContinue = "authenticationSASLContinue".asInstanceOf[authenticationSASLContinue]
  
  @js.native
  sealed trait authenticationSASLFinal
    extends StObject
       with MessageName
  inline def authenticationSASLFinal: authenticationSASLFinal = "authenticationSASLFinal".asInstanceOf[authenticationSASLFinal]
  
  @js.native
  sealed trait backendKeyData
    extends StObject
       with MessageName
  inline def backendKeyData: backendKeyData = "backendKeyData".asInstanceOf[backendKeyData]
  
  @js.native
  sealed trait binary
    extends StObject
       with Mode
  inline def binary: binary = "binary".asInstanceOf[binary]
  
  @js.native
  sealed trait bindComplete
    extends StObject
       with MessageName
  inline def bindComplete: bindComplete = "bindComplete".asInstanceOf[bindComplete]
  
  @js.native
  sealed trait closeComplete
    extends StObject
       with MessageName
  inline def closeComplete: closeComplete = "closeComplete".asInstanceOf[closeComplete]
  
  @js.native
  sealed trait commandComplete
    extends StObject
       with MessageName
  inline def commandComplete: commandComplete = "commandComplete".asInstanceOf[commandComplete]
  
  @js.native
  sealed trait copyData
    extends StObject
       with MessageName
  inline def copyData: copyData = "copyData".asInstanceOf[copyData]
  
  @js.native
  sealed trait copyDone
    extends StObject
       with MessageName
  inline def copyDone: copyDone = "copyDone".asInstanceOf[copyDone]
  
  @js.native
  sealed trait copyInResponse
    extends StObject
       with MessageName
  inline def copyInResponse: copyInResponse = "copyInResponse".asInstanceOf[copyInResponse]
  
  @js.native
  sealed trait copyOutResponse
    extends StObject
       with MessageName
  inline def copyOutResponse: copyOutResponse = "copyOutResponse".asInstanceOf[copyOutResponse]
  
  @js.native
  sealed trait dataRow
    extends StObject
       with MessageName
  inline def dataRow: dataRow = "dataRow".asInstanceOf[dataRow]
  
  @js.native
  sealed trait emptyQuery
    extends StObject
       with MessageName
  inline def emptyQuery: emptyQuery = "emptyQuery".asInstanceOf[emptyQuery]
  
  @js.native
  sealed trait error
    extends StObject
       with MessageName
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait noData
    extends StObject
       with MessageName
  inline def noData: noData = "noData".asInstanceOf[noData]
  
  @js.native
  sealed trait notice
    extends StObject
       with MessageName
  inline def notice: notice = "notice".asInstanceOf[notice]
  
  @js.native
  sealed trait notification
    extends StObject
       with MessageName
  inline def notification: notification = "notification".asInstanceOf[notification]
  
  @js.native
  sealed trait parameterStatus
    extends StObject
       with MessageName
  inline def parameterStatus: parameterStatus = "parameterStatus".asInstanceOf[parameterStatus]
  
  @js.native
  sealed trait parseComplete
    extends StObject
       with MessageName
  inline def parseComplete: parseComplete = "parseComplete".asInstanceOf[parseComplete]
  
  @js.native
  sealed trait portalSuspended
    extends StObject
       with MessageName
  inline def portalSuspended: portalSuspended = "portalSuspended".asInstanceOf[portalSuspended]
  
  @js.native
  sealed trait readyForQuery
    extends StObject
       with MessageName
  inline def readyForQuery: readyForQuery = "readyForQuery".asInstanceOf[readyForQuery]
  
  @js.native
  sealed trait replicationStart
    extends StObject
       with MessageName
  inline def replicationStart: replicationStart = "replicationStart".asInstanceOf[replicationStart]
  
  @js.native
  sealed trait rowDescription
    extends StObject
       with MessageName
  inline def rowDescription: rowDescription = "rowDescription".asInstanceOf[rowDescription]
  
  @js.native
  sealed trait text
    extends StObject
       with Mode
  inline def text: text = "text".asInstanceOf[text]
}
