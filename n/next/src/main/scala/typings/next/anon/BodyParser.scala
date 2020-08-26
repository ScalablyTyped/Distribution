package typings.next.anon

import typings.next.nextBooleans.`false`
import typings.next.nextBooleans.`true`
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
  /**
    * Flag to disable warning "API page resolved
    * without sending a response", due to explicitly
    * using an external API resolver, like express
    */
  var externalResolver: js.UndefOr[`true`] = js.native
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
    @scala.inline
    def setExternalResolver(value: `true`): Self = this.set("externalResolver", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalResolver: Self = this.set("externalResolver", js.undefined)
  }
  
}

