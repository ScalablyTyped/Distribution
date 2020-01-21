package typings.nodemon.mod

import org.scalablytyped.runtime.StringDictionary
import typings.nodemon.AnonRe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings
  extends /* k */ StringDictionary[js.Any] {
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
  var execMap: js.UndefOr[StringDictionary[js.Any]] = js.undefined
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
  var ignore: js.UndefOr[js.Array[String | AnonRe]] = js.undefined
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
  var signal: js.UndefOr[StringDictionary[js.Any]] = js.undefined
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
  var watch: js.UndefOr[js.Array[String | AnonRe]] = js.undefined
}

object Settings {
  @scala.inline
  def apply(
    StringDictionary: /* k */ StringDictionary[js.Any] = null,
    args: js.Array[String] = null,
    colours: js.UndefOr[Boolean] = js.undefined,
    cwd: String = null,
    delay: Int | Double = null,
    dump: js.UndefOr[Boolean] = js.undefined,
    env: StringDictionary[String | Boolean | Double] = null,
    events: StringDictionary[String] = null,
    exec: String = null,
    execMap: StringDictionary[js.Any] = null,
    exitcrash: js.UndefOr[Boolean] = js.undefined,
    ext: String = null,
    ignore: js.Array[String | AnonRe] = null,
    ignoreRoot: js.Array[String] = null,
    legacyWatch: js.UndefOr[Boolean] = js.undefined,
    noUpdateNotifier: js.UndefOr[Boolean] = js.undefined,
    nodeArgs: js.Array[String] = null,
    pollingInterval: Int | Double = null,
    quiet: js.UndefOr[Boolean] = js.undefined,
    restartable: String = null,
    runOnChangeOnly: js.UndefOr[Boolean] = js.undefined,
    script: String = null,
    scriptPosition: Int | Double = null,
    signal: StringDictionary[js.Any] = null,
    spawn: js.UndefOr[Boolean] = js.undefined,
    stdin: js.UndefOr[Boolean] = js.undefined,
    stdout: js.UndefOr[Boolean] = js.undefined,
    verbose: js.UndefOr[Boolean] = js.undefined,
    watch: js.Array[String | AnonRe] = null
  ): Settings = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (!js.isUndefined(colours)) __obj.updateDynamic("colours")(colours.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(dump)) __obj.updateDynamic("dump")(dump.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (exec != null) __obj.updateDynamic("exec")(exec.asInstanceOf[js.Any])
    if (execMap != null) __obj.updateDynamic("execMap")(execMap.asInstanceOf[js.Any])
    if (!js.isUndefined(exitcrash)) __obj.updateDynamic("exitcrash")(exitcrash.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (ignoreRoot != null) __obj.updateDynamic("ignoreRoot")(ignoreRoot.asInstanceOf[js.Any])
    if (!js.isUndefined(legacyWatch)) __obj.updateDynamic("legacyWatch")(legacyWatch.asInstanceOf[js.Any])
    if (!js.isUndefined(noUpdateNotifier)) __obj.updateDynamic("noUpdateNotifier")(noUpdateNotifier.asInstanceOf[js.Any])
    if (nodeArgs != null) __obj.updateDynamic("nodeArgs")(nodeArgs.asInstanceOf[js.Any])
    if (pollingInterval != null) __obj.updateDynamic("pollingInterval")(pollingInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(quiet)) __obj.updateDynamic("quiet")(quiet.asInstanceOf[js.Any])
    if (restartable != null) __obj.updateDynamic("restartable")(restartable.asInstanceOf[js.Any])
    if (!js.isUndefined(runOnChangeOnly)) __obj.updateDynamic("runOnChangeOnly")(runOnChangeOnly.asInstanceOf[js.Any])
    if (script != null) __obj.updateDynamic("script")(script.asInstanceOf[js.Any])
    if (scriptPosition != null) __obj.updateDynamic("scriptPosition")(scriptPosition.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal.asInstanceOf[js.Any])
    if (!js.isUndefined(spawn)) __obj.updateDynamic("spawn")(spawn.asInstanceOf[js.Any])
    if (!js.isUndefined(stdin)) __obj.updateDynamic("stdin")(stdin.asInstanceOf[js.Any])
    if (!js.isUndefined(stdout)) __obj.updateDynamic("stdout")(stdout.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    if (watch != null) __obj.updateDynamic("watch")(watch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

