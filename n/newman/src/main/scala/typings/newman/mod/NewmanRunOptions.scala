package typings.newman.mod

import typings.newman.anon.Http
import typings.newman.newmanStrings.auto
import typings.newman.newmanStrings.failure
import typings.newman.newmanStrings.folder
import typings.newman.newmanStrings.off
import typings.newman.newmanStrings.on
import typings.postmanCollection.mod.Collection
import typings.postmanCollection.mod.CollectionDefinition
import typings.postmanCollection.mod.VariableScope
import typings.postmanCollection.mod.VariableScopeDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewmanRunOptions extends js.Object {
  
  /**
    * Specify whether or not to stop a collection run on encountering the
    * first test script error.
    *
    * "folder" allows you to skip the entire collection run in case an invalid
    * folder was specified using the `folder` option or an error was
    * encountered in general.
    *
    * "failure" would gracefully stop a collection run after completing the
    * current test script.
    *
    * Default value: false
    */
  var bail: js.UndefOr[Boolean | (js.Array[folder | failure])] = js.native
  
  /** A JSON / Collection / String representing the collection. */
  var collection: Collection | CollectionDefinition | String = js.native
  
  /**
    * Enable or Disable colored CLI output.
    *
    * Default value: auto
    */
  var color: js.UndefOr[on | off | auto] = js.native
  
  /**
    * Specify the time (in milliseconds) to wait for between subsequent
    * requests.
    *
    * Default value: 0
    */
  var delayRequest: js.UndefOr[Double] = js.native
  
  /** An environment JSON / file path for the current collection run. */
  var environment: js.UndefOr[VariableScope | VariableScopeDefinition | String] = js.native
  
  /** The relative path to export the collection from the current run to */
  var exportCollection: js.UndefOr[String] = js.native
  
  /** The relative path to export the environment file from the current run to */
  var exportEnvironment: js.UndefOr[String] = js.native
  
  /** The relative path to export the globals file from the current run to  */
  var exportGlobals: js.UndefOr[String] = js.native
  
  /**
    * The name or ID of the folder (ItemGroup) in the collection which would
    * be run instead of the entire collection.
    */
  var folder: js.UndefOr[String | js.Array[String]] = js.native
  
  /** A globals JSON / file path for the current collection run. */
  var globals: js.UndefOr[VariableScope | VariableScopeDefinition | String] = js.native
  
  /**
    * This specifies whether newman would automatically follow 3xx responses
    * from servers.
    *
    * Default value: false
    */
  var ignoreRedirects: js.UndefOr[Boolean] = js.native
  
  /**
    * Disables SSL verification checks and allows self-signed SSL certificates.
    *
    * Default value: false
    */
  var insecure: js.UndefOr[Boolean] = js.native
  
  /**
    * Allow reading files outside of working directory.
    */
  var insecureFileRead: js.UndefOr[Boolean] = js.native
  
  /**
    * Specify the number of iterations to run on the collection. This is
    * usually accompanied by providing a data file reference as
    * iterationData
    */
  var iterationCount: js.UndefOr[Double] = js.native
  
  /**
    * Path to the JSON or CSV file or URL to be used as data source when
    * running multiple iterations on a collection.
    */
  var iterationData: js.UndefOr[js.Any] = js.native
  
  /**
    * Specify options for the reporter(s) declared in options.reporters.
    */
  var reporter: js.UndefOr[js.Any] = js.native
  
  /** Available reporters: cli, json, html and junit. */
  var reporters: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * Custom HTTP(S) agents which will be used for making the requests. This allows for use of various proxies (e.g. socks)
    */
  var requestAgents: js.UndefOr[Http] = js.native
  
  /**
    * The path to the public client certificate file.
    */
  var sslClientCert: js.UndefOr[String] = js.native
  
  /**
    * The path to the private client key file.
    */
  var sslClientKey: js.UndefOr[String] = js.native
  
  /**
    * The secret client key passphrase.
    */
  var sslClientPassphrase: js.UndefOr[String] = js.native
  
  /**
    * If present, allows overriding the default exit code from the current
    * collection run, useful for bypassing collection result failures.
    *
    * Default value: false
    */
  var suppressExitCode: js.UndefOr[Boolean] = js.native
  
  /**
    * Specify the time (in milliseconds) to wait for the entire collection run
    * to complete execution.
    *
    * Default value: Infinity
    */
  var timeout: js.UndefOr[Double] = js.native
  
  /**
    * Specify the time (in milliseconds) to wait for requests to return a
    * response.
    *
    * Default value: Infinity
    */
  var timeoutRequest: js.UndefOr[Double] = js.native
  
  /**
    * Specify the time (in milliseconds) to wait for scripts to return a
    * response.
    *
    * Default value: Infinity
    */
  var timeoutScript: js.UndefOr[Double] = js.native
  
  /**
    * The path of the directory to be used as working directory.
    */
  var workingDir: js.UndefOr[String] = js.native
}
object NewmanRunOptions {
  
