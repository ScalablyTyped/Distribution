package typings.observ

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T](value: T): ObservableValue[T] = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[ObservableValue[T]]
  
  @JSImport("observ", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait ObservableValue[T] extends StObject {
    
    def apply(): T = js.native
    def apply(listener: js.Function1[/* value */ T, Unit]): RemoveListener = js.native
    
    def set(value: T): Unit = js.native
  }
  
  type RemoveListener = js.Function0[Unit]
}
