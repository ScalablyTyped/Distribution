package typings.mojangMinecraft.mod

import typings.std.Iterable
import typings.std.IteratorResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "EntityIterator")
@js.native
/* protected */ open class EntityIterator ()
  extends StObject
     with Iterable[Entity] {
  
  /**
    * @remarks
    * Retrieves the next item in this iteration. The resulting
    * IteratorResult contains .done and .value properties which
    * can be used to see the next Entity in the iteration.
    */
  def next(): IteratorResult[Entity, Any] = js.native
}
