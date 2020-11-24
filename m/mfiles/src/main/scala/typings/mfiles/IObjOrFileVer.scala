package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IObjOrFileVer extends js.Object {
  
  def Clone(): IObjOrFileVer = js.native
  
  var FileVer: IFileVer = js.native
  
  def IsFile(): Boolean = js.native
  
  var ObjVer: IObjVer = js.native
}
object IObjOrFileVer {
  
  @scala.inline
  def apply(Clone: () => IObjOrFileVer, FileVer: IFileVer, IsFile: () => Boolean, ObjVer: IObjVer): IObjOrFileVer = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), FileVer = FileVer.asInstanceOf[js.Any], IsFile = js.Any.fromFunction0(IsFile), ObjVer = ObjVer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjOrFileVer]
  }
  
  @scala.inline
  implicit class IObjOrFileVerOps[Self <: IObjOrFileVer] (val x: Self) extends AnyVal {
    
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
    def setClone(value: () => IObjOrFileVer): Self = this.set("Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFileVer(value: IFileVer): Self = this.set("FileVer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFile(value: () => Boolean): Self = this.set("IsFile", js.Any.fromFunction0(value))
    
    @scala.inline
    def setObjVer(value: IObjVer): Self = this.set("ObjVer", value.asInstanceOf[js.Any])
  }
}
