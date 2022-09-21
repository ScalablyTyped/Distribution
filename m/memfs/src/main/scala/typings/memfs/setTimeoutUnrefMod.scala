package typings.memfs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setTimeoutUnrefMod {
  
  @JSImport("memfs/lib/setTimeoutUnref", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * `setTimeoutUnref` is just like `setTimeout`,
    * only in Node's environment it will "unref" its macro task.
    */
  inline def default(callback: Any): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  inline def default(callback: Any, time: Any): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(callback.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def default(callback: Any, time: Any, args: Any): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(callback.asInstanceOf[js.Any], time.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def default(callback: Any, time: Unit, args: Any): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(callback.asInstanceOf[js.Any], time.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  type TSetTimeout = js.Function3[
    /* callback */ js.Function1[/* repeated */ Any, Unit], 
    /* time */ js.UndefOr[Double], 
    /* args */ js.UndefOr[js.Array[Any]], 
    Any
  ]
}
