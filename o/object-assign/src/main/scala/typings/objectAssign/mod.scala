package typings.objectAssign

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(target: Any, sources: Any*): Any = ^.asInstanceOf[js.Dynamic].apply(scala.List(target.asInstanceOf[js.Any]).`++`(sources.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
  inline def apply[T, U](target: T, source: U): T & U = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T & U]
  inline def apply[T, U, V](target: T, source1: U, source2: V): T & U & V = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], source1.asInstanceOf[js.Any], source2.asInstanceOf[js.Any])).asInstanceOf[T & U & V]
  inline def apply[T, U, V, W](target: T, source1: U, source2: V, source3: W): T & U & V & W = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], source1.asInstanceOf[js.Any], source2.asInstanceOf[js.Any], source3.asInstanceOf[js.Any])).asInstanceOf[T & U & V & W]
  inline def apply[T, U, V, W, Q](target: T, source1: U, source2: V, source3: W, source4: Q): T & U & V & W & Q = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], source1.asInstanceOf[js.Any], source2.asInstanceOf[js.Any], source3.asInstanceOf[js.Any], source4.asInstanceOf[js.Any])).asInstanceOf[T & U & V & W & Q]
  inline def apply[T, U, V, W, Q, R](target: T, source1: U, source2: V, source3: W, source4: Q, source5: R): T & U & V & W & Q & R = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], source1.asInstanceOf[js.Any], source2.asInstanceOf[js.Any], source3.asInstanceOf[js.Any], source4.asInstanceOf[js.Any], source5.asInstanceOf[js.Any])).asInstanceOf[T & U & V & W & Q & R]
  
  @JSImport("object-assign", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
