package typings.mergeObjects

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply[T /* <: js.Object */, U /* <: js.Object */](object1: T, object2: U): T & U = (^.asInstanceOf[js.Dynamic].apply(object1.asInstanceOf[js.Any], object2.asInstanceOf[js.Any])).asInstanceOf[T & U]
  
  @JSImport("merge-objects", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
