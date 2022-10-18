package typings.memfs

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSetImmediateMod extends Shortcut {
  
  @JSImport("memfs/lib/setImmediate", JSImport.Default)
  @js.native
  val default: TSetImmediate = js.native
  
  type TSetImmediate = js.Function2[
    /* callback */ js.Function1[/* repeated */ Any, Unit], 
    /* args */ js.UndefOr[Any], 
    Unit
  ]
  
  type _To = TSetImmediate
  
  /* This means you don't have to write `default`, but can instead just say `libSetImmediateMod.foo` */
  override def _to: TSetImmediate = default
}
