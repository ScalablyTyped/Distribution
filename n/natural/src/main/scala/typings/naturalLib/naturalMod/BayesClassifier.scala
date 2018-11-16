package typings
package naturalLib.naturalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("natural", "BayesClassifier")
@js.native
class BayesClassifier () extends js.Object {
  var events: nodeLib.eventsMod.EventEmitter = js.native
  def addDocument(text: java.lang.String, stem: java.lang.String): scala.Unit = js.native
  def addDocument(text: js.Array[java.lang.String], stem: java.lang.String): scala.Unit = js.native
  def classify(observation: java.lang.String): java.lang.String = js.native
  def getClassifications(observation: java.lang.String): js.Array[java.lang.String] = js.native
  def save(filename: java.lang.String, callback: BayesClassifierCallback): scala.Unit = js.native
  def train(): scala.Unit = js.native
}

@JSImport("natural", "BayesClassifier")
@js.native
object BayesClassifier extends js.Object {
  def load(
    filename: java.lang.String,
    stemmer: naturalLib.naturalMod.Stemmer,
    callback: naturalLib.naturalMod.BayesClassifierCallback
  ): scala.Unit = js.native
  def restore(classifier: js.Any): naturalLib.naturalMod.BayesClassifier = js.native
  def restore(classifier: js.Any, stemmer: naturalLib.naturalMod.Stemmer): naturalLib.naturalMod.BayesClassifier = js.native
}

