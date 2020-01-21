package typings.mockjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Mockjs.Random - Image
// see https://github.com/nuysoft/Mock/wiki/Image
/* Rewritten from type alias, can be one of: 
  - typings.mockjs.mockjsStrings.png
  - typings.mockjs.mockjsStrings.gif
  - typings.mockjs.mockjsStrings.jpg
*/
trait RandomImageFormatString extends js.Object

object RandomImageFormatString {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def gif: typings.mockjs.mockjsStrings.gif = this.cast("gif")
  @scala.inline
  def jpg: typings.mockjs.mockjsStrings.jpg = this.cast("jpg")
  @scala.inline
  def png: typings.mockjs.mockjsStrings.png = this.cast("png")
}

