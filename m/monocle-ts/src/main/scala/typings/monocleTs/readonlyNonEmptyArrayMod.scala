package typings.monocleTs

import typings.monocleTs.mod.Index_
import typings.std.ReadonlyArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readonlyNonEmptyArrayMod {
  
  @JSImport("monocle-ts/lib/Index/ReadonlyNonEmptyArray", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def indexReadonlyNonEmptyArray[A](): Index_[ReadonlyNonEmptyArray[A], Double, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("indexReadonlyNonEmptyArray")().asInstanceOf[Index_[ReadonlyNonEmptyArray[A], Double, A]]
  
  @js.native
  trait ReadonlyNonEmptyArray[A]
    extends StObject
       with ReadonlyArray[A] {
    
    val `0`: A = js.native
  }
}
