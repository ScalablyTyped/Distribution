package typings.mpvScript

import typings.mpvScript.mp.AddKeyBindingFlags
import typings.mpvScript.mp.FileInfo
import typings.mpvScript.mp.LogLevel
import typings.mpvScript.mp.OSDOverlay
import typings.mpvScript.mp.OSDSize
import typings.mpvScript.mpvScriptBooleans.`true`
import typings.mpvScript.mpvScriptStrings.`ass-events`
import typings.mpvScript.mpvScriptStrings.all
import typings.mpvScript.mpvScriptStrings.bool
import typings.mpvScript.mpvScriptStrings.dirs
import typings.mpvScript.mpvScriptStrings.files
import typings.mpvScript.mpvScriptStrings.native
import typings.mpvScript.mpvScriptStrings.none
import typings.mpvScript.mpvScriptStrings.normal
import typings.mpvScript.mpvScriptStrings.number
import typings.mpvScript.mpvScriptStrings.string
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  inline def dump(msg: Any*): Unit = js.Dynamic.global.applyDynamic("dump")(msg.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def exit(): Unit = js.Dynamic.global.applyDynamic("exit")().asInstanceOf[Unit]
  
  object mp {
    
    @JSGlobal("mp")
    @js.native
    val ^ : js.Any = js.native
    
    inline def abortAsyncCommand(t: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("abort_async_command")(t.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def addForcedKeyBinding(key: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("add_forced_key_binding")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def addForcedKeyBinding(key: String, name: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add_forced_key_binding")(key.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addForcedKeyBinding(key: String, name: String, fn: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add_forced_key_binding")(key.asInstanceOf[js.Any], name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addForcedKeyBinding(key: String, name: String, fn: js.Function0[Unit], flags: AddKeyBindingFlags): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add_forced_key_binding")(key.asInstanceOf[js.Any], name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addForcedKeyBinding(key: String, name: String, fn: Unit, flags: AddKeyBindingFlags): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add_forced_key_binding")(key.asInstanceOf[js.Any], name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addForcedKeyBinding(key: String, name: Unit, fn: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add_forced_key_binding")(key.asInstanceOf[js.Any], name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addForcedKeyBinding(key: String, name: Unit, fn: js.Function0[Unit], flags: AddKeyBindingFlags): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add_forced_key_binding")(key.asInstanceOf[js.Any], name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addForcedKeyBinding(key: String, name: Unit, fn: Unit, flags: AddKeyBindingFlags): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add_forced_key_binding")(key.asInstanceOf[js.Any], name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addHook(name: String, priority: Double, fn: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add_hook")(name.asInstanceOf[js.Any], priority.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addKeyBinding(key: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("add_key_binding")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def addKeyBinding(key: String, name: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add_key_binding")(key.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addKeyBinding(key: String, name: String, fn: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add_key_binding")(key.asInstanceOf[js.Any], name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addKeyBinding(key: String, name: String, fn: js.Function0[Unit], flags: AddKeyBindingFlags): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add_key_binding")(key.asInstanceOf[js.Any], name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addKeyBinding(key: String, name: String, fn: Unit, flags: AddKeyBindingFlags): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add_key_binding")(key.asInstanceOf[js.Any], name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addKeyBinding(key: String, name: Unit, fn: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add_key_binding")(key.asInstanceOf[js.Any], name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addKeyBinding(key: String, name: Unit, fn: js.Function0[Unit], flags: AddKeyBindingFlags): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add_key_binding")(key.asInstanceOf[js.Any], name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addKeyBinding(key: String, name: Unit, fn: Unit, flags: AddKeyBindingFlags): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add_key_binding")(key.asInstanceOf[js.Any], name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def command(command: String): js.UndefOr[`true`] = ^.asInstanceOf[js.Dynamic].applyDynamic("command")(command.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[`true`]]
    
    inline def commandNative(table: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("command_native")(table.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def commandNative(table: Any, `def`: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("command_native")(table.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def commandNativeAsync(table: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("command_native_async")(table.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def commandNativeAsync(
      table: Any,
      fn: js.Function3[/* success */ Boolean, /* result */ Any, /* error */ js.UndefOr[String], Unit]
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("command_native_async")(table.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def commandv(args: String*): js.UndefOr[`true`] = ^.asInstanceOf[js.Dynamic].applyDynamic("commandv")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.UndefOr[`true`]]
    
    inline def createOsdOverlay_assevents(format: `ass-events`): OSDOverlay = ^.asInstanceOf[js.Dynamic].applyDynamic("create_osd_overlay")(format.asInstanceOf[js.Any]).asInstanceOf[OSDOverlay]
    
    inline def enableMessages(level: LogLevel): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable_messages")(level.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def getOpt(key: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("get_opt")(key.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getOsdSize(): js.UndefOr[OSDSize] = ^.asInstanceOf[js.Dynamic].applyDynamic("get_osd_size")().asInstanceOf[js.UndefOr[OSDSize]]
    
    inline def getProperty(name: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("get_property")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
    inline def getProperty(name: String, `def`: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("get_property")(name.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def getPropertyBool(name: String): js.UndefOr[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("get_property_bool")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Boolean]]
    inline def getPropertyBool(name: String, `def`: Boolean): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("get_property_bool")(name.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
    
    inline def getPropertyBool_Boolean(name: String, `def`: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("get_property_bool")(name.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def getPropertyNative(name: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get_property_native")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def getPropertyNative(name: String, `def`: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get_property_native")(name.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getPropertyNumber(name: String): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("get_property_number")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
    inline def getPropertyNumber(name: String, `def`: Double): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("get_property_number")(name.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
    
    inline def getPropertyNumber_Double(name: String, `def`: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("get_property_number")(name.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def getPropertyOsd(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("get_property_osd")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def getPropertyOsd(name: String, `def`: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("get_property_osd")(name.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def getProperty_Union(name: String, `def`: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("get_property")(name.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
    
    inline def getScriptFile(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("get_script_file")().asInstanceOf[String]
    
    inline def getScriptName(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("get_script_name")().asInstanceOf[String]
    
    inline def getTime(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("get_time")().asInstanceOf[Double]
    
    inline def getTimeMs(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("get_time_ms")().asInstanceOf[Double]
    
    inline def lastError(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("last_error")().asInstanceOf[String]
    
    @JSGlobal("mp.module_paths")
    @js.native
    def modulePaths: js.Array[String] = js.native
    
    inline def modulePaths_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("module_paths")(x.asInstanceOf[js.Any])
    
    object msg {
      
      @JSGlobal("mp.msg")
      @js.native
      val ^ : js.Any = js.native
      
      inline def debug(msg: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(msg.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
      
      inline def error(msg: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(msg.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
      
      inline def fatal(msg: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fatal")(msg.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
      
      inline def info(msg: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(msg.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
      
      inline def log(level: LogLevel, msg: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(List(level.asInstanceOf[js.Any]).`++`(msg.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
      
      inline def trace(msg: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trace")(msg.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
      
      inline def verbose(msg: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("verbose")(msg.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
      
      inline def warn(msg: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(msg.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    }
    
    inline def observeProperty(name: String, `type`: Unit, fn: js.Function1[/* name */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("observe_property")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def observeProperty_bool(
      name: String,
      `type`: bool,
      fn: js.Function2[/* name */ String, /* value */ js.UndefOr[Boolean], Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("observe_property")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def observeProperty_native(name: String, `type`: native, fn: js.Function2[/* name */ String, /* value */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("observe_property")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def observeProperty_none(name: String, `type`: none, fn: js.Function1[/* name */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("observe_property")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def observeProperty_number(
      name: String,
      `type`: number,
      fn: js.Function2[/* name */ String, /* value */ js.UndefOr[Double], Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("observe_property")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def observeProperty_string(
      name: String,
      `type`: string,
      fn: js.Function2[/* name */ String, /* value */ js.UndefOr[String], Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("observe_property")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    object options {
      
      @JSGlobal("mp.options")
      @js.native
      val ^ : js.Any = js.native
      
      inline def readOptions(table: Record[String, String | Boolean | Double]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("read_options")(table.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def readOptions(table: Record[String, String | Boolean | Double], identifier: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read_options")(table.asInstanceOf[js.Any], identifier.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def readOptions(
        table: Record[String, String | Boolean | Double],
        identifier: String,
        on_update: js.Function1[/* list */ Record[String, js.UndefOr[Boolean]], Unit]
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read_options")(table.asInstanceOf[js.Any], identifier.asInstanceOf[js.Any], on_update.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def readOptions(
        table: Record[String, String | Boolean | Double],
        identifier: Unit,
        on_update: js.Function1[/* list */ Record[String, js.UndefOr[Boolean]], Unit]
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read_options")(table.asInstanceOf[js.Any], identifier.asInstanceOf[js.Any], on_update.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
    
    inline def osdMessage(text: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("osd_message")(text.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def osdMessage(text: String, duration: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("osd_message")(text.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def registerEvent(name: String, fn: js.Function1[/* event */ Record[String, Any], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register_event")(name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def registerIdle(fn: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register_idle")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def registerScriptMessage(name: String, fn: js.Function1[/* repeated */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register_script_message")(name.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeKeyBinding(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove_key_binding")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def setProperty(name: String, value: String): js.UndefOr[`true`] = (^.asInstanceOf[js.Dynamic].applyDynamic("set_property")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[`true`]]
    
    inline def setPropertyBool(name: String, value: Boolean): js.UndefOr[`true`] = (^.asInstanceOf[js.Dynamic].applyDynamic("set_property_bool")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[`true`]]
    
    inline def setPropertyNative(name: String, value: Any): js.UndefOr[`true`] = (^.asInstanceOf[js.Dynamic].applyDynamic("set_property_native")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[`true`]]
    
    inline def setPropertyNumber(name: String, value: Double): js.UndefOr[`true`] = (^.asInstanceOf[js.Dynamic].applyDynamic("set_property_number")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[`true`]]
    
    inline def unobserveProperty(fn: js.Function1[/* repeated */ Any, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unobserve_property")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def unregisterEvent(fn: js.Function1[/* repeated */ Any, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister_event")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def unregisterIdle(fn: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister_idle")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def unregisterScriptMessage(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister_script_message")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    object utils {
      
      @JSGlobal("mp.utils")
      @js.native
      val ^ : js.Any = js.native
      
      inline def compileJs(fname: String, content_str: String): js.Function1[/* repeated */ Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("compile_js")(fname.asInstanceOf[js.Any], content_str.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ Any, Any]]
      
      inline def fileInfo(path: String): js.UndefOr[FileInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("file_info")(path.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[FileInfo]]
      
      inline def getUserPath(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("get_user_path")(path.asInstanceOf[js.Any]).asInstanceOf[String]
      
      inline def getcwd(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getcwd")().asInstanceOf[js.UndefOr[String]]
      
      inline def getenv(name: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getenv")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
      
      inline def getpid(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getpid")().asInstanceOf[Double]
      
      inline def joinPath(p1: String, p2: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("join_path")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any])).asInstanceOf[String]
      
      inline def readFile(fname: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("read_file")(fname.asInstanceOf[js.Any]).asInstanceOf[String]
      inline def readFile(fname: String, max: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("read_file")(fname.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[String]
      
      inline def readdir(path: String): js.UndefOr[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[String]]]
      inline def readdir(path: String, filter: files | dirs | normal | all): js.UndefOr[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[String]]]
      
      inline def splitPath(path: String): js.Tuple2[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("split_path")(path.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[String, String]]
      
      inline def writeFile(fname: String, str: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write_file")(fname.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
  
  inline def print(msg: Any*): Unit = js.Dynamic.global.applyDynamic("print")(msg.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
}
