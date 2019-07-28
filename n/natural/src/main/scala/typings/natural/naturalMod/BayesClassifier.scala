package typings.natural.naturalMod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("natural", "BayesClassifier")
@js.native
class BayesClassifier () extends js.Object {
  var events: EventEmitter = js.native
  def addDocument(text: String, stem: String): Unit = js.native
  def addDocument(text: js.Array[String], stem: String): Unit = js.native
  def classify(observation: String): String = js.native
  def getClassifications(observation: String): js.Array[BayesClassifierClassification] = js.native
  def save(filename: String, callback: BayesClassifierCallback): Unit = js.native
  def train(): Unit = js.native
}

/* static members */
@JSImport("natural", "BayesClassifier")
@js.native
object BayesClassifier extends js.Object {
  def load(filename: String, stemmer: Stemmer, callback: BayesClassifierCallback): Unit = js.native
  def restore(classifier: js.Any): BayesClassifier = js.native
  def restore(classifier: js.Any, stemmer: Stemmer): BayesClassifier = js.native
}

