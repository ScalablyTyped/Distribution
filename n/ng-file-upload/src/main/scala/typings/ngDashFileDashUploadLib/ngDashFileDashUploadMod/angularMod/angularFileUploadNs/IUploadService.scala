package typings
package ngDashFileDashUploadLib.ngDashFileDashUploadMod.angularMod.angularFileUploadNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUploadService extends js.Object {
  def base64DataUrl(files: js.Array[stdLib.File]): angularLib.angularMod.angularNs.IPromise[js.Array[java.lang.String] | java.lang.String] = js.native
  /**
    * Convert a single file or array of files to a single or array of
    * base64 data url representation of the file(s).
    * Could be used to send file in base64 format inside json to the databases
    *
    * @param  {Array<File>}
    * @return {angular.IPromise}
    */
  def base64DataUrl(files: stdLib.File): angularLib.angularMod.angularNs.IPromise[js.Array[java.lang.String] | java.lang.String] = js.native
  /**
    * Convert the file to blob url object or base64 data url based on boolean disallowObjectUrl value
    *
    * @param {File} file
    * @param  {boolean} [disallowObjectUrl]
    * @return {angular.IPromise<string>}
    */
  def dataUrl(file: stdLib.File): angularLib.angularMod.angularNs.IPromise[stdLib.Blob | java.lang.String] = js.native
  def dataUrl(file: stdLib.File, disallowObjectUrl: scala.Boolean): angularLib.angularMod.angularNs.IPromise[stdLib.Blob | java.lang.String] = js.native
  /**
    * Alternative way of uploading, send the file binary with the file's content-type.
    * Could be used to upload files to CouchDB, imgur, etc... html5 FileReader is needed.
    * This is equivalent to angular $http() but allow you to listen to the progress event for HTML5 browsers.
    *
    * @param {IRequestConfig} config
    * @return {angular.IPromise<ImageDimensions>}
    */
  def http[T](config: angularLib.angularMod.angularNs.IRequestConfig): IUploadPromise[T] = js.native
  /**
    * Get image file dimensions
    *
    * @param  {File} file
    * @return {angular.IPromise<ImageDimensions>}
    */
  def imageDimensions(file: stdLib.File): angularLib.angularMod.angularNs.IPromise[ImageDimensions] = js.native
  /**
    * Returns boolean showing if image resize is supported by this browser
    *
    * @return {boolean}
    */
  def isResizeSupported(): scala.Boolean = js.native
  /**
    * Returns boolean showing if resumable upload is supported by this browser
    *
    * @return {boolean}
    */
  def isResumeSupported(): scala.Boolean = js.native
  /**
    * Returns true if there is an upload in progress. Can be used to prompt user before closing browser tab
    *
    * @return {boolean}
    */
  def isUploadInProgress(): scala.Boolean = js.native
  /**
    * Converts the value to json to send data as json string. Same as angular.toJson(obj)
    *
    * @param  {Object} obj
    * @return {string}
    */
  def json(obj: js.Object): java.lang.String = js.native
  /**
    * Converts the object to a Blob object with application/json content type
    * for jsob byte streaming support
    *
    * @param  {Object} obj
    * @return {Blob}
    */
  def jsonBlob(obj: js.Object): stdLib.Blob = js.native
  /**
    * Returns a file which will be uploaded with the newName instead of original file name
    *
    * @param  {File} file
    * @param  {string} newName
    * @return {File}
    */
  def rename(file: stdLib.File, newName: java.lang.String): stdLib.Blob = js.native
  /**
    * Resizes an image. Returns a promise
    *
    * @param  {File} file
    * @param  {number} [width]
    * @param  {number} [height]
    * @param  {number} [quality]
    * @param  {string} [type]
    * @param  {number} [ratio]
    * @param  {boolean} [centerCrop]
    * @return {angular.IPromise<string>}
    */
  def resize(file: stdLib.File, options: FileResizeOptions): angularLib.angularMod.angularNs.IPromise[stdLib.File] = js.native
  /**
    * Set the default values for ngf-select and ngf-drop directives
    *
    * @param {FileUploadOptions} defaultFileUploadOptions
    */
  def setDefaults(defaultFileUploadOptions: FileUploadOptions): scala.Unit = js.native
  /**
    * Upload a file. Returns a Promise,
    *
    * @param {IFileUploadConfigFile} config
    * @return {IUploadPromise<T>}
    */
  def upload[T](config: IFileUploadConfigFile): IUploadPromise[T] = js.native
}

