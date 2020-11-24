package typings.memfs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("memfs/lib/setImmediate", JSImport.Namespace)
@js.native
object setImmediateMod extends js.Object {
  
  val default: TSetImmediate = js.native
  
  type TSetImmediate = js.Function2[
    /* callback */ js.Function1[/* repeated */ js.Any, Unit], 
    /* args */ js.UndefOr[js.Any], 
    Unit
  ]
}
