package typings
package orientjsLib.orientjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Statement[T] extends Query[T] {
  def add(property: java.lang.String, value: js.Any): Statement[T] = js.native
  def addParams(key: java.lang.String, value: js.Any): Statement[T] = js.native
  def addParams(value: js.Any): Statement[T] = js.native
  def and(param: js.Any): Statement[T] = js.native
  def buildStatement(): java.lang.String = js.native
  def commit(): Statement[T] = js.native
  def commit(retryLimit: scala.Double): Statement[T] = js.native
  def containsText(param: js.Any): Statement[T] = js.native
  def content(): Statement[T] = js.native
  def content(param: js.Any): Statement[T] = js.native
  def create(): Statement[T] = js.native
  def create(paramtype: java.lang.String): Statement[T] = js.native
  def create(paramtype: java.lang.String, paramname: java.lang.String): Statement[T] = js.native
  def delete(): Statement[T] = js.native
  def delete(param: java.lang.String): Statement[T] = js.native
  def delete(param: js.Array[java.lang.String]): Statement[T] = js.native
  def fetch(): Statement[T] = js.native
  def fetch(param: js.Any): Statement[T] = js.native
  def from(): Statement[T] = js.native
  def from(param: java.lang.String): Statement[T] = js.native
  def from(param: js.Any): Statement[T] = js.native
  def group(param: js.Any): Statement[T] = js.native
  def `if`(condition: SqlExpression, statements: Statement[T]*): Statement[T] = js.native
  def `if`(condition: SqlExpression, statements: js.Array[Statement[T]]): Statement[T] = js.native
  def increment(): Statement[T] = js.native
  def increment(property: java.lang.String): Statement[T] = js.native
  def increment(property: java.lang.String, value: js.Any): Statement[T] = js.native
  def insert(): Statement[T] = js.native
  def insert(param: java.lang.String): Statement[T] = js.native
  def insert(param: js.Array[java.lang.String]): Statement[T] = js.native
  def into(): Statement[T] = js.native
  def into(param: java.lang.String): Statement[T] = js.native
  def let(name: java.lang.String, value: java.lang.String): Statement[T] = js.native
  def let(name: java.lang.String, value: Statement[T]): Statement[T] = js.native
  def limit(value: scala.Double): Statement[T] = js.native
  def lock(param: js.Any): Statement[T] = js.native
  def lucene(property: java.lang.String, luceneQuery: java.lang.String): Statement[T] = js.native
  def lucene(property: js.Any, luceneQuery: java.lang.String): Statement[T] = js.native
  def near(latitudeProperty: java.lang.String, longitudeProperty: java.lang.String, longitude: scala.Double): Statement[T] = js.native
  def near(
    latitudeProperty: java.lang.String,
    longitudeProperty: java.lang.String,
    longitude: scala.Double,
    latitude: scala.Double
  ): Statement[T] = js.native
  def near(
    latitudeProperty: java.lang.String,
    longitudeProperty: java.lang.String,
    longitude: scala.Double,
    latitude: scala.Double,
    maxDistanceInKms: scala.Double
  ): Statement[T] = js.native
  def near(latitudeProperty: java.lang.String, longitudeProperty: scala.Double, longitude: scala.Double): Statement[T] = js.native
  def near(
    latitudeProperty: java.lang.String,
    longitudeProperty: scala.Double,
    longitude: scala.Double,
    latitude: scala.Double
  ): Statement[T] = js.native
  def near(
    latitudeProperty: java.lang.String,
    longitudeProperty: scala.Double,
    longitude: scala.Double,
    latitude: scala.Double,
    maxDistanceInKms: scala.Double
  ): Statement[T] = js.native
  def near(latitudeProperty: js.Any, longitudeProperty: java.lang.String, longitude: scala.Double): Statement[T] = js.native
  def near(
    latitudeProperty: js.Any,
    longitudeProperty: java.lang.String,
    longitude: scala.Double,
    latitude: scala.Double
  ): Statement[T] = js.native
  def near(
    latitudeProperty: js.Any,
    longitudeProperty: java.lang.String,
    longitude: scala.Double,
    latitude: scala.Double,
    maxDistanceInKms: scala.Double
  ): Statement[T] = js.native
  def near(latitudeProperty: js.Any, longitudeProperty: scala.Double, longitude: scala.Double): Statement[T] = js.native
  def near(
    latitudeProperty: js.Any,
    longitudeProperty: scala.Double,
    longitude: scala.Double,
    latitude: scala.Double
  ): Statement[T] = js.native
  def near(
    latitudeProperty: js.Any,
    longitudeProperty: scala.Double,
    longitude: scala.Double,
    latitude: scala.Double,
    maxDistanceInKms: scala.Double
  ): Statement[T] = js.native
  def offset(): Statement[T] = js.native
  def offset(value: scala.Double): Statement[T] = js.native
  def or(param: js.Any): Statement[T] = js.native
  def order(param: js.Any): Statement[T] = js.native
  def put(property: java.lang.String, keysValues: js.Any): Statement[T] = js.native
  def remove(property: java.lang.String, value: js.Any): Statement[T] = js.native
  def retry(): Statement[T] = js.native
  def retry(retryLimit: scala.Double): Statement[T] = js.native
  def `return`(value: SqlExpression): Statement[T] = js.native
  def rollback(): Statement[T] = js.native
  def rollback(param: js.Any): Statement[T] = js.native
  def select(): Statement[T] = js.native
  def select(param: java.lang.String): Statement[T] = js.native
  def select(param: js.Array[java.lang.String]): Statement[T] = js.native
  def set(): Statement[T] = js.native
  def set(param: js.Any): Statement[T] = js.native
  def skip(value: scala.Double): Statement[T] = js.native
  def sleep(): Statement[T] = js.native
  def sleep(ms: scala.Double): Statement[T] = js.native
  def strategy(): Statement[T] = js.native
  def strategy(param: java.lang.String): Statement[T] = js.native
  def to(): Statement[T] = js.native
  def to(param: js.Any): Statement[T] = js.native
  def token(value: js.Any): Statement[T] = js.native
  def traverse(): Statement[T] = js.native
  def traverse(param: java.lang.String): Statement[T] = js.native
  def traverse(param: js.Array[java.lang.String]): Statement[T] = js.native
  def update(): Statement[T] = js.native
  def update(param: java.lang.String): Statement[T] = js.native
  def update(param: js.Array[java.lang.String]): Statement[T] = js.native
  def upsert(): Statement[T] = js.native
  def upsert(condition: js.Any): Statement[T] = js.native
  def upsert(condition: js.Any, params: js.Any): Statement[T] = js.native
  def upsert(condition: js.Any, params: js.Any, comparisonOperator: java.lang.String): Statement[T] = js.native
  def wait(waitLimit: scala.Double): Statement[T] = js.native
  def where(params: js.Any): Statement[T] = js.native
  def `while`(param: js.Any): Statement[T] = js.native
  def within(
    latitudeProperty: java.lang.String,
    longitudeProperty: java.lang.String,
    box: js.Array[scala.Double]
  ): Statement[T] = js.native
}

