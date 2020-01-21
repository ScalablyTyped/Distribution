package typings.nuclearJs.mod.Immutable

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nuclear-js", "Immutable.set")
@js.native
object set extends js.Object {
  def apply[V, C /* <: StringDictionary[V] */](collection: C, key: String, value: V): C = js.native
  def apply[V, C /* <: js.Array[V] */](collection: C, key: Double, value: V): C = js.native
  def apply[C, K /* <: String */](
    `object`: C,
    key: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: C[K] */ js.Any
  ): C = js.native
  def apply[K, V, C /* <: typings.immutable.Immutable.Collection[K, V] */](collection: C, key: K, value: V): C = js.native
}

