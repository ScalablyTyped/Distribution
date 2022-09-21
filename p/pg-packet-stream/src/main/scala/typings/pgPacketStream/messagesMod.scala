package typings.pgPacketStream

import typings.node.bufferMod.global.Buffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messagesMod {
  
  @JSImport("pg-packet-stream/dist/messages", "AuthenticationMD5Password")
  @js.native
  open class AuthenticationMD5Password protected ()
    extends StObject
       with BackendMessage {
    def this(length: Double, salt: Buffer) = this()
    
    /* CompleteClass */
    var length: Double = js.native
    
    /* CompleteClass */
    var name: MessageName = js.native
    
    val salt: Buffer = js.native
  }
  
  @JSImport("pg-packet-stream/dist/messages", "BackendKeyDataMessage")
  @js.native
  open class BackendKeyDataMessage protected () extends StObject {
    def this(length: Double, processID: Double, secretKey: Double) = this()
    
    val length: Double = js.native
    
    val name: MessageName = js.native
    
    val processID: Double = js.native
    
    val secretKey: Double = js.native
  }
  
  @JSImport("pg-packet-stream/dist/messages", "CommandCompleteMessage")
  @js.native
  open class CommandCompleteMessage protected () extends StObject {
    def this(length: Double, text: String) = this()
    
    val length: Double = js.native
    
    val name: MessageName = js.native
    
    val text: String = js.native
  }
  
  @JSImport("pg-packet-stream/dist/messages", "CopyDataMessage")
  @js.native
  open class CopyDataMessage protected () extends StObject {
    def this(length: Double, chunk: Buffer) = this()
    
    val chunk: Buffer = js.native
    
    val length: Double = js.native
    
    val name: String | Double = js.native
  }
  
  @JSImport("pg-packet-stream/dist/messages", "CopyResponse")
  @js.native
  open class CopyResponse protected () extends StObject {
    def this(length: Double, name: MessageName, binary: Boolean, columnCount: Double) = this()
    
    val binary: Boolean = js.native
    
    val columnTypes: js.Array[Double] = js.native
    
    val length: Double = js.native
    
    val name: MessageName = js.native
  }
  
  @JSImport("pg-packet-stream/dist/messages", "DataRowMessage")
  @js.native
  open class DataRowMessage protected () extends StObject {
    def this(length: Double, fields: js.Array[Any]) = this()
    
    val fieldCount: Double = js.native
    
    var fields: js.Array[Any] = js.native
    
    var length: Double = js.native
    
    val name: MessageName = js.native
  }
  
  @JSImport("pg-packet-stream/dist/messages", "DatabaseError")
  @js.native
  open class DatabaseError protected ()
    extends StObject
       with Error {
    def this(message: String, length: Double, name: MessageName) = this()
    
    var code: js.UndefOr[String] = js.native
    
    var column: js.UndefOr[String] = js.native
    
    var constraint: js.UndefOr[String] = js.native
    
    var dataType: js.UndefOr[String] = js.native
    
    var detail: js.UndefOr[String] = js.native
    
    var file: js.UndefOr[String] = js.native
    
    var hint: js.UndefOr[String] = js.native
    
    var internalPosition: js.UndefOr[String] = js.native
    
    var internalQuery: js.UndefOr[String] = js.native
    
    val length: Double = js.native
    
    var line: js.UndefOr[String] = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    @JSName("name")
    val name_DatabaseError: MessageName = js.native
    
    var position: js.UndefOr[String] = js.native
    
    var routine: js.UndefOr[String] = js.native
    
    var schema: js.UndefOr[String] = js.native
    
    var severity: js.UndefOr[String] = js.native
    
    var table: js.UndefOr[String] = js.native
    
    var where: js.UndefOr[String] = js.native
  }
  
  @JSImport("pg-packet-stream/dist/messages", "Field")
  @js.native
  open class Field protected () extends StObject {
    def this(
      name: String,
      tableID: Double,
      columnID: Double,
      dataTypeID: Double,
      dataTypeSize: Double,
      dataTypeModifier: Double,
      format: Mode
    ) = this()
    
    val columnID: Double = js.native
    
    val dataTypeID: Double = js.native
    
    val dataTypeModifier: Double = js.native
    
    val dataTypeSize: Double = js.native
    
    val format: Mode = js.native
    
    val name: String = js.native
    
    val tableID: Double = js.native
  }
  
  @JSImport("pg-packet-stream/dist/messages", "NotificationResponseMessage")
  @js.native
  open class NotificationResponseMessage protected () extends StObject {
    def this(length: Double, processId: Double, channel: String, payload: String) = this()
    
    val channel: String = js.native
    
    val length: Double = js.native
    
    val name: MessageName = js.native
    
    val payload: String = js.native
    
    val processId: Double = js.native
  }
  
  @JSImport("pg-packet-stream/dist/messages", "ParameterStatusMessage")
  @js.native
  open class ParameterStatusMessage protected () extends StObject {
    def this(length: Double, parameterName: String, parameterValue: String) = this()
    
    val length: Double = js.native
    
    val name: MessageName = js.native
    
    val parameterName: String = js.native
    
    val parameterValue: String = js.native
  }
  
  @JSImport("pg-packet-stream/dist/messages", "ReadyForQueryMessage")
  @js.native
  open class ReadyForQueryMessage protected () extends StObject {
    def this(length: Double, status: String) = this()
    
    val length: Double = js.native
    
    val name: MessageName = js.native
    
    val status: String = js.native
  }
  
  @JSImport("pg-packet-stream/dist/messages", "RowDescriptionMessage")
  @js.native
  open class RowDescriptionMessage protected () extends StObject {
    def this(length: Double, fieldCount: Double) = this()
    
    val fieldCount: Double = js.native
    
    val fields: js.Array[Field] = js.native
    
    val length: Double = js.native
    
    val name: MessageName = js.native
  }
  
  @JSImport("pg-packet-stream/dist/messages", "bindComplete")
  @js.native
  val bindComplete: BackendMessage = js.native
  
  @JSImport("pg-packet-stream/dist/messages", "closeComplete")
  @js.native
  val closeComplete: BackendMessage = js.native
  
  @JSImport("pg-packet-stream/dist/messages", "copyDone")
  @js.native
  val copyDone: BackendMessage = js.native
  
  @JSImport("pg-packet-stream/dist/messages", "emptyQuery")
  @js.native
  val emptyQuery: BackendMessage = js.native
  
  @JSImport("pg-packet-stream/dist/messages", "noData")
  @js.native
  val noData: BackendMessage = js.native
  
  @JSImport("pg-packet-stream/dist/messages", "parseComplete")
  @js.native
  val parseComplete: BackendMessage = js.native
  
  @JSImport("pg-packet-stream/dist/messages", "portalSuspended")
  @js.native
  val portalSuspended: BackendMessage = js.native
  
  @JSImport("pg-packet-stream/dist/messages", "replicationStart")
  @js.native
  val replicationStart: BackendMessage = js.native
  
  trait BackendMessage extends StObject {
    
    var length: Double
    
    var name: MessageName
  }
  object BackendMessage {
    
    inline def apply(length: Double, name: MessageName): BackendMessage = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[BackendMessage]
    }
    
    extension [Self <: BackendMessage](x: Self) {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setName(value: MessageName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
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
  trait MessageName extends StObject
  object MessageName {
    
    inline def authenticationCleartextPassword: typings.pgPacketStream.pgPacketStreamStrings.authenticationCleartextPassword = "authenticationCleartextPassword".asInstanceOf[typings.pgPacketStream.pgPacketStreamStrings.authenticationCleartextPassword]
    
    inline def authenticationMD5Password: typings.pgPacketStream.pgPacketStreamStrings.authenticationMD5Password = "authenticationMD5Password".asInstanceOf[typings.pgPacketStream.pgPacketStreamStrings.authenticationMD5Password]
    
    inline def authenticationOk: typings.pgPacketStream.pgPacketStreamStrings.authenticationOk = "authenticationOk".asInstanceOf[typings.pgPacketStream.pgPacketStreamStrings.authenticationOk]
    
    inline def authenticationSASL: typings.pgPacketStream.pgPacketStreamStrings.authenticationSASL = "authenticationSASL".asInstanceOf[typings.pgPacketStream.pgPacketStreamStrings.authenticationSASL]
    
    inline def authenticationSASLContinue: typings.pgPacketStream.pgPacketStreamStrings.authenticationSASLContinue = "authenticationSASLContinue".asInstanceOf[typings.pgPacketStream.pgPacketStreamStrings.authenticationSASLContinue]
    
    inline def authenticationSASLFinal: typings.pgPacketStream.pgPacketStreamStrings.authenticationSASLFinal = "authenticationSASLFinal".asInstanceOf[typings.pgPacketStream.pgPacketStreamStrings.authenticationSASLFinal]
    
    inline def backendKeyData: typings.pgPacketStream.pgPacketStreamStrings.backendKeyData = "backendKeyData".asInstanceOf[typings.pgPacketStream.pgPacketStreamStrings.backendKeyData]
    
    inline def bindComplete: typings.pgPacketStream.pgPacketStreamStrings.bindComplete = "bindComplete".asInstanceOf[typings.pgPacketStream.pgPacketStreamStrings.bindComplete]
    
    inline def closeComplete: typings.pgPacketStream.pgPacketStreamStrings.closeComplete = "closeComplete".asInstanceOf[typings.pgPacketStream.pgPacketStreamStrings.closeComplete]
    
    inline def commandComplete: typings.pgPacketStream.pgPacketStreamStrings.commandComplete = "commandComplete".asInstanceOf[typings.pgPacketStream.pgPacketStreamStrings.commandComplete]
    
    inline def copyData: typings.pgPacketStream.pgPacketStreamStrings.copyData = "copyData".asInstanceOf[typings.pgPacketStream.pgPacketStreamStrings.copyData]
    
    inline def copyDone: typings.pgPacketStream.pgPacketStreamStrings.copyDone = "copyDone".asInstanceOf[typings.pgPacketStream.pgPacketStreamStrings.copyDone]
    
    inline def copyInResponse: typings.pgPacketStream.pgPacketStreamStrings.copyInResponse = "copyInResponse".asInstanceOf[typings.pgPacketStream.pgPacketStreamStrings.copyInResponse]
    
    inline def copyOutResponse: typings.pgPacketStream.pgPacketStreamStrings.copyOutResponse = "copyOutResponse".asInstanceOf[typings.pgPacketStream.pgPacketStreamStrings.copyOutResponse]
    
    inline def dataRow: typings.pgPacketStream.pgPacketStreamStrings.dataRow = "dataRow".asInstanceOf[typings.pgPacketStream.pgPacketStreamStrings.dataRow]
    
    inline def emptyQuery: typings.pgPacketStream.pgPacketStreamStrings.emptyQuery = "emptyQuery".asInstanceOf[typings.pgPacketStream.pgPacketStreamStrings.emptyQuery]
    
    inline def error: typings.pgPacketStream.pgPacketStreamStrings.error = "error".asInstanceOf[typings.pgPacketStream.pgPacketStreamStrings.error]
    
    inline def noData: typings.pgPacketStream.pgPacketStreamStrings.noData = "noData".asInstanceOf[typings.pgPacketStream.pgPacketStreamStrings.noData]
    
    inline def notice: typings.pgPacketStream.pgPacketStreamStrings.notice = "notice".asInstanceOf[typings.pgPacketStream.pgPacketStreamStrings.notice]
    
    inline def notification: typings.pgPacketStream.pgPacketStreamStrings.notification = "notification".asInstanceOf[typings.pgPacketStream.pgPacketStreamStrings.notification]
    
    inline def parameterStatus: typings.pgPacketStream.pgPacketStreamStrings.parameterStatus = "parameterStatus".asInstanceOf[typings.pgPacketStream.pgPacketStreamStrings.parameterStatus]
    
    inline def parseComplete: typings.pgPacketStream.pgPacketStreamStrings.parseComplete = "parseComplete".asInstanceOf[typings.pgPacketStream.pgPacketStreamStrings.parseComplete]
    
    inline def portalSuspended: typings.pgPacketStream.pgPacketStreamStrings.portalSuspended = "portalSuspended".asInstanceOf[typings.pgPacketStream.pgPacketStreamStrings.portalSuspended]
    
    inline def readyForQuery: typings.pgPacketStream.pgPacketStreamStrings.readyForQuery = "readyForQuery".asInstanceOf[typings.pgPacketStream.pgPacketStreamStrings.readyForQuery]
    
    inline def replicationStart: typings.pgPacketStream.pgPacketStreamStrings.replicationStart = "replicationStart".asInstanceOf[typings.pgPacketStream.pgPacketStreamStrings.replicationStart]
    
    inline def rowDescription: typings.pgPacketStream.pgPacketStreamStrings.rowDescription = "rowDescription".asInstanceOf[typings.pgPacketStream.pgPacketStreamStrings.rowDescription]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.pgPacketStream.pgPacketStreamStrings.text
    - typings.pgPacketStream.pgPacketStreamStrings.binary
  */
  trait Mode extends StObject
  object Mode {
    
    inline def binary: typings.pgPacketStream.pgPacketStreamStrings.binary = "binary".asInstanceOf[typings.pgPacketStream.pgPacketStreamStrings.binary]
    
    inline def text: typings.pgPacketStream.pgPacketStreamStrings.text = "text".asInstanceOf[typings.pgPacketStream.pgPacketStreamStrings.text]
  }
}
