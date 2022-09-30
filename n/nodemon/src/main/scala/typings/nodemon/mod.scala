package typings.nodemon

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: String): Any = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def apply(options: Settings): Any = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("nodemon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addListener(event: start | exit | crash | configColonupdate | readable, listener: js.Function0[Unit]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def addListener(event: stdout | stderr, listener: js.Function1[/* data */ Buffer, Unit]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def addListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def addListener_log(event: log, listener: js.Function1[/* msg */ LogMessage, Unit]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def addListener_quit(event: quit, listener: js.Function1[/* code */ js.UndefOr[Double], Unit]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def addListener_restart(event: restart, listener: js.Function1[/* files */ js.UndefOr[js.Array[String]], Unit]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def addListener_watching(event: watching, listener: js.Function1[/* file */ String, Unit]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def emit(event: start | exit | crash | configColonupdate | readable): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("emit")(event.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def emit(event: stdout | stderr, data: Buffer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("emit")(event.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def emit(event: String, args: Any*): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("emit")(scala.List(event.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Boolean]
  inline def emit(event: js.Symbol, args: Any*): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("emit")(scala.List(event.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Boolean]
  
  inline def emit_log(event: log, msg: LogMessage): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("emit")(event.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def emit_quit(event: quit): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("emit")(event.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def emit_quit(event: quit, code: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("emit")(event.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def emit_restart(event: restart): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("emit")(event.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def emit_restart(event: restart, files: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("emit")(event.asInstanceOf[js.Any], files.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def emit_watching(event: watching, listener: js.Function1[/* file */ String, Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("emit")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def on(event: start | exit | crash | configColonupdate | readable, listener: js.Function0[Unit]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def on(event: stdout | stderr, listener: js.Function1[/* data */ Buffer, Unit]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def on(event: String, listener: js.Function1[/* repeated */ Any, Unit]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def on(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def on_log(event: log, listener: js.Function1[/* msg */ LogMessage, Unit]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def on_quit(event: quit, listener: js.Function1[/* code */ js.UndefOr[Double], Unit]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def on_restart(event: restart, listener: js.Function1[/* files */ js.UndefOr[js.Array[String]], Unit]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def on_watching(event: watching, listener: js.Function1[/* file */ String, Unit]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def once(event: start | exit | crash | configColonupdate | readable, listener: js.Function0[Unit]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def once(event: stdout | stderr, listener: js.Function1[/* data */ Buffer, Unit]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def once(event: String, listener: js.Function1[/* repeated */ Any, Unit]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def once(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def once_log(event: log, listener: js.Function1[/* msg */ LogMessage, Unit]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def once_quit(event: quit, listener: js.Function1[/* code */ js.UndefOr[Double], Unit]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def once_restart(event: restart, listener: js.Function1[/* files */ js.UndefOr[js.Array[String]], Unit]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def once_watching(event: watching, listener: js.Function1[/* file */ String, Unit]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(event.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def removeAllListeners(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAllListeners")().asInstanceOf[Any]
  inline def removeAllListeners(event: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAllListeners")(event.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def removeAllListeners(event: js.Symbol): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAllListeners")(event.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
  inline def reset(done: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")(done.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def restart(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("restart")().asInstanceOf[Unit]
  
  trait LogMessage extends StObject {
    
    var colour: String
    
    var message: String
    
    var `type`: String
  }
  object LogMessage {
    
    inline def apply(colour: String, message: String, `type`: String): LogMessage = {
      val __obj = js.Dynamic.literal(colour = colour.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogMessage]
    }
    
    extension [Self <: LogMessage](x: Self) {
      
      inline def setColour(value: String): Self = StObject.set(x, "colour", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Settings
    extends StObject
       with /* k */ StringDictionary[Any] {
    
    var args: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Set to false to disable color output
      */
    var colours: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Change into <dir> before running the script
      */
    var cwd: js.UndefOr[String] = js.undefined
    
    /**
      * Debounce restart in seconds.
      */
    var delay: js.UndefOr[Double] = js.undefined
    
    /**
      * Print full debug configuration
      */
    var dump: js.UndefOr[Boolean] = js.undefined
    
    var env: js.UndefOr[StringDictionary[String | Boolean | Double]] = js.undefined
    
    var events: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * Execute script with "app", ie. -x "python -v". May use variables.
      */
    var exec: js.UndefOr[String] = js.undefined
    
    /**
      * The global config file is useful for setting up default executables
      */
    var execMap: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    /**
      * Exit on crash, allows use of nodemon with daemon tools like forever.js.
      */
    var exitcrash: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Extensions to look for, ie. js,jade,hbs.
      */
    var ext: js.UndefOr[String] = js.undefined
    
    /**
      * Ignore specific files or directories.  One entry per ignored value.  Wildcards are allowed.
      */
    var ignore: js.UndefOr[js.Array[String | Re]] = js.undefined
    
    /**
      * Root paths to ignore
      */
    var ignoreRoot: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Forces node to use the most compatible version for watching file changes.
      *
      * Use polling to watch for changes (typically needed when watching over a network/Docker)
      */
    var legacyWatch: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Opt-out of update version check
      */
    var noUpdateNotifier: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Arguments to pass to node if exec is "node"
      */
    var nodeArgs: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Combined with legacyWatch, milliseconds to poll for (default 100)
      */
    var pollingInterval: js.UndefOr[Double] = js.undefined
    
    /**
      * Minimise nodemon messages to start/stop only.
      */
    var quiet: js.UndefOr[Boolean] = js.undefined
    
    var restartable: js.UndefOr[String] = js.undefined
    
    /**
      * Execute script on change only, not startup
      */
    var runOnChangeOnly: js.UndefOr[Boolean] = js.undefined
    
    var script: js.UndefOr[String] = js.undefined
    
    var scriptPosition: js.UndefOr[Double] = js.undefined
    
    /**
      * Use specified kill signal instead of default (ex. SIGTERM)
      */
    var signal: js.UndefOr[String] = js.undefined
    
    /**
      * Force nodemon to use spawn (over fork) [node only]
      */
    var spawn: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Try to read from stdin. Set to false to have nodemon pass stdin directly to child process
      */
    var stdin: js.UndefOr[Boolean] = js.undefined
    
    var stdout: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Show detail on what is causing restarts.
      */
    var verbose: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Watch directory or file.  One entry per watched value.  Wildcards are allowed.
      */
    var watch: js.UndefOr[js.Array[String | Re]] = js.undefined
  }
  object Settings {
    
    inline def apply(): Settings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Settings]
    }
    
    extension [Self <: Settings](x: Self) {
      
      inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setColours(value: Boolean): Self = StObject.set(x, "colours", value.asInstanceOf[js.Any])
      
      inline def setColoursUndefined: Self = StObject.set(x, "colours", js.undefined)
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setDump(value: Boolean): Self = StObject.set(x, "dump", value.asInstanceOf[js.Any])
      
      inline def setDumpUndefined: Self = StObject.set(x, "dump", js.undefined)
      
      inline def setEnv(value: StringDictionary[String | Boolean | Double]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setEvents(value: StringDictionary[String]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setExec(value: String): Self = StObject.set(x, "exec", value.asInstanceOf[js.Any])
      
      inline def setExecMap(value: StringDictionary[Any]): Self = StObject.set(x, "execMap", value.asInstanceOf[js.Any])
      
      inline def setExecMapUndefined: Self = StObject.set(x, "execMap", js.undefined)
      
      inline def setExecUndefined: Self = StObject.set(x, "exec", js.undefined)
      
      inline def setExitcrash(value: Boolean): Self = StObject.set(x, "exitcrash", value.asInstanceOf[js.Any])
      
      inline def setExitcrashUndefined: Self = StObject.set(x, "exitcrash", js.undefined)
      
      inline def setExt(value: String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      inline def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
      
      inline def setIgnore(value: js.Array[String | Re]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreRoot(value: js.Array[String]): Self = StObject.set(x, "ignoreRoot", value.asInstanceOf[js.Any])
      
      inline def setIgnoreRootUndefined: Self = StObject.set(x, "ignoreRoot", js.undefined)
      
      inline def setIgnoreRootVarargs(value: String*): Self = StObject.set(x, "ignoreRoot", js.Array(value*))
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: (String | Re)*): Self = StObject.set(x, "ignore", js.Array(value*))
      
      inline def setLegacyWatch(value: Boolean): Self = StObject.set(x, "legacyWatch", value.asInstanceOf[js.Any])
      
      inline def setLegacyWatchUndefined: Self = StObject.set(x, "legacyWatch", js.undefined)
      
      inline def setNoUpdateNotifier(value: Boolean): Self = StObject.set(x, "noUpdateNotifier", value.asInstanceOf[js.Any])
      
      inline def setNoUpdateNotifierUndefined: Self = StObject.set(x, "noUpdateNotifier", js.undefined)
      
      inline def setNodeArgs(value: js.Array[String]): Self = StObject.set(x, "nodeArgs", value.asInstanceOf[js.Any])
      
      inline def setNodeArgsUndefined: Self = StObject.set(x, "nodeArgs", js.undefined)
      
      inline def setNodeArgsVarargs(value: String*): Self = StObject.set(x, "nodeArgs", js.Array(value*))
      
      inline def setPollingInterval(value: Double): Self = StObject.set(x, "pollingInterval", value.asInstanceOf[js.Any])
      
      inline def setPollingIntervalUndefined: Self = StObject.set(x, "pollingInterval", js.undefined)
      
      inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
      
      inline def setRestartable(value: String): Self = StObject.set(x, "restartable", value.asInstanceOf[js.Any])
      
      inline def setRestartableUndefined: Self = StObject.set(x, "restartable", js.undefined)
      
      inline def setRunOnChangeOnly(value: Boolean): Self = StObject.set(x, "runOnChangeOnly", value.asInstanceOf[js.Any])
      
      inline def setRunOnChangeOnlyUndefined: Self = StObject.set(x, "runOnChangeOnly", js.undefined)
      
      inline def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      inline def setScriptPosition(value: Double): Self = StObject.set(x, "scriptPosition", value.asInstanceOf[js.Any])
      
      inline def setScriptPositionUndefined: Self = StObject.set(x, "scriptPosition", js.undefined)
      
      inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
      
      inline def setSignal(value: String): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setSpawn(value: Boolean): Self = StObject.set(x, "spawn", value.asInstanceOf[js.Any])
      
      inline def setSpawnUndefined: Self = StObject.set(x, "spawn", js.undefined)
      
      inline def setStdin(value: Boolean): Self = StObject.set(x, "stdin", value.asInstanceOf[js.Any])
      
      inline def setStdinUndefined: Self = StObject.set(x, "stdin", js.undefined)
      
      inline def setStdout(value: Boolean): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
      
      inline def setStdoutUndefined: Self = StObject.set(x, "stdout", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
      
      inline def setWatch(value: js.Array[String | Re]): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
      
      inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
      
      inline def setWatchVarargs(value: (String | Re)*): Self = StObject.set(x, "watch", js.Array(value*))
    }
  }
}
