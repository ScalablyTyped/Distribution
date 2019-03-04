package typings
package naturalLib.naturalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TfIdfTerm extends js.Object {
  var term: java.lang.String
  var tfidf: scala.Double
}

object TfIdfTerm {
  @scala.inline
  def apply(term: java.lang.String, tfidf: scala.Double): TfIdfTerm = {
    val __obj = js.Dynamic.literal(term = term, tfidf = tfidf)
  
    __obj.asInstanceOf[TfIdfTerm]
  }
}

