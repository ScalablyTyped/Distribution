package typings.obliterator

import typings.obliterator.typesMod.IntoInterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object takeMod {
  
  @JSImport("obliterator/take", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](iterator: IntoInterator[T], n: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(iterator.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
}
