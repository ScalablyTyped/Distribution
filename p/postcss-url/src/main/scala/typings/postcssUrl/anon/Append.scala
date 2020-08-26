package typings.postcssUrl.anon

import typings.node.Buffer
import typings.postcssUrl.mod.CustomHashFunction
import typings.postcssUrl.postcssUrlStrings.xxhash32
import typings.postcssUrl.postcssUrlStrings.xxhash64
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Append extends js.Object {
  /**
    * Append the original filename in resulting filename.
    */
  var append: js.UndefOr[Boolean] = js.native
  /**
    * Hashing method or custom function.
    */
  var method: js.UndefOr[xxhash32 | xxhash64 | CustomHashFunction] = js.native
  /**
    * Shrink hast to certain length.
    */
  var shrink: js.UndefOr[Double] = js.native
}

object Append {
  @scala.inline
  def apply(): Append = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Append]
  }
  @scala.inline
  implicit class AppendOps[Self <: Append] (val x: Self) extends AnyVal {
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
    def setAppend(value: Boolean): Self = this.set("append", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppend: Self = this.set("append", js.undefined)
    @scala.inline
    def setMethodFunction1(value: /* file */ Buffer => String): Self = this.set("method", js.Any.fromFunction1(value))
    @scala.inline
    def setMethod(value: xxhash32 | xxhash64 | CustomHashFunction): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setShrink(value: Double): Self = this.set("shrink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShrink: Self = this.set("shrink", js.undefined)
  }
  
}

