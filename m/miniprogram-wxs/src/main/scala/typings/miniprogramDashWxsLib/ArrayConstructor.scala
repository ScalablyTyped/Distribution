package typings
package miniprogramDashWxsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayConstructor
  extends org.scalablytyped.runtime.Instantiable0[Array[js.Any]]
     with org.scalablytyped.runtime.Instantiable1[
      (/* arrayLength */ scala.Double) | (/* items (repeated) */ js.Object), 
      Array[js.Any | js.Object]
    ] {
  def apply(): Array[_] = js.native
  def apply(arrayLength: scala.Double): Array[_] = js.native
  def apply[T](items: T*): Array[T] = js.native
  def isArray(arg: js.Any): /* is miniprogram-wxs.Array<any> */ scala.Boolean = js.native
}

