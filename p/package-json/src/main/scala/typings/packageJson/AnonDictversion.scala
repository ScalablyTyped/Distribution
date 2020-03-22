package typings.packageJson

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictversion extends /* version */ StringDictionary[String] {
  val created: String
  val modified: String
}

object AnonDictversion {
  @scala.inline
  def apply(created: String, modified: String, StringDictionary: /* version */ StringDictionary[String] = null): AnonDictversion = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonDictversion]
  }
}

