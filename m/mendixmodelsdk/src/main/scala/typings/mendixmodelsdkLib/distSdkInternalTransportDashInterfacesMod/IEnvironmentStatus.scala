package typings
package mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEnvironmentStatus extends js.Object {
  var appType: js.UndefOr[
    mendixmodelsdkLib.mendixmodelsdkLibStrings.Licensed | mendixmodelsdkLib.mendixmodelsdkLibStrings.Unlicensed | mendixmodelsdkLib.mendixmodelsdkLibStrings.Sandbox
  ] = js.native
  var buildErrors: js.UndefOr[js.Array[IBuildError]] = js.native
  var buildstatus: js.UndefOr[java.lang.String | scala.Null] = js.native
  var cause: js.UndefOr[java.lang.String] = js.native
  var consistencyErrors: js.UndefOr[js.Array[IProblem]] = js.native
  var disk: js.UndefOr[scala.Double] = js.native
  var endpoint: js.UndefOr[java.lang.String] = js.native
  var environmentId: js.UndefOr[java.lang.String] = js.native
  var instances: js.UndefOr[scala.Double] = js.native
  var memory: js.UndefOr[scala.Double] = js.native
  var message: js.UndefOr[java.lang.String] = js.native
  var name: js.UndefOr[java.lang.String] = js.native
  var profile: js.UndefOr[java.lang.String] = js.native
  var state: js.UndefOr[CannotFixAppState | SuccessAppState] = js.native
  var `type`: js.UndefOr[
    mendixmodelsdkLib.mendixmodelsdkLibStrings.fail | mendixmodelsdkLib.mendixmodelsdkLibStrings.success
  ] = js.native
  var url: js.UndefOr[java.lang.String] = js.native
}

