package typings
package nodeDashWindowsLib.nodeDashWindowsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-windows", "Service")
@js.native
class Service protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(config: ServiceConfig) = this()
  /**
    * {Boolean} exists
    * Determine whether the service exists.
    */
  var exists: scala.Boolean = js.native
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
    * {String} root
    * The root directory where the process files are stored.
    */
  var root: java.lang.String = js.native
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
  var workingdirectory: java.lang.String = js.native
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
  def install(): scala.Unit = js.native
  def install(dir: java.lang.String): scala.Unit = js.native
  /**
    * restart
    * Restart an existing service
    */
  def restart(): scala.Unit = js.native
  /**
    * start
    * Start an existing method.
    */
  /**
    * @event start
    * Fired when the event has started.
    */
  def start(): scala.Unit = js.native
  /**
    * stop
    * Stop the service.
    */
  /**
    * @event stop
    * Fired when the service is stopped.
    */
  def stop(): scala.Unit = js.native
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
  def uninstall(): scala.Unit = js.native
  def uninstall(waitTime: scala.Double): scala.Unit = js.native
}

