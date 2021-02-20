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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("dump")
  @js.native
  def dump(msg: js.Any*): Unit = js.native
  
  @JSGlobal("exit")
  @js.native
  def exit(): Unit = js.native
  
  object mp {
    
    @JSGlobal("mp")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("mp.abort_async_command")
    @js.native
    def abortAsyncCommand(t: js.Any): Unit = js.native
    
    @JSGlobal("mp.add_forced_key_binding")
    @js.native
    def addForcedKeyBinding(key: String): Unit = js.native
    @JSGlobal("mp.add_forced_key_binding")
    @js.native
    def addForcedKeyBinding(
      key: String,
      name: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      flags: AddKeyBindingFlags
    ): Unit = js.native
    @JSGlobal("mp.add_forced_key_binding")
    @js.native
    def addForcedKeyBinding(key: String, name: js.UndefOr[scala.Nothing], fn: js.Function0[Unit]): Unit = js.native
    @JSGlobal("mp.add_forced_key_binding")
    @js.native
    def addForcedKeyBinding(key: String, name: js.UndefOr[scala.Nothing], fn: js.Function0[Unit], flags: AddKeyBindingFlags): Unit = js.native
    @JSGlobal("mp.add_forced_key_binding")
    @js.native
    def addForcedKeyBinding(key: String, name: String): Unit = js.native
    @JSGlobal("mp.add_forced_key_binding")
    @js.native
    def addForcedKeyBinding(key: String, name: String, fn: js.UndefOr[scala.Nothing], flags: AddKeyBindingFlags): Unit = js.native
    @JSGlobal("mp.add_forced_key_binding")
    @js.native
    def addForcedKeyBinding(key: String, name: String, fn: js.Function0[Unit]): Unit = js.native
    @JSGlobal("mp.add_forced_key_binding")
    @js.native
    def addForcedKeyBinding(key: String, name: String, fn: js.Function0[Unit], flags: AddKeyBindingFlags): Unit = js.native
    
    @JSGlobal("mp.add_hook")
    @js.native
    def addHook(name: String, priority: Double, fn: js.Function0[Unit]): Unit = js.native
    
    @JSGlobal("mp.add_key_binding")
    @js.native
    def addKeyBinding(key: String): Unit = js.native
    @JSGlobal("mp.add_key_binding")
    @js.native
    def addKeyBinding(
      key: String,
      name: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      flags: AddKeyBindingFlags
    ): Unit = js.native
    @JSGlobal("mp.add_key_binding")
    @js.native
    def addKeyBinding(key: String, name: js.UndefOr[scala.Nothing], fn: js.Function0[Unit]): Unit = js.native
    @JSGlobal("mp.add_key_binding")
    @js.native
    def addKeyBinding(key: String, name: js.UndefOr[scala.Nothing], fn: js.Function0[Unit], flags: AddKeyBindingFlags): Unit = js.native
    @JSGlobal("mp.add_key_binding")
    @js.native
    def addKeyBinding(key: String, name: String): Unit = js.native
    @JSGlobal("mp.add_key_binding")
    @js.native
    def addKeyBinding(key: String, name: String, fn: js.UndefOr[scala.Nothing], flags: AddKeyBindingFlags): Unit = js.native
    @JSGlobal("mp.add_key_binding")
    @js.native
    def addKeyBinding(key: String, name: String, fn: js.Function0[Unit]): Unit = js.native
    @JSGlobal("mp.add_key_binding")
    @js.native
    def addKeyBinding(key: String, name: String, fn: js.Function0[Unit], flags: AddKeyBindingFlags): Unit = js.native
    
    @JSGlobal("mp.command")
    @js.native
    def command(command: String): js.UndefOr[`true`] = js.native
    
    @JSGlobal("mp.command_native")
    @js.native
    def commandNative(table: js.Any): js.Any = js.native
    @JSGlobal("mp.command_native")
    @js.native
    def commandNative(table: js.Any, `def`: js.Any): js.Any = js.native
    
    @JSGlobal("mp.command_native_async")
    @js.native
    def commandNativeAsync(table: js.Any): js.Any = js.native
    @JSGlobal("mp.command_native_async")
    @js.native
    def commandNativeAsync(
      table: js.Any,
      fn: js.Function3[/* success */ Boolean, /* result */ js.Any, /* error */ js.UndefOr[String], Unit]
    ): js.Any = js.native
    
    @JSGlobal("mp.commandv")
    @js.native
    def commandv(args: String*): js.UndefOr[`true`] = js.native
    
    @JSGlobal("mp.create_osd_overlay")
    @js.native
    def createOsdOverlay_assevents(format: `ass-events`): OSDOverlay = js.native
    
    @JSGlobal("mp.enable_messages")
    @js.native
    def enableMessages(level: LogLevel): Unit = js.native
    
    @JSGlobal("mp.get_opt")
    @js.native
    def getOpt(key: String): String = js.native
    
    @JSGlobal("mp.get_osd_size")
    @js.native
    def getOsdSize(): js.UndefOr[OSDSize] = js.native
    
    @JSGlobal("mp.get_property")
    @js.native
    def getProperty(name: String): js.UndefOr[String] = js.native
    @JSGlobal("mp.get_property")
    @js.native
    def getProperty(name: String, `def`: String): String = js.native
    
    @JSGlobal("mp.get_property_bool")
    @js.native
    def getPropertyBool(name: String): js.UndefOr[Boolean] = js.native
    @JSGlobal("mp.get_property_bool")
    @js.native
    def getPropertyBool(name: String, `def`: Boolean): js.UndefOr[Boolean] = js.native
    @JSGlobal("mp.get_property_bool")
    @js.native
    def getPropertyBool_Boolean(name: String, `def`: Boolean): Boolean = js.native
    
    @JSGlobal("mp.get_property_native")
    @js.native
    def getPropertyNative(name: String): js.Any = js.native
    @JSGlobal("mp.get_property_native")
    @js.native
    def getPropertyNative(name: String, `def`: js.Any): js.Any = js.native
    
    @JSGlobal("mp.get_property_number")
    @js.native
    def getPropertyNumber(name: String): js.UndefOr[Double] = js.native
    @JSGlobal("mp.get_property_number")
    @js.native
    def getPropertyNumber(name: String, `def`: Double): js.UndefOr[Double] = js.native
    @JSGlobal("mp.get_property_number")
    @js.native
    def getPropertyNumber_Double(name: String, `def`: Double): Double = js.native
    
    @JSGlobal("mp.get_property_osd")
    @js.native
    def getPropertyOsd(name: String): String = js.native
    @JSGlobal("mp.get_property_osd")
    @js.native
    def getPropertyOsd(name: String, `def`: String): String = js.native
    
    @JSGlobal("mp.get_property")
    @js.native
    def getProperty_Union(name: String, `def`: String): js.UndefOr[String] = js.native
    
    @JSGlobal("mp.get_script_file")
    @js.native
    def getScriptFile(): String = js.native
    
    @JSGlobal("mp.get_script_name")
    @js.native
    def getScriptName(): String = js.native
    
    @JSGlobal("mp.get_time")
    @js.native
    def getTime(): Double = js.native
    
    @JSGlobal("mp.get_time_ms")
    @js.native
    def getTimeMs(): Double = js.native
    
    @JSGlobal("mp.last_error")
    @js.native
    def lastError(): String = js.native
    
    @JSGlobal("mp.module_paths")
    @js.native
    def modulePaths: js.Array[String] = js.native
    
    @scala.inline
    def modulePaths_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("module_paths")(x.asInstanceOf[js.Any])
    
    object msg {
      
      @JSGlobal("mp.msg.debug")
      @js.native
      def debug(msg: js.Any*): Unit = js.native
      
      @JSGlobal("mp.msg.error")
      @js.native
      def error(msg: js.Any*): Unit = js.native
      
      @JSGlobal("mp.msg.fatal")
      @js.native
      def fatal(msg: js.Any*): Unit = js.native
      
      @JSGlobal("mp.msg.info")
      @js.native
      def info(msg: js.Any*): Unit = js.native
      
      @JSGlobal("mp.msg.log")
      @js.native
      def log(level: LogLevel, msg: js.Any*): Unit = js.native
      
      @JSGlobal("mp.msg.trace")
      @js.native
      def trace(msg: js.Any*): Unit = js.native
      
      @JSGlobal("mp.msg.verbose")
      @js.native
      def verbose(msg: js.Any*): Unit = js.native
      
      @JSGlobal("mp.msg.warn")
      @js.native
      def warn(msg: js.Any*): Unit = js.native
    }
    
    @JSGlobal("mp.observe_property")
    @js.native
    def observeProperty(name: String, `type`: js.UndefOr[scala.Nothing], fn: js.Function1[/* name */ String, Unit]): Unit = js.native
    @JSGlobal("mp.observe_property")
    @js.native
    def observeProperty_bool(
      name: String,
      `type`: bool,
      fn: js.Function2[/* name */ String, /* value */ js.UndefOr[Boolean], Unit]
    ): Unit = js.native
    @JSGlobal("mp.observe_property")
    @js.native
    def observeProperty_native(name: String, `type`: native, fn: js.Function2[/* name */ String, /* value */ js.Any, Unit]): Unit = js.native
    @JSGlobal("mp.observe_property")
    @js.native
    def observeProperty_none(name: String, `type`: none, fn: js.Function1[/* name */ String, Unit]): Unit = js.native
    @JSGlobal("mp.observe_property")
    @js.native
    def observeProperty_number(
      name: String,
      `type`: number,
      fn: js.Function2[/* name */ String, /* value */ js.UndefOr[Double], Unit]
    ): Unit = js.native
    @JSGlobal("mp.observe_property")
    @js.native
    def observeProperty_string(
      name: String,
      `type`: string,
      fn: js.Function2[/* name */ String, /* value */ js.UndefOr[String], Unit]
    ): Unit = js.native
    
    object options {
      
      @JSGlobal("mp.options.read_options")
      @js.native
      def readOptions(table: Record[String, String | Boolean | Double]): Unit = js.native
      @JSGlobal("mp.options.read_options")
      @js.native
      def readOptions(
        table: Record[String, String | Boolean | Double],
        identifier: js.UndefOr[scala.Nothing],
        on_update: js.Function1[/* list */ Record[String, js.UndefOr[Boolean]], Unit]
      ): Unit = js.native
      @JSGlobal("mp.options.read_options")
      @js.native
      def readOptions(table: Record[String, String | Boolean | Double], identifier: String): Unit = js.native
      @JSGlobal("mp.options.read_options")
      @js.native
      def readOptions(
        table: Record[String, String | Boolean | Double],
        identifier: String,
        on_update: js.Function1[/* list */ Record[String, js.UndefOr[Boolean]], Unit]
      ): Unit = js.native
    }
    
    @JSGlobal("mp.osd_message")
    @js.native
    def osdMessage(text: String): Unit = js.native
    @JSGlobal("mp.osd_message")
    @js.native
    def osdMessage(text: String, duration: Double): Unit = js.native
    
    @JSGlobal("mp.register_event")
    @js.native
    def registerEvent(name: String, fn: js.Function1[/* event */ Record[String, _], Unit]): Unit = js.native
    
    @JSGlobal("mp.register_idle")
    @js.native
    def registerIdle(fn: js.Function0[Unit]): Unit = js.native
    
    @JSGlobal("mp.register_script_message")
    @js.native
    def registerScriptMessage(name: String, fn: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
    
    @JSGlobal("mp.remove_key_binding")
    @js.native
    def removeKeyBinding(name: String): Unit = js.native
    
    @JSGlobal("mp.set_property")
    @js.native
    def setProperty(name: String, value: String): js.UndefOr[`true`] = js.native
    
    @JSGlobal("mp.set_property_bool")
    @js.native
    def setPropertyBool(name: String, value: Boolean): js.UndefOr[`true`] = js.native
    
    @JSGlobal("mp.set_property_native")
    @js.native
    def setPropertyNative(name: String, value: js.Any): js.UndefOr[`true`] = js.native
    
    @JSGlobal("mp.set_property_number")
    @js.native
    def setPropertyNumber(name: String, value: Double): js.UndefOr[`true`] = js.native
    
    @JSGlobal("mp.unobserve_property")
    @js.native
    def unobserveProperty(fn: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
    
    @JSGlobal("mp.unregister_event")
    @js.native
    def unregisterEvent(fn: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
    
    @JSGlobal("mp.unregister_idle")
    @js.native
    def unregisterIdle(fn: js.Function0[Unit]): Unit = js.native
    
    @JSGlobal("mp.unregister_script_message")
    @js.native
    def unregisterScriptMessage(name: String): Unit = js.native
    
    object utils {
      
      @JSGlobal("mp.utils.compile_js")
      @js.native
      def compileJs(fname: String, content_str: String): js.Function1[/* repeated */ js.Any, _] = js.native
      
      @JSGlobal("mp.utils.file_info")
      @js.native
      def fileInfo(path: String): js.UndefOr[FileInfo] = js.native
      
      @JSGlobal("mp.utils.get_user_path")
      @js.native
      def getUserPath(path: String): String = js.native
      
      @JSGlobal("mp.utils.getcwd")
      @js.native
      def getcwd(): js.UndefOr[String] = js.native
      
      @JSGlobal("mp.utils.getenv")
      @js.native
      def getenv(name: String): js.UndefOr[String] = js.native
      
      @JSGlobal("mp.utils.getpid")
      @js.native
      def getpid(): Double = js.native
      
      @JSGlobal("mp.utils.join_path")
      @js.native
      def joinPath(p1: String, p2: String): String = js.native
      
      @JSGlobal("mp.utils.read_file")
      @js.native
      def readFile(fname: String): String = js.native
      @JSGlobal("mp.utils.read_file")
      @js.native
      def readFile(fname: String, max: Double): String = js.native
      
      @JSGlobal("mp.utils.readdir")
      @js.native
      def readdir(path: String): js.UndefOr[js.Array[String]] = js.native
      @JSGlobal("mp.utils.readdir")
      @js.native
      def readdir_all(path: String, filter: all): js.UndefOr[js.Array[String]] = js.native
      @JSGlobal("mp.utils.readdir")
      @js.native
      def readdir_dirs(path: String, filter: dirs): js.UndefOr[js.Array[String]] = js.native
      @JSGlobal("mp.utils.readdir")
      @js.native
      def readdir_files(path: String, filter: files): js.UndefOr[js.Array[String]] = js.native
      @JSGlobal("mp.utils.readdir")
      @js.native
      def readdir_normal(path: String, filter: normal): js.UndefOr[js.Array[String]] = js.native
      
      @JSGlobal("mp.utils.split_path")
      @js.native
      def splitPath(path: String): js.Tuple2[String, String] = js.native
      
      @JSGlobal("mp.utils.write_file")
      @js.native
      def writeFile(fname: String, str: String): Unit = js.native
    }
  }
  
  @JSGlobal("print")
  @js.native
  def print(msg: js.Any*): Unit = js.native
}
