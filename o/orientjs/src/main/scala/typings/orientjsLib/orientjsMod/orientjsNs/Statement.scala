package typings
package orientjsLib.orientjsMod.orientjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Statement
  extends Query[js.Any] {
  def add(property: java.lang.String, value: js.Any): Statement = js.native
  def addParams(key: java.lang.String, value: js.Any): Statement = js.native
  def addParams(value: js.Any): Statement = js.native
  def and(param: js.Any): Statement = js.native
  def buildStatement(): java.lang.String = js.native
  def commit(): Statement = js.native
  def commit(retryLimit: scala.Double): Statement = js.native
  def containsText(param: js.Any): Statement = js.native
  def content(): Statement = js.native
  def content(param: js.Any): Statement = js.native
  def create(): Statement = js.native
  def create(paramtype: java.lang.String): Statement = js.native
  def create(paramtype: java.lang.String, paramname: java.lang.String): Statement = js.native
  def delete(): Statement = js.native
  def delete(param: java.lang.String): Statement = js.native
  def delete(param: js.Array[java.lang.String]): Statement = js.native
  def fetch(): Statement = js.native
  def fetch(param: js.Any): Statement = js.native
  def from(): Statement = js.native
  def from(param: java.lang.String): Statement = js.native
  def from(param: js.Any): Statement = js.native
  def group(param: js.Any): Statement = js.native
  def `if`(condition: SqlExpression, statements: Statement*): Statement = js.native
  def `if`(condition: SqlExpression, statements: js.Array[Statement]): Statement = js.native
  def increment(): Statement = js.native
  def increment(property: java.lang.String): Statement = js.native
  def increment(property: java.lang.String, value: js.Any): Statement = js.native
  def insert(): Statement = js.native
  def insert(param: java.lang.String): Statement = js.native
  def insert(param: js.Array[java.lang.String]): Statement = js.native
  def into(): Statement = js.native
  def into(param: java.lang.String): Statement = js.native
  def let(name: java.lang.String, value: java.lang.String): Statement = js.native
  def let(name: java.lang.String, value: Statement): Statement = js.native
  def limit(value: scala.Double): Statement = js.native
  def lock(param: js.Any): Statement = js.native
  def lucene(property: java.lang.String, luceneQuery: java.lang.String): Statement = js.native
  def lucene(property: js.Any, luceneQuery: java.lang.String): Statement = js.native
  def near(latitudeProperty: java.lang.String, longitudeProperty: java.lang.String, longitude: scala.Double): Statement = js.native
  def near(
    latitudeProperty: java.lang.String,
    longitudeProperty: java.lang.String,
    longitude: scala.Double,
    latitude: scala.Double
  ): Statement = js.native
  def near(
    latitudeProperty: java.lang.String,
    longitudeProperty: java.lang.String,
    longitude: scala.Double,
    latitude: scala.Double,
    maxDistanceInKms: scala.Double
  ): Statement = js.native
  def near(latitudeProperty: java.lang.String, longitudeProperty: scala.Double, longitude: scala.Double): Statement = js.native
  def near(
    latitudeProperty: java.lang.String,
    longitudeProperty: scala.Double,
    longitude: scala.Double,
    latitude: scala.Double
  ): Statement = js.native
  def near(
    latitudeProperty: java.lang.String,
    longitudeProperty: scala.Double,
    longitude: scala.Double,
    latitude: scala.Double,
    maxDistanceInKms: scala.Double
  ): Statement = js.native
  def near(latitudeProperty: js.Any, longitudeProperty: java.lang.String, longitude: scala.Double): Statement = js.native
  def near(
    latitudeProperty: js.Any,
    longitudeProperty: java.lang.String,
    longitude: scala.Double,
    latitude: scala.Double
  ): Statement = js.native
  def near(
    latitudeProperty: js.Any,
    longitudeProperty: java.lang.String,
    longitude: scala.Double,
    latitude: scala.Double,
    maxDistanceInKms: scala.Double
  ): Statement = js.native
  def near(latitudeProperty: js.Any, longitudeProperty: scala.Double, longitude: scala.Double): Statement = js.native
  def near(
    latitudeProperty: js.Any,
    longitudeProperty: scala.Double,
    longitude: scala.Double,
    latitude: scala.Double
  ): Statement = js.native
  def near(
    latitudeProperty: js.Any,
    longitudeProperty: scala.Double,
    longitude: scala.Double,
    latitude: scala.Double,
    maxDistanceInKms: scala.Double
  ): Statement = js.native
  def offset(): Statement = js.native
  def offset(value: scala.Double): Statement = js.native
  def or(param: js.Any): Statement = js.native
  def order(param: js.Any): Statement = js.native
  def put(property: java.lang.String, keysValues: js.Any): Statement = js.native
  def remove(property: java.lang.String, value: js.Any): Statement = js.native
  def retry(): Statement = js.native
  def retry(retryLimit: scala.Double): Statement = js.native
  def `return`(value: SqlExpression): Statement = js.native
  def rollback(): Statement = js.native
  def rollback(param: js.Any): Statement = js.native
  def select(): Statement = js.native
  def select(param: java.lang.String): Statement = js.native
  def select(param: js.Array[java.lang.String]): Statement = js.native
  def set(): Statement = js.native
  def set(param: js.Any): Statement = js.native
  def skip(value: scala.Double): Statement = js.native
  def sleep(): Statement = js.native
  def sleep(ms: scala.Double): Statement = js.native
  def strategy(): Statement = js.native
  def strategy(param: java.lang.String): Statement = js.native
  def to(): Statement = js.native
  def to(param: js.Any): Statement = js.native
  def token(value: js.Any): Statement = js.native
  def traverse(): Statement = js.native
  def traverse(param: java.lang.String): Statement = js.native
  def traverse(param: js.Array[java.lang.String]): Statement = js.native
  def update(): Statement = js.native
  def update(param: java.lang.String): Statement = js.native
  def update(param: js.Array[java.lang.String]): Statement = js.native
  def upsert(): Statement = js.native
  def upsert(condition: js.Any): Statement = js.native
  def upsert(condition: js.Any, params: js.Any): Statement = js.native
  def upsert(condition: js.Any, params: js.Any, comparisonOperator: java.lang.String): Statement = js.native
  def wait(waitLimit: scala.Double): Statement = js.native
  def where(params: js.Any): Statement = js.native
  def `while`(param: js.Any): Statement = js.native
  def within(
    latitudeProperty: java.lang.String,
    longitudeProperty: java.lang.String,
    box: js.Array[scala.Double]
  ): Statement = js.native
}

