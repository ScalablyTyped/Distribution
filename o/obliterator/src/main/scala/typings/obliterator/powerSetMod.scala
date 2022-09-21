package typings.obliterator

import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object powerSetMod {
  
  @JSImport("obliterator/power-set", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](array: js.Array[T]): IterableIterator[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(array.asInstanceOf[js.Any]).asInstanceOf[IterableIterator[js.Array[T]]]
}
