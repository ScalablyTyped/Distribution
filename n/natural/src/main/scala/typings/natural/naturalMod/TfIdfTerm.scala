package typings.natural.naturalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TfIdfTerm extends js.Object {
  var term: String
  var tfidf: Double
}

object TfIdfTerm {
  @scala.inline
  def apply(term: String, tfidf: Double): TfIdfTerm = {
    val __obj = js.Dynamic.literal(term = term, tfidf = tfidf)
  
    __obj.asInstanceOf[TfIdfTerm]
  }
}

