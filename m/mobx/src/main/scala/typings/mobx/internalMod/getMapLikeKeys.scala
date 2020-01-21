package typings.mobx.internalMod

import typings.mobx.observablemapMod.IKeyValueMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/internal", "getMapLikeKeys")
@js.native
object getMapLikeKeys extends js.Object {
  def apply[V](map: js.Any): js.Array[String] = js.native
  def apply[V](map: IKeyValueMap[V]): js.Array[String] = js.native
  def apply[K, V](map: ObservableMap[K, V]): js.Array[K] = js.native
}

