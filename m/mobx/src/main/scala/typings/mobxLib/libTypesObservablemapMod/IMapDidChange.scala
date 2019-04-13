package typings
package mobxLib.libTypesObservablemapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMapDidChange[K, V] extends js.Object {
  var name: js.UndefOr[K] = js.native
  var newValue: js.UndefOr[V] = js.native
  var `object`: js.UndefOr[ObservableMap[K, V]] = js.native
  var oldValue: js.UndefOr[V] = js.native
  var `type`: js.UndefOr[
    mobxLib.mobxLibStrings.add | mobxLib.mobxLibStrings.delete | mobxLib.mobxLibStrings.update
  ] = js.native
}

