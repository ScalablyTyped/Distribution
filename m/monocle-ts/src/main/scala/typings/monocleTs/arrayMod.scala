package typings.monocleTs

import typings.monocleTs.mod.Index_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayMod {
  
  @JSImport("monocle-ts/lib/Index/Array", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def indexArray[A](): Index_[js.Array[A], Double, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("indexArray")().asInstanceOf[Index_[js.Array[A], Double, A]]
}
