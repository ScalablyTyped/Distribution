package typings.mergeRefs

import typings.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("merge-refs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](refs: Ref[T]*): js.Function1[/* instance */ T, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(refs.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* instance */ T, Unit]]
}
