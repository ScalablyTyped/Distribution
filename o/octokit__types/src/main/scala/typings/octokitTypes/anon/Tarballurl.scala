package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tarballurl extends js.Object {
  var commit: Sha
  var name: String
  var tarball_url: String
  var zipball_url: String
}

object Tarballurl {
  @scala.inline
  def apply(commit: Sha, name: String, tarball_url: String, zipball_url: String): Tarballurl = {
    val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tarball_url = tarball_url.asInstanceOf[js.Any], zipball_url = zipball_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tarballurl]
  }
}

