package typings.nodeWindows.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceConfig extends js.Object {
  
  /**
    * @cfg {Boolean} [abortOnError=false]
    * Setting this to `true` will force the process to exit if it encounters an error that stops the node.js script from running.
    * This does not mean the process will stop if the script throws an error. It will only abort if the
    * script throws an error causing the process to exit (i.e. `process.exit(1)`).
    */
  var abortOnError: js.UndefOr[Boolean] = js.native
  
  var description: js.UndefOr[String] = js.native
  
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
  var env: js.UndefOr[EnvironmentPair | js.Array[EnvironmentPair]] = js.native
  
  /**
    * @cfg {String} execPath
    * The absolute path to the executable that will launch the script.
    * If omitted process.execPath is used.
    */
  var execPath: js.UndefOr[String] = js.native
  
  /**
    * @cfg {Number} [grow=.25]
    * A number between 0-1 representing the percentage growth rate for the #wait interval.
    * Setting this to anything other than `0` allows the process to increase it's wait period
    * on every restart attempt. If a process dies fatally, this will prevent the server from
    * restarting the process too rapidly (and too strenuously).
    */
  var grow: js.UndefOr[Double] = js.native
  
  var logmode: js.UndefOr[LogMode] = js.native
  
  var logpath: js.UndefOr[String] = js.native
  
  /**
    * @cfg {Number} [maxRestarts=3]
    * The maximum number of restarts within a 60 second period before haulting the process.
    * This cannot be _disabled_, but it can be rendered ineffective by setting a value of `0`.
    */
  var maxRestarts: js.UndefOr[Double] = js.native
  
  /**
    * @cfg {Number} [maxRetries=null]
    * The maximum number of restart attempts to make before the service is considered non-responsive/faulty.
    * Ignored by default.
    */
  var maxRetries: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  /**
    * @cfg {string} [nodeOptions='--harmony']
    * Options to be passed to the node process.
    */
  var nodeOptions: js.UndefOr[String] = js.native
  
  /**
    * @cfg {String} script
    * The absolute path of the script to launch as a service.
    * @required
    */
  var script: String = js.native
  
  /**
    * @cfg {Boolean} [stopparentfirst=false]
    * Allow the service to shutdown cleanly.
    */
  var stopparentfirst: js.UndefOr[Boolean] = js.native
  
  /**
    * @cfg {Number} [stoptimeout=30]
    * How long to wait in seconds before force killing the application.
    * This only takes effect when stopparentfirst is enabled.
    */
  var stoptimeout: js.UndefOr[Double] = js.native
  
  /**
    * @cfg {Number} [wait=1]
    * The initial number of seconds to wait before attempting a restart (after the script stops).
    */
  @JSName("wait")
  var wait_FServiceConfig: js.UndefOr[Double] = js.native
}
object ServiceConfig {
  
  @scala.inline
  def apply(script: String): ServiceConfig = {
    val __obj = js.Dynamic.literal(script = script.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceConfig]
  }
  
  @scala.inline
  implicit class ServiceConfigOps[Self <: ServiceConfig] (val x: Self) extends AnyVal {
    
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
    def setScript(value: String): Self = this.set("script", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbortOnError(value: Boolean): Self = this.set("abortOnError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbortOnError: Self = this.set("abortOnError", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEnvVarargs(value: EnvironmentPair*): Self = this.set("env", js.Array(value :_*))
    
    @scala.inline
    def setEnv(value: EnvironmentPair | js.Array[EnvironmentPair]): Self = this.set("env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    
    @scala.inline
    def setExecPath(value: String): Self = this.set("execPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecPath: Self = this.set("execPath", js.undefined)
    
    @scala.inline
    def setGrow(value: Double): Self = this.set("grow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrow: Self = this.set("grow", js.undefined)
    
    @scala.inline
    def setLogmode(value: LogMode): Self = this.set("logmode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogmode: Self = this.set("logmode", js.undefined)
    
    @scala.inline
    def setLogpath(value: String): Self = this.set("logpath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogpath: Self = this.set("logpath", js.undefined)
    
    @scala.inline
    def setMaxRestarts(value: Double): Self = this.set("maxRestarts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRestarts: Self = this.set("maxRestarts", js.undefined)
    
    @scala.inline
    def setMaxRetries(value: Double): Self = this.set("maxRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRetries: Self = this.set("maxRetries", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNodeOptions(value: String): Self = this.set("nodeOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeOptions: Self = this.set("nodeOptions", js.undefined)
    
    @scala.inline
    def setStopparentfirst(value: Boolean): Self = this.set("stopparentfirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopparentfirst: Self = this.set("stopparentfirst", js.undefined)
    
    @scala.inline
    def setStoptimeout(value: Double): Self = this.set("stoptimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoptimeout: Self = this.set("stoptimeout", js.undefined)
    
    @scala.inline
    def setWait(value: Double): Self = this.set("wait", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWait: Self = this.set("wait", js.undefined)
  }
}
