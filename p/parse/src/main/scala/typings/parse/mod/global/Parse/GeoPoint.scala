package typings.parse.mod.global.Parse

import typings.parse.anon.Latitude
import typings.parse.mod.global.Parse.Schema._FieldType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates a new GeoPoint with any of the following forms:<br>
  *   <pre>
  *   new GeoPoint(otherGeoPoint)
  *   new GeoPoint(30, 30)
  *   new GeoPoint([30, 30])
  *   new GeoPoint({latitude: 30, longitude: 30})
  *   new GeoPoint()  // defaults to (0, 0)
  *   </pre>
  *
  * <p>Represents a latitude / longitude point that may be associated
  * with a key in a ParseObject or used as a reference point for geo queries.
  * This allows proximity-based queries on the key.</p>
  *
  * <p>Only one key in a class may contain a GeoPoint.</p>
  *
  * <p>Example:<pre>
  *   var point = new Parse.GeoPoint(30.0, -20.0);
  *   var object = new Parse.Object("PlaceObject");
  *   object.set("location", point);
  *   object.save();</pre></p>
  */
@JSGlobal("Parse.GeoPoint")
@js.native
class GeoPoint ()
  extends StObject
     with _FieldType {
  def this(coords: js.Tuple2[Double, Double]) = this()
  def this(coords: Latitude) = this()
  def this(latitude: Double, longitude: Double) = this()
  
  def current(): GeoPoint = js.native
  def current(options: SuccessFailureOptions): GeoPoint = js.native
  
  def kilometersTo(point: GeoPoint): Double = js.native
  
  var latitude: Double = js.native
  
  var longitude: Double = js.native
  
  def milesTo(point: GeoPoint): Double = js.native
  
  def radiansTo(point: GeoPoint): Double = js.native
  
  def toJSON(): js.Any = js.native
}
