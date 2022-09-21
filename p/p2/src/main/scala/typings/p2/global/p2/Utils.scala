package typings.p2.global.p2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("p2.Utils")
@js.native
open class Utils ()
  extends typings.p2.mod.Utils
/* static members */
object Utils {
  
  @JSGlobal("p2.Utils")
  @js.native
  val ^ : js.Any = js.native
  
  inline def appendArray[T](a: js.Array[T], b: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendArray")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def arrayRemove[T](array: js.Array[T], element: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayRemove")(array.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def defaults(options: Any, defaults: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("defaults")(options.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def extend(a: Any, b: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def shallowClone[T](obj: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowClone")(obj.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def splice[T](array: js.Array[T], index: Double, howMany: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("splice")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], howMany.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
