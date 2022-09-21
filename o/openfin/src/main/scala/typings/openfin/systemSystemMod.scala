package typings.openfin

import typings.openfin.baseMod.EmitterBase
import typings.openfin.certifiedAppInfoMod.CertifiedAppInfo
import typings.openfin.clearCacheOptionMod.ClearCacheOption
import typings.openfin.cookieMod.CookieInfo
import typings.openfin.cookieMod.CookieOption
import typings.openfin.crashReporterOptionMod.CrashReporterOption
import typings.openfin.downloadAssetMod.AppAssetInfo
import typings.openfin.downloadAssetMod.AppAssetRequest
import typings.openfin.downloadAssetMod.RuntimeDownloadOptions
import typings.openfin.downloadAssetMod.RuntimeDownloadProgress
import typings.openfin.downloadPreloadMod.DownloadPreloadInfo
import typings.openfin.downloadPreloadMod.DownloadPreloadOption
import typings.openfin.entityMod.Entity
import typings.openfin.entityMod.EntityInfo
import typings.openfin.externalProcessMod.ExternalConnection
import typings.openfin.externalProcessMod.ExternalProcessInfo
import typings.openfin.externalProcessMod.ExternalProcessRequestType
import typings.openfin.externalProcessMod.ServiceConfiguration
import typings.openfin.externalProcessMod.TerminateExternalRequestType
import typings.openfin.hostSpecsMod.HostSpecs
import typings.openfin.identityMod.Identity
import typings.openfin.installedAppsMod.InstalledApps
import typings.openfin.logMod.GetLogRequestType
import typings.openfin.logMod.LogInfo
import typings.openfin.logMod.LogLevel
import typings.openfin.monitorMod.MonitorInfo
import typings.openfin.pointMod.PointTopLeft
import typings.openfin.processMod.ProcessInfo
import typings.openfin.proxyMod.ProxyConfig
import typings.openfin.proxyMod.ProxyInfo
import typings.openfin.registryInfoMod.RegistryInfo
import typings.openfin.runtimeInfoMod.RuntimeInfo
import typings.openfin.rvmMod.RVMInfo
import typings.openfin.systemApplicationMod.ApplicationInfo
import typings.openfin.systemMod.SystemEvents
import typings.openfin.systemWindowMod.WindowInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemSystemMod {
  
  @JSImport("openfin/_v2/api/system/system", JSImport.Default)
  @js.native
  open class default protected () extends System {
    def this(wire: typings.openfin.transportMod.default) = this()
  }
  
  trait ServiceIdentifier extends StObject {
    
    var name: String
  }
  object ServiceIdentifier {
    
    inline def apply(name: String): ServiceIdentifier = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceIdentifier]
    }
    
    extension [Self <: ServiceIdentifier](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait System extends EmitterBase[SystemEvents] {
    
    /**
      * Clears cached data containing application resource
      * files (images, HTML, JavaScript files), cookies, and items stored in the
      * Local Storage.
      * @param { ClearCacheOption } options - See tutorial for more details.
      * @return {Promise.<void>}
      * @tutorial System.clearCache
      */
    def clearCache(options: ClearCacheOption): js.Promise[Unit] = js.native
    
    /**
      * Clears all cached data when OpenFin Runtime exits.
      * @return {Promise.<void>}
      * @tutorial System.deleteCacheOnExit
      */
    def deleteCacheOnExit(): js.Promise[Unit] = js.native
    
    /**
      * Downloads the given application asset<br>
      * Note: This method is restricted by default and must be enabled via
      * <a href="https://developers.openfin.co/docs/api-security">API security settings</a>.
      * @param { AppAssetInfo } appAsset App asset object
      * @return {Promise.<void>}
      * @tutorial System.downloadAsset
      */
    def downloadAsset(
      appAsset: AppAssetInfo,
      progressListener: js.Function1[/* progress */ RuntimeDownloadProgress, Unit]
    ): js.Promise[Unit] = js.native
    
    /**
      * Download preload scripts from given URLs
      * @param {DownloadPreloadOption[]} scripts - URLs of preload scripts. See tutorial for more details.
      * @return {Promise.Array<DownloadPreloadInfo>}
      * @tutorial System.downloadPreloadScripts
      */
    def downloadPreloadScripts(scripts: js.Array[DownloadPreloadOption]): js.Promise[js.Array[DownloadPreloadInfo]] = js.native
    
    /**
      * Downloads a version of the runtime.
      * @param { RuntimeDownloadOptions } options - Download options.
      * @param {Function} [progressListener] - called as the runtime is downloaded with progress information.
      * @return {Promise.<void>}
      * @tutorial System.downloadRuntime
      */
    def downloadRuntime(
      options: RuntimeDownloadOptions,
      progressListener: js.Function1[/* progress */ RuntimeDownloadProgress, Unit]
    ): js.Promise[Unit] = js.native
    
    /**
      * Retrieves an array of data for all external applications
      * @param { Identity } requestingIdentity This object is described in the Identity typedef
      * @param { any } data Any data type to pass to the method
      * @return {Promise.<any>}
      * @ignore
      */
    def executeOnRemote(requestingIdentity: Identity, data: Any): js.Promise[Any] = js.native
    
    /**
      * Exits the Runtime.
      * @return {Promise.<void>}
      * @tutorial System.exit
      */
    def exit(): js.Promise[Unit] = js.native
    
    /**
      * Writes any unwritten cookies data to disk.
      * @return {Promise.<void>}
      * @tutorial System.flushCookieStore
      */
    def flushCookieStore(): js.Promise[Unit] = js.native
    
    /**
      * Retrieves an array of data for all applications.
      * @return {Promise.Array.<ApplicationInfo>}
      * @tutorial System.getAllApplications
      */
    def getAllApplications(): js.Promise[js.Array[ApplicationInfo]] = js.native
    
    /**
      * Retrieves an array of data (name, ids, bounds) for all application windows.
      * @return {Promise.Array.<Identity>}
      * @tutorial System.getAllExternalApplications
      */
    def getAllExternalApplications(): js.Promise[js.Array[Identity]] = js.native
    
    /**
      * Retrieves an array of objects representing information about currently
      * running user-friendly native windows on the system.<br>
      * Note: This method is restricted by default and must be enabled via
      * <a href="https://developers.openfin.co/docs/api-security">API security settings</a>.
      * @return {Promise.Array.<Identity>}
      * @experimental
      */
    def getAllExternalWindows(): js.Promise[js.Array[Identity]] = js.native
    
    /**
      * Retrieves an array of data (name, ids, bounds) for all application windows.
      * @return {Promise.Array.<WindowInfo>}
      * @tutorial System.getAllWindows
      */
    def getAllWindows(): js.Promise[js.Array[WindowInfo]] = js.native
    
    /**
      * Retrieves app asset information.
      * @param { AppAssetRequest } options
      * @return {Promise.<AppAssetInfo>}
      * @tutorial System.getAppAssetInfo
      */
    def getAppAssetInfo(options: AppAssetRequest): js.Promise[AppAssetInfo] = js.native
    
    /**
      * Retrieves the command line argument string that started OpenFin Runtime.
      * @return {Promise.<string>}
      * @tutorial System.getCommandLineArguments
      */
    def getCommandLineArguments(): js.Promise[String] = js.native
    
    /**
      * Get additional info of cookies.
      * @param { CookieOption } options - See tutorial for more details.
      * @return {Promise.Array.<CookieInfo>}
      * @tutorial System.getCookies
      */
    def getCookies(options: CookieOption): js.Promise[js.Array[CookieInfo]] = js.native
    
    /**
      * Get the current state of the crash reporter.
      * @return {Promise.<CrashReporterOption>}
      * @tutorial System.getCrashReporterState
      */
    def getCrashReporterState(): js.Promise[CrashReporterOption] = js.native
    
    def getDeviceId(): js.Promise[String] = js.native
    
    /**
      * Returns a hex encoded hash of the mac address and the currently logged in user name
      * @return {Promise.<string>}
      * @tutorial System.getDeviceUserId
      */
    def getDeviceUserId(): js.Promise[String] = js.native
    
    /**
      * Retrieves a frame info object for the uuid and name passed in
      * @param { string } uuid - The UUID of the target.
      * @param { string } name - The name of the target.
      * @return {Promise.<EntityInfo>}
      * @tutorial System.getEntityInfo
      */
    def getEntityInfo(uuid: String, name: String): js.Promise[EntityInfo] = js.native
    
    /**
      * Gets the value of a given environment variable on the computer on which the runtime is installed
      * @return {Promise.<string>}
      * @tutorial System.getEnvironmentVariable
      */
    def getEnvironmentVariable(envName: String): js.Promise[String] = js.native
    
    /**
      * Get currently focused external window.
      * @return {Promise.<Identity>}
      * @experimental
      */
    def getFocusedExternalWindow(): js.Promise[Identity] = js.native
    
    /**
      * Get current focused window.
      * @return {Promise.<WindowInfo>}
      * @tutorial System.getFocusedWindow
      */
    def getFocusedWindow(): js.Promise[WindowInfo] = js.native
    
    /**
      * Retrieves system information.
      * @return {Promise.<HostSpecs>}
      * @tutorial System.getHostSpecs
      */
    def getHostSpecs(): js.Promise[HostSpecs] = js.native
    
    def getInstalledApps(): js.Promise[InstalledApps] = js.native
    
    /**
      * Returns an array of all the installed runtime versions in an object.
      * @return {Promise.<string[]>}
      * @tutorial System.getInstalledRuntimes
      */
    def getInstalledRuntimes(): js.Promise[js.Array[String]] = js.native
    
    /**
      * Retrieves the contents of the log with the specified filename.
      * @param { GetLogRequestType } options A object that id defined by the GetLogRequestType interface
      * @return {Promise.<string>}
      * @tutorial System.getLog
      */
    def getLog(options: GetLogRequestType): js.Promise[String] = js.native
    
    /**
      * Retrieves an array containing information for each log file.
      * @return {Promise.Array<LogInfo>}
      * @tutorial System.getLogList
      */
    def getLogList(): js.Promise[js.Array[LogInfo]] = js.native
    
    /**
      * Returns a unique identifier (UUID) provided by the machine.
      * @return {Promise.<string>}
      * @tutorial System.getMachineId
      */
    def getMachineId(): js.Promise[String] = js.native
    
    /**
      * Returns the minimum (inclusive) logging level that is currently being written to the log.
      * @return {Promise.<LogLevel>}
      * @tutorial System.getMinLogLevel
      */
    def getMinLogLevel(): js.Promise[LogLevel] = js.native
    
    /**
      * Retrieves an object that contains data about the monitor setup of the
      * computer that the runtime is running on.
      * @return {Promise.<MonitorInfo>}
      * @tutorial System.getMonitorInfo
      */
    def getMonitorInfo(): js.Promise[MonitorInfo] = js.native
    
    /**
      * Returns the mouse in virtual screen coordinates (left, top).
      * @return {Promise.<PointTopLeft>}
      * @tutorial System.getMousePosition
      */
    def getMousePosition(): js.Promise[PointTopLeft] = js.native
    
    /**
      * Retrieves an array of all of the runtime processes that are currently
      * running. Each element in the array is an object containing the uuid
      * and the name of the application to which the process belongs.
      * @return {Promise.Array.<ProcessInfo>}
      * @tutorial System.getProcessList
      */
    def getProcessList(): js.Promise[js.Array[ProcessInfo]] = js.native
    
    /**
      * Retrieves the Proxy settings.
      * @return {Promise.<ProxyInfo>}
      * @tutorial System.getProxySettings
      */
    def getProxySettings(): js.Promise[ProxyInfo] = js.native
    
    /**
      * Returns information about the running Runtime in an object.
      * @return {Promise.<RuntimeInfo>}
      * @tutorial System.getRuntimeInfo
      */
    def getRuntimeInfo(): js.Promise[RuntimeInfo] = js.native
    
    /**
      * Returns information about the running RVM in an object.
      * @return {Promise.<RVMInfo>}
      * @tutorial System.getRvmInfo
      */
    def getRvmInfo(): js.Promise[RVMInfo] = js.native
    
    /**
      * Returns the json blob found in the [desktop owner settings](https://openfin.co/documentation/desktop-owner-settings/)
      * for the specified service.
      * More information about desktop services can be found [here](https://developers.openfin.co/docs/desktop-services).
      * @param { ServiceIdentifier } serviceIdentifier An object containing a name key that identifies the service.
      * @return {Promise.<ServiceConfiguration>}
      * @tutorial System.getServiceConfiguration
      */
    def getServiceConfiguration(serviceIdentifier: ServiceIdentifier): js.Promise[ServiceConfiguration] = js.native
    
    /**
      * Returns a hex encoded hash of the machine id and the currently logged in user name.
      * This is the recommended way to uniquely identify a user / machine combination.
      * @return {Promise.<string>}
      * @tutorial System.getUniqueUserId
      * @static
      */
    def getUniqueUserId(): js.Promise[String] = js.native
    
    /**
      * Adds a listener to the end of the listeners array for the specified event.
      * @param { string | symbol } eventType  - The type of the event.
      * @param { Function } listener - Called whenever an event of the specified type occurs.
      * @param { SubOptions } [options] - Option to support event timestamps.
      * @return {Promise.<this>}
      * @function addListener
      * @memberof System
      * @instance
      * @tutorial System.EventEmitter
      */
    /**
      * Adds a listener to the end of the listeners array for the specified event.
      * @param { string | symbol } eventType  - The type of the event.
      * @param { Function } listener - Called whenever an event of the specified type occurs.
      * @param { SubOptions } [options] - Option to support event timestamps.
      * @return {Promise.<this>}
      * @function on
      * @memberof System
      * @instance
      * @tutorial System.EventEmitter
      */
    /**
      * Adds a one time listener for the event. The listener is invoked only the first time the event is fired, after which it is removed.
      * @param { string | symbol } eventType  - The type of the event.
      * @param { Function } listener - The callback function.
      * @param { SubOptions } [options] - Option to support event timestamps.
      * @return {Promise.<this>}
      * @function once
      * @memberof System
      * @instance
      * @tutorial System.EventEmitter
      */
    /**
      * Adds a listener to the beginning of the listeners array for the specified event.
      * @param { string | symbol } eventType  - The type of the event.
      * @param { Function } listener - The callback function.
      * @param { SubOptions } [options] - Option to support event timestamps.
      * @return {Promise.<this>}
      * @function prependListener
      * @memberof System
      * @instance
      * @tutorial System.EventEmitter
      */
    /**
      * Adds a one time listener for the event. The listener is invoked only the first time the event is fired, after which it is removed.
      * The listener is added to the beginning of the listeners array.
      * @param { string | symbol } eventType  - The type of the event.
      * @param { Function } listener - The callback function.
      * @param { SubOptions } [options] - Option to support event timestamps.
      * @return {Promise.<this>}
      * @function prependOnceListener
      * @memberof System
      * @instance
      * @tutorial System.EventEmitter
      */
    /**
      * Remove a listener from the listener array for the specified event.
      * Caution: Calling this method changes the array indices in the listener array behind the listener.
      * @param { string | symbol } eventType  - The type of the event.
      * @param { Function } listener - The callback function.
      * @param { SubOptions } [options] - Option to support event timestamps.
      * @return {Promise.<this>}
      * @function removeListener
      * @memberof System
      * @instance
      * @tutorial System.EventEmitter
      */
    /**
      * Removes all listeners, or those of the specified event.
      * @param { string | symbol } [eventType]  - The type of the event.
      * @return {Promise.<this>}
      * @function removeAllListeners
      * @memberof System
      * @instance
      * @tutorial System.EventEmitter
      */
    /**
      * Returns the version of the runtime. The version contains the major, minor,
      * build and revision numbers.
      * @return {Promise.<string>}
      * @tutorial System.getVersion
      */
    def getVersion(): js.Promise[String] = js.native
    
    /**
      * Returns information about the given app's certification status
      * @return {Promise.<CertifiedAppInfo>}
      * @tutorial System.isAppCertified
      */
    def isAppCertified(manifestUrl: String): js.Promise[CertifiedAppInfo] = js.native
    
    /**
      * Runs an executable or batch file. A path to the file must be included in options.
      * <br> A uuid may be optionally provided. If not provided, OpenFin will create a uuid for the new process.
      * <br> Note: This method is restricted by default and must be enabled via
      * <a href="https://developers.openfin.co/docs/api-security">API security settings</a>.
      * @param { ExternalProcessRequestType } options A object that is defined in the ExternalProcessRequestType interface
      * @return {Promise.<Identity>}
      * @tutorial System.launchExternalProcess
      */
    def launchExternalProcess(options: ExternalProcessRequestType): js.Promise[Identity] = js.native
    
    /**
      * Writes the passed message into both the log file and the console.
      * @param { string } level The log level for the entry. Can be either "info", "warning" or "error"
      * @param { string } message The log message text
      * @return {Promise.<void>}
      * @tutorial System.log
      */
    def log(level: String, message: String): js.Promise[Unit] = js.native
    
    /**
      * Monitors a running process. A pid for the process must be included in options.
      * <br> A uuid may be optionally provided. If not provided, OpenFin will create a uuid for the new process.
      * @param { ExternalProcessInfo } options See tutorial for more details
      * @return {Promise.<Identity>}
      * @tutorial System.monitorExternalProcess
      */
    def monitorExternalProcess(options: ExternalProcessInfo): js.Promise[Identity] = js.native
    
    /**
      * Opens the passed URL in the default web browser.
      * @param { string } url The URL to open
      * @return {Promise.<void>}
      * @tutorial System.openUrlWithBrowser
      */
    def openUrlWithBrowser(url: String): js.Promise[Unit] = js.native
    
    /**
      * Reads the specifed value from the registry.<br>
      * Note: This method is restricted by default and must be enabled via
      * <a href="https://developers.openfin.co/docs/api-security">API security settings</a>.
      * @param { string } rootKey - The registry root key.
      * @param { string } subkey - The registry key.
      * @param { string } value - The registry value name.
      * @return {Promise.<RegistryInfo>}
      * @tutorial System.readRegistryValue
      */
    def readRegistryValue(rootKey: String, subkey: String, value: String): js.Promise[RegistryInfo] = js.native
    
    /**
      * This function call will register a unique id and produce a token.
      * The token can be used to broker an external connection.
      * @param { string } uuid - A UUID for the remote connection.
      * @return {Promise.<ExternalConnection>}
      * @tutorial System.registerExternalConnection
      */
    def registerExternalConnection(uuid: String): js.Promise[ExternalConnection] = js.native
    
    /**
      * Removes the process entry for the passed UUID obtained from a prior call
      * of fin.System.launchExternalProcess().
      * @param { string } uuid The UUID for a process obtained from a prior call to fin.desktop.System.launchExternalProcess()
      * @return {Promise.<void>}
      * @tutorial System.releaseExternalProcess
      */
    def releaseExternalProcess(uuid: String): js.Promise[Unit] = js.native
    
    /**
      * Retrieves the UUID of the computer on which the runtime is installed
      * @param { string } uuid The uuid of the running application
      * @return {Promise.<Entity>}
      * @tutorial System.resolveUuid
      */
    def resolveUuid(uuid: String): js.Promise[Entity] = js.native
    
    /**
      * Signals the RVM to perform a health check and returns the results as json.
      * @return {Promise.<string[]>}
      * @tutorial System.runRvmHealthCheck
      */
    def runRvmHealthCheck(): js.Promise[js.Array[String]] = js.native
    
    /* private */ var sendExternalProcessRequest: Any = js.native
    
    /**
      * Set the minimum log level above which logs will be written to the OpenFin log
      * @param { LogLevel } The minimum level (inclusive) above which all calls to log will be written
      * @return {Promise.<void>}
      * @tutorial System.setMinLogLevel
      */
    def setMinLogLevel(level: LogLevel): js.Promise[Unit] = js.native
    
    /**
      * Shows the Chromium Developer Tools for the specified window
      * @param { Identity } identity This is a object that is defined by the Identity interface
      * @return {Promise.<void>}
      * @tutorial System.showDeveloperTools
      */
    def showDeveloperTools(identity: Identity): js.Promise[Unit] = js.native
    
    /**
      * Start the crash reporter for the browser process if not already running.
      * You can optionally specify `diagnosticMode` to have the logs sent to
      * OpenFin on runtime close
      *
      * @param { CrashReporterOption } options - configure crash reporter
      * @return {Promise.<CrashReporterOption>}
      * @tutorial System.startCrashReporter
      */
    def startCrashReporter(options: CrashReporterOption): js.Promise[CrashReporterOption] = js.native
    
    /**
      * Attempt to close an external process. The process will be terminated if it
      * has not closed after the elapsed timeout in milliseconds.<br>
      * Note: This method is restricted by default and must be enabled via
      * <a href="https://developers.openfin.co/docs/api-security">API security settings</a>.
      * @param { TerminateExternalRequestType } options A object defined in the TerminateExternalRequestType interface
      * @return {Promise.<void>}
      * @tutorial System.terminateExternalProcess
      */
    def terminateExternalProcess(options: TerminateExternalRequestType): js.Promise[Unit] = js.native
    
    /**
      * Update the OpenFin Runtime Proxy settings.
      * @param { ProxyConfig } options A config object defined in the ProxyConfig interface
      * @return {Promise.<void>}
      * @tutorial System.updateProxySettings
      */
    def updateProxySettings(options: ProxyConfig): js.Promise[Unit] = js.native
  }
}
