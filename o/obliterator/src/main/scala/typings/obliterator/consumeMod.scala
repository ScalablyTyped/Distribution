package typings.obliterator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object consumeMod {
  
  @JSImport("obliterator/consume", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](iterator: js.Iterator[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(iterator.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def default[T](iterator: js.Iterator[T], steps: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(iterator.asInstanceOf[js.Any], steps.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
