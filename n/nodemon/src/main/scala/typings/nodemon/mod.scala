package typings.nodemon

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.nodemon.anon.Re
import typings.nodemon.nodemonStrings.configColonupdate
import typings.nodemon.nodemonStrings.crash
import typings.nodemon.nodemonStrings.exit
import typings.nodemon.nodemonStrings.log
import typings.nodemon.nodemonStrings.quit
import typings.nodemon.nodemonStrings.readable
import typings.nodemon.nodemonStrings.restart
import typings.nodemon.nodemonStrings.start
import typings.nodemon.nodemonStrings.stderr
import typings.nodemon.nodemonStrings.stdout
import typings.nodemon.nodemonStrings.watching
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nodemon", JSImport.Namespace)
  @js.native
  def apply(options: String): js.Any = js.native
  @JSImport("nodemon", JSImport.Namespace)
  @js.native
  def apply(options: Settings): js.Any = js.native
  
  @JSImport("nodemon", "addListener")
  @js.native
  def addListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): js.Any = js.native
  @JSImport("nodemon", "addListener")
  @js.native
  def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): js.Any = js.native
  @JSImport("nodemon", "addListener")
  @js.native
  def addListener_configupdate(event: configColonupdate, listener: js.Function0[Unit]): js.Any = js.native
  @JSImport("nodemon", "addListener")
  @js.native
  def addListener_crash(event: crash, listener: js.Function0[Unit]): js.Any = js.native
  @JSImport("nodemon", "addListener")
  @js.native
  def addListener_exit(event: exit, listener: js.Function0[Unit]): js.Any = js.native
  @JSImport("nodemon", "addListener")
  @js.native
  def addListener_log(event: log, listener: js.Function1[/* msg */ LogMessage, Unit]): js.Any = js.native
  @JSImport("nodemon", "addListener")
  @js.native
  def addListener_quit(event: quit, listener: js.Function1[/* code */ js.UndefOr[Double], Unit]): js.Any = js.native
  @JSImport("nodemon", "addListener")
  @js.native
  def addListener_readable(event: readable, listener: js.Function0[Unit]): js.Any = js.native
  @JSImport("nodemon", "addListener")
  @js.native
  def addListener_restart(event: restart, listener: js.Function1[/* files */ js.UndefOr[js.Array[String]], Unit]): js.Any = js.native
  @JSImport("nodemon", "addListener")
  @js.native
  def addListener_start(event: start, listener: js.Function0[Unit]): js.Any = js.native
  @JSImport("nodemon", "addListener")
  @js.native
  def addListener_stderr(event: stderr, listener: js.Function1[/* data */ Buffer, Unit]): js.Any = js.native
  @JSImport("nodemon", "addListener")
  @js.native
  def addListener_stdout(event: stdout, listener: js.Function1[/* data */ Buffer, Unit]): js.Any = js.native
  @JSImport("nodemon", "addListener")
  @js.native
  def addListener_watching(event: watching, listener: js.Function1[/* file */ String, Unit]): js.Any = js.native
  
  @JSImport("nodemon", "emit")
  @js.native
  def emit(event: String, args: js.Any*): Boolean = js.native
  @JSImport("nodemon", "emit")
  @js.native
  def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
  @JSImport("nodemon", "emit")
  @js.native
  def emit_configupdate(event: configColonupdate): Boolean = js.native
  @JSImport("nodemon", "emit")
  @js.native
  def emit_crash(event: crash): Boolean = js.native
  @JSImport("nodemon", "emit")
  @js.native
  def emit_exit(event: exit): Boolean = js.native
  @JSImport("nodemon", "emit")
  @js.native
  def emit_log(event: log, msg: LogMessage): Boolean = js.native
  @JSImport("nodemon", "emit")
  @js.native
  def emit_quit(event: quit): Boolean = js.native
  @JSImport("nodemon", "emit")
  @js.native
  def emit_quit(event: quit, code: Double): Boolean = js.native
  @JSImport("nodemon", "emit")
  @js.native
  def emit_readable(event: readable): Boolean = js.native
  @JSImport("nodemon", "emit")
  @js.native
  def emit_restart(event: restart): Boolean = js.native
  @JSImport("nodemon", "emit")
  @js.native
  def emit_restart(event: restart, files: js.Array[String]): Boolean = js.native
  @JSImport("nodemon", "emit")
  @js.native
  def emit_start(event: start): Boolean = js.native
  @JSImport("nodemon", "emit")
  @js.native
  def emit_stderr(event: stderr, data: Buffer): Boolean = js.native
  @JSImport("nodemon", "emit")
  @js.native
  def emit_stdout(event: stdout, data: Buffer): Boolean = js.native
  @JSImport("nodemon", "emit")
  @js.native
  def emit_watching(event: watching, listener: js.Function1[/* file */ String, Unit]): Boolean = js.native
  
  @JSImport("nodemon", "on")
  @js.native
  def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): js.Any = js.native
  @JSImport("nodemon", "on")
  @js.native
  def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): js.Any = js.native
  @JSImport("nodemon", "on")
  @js.native
  def on_configupdate(event: configColonupdate, listener: js.Function0[Unit]): js.Any = js.native
  @JSImport("nodemon", "on")
  @js.native
  def on_crash(event: crash, listener: js.Function0[Unit]): js.Any = js.native
  @JSImport("nodemon", "on")
  @js.native
  def on_exit(event: exit, listener: js.Function0[Unit]): js.Any = js.native
  @JSImport("nodemon", "on")
  @js.native
  def on_log(event: log, listener: js.Function1[/* msg */ LogMessage, Unit]): js.Any = js.native
  @JSImport("nodemon", "on")
  @js.native
  def on_quit(event: quit, listener: js.Function1[/* code */ js.UndefOr[Double], Unit]): js.Any = js.native
  @JSImport("nodemon", "on")
  @js.native
  def on_readable(event: readable, listener: js.Function0[Unit]): js.Any = js.native
  @JSImport("nodemon", "on")
  @js.native
  def on_restart(event: restart, listener: js.Function1[/* files */ js.UndefOr[js.Array[String]], Unit]): js.Any = js.native
  @JSImport("nodemon", "on")
  @js.native
  def on_start(event: start, listener: js.Function0[Unit]): js.Any = js.native
  @JSImport("nodemon", "on")
  @js.native
  def on_stderr(event: stderr, listener: js.Function1[/* data */ Buffer, Unit]): js.Any = js.native
  @JSImport("nodemon", "on")
  @js.native
  def on_stdout(event: stdout, listener: js.Function1[/* data */ Buffer, Unit]): js.Any = js.native
  @JSImport("nodemon", "on")
  @js.native
  def on_watching(event: watching, listener: js.Function1[/* file */ String, Unit]): js.Any = js.native
  
  @JSImport("nodemon", "once")
  @js.native
  def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): js.Any = js.native
  @JSImport("nodemon", "once")
  @js.native
  def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): js.Any = js.native
  @JSImport("nodemon", "once")
  @js.native
  def once_configupdate(event: configColonupdate, listener: js.Function0[Unit]): js.Any = js.native
  @JSImport("nodemon", "once")
  @js.native
  def once_crash(event: crash, listener: js.Function0[Unit]): js.Any = js.native
  @JSImport("nodemon", "once")
  @js.native
  def once_exit(event: exit, listener: js.Function0[Unit]): js.Any = js.native
  @JSImport("nodemon", "once")
  @js.native
  def once_log(event: log, listener: js.Function1[/* msg */ LogMessage, Unit]): js.Any = js.native
  @JSImport("nodemon", "once")
  @js.native
  def once_quit(event: quit, listener: js.Function1[/* code */ js.UndefOr[Double], Unit]): js.Any = js.native
  @JSImport("nodemon", "once")
  @js.native
  def once_readable(event: readable, listener: js.Function0[Unit]): js.Any = js.native
  @JSImport("nodemon", "once")
  @js.native
  def once_restart(event: restart, listener: js.Function1[/* files */ js.UndefOr[js.Array[String]], Unit]): js.Any = js.native
  @JSImport("nodemon", "once")
  @js.native
  def once_start(event: start, listener: js.Function0[Unit]): js.Any = js.native
  @JSImport("nodemon", "once")
  @js.native
  def once_stderr(event: stderr, listener: js.Function1[/* data */ Buffer, Unit]): js.Any = js.native
  @JSImport("nodemon", "once")
  @js.native
  def once_stdout(event: stdout, listener: js.Function1[/* data */ Buffer, Unit]): js.Any = js.native
  @JSImport("nodemon", "once")
  @js.native
  def once_watching(event: watching, listener: js.Function1[/* file */ String, Unit]): js.Any = js.native
  
  @JSImport("nodemon", "removeAllListeners")
  @js.native
  def removeAllListeners(): js.Any = js.native
  @JSImport("nodemon", "removeAllListeners")
  @js.native
  def removeAllListeners(event: String): js.Any = js.native
  @JSImport("nodemon", "removeAllListeners")
  @js.native
  def removeAllListeners(event: js.Symbol): js.Any = js.native
  
  @JSImport("nodemon", "reset")
  @js.native
  def reset(): Unit = js.native
  @JSImport("nodemon", "reset")
  @js.native
  def reset(done: js.Function0[Unit]): Unit = js.native
  
  @JSImport("nodemon", "restart")
  @js.native
  def restart(): Unit = js.native
  
  @js.native
  trait LogMessage extends StObject {
    
    var colour: String = js.native
    
    var message: String = js.native
    
    var `type`: String = js.native
  }
  object LogMessage {
    
    @scala.inline
    def apply(colour: String, message: String, `type`: String): LogMessage = {
      val __obj = js.Dynamic.literal(colour = colour.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogMessage]
    }
    
    @scala.inline
    implicit class LogMessageMutableBuilder[Self <: LogMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColour(value: String): Self = StObject.set(x, "colour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Settings
    extends /* k */ StringDictionary[js.Any] {
    
    var args: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Set to false to disable color output
      */
    var colours: js.UndefOr[Boolean] = js.native
    
    /**
      * Change into <dir> before running the script
      */
    var cwd: js.UndefOr[String] = js.native
    
    /**
      * Debounce restart in seconds.
      */
    var delay: js.UndefOr[Double] = js.native
    
    /**
      * Print full debug configuration
      */
    var dump: js.UndefOr[Boolean] = js.native
    
    var env: js.UndefOr[StringDictionary[String | Boolean | Double]] = js.native
    
    var events: js.UndefOr[StringDictionary[String]] = js.native
    
    /**
      * Execute script with "app", ie. -x "python -v". May use variables.
      */
    var exec: js.UndefOr[String] = js.native
    
    /**
      * The global config file is useful for setting up default executables
      */
    var execMap: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    /**
      * Exit on crash, allows use of nodemon with daemon tools like forever.js.
      */
    var exitcrash: js.UndefOr[Boolean] = js.native
    
    /**
      * Extensions to look for, ie. js,jade,hbs.
      */
    var ext: js.UndefOr[String] = js.native
    
    /**
      * Ignore specific files or directories.  One entry per ignored value.  Wildcards are allowed.
      */
    var ignore: js.UndefOr[js.Array[String | Re]] = js.native
    
    /**
      * Root paths to ignore
      */
    var ignoreRoot: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Forces node to use the most compatible version for watching file changes.
      *
      * Use polling to watch for changes (typically needed when watching over a network/Docker)
      */
    var legacyWatch: js.UndefOr[Boolean] = js.native
    
    /**
      * Opt-out of update version check
      */
    var noUpdateNotifier: js.UndefOr[Boolean] = js.native
    
    /**
      * Arguments to pass to node if exec is "node"
      */
    var nodeArgs: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Combined with legacyWatch, milliseconds to poll for (default 100)
      */
    var pollingInterval: js.UndefOr[Double] = js.native
    
    /**
      * Minimise nodemon messages to start/stop only.
      */
    var quiet: js.UndefOr[Boolean] = js.native
    
    var restartable: js.UndefOr[String] = js.native
    
    /**
      * Execute script on change only, not startup
      */
    var runOnChangeOnly: js.UndefOr[Boolean] = js.native
    
    var script: js.UndefOr[String] = js.native
    
    var scriptPosition: js.UndefOr[Double] = js.native
    
    /**
      * Use specified kill signal instead of default (ex. SIGTERM)
      */
    var signal: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    /**
      * Force nodemon to use spawn (over fork) [node only]
      */
    var spawn: js.UndefOr[Boolean] = js.native
    
    /**
      * Try to read from stdin. Set to false to have nodemon pass stdin directly to child process
      */
    var stdin: js.UndefOr[Boolean] = js.native
    
    var stdout: js.UndefOr[Boolean] = js.native
    
    /**
      * Show detail on what is causing restarts.
      */
    var verbose: js.UndefOr[Boolean] = js.native
    
    /**
      * Watch directory or file.  One entry per watched value.  Wildcards are allowed.
      */
    var watch: js.UndefOr[js.Array[String | Re]] = js.native
  }
  object Settings {
    
    @scala.inline
    def apply(): Settings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Settings]
    }
    
    @scala.inline
    implicit class SettingsMutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      @scala.inline
      def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setColours(value: Boolean): Self = StObject.set(x, "colours", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColoursUndefined: Self = StObject.set(x, "colours", js.undefined)
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setDump(value: Boolean): Self = StObject.set(x, "dump", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDumpUndefined: Self = StObject.set(x, "dump", js.undefined)
      
      @scala.inline
      def setEnv(value: StringDictionary[String | Boolean | Double]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      @scala.inline
      def setEvents(value: StringDictionary[String]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      @scala.inline
      def setExec(value: String): Self = StObject.set(x, "exec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecMap(value: StringDictionary[js.Any]): Self = StObject.set(x, "execMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecMapUndefined: Self = StObject.set(x, "execMap", js.undefined)
      
      @scala.inline
      def setExecUndefined: Self = StObject.set(x, "exec", js.undefined)
      
      @scala.inline
      def setExitcrash(value: Boolean): Self = StObject.set(x, "exitcrash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExitcrashUndefined: Self = StObject.set(x, "exitcrash", js.undefined)
      
      @scala.inline
      def setExt(value: String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
      
      @scala.inline
      def setIgnore(value: js.Array[String | Re]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreRoot(value: js.Array[String]): Self = StObject.set(x, "ignoreRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreRootUndefined: Self = StObject.set(x, "ignoreRoot", js.undefined)
      
      @scala.inline
      def setIgnoreRootVarargs(value: String*): Self = StObject.set(x, "ignoreRoot", js.Array(value :_*))
      
      @scala.inline
      def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      @scala.inline
      def setIgnoreVarargs(value: (String | Re)*): Self = StObject.set(x, "ignore", js.Array(value :_*))
      
      @scala.inline
      def setLegacyWatch(value: Boolean): Self = StObject.set(x, "legacyWatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLegacyWatchUndefined: Self = StObject.set(x, "legacyWatch", js.undefined)
      
      @scala.inline
      def setNoUpdateNotifier(value: Boolean): Self = StObject.set(x, "noUpdateNotifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoUpdateNotifierUndefined: Self = StObject.set(x, "noUpdateNotifier", js.undefined)
      
      @scala.inline
      def setNodeArgs(value: js.Array[String]): Self = StObject.set(x, "nodeArgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeArgsUndefined: Self = StObject.set(x, "nodeArgs", js.undefined)
      
      @scala.inline
      def setNodeArgsVarargs(value: String*): Self = StObject.set(x, "nodeArgs", js.Array(value :_*))
      
      @scala.inline
      def setPollingInterval(value: Double): Self = StObject.set(x, "pollingInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPollingIntervalUndefined: Self = StObject.set(x, "pollingInterval", js.undefined)
      
      @scala.inline
      def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
      
      @scala.inline
      def setRestartable(value: String): Self = StObject.set(x, "restartable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestartableUndefined: Self = StObject.set(x, "restartable", js.undefined)
      
      @scala.inline
      def setRunOnChangeOnly(value: Boolean): Self = StObject.set(x, "runOnChangeOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRunOnChangeOnlyUndefined: Self = StObject.set(x, "runOnChangeOnly", js.undefined)
      
      @scala.inline
      def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScriptPosition(value: Double): Self = StObject.set(x, "scriptPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScriptPositionUndefined: Self = StObject.set(x, "scriptPosition", js.undefined)
      
      @scala.inline
      def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
      
      @scala.inline
      def setSignal(value: StringDictionary[js.Any]): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      @scala.inline
      def setSpawn(value: Boolean): Self = StObject.set(x, "spawn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpawnUndefined: Self = StObject.set(x, "spawn", js.undefined)
      
      @scala.inline
      def setStdin(value: Boolean): Self = StObject.set(x, "stdin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdinUndefined: Self = StObject.set(x, "stdin", js.undefined)
      
      @scala.inline
      def setStdout(value: Boolean): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdoutUndefined: Self = StObject.set(x, "stdout", js.undefined)
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
      
      @scala.inline
      def setWatch(value: js.Array[String | Re]): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
      
      @scala.inline
      def setWatchVarargs(value: (String | Re)*): Self = StObject.set(x, "watch", js.Array(value :_*))
    }
  }
}
