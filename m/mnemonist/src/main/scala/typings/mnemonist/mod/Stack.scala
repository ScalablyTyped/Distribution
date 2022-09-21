package typings.mnemonist.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mnemonist.stackMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mnemonist", "Stack")
@js.native
open class Stack[T] () extends default[T]
/* static members */
object Stack {
  
  @JSImport("mnemonist", "Stack")
  @js.native
  val ^ : js.Any = js.native
  
  // Statics
  inline def from[I](iterable: js.Iterable[I]): typings.mnemonist.stackMod.Stack[I] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[typings.mnemonist.stackMod.Stack[I]]
  inline def from[I](iterable: StringDictionary[I]): typings.mnemonist.stackMod.Stack[I] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[typings.mnemonist.stackMod.Stack[I]]
  
  inline def of[I](items: I*): typings.mnemonist.stackMod.Stack[I] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(items.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.mnemonist.stackMod.Stack[I]]
}
