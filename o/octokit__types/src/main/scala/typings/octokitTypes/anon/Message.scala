package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Message extends js.Object {
  var author: EmailName = js.native
  var committer: EmailName = js.native
  var message: String = js.native
  var tree: ShaUrl = js.native
  var url: String = js.native
  var verification: Payload = js.native
}

object Message {
  @scala.inline
  def apply(
    author: EmailName,
    committer: EmailName,
    message: String,
    tree: ShaUrl,
    url: String,
    verification: Payload
  ): Message = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verification = verification.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  @scala.inline
  implicit class MessageOps[Self <: Message] (val x: Self) extends AnyVal {
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
    def setAuthor(value: EmailName): Self = this.set("author", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommitter(value: EmailName): Self = this.set("committer", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setTree(value: ShaUrl): Self = this.set("tree", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerification(value: Payload): Self = this.set("verification", value.asInstanceOf[js.Any])
  }
  
}

