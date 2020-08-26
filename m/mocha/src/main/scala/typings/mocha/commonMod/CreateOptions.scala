package typings.mocha.commonMod

import typings.mocha.Mocha.Suite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateOptions extends js.Object {
  /** Filepath where this Suite resides */
  var file: js.UndefOr[String] = js.native
  /** Suite function */
  var fn: js.UndefOr[js.ThisFunction0[/* this */ Suite, Unit]] = js.native
  /** Is suite exclusive? */
  var isOnly: js.UndefOr[Boolean] = js.native
  /** Is suite pending? */
  var pending: js.UndefOr[Boolean] = js.native
  /** Title of suite */
  var title: String = js.native
}

object CreateOptions {
  @scala.inline
  def apply(title: String): CreateOptions = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOptions]
  }
  @scala.inline
  implicit class CreateOptionsOps[Self <: CreateOptions] (val x: Self) extends AnyVal {
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
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
    @scala.inline
    def setFn(value: js.ThisFunction0[/* this */ Suite, Unit]): Self = this.set("fn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFn: Self = this.set("fn", js.undefined)
    @scala.inline
    def setIsOnly(value: Boolean): Self = this.set("isOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsOnly: Self = this.set("isOnly", js.undefined)
    @scala.inline
    def setPending(value: Boolean): Self = this.set("pending", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePending: Self = this.set("pending", js.undefined)
  }
  
}

