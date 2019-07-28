package typings.orientjs.orientjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Statement[T] extends Query[T] {
  def add(property: String, value: js.Any): Statement[T] = js.native
  def addParams(key: String, value: js.Any): Statement[T] = js.native
  def addParams(value: js.Any): Statement[T] = js.native
  def and(param: js.Any): Statement[T] = js.native
  def buildStatement(): String = js.native
  def commit(): Statement[T] = js.native
  def commit(retryLimit: Double): Statement[T] = js.native
  def containsText(param: js.Any): Statement[T] = js.native
  def content(): Statement[T] = js.native
  def content(param: js.Any): Statement[T] = js.native
  def create(): Statement[T] = js.native
  def create(paramtype: String): Statement[T] = js.native
  def create(paramtype: String, paramname: String): Statement[T] = js.native
  def delete(): Statement[T] = js.native
  def delete(param: String): Statement[T] = js.native
  def delete(param: js.Array[String]): Statement[T] = js.native
  def fetch(): Statement[T] = js.native
  def fetch(param: js.Any): Statement[T] = js.native
  def from(): Statement[T] = js.native
  def from(param: String): Statement[T] = js.native
  def from(param: js.Any): Statement[T] = js.native
  def group(param: js.Any): Statement[T] = js.native
  def `if`(condition: SqlExpression, statements: Statement[T]*): Statement[T] = js.native
  def `if`(condition: SqlExpression, statements: js.Array[Statement[T]]): Statement[T] = js.native
  def increment(): Statement[T] = js.native
  def increment(property: String): Statement[T] = js.native
  def increment(property: String, value: js.Any): Statement[T] = js.native
  def insert(): Statement[T] = js.native
  def insert(param: String): Statement[T] = js.native
  def insert(param: js.Array[String]): Statement[T] = js.native
  def into(): Statement[T] = js.native
  def into(param: String): Statement[T] = js.native
  def let(name: String, value: String): Statement[T] = js.native
  def let(name: String, value: Statement[T]): Statement[T] = js.native
  def limit(value: Double): Statement[T] = js.native
  def lock(param: js.Any): Statement[T] = js.native
  def lucene(property: String, luceneQuery: String): Statement[T] = js.native
  def lucene(property: js.Any, luceneQuery: String): Statement[T] = js.native
  def near(latitudeProperty: String, longitudeProperty: String, longitude: Double): Statement[T] = js.native
  def near(latitudeProperty: String, longitudeProperty: String, longitude: Double, latitude: Double): Statement[T] = js.native
  def near(
    latitudeProperty: String,
    longitudeProperty: String,
    longitude: Double,
    latitude: Double,
    maxDistanceInKms: Double
  ): Statement[T] = js.native
  def near(latitudeProperty: String, longitudeProperty: Double, longitude: Double): Statement[T] = js.native
  def near(latitudeProperty: String, longitudeProperty: Double, longitude: Double, latitude: Double): Statement[T] = js.native
  def near(
    latitudeProperty: String,
    longitudeProperty: Double,
    longitude: Double,
    latitude: Double,
    maxDistanceInKms: Double
  ): Statement[T] = js.native
  def near(latitudeProperty: js.Any, longitudeProperty: String, longitude: Double): Statement[T] = js.native
  def near(latitudeProperty: js.Any, longitudeProperty: String, longitude: Double, latitude: Double): Statement[T] = js.native
  def near(
    latitudeProperty: js.Any,
    longitudeProperty: String,
    longitude: Double,
    latitude: Double,
    maxDistanceInKms: Double
  ): Statement[T] = js.native
  def near(latitudeProperty: js.Any, longitudeProperty: Double, longitude: Double): Statement[T] = js.native
  def near(latitudeProperty: js.Any, longitudeProperty: Double, longitude: Double, latitude: Double): Statement[T] = js.native
  def near(
    latitudeProperty: js.Any,
    longitudeProperty: Double,
    longitude: Double,
    latitude: Double,
    maxDistanceInKms: Double
  ): Statement[T] = js.native
  def offset(): Statement[T] = js.native
  def offset(value: Double): Statement[T] = js.native
  def or(param: js.Any): Statement[T] = js.native
  def order(param: js.Any): Statement[T] = js.native
  def put(property: String, keysValues: js.Any): Statement[T] = js.native
  def remove(property: String, value: js.Any): Statement[T] = js.native
  def retry(): Statement[T] = js.native
  def retry(retryLimit: Double): Statement[T] = js.native
  def `return`(value: SqlExpression): Statement[T] = js.native
  def rollback(): Statement[T] = js.native
  def rollback(param: js.Any): Statement[T] = js.native
  def select(): Statement[T] = js.native
  def select(param: String): Statement[T] = js.native
  def select(param: js.Array[String]): Statement[T] = js.native
  def set(): Statement[T] = js.native
  def set(param: js.Any): Statement[T] = js.native
  def skip(value: Double): Statement[T] = js.native
  def sleep(): Statement[T] = js.native
  def sleep(ms: Double): Statement[T] = js.native
  def strategy(): Statement[T] = js.native
  def strategy(param: String): Statement[T] = js.native
  def to(): Statement[T] = js.native
  def to(param: js.Any): Statement[T] = js.native
  def token(value: js.Any): Statement[T] = js.native
  def traverse(): Statement[T] = js.native
  def traverse(param: String): Statement[T] = js.native
  def traverse(param: js.Array[String]): Statement[T] = js.native
  def update(): Statement[T] = js.native
  def update(param: String): Statement[T] = js.native
  def update(param: js.Array[String]): Statement[T] = js.native
  def upsert(): Statement[T] = js.native
  def upsert(condition: js.Any): Statement[T] = js.native
  def upsert(condition: js.Any, params: js.Any): Statement[T] = js.native
  def upsert(condition: js.Any, params: js.Any, comparisonOperator: String): Statement[T] = js.native
  def wait(waitLimit: Double): Statement[T] = js.native
  def where(params: js.Any): Statement[T] = js.native
  def `while`(param: js.Any): Statement[T] = js.native
  def within(latitudeProperty: String, longitudeProperty: String, box: js.Array[Double]): Statement[T] = js.native
}

