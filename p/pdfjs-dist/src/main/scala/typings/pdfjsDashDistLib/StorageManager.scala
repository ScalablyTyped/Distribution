package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageManager extends js.Object {
  def estimate(): js.Promise[StorageEstimate]
  def persist(): js.Promise[scala.Boolean]
  def persisted(): js.Promise[scala.Boolean]
}

@JSGlobal("StorageManager")
@js.native
object StorageManager
  extends org.scalablytyped.runtime.Instantiable0[StorageManager]

