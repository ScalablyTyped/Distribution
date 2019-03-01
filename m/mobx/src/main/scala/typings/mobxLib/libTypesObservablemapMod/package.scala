package typings
package mobxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTypesObservablemapMod {
  type IMapEntries[K, V] = js.Array[IMapEntry[K, V]]
  type IMapEntry[K, V] = js.Tuple2[K, V]
  type IObservableMapInitialValues[K, V] = (IMapEntries[K, V]) | IKeyValueMap[V] | (stdLib.Map[K, V])
}
