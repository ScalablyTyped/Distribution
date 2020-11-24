package typings.nodemon.mod

import org.scalablytyped.runtime.StringDictionary
import typings.nodemon.anon.Re
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArgsVarargs(value: String*): Self = this.set("args", js.Array(value :_*))
    
    @scala.inline
    def setArgs(value: js.Array[String]): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    
    @scala.inline
    def setColours(value: Boolean): Self = this.set("colours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColours: Self = this.set("colours", js.undefined)
    
    @scala.inline
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setDump(value: Boolean): Self = this.set("dump", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDump: Self = this.set("dump", js.undefined)
    
    @scala.inline
    def setEnv(value: StringDictionary[String | Boolean | Double]): Self = this.set("env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    
    @scala.inline
    def setEvents(value: StringDictionary[String]): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    
    @scala.inline
    def setExec(value: String): Self = this.set("exec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExec: Self = this.set("exec", js.undefined)
    
    @scala.inline
    def setExecMap(value: StringDictionary[js.Any]): Self = this.set("execMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecMap: Self = this.set("execMap", js.undefined)
    
    @scala.inline
    def setExitcrash(value: Boolean): Self = this.set("exitcrash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExitcrash: Self = this.set("exitcrash", js.undefined)
    
    @scala.inline
    def setExt(value: String): Self = this.set("ext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExt: Self = this.set("ext", js.undefined)
    
    @scala.inline
    def setIgnoreVarargs(value: (String | Re)*): Self = this.set("ignore", js.Array(value :_*))
    
    @scala.inline
    def setIgnore(value: js.Array[String | Re]): Self = this.set("ignore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    
    @scala.inline
    def setIgnoreRootVarargs(value: String*): Self = this.set("ignoreRoot", js.Array(value :_*))
    
    @scala.inline
    def setIgnoreRoot(value: js.Array[String]): Self = this.set("ignoreRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreRoot: Self = this.set("ignoreRoot", js.undefined)
    
    @scala.inline
    def setLegacyWatch(value: Boolean): Self = this.set("legacyWatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegacyWatch: Self = this.set("legacyWatch", js.undefined)
    
    @scala.inline
    def setNoUpdateNotifier(value: Boolean): Self = this.set("noUpdateNotifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoUpdateNotifier: Self = this.set("noUpdateNotifier", js.undefined)
    
    @scala.inline
    def setNodeArgsVarargs(value: String*): Self = this.set("nodeArgs", js.Array(value :_*))
    
    @scala.inline
    def setNodeArgs(value: js.Array[String]): Self = this.set("nodeArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeArgs: Self = this.set("nodeArgs", js.undefined)
    
    @scala.inline
    def setPollingInterval(value: Double): Self = this.set("pollingInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePollingInterval: Self = this.set("pollingInterval", js.undefined)
    
    @scala.inline
    def setQuiet(value: Boolean): Self = this.set("quiet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuiet: Self = this.set("quiet", js.undefined)
    
    @scala.inline
    def setRestartable(value: String): Self = this.set("restartable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestartable: Self = this.set("restartable", js.undefined)
    
    @scala.inline
    def setRunOnChangeOnly(value: Boolean): Self = this.set("runOnChangeOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunOnChangeOnly: Self = this.set("runOnChangeOnly", js.undefined)
    
    @scala.inline
    def setScript(value: String): Self = this.set("script", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScript: Self = this.set("script", js.undefined)
    
    @scala.inline
    def setScriptPosition(value: Double): Self = this.set("scriptPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScriptPosition: Self = this.set("scriptPosition", js.undefined)
    
    @scala.inline
    def setSignal(value: StringDictionary[js.Any]): Self = this.set("signal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignal: Self = this.set("signal", js.undefined)
    
    @scala.inline
    def setSpawn(value: Boolean): Self = this.set("spawn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpawn: Self = this.set("spawn", js.undefined)
    
    @scala.inline
    def setStdin(value: Boolean): Self = this.set("stdin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStdin: Self = this.set("stdin", js.undefined)
    
    @scala.inline
    def setStdout(value: Boolean): Self = this.set("stdout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStdout: Self = this.set("stdout", js.undefined)
    
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
    
    @scala.inline
    def setWatchVarargs(value: (String | Re)*): Self = this.set("watch", js.Array(value :_*))
    
    @scala.inline
    def setWatch(value: js.Array[String | Re]): Self = this.set("watch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWatch: Self = this.set("watch", js.undefined)
  }
}
