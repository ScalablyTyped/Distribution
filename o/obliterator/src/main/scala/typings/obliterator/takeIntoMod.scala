package typings.obliterator

import org.scalablytyped.runtime.Instantiable1
import typings.obliterator.typesMod.IntoInterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object takeIntoMod {
  
  @JSImport("obliterator/take-into", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](
    ArrayClass: Instantiable1[/* arrayLength */ Double, js.Array[js.Object]],
    iterator: IntoInterator[T],
    n: Double
  ): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ArrayClass.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
}
