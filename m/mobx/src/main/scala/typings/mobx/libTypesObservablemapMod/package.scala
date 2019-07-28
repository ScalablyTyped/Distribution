package typings.mobx

import org.scalablytyped.runtime.StringDictionary
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTypesObservablemapMod {
  type IKeyValueMap[V] = StringDictionary[V]
  type IMapEntries[K, V] = js.Array[IMapEntry[K, V]]
  type IMapEntry[K, V] = js.Tuple2[K, V]
  type IObservableMapInitialValues[K, V] = (IMapEntries[K, V]) | IKeyValueMap[V] | (Map[K, V])
}
