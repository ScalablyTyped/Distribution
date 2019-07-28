package typings.nodeDashWindows.nodeDashWindowsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceConfig extends js.Object {
  /**
    * @cfg {Boolean} [abortOnError=false]
    * Setting this to `true` will force the process to exit if it encounters an error that stops the node.js script from running.
    * This does not mean the process will stop if the script throws an error. It will only abort if the
    * script throws an error causing the process to exit (i.e. `process.exit(1)`).
    */
  var abortOnError: js.UndefOr[Boolean] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  /**
    * @cfg {Array|Object} [env]
    * An optional array or object used to pass environment variables to the node.js script.
    * You can do this by setting environment variables in the service config, as shown below:
    *
    *     var svc = new Service({
    *      name:'Hello World',
    *      description: 'The nodejs.org example web server.',
    *      script: 'C:\\path\\to\\helloworld.js',
    *      env: {
    *        name: "NODE_ENV",
    *        value: "production"
    *      }
    *     });
    *
    * You can also supply an array to set multiple environment variables:
    *
    *     var svc = new Service({
    *      name:'Hello World',
    *      description: 'The nodejs.org example web server.',
    *      script: 'C:\\path\\to\\helloworld.js',
    *      env: [{
    *        name: "HOME",
    *        value: process.env["USERPROFILE"] // Access the user home directory
    *      },{
    *        name: "NODE_ENV",
    *        value: "production"
    *      }]
    *     });
    */
  var env: js.UndefOr[EnvironmentPair | js.Array[EnvironmentPair]] = js.undefined
  /**
    * @cfg {String} execPath
    * The absolute path to the executable that will launch the script.
    * If omitted process.execPath is used.
    */
  var execPath: js.UndefOr[String] = js.undefined
  /**
    * @cfg {Number} [grow=.25]
    * A number between 0-1 representing the percentage growth rate for the #wait interval.
    * Setting this to anything other than `0` allows the process to increase it's wait period
    * on every restart attempt. If a process dies fatally, this will prevent the server from
    * restarting the process too rapidly (and too strenuously).
    */
  var grow: js.UndefOr[Double] = js.undefined
  var logmode: js.UndefOr[LogMode] = js.undefined
  var logpath: js.UndefOr[String] = js.undefined
  /**
    * @cfg {Number} [maxRestarts=3]
    * The maximum number of restarts within a 60 second period before haulting the process.
    * This cannot be _disabled_, but it can be rendered ineffective by setting a value of `0`.
    */
  var maxRestarts: js.UndefOr[Double] = js.undefined
  /**
    * @cfg {Number} [maxRetries=null]
    * The maximum number of restart attempts to make before the service is considered non-responsive/faulty.
    * Ignored by default.
    */
  var maxRetries: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  /**
    * @cfg {string} [nodeOptions='--harmony']
    * Options to be passed to the node process.
    */
  var nodeOptions: js.UndefOr[String] = js.undefined
  /**
    * @cfg {String} script
    * The absolute path of the script to launch as a service.
    * @required
    */
  var script: String
  /**
    * @cfg {Boolean} [stopparentfirst=false]
    * Allow the service to shutdown cleanly.
    */
  var stopparentfirst: js.UndefOr[Boolean] = js.undefined
  /**
    * @cfg {Number} [stoptimeout=30]
    * How long to wait in seconds before force killing the application.
    * This only takes effect when stopparentfirst is enabled.
    */
  var stoptimeout: js.UndefOr[Double] = js.undefined
  /**
    * @cfg {Number} [wait=1]
    * The initial number of seconds to wait before attempting a restart (after the script stops).
    */
  @JSName("wait")
  var wait_FServiceConfig: js.UndefOr[Double] = js.undefined
}

object ServiceConfig {
  @scala.inline
  def apply(
    script: String,
    abortOnError: js.UndefOr[Boolean] = js.undefined,
    description: String = null,
    env: EnvironmentPair | js.Array[EnvironmentPair] = null,
    execPath: String = null,
    grow: Int | Double = null,
    logmode: LogMode = null,
    logpath: String = null,
    maxRestarts: Int | Double = null,
    maxRetries: Int | Double = null,
    name: String = null,
    nodeOptions: String = null,
    stopparentfirst: js.UndefOr[Boolean] = js.undefined,
    stoptimeout: Int | Double = null,
    wait: Int | Double = null
  ): ServiceConfig = {
    val __obj = js.Dynamic.literal(script = script)
    if (!js.isUndefined(abortOnError)) __obj.updateDynamic("abortOnError")(abortOnError)
    if (description != null) __obj.updateDynamic("description")(description)
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (execPath != null) __obj.updateDynamic("execPath")(execPath)
    if (grow != null) __obj.updateDynamic("grow")(grow.asInstanceOf[js.Any])
    if (logmode != null) __obj.updateDynamic("logmode")(logmode)
    if (logpath != null) __obj.updateDynamic("logpath")(logpath)
    if (maxRestarts != null) __obj.updateDynamic("maxRestarts")(maxRestarts.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (nodeOptions != null) __obj.updateDynamic("nodeOptions")(nodeOptions)
    if (!js.isUndefined(stopparentfirst)) __obj.updateDynamic("stopparentfirst")(stopparentfirst)
    if (stoptimeout != null) __obj.updateDynamic("stoptimeout")(stoptimeout.asInstanceOf[js.Any])
    if (wait != null) __obj.updateDynamic("wait")(wait.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceConfig]
  }
}

