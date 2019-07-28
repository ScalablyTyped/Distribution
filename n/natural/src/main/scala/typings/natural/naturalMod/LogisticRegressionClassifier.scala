package typings.natural.naturalMod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("natural", "LogisticRegressionClassifier")
@js.native
class LogisticRegressionClassifier () extends js.Object {
  var events: EventEmitter = js.native
  def addDocument(text: String, stem: String): Unit = js.native
  def addDocument(text: js.Array[String], stem: String): Unit = js.native
  def classify(observation: String): String = js.native
  def getClassifications(observation: String): js.Array[LogisticRegressionClassifierClassification] = js.native
  def save(filename: String, callback: LogisticRegressionClassifierCallback): Unit = js.native
  def train(): Unit = js.native
}

/* static members */
@JSImport("natural", "LogisticRegressionClassifier")
@js.native
object LogisticRegressionClassifier extends js.Object {
  def load(filename: String, stemmer: Stemmer, callback: LogisticRegressionClassifierCallback): Unit = js.native
  def restore(classifier: js.Any): LogisticRegressionClassifier = js.native
  def restore(classifier: js.Any, stemmer: Stemmer): LogisticRegressionClassifier = js.native
}

