package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IObjectFileAndVersion extends js.Object {
  
  val ObjectFile: IObjectFile = js.native
  
  val ObjectVersion: IObjectVersionAndProperties = js.native
}
object IObjectFileAndVersion {
  
  @scala.inline
  def apply(ObjectFile: IObjectFile, ObjectVersion: IObjectVersionAndProperties): IObjectFileAndVersion = {
    val __obj = js.Dynamic.literal(ObjectFile = ObjectFile.asInstanceOf[js.Any], ObjectVersion = ObjectVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjectFileAndVersion]
  }
  
  @scala.inline
  implicit class IObjectFileAndVersionOps[Self <: IObjectFileAndVersion] (val x: Self) extends AnyVal {
    
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
    def setObjectFile(value: IObjectFile): Self = this.set("ObjectFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectVersion(value: IObjectVersionAndProperties): Self = this.set("ObjectVersion", value.asInstanceOf[js.Any])
  }
}
