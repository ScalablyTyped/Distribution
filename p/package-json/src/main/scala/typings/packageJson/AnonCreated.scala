package typings.packageJson

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCreated extends /* version */ StringDictionary[String] {
  val created: String
  val modified: String
}

object AnonCreated {
  @scala.inline
  def apply(created: String, modified: String, StringDictionary: /* version */ StringDictionary[String] = null): AnonCreated = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonCreated]
  }
}

