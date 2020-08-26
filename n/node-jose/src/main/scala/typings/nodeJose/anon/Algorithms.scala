package typings.nodeJose.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Algorithms extends js.Object {
  var algorithms: js.UndefOr[js.Array[String]] = js.native
  var allowEmbeddedKey: js.UndefOr[Boolean] = js.native
  var handlers: js.UndefOr[js.Any] = js.native
}

object Algorithms {
  @scala.inline
  def apply(): Algorithms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Algorithms]
  }
  @scala.inline
  implicit class AlgorithmsOps[Self <: Algorithms] (val x: Self) extends AnyVal {
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
    def setAlgorithmsVarargs(value: String*): Self = this.set("algorithms", js.Array(value :_*))
    @scala.inline
    def setAlgorithms(value: js.Array[String]): Self = this.set("algorithms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlgorithms: Self = this.set("algorithms", js.undefined)
    @scala.inline
    def setAllowEmbeddedKey(value: Boolean): Self = this.set("allowEmbeddedKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowEmbeddedKey: Self = this.set("allowEmbeddedKey", js.undefined)
    @scala.inline
    def setHandlers(value: js.Any): Self = this.set("handlers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandlers: Self = this.set("handlers", js.undefined)
  }
  
}

