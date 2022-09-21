package typings.micromarkUtilChunked

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("micromark-util-chunked", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def push[T /* <: Any */](list: js.Array[T], items: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("push")(list.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def splice[T /* <: Any */](list: js.Array[T], start: Double, remove: Double, items: js.Array[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("splice")(list.asInstanceOf[js.Any], start.asInstanceOf[js.Any], remove.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
