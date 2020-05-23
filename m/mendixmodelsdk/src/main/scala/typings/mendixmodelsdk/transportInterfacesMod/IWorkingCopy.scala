package typings.mendixmodelsdk.transportInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWorkingCopy extends js.Object {
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
  @scala.inline
  def apply(
    changed: Boolean,
    id: String,
    isCollaboration: Boolean,
    members: js.Array[String],
    metaData: IWorkingCopyMetaData,
    mprFileName: String,
    mprMetaData: IMprMetaData,
    uploadDateTime: Double,
    mergeData: ILockData = null
  ): IWorkingCopy = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isCollaboration = isCollaboration.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], metaData = metaData.asInstanceOf[js.Any], mprFileName = mprFileName.asInstanceOf[js.Any], mprMetaData = mprMetaData.asInstanceOf[js.Any], uploadDateTime = uploadDateTime.asInstanceOf[js.Any], mergeData = mergeData.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWorkingCopy]
  }
}

