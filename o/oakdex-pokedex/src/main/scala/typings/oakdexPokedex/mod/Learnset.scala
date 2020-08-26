package typings.oakdexPokedex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Learnset extends js.Object {
  var egg_move: js.UndefOr[Boolean] = js.native
  var level: js.UndefOr[Double] = js.native
  var move: String = js.native
  var tm: js.UndefOr[String] = js.native
  var variations: js.UndefOr[js.Array[String]] = js.native
}

object Learnset {
  @scala.inline
  def apply(move: String): Learnset = {
    val __obj = js.Dynamic.literal(move = move.asInstanceOf[js.Any])
    __obj.asInstanceOf[Learnset]
  }
  @scala.inline
  implicit class LearnsetOps[Self <: Learnset] (val x: Self) extends AnyVal {
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
    def setMove(value: String): Self = this.set("move", value.asInstanceOf[js.Any])
    @scala.inline
    def setEgg_move(value: Boolean): Self = this.set("egg_move", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEgg_move: Self = this.set("egg_move", js.undefined)
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    @scala.inline
    def setTm(value: String): Self = this.set("tm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTm: Self = this.set("tm", js.undefined)
    @scala.inline
    def setVariationsVarargs(value: String*): Self = this.set("variations", js.Array(value :_*))
    @scala.inline
    def setVariations(value: js.Array[String]): Self = this.set("variations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariations: Self = this.set("variations", js.undefined)
  }
  
}

