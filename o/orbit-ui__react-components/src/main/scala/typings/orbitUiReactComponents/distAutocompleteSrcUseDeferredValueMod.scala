package typings.orbitUiReactComponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAutocompleteSrcUseDeferredValueMod {
  
  @JSImport("@orbit-ui/react-components/dist/autocomplete/src/useDeferredValue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useDeferredValue[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useDeferredValue")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def useDeferredValue[T](value: T, delay: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useDeferredValue")(value.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def useDeferredValue[T](value: T, delay: Double, defaultValue: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useDeferredValue")(value.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def useDeferredValue[T](value: T, delay: Unit, defaultValue: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useDeferredValue")(value.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[T]
}
