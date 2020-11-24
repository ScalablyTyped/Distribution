package typings.multerGridfsStorage.mod

import typings.multerGridfsStorage.mod.global.Express.Multer.File
import typings.std.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MulterGfsOptions extends js.Object {
  
  var file: js.UndefOr[js.Function2[/* req */ Request, /* file */ File, _]] = js.native
}
object MulterGfsOptions {
  
  @scala.inline
  def apply(): MulterGfsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MulterGfsOptions]
  }
  
  @scala.inline
  implicit class MulterGfsOptionsOps[Self <: MulterGfsOptions] (val x: Self) extends AnyVal {
    
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
    def setFile(value: (/* req */ Request, /* file */ File) => _): Self = this.set("file", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
  }
}
