package typings.memfs.anon

import typings.memfs.memfsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bigint extends js.Object {
  var bigint: `false` = js.native
}

object Bigint {
  @scala.inline
  def apply(bigint: `false`): Bigint = {
    val __obj = js.Dynamic.literal(bigint = bigint.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bigint]
  }
  @scala.inline
  implicit class BigintOps[Self <: Bigint] (val x: Self) extends AnyVal {
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
    def setBigint(value: `false`): Self = this.set("bigint", value.asInstanceOf[js.Any])
  }
  
}

