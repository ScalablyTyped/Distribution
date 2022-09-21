package typings.openfin.mod.fin

import typings.openfin.anon.DownloadedBytes
import typings.openfin.anon.Path
import typings.openfin.anon.Result
import typings.openfin.anon.Token
import typings.openfin.anon.UuidString
import typings.openfin.openfinStrings.debug
import typings.openfin.openfinStrings.error
import typings.openfin.openfinStrings.info
import typings.openfin.openfinStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * System
  * An object representing the core of OpenFin Runtime.
  * Allows the developer to perform system-level actions, such as accessing logs, viewing processes, clearing the cache and exiting the runtime.
  */
@js.native
trait OpenFinSystem extends StObject {
  
  var Clipboard: OpenFinClipboard = js.native
  
  /**
    * Registers an event listener on the specified event.
    */
  def addEventListener(
    `type`: OpenFinSystemEventType,
    listener: js.Function1[
      /* event */ SystemBaseEvent | DesktopIconClickedEvent | IdleStateChangedEvent | MonitorInfoChangedEvent | SessionChangedEvent, 
      Unit
    ]
  ): Unit = js.native
  def addEventListener(
    `type`: OpenFinSystemEventType,
    listener: js.Function1[
      /* event */ SystemBaseEvent | DesktopIconClickedEvent | IdleStateChangedEvent | MonitorInfoChangedEvent | SessionChangedEvent, 
      Unit
    ],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def addEventListener(
    `type`: OpenFinSystemEventType,
    listener: js.Function1[
      /* event */ SystemBaseEvent | DesktopIconClickedEvent | IdleStateChangedEvent | MonitorInfoChangedEvent | SessionChangedEvent, 
      Unit
    ],
    callback: js.Function0[Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def addEventListener(
    `type`: OpenFinSystemEventType,
    listener: js.Function1[
      /* event */ SystemBaseEvent | DesktopIconClickedEvent | IdleStateChangedEvent | MonitorInfoChangedEvent | SessionChangedEvent, 
      Unit
    ],
    callback: Unit,
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  
  /**
    * Clears cached data containing window state/positions,
    * application resource files (images, HTML, JavaScript files), cookies, and items stored in the Local Storage.
    */
  def clearCache(options: ClearCacheOption): Unit = js.native
  def clearCache(options: ClearCacheOption, callback: js.Function0[Unit]): Unit = js.native
  def clearCache(
    options: ClearCacheOption,
    callback: js.Function0[Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def clearCache(options: ClearCacheOption, callback: Unit, errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  
  /**
    * Clears all cached data when OpenFin Runtime exits.
    */
  def deleteCacheOnExit(): Unit = js.native
  def deleteCacheOnExit(callback: js.Function0[Unit]): Unit = js.native
  def deleteCacheOnExit(callback: js.Function0[Unit], errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  def deleteCacheOnExit(callback: Unit, errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  
  /**
    * Downloads the given application asset
    */
  def downloadAsset(assetObj: AppAssetInfo): Unit = js.native
  def downloadAsset(assetObj: AppAssetInfo, progressListener: js.Function1[/* progress */ DownloadedBytes, Unit]): Unit = js.native
  def downloadAsset(
    assetObj: AppAssetInfo,
    progressListener: js.Function1[/* progress */ DownloadedBytes, Unit],
    callback: js.Function1[/* successObj */ Path, Unit]
  ): Unit = js.native
  def downloadAsset(
    assetObj: AppAssetInfo,
    progressListener: js.Function1[/* progress */ DownloadedBytes, Unit],
    callback: js.Function1[/* successObj */ Path, Unit],
    errorCallback: js.Function2[/* reason */ String, /* errorObj */ NetworkErrorInfo, Unit]
  ): Unit = js.native
  def downloadAsset(
    assetObj: AppAssetInfo,
    progressListener: js.Function1[/* progress */ DownloadedBytes, Unit],
    callback: Unit,
    errorCallback: js.Function2[/* reason */ String, /* errorObj */ NetworkErrorInfo, Unit]
  ): Unit = js.native
  def downloadAsset(
    assetObj: AppAssetInfo,
    progressListener: Unit,
    callback: js.Function1[/* successObj */ Path, Unit]
  ): Unit = js.native
  def downloadAsset(
    assetObj: AppAssetInfo,
    progressListener: Unit,
    callback: js.Function1[/* successObj */ Path, Unit],
    errorCallback: js.Function2[/* reason */ String, /* errorObj */ NetworkErrorInfo, Unit]
  ): Unit = js.native
  def downloadAsset(
    assetObj: AppAssetInfo,
    progressListener: Unit,
    callback: Unit,
    errorCallback: js.Function2[/* reason */ String, /* errorObj */ NetworkErrorInfo, Unit]
  ): Unit = js.native
  
  /**
    * Download preload scripts from given URLs
    */
  def downloadPreloadScripts(scripts: js.Array[DownloadPreloadOption]): Unit = js.native
  def downloadPreloadScripts(
    scripts: js.Array[DownloadPreloadOption],
    callback: js.Function1[/* downloadInfo */ js.Array[DownloadPreloadInfo], Unit]
  ): Unit = js.native
  def downloadPreloadScripts(
    scripts: js.Array[DownloadPreloadOption],
    callback: js.Function1[/* downloadInfo */ js.Array[DownloadPreloadInfo], Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def downloadPreloadScripts(
    scripts: js.Array[DownloadPreloadOption],
    callback: Unit,
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  
  /**
    * Downloads the given OpenFin Runtime.
    */
  def downloadRuntime(options: RuntimeDownloadOptions): Unit = js.native
  def downloadRuntime(
    options: RuntimeDownloadOptions,
    onProgress: js.Function1[/* progress */ RuntimeDownloadProgress, Unit]
  ): Unit = js.native
  def downloadRuntime(
    options: RuntimeDownloadOptions,
    onProgress: js.Function1[/* progress */ RuntimeDownloadProgress, Unit],
    onComplete: js.Function0[Unit]
  ): Unit = js.native
  def downloadRuntime(
    options: RuntimeDownloadOptions,
    onProgress: js.Function1[/* progress */ RuntimeDownloadProgress, Unit],
    onComplete: js.Function0[Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def downloadRuntime(
    options: RuntimeDownloadOptions,
    onProgress: js.Function1[/* progress */ RuntimeDownloadProgress, Unit],
    onComplete: Unit,
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def downloadRuntime(options: RuntimeDownloadOptions, onProgress: Unit, onComplete: js.Function0[Unit]): Unit = js.native
  def downloadRuntime(
    options: RuntimeDownloadOptions,
    onProgress: Unit,
    onComplete: js.Function0[Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def downloadRuntime(
    options: RuntimeDownloadOptions,
    onProgress: Unit,
    onComplete: Unit,
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  
  /**
    * Exits the Runtime.
    */
  def exit(): Unit = js.native
  def exit(callback: js.Function0[Unit]): Unit = js.native
  def exit(callback: js.Function0[Unit], errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  def exit(callback: Unit, errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  
  /**
    * Writes any unwritten cookies data to disk.
    */
  def flushCookieStore(): Unit = js.native
  def flushCookieStore(callback: js.Function0[Unit]): Unit = js.native
  def flushCookieStore(callback: js.Function0[Unit], errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  def flushCookieStore(callback: Unit, errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  
  /**
    * Retrieves an array of data for all applications.
    */
  def getAllApplications(): Unit = js.native
  def getAllApplications(callback: js.Function1[/* applicationInfoList */ js.Array[ApplicationInfo], Unit]): Unit = js.native
  def getAllApplications(
    callback: js.Function1[/* applicationInfoList */ js.Array[ApplicationInfo], Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def getAllApplications(callback: Unit, errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  
  /**
    * Retrieves an array of data for all external applications.
    */
  def getAllExternalApplications(): Unit = js.native
  def getAllExternalApplications(callback: js.Function1[/* applicationInfoList */ js.Array[ApplicationInfo], Unit]): Unit = js.native
  def getAllExternalApplications(
    callback: js.Function1[/* applicationInfoList */ js.Array[ApplicationInfo], Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def getAllExternalApplications(callback: Unit, errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  
  /**
    * Retrieves an array of data (name, ids, bounds) for all application windows.
    */
  def getAllWindows(): Unit = js.native
  def getAllWindows(callback: js.Function1[/* windowInfoList */ js.Array[SystemWindowInfo], Unit]): Unit = js.native
  def getAllWindows(
    callback: js.Function1[/* windowInfoList */ js.Array[SystemWindowInfo], Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def getAllWindows(callback: Unit, errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  
  /**
    * Returns information about the app asset.
    */
  def getAppAssetInfo(options: AppAssetRequest): Unit = js.native
  def getAppAssetInfo(options: AppAssetRequest, callback: js.Function1[/* appAssetInfo */ AppAssetInfo, Unit]): Unit = js.native
  def getAppAssetInfo(
    options: AppAssetRequest,
    callback: js.Function1[/* appAssetInfo */ AppAssetInfo, Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def getAppAssetInfo(options: AppAssetRequest, callback: Unit, errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  
  /**
    * Retrieves the command line argument string that started OpenFin Runtime.
    */
  def getCommandLineArguments(): Unit = js.native
  def getCommandLineArguments(callback: js.Function1[/* args */ String, Unit]): Unit = js.native
  def getCommandLineArguments(
    callback: js.Function1[/* args */ String, Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def getCommandLineArguments(callback: Unit, errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  
  /**
    * Get additional info of cookies.
    */
  def getCookies(option: CookieOption): Unit = js.native
  def getCookies(option: CookieOption, callback: js.Function1[/* info */ js.Array[CookieInfo], Unit]): Unit = js.native
  def getCookies(
    option: CookieOption,
    callback: js.Function1[/* info */ js.Array[CookieInfo], Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def getCookies(option: CookieOption, callback: Unit, errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  
  /**
    * Get the current state of the crash reporter.
    */
  def getCrashReporterState(): Unit = js.native
  def getCrashReporterState(callback: js.Function1[/* state */ CrashReporterOption, Unit]): Unit = js.native
  def getCrashReporterState(
    callback: js.Function1[/* state */ CrashReporterOption, Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def getCrashReporterState(callback: Unit, errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  
  /**
    * Retrieves the configuration object that started the OpenFin Runtime.
    */
  def getDeviceId(): Unit = js.native
  def getDeviceId(callback: js.Function1[/* uuid */ String, Unit]): Unit = js.native
  def getDeviceId(
    callback: js.Function1[/* uuid */ String, Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def getDeviceId(callback: Unit, errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  
  /**
    * Returns a hex encoded hash of the mac address and the currently logged in user name
    */
  def getDeviceUserId(): Unit = js.native
  def getDeviceUserId(callback: js.Function1[/* id */ String, Unit]): Unit = js.native
  def getDeviceUserId(
    callback: js.Function1[/* id */ String, Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def getDeviceUserId(callback: Unit, errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  
  /**
    * Returns an Entity info object relating to the entity specified by the uuid and name passed in. The possible types are 'window', 'iframe', 'external connection' or 'unknown'.
    */
  def getEntityInfo(uuid: String, name: String): Unit = js.native
  def getEntityInfo(uuid: String, name: String, callback: js.Function1[/* info */ EntityInfo, Unit]): Unit = js.native
  def getEntityInfo(
    uuid: String,
    name: String,
    callback: js.Function1[/* info */ EntityInfo, Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def getEntityInfo(uuid: String, name: String, callback: Unit, errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  
  /**
    * Gets the value of a given environment variable on the computer on which the runtime is installed.
    */
  def getEnvironmentVariable(envVar: String): Unit = js.native
  def getEnvironmentVariable(envVar: String, callback: js.Function1[/* variable */ String, Unit]): Unit = js.native
  def getEnvironmentVariable(
    envVar: String,
    callback: js.Function1[/* variable */ String, Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def getEnvironmentVariable(envVar: String, callback: Unit, errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  
  /**
    * Retrieves currently focused window identity.
    */
  def getFocusedWindow(): Unit = js.native
  def getFocusedWindow(callback: js.Function1[/* focusedWindowIdentity */ Identity, Unit]): Unit = js.native
  def getFocusedWindow(
    callback: js.Function1[/* focusedWindowIdentity */ Identity, Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def getFocusedWindow(callback: Unit, errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  
  /**
    * Retrieves system information.
    */
  def getHostSpecs(): Unit = js.native
  def getHostSpecs(callback: js.Function1[/* info */ HostSpecs, Unit]): Unit = js.native
  def getHostSpecs(
    callback: js.Function1[/* info */ HostSpecs, Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def getHostSpecs(callback: Unit, errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  
  /**
    *
    * Returns an array of version numbers of the runtimes installed. Requires RVM 5.2+
    */
  def getInstalledRuntimes(): js.Promise[js.Array[String]] = js.native
  
  /**
    * Retrieves the contents of the log with the specified filename.
    */
  def getLog(logFileName: String): Unit = js.native
  def getLog(logFileName: String, callback: js.Function1[/* variable */ String, Unit]): Unit = js.native
  def getLog(
    logFileName: String,
    callback: js.Function1[/* variable */ String, Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def getLog(logFileName: String, callback: Unit, errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  
  /**
    * Retrieves an array containing information for each log file.
    */
  def getLogList(): Unit = js.native
  def getLogList(callback: js.Function1[/* logInfoList */ js.Array[LogInfo], Unit]): Unit = js.native
  def getLogList(
    callback: js.Function1[/* logInfoList */ js.Array[LogInfo], Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def getLogList(callback: Unit, errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  
  /**
    * Returns a unique identifier (UUID) provided by the machine.
    */
  def getMachineId(): Unit = js.native
  def getMachineId(callback: js.Function1[/* uuid */ String, Unit]): Unit = js.native
  def getMachineId(
    callback: js.Function1[/* uuid */ String, Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def getMachineId(callback: Unit, errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  
  /**
    * Retrieves the minimum (inclusive) logging level that is currently being written to the logs.
    */
  def getMinLogLevel(): Unit = js.native
  def getMinLogLevel(callback: js.Function1[/* logLevel */ String, Unit]): Unit = js.native
  def getMinLogLevel(
    callback: js.Function1[/* logLevel */ String, Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def getMinLogLevel(callback: Unit, errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  
  /**
    * Retrieves an object that contains data about the about the monitor setup of the computer that the runtime is running on.
    */
  def getMonitorInfo(): Unit = js.native
  def getMonitorInfo(callback: js.Function1[/* monitorInfo */ MonitorInfo, Unit]): Unit = js.native
  def getMonitorInfo(
    callback: js.Function1[/* monitorInfo */ MonitorInfo, Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def getMonitorInfo(callback: Unit, errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  
  /**
    * Returns the mouse in virtual screen coordinates (left, top).
    */
  def getMousePosition(): Unit = js.native
  def getMousePosition(callback: js.Function1[/* mousePosition */ PointTopLeft, Unit]): Unit = js.native
  def getMousePosition(
    callback: js.Function1[/* mousePosition */ PointTopLeft, Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def getMousePosition(callback: Unit, errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  
  /**
    * Retrieves an array of all of the runtime processes that are currently running.
    * Each element in the array is an object containing the uuid and the name of the application to which the process belongs.
    */
  def getProcessList(): Unit = js.native
  def getProcessList(callback: js.Function1[/* processInfoList */ js.Array[ProcessInfo], Unit]): Unit = js.native
  def getProcessList(
    callback: js.Function1[/* processInfoList */ js.Array[ProcessInfo], Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def getProcessList(callback: Unit, errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  
  /**
    * Retrieves the Proxy settings.
    */
  def getProxySettings(): Unit = js.native
  def getProxySettings(callback: js.Function1[/* proxy */ ProxyInfo, Unit]): Unit = js.native
  def getProxySettings(
    callback: js.Function1[/* proxy */ ProxyInfo, Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def getProxySettings(callback: Unit, errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  
  /**
    * Returns information about the running Runtime in an object.
    */
  def getRuntimeInfo(): Unit = js.native
  def getRuntimeInfo(callback: js.Function1[/* rvmInfo */ RuntimeInfo, Unit]): Unit = js.native
  def getRuntimeInfo(
    callback: js.Function1[/* rvmInfo */ RuntimeInfo, Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def getRuntimeInfo(callback: Unit, errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  
  /**
    * Returns information about the running RVM in an object.
    */
  def getRvmInfo(): Unit = js.native
  def getRvmInfo(callback: js.Function1[/* rvmInfo */ RVMInfo, Unit]): Unit = js.native
  def getRvmInfo(
    callback: js.Function1[/* rvmInfo */ RVMInfo, Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def getRvmInfo(callback: Unit, errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  
  /**
    * Returns the version of the runtime. The version contains the major, minor, build and revision numbers.
    */
  def getVersion(): Unit = js.native
  def getVersion(callback: js.Function1[/* version */ String, Unit]): Unit = js.native
  def getVersion(
    callback: js.Function1[/* version */ String, Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def getVersion(callback: Unit, errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  
  /**
    * Runs an executable or batch file.
    */
  def launchExternalProcess(options: ExternalProcessRequestType): Unit = js.native
  def launchExternalProcess(options: ExternalProcessRequestType, callback: js.Function1[/* payload */ UuidString, Unit]): Unit = js.native
  def launchExternalProcess(
    options: ExternalProcessRequestType,
    callback: js.Function1[/* payload */ UuidString, Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def launchExternalProcess(
    options: ExternalProcessRequestType,
    callback: Unit,
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  
  /**
    * Writes the passed message into both the log file and the console.
    */
  def log(level: debug | info | warn | error, message: String): Unit = js.native
  def log(level: debug | info | warn | error, message: String, callback: js.Function0[Unit]): Unit = js.native
  def log(
    level: debug | info | warn | error,
    message: String,
    callback: js.Function0[Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def log(
    level: debug | info | warn | error,
    message: String,
    callback: Unit,
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  
  /**
    * Monitors a running process.
    */
  def monitorExternalProcess(options: ExternalProcessInfo): Unit = js.native
  def monitorExternalProcess(options: ExternalProcessInfo, callback: js.Function1[/* payload */ UuidString, Unit]): Unit = js.native
  def monitorExternalProcess(
    options: ExternalProcessInfo,
    callback: js.Function1[/* payload */ UuidString, Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def monitorExternalProcess(
    options: ExternalProcessInfo,
    callback: Unit,
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  
  /**
    * Opens the passed URL in the default web browser.
    */
  def openUrlWithBrowser(url: String): Unit = js.native
  def openUrlWithBrowser(url: String, callback: js.Function0[Unit]): Unit = js.native
  def openUrlWithBrowser(url: String, callback: js.Function0[Unit], errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  def openUrlWithBrowser(url: String, callback: Unit, errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  
  /**
    * Opens the passed URL in the default web browser.
    */
  def readRegistryValue(rootKey: String, subkey: String, value: String): Unit = js.native
  def readRegistryValue(
    rootKey: String,
    subkey: String,
    value: String,
    callback: js.Function1[/* info */ RegistryInfo, Unit]
  ): Unit = js.native
  def readRegistryValue(
    rootKey: String,
    subkey: String,
    value: String,
    callback: js.Function1[/* info */ RegistryInfo, Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def readRegistryValue(
    rootKey: String,
    subkey: String,
    value: String,
    callback: Unit,
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  
  /**
    * This function call will register a unique id and produce a token. The token can be used to broker an external connection.
    */
  def registerExternalConnection(uuid: String): Unit = js.native
  def registerExternalConnection(uuid: String, callback: js.Function1[/* detail */ Token, Unit]): Unit = js.native
  def registerExternalConnection(
    uuid: String,
    callback: js.Function1[/* detail */ Token, Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def registerExternalConnection(uuid: String, callback: Unit, errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  
  /**
    * Removes the process entry for the passed UUID obtained from a prior call of fin.desktop.System.launchExternalProcess().
    */
  def releaseExternalProcess(processUuid: String): Unit = js.native
  def releaseExternalProcess(processUuid: String, callback: js.Function0[Unit]): Unit = js.native
  def releaseExternalProcess(
    processUuid: String,
    callback: js.Function0[Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def releaseExternalProcess(processUuid: String, callback: Unit, errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  
  /**
    * Removes a previously registered event listener from the specified event.
    */
  def removeEventListener(
    `type`: OpenFinSystemEventType,
    listener: js.Function1[
      /* event */ SystemBaseEvent | DesktopIconClickedEvent | IdleStateChangedEvent | MonitorInfoChangedEvent | SessionChangedEvent, 
      Unit
    ]
  ): Unit = js.native
  def removeEventListener(
    `type`: OpenFinSystemEventType,
    listener: js.Function1[
      /* event */ SystemBaseEvent | DesktopIconClickedEvent | IdleStateChangedEvent | MonitorInfoChangedEvent | SessionChangedEvent, 
      Unit
    ],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def removeEventListener(
    `type`: OpenFinSystemEventType,
    listener: js.Function1[
      /* event */ SystemBaseEvent | DesktopIconClickedEvent | IdleStateChangedEvent | MonitorInfoChangedEvent | SessionChangedEvent, 
      Unit
    ],
    callback: js.Function0[Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def removeEventListener(
    `type`: OpenFinSystemEventType,
    listener: js.Function1[
      /* event */ SystemBaseEvent | DesktopIconClickedEvent | IdleStateChangedEvent | MonitorInfoChangedEvent | SessionChangedEvent, 
      Unit
    ],
    callback: Unit,
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  
  /**
    * Set the minimum log level above which logs will be written to the OpenFin log
    */
  def setMinLogLevel(logLevel: String): Unit = js.native
  def setMinLogLevel(logLevel: String, callback: js.Function0[Unit]): Unit = js.native
  def setMinLogLevel(
    logLevel: String,
    callback: js.Function0[Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def setMinLogLevel(logLevel: String, callback: Unit, errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  
  /**
    * Shows the Chrome Developer Tools for the specified window.
    */
  def showDeveloperTools(uuid: String, name: String): Unit = js.native
  def showDeveloperTools(uuid: String, name: String, callback: js.Function0[Unit]): Unit = js.native
  def showDeveloperTools(
    uuid: String,
    name: String,
    callback: js.Function0[Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def showDeveloperTools(uuid: String, name: String, callback: Unit, errorCallback: js.Function1[/* reason */ String, Unit]): Unit = js.native
  
  /**
    * Start the crash reporter for the browser process if not already running.
    * You can optionally specify `diagnosticMode` to have the logs sent to
    * OpenFin on runtime close
    */
  def startCrashReporter(options: CrashReporterOption): Unit = js.native
  def startCrashReporter(options: CrashReporterOption, callback: js.Function0[Unit]): Unit = js.native
  def startCrashReporter(
    options: CrashReporterOption,
    callback: js.Function0[Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def startCrashReporter(
    options: CrashReporterOption,
    callback: Unit,
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  
  /**
    * Attempt to close an external process. The process will be terminated if it has not closed after the elapsed timeout in milliseconds.
    */
  def terminateExternalProcess(processUuid: String, timeout: Double, killTree: Boolean): Unit = js.native
  def terminateExternalProcess(
    processUuid: String,
    timeout: Double,
    killTree: Boolean,
    callback: js.Function1[/* info */ Result, Unit]
  ): Unit = js.native
  def terminateExternalProcess(
    processUuid: String,
    timeout: Double,
    killTree: Boolean,
    callback: js.Function1[/* info */ Result, Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def terminateExternalProcess(
    processUuid: String,
    timeout: Double,
    killTree: Boolean,
    callback: Unit,
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  
  /**
    * Update the OpenFin Runtime Proxy settings.
    */
  def updateProxySettings(`type`: String, address: String, port: Double): Unit = js.native
  def updateProxySettings(`type`: String, address: String, port: Double, callback: js.Function0[Unit]): Unit = js.native
  def updateProxySettings(
    `type`: String,
    address: String,
    port: Double,
    callback: js.Function0[Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def updateProxySettings(
    `type`: String,
    address: String,
    port: Double,
    callback: Unit,
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
}
