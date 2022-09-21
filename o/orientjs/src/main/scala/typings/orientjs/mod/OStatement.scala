package typings.orientjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OStatement
  extends StObject
     with OQuery[Any] {
  
  def add(property: String, value: Any): OStatement = js.native
  
  def addParams(key: String, value: Any): OStatement = js.native
  def addParams(value: Any): OStatement = js.native
  
  def and(param: Any): OStatement = js.native
  
  def buildStatement(): String = js.native
  
  def commit(): OStatement = js.native
  def commit(retryLimit: Double): OStatement = js.native
  
  def containsText(param: Any): OStatement = js.native
  
  def content(): OStatement = js.native
  def content(param: Any): OStatement = js.native
  
  def create(): OStatement = js.native
  def create(paramtype: String): OStatement = js.native
  def create(paramtype: String, paramname: String): OStatement = js.native
  def create(paramtype: Unit, paramname: String): OStatement = js.native
  
  def delete(): OStatement = js.native
  def delete(param: String): OStatement = js.native
  def delete(param: js.Array[String]): OStatement = js.native
  
  def fetch(): OStatement = js.native
  def fetch(param: Any): OStatement = js.native
  
  def from(): OStatement = js.native
  def from(param: String): OStatement = js.native
  def from(param: Any): OStatement = js.native
  
  def group(param: Any): OStatement = js.native
  
  def `if`(condition: OSqlExpression, statements: OStatement*): OStatement = js.native
  def `if`(condition: OSqlExpression, statements: js.Array[OStatement]): OStatement = js.native
  
  def increment(): OStatement = js.native
  def increment(property: String): OStatement = js.native
  def increment(property: String, value: Any): OStatement = js.native
  def increment(property: Unit, value: Any): OStatement = js.native
  
  def insert(): OStatement = js.native
  def insert(param: String): OStatement = js.native
  def insert(param: js.Array[String]): OStatement = js.native
  
  def into(): OStatement = js.native
  def into(param: String): OStatement = js.native
  
  def let(name: String, value: String): OStatement = js.native
  def let(name: String, value: OStatement): OStatement = js.native
  
  def limit(value: Double): OStatement = js.native
  
  def lock(param: Any): OStatement = js.native
  
  def lucene(property: String, luceneQuery: String): OStatement = js.native
  def lucene(property: Any, luceneQuery: String): OStatement = js.native
  
  def near(latitudeProperty: String, longitudeProperty: String, longitude: Double): OStatement = js.native
  def near(latitudeProperty: String, longitudeProperty: String, longitude: Double, latitude: Double): OStatement = js.native
  def near(
    latitudeProperty: String,
    longitudeProperty: String,
    longitude: Double,
    latitude: Double,
    maxDistanceInKms: Double
  ): OStatement = js.native
  def near(
    latitudeProperty: String,
    longitudeProperty: String,
    longitude: Double,
    latitude: Unit,
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
  def near(
    latitudeProperty: String,
    longitudeProperty: Double,
    longitude: Double,
    latitude: Unit,
    maxDistanceInKms: Double
  ): OStatement = js.native
  def near(latitudeProperty: Any, longitudeProperty: String, longitude: Double): OStatement = js.native
  def near(latitudeProperty: Any, longitudeProperty: String, longitude: Double, latitude: Double): OStatement = js.native
  def near(
    latitudeProperty: Any,
    longitudeProperty: String,
    longitude: Double,
    latitude: Double,
    maxDistanceInKms: Double
  ): OStatement = js.native
  def near(
    latitudeProperty: Any,
    longitudeProperty: String,
    longitude: Double,
    latitude: Unit,
    maxDistanceInKms: Double
  ): OStatement = js.native
  def near(latitudeProperty: Any, longitudeProperty: Double, longitude: Double): OStatement = js.native
  def near(latitudeProperty: Any, longitudeProperty: Double, longitude: Double, latitude: Double): OStatement = js.native
  def near(
    latitudeProperty: Any,
    longitudeProperty: Double,
    longitude: Double,
    latitude: Double,
    maxDistanceInKms: Double
  ): OStatement = js.native
  def near(
    latitudeProperty: Any,
    longitudeProperty: Double,
    longitude: Double,
    latitude: Unit,
    maxDistanceInKms: Double
  ): OStatement = js.native
  
  def offset(): OStatement = js.native
  def offset(value: Double): OStatement = js.native
  
  def or(param: Any): OStatement = js.native
  
  def order(param: Any): OStatement = js.native
  
  def put(property: String, keysValues: Any): OStatement = js.native
  
  def remove(property: String, value: Any): OStatement = js.native
  
  def retry(): OStatement = js.native
  def retry(retryLimit: Double): OStatement = js.native
  
  def `return`(value: OSqlExpression): OStatement = js.native
  
  def rollback(): OStatement = js.native
  def rollback(param: Any): OStatement = js.native
  
  def select(): OStatement = js.native
  def select(param: String): OStatement = js.native
  def select(param: js.Array[String]): OStatement = js.native
  
  def set(): OStatement = js.native
  def set(param: Any): OStatement = js.native
  
  def skip(value: Double): OStatement = js.native
  
  def sleep(): OStatement = js.native
  def sleep(ms: Double): OStatement = js.native
  
  def strategy(): OStatement = js.native
  def strategy(param: String): OStatement = js.native
  
  def to(): OStatement = js.native
  def to(param: Any): OStatement = js.native
  
  def token(value: Any): OStatement = js.native
  
  def traverse(): OStatement = js.native
  def traverse(param: String): OStatement = js.native
  def traverse(param: js.Array[String]): OStatement = js.native
  
  def update(): OStatement = js.native
  def update(param: String): OStatement = js.native
  def update(param: js.Array[String]): OStatement = js.native
  
  def upsert(): OStatement = js.native
  def upsert(condition: Any): OStatement = js.native
  def upsert(condition: Any, params: Any): OStatement = js.native
  def upsert(condition: Any, params: Any, comparisonOperator: String): OStatement = js.native
  def upsert(condition: Any, params: Unit, comparisonOperator: String): OStatement = js.native
  def upsert(condition: Unit, params: Any): OStatement = js.native
  def upsert(condition: Unit, params: Any, comparisonOperator: String): OStatement = js.native
  def upsert(condition: Unit, params: Unit, comparisonOperator: String): OStatement = js.native
  
  def wait(waitLimit: Double): OStatement = js.native
  
  def where(params: Any): OStatement = js.native
  
  def `while`(param: Any): OStatement = js.native
  
  def within(latitudeProperty: String, longitudeProperty: String, box: js.Array[Double]): OStatement = js.native
}
