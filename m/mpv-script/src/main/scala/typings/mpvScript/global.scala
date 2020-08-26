package typings.mpvScript

import typings.mpvScript.mp.AddKeyBindingFlags
import typings.mpvScript.mp.FileInfo
import typings.mpvScript.mp.LogLevel
import typings.mpvScript.mp.OSDOverlay
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  def dump(msg: js.Any*): Unit = js.native
  def exit(): Unit = js.native
  def print(msg: js.Any*): Unit = js.native
  @js.native
  object mp extends js.Object {
    @JSName("module_paths")
    var modulePaths: js.Array[String] = js.native
    @JSName("abort_async_command")
    def abortAsyncCommand(t: js.Any): Unit = js.native
    @JSName("add_forced_key_binding")
    def addForcedKeyBinding(key: String): Unit = js.native
    @JSName("add_forced_key_binding")
    def addForcedKeyBinding(
      key: String,
      name: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      flags: AddKeyBindingFlags
    ): Unit = js.native
    @JSName("add_forced_key_binding")
    def addForcedKeyBinding(key: String, name: js.UndefOr[scala.Nothing], fn: js.Function0[Unit]): Unit = js.native
    @JSName("add_forced_key_binding")
    def addForcedKeyBinding(key: String, name: js.UndefOr[scala.Nothing], fn: js.Function0[Unit], flags: AddKeyBindingFlags): Unit = js.native
    @JSName("add_forced_key_binding")
    def addForcedKeyBinding(key: String, name: String): Unit = js.native
    @JSName("add_forced_key_binding")
    def addForcedKeyBinding(key: String, name: String, fn: js.UndefOr[scala.Nothing], flags: AddKeyBindingFlags): Unit = js.native
    @JSName("add_forced_key_binding")
    def addForcedKeyBinding(key: String, name: String, fn: js.Function0[Unit]): Unit = js.native
    @JSName("add_forced_key_binding")
    def addForcedKeyBinding(key: String, name: String, fn: js.Function0[Unit], flags: AddKeyBindingFlags): Unit = js.native
    @JSName("add_hook")
    def addHook(name: String, priority: Double, fn: js.Function0[Unit]): Unit = js.native
    @JSName("add_key_binding")
    def addKeyBinding(key: String): Unit = js.native
    @JSName("add_key_binding")
    def addKeyBinding(
      key: String,
      name: js.UndefOr[scala.Nothing],
      fn: js.UndefOr[scala.Nothing],
      flags: AddKeyBindingFlags
    ): Unit = js.native
    @JSName("add_key_binding")
    def addKeyBinding(key: String, name: js.UndefOr[scala.Nothing], fn: js.Function0[Unit]): Unit = js.native
    @JSName("add_key_binding")
    def addKeyBinding(key: String, name: js.UndefOr[scala.Nothing], fn: js.Function0[Unit], flags: AddKeyBindingFlags): Unit = js.native
    @JSName("add_key_binding")
    def addKeyBinding(key: String, name: String): Unit = js.native
    @JSName("add_key_binding")
    def addKeyBinding(key: String, name: String, fn: js.UndefOr[scala.Nothing], flags: AddKeyBindingFlags): Unit = js.native
    @JSName("add_key_binding")
    def addKeyBinding(key: String, name: String, fn: js.Function0[Unit]): Unit = js.native
    @JSName("add_key_binding")
    def addKeyBinding(key: String, name: String, fn: js.Function0[Unit], flags: AddKeyBindingFlags): Unit = js.native
    def command(command: String): js.UndefOr[`true`] = js.native
    @JSName("command_native")
    def commandNative(table: js.Any): js.Any = js.native
    @JSName("command_native")
    def commandNative(table: js.Any, `def`: js.Any): js.Any = js.native
    @JSName("command_native_async")
    def commandNativeAsync(table: js.Any): js.Any = js.native
    @JSName("command_native_async")
    def commandNativeAsync(
      table: js.Any,
      fn: js.Function3[/* success */ Boolean, /* result */ js.Any, /* error */ js.UndefOr[String], Unit]
    ): js.Any = js.native
    def commandv(args: String*): js.UndefOr[`true`] = js.native
    @JSName("create_osd_overlay")
    def createOsdOverlay_assevents(format: `ass-events`): OSDOverlay = js.native
    @JSName("enable_messages")
    def enableMessages(level: LogLevel): Unit = js.native
    @JSName("get_opt")
    def getOpt(key: String): String = js.native
    @JSName("get_osd_size")
    def getOsdSize(): js.Tuple3[Double, Double, Double] = js.native
    @JSName("get_property")
    def getProperty(name: String): js.UndefOr[String] = js.native
    @JSName("get_property")
    def getProperty(name: String, `def`: String): String = js.native
    @JSName("get_property_bool")
    def getPropertyBool(name: String): js.UndefOr[Boolean] = js.native
    @JSName("get_property_bool")
    def getPropertyBool(name: String, `def`: Boolean): js.UndefOr[Boolean] = js.native
    @JSName("get_property_bool")
    def getPropertyBool_Boolean(name: String, `def`: Boolean): Boolean = js.native
    @JSName("get_property_native")
    def getPropertyNative(name: String): js.Any = js.native
    @JSName("get_property_native")
    def getPropertyNative(name: String, `def`: js.Any): js.Any = js.native
    @JSName("get_property_number")
    def getPropertyNumber(name: String): js.UndefOr[Double] = js.native
    @JSName("get_property_number")
    def getPropertyNumber(name: String, `def`: Double): js.UndefOr[Double] = js.native
    @JSName("get_property_number")
    def getPropertyNumber_Double(name: String, `def`: Double): Double = js.native
    @JSName("get_property_osd")
    def getPropertyOsd(name: String): String = js.native
    @JSName("get_property_osd")
    def getPropertyOsd(name: String, `def`: String): String = js.native
    @JSName("get_property")
    def getProperty_Union(name: String, `def`: String): js.UndefOr[String] = js.native
    @JSName("get_script_file")
    def getScriptFile(): String = js.native
    @JSName("get_script_name")
    def getScriptName(): String = js.native
    @JSName("get_time")
    def getTime(): Double = js.native
    @JSName("get_time_ms")
    def getTimeMs(): Double = js.native
    @JSName("last_error")
    def lastError(): String = js.native
    @JSName("observe_property")
    def observeProperty(name: String, `type`: js.UndefOr[scala.Nothing], fn: js.Function1[/* name */ String, Unit]): Unit = js.native
    @JSName("observe_property")
    def observeProperty_bool(
      name: String,
      `type`: bool,
      fn: js.Function2[/* name */ String, /* value */ js.UndefOr[Boolean], Unit]
    ): Unit = js.native
    @JSName("observe_property")
    def observeProperty_native(name: String, `type`: native, fn: js.Function2[/* name */ String, /* value */ js.Any, Unit]): Unit = js.native
    @JSName("observe_property")
    def observeProperty_none(name: String, `type`: none, fn: js.Function1[/* name */ String, Unit]): Unit = js.native
    @JSName("observe_property")
    def observeProperty_number(
      name: String,
      `type`: number,
      fn: js.Function2[/* name */ String, /* value */ js.UndefOr[Double], Unit]
    ): Unit = js.native
    @JSName("observe_property")
    def observeProperty_string(
      name: String,
      `type`: string,
      fn: js.Function2[/* name */ String, /* value */ js.UndefOr[String], Unit]
    ): Unit = js.native
    @JSName("osd_message")
    def osdMessage(text: String): Unit = js.native
    @JSName("osd_message")
    def osdMessage(text: String, duration: Double): Unit = js.native
    @JSName("register_event")
    def registerEvent(name: String, fn: js.Function1[/* event */ Record[String, _], Unit]): Unit = js.native
    @JSName("register_idle")
    def registerIdle(fn: js.Function0[Unit]): Unit = js.native
    @JSName("register_script_message")
    def registerScriptMessage(name: String, fn: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
    @JSName("remove_key_binding")
    def removeKeyBinding(name: String): Unit = js.native
    @JSName("set_property")
    def setProperty(name: String, value: String): js.UndefOr[`true`] = js.native
    @JSName("set_property_bool")
    def setPropertyBool(name: String, value: Boolean): js.UndefOr[`true`] = js.native
    @JSName("set_property_native")
    def setPropertyNative(name: String, value: js.Any): js.UndefOr[`true`] = js.native
    @JSName("set_property_number")
    def setPropertyNumber(name: String, value: Double): js.UndefOr[`true`] = js.native
    @JSName("unobserve_property")
    def unobserveProperty(fn: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
    @JSName("unregister_event")
    def unregisterEvent(fn: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
    @JSName("unregister_idle")
    def unregisterIdle(fn: js.Function0[Unit]): Unit = js.native
    @JSName("unregister_script_message")
    def unregisterScriptMessage(name: String): Unit = js.native
    @js.native
    object msg extends js.Object {
      def debug(msg: js.Any*): Unit = js.native
      def error(msg: js.Any*): Unit = js.native
      def fatal(msg: js.Any*): Unit = js.native
      def info(msg: js.Any*): Unit = js.native
      def log(level: LogLevel, msg: js.Any*): Unit = js.native
      def trace(msg: js.Any*): Unit = js.native
      def verbose(msg: js.Any*): Unit = js.native
      def warn(msg: js.Any*): Unit = js.native
    }
    
    @js.native
    object options extends js.Object {
      @JSName("read_options")
      def readOptions(table: Record[String, String | Boolean | Double]): Unit = js.native
      @JSName("read_options")
      def readOptions(
        table: Record[String, String | Boolean | Double],
        identifier: js.UndefOr[scala.Nothing],
        on_update: js.Function1[/* list */ Record[String, js.UndefOr[Boolean]], Unit]
      ): Unit = js.native
      @JSName("read_options")
      def readOptions(table: Record[String, String | Boolean | Double], identifier: String): Unit = js.native
      @JSName("read_options")
      def readOptions(
        table: Record[String, String | Boolean | Double],
        identifier: String,
        on_update: js.Function1[/* list */ Record[String, js.UndefOr[Boolean]], Unit]
      ): Unit = js.native
    }
    
    @js.native
    object utils extends js.Object {
      @JSName("compile_js")
      def compileJs(fname: String, content_str: String): js.Function1[/* repeated */ js.Any, _] = js.native
      @JSName("file_info")
      def fileInfo(path: String): js.UndefOr[FileInfo] = js.native
      @JSName("get_user_path")
      def getUserPath(path: String): String = js.native
      def getcwd(): js.UndefOr[String] = js.native
      def getenv(name: String): js.UndefOr[String] = js.native
      def getpid(): Double = js.native
      @JSName("join_path")
      def joinPath(p1: String, p2: String): String = js.native
      @JSName("read_file")
      def readFile(fname: String): String = js.native
      @JSName("read_file")
      def readFile(fname: String, max: Double): String = js.native
      def readdir(path: String): js.UndefOr[js.Array[String]] = js.native
      @JSName("readdir")
      def readdir_all(path: String, filter: all): js.UndefOr[js.Array[String]] = js.native
      @JSName("readdir")
      def readdir_dirs(path: String, filter: dirs): js.UndefOr[js.Array[String]] = js.native
      @JSName("readdir")
      def readdir_files(path: String, filter: files): js.UndefOr[js.Array[String]] = js.native
      @JSName("readdir")
      def readdir_normal(path: String, filter: normal): js.UndefOr[js.Array[String]] = js.native
      @JSName("split_path")
      def splitPath(path: String): js.Tuple2[String, String] = js.native
      @JSName("write_file")
      def writeFile(fname: String, str: String): Unit = js.native
    }
    
  }
  
}

