package typings.minappEnv.global

import typings.minappEnv.DB.IServerDateOptions
import typings.minappEnv.DB.UPDATE_COMMANDS_LITERAL
import typings.minappEnv.IAPIParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// === Database ===
object DB {
  
  @JSGlobal("DB.APIBaseContract")
  @js.native
  class APIBaseContract[PROMISE_RETURN, CALLBACK_RETURN, PARAM /* <: IAPIParam[_] */, CONTEXT] ()
    extends typings.minappEnv.DB.APIBaseContract[PROMISE_RETURN, CALLBACK_RETURN, PARAM, CONTEXT]
  
  @JSGlobal("DB.Batch")
  @js.native
  class Batch ()
    extends typings.minappEnv.DB.Batch
  
  @JSGlobal("DB.CollectionReference")
  @js.native
  class CollectionReference protected ()
    extends typings.minappEnv.DB.CollectionReference {
    protected def this(name: java.lang.String, database: typings.minappEnv.DB.Database) = this()
  }
  
  @JSGlobal("DB.Database")
  @js.native
  class Database protected ()
    extends typings.minappEnv.DB.Database
  
  @JSGlobal("DB.DatabaseLogicCommand")
  @js.native
  class DatabaseLogicCommand ()
    extends typings.minappEnv.DB.DatabaseLogicCommand
  
  @JSGlobal("DB.DatabaseQueryCommand")
  @js.native
  class DatabaseQueryCommand ()
    extends typings.minappEnv.DB.DatabaseQueryCommand
  
  @JSGlobal("DB.DatabaseUpdateCommand")
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
  }
  
  @JSGlobal("DB.DocumentReference")
  @js.native
  class DocumentReference protected ()
    extends typings.minappEnv.DB.DocumentReference {
    protected def this(docId: java.lang.String, database: typings.minappEnv.DB.Database) = this()
    protected def this(docId: Double, database: typings.minappEnv.DB.Database) = this()
  }
  
  @JSGlobal("DB.GeoPoint")
  @js.native
  abstract class GeoPoint protected ()
    extends typings.minappEnv.DB.GeoPoint {
    def this(longitude: Double, latitude: Double) = this()
  }
  
  @JSGlobal("DB.LOGIC_COMMANDS_LITERAL")
  @js.native
  object LOGIC_COMMANDS_LITERAL extends StObject {
    
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[typings.minappEnv.DB.LOGIC_COMMANDS_LITERAL with java.lang.String] = js.native
    
    /* "and" */ val AND: typings.minappEnv.DB.LOGIC_COMMANDS_LITERAL.AND with java.lang.String = js.native
    
    /* "nor" */ val NOR: typings.minappEnv.DB.LOGIC_COMMANDS_LITERAL.NOR with java.lang.String = js.native
    
    /* "not" */ val NOT: typings.minappEnv.DB.LOGIC_COMMANDS_LITERAL.NOT with java.lang.String = js.native
    
    /* "or" */ val OR: typings.minappEnv.DB.LOGIC_COMMANDS_LITERAL.OR with java.lang.String = js.native
  }
  
  @JSGlobal("DB.QUERY_COMMANDS_LITERAL")
  @js.native
  object QUERY_COMMANDS_LITERAL extends StObject {
    
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[typings.minappEnv.DB.QUERY_COMMANDS_LITERAL with java.lang.String] = js.native
    
    /* "eq" */ val EQ: typings.minappEnv.DB.QUERY_COMMANDS_LITERAL.EQ with java.lang.String = js.native
    
    /* "gt" */ val GT: typings.minappEnv.DB.QUERY_COMMANDS_LITERAL.GT with java.lang.String = js.native
    
    /* "gte" */ val GTE: typings.minappEnv.DB.QUERY_COMMANDS_LITERAL.GTE with java.lang.String = js.native
    
    /* "in" */ val IN: typings.minappEnv.DB.QUERY_COMMANDS_LITERAL.IN with java.lang.String = js.native
    
    /* "lt" */ val LT: typings.minappEnv.DB.QUERY_COMMANDS_LITERAL.LT with java.lang.String = js.native
    
    /* "lte" */ val LTE: typings.minappEnv.DB.QUERY_COMMANDS_LITERAL.LTE with java.lang.String = js.native
    
    /* "neq" */ val NEQ: typings.minappEnv.DB.QUERY_COMMANDS_LITERAL.NEQ with java.lang.String = js.native
    
    /* "nin" */ val NIN: typings.minappEnv.DB.QUERY_COMMANDS_LITERAL.NIN with java.lang.String = js.native
  }
  
  @JSGlobal("DB.Query")
  @js.native
  class Query ()
    extends typings.minappEnv.DB.Query
  
  @JSGlobal("DB.ServerDate")
  @js.native
  abstract class ServerDate ()
    extends typings.minappEnv.DB.ServerDate {
    def this(options: IServerDateOptions) = this()
  }
  
  @JSGlobal("DB.UPDATE_COMMANDS_LITERAL")
  @js.native
  object UPDATE_COMMANDS_LITERAL extends StObject {
    
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[typings.minappEnv.DB.UPDATE_COMMANDS_LITERAL with java.lang.String] = js.native
    
    /* "inc" */ val INC: typings.minappEnv.DB.UPDATE_COMMANDS_LITERAL.INC with java.lang.String = js.native
    
    /* "mul" */ val MUL: typings.minappEnv.DB.UPDATE_COMMANDS_LITERAL.MUL with java.lang.String = js.native
    
    /* "pop" */ val POP: typings.minappEnv.DB.UPDATE_COMMANDS_LITERAL.POP with java.lang.String = js.native
    
    /* "push" */ val PUSH: typings.minappEnv.DB.UPDATE_COMMANDS_LITERAL.PUSH with java.lang.String = js.native
    
    /* "remove" */ val REMOVE: typings.minappEnv.DB.UPDATE_COMMANDS_LITERAL.REMOVE with java.lang.String = js.native
    
    /* "set" */ val SET: typings.minappEnv.DB.UPDATE_COMMANDS_LITERAL.SET with java.lang.String = js.native
    
    /* "shift" */ val SHIFT: typings.minappEnv.DB.UPDATE_COMMANDS_LITERAL.SHIFT with java.lang.String = js.native
    
    /* "unshift" */ val UNSHIFT: typings.minappEnv.DB.UPDATE_COMMANDS_LITERAL.UNSHIFT with java.lang.String = js.native
  }
}
