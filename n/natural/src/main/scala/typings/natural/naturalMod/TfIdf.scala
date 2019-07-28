package typings.natural.naturalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("natural", "TfIdf")
@js.native
class TfIdf () extends js.Object {
  def this(deserialized: js.Any) = this()
  def addDocument(document: String): Unit = js.native
  def addDocument(document: String, key: String): Unit = js.native
  def addDocument(document: String, key: String, restoreCache: Boolean): Unit = js.native
  def addDocument(document: js.Array[String]): Unit = js.native
  def addDocument(document: js.Array[String], key: String): Unit = js.native
  def addDocument(document: js.Array[String], key: String, restoreCache: Boolean): Unit = js.native
  def addFileSync(path: String): Unit = js.native
  def addFileSync(path: String, encoding: String): Unit = js.native
  def addFileSync(path: String, encoding: String, key: String): Unit = js.native
  def addFileSync(path: String, encoding: String, key: String, restoreCache: Boolean): Unit = js.native
  def listTerms(d: Double): js.Array[TfIdfTerm] = js.native
  def tfidf(terms: String, d: Double): Unit = js.native
  def tfidfs(terms: String, callback: TfIdfCallback): Unit = js.native
  def tfidfs(terms: js.Array[String], callback: TfIdfCallback): Unit = js.native
}

