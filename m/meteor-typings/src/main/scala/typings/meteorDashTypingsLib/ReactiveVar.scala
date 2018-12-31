package typings
package meteorDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactiveVar[T] extends js.Object {
  def get(): T
  def set(newValue: T): scala.Unit
}

