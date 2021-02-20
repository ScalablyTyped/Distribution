package typings.mendixmodelsdk.transportInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWorkingCopy extends StObject {
  
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
  implicit class IWorkingCopyMutableBuilder[Self <: IWorkingCopy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChanged(value: Boolean): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCollaboration(value: Boolean): Self = StObject.set(x, "isCollaboration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembers(value: js.Array[String]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersVarargs(value: String*): Self = StObject.set(x, "members", js.Array(value :_*))
    
    @scala.inline
    def setMergeData(value: ILockData): Self = StObject.set(x, "mergeData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeDataNull: Self = StObject.set(x, "mergeData", null)
    
    @scala.inline
    def setMetaData(value: IWorkingCopyMetaData): Self = StObject.set(x, "metaData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMprFileName(value: String): Self = StObject.set(x, "mprFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMprMetaData(value: IMprMetaData): Self = StObject.set(x, "mprMetaData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadDateTime(value: Double): Self = StObject.set(x, "uploadDateTime", value.asInstanceOf[js.Any])
  }
}
