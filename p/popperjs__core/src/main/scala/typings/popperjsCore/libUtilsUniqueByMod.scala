package typings.popperjsCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsUniqueByMod {
  
  @JSImport("@popperjs/core/lib/utils/uniqueBy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](arr: js.Array[T], fn: js.Function1[/* arg0 */ T, Any]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(arr.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
}
