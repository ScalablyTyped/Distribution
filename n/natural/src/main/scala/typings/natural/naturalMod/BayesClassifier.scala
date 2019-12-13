package typings.natural.naturalMod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BayesClassifier extends js.Object {
  var events: EventEmitter = js.native
  def addDocument(text: String, stem: String): Unit = js.native
  def addDocument(text: js.Array[String], stem: String): Unit = js.native
  def classify(observation: String): String = js.native
  def getClassifications(observation: String): js.Array[BayesClassifierClassification] = js.native
  def save(filename: String, callback: BayesClassifierCallback): Unit = js.native
  def train(): Unit = js.native
}

