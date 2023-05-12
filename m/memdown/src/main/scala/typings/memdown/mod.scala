package typings.memdown

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import typings.abstractLeveldown.mod.AbstractLevelDOWN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("memdown", JSImport.Default)
  @js.native
  val default: MemDownConstructor = js.native
  
  @JSImport("memdown", "MemDown")
  @js.native
  val MemDown: MemDownConstructor = js.native
  type MemDown[K, V] = AbstractLevelDOWN[K, V]
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("memdown", "MemDown")
  @js.native
  // eslint-disable-next-line no-unnecessary-generics
  open class MemDownCls[K, V] ()
    extends StObject
       with AbstractLevelDOWN[K, V]
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("memdown", JSImport.Default)
  @js.native
  // eslint-disable-next-line no-unnecessary-generics
  open class defaultCls[K, V] ()
    extends StObject
       with AbstractLevelDOWN[K, V]
  
  @js.native
  trait MemDownConstructor
    extends StObject
       with // eslint-disable-next-line no-unnecessary-generics
  Instantiable0[typings.memdown.mod.MemDown[js.Object, js.Object]] {
    
    // eslint-disable-next-line no-unnecessary-generics
    def apply[K, V](): typings.memdown.mod.MemDown[K, V] = js.native
  }
  
  type _To = MemDownConstructor
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: MemDownConstructor = default
}
