package typings.nodeWindows

import typings.node.Buffer
import typings.node.childProcessMod.ExecException
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-windows", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("node-windows", "EventLogger")
  @js.native
  class EventLogger () extends StObject {
    def this(config: EventLogConfig) = this()
    
    /**
      * auditFailure
      * Log an audit failure message.
      * @param message
      * The content of the log message.
      * @param [code=1000]
      * The event code to assign to the message.
      * @param [callback]
      * An optional callback to run when the message is logged.
      */
    def auditFailure(message: String): Unit = js.native
    def auditFailure(message: String, code: Double): Unit = js.native
    def auditFailure(
      message: String,
      code: Double,
      callback: js.Function3[/* error */ ExecException, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
    ): Unit = js.native
    def auditFailure(
      message: String,
      code: Unit,
      callback: js.Function3[/* error */ ExecException, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
    ): Unit = js.native
    
    /**
      * auditSuccess
      * Log an audit success message.
      * @param message
      * The content of the log message.
      * @param [code=1000]
      * The event code to assign to the message.
      * @param [callback]
      * An optional callback to run when the message is logged.
      */
    def auditSuccess(message: String): Unit = js.native
    def auditSuccess(message: String, code: Double): Unit = js.native
    def auditSuccess(
      message: String,
      code: Double,
      callback: js.Function3[/* error */ ExecException, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
    ): Unit = js.native
    def auditSuccess(
      message: String,
      code: Unit,
      callback: js.Function3[/* error */ ExecException, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
    ): Unit = js.native
    
    /**
      * error
      * Log an error message.
      * @param message
      * The content of the log message.
      * @param [code=1000]
      * The event code to assign to the message.
      * @param [callback]
      * An optional callback to run when the message is logged.
      */
    def error(message: String): Unit = js.native
    def error(message: String, code: Double): Unit = js.native
    def error(
      message: String,
      code: Double,
      callback: js.Function3[/* error */ ExecException, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
    ): Unit = js.native
    def error(
      message: String,
      code: Unit,
      callback: js.Function3[/* error */ ExecException, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
    ): Unit = js.native
    
    /**
      * @cfg {String} [eventLog=APPLICATION]
      * The event log where messages should be written. This is either `APPLICATION` or `SYSTEM`.
      */
    var eventLog: String = js.native
    
    /**
      * info
      * Log an informational message.
      * @param message
      * The content of the log message.
      * @param [code=1000]
      * The event code to assign to the message.
      * @param [callback]
      * An optional callback to run when the message is logged.
      */
    def info(message: String): Unit = js.native
    def info(message: String, code: Double): Unit = js.native
    def info(
      message: String,
      code: Double,
      callback: js.Function3[/* error */ ExecException, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
    ): Unit = js.native
    def info(
      message: String,
      code: Unit,
      callback: js.Function3[/* error */ ExecException, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
    ): Unit = js.native
    
    /**
      * info
      * Log an informational message.
      * @param message
      * The content of the log message.
      * @param [code=1000]
      * The event code to assign to the message.
      * @param [callback]
      * An optional callback to run when the message is logged.
      */
    def information(message: String): Unit = js.native
    def information(message: String, code: Double): Unit = js.native
    def information(
      message: String,
      code: Double,
      callback: js.Function3[/* error */ ExecException, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
    ): Unit = js.native
    def information(
      message: String,
      code: Unit,
      callback: js.Function3[/* error */ ExecException, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
    ): Unit = js.native
    
    /**
      * @cfg {String} [name=Node.js]
      * The source of the log information. This is commonly the title of an application
      * or the Node.js script name (i.e. MyApp).
      */
    var source: String = js.native
    
    /**
      * warn
      * Log a warning message.
      * @param message
      * The content of the log message.
      * @param [code=1000]
      * The event code to assign to the message.
      * @param [callback]
      * An optional callback to run when the message is logged.
      */
    def warn(message: String): Unit = js.native
    def warn(message: String, code: Double): Unit = js.native
    def warn(
      message: String,
      code: Double,
      callback: js.Function3[/* error */ ExecException, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
    ): Unit = js.native
    def warn(
      message: String,
      code: Unit,
      callback: js.Function3[/* error */ ExecException, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
    ): Unit = js.native
    
    /**
      * warn
      * Log a warning message.
      * @param message
      * The content of the log message.
      * @param [code=1000]
      * The event code to assign to the message.
      * @param [callback]
      * An optional callback to run when the message is logged.
      */
    def warning(message: String): Unit = js.native
    def warning(message: String, code: Double): Unit = js.native
    def warning(
      message: String,
      code: Double,
      callback: js.Function3[/* error */ ExecException, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
    ): Unit = js.native
    def warning(
      message: String,
      code: Unit,
      callback: js.Function3[/* error */ ExecException, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
    ): Unit = js.native
  }
  
  @js.native
  sealed trait LogMode extends StObject
  @JSImport("node-windows", "LogMode")
  @js.native
  object LogMode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[LogMode & String] = js.native
    
    @js.native
    sealed trait append
      extends StObject
         with LogMode
    /* "append" */ val append: typings.nodeWindows.mod.LogMode.append & String = js.native
    
    @js.native
    sealed trait reset
      extends StObject
         with LogMode
    /* "reset" */ val reset: typings.nodeWindows.mod.LogMode.reset & String = js.native
    
    @js.native
    sealed trait roll
      extends StObject
         with LogMode
    /* "roll" */ val roll: typings.nodeWindows.mod.LogMode.roll & String = js.native
    
    @js.native
    sealed trait rotate
      extends StObject
         with LogMode
    /* "rotate" */ val rotate: typings.nodeWindows.mod.LogMode.rotate & String = js.native
  }
  
  @JSImport("node-windows", "Service")
  @js.native
  class Service protected () extends EventEmitter {
    def this(config: ServiceConfig) = this()
    
    /**
      * {Boolean} exists
      * Determine whether the service exists.
      */
    var exists: Boolean = js.native
    
    /**
      * install
      * Install the script as a process.
      * @param [dir=root of script]
      * The directory where the process files will be saved. Defaults to #script path.
      * @param [callback]
      * The callback to fire when the installation completes.
      */
    /**
      * @event install
      * Fired when the installation process is complete.
      */
    /**
      * @event alreadyinstalled
      * Fired if the script is already known to be a service.
      */
    /**
      * @event invalidinstallation
      * Fired if an installation is detected but missing required files.
      */
    /**
      * @event error
      * Fired in some instances when an error occurs.
      */
    def install(): Unit = js.native
    def install(dir: String): Unit = js.native
    
    /**
      * {Object} [logOnAs]
      * If you need to specify a specific user or particular credentials for the service log on as once installed, the following
      * attributes may be helpful.
      *
      * The `logOnAs` attribute is an object with four keys: `domain`,`account`, `password`, and `mungeCredentialsAfterInstall`.
      * This can be used to identify which user the service should run as once installed.
      *
      * If no account and password is specified, the logOnAs property is not used and the service will run as the "Local System" account.
      * If account and password is specified, but domain is not specified then the domain is set to the local computer name, but it can be overridden with an Active Directory
      * or LDAP domain. For example:
      *
      * **app.js**
      *
      *     var Service = require('node-windows').Service;
      *
      *     // Create a new service object
      *     var svc = new Service({
      *       name:'Hello World',
      *       script: require('path').join(__dirname,'helloworld.js')
      *     });
      *
      *     svc.logOnAs.domain = 'mydomain.local';
      *     svc.logOnAs.account = 'username';
      *     svc.logOnAs.password = 'password';
      *     ...
      *
      * Both the account and password must be explicitly defined if you want the service to log on as that user,
      * otherwise the Local System account will be used.
      */
    var logOnAs: User = js.native
    
    /**
      * restart
      * Restart an existing service
      */
    def restart(): Unit = js.native
    
    /**
      * {String} root
      * The root directory where the process files are stored.
      */
    var root: String = js.native
    
    /**
      * start
      * Start an existing method.
      */
    /**
      * @event start
      * Fired when the event has started.
      */
    def start(): Unit = js.native
    
    /**
      * stop
      * Stop the service.
      */
    /**
      * @event stop
      * Fired when the service is stopped.
      */
    def stop(): Unit = js.native
    
    /**
      * uninstall
      * Uninstall the service.
      * @param [waitTime]
      * Seconds to wait until winsw.exe finish processing the uninstall command.
      *
      *      var Service = require('node-windows').Service;
      *
      *      // Create a new service object
      *      var svc = new Service({
      *        name:'Hello World',
      *        script: require('path').join(__dirname,'helloworld.js')
      *      });
      *
      *      // Listen for the "uninstall" event so we know when it's done.
      *      svc.on('uninstall',function(){
      *        console.log('Uninstall complete.');
      *        console.log('The service exists: ',svc.exists);
      *      });
      *
      *      // Uninstall the service.
      *      svc.uninstall();
      */
    /**
      * @event uninstall
      * Fired when the uninstall is complete.
      */
    /**
      * @event alreadyuninstalled
      * Fired if the script is unknown as a service.
      */
    def uninstall(): Unit = js.native
    def uninstall(waitTime: Double): Unit = js.native
    
    /**
      * {Object} [user]
      * If you need to specify a specific user or particular credentials to manage a service, the following
      * attributes may be helpful.
      *
      * The `user` attribute is an object with three keys: `domain`,`account`, and `password`.
      * This can be used to identify which user the service library should use to perform system commands.
      * By default, the domain is set to the local computer name, but it can be overridden with an Active Directory
      * or LDAP domain. For example:
      *
      * **app.js**
      *
      *     var Service = require('node-windows').Service;
      *
      *     // Create a new service object
      *     var svc = new Service({
      *       name:'Hello World',
      *       script: require('path').join(__dirname,'helloworld.js')
      *     });
      *
      *     svc.user.domain = 'mydomain.local';
      *     svc.user.account = 'username';
      *     svc.user.password = 'password';
      *     ...
      *
      * Both the account and password must be explicitly defined if you want the service module to
      * run commands as a specific user. By default, it will run using the user account that launched
      * the process (i.e. who launched `node app.js`).
      */
    var user: User = js.native
    
    /**
      * {String} [workingdirectory]
      * The full path to the working directory that the service process
      * should launch from. If this is omitted, it will default to the
      * current processes working directory.
      */
    var workingdirectory: String = js.native
  }
  
  inline def elevate(cmd: String, options: js.Any, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("elevate")(cmd.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isAdminUser(callback: js.Function1[/* isAdmin */ Boolean, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isAdminUser")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def kill(pid: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("kill")(pid.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def kill(pid: Double, force: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("kill")(pid.asInstanceOf[js.Any], force.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def kill(pid: Double, force: Boolean, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("kill")(pid.asInstanceOf[js.Any], force.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def kill(pid: Double, force: Unit, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("kill")(pid.asInstanceOf[js.Any], force.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def list(callback: js.Function1[/* proc */ js.Any, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def list(callback: js.Function1[/* proc */ js.Any, Unit], verbose: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(callback.asInstanceOf[js.Any], verbose.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def sudo(cmd: String, password: String, options: js.Any, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sudo")(cmd.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait EnvironmentPair extends StObject {
    
    var name: String
    
    var value: String
  }
  object EnvironmentPair {
    
    inline def apply(name: String, value: String): EnvironmentPair = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnvironmentPair]
    }
    
    extension [Self <: EnvironmentPair](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait EventLogConfig extends StObject {
    
    var eventLog: js.UndefOr[String] = js.undefined
    
    var source: js.UndefOr[String] = js.undefined
  }
  object EventLogConfig {
    
    inline def apply(): EventLogConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventLogConfig]
    }
    
    extension [Self <: EventLogConfig](x: Self) {
      
      inline def setEventLog(value: String): Self = StObject.set(x, "eventLog", value.asInstanceOf[js.Any])
      
      inline def setEventLogUndefined: Self = StObject.set(x, "eventLog", js.undefined)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
  
  trait ServiceConfig extends StObject {
    
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
    
    inline def apply(script: String): ServiceConfig = {
      val __obj = js.Dynamic.literal(script = script.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceConfig]
    }
    
    extension [Self <: ServiceConfig](x: Self) {
      
      inline def setAbortOnError(value: Boolean): Self = StObject.set(x, "abortOnError", value.asInstanceOf[js.Any])
      
      inline def setAbortOnErrorUndefined: Self = StObject.set(x, "abortOnError", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setEnv(value: EnvironmentPair | js.Array[EnvironmentPair]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setEnvVarargs(value: EnvironmentPair*): Self = StObject.set(x, "env", js.Array(value :_*))
      
      inline def setExecPath(value: String): Self = StObject.set(x, "execPath", value.asInstanceOf[js.Any])
      
      inline def setExecPathUndefined: Self = StObject.set(x, "execPath", js.undefined)
      
      inline def setGrow(value: Double): Self = StObject.set(x, "grow", value.asInstanceOf[js.Any])
      
      inline def setGrowUndefined: Self = StObject.set(x, "grow", js.undefined)
      
      inline def setLogmode(value: LogMode): Self = StObject.set(x, "logmode", value.asInstanceOf[js.Any])
      
      inline def setLogmodeUndefined: Self = StObject.set(x, "logmode", js.undefined)
      
      inline def setLogpath(value: String): Self = StObject.set(x, "logpath", value.asInstanceOf[js.Any])
      
      inline def setLogpathUndefined: Self = StObject.set(x, "logpath", js.undefined)
      
      inline def setMaxRestarts(value: Double): Self = StObject.set(x, "maxRestarts", value.asInstanceOf[js.Any])
      
      inline def setMaxRestartsUndefined: Self = StObject.set(x, "maxRestarts", js.undefined)
      
      inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNodeOptions(value: String): Self = StObject.set(x, "nodeOptions", value.asInstanceOf[js.Any])
      
      inline def setNodeOptionsUndefined: Self = StObject.set(x, "nodeOptions", js.undefined)
      
      inline def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      inline def setStopparentfirst(value: Boolean): Self = StObject.set(x, "stopparentfirst", value.asInstanceOf[js.Any])
      
      inline def setStopparentfirstUndefined: Self = StObject.set(x, "stopparentfirst", js.undefined)
      
      inline def setStoptimeout(value: Double): Self = StObject.set(x, "stoptimeout", value.asInstanceOf[js.Any])
      
      inline def setStoptimeoutUndefined: Self = StObject.set(x, "stoptimeout", js.undefined)
      
      inline def setWait_(value: Double): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
      
      inline def setWait_Undefined: Self = StObject.set(x, "wait", js.undefined)
    }
  }
  
  trait User extends StObject {
    
    var account: String
    
    var domain: String
    
    var mungeCredentialsAfterInstall: js.UndefOr[Boolean] = js.undefined
    
    var password: String
  }
  object User {
    
    inline def apply(account: String, domain: String, password: String): User = {
      val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
      __obj.asInstanceOf[User]
    }
    
    extension [Self <: User](x: Self) {
      
      inline def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setMungeCredentialsAfterInstall(value: Boolean): Self = StObject.set(x, "mungeCredentialsAfterInstall", value.asInstanceOf[js.Any])
      
      inline def setMungeCredentialsAfterInstallUndefined: Self = StObject.set(x, "mungeCredentialsAfterInstall", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    }
  }
  
  trait WinswConfig extends StObject {
    
    var dependencies: String | js.Array[String]
    
    var description: js.UndefOr[String] = js.undefined
    
    var env: EnvironmentPair | js.Array[EnvironmentPair]
    
    var id: String
    
    var logOnAs: User
    
    var logmode: LogMode
    
    var logpath: String
    
    var name: String
    
    var nodeOptions: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var script: String
    
    var workingdirectory: String
    
    var wrapperArgs: String
  }
  object WinswConfig {
    
    inline def apply(
      dependencies: String | js.Array[String],
      env: EnvironmentPair | js.Array[EnvironmentPair],
      id: String,
      logOnAs: User,
      logmode: LogMode,
      logpath: String,
      name: String,
      script: String,
      workingdirectory: String,
      wrapperArgs: String
    ): WinswConfig = {
      val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], logOnAs = logOnAs.asInstanceOf[js.Any], logmode = logmode.asInstanceOf[js.Any], logpath = logpath.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any], workingdirectory = workingdirectory.asInstanceOf[js.Any], wrapperArgs = wrapperArgs.asInstanceOf[js.Any])
      __obj.asInstanceOf[WinswConfig]
    }
    
    extension [Self <: WinswConfig](x: Self) {
      
      inline def setDependencies(value: String | js.Array[String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesVarargs(value: String*): Self = StObject.set(x, "dependencies", js.Array(value :_*))
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setEnv(value: EnvironmentPair | js.Array[EnvironmentPair]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvVarargs(value: EnvironmentPair*): Self = StObject.set(x, "env", js.Array(value :_*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLogOnAs(value: User): Self = StObject.set(x, "logOnAs", value.asInstanceOf[js.Any])
      
      inline def setLogmode(value: LogMode): Self = StObject.set(x, "logmode", value.asInstanceOf[js.Any])
      
      inline def setLogpath(value: String): Self = StObject.set(x, "logpath", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNodeOptions(value: String | js.Array[String]): Self = StObject.set(x, "nodeOptions", value.asInstanceOf[js.Any])
      
      inline def setNodeOptionsUndefined: Self = StObject.set(x, "nodeOptions", js.undefined)
      
      inline def setNodeOptionsVarargs(value: String*): Self = StObject.set(x, "nodeOptions", js.Array(value :_*))
      
      inline def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      inline def setWorkingdirectory(value: String): Self = StObject.set(x, "workingdirectory", value.asInstanceOf[js.Any])
      
      inline def setWrapperArgs(value: String): Self = StObject.set(x, "wrapperArgs", value.asInstanceOf[js.Any])
    }
  }
}
