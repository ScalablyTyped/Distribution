package typings.mobxReactLite

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx-react-lite/dist/utils/FinalizationRegistryWrapper", JSImport.Namespace)
@js.native
object finalizationRegistryWrapperMod extends js.Object {
  
  val FinalizationRegistry: js.UndefOr[
    Instantiable1[
      /* cleanup */ js.Function1[
        /* import warning: RewrittenClass.unapply cls was tparam T */ /* cleanupToken */ js.Any, 
        Unit
      ], 
      FinalizationRegistryType[js.Object]
    ]
  ] = js.native
  
  @js.native
  trait FinalizationRegistryType[T] extends js.Object {
    
    def register(`object`: js.Object, cleanupToken: T): Unit = js.native
    def register(`object`: js.Object, cleanupToken: T, unregisterToken: js.Object): Unit = js.native
    
    def unregister(unregisterToken: js.Object): Unit = js.native
  }
}
