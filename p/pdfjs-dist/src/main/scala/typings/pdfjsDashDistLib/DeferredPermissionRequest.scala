package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeferredPermissionRequest extends js.Object {
  val id: scala.Double
  val `type`: MSWebViewPermissionType
  val uri: java.lang.String
  def allow(): scala.Unit
  def deny(): scala.Unit
}

@JSGlobal("DeferredPermissionRequest")
@js.native
object DeferredPermissionRequest
  extends org.scalablytyped.runtime.Instantiable0[DeferredPermissionRequest]

