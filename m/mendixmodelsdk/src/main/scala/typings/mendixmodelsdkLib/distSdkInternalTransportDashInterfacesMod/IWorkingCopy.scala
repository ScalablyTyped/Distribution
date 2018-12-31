package typings
package mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWorkingCopy extends js.Object {
  var id: java.lang.String
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

