package typings.natural.mod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BayesClassifier extends js.Object {
  
  def addDocument(text: String, stem: String): Unit = js.native
  def addDocument(text: js.Array[String], stem: String): Unit = js.native
  
  def classify(observation: String): String = js.native
  
  var events: EventEmitter = js.native
  
  def getClassifications(observation: String): js.Array[BayesClassifierClassification] = js.native
  
  def save(filename: String, callback: BayesClassifierCallback): Unit = js.native
  
  def train(): Unit = js.native
}
