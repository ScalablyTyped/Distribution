package typings.msRestAzure.modelsMod

import typings.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TenantListResult extends Array[TenantIdDescription] {
  var nextLink: String = js.native
  var value: js.UndefOr[js.Array[TenantIdDescription]] = js.native
}

