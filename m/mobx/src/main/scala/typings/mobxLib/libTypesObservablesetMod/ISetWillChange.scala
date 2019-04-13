package typings
package mobxLib.libTypesObservablesetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISetWillChange[T] extends js.Object {
  var newValue: js.UndefOr[T] = js.native
  var `object`: js.UndefOr[ObservableSet[T]] = js.native
  var oldValue: js.UndefOr[T] = js.native
  var `type`: js.UndefOr[mobxLib.mobxLibStrings.add | mobxLib.mobxLibStrings.delete] = js.native
}

