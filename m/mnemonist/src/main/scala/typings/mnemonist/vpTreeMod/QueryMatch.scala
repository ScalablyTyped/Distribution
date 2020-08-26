package typings.mnemonist.vpTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryMatch[T] extends js.Object {
  var distance: Double = js.native
  var item: T = js.native
}

object QueryMatch {
  @scala.inline
  def apply[T](distance: Double, item: T): QueryMatch[T] = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryMatch[T]]
  }
  @scala.inline
  implicit class QueryMatchOps[Self <: QueryMatch[_], T] (val x: Self with QueryMatch[T]) extends AnyVal {
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
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: T): Self = this.set("item", value.asInstanceOf[js.Any])
  }
  
}

