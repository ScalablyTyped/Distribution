package typings.mongodb.mod

import typings.mongodb.anon.IncludeArrayIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "AggregationCursor")
@js.native
class AggregationCursor[T] () extends Cursor[T] {
  
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/AggregationCursor.html#each */
  def each(callback: MongoCallback[AggregationCursorResult]): Unit = js.native
  
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/AggregationCursor.html#geoNear */
  def geoNear(document: js.Object): AggregationCursor[T] = js.native
  
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/AggregationCursor.html#group */
  def group[U](document: js.Object): AggregationCursor[U] = js.native
  
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/AggregationCursor.html#lookup */
  def lookup(document: js.Object): AggregationCursor[T] = js.native
  
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/AggregationCursor.html#match */
  def `match`(document: js.Object): AggregationCursor[T] = js.native
  
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/AggregationCursor.html#out */
  def out(destination: String): AggregationCursor[T] = js.native
  
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/AggregationCursor.html#project */
  def project[U](document: js.Object): AggregationCursor[U] = js.native
  
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/AggregationCursor.html#redact */
  def redact(document: js.Object): AggregationCursor[T] = js.native
  
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/AggregationCursor.html#sort */
  def sort(document: js.Object): AggregationCursor[T] = js.native
  
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/AggregationCursor.html#unwind */
  def unwind[U](field: String): AggregationCursor[U] = js.native
  def unwind[U](field: IncludeArrayIndex): AggregationCursor[U] = js.native
}
