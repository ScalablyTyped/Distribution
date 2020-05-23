package typings.packageJson.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictversion extends /* tagName */ StringDictionary[String] {
  val created: String
  val modified: String
}

object Dictversion {
  @scala.inline
  def apply(created: String, modified: String, StringDictionary: /* name */ StringDictionary[String] = null): Dictversion = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Dictversion]
  }
}

