package typings.objectMapper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("object-mapper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def merge(srcObject: js.Object, mapObject: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(srcObject.asInstanceOf[js.Any], mapObject.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  @scala.inline
  def merge[T](srcObject: js.Object, destinationObject: T, mapObject: js.Object): T = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(srcObject.asInstanceOf[js.Any], destinationObject.asInstanceOf[js.Any], mapObject.asInstanceOf[js.Any])).asInstanceOf[T]
}
