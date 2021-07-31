package typings.mobxReactLite

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object finalizationRegistryWrapperMod {
  
  @JSImport("mobx-react-lite/dist/utils/FinalizationRegistryWrapper", "FinalizationRegistry")
  @js.native
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
  trait FinalizationRegistryType[T] extends StObject {
    
    def register(`object`: js.Object, cleanupToken: T): Unit = js.native
    def register(`object`: js.Object, cleanupToken: T, unregisterToken: js.Object): Unit = js.native
    
    def unregister(unregisterToken: js.Object): Unit = js.native
  }
}
