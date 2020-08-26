package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.DateEmail
import typings.octokitTypes.anon.Payload
import typings.octokitTypes.anon.ShaType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitCreateTagResponseData extends js.Object {
  var message: String = js.native
  var node_id: String = js.native
  var `object`: ShaType = js.native
  var sha: String = js.native
  var tag: String = js.native
  var tagger: DateEmail = js.native
  var url: String = js.native
  var verification: Payload = js.native
}

object GitCreateTagResponseData {
  @scala.inline
  def apply(
    message: String,
    node_id: String,
    `object`: ShaType,
    sha: String,
    tag: String,
    tagger: DateEmail,
    url: String,
    verification: Payload
  ): GitCreateTagResponseData = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tagger = tagger.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verification = verification.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitCreateTagResponseData]
  }
  @scala.inline
  implicit class GitCreateTagResponseDataOps[Self <: GitCreateTagResponseData] (val x: Self) extends AnyVal {
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode_id(value: String): Self = this.set("node_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setObject(value: ShaType): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setSha(value: String): Self = this.set("sha", value.asInstanceOf[js.Any])
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagger(value: DateEmail): Self = this.set("tagger", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerification(value: Payload): Self = this.set("verification", value.asInstanceOf[js.Any])
  }
  
}

