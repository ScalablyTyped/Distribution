package typings
package mendixmodelsdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var appType: js.UndefOr[
    mendixmodelsdkLib.mendixmodelsdkLibStrings.Licensed | mendixmodelsdkLib.mendixmodelsdkLibStrings.Unlicensed | mendixmodelsdkLib.mendixmodelsdkLibStrings.Sandbox
  ] = js.undefined
  var buildErrors: js.UndefOr[
    js.Array[mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.IBuildError]
  ] = js.undefined
  var buildstatus: java.lang.String | scala.Null
  var consistencyErrors: js.UndefOr[js.Array[mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.IProblem]] = js.undefined
  var disk: scala.Double
  var endpoint: java.lang.String
  var environmentId: java.lang.String
  var instances: scala.Double
  var memory: scala.Double
  var message: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var profile: java.lang.String
  var state: mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.SuccessAppState
  var `type`: mendixmodelsdkLib.mendixmodelsdkLibStrings.success
  var url: java.lang.String
}

