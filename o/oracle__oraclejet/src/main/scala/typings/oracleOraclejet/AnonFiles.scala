package typings.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.std.FileList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFiles
  extends /* propName */ StringDictionary[js.Any] {
  var files: FileList
}

object AnonFiles {
  @scala.inline
  def apply(files: FileList, StringDictionary: /* propName */ StringDictionary[js.Any] = null): AnonFiles = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonFiles]
  }
}

