package typings.pLock

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildMod {
  
  @JSImport("p-lock/build", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getLock(): js.Function1[/* key */ js.UndefOr[String], js.Promise[ReleaseFn]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLock")().asInstanceOf[js.Function1[/* key */ js.UndefOr[String], js.Promise[ReleaseFn]]]
  inline def getLock(options: LockOptions): js.Function1[/* key */ js.UndefOr[String], js.Promise[ReleaseFn]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLock")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* key */ js.UndefOr[String], js.Promise[ReleaseFn]]]
  
  type Lock = js.Function1[/* key */ js.UndefOr[String], js.Promise[ReleaseFn]]
  
  trait LockOptions extends StObject {
    
    /**
      * When aquiring a lock for some key, replace first promise in line rather than adding to queue.
      * Replaced promise will be rejected.
      * Default: `false`
      */
    var replace: js.UndefOr[Boolean] = js.undefined
  }
  object LockOptions {
    
    inline def apply(): LockOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LockOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LockOptions] (val x: Self) extends AnyVal {
      
      inline def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
    }
  }
  
  type ReleaseFn = js.Function0[Unit]
}
