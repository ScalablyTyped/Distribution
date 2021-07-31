package typings.miniprogramWxs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayConstructor
  extends StObject
     with Instantiable0[Array[js.Any]]
     with Instantiable1[
      (/* arrayLength */ Double) | (/* items (repeated) */ js.Object), 
      Array[js.Any | js.Object]
    ] {
  
  def apply(): Array[js.Any] = js.native
  def apply(arrayLength: Double): Array[js.Any] = js.native
  def apply[T](items: T*): Array[T] = js.native
  
  def isArray(arg: js.Any): /* is miniprogram-wxs.Array<any> */ scala.Boolean = js.native
}
