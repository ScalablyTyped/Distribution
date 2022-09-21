package typings.mnemonist.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mnemonist.typesMod.IArrayLikeConstructor
import typings.mnemonist.vectorMod.VectorOptions
import typings.mnemonist.vectorMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mnemonist", "Vector")
@js.native
open class Vector protected () extends default {
  // Constructor
  def this(ArrayClass: IArrayLikeConstructor, length: Double) = this()
  def this(ArrayClass: IArrayLikeConstructor, length: VectorOptions) = this()
}
/* static members */
object Vector {
  
  @JSImport("mnemonist", "Vector")
  @js.native
  val ^ : js.Any = js.native
  
  // Statics
  inline def from[I](iterable: js.Iterable[I], ArrayClass: IArrayLikeConstructor): typings.mnemonist.vectorMod.Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], ArrayClass.asInstanceOf[js.Any])).asInstanceOf[typings.mnemonist.vectorMod.Vector]
  inline def from[I](iterable: js.Iterable[I], ArrayClass: IArrayLikeConstructor, capacity: Double): typings.mnemonist.vectorMod.Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], ArrayClass.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[typings.mnemonist.vectorMod.Vector]
  inline def from[I](iterable: StringDictionary[I], ArrayClass: IArrayLikeConstructor): typings.mnemonist.vectorMod.Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], ArrayClass.asInstanceOf[js.Any])).asInstanceOf[typings.mnemonist.vectorMod.Vector]
  inline def from[I](iterable: StringDictionary[I], ArrayClass: IArrayLikeConstructor, capacity: Double): typings.mnemonist.vectorMod.Vector = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], ArrayClass.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[typings.mnemonist.vectorMod.Vector]
}
