package typings.postcssSelectorParser.mod

import org.scalablytyped.runtime.StringDictionary
import typings.postcssSelectorParser.anon.PartialSpaceAround
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Spaces
  extends SpaceAround
     with /* spaceType */ StringDictionary[js.UndefOr[String | PartialSpaceAround]]

object Spaces {
  @scala.inline
  def apply(
    after: String,
    before: String,
    StringDictionary: /* spaceType */ StringDictionary[js.UndefOr[String | PartialSpaceAround]] = null
  ): Spaces = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Spaces]
  }
}

