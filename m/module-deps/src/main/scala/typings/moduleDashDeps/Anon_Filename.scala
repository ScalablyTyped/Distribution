package typings.moduleDashDeps

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Filename
  extends /* prop */ StringDictionary[js.Any] {
  var filename: String
  var id: String
}

object Anon_Filename {
  @scala.inline
  def apply(filename: String, id: String, StringDictionary: /* prop */ StringDictionary[js.Any] = null): Anon_Filename = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Filename]
  }
}

