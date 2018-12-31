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

