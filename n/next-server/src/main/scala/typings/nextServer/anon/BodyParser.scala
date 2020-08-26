package typings.nextServer.anon

import typings.nextServer.nextServerBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BodyParser extends js.Object {
  /**
    * The byte limit of the body. This is the number of bytes or any string
    * format supported by `bytes`, for example `1000`, `'500kb'` or `'3mb'`.
    */
  var bodyParser: js.UndefOr[SizeLimit | `false`] = js.native
}

object BodyParser {
  @scala.inline
  def apply(): BodyParser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BodyParser]
  }
  @scala.inline
  implicit class BodyParserOps[Self <: BodyParser] (val x: Self) extends AnyVal {
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
    def setBodyParser(value: SizeLimit | `false`): Self = this.set("bodyParser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBodyParser: Self = this.set("bodyParser", js.undefined)
  }
  
}

