package typings.parcelEnv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ParcelModuleApi {
  type ModuleId = java.lang.String | scala.Double
  type Require1 = js.Function1[/* id */ java.lang.String, js.Any]
  type Require2 = js.Function1[/* id */ java.lang.String, js.Any]
  type RequireLambda = typings.parcelEnv.ParcelModuleApi.Require1 with typings.parcelEnv.ParcelModuleApi.Require2
}
