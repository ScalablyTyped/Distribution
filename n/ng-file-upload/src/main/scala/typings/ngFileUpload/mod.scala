package typings.ngFileUpload

import org.scalablytyped.runtime.Shortcut
import typings.angular.mod.IHttpPromiseCallback
import typings.angular.mod.IHttpResponse
import typings.angular.mod.IPromise
import typings.angular.mod.IRequestConfig
import typings.angular.mod.global.Function
import typings.std.Blob
import typings.std.EventTarget
import typings.std.File
import typings.std.ProgressEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("ng-file-upload", JSImport.Namespace)
  @js.native
  val ^ : String = js.native
  
  type _To = String
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: String = ^
  
  /* augmented module */
  object angularAugmentingMod {
    
    object angularFileUpload {
      
      trait FileResizeOptions extends StObject {
        
        var centerCrop: js.UndefOr[Boolean] = js.undefined
        
        var height: js.UndefOr[Double] = js.undefined
        
        var pattern: js.UndefOr[String] = js.undefined
        
        var quality: js.UndefOr[Double] = js.undefined
        
        var ratio: js.UndefOr[Double | String] = js.undefined
        
        var resizeIf: js.UndefOr[ResizeIfFunction] = js.undefined
        
        var restoreExif: js.UndefOr[Boolean] = js.undefined
        
        var `type`: js.UndefOr[String] = js.undefined
        
        var width: js.UndefOr[Double] = js.undefined
      }
      object FileResizeOptions {
        
        inline def apply(): FileResizeOptions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[FileResizeOptions]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: FileResizeOptions] (val x: Self) extends AnyVal {
          
          inline def setCenterCrop(value: Boolean): Self = StObject.set(x, "centerCrop", value.asInstanceOf[js.Any])
          
          inline def setCenterCropUndefined: Self = StObject.set(x, "centerCrop", js.undefined)
          
          inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
          
          inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
          
          inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
          
          inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
          
          inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
          
          inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
          
          inline def setRatio(value: Double | String): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
          
          inline def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
          
          inline def setResizeIf(value: (/* width */ Double, /* height */ Double) => Boolean): Self = StObject.set(x, "resizeIf", js.Any.fromFunction2(value))
          
          inline def setResizeIfUndefined: Self = StObject.set(x, "resizeIf", js.undefined)
          
          inline def setRestoreExif(value: Boolean): Self = StObject.set(x, "restoreExif", value.asInstanceOf[js.Any])
          
          inline def setRestoreExifUndefined: Self = StObject.set(x, "restoreExif", js.undefined)
          
          inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
          
          inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
          
          inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
          
          inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
        }
      }
      
      trait FileUploadOptions extends StObject {
        
        /**
          * Standard HTML accept attr, browser specific select popup window
          * @type {string}
          */
        var ngfAccept: js.UndefOr[String] = js.undefined
        
        /**
          * Default true, allow dropping files only for Chrome webkit browser
          * @type {boolean}
          */
        var ngfAllowDir: js.UndefOr[Boolean] = js.undefined
        
        /**
          * Default false, enable firefox image paste by making element contenteditable
          * @type {boolean}
          */
        var ngfEnableFirefoxPaste: js.UndefOr[Boolean] = js.undefined
        
        /**
          * Default false, hides element if file drag&drop is not
          * @type {boolean}
          */
        var ngfHideOnDropNotAvailable: js.UndefOr[Boolean] = js.undefined
        
        /**
          * Validate error name: maxDuration
          * @type {(number|string)}
          */
        var ngfMaxDuration: js.UndefOr[Double | String] = js.undefined
        
        /**
          * Maximum number of files allowed to be selected or dropped, validate error name: maxFiles
          * @type {number}
          */
        var ngfMaxFiles: js.UndefOr[Double] = js.undefined
        
        /**
          * Validate error name: maxSize
          * @type {(number|string)}
          */
        var ngfMaxSize: js.UndefOr[Double | String] = js.undefined
        
        /**
          * Validate error name: maxTotalSize
          * @type {(number|string)}
          */
        var ngfMaxTotalSize: js.UndefOr[Double | String] = js.undefined
        
        /**
          * Validate error name: minDuration
          * @type {(number|string)}
          */
        var ngfMinDuration: js.UndefOr[Double | String] = js.undefined
        
        /**
          * Validate error name: minRatio
          * @type {(number|string)}
          */
        var ngfMinRatio: js.UndefOr[Double | String] = js.undefined
        
        /**
          * Validate error name: minSize
          * @type {(number|string)}
          */
        var ngfMinSize: js.UndefOr[Double | String] = js.undefined
        
        /**
          * Allows selecting multiple files
          * @type {boolean}
          */
        var ngfMultiple: js.UndefOr[Boolean] = js.undefined
        
        /**
          * List of comma separated valid aspect ratio of images in float or 2:3 format
          * @type {string}
          */
        var ngfRatio: js.UndefOr[String] = js.undefined
        
        /**
          * Default false, whether to propagate drag/drop events.
          * @type {boolean}
          */
        var ngfStopPropagation: js.UndefOr[Boolean] = js.undefined
        
        /**
          * Default false, if true file.$error will be set if the dimension or duration
          * values for validations cannot be calculated for example image load error or unsupported video by the browser.
          * By default it would assume the file is valid if the duration or dimension cannot be calculated by the browser.
          * @type {boolean}
          */
        var ngfValidateForce: js.UndefOr[Boolean] = js.undefined
      }
      object FileUploadOptions {
        
        inline def apply(): FileUploadOptions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[FileUploadOptions]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: FileUploadOptions] (val x: Self) extends AnyVal {
          
          inline def setNgfAccept(value: String): Self = StObject.set(x, "ngfAccept", value.asInstanceOf[js.Any])
          
          inline def setNgfAcceptUndefined: Self = StObject.set(x, "ngfAccept", js.undefined)
          
          inline def setNgfAllowDir(value: Boolean): Self = StObject.set(x, "ngfAllowDir", value.asInstanceOf[js.Any])
          
          inline def setNgfAllowDirUndefined: Self = StObject.set(x, "ngfAllowDir", js.undefined)
          
          inline def setNgfEnableFirefoxPaste(value: Boolean): Self = StObject.set(x, "ngfEnableFirefoxPaste", value.asInstanceOf[js.Any])
          
          inline def setNgfEnableFirefoxPasteUndefined: Self = StObject.set(x, "ngfEnableFirefoxPaste", js.undefined)
          
          inline def setNgfHideOnDropNotAvailable(value: Boolean): Self = StObject.set(x, "ngfHideOnDropNotAvailable", value.asInstanceOf[js.Any])
          
          inline def setNgfHideOnDropNotAvailableUndefined: Self = StObject.set(x, "ngfHideOnDropNotAvailable", js.undefined)
          
          inline def setNgfMaxDuration(value: Double | String): Self = StObject.set(x, "ngfMaxDuration", value.asInstanceOf[js.Any])
          
          inline def setNgfMaxDurationUndefined: Self = StObject.set(x, "ngfMaxDuration", js.undefined)
          
          inline def setNgfMaxFiles(value: Double): Self = StObject.set(x, "ngfMaxFiles", value.asInstanceOf[js.Any])
          
          inline def setNgfMaxFilesUndefined: Self = StObject.set(x, "ngfMaxFiles", js.undefined)
          
          inline def setNgfMaxSize(value: Double | String): Self = StObject.set(x, "ngfMaxSize", value.asInstanceOf[js.Any])
          
          inline def setNgfMaxSizeUndefined: Self = StObject.set(x, "ngfMaxSize", js.undefined)
          
          inline def setNgfMaxTotalSize(value: Double | String): Self = StObject.set(x, "ngfMaxTotalSize", value.asInstanceOf[js.Any])
          
          inline def setNgfMaxTotalSizeUndefined: Self = StObject.set(x, "ngfMaxTotalSize", js.undefined)
          
          inline def setNgfMinDuration(value: Double | String): Self = StObject.set(x, "ngfMinDuration", value.asInstanceOf[js.Any])
          
          inline def setNgfMinDurationUndefined: Self = StObject.set(x, "ngfMinDuration", js.undefined)
          
          inline def setNgfMinRatio(value: Double | String): Self = StObject.set(x, "ngfMinRatio", value.asInstanceOf[js.Any])
          
          inline def setNgfMinRatioUndefined: Self = StObject.set(x, "ngfMinRatio", js.undefined)
          
          inline def setNgfMinSize(value: Double | String): Self = StObject.set(x, "ngfMinSize", value.asInstanceOf[js.Any])
          
          inline def setNgfMinSizeUndefined: Self = StObject.set(x, "ngfMinSize", js.undefined)
          
          inline def setNgfMultiple(value: Boolean): Self = StObject.set(x, "ngfMultiple", value.asInstanceOf[js.Any])
          
          inline def setNgfMultipleUndefined: Self = StObject.set(x, "ngfMultiple", js.undefined)
          
          inline def setNgfRatio(value: String): Self = StObject.set(x, "ngfRatio", value.asInstanceOf[js.Any])
          
          inline def setNgfRatioUndefined: Self = StObject.set(x, "ngfRatio", js.undefined)
          
          inline def setNgfStopPropagation(value: Boolean): Self = StObject.set(x, "ngfStopPropagation", value.asInstanceOf[js.Any])
          
          inline def setNgfStopPropagationUndefined: Self = StObject.set(x, "ngfStopPropagation", js.undefined)
          
          inline def setNgfValidateForce(value: Boolean): Self = StObject.set(x, "ngfValidateForce", value.asInstanceOf[js.Any])
          
          inline def setNgfValidateForceUndefined: Self = StObject.set(x, "ngfValidateForce", js.undefined)
        }
      }
      
      @js.native
      trait IFileProgressEvent
        extends StObject
           with ProgressEvent[EventTarget] {
        
        var config: IFileUploadConfigFile = js.native
      }
      
      trait IFileUploadConfigFile
        extends StObject
           with IRequestConfig {
        
        /**
          * This is to accommodate server implementations expecting array data object keys in '[i]' or '[]' or
          * ''(multiple entries with same key) format.
          * Example: data: {rec: [file[0], file[1], ...]} sent as: rec[0] -> file[0], rec[1] -> file[1],...
          * data: {rec: {rec: [f[0], f[1], ...], arrayKey: '[]'} sent as: rec[] -> f[0], rec[] -> f[1],...
          * @type {string}
          */
        var arrayKey: js.UndefOr[String] = js.undefined
        
        /**
          * Default false, experimental as hotfix for potential library conflicts with other plugins
          * @type {boolean}
          */
        var disableProgress: js.UndefOr[Boolean] = js.undefined
        
        /**
          * This is to accommodate server implementations expecting nested data object keys in .key or [key] format.
          * Example: data: {rec: {name: 'N', pic: file}} sent as: rec[name] -> N, rec[pic] -> file
          * data: {rec: {name: 'N', pic: file}, objectKey: '.k'} sent as: rec.name -> N, rec.pic -> file
          * @type {string}
          */
        var objectKey: js.UndefOr[String] = js.undefined
        
        /**
          * Upload in chunks of specified size
          * @type {(number|string)}
          */
        var resumeChunkSize: js.UndefOr[Double | String] = js.undefined
        
        /**
          * Function that returns a prommise which will be resolved to the upload file size on the server.
          * @type {[type]}
          */
        var resumeSize: js.UndefOr[Function] = js.undefined
        
        /**
          * Reads the uploaded file size from resumeSizeUrl GET response
          * @type {Function}
          */
        var resumeSizeResponseReader: js.UndefOr[Function] = js.undefined
        
        /**
          * Uploaded file size so far on the server
          * @type {string}
          */
        var resumeSizeUrl: js.UndefOr[String] = js.undefined
      }
      object IFileUploadConfigFile {
        
        inline def apply(method: String, url: String): IFileUploadConfigFile = {
          val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
          __obj.asInstanceOf[IFileUploadConfigFile]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: IFileUploadConfigFile] (val x: Self) extends AnyVal {
          
          inline def setArrayKey(value: String): Self = StObject.set(x, "arrayKey", value.asInstanceOf[js.Any])
          
          inline def setArrayKeyUndefined: Self = StObject.set(x, "arrayKey", js.undefined)
          
          inline def setDisableProgress(value: Boolean): Self = StObject.set(x, "disableProgress", value.asInstanceOf[js.Any])
          
          inline def setDisableProgressUndefined: Self = StObject.set(x, "disableProgress", js.undefined)
          
          inline def setObjectKey(value: String): Self = StObject.set(x, "objectKey", value.asInstanceOf[js.Any])
          
          inline def setObjectKeyUndefined: Self = StObject.set(x, "objectKey", js.undefined)
          
          inline def setResumeChunkSize(value: Double | String): Self = StObject.set(x, "resumeChunkSize", value.asInstanceOf[js.Any])
          
          inline def setResumeChunkSizeUndefined: Self = StObject.set(x, "resumeChunkSize", js.undefined)
          
          inline def setResumeSize(value: Function): Self = StObject.set(x, "resumeSize", value.asInstanceOf[js.Any])
          
          inline def setResumeSizeResponseReader(value: Function): Self = StObject.set(x, "resumeSizeResponseReader", value.asInstanceOf[js.Any])
          
          inline def setResumeSizeResponseReaderUndefined: Self = StObject.set(x, "resumeSizeResponseReader", js.undefined)
          
          inline def setResumeSizeUndefined: Self = StObject.set(x, "resumeSize", js.undefined)
          
          inline def setResumeSizeUrl(value: String): Self = StObject.set(x, "resumeSizeUrl", value.asInstanceOf[js.Any])
          
          inline def setResumeSizeUrlUndefined: Self = StObject.set(x, "resumeSizeUrl", js.undefined)
        }
      }
      
      @js.native
      trait IUploadPromise[T]
        extends StObject
           with IPromise[IHttpResponse[T]] {
        
        /**
          * Cancel/abort the upload in progress.
          *
          * @return {IUploadPromise<T>}
          */
        def abort(): IUploadPromise[T] = js.native
        
        def progress(callback: js.Function1[/* event */ IFileProgressEvent, Unit]): IUploadPromise[T] = js.native
        
        /**
          * Access or attach event listeners to the underlying XMLHttpRequest
          *
          * @param  {IHttpPromiseCallback<T>}
          * @return {IUploadPromise<T>}
          */
        def xhr(callback: IHttpPromiseCallback[T]): IUploadPromise[T] = js.native
      }
      
      @js.native
      trait IUploadService extends StObject {
        
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
      
      trait ImageDimensions extends StObject {
        
        var height: Double
        
        var width: Double
      }
      object ImageDimensions {
        
        inline def apply(height: Double, width: Double): ImageDimensions = {
          val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
          __obj.asInstanceOf[ImageDimensions]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: ImageDimensions] (val x: Self) extends AnyVal {
          
          inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
          
          inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        }
      }
      
      type ResizeIfFunction = js.Function2[/* width */ Double, /* height */ Double, Boolean]
    }
  }
}
