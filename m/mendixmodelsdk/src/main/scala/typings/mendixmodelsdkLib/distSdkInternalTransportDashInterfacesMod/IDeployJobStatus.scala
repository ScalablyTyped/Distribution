package typings
package mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDeployJobStatus extends js.Object {
  var appUrl: js.UndefOr[java.lang.String] = js.undefined
  var buildErrors: js.UndefOr[js.Array[IBuildError]] = js.undefined
  var buildstatus: java.lang.String | scala.Null
  var consistencyErrors: js.UndefOr[js.Array[IProblem]] = js.undefined
  var jobid: java.lang.String
  var startTime: scala.Double
  var status: IUpdateAppJobStatus
  /**
    * Used to keep track of which steps this app update went trough,
    * mainly for debugging
    *
    * @memberOf IGetUpdateAppStatusResponse
    */
  var trace: js.Array[java.lang.String]
  var `type`: mendixmodelsdkLib.mendixmodelsdkLibStrings.full | mendixmodelsdkLib.mendixmodelsdkLibStrings.fast
}

