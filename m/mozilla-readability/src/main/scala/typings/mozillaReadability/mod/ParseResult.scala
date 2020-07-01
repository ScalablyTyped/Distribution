package typings.mozillaReadability.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseResult extends js.Object {
  /** Author metadata */
  var byline: String
  /** HTML string of processed article content */
  var content: String
  /** Content direction */
  var dir: String
  /** Article description, or short excerpt from the content */
  var excerpt: String
  /** Length of an article, in characters */
  var length: Double
  /** Article site name */
  var siteName: String
  /** non-HTML version of `content`  */
  var textContent: String
  /** Article title */
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
    siteName: String,
    textContent: String,
    title: String
  ): ParseResult = {
    val __obj = js.Dynamic.literal(byline = byline.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], excerpt = excerpt.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], siteName = siteName.asInstanceOf[js.Any], textContent = textContent.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseResult]
  }
}

