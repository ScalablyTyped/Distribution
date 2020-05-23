package typings.packageJson.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistTags extends /* tagName */ StringDictionary[String] {
  val latest: String
}

object DistTags {
  @scala.inline
  def apply(latest: String, StringDictionary: /* name */ StringDictionary[String] = null): DistTags = {
    val __obj = js.Dynamic.literal(latest = latest.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[DistTags]
  }
}

