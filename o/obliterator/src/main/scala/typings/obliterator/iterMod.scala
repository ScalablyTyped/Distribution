package typings.obliterator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iterMod {
  
  @JSImport("obliterator/iter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](target: Any): js.Iterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any]).asInstanceOf[js.Iterator[T]]
}
