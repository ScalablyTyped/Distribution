package typings.pathfinding.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDAStarFinderOptions extends FinderOptions {
  var timeLimit: js.UndefOr[Double] = js.native
  var trackRecursion: js.UndefOr[Boolean] = js.native
}

object IDAStarFinderOptions {
  @scala.inline
  def apply(): IDAStarFinderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDAStarFinderOptions]
  }
  @scala.inline
  implicit class IDAStarFinderOptionsOps[Self <: IDAStarFinderOptions] (val x: Self) extends AnyVal {
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
    def setTimeLimit(value: Double): Self = this.set("timeLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeLimit: Self = this.set("timeLimit", js.undefined)
    @scala.inline
    def setTrackRecursion(value: Boolean): Self = this.set("trackRecursion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackRecursion: Self = this.set("trackRecursion", js.undefined)
  }
  
}

