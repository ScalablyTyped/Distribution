package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibNonNullableMod {
  
  @JSImport("next/dist/lib/non-nullable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def nonNullable[T](value: T): /* is std.NonNullable<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("nonNullable")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.NonNullable<T> */ Boolean]
}
