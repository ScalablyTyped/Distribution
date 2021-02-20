package typings.memfs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setTimeoutUnrefMod {
  
  /**
    * `setTimeoutUnref` is just like `setTimeout`,
    * only in Node's environment it will "unref" its macro task.
    */
  @JSImport("memfs/lib/setTimeoutUnref", JSImport.Default)
  @js.native
  def default(callback: js.Any): js.Object = js.native
  @JSImport("memfs/lib/setTimeoutUnref", JSImport.Default)
  @js.native
  def default(callback: js.Any, time: js.UndefOr[scala.Nothing], args: js.Any): js.Object = js.native
  @JSImport("memfs/lib/setTimeoutUnref", JSImport.Default)
  @js.native
  def default(callback: js.Any, time: js.Any): js.Object = js.native
  @JSImport("memfs/lib/setTimeoutUnref", JSImport.Default)
  @js.native
  def default(callback: js.Any, time: js.Any, args: js.Any): js.Object = js.native
  
  type TSetTimeout = js.Function3[
    /* callback */ js.Function1[/* repeated */ js.Any, Unit], 
    /* time */ js.UndefOr[Double], 
    /* args */ js.UndefOr[js.Array[js.Any]], 
    js.Any
  ]
}
