package typings.minappEnv.global

import typings.minappEnv.DB.DatabaseCommand
import typings.minappEnv.DB.IQueryCondition
import typings.minappEnv.DB.IServerDateOptions
import typings.minappEnv.DB.LOGIC_COMMANDS_LITERAL
import typings.minappEnv.DB.QUERY_COMMANDS_LITERAL
import typings.minappEnv.DB.UPDATE_COMMANDS_LITERAL
import typings.minappEnv.IAPIParam
import typings.minappEnv.ICloudConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// === Database ===
object DB {
  
  @JSGlobal("DB.APIBaseContract")
  @js.native
  open class APIBaseContract[PROMISE_RETURN, CALLBACK_RETURN, PARAM /* <: IAPIParam[Any] */, CONTEXT] ()
    extends StObject
       with typings.minappEnv.DB.APIBaseContract[PROMISE_RETURN, CALLBACK_RETURN, PARAM, CONTEXT] {
    
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
  
  @JSGlobal("DB.Batch")
  @js.native
  open class Batch ()
    extends StObject
       with typings.minappEnv.DB.Batch
  
  @JSGlobal("DB.CollectionReference")
  @js.native
  open class CollectionReference protected ()
    extends StObject
       with typings.minappEnv.DB.CollectionReference {
    /* private */ def this(name: java.lang.String, database: typings.minappEnv.DB.Database) = this()
  }
  
  @JSGlobal("DB.Database")
  @js.native
  /* private */ open class Database ()
    extends StObject
       with typings.minappEnv.DB.Database {
    
    /* CompleteClass */
    override val Geo: typings.minappEnv.DB.Geo = js.native
    
    /* CompleteClass */
    override def collection(collectionName: java.lang.String): typings.minappEnv.DB.CollectionReference = js.native
    
    /* CompleteClass */
    override val command: DatabaseCommand = js.native
    
    /* CompleteClass */
    override val config: ICloudConfig = js.native
    
    /* CompleteClass */
    override def serverDate(): typings.minappEnv.DB.ServerDate = js.native
  }
  
  @JSGlobal("DB.DatabaseLogicCommand")
  @js.native
  open class DatabaseLogicCommand ()
    extends StObject
       with typings.minappEnv.DB.DatabaseLogicCommand {
    
    /* CompleteClass */
    override def _setFieldName(fieldName: java.lang.String): typings.minappEnv.DB.DatabaseLogicCommand = js.native
    
    /* CompleteClass */
    override def and(expressions: (typings.minappEnv.DB.DatabaseLogicCommand | IQueryCondition)*): typings.minappEnv.DB.DatabaseLogicCommand = js.native
    
    /* CompleteClass */
    var fieldName: java.lang.String | typings.minappEnv.InternalSymbol = js.native
    
    /* CompleteClass */
    var operands: typings.minappEnv.Array[Any] = js.native
    
    /* CompleteClass */
    var operator: LOGIC_COMMANDS_LITERAL | java.lang.String = js.native
    
    /* CompleteClass */
    override def or(expressions: (typings.minappEnv.DB.DatabaseLogicCommand | IQueryCondition)*): typings.minappEnv.DB.DatabaseLogicCommand = js.native
  }
  
  @JSGlobal("DB.DatabaseQueryCommand")
  @js.native
  open class DatabaseQueryCommand ()
    extends StObject
       with typings.minappEnv.DB.DatabaseQueryCommand {
    
    /* CompleteClass */
    override def _setFieldName(fieldName: java.lang.String): typings.minappEnv.DB.DatabaseLogicCommand = js.native
    
    /* CompleteClass */
    override def and(expressions: (typings.minappEnv.DB.DatabaseLogicCommand | IQueryCondition)*): typings.minappEnv.DB.DatabaseLogicCommand = js.native
    
    /* CompleteClass */
    var fieldName: java.lang.String | typings.minappEnv.InternalSymbol = js.native
    
    /* CompleteClass */
    override def gt(`val`: Any): typings.minappEnv.DB.DatabaseLogicCommand = js.native
    
    /* CompleteClass */
    override def gte(`val`: Any): typings.minappEnv.DB.DatabaseLogicCommand = js.native
    
    /* CompleteClass */
    override def in(`val`: typings.minappEnv.Array[Any]): typings.minappEnv.DB.DatabaseLogicCommand = js.native
    
    /* CompleteClass */
    override def lt(`val`: Any): typings.minappEnv.DB.DatabaseLogicCommand = js.native
    
    /* CompleteClass */
    override def lte(`val`: Any): typings.minappEnv.DB.DatabaseLogicCommand = js.native
    
    /* CompleteClass */
    override def neq(`val`: Any): typings.minappEnv.DB.DatabaseLogicCommand = js.native
    
    /* CompleteClass */
    override def nin(`val`: typings.minappEnv.Array[Any]): typings.minappEnv.DB.DatabaseLogicCommand = js.native
    
    /* CompleteClass */
    var operands: typings.minappEnv.Array[Any] = js.native
    
    /* CompleteClass */
    var operator: LOGIC_COMMANDS_LITERAL | java.lang.String = js.native
    /* CompleteClass */
    @JSName("operator")
    var operator_DatabaseQueryCommand: QUERY_COMMANDS_LITERAL | java.lang.String = js.native
    
    /* CompleteClass */
    override def or(expressions: (typings.minappEnv.DB.DatabaseLogicCommand | IQueryCondition)*): typings.minappEnv.DB.DatabaseLogicCommand = js.native
  }
  
  @JSGlobal("DB.DatabaseUpdateCommand")
  @js.native
  open class DatabaseUpdateCommand protected ()
    extends StObject
       with typings.minappEnv.DB.DatabaseUpdateCommand {
    def this(operator: UPDATE_COMMANDS_LITERAL, operands: typings.minappEnv.Array[Any]) = this()
    def this(
      operator: UPDATE_COMMANDS_LITERAL,
      operands: typings.minappEnv.Array[Any],
      fieldName: java.lang.String
    ) = this()
    def this(
      operator: UPDATE_COMMANDS_LITERAL,
      operands: typings.minappEnv.Array[Any],
      fieldName: typings.minappEnv.InternalSymbol
    ) = this()
    
    /* CompleteClass */
    override def _setFieldName(fieldName: java.lang.String): typings.minappEnv.DB.DatabaseUpdateCommand = js.native
    
    /* CompleteClass */
    var fieldName: java.lang.String | typings.minappEnv.InternalSymbol = js.native
    
    /* CompleteClass */
    var operands: typings.minappEnv.Array[Any] = js.native
    
    /* CompleteClass */
    var operator: UPDATE_COMMANDS_LITERAL = js.native
  }
  
  @JSGlobal("DB.DocumentReference")
  @js.native
  open class DocumentReference protected ()
    extends StObject
       with typings.minappEnv.DB.DocumentReference {
    /* private */ def this(docId: java.lang.String, database: typings.minappEnv.DB.Database) = this()
    /* private */ def this(docId: Double, database: typings.minappEnv.DB.Database) = this()
  }
  
  @JSGlobal("DB.GeoPoint")
  @js.native
  abstract class GeoPoint protected ()
    extends StObject
       with typings.minappEnv.DB.GeoPoint {
    def this(longitude: Double, latitude: Double) = this()
    
    /* CompleteClass */
    var latitude: Double = js.native
    
    /* CompleteClass */
    var longitude: Double = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Object = js.native
  }
  
  @JSGlobal("DB.LOGIC_COMMANDS_LITERAL")
  @js.native
  object LOGIC_COMMANDS_LITERAL extends StObject {
    
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[typings.minappEnv.DB.LOGIC_COMMANDS_LITERAL & java.lang.String] = js.native
    
    /* "and" */ val AND: typings.minappEnv.DB.LOGIC_COMMANDS_LITERAL.AND & java.lang.String = js.native
    
    /* "nor" */ val NOR: typings.minappEnv.DB.LOGIC_COMMANDS_LITERAL.NOR & java.lang.String = js.native
    
    /* "not" */ val NOT: typings.minappEnv.DB.LOGIC_COMMANDS_LITERAL.NOT & java.lang.String = js.native
    
    /* "or" */ val OR: typings.minappEnv.DB.LOGIC_COMMANDS_LITERAL.OR & java.lang.String = js.native
  }
  
  @JSGlobal("DB.QUERY_COMMANDS_LITERAL")
  @js.native
  object QUERY_COMMANDS_LITERAL extends StObject {
    
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[typings.minappEnv.DB.QUERY_COMMANDS_LITERAL & java.lang.String] = js.native
    
    /* "eq" */ val EQ: typings.minappEnv.DB.QUERY_COMMANDS_LITERAL.EQ & java.lang.String = js.native
    
    /* "gt" */ val GT: typings.minappEnv.DB.QUERY_COMMANDS_LITERAL.GT & java.lang.String = js.native
    
    /* "gte" */ val GTE: typings.minappEnv.DB.QUERY_COMMANDS_LITERAL.GTE & java.lang.String = js.native
    
    /* "in" */ val IN: typings.minappEnv.DB.QUERY_COMMANDS_LITERAL.IN & java.lang.String = js.native
    
    /* "lt" */ val LT: typings.minappEnv.DB.QUERY_COMMANDS_LITERAL.LT & java.lang.String = js.native
    
    /* "lte" */ val LTE: typings.minappEnv.DB.QUERY_COMMANDS_LITERAL.LTE & java.lang.String = js.native
    
    /* "neq" */ val NEQ: typings.minappEnv.DB.QUERY_COMMANDS_LITERAL.NEQ & java.lang.String = js.native
    
    /* "nin" */ val NIN: typings.minappEnv.DB.QUERY_COMMANDS_LITERAL.NIN & java.lang.String = js.native
  }
  
  @JSGlobal("DB.Query")
  @js.native
  open class Query ()
    extends StObject
       with typings.minappEnv.DB.Query
  
  @JSGlobal("DB.ServerDate")
  @js.native
  abstract class ServerDate ()
    extends StObject
       with typings.minappEnv.DB.ServerDate {
    def this(options: IServerDateOptions) = this()
    
    /* CompleteClass */
    override val options: IServerDateOptions = js.native
  }
  
  @JSGlobal("DB.UPDATE_COMMANDS_LITERAL")
  @js.native
  object UPDATE_COMMANDS_LITERAL extends StObject {
    
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[typings.minappEnv.DB.UPDATE_COMMANDS_LITERAL & java.lang.String] = js.native
    
    /* "inc" */ val INC: typings.minappEnv.DB.UPDATE_COMMANDS_LITERAL.INC & java.lang.String = js.native
    
    /* "mul" */ val MUL: typings.minappEnv.DB.UPDATE_COMMANDS_LITERAL.MUL & java.lang.String = js.native
    
    /* "pop" */ val POP: typings.minappEnv.DB.UPDATE_COMMANDS_LITERAL.POP & java.lang.String = js.native
    
    /* "push" */ val PUSH: typings.minappEnv.DB.UPDATE_COMMANDS_LITERAL.PUSH & java.lang.String = js.native
    
    /* "remove" */ val REMOVE: typings.minappEnv.DB.UPDATE_COMMANDS_LITERAL.REMOVE & java.lang.String = js.native
    
    /* "set" */ val SET: typings.minappEnv.DB.UPDATE_COMMANDS_LITERAL.SET & java.lang.String = js.native
    
    /* "shift" */ val SHIFT: typings.minappEnv.DB.UPDATE_COMMANDS_LITERAL.SHIFT & java.lang.String = js.native
    
    /* "unshift" */ val UNSHIFT: typings.minappEnv.DB.UPDATE_COMMANDS_LITERAL.UNSHIFT & java.lang.String = js.native
  }
}
