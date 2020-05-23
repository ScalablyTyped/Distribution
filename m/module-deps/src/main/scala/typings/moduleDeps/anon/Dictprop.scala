package typings.moduleDeps.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictprop
  extends /* prop */ StringDictionary[js.Any] {
  var filename: String
  var id: String
}

object Dictprop {
  @scala.inline
  def apply(filename: String, id: String, StringDictionary: /* name */ StringDictionary[js.Any] = null): Dictprop = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Dictprop]
  }
}

