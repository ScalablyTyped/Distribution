package typings.moo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Token extends js.Object {
  /**
    * The column where the match begins, starting from 1.
    */
  var col: Double = js.native
  /**
    * The line number of the beginning of the match, starting from 1.
    */
  var line: Double = js.native
  /**
    * The number of line breaks found in the match. (Always zero if this rule has lineBreaks: false.)
    */
  var lineBreaks: Double = js.native
  /**
    * The number of bytes from the start of the buffer where the match starts.
    */
  var offset: Double = js.native
  /**
    * The complete match.
    */
  var text: String = js.native
  /**
    * The name of the group, as passed to compile.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * The match contents.
    */
  var value: String = js.native
}

object Token {
  @scala.inline
  def apply(col: Double, line: Double, lineBreaks: Double, offset: Double, text: String, value: String): Token = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], lineBreaks = lineBreaks.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  implicit class TokenOps[Self <: Token] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCol(value: Double): Self = this.set("col", value.asInstanceOf[js.Any])
    @scala.inline
    def setLine(value: Double): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineBreaks(value: Double): Self = this.set("lineBreaks", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

