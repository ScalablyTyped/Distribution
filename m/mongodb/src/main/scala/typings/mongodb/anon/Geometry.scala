package typings.mongodb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Geometry extends StObject {
  
  @JSName("$geometry")
  var $geometry: js.Object
}
object Geometry {
  
  @scala.inline
  def apply($geometry: js.Object): Geometry = {
    val __obj = js.Dynamic.literal($geometry = $geometry.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
  
  @scala.inline
  implicit class GeometryMutableBuilder[Self <: Geometry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$geometry(value: js.Object): Self = StObject.set(x, "$geometry", value.asInstanceOf[js.Any])
  }
}
