package typings.nullthrows

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nullthrows", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](): T = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[T]
  inline def default[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def default[T](value: T, message: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def default[T](value: Null, message: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def default[T](value: Unit, message: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[T]
}
