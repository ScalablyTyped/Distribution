package typings.natural.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TfIdfTerm extends js.Object {
  var term: String = js.native
  var tfidf: Double = js.native
}

object TfIdfTerm {
  @scala.inline
  def apply(term: String, tfidf: Double): TfIdfTerm = {
    val __obj = js.Dynamic.literal(term = term.asInstanceOf[js.Any], tfidf = tfidf.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfIdfTerm]
  }
  @scala.inline
  implicit class TfIdfTermOps[Self <: TfIdfTerm] (val x: Self) extends AnyVal {
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
    def setTerm(value: String): Self = this.set("term", value.asInstanceOf[js.Any])
    @scala.inline
    def setTfidf(value: Double): Self = this.set("tfidf", value.asInstanceOf[js.Any])
  }
  
}

