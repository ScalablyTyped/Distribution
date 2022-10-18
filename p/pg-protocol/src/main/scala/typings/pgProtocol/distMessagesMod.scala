package typings.pgProtocol

import typings.node.bufferMod.global.Buffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMessagesMod {
  
  @JSImport("pg-protocol/dist/messages", "AuthenticationMD5Password")
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
  
  @JSImport("pg-protocol/dist/messages", "BackendKeyDataMessage")
  @js.native
  open class BackendKeyDataMessage protected () extends StObject {
    def this(length: Double, processID: Double, secretKey: Double) = this()
    
    val length: Double = js.native
    
    val name: MessageName = js.native
    
    val processID: Double = js.native
    
    val secretKey: Double = js.native
  }
  
  @JSImport("pg-protocol/dist/messages", "CommandCompleteMessage")
  @js.native
  open class CommandCompleteMessage protected () extends StObject {
    def this(length: Double, text: String) = this()
    
    val length: Double = js.native
    
    val name: MessageName = js.native
    
    val text: String = js.native
  }
  
  @JSImport("pg-protocol/dist/messages", "CopyDataMessage")
  @js.native
  open class CopyDataMessage protected () extends StObject {
    def this(length: Double, chunk: Buffer) = this()
    
    val chunk: Buffer = js.native
    
    val length: Double = js.native
    
    val name: /* "copyData" */ String = js.native
  }
  
  @JSImport("pg-protocol/dist/messages", "CopyResponse")
  @js.native
  open class CopyResponse protected () extends StObject {
    def this(length: Double, name: MessageName, binary: Boolean, columnCount: Double) = this()
    
    val binary: Boolean = js.native
    
    val columnTypes: js.Array[Double] = js.native
    
    val length: Double = js.native
    
    val name: MessageName = js.native
  }
  
  @JSImport("pg-protocol/dist/messages", "DataRowMessage")
  @js.native
  open class DataRowMessage protected () extends StObject {
    def this(length: Double, fields: js.Array[Any]) = this()
    
    val fieldCount: Double = js.native
    
    var fields: js.Array[Any] = js.native
    
    var length: Double = js.native
    
    val name: MessageName = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.pgProtocol.distMessagesMod.NoticeOrError because var conflicts: message. Inlined severity, code, detail, hint, position, internalPosition, internalQuery, where, schema, table, column, dataType, constraint, file, line, routine */ @JSImport("pg-protocol/dist/messages", "DatabaseError")
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
  
  @JSImport("pg-protocol/dist/messages", "Field")
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
  
  @JSImport("pg-protocol/dist/messages", "NoticeMessage")
  @js.native
  open class NoticeMessage protected ()
    extends StObject
       with BackendMessage
       with NoticeOrError {
    def this(length: Double) = this()
    def this(length: Double, message: String) = this()
    
    /* CompleteClass */
    var length: Double = js.native
    
    /* CompleteClass */
    var name: MessageName = js.native
    @JSName("name")
    val name_NoticeMessage: /* "notice" */ String = js.native
  }
  
  @JSImport("pg-protocol/dist/messages", "NotificationResponseMessage")
  @js.native
  open class NotificationResponseMessage protected () extends StObject {
    def this(length: Double, processId: Double, channel: String, payload: String) = this()
    
    val channel: String = js.native
    
    val length: Double = js.native
    
    val name: MessageName = js.native
    
    val payload: String = js.native
    
    val processId: Double = js.native
  }
  
  @JSImport("pg-protocol/dist/messages", "ParameterDescriptionMessage")
  @js.native
  open class ParameterDescriptionMessage protected () extends StObject {
    def this(length: Double, parameterCount: Double) = this()
    
    val dataTypeIDs: js.Array[Double] = js.native
    
    val length: Double = js.native
    
    val name: MessageName = js.native
    
    val parameterCount: Double = js.native
  }
  
  @JSImport("pg-protocol/dist/messages", "ParameterStatusMessage")
  @js.native
  open class ParameterStatusMessage protected () extends StObject {
    def this(length: Double, parameterName: String, parameterValue: String) = this()
    
    val length: Double = js.native
    
    val name: MessageName = js.native
    
    val parameterName: String = js.native
    
    val parameterValue: String = js.native
  }
  
  @JSImport("pg-protocol/dist/messages", "ReadyForQueryMessage")
  @js.native
  open class ReadyForQueryMessage protected () extends StObject {
    def this(length: Double, status: String) = this()
    
    val length: Double = js.native
    
    val name: MessageName = js.native
    
    val status: String = js.native
  }
  
  @JSImport("pg-protocol/dist/messages", "RowDescriptionMessage")
  @js.native
  open class RowDescriptionMessage protected () extends StObject {
    def this(length: Double, fieldCount: Double) = this()
    
    val fieldCount: Double = js.native
    
    val fields: js.Array[Field] = js.native
    
    val length: Double = js.native
    
    val name: MessageName = js.native
  }
  
  @JSImport("pg-protocol/dist/messages", "bindComplete")
  @js.native
  val bindComplete: BackendMessage = js.native
  
  @JSImport("pg-protocol/dist/messages", "closeComplete")
  @js.native
  val closeComplete: BackendMessage = js.native
  
  @JSImport("pg-protocol/dist/messages", "copyDone")
  @js.native
  val copyDone: BackendMessage = js.native
  
  @JSImport("pg-protocol/dist/messages", "emptyQuery")
  @js.native
  val emptyQuery: BackendMessage = js.native
  
  @JSImport("pg-protocol/dist/messages", "noData")
  @js.native
  val noData: BackendMessage = js.native
  
  @JSImport("pg-protocol/dist/messages", "parseComplete")
  @js.native
  val parseComplete: BackendMessage = js.native
  
  @JSImport("pg-protocol/dist/messages", "portalSuspended")
  @js.native
  val portalSuspended: BackendMessage = js.native
  
  @JSImport("pg-protocol/dist/messages", "replicationStart")
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
    - typings.pgProtocol.pgProtocolStrings.parameterDescription
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
  trait MessageName extends StObject
  object MessageName {
    
    inline def authenticationCleartextPassword: typings.pgProtocol.pgProtocolStrings.authenticationCleartextPassword = "authenticationCleartextPassword".asInstanceOf[typings.pgProtocol.pgProtocolStrings.authenticationCleartextPassword]
    
    inline def authenticationMD5Password: typings.pgProtocol.pgProtocolStrings.authenticationMD5Password = "authenticationMD5Password".asInstanceOf[typings.pgProtocol.pgProtocolStrings.authenticationMD5Password]
    
    inline def authenticationOk: typings.pgProtocol.pgProtocolStrings.authenticationOk = "authenticationOk".asInstanceOf[typings.pgProtocol.pgProtocolStrings.authenticationOk]
    
    inline def authenticationSASL: typings.pgProtocol.pgProtocolStrings.authenticationSASL = "authenticationSASL".asInstanceOf[typings.pgProtocol.pgProtocolStrings.authenticationSASL]
    
    inline def authenticationSASLContinue: typings.pgProtocol.pgProtocolStrings.authenticationSASLContinue = "authenticationSASLContinue".asInstanceOf[typings.pgProtocol.pgProtocolStrings.authenticationSASLContinue]
    
    inline def authenticationSASLFinal: typings.pgProtocol.pgProtocolStrings.authenticationSASLFinal = "authenticationSASLFinal".asInstanceOf[typings.pgProtocol.pgProtocolStrings.authenticationSASLFinal]
    
    inline def backendKeyData: typings.pgProtocol.pgProtocolStrings.backendKeyData = "backendKeyData".asInstanceOf[typings.pgProtocol.pgProtocolStrings.backendKeyData]
    
    inline def bindComplete: typings.pgProtocol.pgProtocolStrings.bindComplete = "bindComplete".asInstanceOf[typings.pgProtocol.pgProtocolStrings.bindComplete]
    
    inline def closeComplete: typings.pgProtocol.pgProtocolStrings.closeComplete = "closeComplete".asInstanceOf[typings.pgProtocol.pgProtocolStrings.closeComplete]
    
    inline def commandComplete: typings.pgProtocol.pgProtocolStrings.commandComplete = "commandComplete".asInstanceOf[typings.pgProtocol.pgProtocolStrings.commandComplete]
    
    inline def copyData: typings.pgProtocol.pgProtocolStrings.copyData = "copyData".asInstanceOf[typings.pgProtocol.pgProtocolStrings.copyData]
    
    inline def copyDone: typings.pgProtocol.pgProtocolStrings.copyDone = "copyDone".asInstanceOf[typings.pgProtocol.pgProtocolStrings.copyDone]
    
    inline def copyInResponse: typings.pgProtocol.pgProtocolStrings.copyInResponse = "copyInResponse".asInstanceOf[typings.pgProtocol.pgProtocolStrings.copyInResponse]
    
    inline def copyOutResponse: typings.pgProtocol.pgProtocolStrings.copyOutResponse = "copyOutResponse".asInstanceOf[typings.pgProtocol.pgProtocolStrings.copyOutResponse]
    
    inline def dataRow: typings.pgProtocol.pgProtocolStrings.dataRow = "dataRow".asInstanceOf[typings.pgProtocol.pgProtocolStrings.dataRow]
    
    inline def emptyQuery: typings.pgProtocol.pgProtocolStrings.emptyQuery = "emptyQuery".asInstanceOf[typings.pgProtocol.pgProtocolStrings.emptyQuery]
    
    inline def error: typings.pgProtocol.pgProtocolStrings.error = "error".asInstanceOf[typings.pgProtocol.pgProtocolStrings.error]
    
    inline def noData: typings.pgProtocol.pgProtocolStrings.noData = "noData".asInstanceOf[typings.pgProtocol.pgProtocolStrings.noData]
    
    inline def notice: typings.pgProtocol.pgProtocolStrings.notice = "notice".asInstanceOf[typings.pgProtocol.pgProtocolStrings.notice]
    
    inline def notification: typings.pgProtocol.pgProtocolStrings.notification = "notification".asInstanceOf[typings.pgProtocol.pgProtocolStrings.notification]
    
    inline def parameterDescription: typings.pgProtocol.pgProtocolStrings.parameterDescription = "parameterDescription".asInstanceOf[typings.pgProtocol.pgProtocolStrings.parameterDescription]
    
    inline def parameterStatus: typings.pgProtocol.pgProtocolStrings.parameterStatus = "parameterStatus".asInstanceOf[typings.pgProtocol.pgProtocolStrings.parameterStatus]
    
    inline def parseComplete: typings.pgProtocol.pgProtocolStrings.parseComplete = "parseComplete".asInstanceOf[typings.pgProtocol.pgProtocolStrings.parseComplete]
    
    inline def portalSuspended: typings.pgProtocol.pgProtocolStrings.portalSuspended = "portalSuspended".asInstanceOf[typings.pgProtocol.pgProtocolStrings.portalSuspended]
    
    inline def readyForQuery: typings.pgProtocol.pgProtocolStrings.readyForQuery = "readyForQuery".asInstanceOf[typings.pgProtocol.pgProtocolStrings.readyForQuery]
    
    inline def replicationStart: typings.pgProtocol.pgProtocolStrings.replicationStart = "replicationStart".asInstanceOf[typings.pgProtocol.pgProtocolStrings.replicationStart]
    
    inline def rowDescription: typings.pgProtocol.pgProtocolStrings.rowDescription = "rowDescription".asInstanceOf[typings.pgProtocol.pgProtocolStrings.rowDescription]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.pgProtocol.pgProtocolStrings.text
    - typings.pgProtocol.pgProtocolStrings.binary
  */
  trait Mode extends StObject
  object Mode {
    
    inline def binary: typings.pgProtocol.pgProtocolStrings.binary = "binary".asInstanceOf[typings.pgProtocol.pgProtocolStrings.binary]
    
    inline def text: typings.pgProtocol.pgProtocolStrings.text = "text".asInstanceOf[typings.pgProtocol.pgProtocolStrings.text]
  }
  
  trait NoticeOrError extends StObject {
    
    var code: js.UndefOr[String] = js.undefined
    
    var column: js.UndefOr[String] = js.undefined
    
    var constraint: js.UndefOr[String] = js.undefined
    
    var dataType: js.UndefOr[String] = js.undefined
    
    var detail: js.UndefOr[String] = js.undefined
    
    var file: js.UndefOr[String] = js.undefined
    
    var hint: js.UndefOr[String] = js.undefined
    
    var internalPosition: js.UndefOr[String] = js.undefined
    
    var internalQuery: js.UndefOr[String] = js.undefined
    
    var line: js.UndefOr[String] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
    
    var position: js.UndefOr[String] = js.undefined
    
    var routine: js.UndefOr[String] = js.undefined
    
    var schema: js.UndefOr[String] = js.undefined
    
    var severity: js.UndefOr[String] = js.undefined
    
    var table: js.UndefOr[String] = js.undefined
    
    var where: js.UndefOr[String] = js.undefined
  }
  object NoticeOrError {
    
    inline def apply(): NoticeOrError = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NoticeOrError]
    }
    
    extension [Self <: NoticeOrError](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setColumn(value: String): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setConstraint(value: String): Self = StObject.set(x, "constraint", value.asInstanceOf[js.Any])
      
      inline def setConstraintUndefined: Self = StObject.set(x, "constraint", js.undefined)
      
      inline def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
      
      inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
      
      inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
      
      inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
      
      inline def setInternalPosition(value: String): Self = StObject.set(x, "internalPosition", value.asInstanceOf[js.Any])
      
      inline def setInternalPositionUndefined: Self = StObject.set(x, "internalPosition", js.undefined)
      
      inline def setInternalQuery(value: String): Self = StObject.set(x, "internalQuery", value.asInstanceOf[js.Any])
      
      inline def setInternalQueryUndefined: Self = StObject.set(x, "internalQuery", js.undefined)
      
      inline def setLine(value: String): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setRoutine(value: String): Self = StObject.set(x, "routine", value.asInstanceOf[js.Any])
      
      inline def setRoutineUndefined: Self = StObject.set(x, "routine", js.undefined)
      
      inline def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
      
      inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
      
      inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
      
      inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
      
      inline def setWhere(value: String): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
      
      inline def setWhereUndefined: Self = StObject.set(x, "where", js.undefined)
    }
  }
}
