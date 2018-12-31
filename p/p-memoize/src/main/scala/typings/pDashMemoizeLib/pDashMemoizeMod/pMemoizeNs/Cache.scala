package typings
package pDashMemoizeLib.pDashMemoizeMod.pMemoizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cache[K, V] extends js.Object {
  var clear: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  def delete(key: K): scala.Unit
  def get(key: K): V
  def has(key: K): scala.Boolean
  def set(key: K, value: V): scala.Unit
}

