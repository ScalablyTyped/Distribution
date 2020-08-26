package typings.petitDom.mod.PetitDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntrinsicProps extends js.Object {
  var content: js.UndefOr[Content | js.Array[Content]] = js.native
  var key: js.UndefOr[Key] = js.native
}

object IntrinsicProps {
  @scala.inline
  def apply(): IntrinsicProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntrinsicProps]
  }
  @scala.inline
  implicit class IntrinsicPropsOps[Self <: IntrinsicProps] (val x: Self) extends AnyVal {
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
    def setContentVarargs(value: Content*): Self = this.set("content", js.Array(value :_*))
    @scala.inline
    def setContent(value: Content | js.Array[Content]): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setKey(value: Key): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
  }
  
}

