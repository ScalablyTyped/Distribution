package typings
package ngDashFileDashUploadLib.ngDashFileDashUploadMod.angularMod.angularFileUploadNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileUploadConfigFile
  extends angularLib.angularMod.angularNs.IRequestConfig {
  /**
    * This is to accommodate server implementations expecting array data object keys in '[i]' or '[]' or
    * ''(multiple entries with same key) format.
    * Example: data: {rec: [file[0], file[1], ...]} sent as: rec[0] -> file[0], rec[1] -> file[1],...
    * data: {rec: {rec: [f[0], f[1], ...], arrayKey: '[]'} sent as: rec[] -> f[0], rec[] -> f[1],...
    * @type {string}
    */
  var arrayKey: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Default false, experimental as hotfix for potential library conflicts with other plugins
    * @type {boolean}
    */
  var disableProgress: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * This is to accommodate server implementations expecting nested data object keys in .key or [key] format.
    * Example: data: {rec: {name: 'N', pic: file}} sent as: rec[name] -> N, rec[pic] -> file
    * data: {rec: {name: 'N', pic: file}, objectKey: '.k'} sent as: rec.name -> N, rec.pic -> file
    * @type {string}
    */
  var objectKey: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Upload in chunks of specified size
    * @type {(number|string)}
    */
  var resumeChunkSize: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * Function that returns a prommise which will be resolved to the upload file size on the server.
    * @type {[type]}
    */
  var resumeSize: js.UndefOr[angularLib.angularMod.Global.Function] = js.undefined
  /**
    * Reads the uploaded file size from resumeSizeUrl GET response
    * @type {Function}
    */
  var resumeSizeResponseReader: js.UndefOr[angularLib.angularMod.Global.Function] = js.undefined
  /**
    * Uploaded file size so far on the server
    * @type {string}
    */
  var resumeSizeUrl: js.UndefOr[java.lang.String] = js.undefined
}

