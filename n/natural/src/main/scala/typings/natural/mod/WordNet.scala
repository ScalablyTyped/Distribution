package typings.natural.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WordNet extends js.Object {
  def get(synsetOffset: Double, pos: String, callback: WordNetGetCallback): Unit = js.native
  def lookup(word: String, callback: WordNetLookupCallback): Unit = js.native
}

object WordNet {
  @scala.inline
  def apply(get: (Double, String, WordNetGetCallback) => Unit, lookup: (String, WordNetLookupCallback) => Unit): WordNet = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction3(get), lookup = js.Any.fromFunction2(lookup))
    __obj.asInstanceOf[WordNet]
  }
  @scala.inline
  implicit class WordNetOps[Self <: WordNet] (val x: Self) extends AnyVal {
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
    def setGet(value: (Double, String, WordNetGetCallback) => Unit): Self = this.set("get", js.Any.fromFunction3(value))
    @scala.inline
    def setLookup(value: (String, WordNetLookupCallback) => Unit): Self = this.set("lookup", js.Any.fromFunction2(value))
  }
  
}

