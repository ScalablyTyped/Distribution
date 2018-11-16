package typings
package mobxLib.libTypesObservablemapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IMapWillChange[K, V] extends js.Object {
  var name: K
  var newValue: js.UndefOr[V] = js.undefined
  var `object`: ObservableMap[K, V]
  var `type`: mobxLib.mobxLibStrings.update | mobxLib.mobxLibStrings.add | mobxLib.mobxLibStrings.delete
}

