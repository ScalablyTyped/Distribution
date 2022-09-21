package typings.negativeArray

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("negative-array", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: js.Array[Any] */](array: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(array.asInstanceOf[js.Any]).asInstanceOf[T]
}
