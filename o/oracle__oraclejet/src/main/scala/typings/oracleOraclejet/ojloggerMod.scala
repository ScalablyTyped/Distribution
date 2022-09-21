package typings.oracleOraclejet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojloggerMod {
  
  @JSImport("@oracle/oraclejet/ojlogger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@oracle/oraclejet/ojlogger", "LEVEL_ERROR")
  @js.native
  def LEVEL_ERROR: Double = js.native
  inline def LEVEL_ERROR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEVEL_ERROR")(x.asInstanceOf[js.Any])
  
  @JSImport("@oracle/oraclejet/ojlogger", "LEVEL_INFO")
  @js.native
  def LEVEL_INFO: Double = js.native
  inline def LEVEL_INFO_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEVEL_INFO")(x.asInstanceOf[js.Any])
  
  @JSImport("@oracle/oraclejet/ojlogger", "LEVEL_LOG")
  @js.native
  def LEVEL_LOG: Double = js.native
  inline def LEVEL_LOG_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEVEL_LOG")(x.asInstanceOf[js.Any])
  
  @JSImport("@oracle/oraclejet/ojlogger", "LEVEL_NONE")
  @js.native
  def LEVEL_NONE: Double = js.native
  inline def LEVEL_NONE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEVEL_NONE")(x.asInstanceOf[js.Any])
  
  @JSImport("@oracle/oraclejet/ojlogger", "LEVEL_WARN")
  @js.native
  def LEVEL_WARN: Double = js.native
  inline def LEVEL_WARN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEVEL_WARN")(x.asInstanceOf[js.Any])
  
  inline def error(args: (js.Object | String | Double)*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def info(args: (js.Object | String | Double)*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def log(args: (js.Object | String | Double)*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def option(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("option")().asInstanceOf[Any]
  inline def option(key: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("option")(key.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def option(key: String, value: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("option")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def option(key: js.Object): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("option")(key.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def option(key: js.Object, value: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("option")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def option(key: Unit, value: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("option")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def warn(args: (js.Object | String | Double)*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
}
