package typings.mendixmodelsdk.distSdkInternalTransportInterfacesMod

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
    val __obj = js.Dynamic.literal(changed = changed, id = id, isCollaboration = isCollaboration, members = members, metaData = metaData, mprFileName = mprFileName, mprMetaData = mprMetaData, uploadDateTime = uploadDateTime)
    if (mergeData != null) __obj.updateDynamic("mergeData")(mergeData)
    __obj.asInstanceOf[IWorkingCopy]
  }
}

