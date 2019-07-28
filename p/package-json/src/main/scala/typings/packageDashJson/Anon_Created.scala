package typings.packageDashJson

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Created extends /* version */ StringDictionary[String] {
  val created: String
  val modified: String
}

object Anon_Created {
  @scala.inline
  def apply(created: String, modified: String, StringDictionary: /* version */ StringDictionary[String] = null): Anon_Created = {
    val __obj = js.Dynamic.literal(created = created, modified = modified)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Created]
  }
}

