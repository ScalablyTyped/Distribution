package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ref extends js.Object {
  var ref: String
  var repo: IdName
  var sha: String
}

object Ref {
  @scala.inline
  def apply(ref: String, repo: IdName, sha: String): Ref = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ref]
  }
}

