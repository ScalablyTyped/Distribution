package typings.ngardTinyDifference

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ngard/tiny-difference", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def difference[T](first: js.Array[T], rest: js.Array[T]*): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("difference")(scala.List(first.asInstanceOf[js.Any]).`++`(rest.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Array[T]]
}
