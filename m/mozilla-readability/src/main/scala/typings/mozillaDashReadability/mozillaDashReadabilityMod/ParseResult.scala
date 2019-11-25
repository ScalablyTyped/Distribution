package typings.mozillaDashReadability.mozillaDashReadabilityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseResult extends js.Object {
  var byline: String
  var content: String
  var dir: String
  var excerpt: String
  var length: Double
  var textContent: String
  var title: String
}

object ParseResult {
  @scala.inline
  def apply(
    byline: String,
    content: String,
    dir: String,
    excerpt: String,
    length: Double,
    textContent: String,
    title: String
  ): ParseResult = {
    val __obj = js.Dynamic.literal(byline = byline.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], excerpt = excerpt.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], textContent = textContent.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ParseResult]
  }
}

