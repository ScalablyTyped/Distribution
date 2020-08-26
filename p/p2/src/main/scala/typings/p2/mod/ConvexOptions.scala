package typings.p2.mod

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConvexOptions extends SharedShapeOptions {
  var axes: js.UndefOr[(js.Tuple2[Double, Double]) | js.Array[ArrayLike[Double]]] = js.native
  var vertices: js.UndefOr[(js.Tuple2[Double, Double]) | js.Array[ArrayLike[Double]]] = js.native
}

object ConvexOptions {
  @scala.inline
  def apply(): ConvexOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConvexOptions]
  }
  @scala.inline
  implicit class ConvexOptionsOps[Self <: ConvexOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAxesVarargs(value: ArrayLike[Double]*): Self = this.set("axes", js.Array(value :_*))
    @scala.inline
    def setAxes(value: (js.Tuple2[Double, Double]) | js.Array[ArrayLike[Double]]): Self = this.set("axes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxes: Self = this.set("axes", js.undefined)
    @scala.inline
    def setVerticesVarargs(value: ArrayLike[Double]*): Self = this.set("vertices", js.Array(value :_*))
    @scala.inline
    def setVertices(value: (js.Tuple2[Double, Double]) | js.Array[ArrayLike[Double]]): Self = this.set("vertices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVertices: Self = this.set("vertices", js.undefined)
  }
  
}

