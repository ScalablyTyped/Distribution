package typings.mnemonist.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mnemonist.lruMapMod.default
import typings.mnemonist.utilsTypesMod.IArrayLikeConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mnemonist", "LRUMap")
@js.native
open class LRUMap[K, V] protected () extends default[K, V] {
  // Constructor
  def this(capacity: Double) = this()
  def this(KeyArrayClass: IArrayLikeConstructor, ValueArrayClass: IArrayLikeConstructor, capacity: Double) = this()
}
/* static members */
object LRUMap {
  
  @JSImport("mnemonist", "LRUMap")
  @js.native
  val ^ : js.Any = js.native
  
  inline def from[I, J](iterable: js.Iterable[js.Tuple2[I, J]]): typings.mnemonist.lruMapMod.LRUMap[I, J] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[typings.mnemonist.lruMapMod.LRUMap[I, J]]
  // Statics
  inline def from[I, J](
    iterable: js.Iterable[js.Tuple2[I, J]],
    KeyArrayClass: IArrayLikeConstructor,
    ValueArrayClass: IArrayLikeConstructor
  ): typings.mnemonist.lruMapMod.LRUMap[I, J] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], KeyArrayClass.asInstanceOf[js.Any], ValueArrayClass.asInstanceOf[js.Any])).asInstanceOf[typings.mnemonist.lruMapMod.LRUMap[I, J]]
  inline def from[I, J](
    iterable: js.Iterable[js.Tuple2[I, J]],
    KeyArrayClass: IArrayLikeConstructor,
    ValueArrayClass: IArrayLikeConstructor,
    capacity: Double
  ): typings.mnemonist.lruMapMod.LRUMap[I, J] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], KeyArrayClass.asInstanceOf[js.Any], ValueArrayClass.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[typings.mnemonist.lruMapMod.LRUMap[I, J]]
  inline def from[I, J](iterable: js.Iterable[js.Tuple2[I, J]], capacity: Double): typings.mnemonist.lruMapMod.LRUMap[I, J] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[typings.mnemonist.lruMapMod.LRUMap[I, J]]
  inline def from[I, J](iterable: StringDictionary[J]): typings.mnemonist.lruMapMod.LRUMap[I, J] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[typings.mnemonist.lruMapMod.LRUMap[I, J]]
  inline def from[I, J](
    iterable: StringDictionary[J],
    KeyArrayClass: IArrayLikeConstructor,
    ValueArrayClass: IArrayLikeConstructor
  ): typings.mnemonist.lruMapMod.LRUMap[I, J] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], KeyArrayClass.asInstanceOf[js.Any], ValueArrayClass.asInstanceOf[js.Any])).asInstanceOf[typings.mnemonist.lruMapMod.LRUMap[I, J]]
  inline def from[I, J](
    iterable: StringDictionary[J],
    KeyArrayClass: IArrayLikeConstructor,
    ValueArrayClass: IArrayLikeConstructor,
    capacity: Double
  ): typings.mnemonist.lruMapMod.LRUMap[I, J] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], KeyArrayClass.asInstanceOf[js.Any], ValueArrayClass.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[typings.mnemonist.lruMapMod.LRUMap[I, J]]
  inline def from[I, J](iterable: StringDictionary[J], capacity: Double): typings.mnemonist.lruMapMod.LRUMap[I, J] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[typings.mnemonist.lruMapMod.LRUMap[I, J]]
}
