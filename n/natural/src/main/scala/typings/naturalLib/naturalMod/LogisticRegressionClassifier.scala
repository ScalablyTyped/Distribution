package typings
package naturalLib.naturalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("natural", "LogisticRegressionClassifier")
@js.native
class LogisticRegressionClassifier () extends js.Object {
  var events: nodeLib.eventsMod.EventEmitter = js.native
  def addDocument(text: java.lang.String, stem: java.lang.String): scala.Unit = js.native
  def addDocument(text: js.Array[java.lang.String], stem: java.lang.String): scala.Unit = js.native
  def classify(observation: java.lang.String): java.lang.String = js.native
  def getClassifications(observation: java.lang.String): js.Array[LogisticRegressionClassifierClassification] = js.native
  def save(filename: java.lang.String, callback: LogisticRegressionClassifierCallback): scala.Unit = js.native
  def train(): scala.Unit = js.native
}

/* static members */
@JSImport("natural", "LogisticRegressionClassifier")
@js.native
object LogisticRegressionClassifier extends js.Object {
  def load(
    filename: java.lang.String,
    stemmer: naturalLib.naturalMod.Stemmer,
    callback: naturalLib.naturalMod.LogisticRegressionClassifierCallback
  ): scala.Unit = js.native
  def restore(classifier: js.Any): naturalLib.naturalMod.LogisticRegressionClassifier = js.native
  def restore(classifier: js.Any, stemmer: naturalLib.naturalMod.Stemmer): naturalLib.naturalMod.LogisticRegressionClassifier = js.native
}