  @scala.inline
  def apply(collection: Collection | CollectionDefinition | String): NewmanRunOptions = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewmanRunOptions]
  }
  
  @scala.inline
  implicit class NewmanRunOptionsOps[Self <: NewmanRunOptions] (val x: Self) extends AnyVal {
    
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
    def setCollection(value: Collection | CollectionDefinition | String): Self = this.set("collection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBailVarargs(value: (folder | failure)*): Self = this.set("bail", js.Array(value :_*))
    
    @scala.inline
    def setBail(value: Boolean | (js.Array[folder | failure])): Self = this.set("bail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBail: Self = this.set("bail", js.undefined)
    
    @scala.inline
    def setColor(value: on | off | auto): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setDelayRequest(value: Double): Self = this.set("delayRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelayRequest: Self = this.set("delayRequest", js.undefined)
    
    @scala.inline
    def setEnvironment(value: VariableScope | VariableScopeDefinition | String): Self = this.set("environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironment: Self = this.set("environment", js.undefined)
    
    @scala.inline
    def setExportCollection(value: String): Self = this.set("exportCollection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportCollection: Self = this.set("exportCollection", js.undefined)
    
    @scala.inline
    def setExportEnvironment(value: String): Self = this.set("exportEnvironment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportEnvironment: Self = this.set("exportEnvironment", js.undefined)
    
    @scala.inline
    def setExportGlobals(value: String): Self = this.set("exportGlobals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportGlobals: Self = this.set("exportGlobals", js.undefined)
    
    @scala.inline
    def setFolderVarargs(value: String*): Self = this.set("folder", js.Array(value :_*))
    
    @scala.inline
    def setFolder(value: String | js.Array[String]): Self = this.set("folder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFolder: Self = this.set("folder", js.undefined)
    
    @scala.inline
    def setGlobals(value: VariableScope | VariableScopeDefinition | String): Self = this.set("globals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobals: Self = this.set("globals", js.undefined)
    
    @scala.inline
    def setIgnoreRedirects(value: Boolean): Self = this.set("ignoreRedirects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreRedirects: Self = this.set("ignoreRedirects", js.undefined)
    
    @scala.inline
    def setInsecure(value: Boolean): Self = this.set("insecure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsecure: Self = this.set("insecure", js.undefined)
    
    @scala.inline
    def setInsecureFileRead(value: Boolean): Self = this.set("insecureFileRead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsecureFileRead: Self = this.set("insecureFileRead", js.undefined)
    
    @scala.inline
    def setIterationCount(value: Double): Self = this.set("iterationCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIterationCount: Self = this.set("iterationCount", js.undefined)
    
    @scala.inline
    def setIterationData(value: js.Any): Self = this.set("iterationData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIterationData: Self = this.set("iterationData", js.undefined)
    
    @scala.inline
    def setReporter(value: js.Any): Self = this.set("reporter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReporter: Self = this.set("reporter", js.undefined)
    
    @scala.inline
    def setReportersVarargs(value: String*): Self = this.set("reporters", js.Array(value :_*))
    
    @scala.inline
    def setReporters(value: String | js.Array[String]): Self = this.set("reporters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReporters: Self = this.set("reporters", js.undefined)
    
    @scala.inline
    def setRequestAgents(value: Http): Self = this.set("requestAgents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestAgents: Self = this.set("requestAgents", js.undefined)
    
    @scala.inline
    def setSslClientCert(value: String): Self = this.set("sslClientCert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslClientCert: Self = this.set("sslClientCert", js.undefined)
    
    @scala.inline
    def setSslClientKey(value: String): Self = this.set("sslClientKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslClientKey: Self = this.set("sslClientKey", js.undefined)
    
    @scala.inline
    def setSslClientPassphrase(value: String): Self = this.set("sslClientPassphrase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslClientPassphrase: Self = this.set("sslClientPassphrase", js.undefined)
    
    @scala.inline
    def setSuppressExitCode(value: Boolean): Self = this.set("suppressExitCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressExitCode: Self = this.set("suppressExitCode", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setTimeoutRequest(value: Double): Self = this.set("timeoutRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeoutRequest: Self = this.set("timeoutRequest", js.undefined)
    
    @scala.inline
    def setTimeoutScript(value: Double): Self = this.set("timeoutScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeoutScript: Self = this.set("timeoutScript", js.undefined)
    
    @scala.inline
    def setWorkingDir(value: String): Self = this.set("workingDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkingDir: Self = this.set("workingDir", js.undefined)
  }
}
