package typings.mkdirp.mod

import typings.mkdirp.anon.Typeofmkdir
import typings.mkdirp.anon.Typeofstat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FsImplementation extends js.Object {
  
  var mkdir: Typeofmkdir = js.native
  
  var stat: Typeofstat = js.native
}
object FsImplementation {
  
  @scala.inline
  def apply(mkdir: Typeofmkdir, stat: Typeofstat): FsImplementation = {
    val __obj = js.Dynamic.literal(mkdir = mkdir.asInstanceOf[js.Any], stat = stat.asInstanceOf[js.Any])
    __obj.asInstanceOf[FsImplementation]
  }
  
  @scala.inline
  implicit class FsImplementationOps[Self <: FsImplementation] (val x: Self) extends AnyVal {
    
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
    def setMkdir(value: Typeofmkdir): Self = this.set("mkdir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStat(value: Typeofstat): Self = this.set("stat", value.asInstanceOf[js.Any])
  }
}
