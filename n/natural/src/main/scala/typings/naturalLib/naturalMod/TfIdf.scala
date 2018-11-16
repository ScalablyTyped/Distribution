package typings
package naturalLib.naturalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("natural", "TfIdf")
@js.native
class TfIdf () extends js.Object {
  def this(deserialized: js.Any) = this()
  def addDocument(document: java.lang.String): scala.Unit = js.native
  def addDocument(document: java.lang.String, key: java.lang.String): scala.Unit = js.native
  def addDocument(document: java.lang.String, key: java.lang.String, restoreCache: scala.Boolean): scala.Unit = js.native
  def addDocument(document: js.Array[java.lang.String]): scala.Unit = js.native
  def addDocument(document: js.Array[java.lang.String], key: java.lang.String): scala.Unit = js.native
  def addDocument(document: js.Array[java.lang.String], key: java.lang.String, restoreCache: scala.Boolean): scala.Unit = js.native
  def addFileSync(path: java.lang.String): scala.Unit = js.native
  def addFileSync(path: java.lang.String, encoding: java.lang.String): scala.Unit = js.native
  def addFileSync(path: java.lang.String, encoding: java.lang.String, key: java.lang.String): scala.Unit = js.native
  def addFileSync(
    path: java.lang.String,
    encoding: java.lang.String,
    key: java.lang.String,
    restoreCache: scala.Boolean
  ): scala.Unit = js.native
  def listTerms(d: scala.Double): js.Array[TfIdfTerm] = js.native
  def tfidf(terms: java.lang.String, d: scala.Double): scala.Unit = js.native
  def tfidfs(terms: java.lang.String, callback: TfIdfCallback): scala.Unit = js.native
  def tfidfs(terms: js.Array[java.lang.String], callback: TfIdfCallback): scala.Unit = js.native
}

