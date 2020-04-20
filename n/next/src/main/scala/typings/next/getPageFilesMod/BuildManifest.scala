package typings.next.getPageFilesMod

import typings.next.AnonDictpage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildManifest extends js.Object {
  var devFiles: js.Array[String]
  var lowPriorityFiles: js.Array[String]
  var pages: AnonDictpage
}

object BuildManifest {
  @scala.inline
  def apply(devFiles: js.Array[String], lowPriorityFiles: js.Array[String], pages: AnonDictpage): BuildManifest = {
    val __obj = js.Dynamic.literal(devFiles = devFiles.asInstanceOf[js.Any], lowPriorityFiles = lowPriorityFiles.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildManifest]
  }
}

