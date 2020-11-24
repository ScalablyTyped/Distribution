package typings.ngFileUpload.mod.angularAugmentingMod.angularFileUpload

import typings.angular.mod.IPromise
import typings.angular.mod.IRequestConfig
import typings.std.Blob
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUploadService extends js.Object {
  
  def base64DataUrl(files: js.Array[File]): IPromise[js.Array[String] | String] = js.native
  /**
    * Convert a single file or array of files to a single or array of
    * base64 data url representation of the file(s).
    * Could be used to send file in base64 format inside json to the databases
    *
    * @param  {Array<File>}
    * @return {angular.IPromise}
    */
  def base64DataUrl(files: File): IPromise[js.Array[String] | String] = js.native
  
  /**
    * Convert the file to blob url object or base64 data url based on boolean disallowObjectUrl value
    *
    * @param {File} file
    * @param  {boolean} [disallowObjectUrl]
    * @return {angular.IPromise<string>}
    */
  def dataUrl(file: File): IPromise[Blob | String] = js.native
  def dataUrl(file: File, disallowObjectUrl: Boolean): IPromise[Blob | String] = js.native
  
  /**
    * Alternative way of uploading, send the file binary with the file's content-type.
    * Could be used to upload files to CouchDB, imgur, etc... html5 FileReader is needed.
    * This is equivalent to angular $http() but allow you to listen to the progress event for HTML5 browsers.
    *
    * @param {IRequestConfig} config
    * @return {angular.IPromise<ImageDimensions>}
    */
  def http[T](config: IRequestConfig): IUploadPromise[T] = js.native
  
  /**
    * Get image file dimensions
    *
    * @param  {File} file
    * @return {angular.IPromise<ImageDimensions>}
    */
  def imageDimensions(file: File): IPromise[ImageDimensions] = js.native
  
  /**
    * Returns boolean showing if image resize is supported by this browser
    *
    * @return {boolean}
    */
  def isResizeSupported(): Boolean = js.native
  
  /**
    * Returns boolean showing if resumable upload is supported by this browser
    *
    * @return {boolean}
    */
  def isResumeSupported(): Boolean = js.native
  
  /**
    * Returns true if there is an upload in progress. Can be used to prompt user before closing browser tab
    *
    * @return {boolean}
    */
  def isUploadInProgress(): Boolean = js.native
  
  /**
    * Converts the value to json to send data as json string. Same as angular.toJson(obj)
    *
    * @param  {Object} obj
    * @return {string}
    */
  def json(obj: js.Object): String = js.native
  
  /**
    * Converts the object to a Blob object with application/json content type
    * for jsob byte streaming support
    *
    * @param  {Object} obj
    * @return {Blob}
    */
  def jsonBlob(obj: js.Object): Blob = js.native
  
  /**
    * Returns a file which will be uploaded with the newName instead of original file name
    *
    * @param  {File} file
    * @param  {string} newName
    * @return {File}
    */
  def rename(file: File, newName: String): Blob = js.native
  
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
  def resize(file: File, options: FileResizeOptions): IPromise[File] = js.native
  
  /**
    * Set the default values for ngf-select and ngf-drop directives
    *
    * @param {FileUploadOptions} defaultFileUploadOptions
    */
  def setDefaults(defaultFileUploadOptions: FileUploadOptions): Unit = js.native
  
  /**
    * Upload a file. Returns a Promise,
    *
    * @param {IFileUploadConfigFile} config
    * @return {IUploadPromise<T>}
    */
  def upload[T](config: IFileUploadConfigFile): IUploadPromise[T] = js.native
}
