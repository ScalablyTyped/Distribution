package typings.parse.mod.global.Parse

import typings.parse.mod.global.Parse.Schema._FieldType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Parse.Polygon")
@js.native
open class Polygon protected ()
  extends StObject
     with _FieldType {
  def this(arg1: js.Array[js.Array[Double] | GeoPoint]) = this()
  
  def containsPoint(point: GeoPoint): Boolean = js.native
  
  def toJSON(): Any = js.native
}
