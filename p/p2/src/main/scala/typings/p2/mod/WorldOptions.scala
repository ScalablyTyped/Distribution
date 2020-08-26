package typings.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorldOptions extends js.Object {
  var broadphase: js.UndefOr[Broadphase] = js.native
  var gravity: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var islandSplit: js.UndefOr[Boolean] = js.native
  var solver: js.UndefOr[Solver] = js.native
}

object WorldOptions {
  @scala.inline
  def apply(): WorldOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorldOptions]
  }
  @scala.inline
  implicit class WorldOptionsOps[Self <: WorldOptions] (val x: Self) extends AnyVal {
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
    def setBroadphase(value: Broadphase): Self = this.set("broadphase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBroadphase: Self = this.set("broadphase", js.undefined)
    @scala.inline
    def setGravity(value: js.Tuple2[Double, Double]): Self = this.set("gravity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGravity: Self = this.set("gravity", js.undefined)
    @scala.inline
    def setIslandSplit(value: Boolean): Self = this.set("islandSplit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIslandSplit: Self = this.set("islandSplit", js.undefined)
    @scala.inline
    def setSolver(value: Solver): Self = this.set("solver", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSolver: Self = this.set("solver", js.undefined)
  }
  
}

