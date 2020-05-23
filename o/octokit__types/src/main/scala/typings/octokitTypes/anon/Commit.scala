package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Commit extends js.Object {
  var commit: Sha
  var name: String
  var `protected`: Boolean
  var protection: Enabled
  var protection_url: String
}

object Commit {
  @scala.inline
  def apply(commit: Sha, name: String, `protected`: Boolean, protection: Enabled, protection_url: String): Commit = {
    val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], protection = protection.asInstanceOf[js.Any], protection_url = protection_url.asInstanceOf[js.Any])
    __obj.updateDynamic("protected")(`protected`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commit]
  }
}

