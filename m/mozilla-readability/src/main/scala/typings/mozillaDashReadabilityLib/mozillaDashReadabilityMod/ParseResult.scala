package typings
package mozillaDashReadabilityLib.mozillaDashReadabilityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseResult extends js.Object {
  var byline: java.lang.String
  var content: java.lang.String
  var dir: java.lang.String
  var excerpt: java.lang.String
  var length: scala.Double
  var textContent: java.lang.String
  var title: java.lang.String
}

object ParseResult {
  @scala.inline
  def apply(
    byline: java.lang.String,
    content: java.lang.String,
    dir: java.lang.String,
    excerpt: java.lang.String,
    length: scala.Double,
    textContent: java.lang.String,
    title: java.lang.String
  ): ParseResult = {
    val __obj = js.Dynamic.literal(byline = byline, content = content, dir = dir, excerpt = excerpt, length = length, textContent = textContent, title = title)
  
    __obj.asInstanceOf[ParseResult]
  }
}

