package typings.next.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HasStaticFallback extends js.Object {
  var hasStaticFallback: Boolean = js.native
  var staticPaths: js.UndefOr[js.Array[String]] = js.native
}

object HasStaticFallback {
  @scala.inline
  def apply(hasStaticFallback: Boolean): HasStaticFallback = {
    val __obj = js.Dynamic.literal(hasStaticFallback = hasStaticFallback.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasStaticFallback]
  }
  @scala.inline
  implicit class HasStaticFallbackOps[Self <: HasStaticFallback] (val x: Self) extends AnyVal {
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
    def setHasStaticFallback(value: Boolean): Self = this.set("hasStaticFallback", value.asInstanceOf[js.Any])
    @scala.inline
    def setStaticPathsVarargs(value: String*): Self = this.set("staticPaths", js.Array(value :_*))
    @scala.inline
    def setStaticPaths(value: js.Array[String]): Self = this.set("staticPaths", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStaticPaths: Self = this.set("staticPaths", js.undefined)
  }
  
}

