package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITraditionalFolderContents extends js.Object {
  
  val ID: Double = js.native
  
  val ObjectVersions: IObjectVersions = js.native
  
  val TraditionalFolders: ITraditionalFolders = js.native
}
object ITraditionalFolderContents {
  
  @scala.inline
  def apply(ID: Double, ObjectVersions: IObjectVersions, TraditionalFolders: ITraditionalFolders): ITraditionalFolderContents = {
    val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any], ObjectVersions = ObjectVersions.asInstanceOf[js.Any], TraditionalFolders = TraditionalFolders.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITraditionalFolderContents]
  }
  
  @scala.inline
  implicit class ITraditionalFolderContentsOps[Self <: ITraditionalFolderContents] (val x: Self) extends AnyVal {
    
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
    def setID(value: Double): Self = this.set("ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectVersions(value: IObjectVersions): Self = this.set("ObjectVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraditionalFolders(value: ITraditionalFolders): Self = this.set("TraditionalFolders", value.asInstanceOf[js.Any])
  }
}
