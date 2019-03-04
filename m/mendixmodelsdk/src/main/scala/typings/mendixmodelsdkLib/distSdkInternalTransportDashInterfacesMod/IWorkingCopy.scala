package typings
package mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWorkingCopy extends js.Object {
  var changed: scala.Boolean
  var id: java.lang.String
  var isCollaboration: scala.Boolean
  /**
    * OpenIDs of all users that are granted access.
    */
  var members: js.Array[java.lang.String]
  var mergeData: ILockData | scala.Null
  var metaData: IWorkingCopyMetaData
  /**
    * The name of the MPR file within the working copy's MPK, relative to its root.
    * This will typically but not necessarily equal `project.mpr`.
    */
  var mprFileName: java.lang.String
  var mprMetaData: IMprMetaData
  var uploadDateTime: scala.Double
}

object IWorkingCopy {
  @scala.inline
  def apply(
    changed: scala.Boolean,
    id: java.lang.String,
    isCollaboration: scala.Boolean,
    members: js.Array[java.lang.String],
    metaData: IWorkingCopyMetaData,
    mprFileName: java.lang.String,
    mprMetaData: IMprMetaData,
    uploadDateTime: scala.Double,
    mergeData: ILockData = null
  ): IWorkingCopy = {
    val __obj = js.Dynamic.literal(changed = changed, id = id, isCollaboration = isCollaboration, members = members, metaData = metaData, mprFileName = mprFileName, mprMetaData = mprMetaData, uploadDateTime = uploadDateTime)
    if (mergeData != null) __obj.updateDynamic("mergeData")(mergeData)
    __obj.asInstanceOf[IWorkingCopy]
  }
}

