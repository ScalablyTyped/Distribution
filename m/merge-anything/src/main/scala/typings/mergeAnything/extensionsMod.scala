package typings.mergeAnything

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extensionsMod {
  
  @JSImport("merge-anything/dist/types/extensions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def concatArrays(originVal: Any, newVal: Any): Any | js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("concatArrays")(originVal.asInstanceOf[js.Any], newVal.asInstanceOf[js.Any])).asInstanceOf[Any | js.Array[Any]]
}
