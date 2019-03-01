package typings
package newmanLib.newmanMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var bail: js.UndefOr[
    scala.Boolean | js.Array[newmanLib.newmanLibStrings.folder] | js.Array[newmanLib.newmanLibStrings.failure]
  ] = js.undefined
  /** A JSON / Collection / String representing the collection. */
  var collection: postmanDashCollectionLib.postmanDashCollectionMod.Collection | postmanDashCollectionLib.postmanDashCollectionMod.CollectionDefinition | java.lang.String
  /**
    * Forces colored CLI output (for use in CI / non TTY environments).
    */
  var color: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specify the time (in milliseconds) to wait for between subsequent
    * requests.
    *
    * Default value: 0
    */
  var delayRequest: js.UndefOr[scala.Double] = js.undefined
  /** An environment JSON / file path for the current collection run. */
  var environment: js.UndefOr[
    postmanDashCollectionLib.postmanDashCollectionMod.VariableScope | postmanDashCollectionLib.postmanDashCollectionMod.VariableScopeDefinition | java.lang.String
  ] = js.undefined
  /**
    * The name or ID of the folder (ItemGroup) in the collection which would
    * be run instead of the entire collection.
    */
  var folder: js.UndefOr[java.lang.String] = js.undefined
  /** A globals JSON / file path for the current collection run. */
  var globals: js.UndefOr[
    postmanDashCollectionLib.postmanDashCollectionMod.VariableScope | postmanDashCollectionLib.postmanDashCollectionMod.VariableScopeDefinition | java.lang.String
  ] = js.undefined
  /**
    * This specifies whether newman would automatically follow 3xx responses
    * from servers.
    *
    * Default value: false
    */
  var ignoreRedirects: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Disables SSL verification checks and allows self-signed SSL certificates.
    *
    * Default value: false
    */
  var insecure: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specify the number of iterations to run on the collection. This is
    * usually accompanied by providing a data file reference as
    * iterationData
    */
  var iterationCount: js.UndefOr[scala.Double] = js.undefined
  /**
    * Path to the JSON or CSV file or URL to be used as data source when
    * running multiple iterations on a collection.
    */
  var iterationData: js.UndefOr[js.Any] = js.undefined
  /**
    * Newman attempts to automatically turn off color output to terminals when
    * it detects the lack of color support. With this property, one can
    * forcibly turn off the usage of color in terminal output for reporters
    * and other parts of Newman that output to console.
    */
  var noColor: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specify options for the reporter(s) declared in options.reporters.
    */
  var reporter: js.UndefOr[js.Any] = js.undefined
  /** Available reporters: cli, json, html and junit. */
  var reporters: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
    * The path to the public client certificate file.
    */
  var sslClientCert: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The path to the private client key file.
    */
  var sslClientKey: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The secret client key passphrase.
    */
  var sslClientPassphrase: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If present, allows overriding the default exit code from the current
    * collection run, useful for bypassing collection result failures.
    *
    * Default value: false
    */
  var suppressExitCode: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specify the time (in milliseconds) to wait for the entire collection run
    * to complete execution.
    *
    * Default value: Infinity
    */
  var timeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * Specify the time (in milliseconds) to wait for requests to return a
    * response.
    *
    * Default value: Infinity
    */
  var timeoutRequest: js.UndefOr[scala.Double] = js.undefined
  /**
    * Specify the time (in milliseconds) to wait for scripts to return a
    * response.
    *
    * Default value: Infinity
    */
  var timeoutScript: js.UndefOr[scala.Double] = js.undefined
}

object NewmanRunOptions {
  @scala.inline
  def apply(
    collection: postmanDashCollectionLib.postmanDashCollectionMod.Collection | postmanDashCollectionLib.postmanDashCollectionMod.CollectionDefinition | java.lang.String,
    bail: scala.Boolean | js.Array[newmanLib.newmanLibStrings.folder] | js.Array[newmanLib.newmanLibStrings.failure] = null,
    color: js.UndefOr[scala.Boolean] = js.undefined,
    delayRequest: scala.Int | scala.Double = null,
    environment: postmanDashCollectionLib.postmanDashCollectionMod.VariableScope | postmanDashCollectionLib.postmanDashCollectionMod.VariableScopeDefinition | java.lang.String = null,
    folder: java.lang.String = null,
    globals: postmanDashCollectionLib.postmanDashCollectionMod.VariableScope | postmanDashCollectionLib.postmanDashCollectionMod.VariableScopeDefinition | java.lang.String = null,
    ignoreRedirects: js.UndefOr[scala.Boolean] = js.undefined,
    insecure: js.UndefOr[scala.Boolean] = js.undefined,
    iterationCount: scala.Int | scala.Double = null,
    iterationData: js.Any = null,
    noColor: js.UndefOr[scala.Boolean] = js.undefined,
    reporter: js.Any = null,
    reporters: java.lang.String | js.Array[java.lang.String] = null,
    sslClientCert: java.lang.String = null,
    sslClientKey: java.lang.String = null,
    sslClientPassphrase: java.lang.String = null,
    suppressExitCode: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Int | scala.Double = null,
    timeoutRequest: scala.Int | scala.Double = null,
    timeoutScript: scala.Int | scala.Double = null
  ): NewmanRunOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("collection")(collection.asInstanceOf[js.Any])
    if (bail != null) __obj.updateDynamic("bail")(bail.asInstanceOf[js.Any])
    if (!js.isUndefined(color)) __obj.updateDynamic("color")(color)
    if (delayRequest != null) __obj.updateDynamic("delayRequest")(delayRequest.asInstanceOf[js.Any])
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    if (folder != null) __obj.updateDynamic("folder")(folder)
    if (globals != null) __obj.updateDynamic("globals")(globals.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreRedirects)) __obj.updateDynamic("ignoreRedirects")(ignoreRedirects)
    if (!js.isUndefined(insecure)) __obj.updateDynamic("insecure")(insecure)
    if (iterationCount != null) __obj.updateDynamic("iterationCount")(iterationCount.asInstanceOf[js.Any])
    if (iterationData != null) __obj.updateDynamic("iterationData")(iterationData)
    if (!js.isUndefined(noColor)) __obj.updateDynamic("noColor")(noColor)
    if (reporter != null) __obj.updateDynamic("reporter")(reporter)
    if (reporters != null) __obj.updateDynamic("reporters")(reporters.asInstanceOf[js.Any])
    if (sslClientCert != null) __obj.updateDynamic("sslClientCert")(sslClientCert)
    if (sslClientKey != null) __obj.updateDynamic("sslClientKey")(sslClientKey)
    if (sslClientPassphrase != null) __obj.updateDynamic("sslClientPassphrase")(sslClientPassphrase)
    if (!js.isUndefined(suppressExitCode)) __obj.updateDynamic("suppressExitCode")(suppressExitCode)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (timeoutRequest != null) __obj.updateDynamic("timeoutRequest")(timeoutRequest.asInstanceOf[js.Any])
    if (timeoutScript != null) __obj.updateDynamic("timeoutScript")(timeoutScript.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewmanRunOptions]
  }
}

