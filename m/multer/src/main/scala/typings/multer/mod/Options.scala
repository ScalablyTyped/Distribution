package typings.multer.mod

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.multer.anon.FieldNameSize
import typings.multer.mod.global.Express.Multer.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Options for initializing a Multer instance. */
@js.native
trait Options extends js.Object {
  
  /**
    * The destination directory for uploaded files. If `storage` is not set
    * and `dest` is, Multer will create a `DiskStorage` instance configured
    * to store files at `dest` with random filenames.
    *
    * Ignored if `storage` is set.
    */
  var dest: js.UndefOr[String] = js.native
  
  /**
    * Optional function to control which files are uploaded. This is called
    * for every file that is processed.
    *
    * @param req The Express `Request` object.
    * @param file Object containing information about the processed file.
    * @param callback  a function to control which files should be uploaded and which should be skipped.
    */
  var fileFilter: js.UndefOr[
    js.Function3[
      /* req */ Request_[ParamsDictionary, _, _, Query], 
      /* file */ File, 
      /* callback */ FileFilterCallback, 
      Unit
    ]
  ] = js.native
  
  /**
    * An object specifying various limits on incoming data. This object is
    * passed to Busboy directly, and the details of properties can be found
    * at https://github.com/mscdex/busboy#busboy-methods.
    */
  var limits: js.UndefOr[FieldNameSize] = js.native
  
  /** Preserve the full path of the original filename rather than the basename. (Default: false) */
  var preservePath: js.UndefOr[Boolean] = js.native
  
  /**
    * A `StorageEngine` responsible for processing files uploaded via Multer.
    * Takes precedence over `dest`.
    */
  var storage: js.UndefOr[StorageEngine] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setDest(value: String): Self = this.set("dest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDest: Self = this.set("dest", js.undefined)
    
    @scala.inline
    def setFileFilter(
      value: (/* req */ Request_[ParamsDictionary, _, _, Query], /* file */ File, /* callback */ FileFilterCallback) => Unit
    ): Self = this.set("fileFilter", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteFileFilter: Self = this.set("fileFilter", js.undefined)
    
    @scala.inline
    def setLimits(value: FieldNameSize): Self = this.set("limits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimits: Self = this.set("limits", js.undefined)
    
    @scala.inline
    def setPreservePath(value: Boolean): Self = this.set("preservePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreservePath: Self = this.set("preservePath", js.undefined)
    
    @scala.inline
    def setStorage(value: StorageEngine): Self = this.set("storage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorage: Self = this.set("storage", js.undefined)
  }
}
