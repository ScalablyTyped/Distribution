package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import typings.std.FileList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Files
  extends /* key */ StringDictionary[js.Any] {
  var files: FileList
}

object Files {
  @scala.inline
  def apply(files: FileList, StringDictionary: /* name */ StringDictionary[js.Any] = null): Files = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Files]
  }
}

