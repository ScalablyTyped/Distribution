package typings.natural.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TfIdf extends StObject {
  
  def addDocument(document: String): Unit = js.native
  def addDocument(document: String, key: String): Unit = js.native
  def addDocument(document: String, key: String, restoreCache: Boolean): Unit = js.native
  def addDocument(document: String, key: Unit, restoreCache: Boolean): Unit = js.native
  def addDocument(document: js.Array[String]): Unit = js.native
  def addDocument(document: js.Array[String], key: String): Unit = js.native
  def addDocument(document: js.Array[String], key: String, restoreCache: Boolean): Unit = js.native
  def addDocument(document: js.Array[String], key: Unit, restoreCache: Boolean): Unit = js.native
  
  def addFileSync(path: String): Unit = js.native
  def addFileSync(path: String, encoding: String): Unit = js.native
  def addFileSync(path: String, encoding: String, key: String): Unit = js.native
  def addFileSync(path: String, encoding: String, key: String, restoreCache: Boolean): Unit = js.native
  def addFileSync(path: String, encoding: String, key: Unit, restoreCache: Boolean): Unit = js.native
  def addFileSync(path: String, encoding: Unit, key: String): Unit = js.native
  def addFileSync(path: String, encoding: Unit, key: String, restoreCache: Boolean): Unit = js.native
  def addFileSync(path: String, encoding: Unit, key: Unit, restoreCache: Boolean): Unit = js.native
  
  def listTerms(d: Double): js.Array[TfIdfTerm] = js.native
  
  def tfidf(terms: String, d: Double): Unit = js.native
  
  def tfidfs(terms: String, callback: TfIdfCallback): Unit = js.native
  def tfidfs(terms: js.Array[String], callback: TfIdfCallback): Unit = js.native
}
