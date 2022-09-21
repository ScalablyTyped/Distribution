package typings.mnemonist.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mnemonist.queueMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mnemonist", "Queue")
@js.native
open class Queue[T] () extends default[T]
/* static members */
object Queue {
  
  @JSImport("mnemonist", "Queue")
  @js.native
  val ^ : js.Any = js.native
  
  // Statics
  inline def from[I](iterable: js.Iterable[I]): typings.mnemonist.queueMod.Queue[I] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[typings.mnemonist.queueMod.Queue[I]]
  inline def from[I](iterable: StringDictionary[I]): typings.mnemonist.queueMod.Queue[I] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[typings.mnemonist.queueMod.Queue[I]]
  
  inline def of[I](items: I*): typings.mnemonist.queueMod.Queue[I] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(items.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.mnemonist.queueMod.Queue[I]]
}
