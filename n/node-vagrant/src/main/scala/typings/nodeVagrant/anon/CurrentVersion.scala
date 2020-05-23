package typings.nodeVagrant.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrentVersion extends js.Object {
  var currentVersion: String
  var latestVersion: String
  var name: String
  var status: String
}

object CurrentVersion {
  @scala.inline
  def apply(currentVersion: String, latestVersion: String, name: String, status: String): CurrentVersion = {
    val __obj = js.Dynamic.literal(currentVersion = currentVersion.asInstanceOf[js.Any], latestVersion = latestVersion.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentVersion]
  }
}

