package typings.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("p2", "Utils")
@js.native
class Utils () extends StObject
/* static members */
object Utils {
  
  @JSImport("p2", "Utils")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def appendArray[T](a: js.Array[T], b: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendArray")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def arrayRemove[T](array: js.Array[T], element: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayRemove")(array.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def defaults(options: js.Any, defaults: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("defaults")(options.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def extend(a: js.Any, b: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def shallowClone[T](obj: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowClone")(obj.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def splice[T](array: js.Array[T], index: Double, howMany: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("splice")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], howMany.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
