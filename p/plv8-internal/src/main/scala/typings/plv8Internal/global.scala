package typings.plv8Internal

import typings.plv8Internal.LoggingLevel.DEBUG1
import typings.plv8Internal.LoggingLevel.DEBUG2
import typings.plv8Internal.LoggingLevel.DEBUG3
import typings.plv8Internal.LoggingLevel.DEBUG4
import typings.plv8Internal.LoggingLevel.DEBUG5
import typings.plv8Internal.LoggingLevel.ERROR
import typings.plv8Internal.LoggingLevel.INFO
import typings.plv8Internal.LoggingLevel.LOG
import typings.plv8Internal.LoggingLevel.NOTICE
import typings.plv8Internal.LoggingLevel.WARNING
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("DEBUG1")
  @js.native
  def DEBUG1: typings.plv8Internal.LoggingLevel.DEBUG1 = js.native
  inline def DEBUG1_=(x: DEBUG1): Unit = js.Dynamic.global.updateDynamic("DEBUG1")(x.asInstanceOf[js.Any])
  
  @JSGlobal("DEBUG2")
  @js.native
  def DEBUG2: typings.plv8Internal.LoggingLevel.DEBUG2 = js.native
  inline def DEBUG2_=(x: DEBUG2): Unit = js.Dynamic.global.updateDynamic("DEBUG2")(x.asInstanceOf[js.Any])
  
  @JSGlobal("DEBUG3")
  @js.native
  def DEBUG3: typings.plv8Internal.LoggingLevel.DEBUG3 = js.native
  inline def DEBUG3_=(x: DEBUG3): Unit = js.Dynamic.global.updateDynamic("DEBUG3")(x.asInstanceOf[js.Any])
  
  @JSGlobal("DEBUG4")
  @js.native
  def DEBUG4: typings.plv8Internal.LoggingLevel.DEBUG4 = js.native
  inline def DEBUG4_=(x: DEBUG4): Unit = js.Dynamic.global.updateDynamic("DEBUG4")(x.asInstanceOf[js.Any])
  
  @JSGlobal("DEBUG5")
  @js.native
  def DEBUG5: typings.plv8Internal.LoggingLevel.DEBUG5 = js.native
  inline def DEBUG5_=(x: DEBUG5): Unit = js.Dynamic.global.updateDynamic("DEBUG5")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ERROR")
  @js.native
  def ERROR: typings.plv8Internal.LoggingLevel.ERROR = js.native
  inline def ERROR_=(x: ERROR): Unit = js.Dynamic.global.updateDynamic("ERROR")(x.asInstanceOf[js.Any])
  
  @JSGlobal("INFO")
  @js.native
  def INFO: typings.plv8Internal.LoggingLevel.INFO = js.native
  inline def INFO_=(x: INFO): Unit = js.Dynamic.global.updateDynamic("INFO")(x.asInstanceOf[js.Any])
  
  @JSGlobal("LOG")
  @js.native
  def LOG: typings.plv8Internal.LoggingLevel.LOG = js.native
  inline def LOG_=(x: LOG): Unit = js.Dynamic.global.updateDynamic("LOG")(x.asInstanceOf[js.Any])
  
  @JSGlobal("LoggingLevel")
  @js.native
  object LoggingLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.plv8Internal.LoggingLevel & Double] = js.native
    
    /* 14 */ val DEBUG1: typings.plv8Internal.LoggingLevel.DEBUG1 & Double = js.native
    
    /* 13 */ val DEBUG2: typings.plv8Internal.LoggingLevel.DEBUG2 & Double = js.native
    
    /* 12 */ val DEBUG3: typings.plv8Internal.LoggingLevel.DEBUG3 & Double = js.native
    
    /* 11 */ val DEBUG4: typings.plv8Internal.LoggingLevel.DEBUG4 & Double = js.native
    
    /* 10 */ val DEBUG5: typings.plv8Internal.LoggingLevel.DEBUG5 & Double = js.native
    
    /* 21 */ val ERROR: typings.plv8Internal.LoggingLevel.ERROR & Double = js.native
    
    /* 17 */ val INFO: typings.plv8Internal.LoggingLevel.INFO & Double = js.native
    
    /* 15 */ val LOG: typings.plv8Internal.LoggingLevel.LOG & Double = js.native
    
    /* 18 */ val NOTICE: typings.plv8Internal.LoggingLevel.NOTICE & Double = js.native
    
    /* 19 */ val WARNING: typings.plv8Internal.LoggingLevel.WARNING & Double = js.native
  }
  
  @JSGlobal("NOTICE")
  @js.native
  def NOTICE: typings.plv8Internal.LoggingLevel.NOTICE = js.native
  inline def NOTICE_=(x: NOTICE): Unit = js.Dynamic.global.updateDynamic("NOTICE")(x.asInstanceOf[js.Any])
  
  @JSGlobal("SeekType")
  @js.native
  object SeekType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.plv8Internal.SeekType & Double] = js.native
    
    /* 0 */ val WINDOW_SEEK_CURRENT: typings.plv8Internal.SeekType.WINDOW_SEEK_CURRENT & Double = js.native
    
    /* 1 */ val WINDOW_SEEK_HEAD: typings.plv8Internal.SeekType.WINDOW_SEEK_HEAD & Double = js.native
    
    /* 2 */ val WINDOW_SEEK_TAIL: typings.plv8Internal.SeekType.WINDOW_SEEK_TAIL & Double = js.native
  }
  
  @JSGlobal("WARNING")
  @js.native
  def WARNING: typings.plv8Internal.LoggingLevel.WARNING = js.native
  inline def WARNING_=(x: WARNING): Unit = js.Dynamic.global.updateDynamic("WARNING")(x.asInstanceOf[js.Any])
  
  object plv8 {
    
    @JSGlobal("plv8")
    @js.native
    val ^ : js.Any = js.native
    
    inline def commit(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("commit")().asInstanceOf[Unit]
    
    inline def elog(level: LoggingLevel, message: String, messages: String*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("elog")((scala.List(level.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).`++`(messages.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Unit]
    
    inline def execute(sql: String, args: Any*): js.Array[SQLRow] = ^.asInstanceOf[js.Dynamic].applyDynamic("execute")(scala.List(sql.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Array[SQLRow]]
    
    inline def findFunction(name: String): js.Function1[/* repeated */ Any, js.Array[SQLRow]] = ^.asInstanceOf[js.Dynamic].applyDynamic("find_function")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ Any, js.Array[SQLRow]]]
    
    inline def getWindowObject(): WindowObject = ^.asInstanceOf[js.Dynamic].applyDynamic("get_window_object")().asInstanceOf[WindowObject]
    
    inline def memoryUsage(): HeapStatistics = ^.asInstanceOf[js.Dynamic].applyDynamic("memory_usage")().asInstanceOf[HeapStatistics]
    
    inline def prepare(sql: String): PreparedPlan = ^.asInstanceOf[js.Dynamic].applyDynamic("prepare")(sql.asInstanceOf[js.Any]).asInstanceOf[PreparedPlan]
    inline def prepare(sql: String, types: js.Array[String]): PreparedPlan = (^.asInstanceOf[js.Dynamic].applyDynamic("prepare")(sql.asInstanceOf[js.Any], types.asInstanceOf[js.Any])).asInstanceOf[PreparedPlan]
    
    inline def quoteIdent(ident: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("quote_ident")(ident.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def quoteLiteral(literal: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("quote_literal")(literal.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def quoteLiteral(literal: js.Object): String = ^.asInstanceOf[js.Dynamic].applyDynamic("quote_literal")(literal.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def quoteLiteral(literal: Boolean): String = ^.asInstanceOf[js.Dynamic].applyDynamic("quote_literal")(literal.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def quoteLiteral(literal: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("quote_literal")(literal.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def quoteNullable(nullable: Any): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("quote_nullable")(nullable.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    
    inline def returnNext(tuple: SQLRow): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("return_next")(tuple.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def rollback(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("rollback")().asInstanceOf[Unit]
    
    inline def runScript(source: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("run_script")(source.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def runScript(source: String, name: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("run_script")(source.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def subtransaction(func: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("subtransaction")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSGlobal("plv8.version")
    @js.native
    val version: String = js.native
  }
}
