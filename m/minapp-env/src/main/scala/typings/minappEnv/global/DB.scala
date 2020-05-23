package typings.minappEnv.global

import typings.minappEnv.DB.DatabaseCommand
import typings.minappEnv.DB.IQueryCondition
import typings.minappEnv.DB.IServerDateOptions
import typings.minappEnv.DB.LOGIC_COMMANDS_LITERAL
import typings.minappEnv.DB.QUERY_COMMANDS_LITERAL
import typings.minappEnv.DB.UPDATE_COMMANDS_LITERAL
import typings.minappEnv.IAPIParam
import typings.minappEnv.ICloudConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// === Database ===
@JSGlobal("DB")
@js.native
object DB extends js.Object {
  @js.native
  class APIBaseContract[PROMISE_RETURN, CALLBACK_RETURN, PARAM /* <: IAPIParam[_] */, CONTEXT] ()
    extends typings.minappEnv.DB.APIBaseContract[PROMISE_RETURN, CALLBACK_RETURN, PARAM, CONTEXT] {
    /**
      * In case of callback-style invocation, this function will be called
      */
    /* CompleteClass */
    override def getCallbackReturn(param: PARAM, context: CONTEXT): CALLBACK_RETURN = js.native
    /* CompleteClass */
    override def getContext(param: PARAM): CONTEXT = js.native
    /* CompleteClass */
    override def getFinalParam[T /* <: PARAM */](param: PARAM, context: CONTEXT): T = js.native
    /* CompleteClass */
    override def run[T /* <: PARAM */](param: T): typings.minappEnv.Promise[PROMISE_RETURN] = js.native
  }
  
  @js.native
  class Batch ()
    extends typings.minappEnv.DB.Batch
  
  @js.native
  class CollectionReference protected ()
    extends typings.minappEnv.DB.CollectionReference {
    protected def this(name: java.lang.String, database: typings.minappEnv.DB.Database) = this()
  }
  
  @js.native
  class Database protected ()
    extends typings.minappEnv.DB.Database {
    /* CompleteClass */
    override val Geo: typings.minappEnv.DB.Geo = js.native
    /* CompleteClass */
    override val command: DatabaseCommand = js.native
    /* CompleteClass */
    override val config: ICloudConfig = js.native
    /* CompleteClass */
    override def collection(collectionName: java.lang.String): typings.minappEnv.DB.CollectionReference = js.native
    /* CompleteClass */
    override def serverDate(): typings.minappEnv.DB.ServerDate = js.native
  }
  
  @js.native
  class DatabaseLogicCommand ()
    extends typings.minappEnv.DB.DatabaseLogicCommand {
    /* CompleteClass */
    override var fieldName: java.lang.String | typings.minappEnv.InternalSymbol = js.native
    /* CompleteClass */
    override var operands: typings.minappEnv.Array[_] = js.native
    /* CompleteClass */
    override var operator: LOGIC_COMMANDS_LITERAL | java.lang.String = js.native
    /* CompleteClass */
    override def _setFieldName(fieldName: java.lang.String): typings.minappEnv.DB.DatabaseLogicCommand = js.native
    /* CompleteClass */
    override def and(expressions: (typings.minappEnv.DB.DatabaseLogicCommand | IQueryCondition)*): typings.minappEnv.DB.DatabaseLogicCommand = js.native
    /* CompleteClass */
    override def or(expressions: (typings.minappEnv.DB.DatabaseLogicCommand | IQueryCondition)*): typings.minappEnv.DB.DatabaseLogicCommand = js.native
  }
  
  @js.native
  class DatabaseQueryCommand ()
    extends typings.minappEnv.DB.DatabaseQueryCommand {
    /* CompleteClass */
    override var fieldName: java.lang.String | typings.minappEnv.InternalSymbol = js.native
    /* CompleteClass */
    override var operands: typings.minappEnv.Array[_] = js.native
    /* CompleteClass */
    override var operator: LOGIC_COMMANDS_LITERAL | java.lang.String = js.native
    /* CompleteClass */
    @JSName("operator")
    override var operator_DatabaseQueryCommand: QUERY_COMMANDS_LITERAL | java.lang.String = js.native
    /* CompleteClass */
    override def _setFieldName(fieldName: java.lang.String): typings.minappEnv.DB.DatabaseLogicCommand = js.native
    /* CompleteClass */
    override def and(expressions: (typings.minappEnv.DB.DatabaseLogicCommand | IQueryCondition)*): typings.minappEnv.DB.DatabaseLogicCommand = js.native
    /* CompleteClass */
    override def eq(`val`: js.Any): typings.minappEnv.DB.DatabaseLogicCommand = js.native
    /* CompleteClass */
    override def gt(`val`: js.Any): typings.minappEnv.DB.DatabaseLogicCommand = js.native
    /* CompleteClass */
    override def gte(`val`: js.Any): typings.minappEnv.DB.DatabaseLogicCommand = js.native
    /* CompleteClass */
    override def in(`val`: typings.minappEnv.Array[_]): typings.minappEnv.DB.DatabaseLogicCommand = js.native
    /* CompleteClass */
    override def lt(`val`: js.Any): typings.minappEnv.DB.DatabaseLogicCommand = js.native
    /* CompleteClass */
    override def lte(`val`: js.Any): typings.minappEnv.DB.DatabaseLogicCommand = js.native
    /* CompleteClass */
    override def neq(`val`: js.Any): typings.minappEnv.DB.DatabaseLogicCommand = js.native
    /* CompleteClass */
    override def nin(`val`: typings.minappEnv.Array[_]): typings.minappEnv.DB.DatabaseLogicCommand = js.native
    /* CompleteClass */
    override def or(expressions: (typings.minappEnv.DB.DatabaseLogicCommand | IQueryCondition)*): typings.minappEnv.DB.DatabaseLogicCommand = js.native
  }
  
