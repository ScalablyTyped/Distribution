package typings.mobx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object observablemapMod {
  type IKeyValueMap[V] = org.scalablytyped.runtime.StringDictionary[V]
  type IMapEntries[K, V] = js.Array[typings.mobx.observablemapMod.IMapEntry[K, V]]
  type IMapEntry[K, V] = js.Tuple2[K, V]
  type IObservableMapInitialValues[K, V] = (typings.mobx.observablemapMod.IMapEntries[K, V]) | typings.mobx.observablemapMod.IKeyValueMap[V] | (typings.std.Map[K, V])
}
