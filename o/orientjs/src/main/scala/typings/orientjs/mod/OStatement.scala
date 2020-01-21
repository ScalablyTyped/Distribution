package typings.orientjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OStatement
  extends OQuery[js.Any] {
  def add(property: String, value: js.Any): OStatement = js.native
  def addParams(key: String, value: js.Any): OStatement = js.native
  def addParams(value: js.Any): OStatement = js.native
  def and(param: js.Any): OStatement = js.native
  def buildStatement(): String = js.native
  def commit(): OStatement = js.native
  def commit(retryLimit: Double): OStatement = js.native
  def containsText(param: js.Any): OStatement = js.native
  def content(): OStatement = js.native
  def content(param: js.Any): OStatement = js.native
  def create(): OStatement = js.native
  def create(paramtype: String): OStatement = js.native
  def create(paramtype: String, paramname: String): OStatement = js.native
  def delete(): OStatement = js.native
  def delete(param: String): OStatement = js.native
  def delete(param: js.Array[String]): OStatement = js.native
  def fetch(): OStatement = js.native
  def fetch(param: js.Any): OStatement = js.native
  def from(): OStatement = js.native
  def from(param: String): OStatement = js.native
  def from(param: js.Any): OStatement = js.native
  def group(param: js.Any): OStatement = js.native
  def `if`(condition: OSqlExpression, statements: OStatement*): OStatement = js.native
  def `if`(condition: OSqlExpression, statements: js.Array[OStatement]): OStatement = js.native
  def increment(): OStatement = js.native
  def increment(property: String): OStatement = js.native
  def increment(property: String, value: js.Any): OStatement = js.native
  def insert(): OStatement = js.native
  def insert(param: String): OStatement = js.native
  def insert(param: js.Array[String]): OStatement = js.native
  def into(): OStatement = js.native
  def into(param: String): OStatement = js.native
  def let(name: String, value: String): OStatement = js.native
  def let(name: String, value: OStatement): OStatement = js.native
  def limit(value: Double): OStatement = js.native
  def lock(param: js.Any): OStatement = js.native
  def lucene(property: String, luceneQuery: String): OStatement = js.native
  def lucene(property: js.Any, luceneQuery: String): OStatement = js.native
  def near(latitudeProperty: String, longitudeProperty: String, longitude: Double): OStatement = js.native
  def near(latitudeProperty: String, longitudeProperty: String, longitude: Double, latitude: Double): OStatement = js.native
  def near(
    latitudeProperty: String,
    longitudeProperty: String,
    longitude: Double,
    latitude: Double,
    maxDistanceInKms: Double
  ): OStatement = js.native
  def near(latitudeProperty: String, longitudeProperty: Double, longitude: Double): OStatement = js.native
  def near(latitudeProperty: String, longitudeProperty: Double, longitude: Double, latitude: Double): OStatement = js.native
  def near(
    latitudeProperty: String,
    longitudeProperty: Double,
    longitude: Double,
    latitude: Double,
    maxDistanceInKms: Double
  ): OStatement = js.native
  def near(latitudeProperty: js.Any, longitudeProperty: String, longitude: Double): OStatement = js.native
  def near(latitudeProperty: js.Any, longitudeProperty: String, longitude: Double, latitude: Double): OStatement = js.native
  def near(
    latitudeProperty: js.Any,
    longitudeProperty: String,
    longitude: Double,
    latitude: Double,
    maxDistanceInKms: Double
  ): OStatement = js.native
  def near(latitudeProperty: js.Any, longitudeProperty: Double, longitude: Double): OStatement = js.native
  def near(latitudeProperty: js.Any, longitudeProperty: Double, longitude: Double, latitude: Double): OStatement = js.native
  def near(
    latitudeProperty: js.Any,
    longitudeProperty: Double,
    longitude: Double,
    latitude: Double,
    maxDistanceInKms: Double
  ): OStatement = js.native
  def offset(): OStatement = js.native
  def offset(value: Double): OStatement = js.native
  def or(param: js.Any): OStatement = js.native
  def order(param: js.Any): OStatement = js.native
  def put(property: String, keysValues: js.Any): OStatement = js.native
  def remove(property: String, value: js.Any): OStatement = js.native
  def retry(): OStatement = js.native
  def retry(retryLimit: Double): OStatement = js.native
  def `return`(value: OSqlExpression): OStatement = js.native
  def rollback(): OStatement = js.native
  def rollback(param: js.Any): OStatement = js.native
  def select(): OStatement = js.native
  def select(param: String): OStatement = js.native
  def select(param: js.Array[String]): OStatement = js.native
  def set(): OStatement = js.native
  def set(param: js.Any): OStatement = js.native
  def skip(value: Double): OStatement = js.native
  def sleep(): OStatement = js.native
  def sleep(ms: Double): OStatement = js.native
  def strategy(): OStatement = js.native
  def strategy(param: String): OStatement = js.native
  def to(): OStatement = js.native
  def to(param: js.Any): OStatement = js.native
  def token(value: js.Any): OStatement = js.native
  def traverse(): OStatement = js.native
  def traverse(param: String): OStatement = js.native
  def traverse(param: js.Array[String]): OStatement = js.native
  def update(): OStatement = js.native
  def update(param: String): OStatement = js.native
  def update(param: js.Array[String]): OStatement = js.native
  def upsert(): OStatement = js.native
  def upsert(condition: js.Any): OStatement = js.native
  def upsert(condition: js.Any, params: js.Any): OStatement = js.native
  def upsert(condition: js.Any, params: js.Any, comparisonOperator: String): OStatement = js.native
  def wait(waitLimit: Double): OStatement = js.native
  def where(params: js.Any): OStatement = js.native
  def `while`(param: js.Any): OStatement = js.native
  def within(latitudeProperty: String, longitudeProperty: String, box: js.Array[Double]): OStatement = js.native
}

