package typings.polylabel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("polylabel", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(polygon: js.Array[js.Array[js.Array[Double]]]): js.Array[Double] = js.native
    def apply(polygon: js.Array[js.Array[js.Array[Double]]], precision: Double): js.Array[Double] = js.native
    def apply(polygon: js.Array[js.Array[js.Array[Double]]], precision: Double, debug: Boolean): js.Array[Double] = js.native
  }
  
}

