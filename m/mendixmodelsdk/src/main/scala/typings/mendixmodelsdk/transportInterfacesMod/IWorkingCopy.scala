package typings.mendixmodelsdk.transportInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWorkingCopy extends js.Object {
  
  var changed: Boolean = js.native
  
  var id: String = js.native
  
  var isCollaboration: Boolean = js.native
  
  /**
    * OpenIDs of all users that are granted access.
    */
  var members: js.Array[String] = js.native
  
  var mergeData: ILockData | Null = js.native
  
  var metaData: IWorkingCopyMetaData = js.native
  
  /**
    * The name of the MPR file within the working copy's MPK, relative to its root.
    * This will typically but not necessarily equal `project.mpr`.
    */
  var mprFileName: String = js.native
  
  var mprMetaData: IMprMetaData = js.native
  
  var uploadDateTime: Double = js.native
}
object IWorkingCopy {
  
  @scala.inline
  def apply(
    changed: Boolean,
    id: String,
    isCollaboration: Boolean,
    members: js.Array[String],
    metaData: IWorkingCopyMetaData,
    mprFileName: String,
    mprMetaData: IMprMetaData,
    uploadDateTime: Double
  ): IWorkingCopy = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isCollaboration = isCollaboration.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], metaData = metaData.asInstanceOf[js.Any], mprFileName = mprFileName.asInstanceOf[js.Any], mprMetaData = mprMetaData.asInstanceOf[js.Any], uploadDateTime = uploadDateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWorkingCopy]
  }
  
  @scala.inline
  implicit class IWorkingCopyOps[Self <: IWorkingCopy] (val x: Self) extends AnyVal {
    
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
    def setChanged(value: Boolean): Self = this.set("changed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCollaboration(value: Boolean): Self = this.set("isCollaboration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersVarargs(value: String*): Self = this.set("members", js.Array(value :_*))
    
    @scala.inline
    def setMembers(value: js.Array[String]): Self = this.set("members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaData(value: IWorkingCopyMetaData): Self = this.set("metaData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMprFileName(value: String): Self = this.set("mprFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMprMetaData(value: IMprMetaData): Self = this.set("mprMetaData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadDateTime(value: Double): Self = this.set("uploadDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeData(value: ILockData): Self = this.set("mergeData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeDataNull: Self = this.set("mergeData", null)
  }
}
