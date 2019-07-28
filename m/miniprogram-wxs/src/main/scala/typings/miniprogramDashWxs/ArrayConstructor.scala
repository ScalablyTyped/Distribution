package typings.miniprogramDashWxs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayConstructor
  extends Instantiable0[Array[js.Any]]
     with Instantiable1[
      (/* arrayLength */ Double) | (/* items (repeated) */ js.Object), 
      Array[js.Any | js.Object]
    ] {
  def apply(): Array[_] = js.native
  def apply(arrayLength: Double): Array[_] = js.native
  def apply[T](items: T*): Array[T] = js.native
  def isArray(arg: js.Any): /* is miniprogram-wxs.Array<any> */ scala.Boolean = js.native
}

