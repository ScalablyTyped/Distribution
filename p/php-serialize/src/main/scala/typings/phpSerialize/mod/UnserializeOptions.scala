package typings.phpSerialize.mod

import typings.phpSerialize.phpSerializeStrings.binary
import typings.phpSerialize.phpSerializeStrings.utf8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnserializeOptions extends js.Object {
  /** @default 'utf8' */
  val encoding: js.UndefOr[utf8 | binary] = js.native
  /** @default true' */
  val strict: js.UndefOr[Boolean] = js.native
}

object UnserializeOptions {
  @scala.inline
  def apply(): UnserializeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnserializeOptions]
  }
  @scala.inline
  implicit class UnserializeOptionsOps[Self <: UnserializeOptions] (val x: Self) extends AnyVal {
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
    def setEncoding(value: utf8 | binary): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
  }
  
}

