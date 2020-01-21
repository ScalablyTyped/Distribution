package typings.nextServer.getPageFilesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildManifest extends js.Object {
  var devFiles: js.Array[String]
  var pages: StringDictionary[js.Array[String]]
}

object BuildManifest {
  @scala.inline
  def apply(devFiles: js.Array[String], pages: StringDictionary[js.Array[String]]): BuildManifest = {
    val __obj = js.Dynamic.literal(devFiles = devFiles.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BuildManifest]
  }
}

