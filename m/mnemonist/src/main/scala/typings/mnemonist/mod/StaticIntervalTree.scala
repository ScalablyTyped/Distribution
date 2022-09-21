package typings.mnemonist.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mnemonist.staticIntervalTreeMod.StaticIntervalTreeGettersTuple
import typings.mnemonist.staticIntervalTreeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mnemonist", "StaticIntervalTree")
@js.native
open class StaticIntervalTree[T] protected () extends default[T] {
  // Constructor
  def this(intervals: js.Array[T]) = this()
  def this(intervals: js.Array[T], getters: StaticIntervalTreeGettersTuple[T]) = this()
}
/* static members */
object StaticIntervalTree {
  
  @JSImport("mnemonist", "StaticIntervalTree")
  @js.native
  val ^ : js.Any = js.native
  
  // Statics
  inline def from[I](iterable: js.Iterable[I]): typings.mnemonist.staticIntervalTreeMod.StaticIntervalTree[I] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[typings.mnemonist.staticIntervalTreeMod.StaticIntervalTree[I]]
  inline def from[I](iterable: StringDictionary[I]): typings.mnemonist.staticIntervalTreeMod.StaticIntervalTree[I] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[typings.mnemonist.staticIntervalTreeMod.StaticIntervalTree[I]]
}
