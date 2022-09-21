package typings.mnemonist.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mnemonist.linkedListMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mnemonist", "LinkedList")
@js.native
open class LinkedList[T] () extends default[T]
/* static members */
object LinkedList {
  
  @JSImport("mnemonist", "LinkedList")
  @js.native
  val ^ : js.Any = js.native
  
  // Statics
  inline def from[I](iterable: js.Iterable[I]): typings.mnemonist.linkedListMod.LinkedList[I] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[typings.mnemonist.linkedListMod.LinkedList[I]]
  inline def from[I](iterable: StringDictionary[I]): typings.mnemonist.linkedListMod.LinkedList[I] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[typings.mnemonist.linkedListMod.LinkedList[I]]
}