  @js.native
  class DatabaseUpdateCommand protected ()
    extends typings.minappEnv.DB.DatabaseUpdateCommand {
    def this(operator: UPDATE_COMMANDS_LITERAL, operands: typings.minappEnv.Array[_]) = this()
    def this(
      operator: UPDATE_COMMANDS_LITERAL,
      operands: typings.minappEnv.Array[_],
      fieldName: java.lang.String
    ) = this()
    def this(
      operator: UPDATE_COMMANDS_LITERAL,
      operands: typings.minappEnv.Array[_],
      fieldName: typings.minappEnv.InternalSymbol
    ) = this()
    /* CompleteClass */
    override var fieldName: java.lang.String | typings.minappEnv.InternalSymbol = js.native
    /* CompleteClass */
    override var operands: typings.minappEnv.Array[_] = js.native
    /* CompleteClass */
    override var operator: UPDATE_COMMANDS_LITERAL = js.native
    /* CompleteClass */
    override def _setFieldName(fieldName: java.lang.String): typings.minappEnv.DB.DatabaseUpdateCommand = js.native
  }
  
  @js.native
  class DocumentReference protected ()
    extends typings.minappEnv.DB.DocumentReference {
    protected def this(docId: java.lang.String, database: typings.minappEnv.DB.Database) = this()
    protected def this(docId: Double, database: typings.minappEnv.DB.Database) = this()
  }
  
  @js.native
  abstract class GeoPoint protected ()
    extends typings.minappEnv.DB.GeoPoint {
    def this(longitude: Double, latitude: Double) = this()
    /* CompleteClass */
    override var latitude: Double = js.native
    /* CompleteClass */
    override var longitude: Double = js.native
    /* CompleteClass */
    override def toJSON(): js.Object = js.native
  }
  
  @js.native
  class Query ()
    extends typings.minappEnv.DB.Query
  
  @js.native
  abstract class ServerDate ()
    extends typings.minappEnv.DB.ServerDate {
    def this(options: IServerDateOptions) = this()
    /* CompleteClass */
    override val options: IServerDateOptions = js.native
  }
  
  @js.native
  object LOGIC_COMMANDS_LITERAL extends js.Object {
    /* "and" */ val AND: typings.minappEnv.DB.LOGIC_COMMANDS_LITERAL.AND with java.lang.String = js.native
    /* "nor" */ val NOR: typings.minappEnv.DB.LOGIC_COMMANDS_LITERAL.NOR with java.lang.String = js.native
    /* "not" */ val NOT: typings.minappEnv.DB.LOGIC_COMMANDS_LITERAL.NOT with java.lang.String = js.native
    /* "or" */ val OR: typings.minappEnv.DB.LOGIC_COMMANDS_LITERAL.OR with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[typings.minappEnv.DB.LOGIC_COMMANDS_LITERAL with java.lang.String] = js.native
  }
  
  @js.native
  object QUERY_COMMANDS_LITERAL extends js.Object {
    /* "eq" */ val EQ: typings.minappEnv.DB.QUERY_COMMANDS_LITERAL.EQ with java.lang.String = js.native
    /* "gt" */ val GT: typings.minappEnv.DB.QUERY_COMMANDS_LITERAL.GT with java.lang.String = js.native
    /* "gte" */ val GTE: typings.minappEnv.DB.QUERY_COMMANDS_LITERAL.GTE with java.lang.String = js.native
    /* "in" */ val IN: typings.minappEnv.DB.QUERY_COMMANDS_LITERAL.IN with java.lang.String = js.native
    /* "lt" */ val LT: typings.minappEnv.DB.QUERY_COMMANDS_LITERAL.LT with java.lang.String = js.native
    /* "lte" */ val LTE: typings.minappEnv.DB.QUERY_COMMANDS_LITERAL.LTE with java.lang.String = js.native
    /* "neq" */ val NEQ: typings.minappEnv.DB.QUERY_COMMANDS_LITERAL.NEQ with java.lang.String = js.native
    /* "nin" */ val NIN: typings.minappEnv.DB.QUERY_COMMANDS_LITERAL.NIN with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[typings.minappEnv.DB.QUERY_COMMANDS_LITERAL with java.lang.String] = js.native
  }
  
  @js.native
  object UPDATE_COMMANDS_LITERAL extends js.Object {
    /* "inc" */ val INC: typings.minappEnv.DB.UPDATE_COMMANDS_LITERAL.INC with java.lang.String = js.native
    /* "mul" */ val MUL: typings.minappEnv.DB.UPDATE_COMMANDS_LITERAL.MUL with java.lang.String = js.native
    /* "pop" */ val POP: typings.minappEnv.DB.UPDATE_COMMANDS_LITERAL.POP with java.lang.String = js.native
    /* "push" */ val PUSH: typings.minappEnv.DB.UPDATE_COMMANDS_LITERAL.PUSH with java.lang.String = js.native
    /* "remove" */ val REMOVE: typings.minappEnv.DB.UPDATE_COMMANDS_LITERAL.REMOVE with java.lang.String = js.native
    /* "set" */ val SET: typings.minappEnv.DB.UPDATE_COMMANDS_LITERAL.SET with java.lang.String = js.native
    /* "shift" */ val SHIFT: typings.minappEnv.DB.UPDATE_COMMANDS_LITERAL.SHIFT with java.lang.String = js.native
    /* "unshift" */ val UNSHIFT: typings.minappEnv.DB.UPDATE_COMMANDS_LITERAL.UNSHIFT with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[typings.minappEnv.DB.UPDATE_COMMANDS_LITERAL with java.lang.String] = js.native
  }
  
}

