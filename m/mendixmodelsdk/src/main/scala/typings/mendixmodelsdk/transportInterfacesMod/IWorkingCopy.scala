package typings.mendixmodelsdk.transportInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWorkingCopy extends StObject {
  
  var changed: Boolean
  
  var id: String
  
  var isCollaboration: Boolean
  
  /**
    * OpenIDs of all users that are granted access.
    */
  var members: js.Array[String]
  
  var mergeData: ILockData | Null
  
  var metaData: IWorkingCopyMetaData
  
  /**
    * The name of the MPR file within the working copy's MPK, relative to its root.
    * This will typically but not necessarily equal `project.mpr`.
    */
  var mprFileName: String
  
  var mprMetaData: IMprMetaData
  
  var uploadDateTime: Double
}
object IWorkingCopy {
  
  inline def apply(
    changed: Boolean,
    id: String,
    isCollaboration: Boolean,
    members: js.Array[String],
    metaData: IWorkingCopyMetaData,
    mprFileName: String,
    mprMetaData: IMprMetaData,
    uploadDateTime: Double
  ): IWorkingCopy = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isCollaboration = isCollaboration.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], metaData = metaData.asInstanceOf[js.Any], mprFileName = mprFileName.asInstanceOf[js.Any], mprMetaData = mprMetaData.asInstanceOf[js.Any], uploadDateTime = uploadDateTime.asInstanceOf[js.Any], mergeData = null)
    __obj.asInstanceOf[IWorkingCopy]
  }
  
  extension [Self <: IWorkingCopy](x: Self) {
    
    inline def setChanged(value: Boolean): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsCollaboration(value: Boolean): Self = StObject.set(x, "isCollaboration", value.asInstanceOf[js.Any])
    
    inline def setMembers(value: js.Array[String]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersVarargs(value: String*): Self = StObject.set(x, "members", js.Array(value*))
    
    inline def setMergeData(value: ILockData): Self = StObject.set(x, "mergeData", value.asInstanceOf[js.Any])
    
    inline def setMergeDataNull: Self = StObject.set(x, "mergeData", null)
    
    inline def setMetaData(value: IWorkingCopyMetaData): Self = StObject.set(x, "metaData", value.asInstanceOf[js.Any])
    
    inline def setMprFileName(value: String): Self = StObject.set(x, "mprFileName", value.asInstanceOf[js.Any])
    
    inline def setMprMetaData(value: IMprMetaData): Self = StObject.set(x, "mprMetaData", value.asInstanceOf[js.Any])
    
    inline def setUploadDateTime(value: Double): Self = StObject.set(x, "uploadDateTime", value.asInstanceOf[js.Any])
  }
}
