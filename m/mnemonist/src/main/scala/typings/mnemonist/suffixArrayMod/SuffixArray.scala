package typings.mnemonist.suffixArrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuffixArray extends js.Object {
  // Members
  var array: js.Array[Double] = js.native
  var length: Double = js.native
  var string: String | js.Array[String] = js.native
  def inspect(): js.Any = js.native
  def toJSON(): js.Array[Double] = js.native
}

object SuffixArray {
  @scala.inline
  def apply(
    array: js.Array[Double],
    inspect: () => js.Any,
    length: Double,
    string: String | js.Array[String],
    toJSON: () => js.Array[Double]
  ): SuffixArray = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], inspect = js.Any.fromFunction0(inspect), length = length.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[SuffixArray]
  }
  @scala.inline
  implicit class SuffixArrayOps[Self <: SuffixArray] (val x: Self) extends AnyVal {
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
    def setArrayVarargs(value: Double*): Self = this.set("array", js.Array(value :_*))
    @scala.inline
    def setArray(value: js.Array[Double]): Self = this.set("array", value.asInstanceOf[js.Any])
    @scala.inline
    def setInspect(value: () => js.Any): Self = this.set("inspect", js.Any.fromFunction0(value))
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setStringVarargs(value: String*): Self = this.set("string", js.Array(value :_*))
    @scala.inline
    def setString(value: String | js.Array[String]): Self = this.set("string", value.asInstanceOf[js.Any])
    @scala.inline
    def setToJSON(value: () => js.Array[Double]): Self = this.set("toJSON", js.Any.fromFunction0(value))
  }
  
}

