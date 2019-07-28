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
    val __obj = js.Dynamic.literal(byline = byline, content = content, dir = dir, excerpt = excerpt, length = length, textContent = textContent, title = title)
  
    __obj.asInstanceOf[ParseResult]
  }
}

