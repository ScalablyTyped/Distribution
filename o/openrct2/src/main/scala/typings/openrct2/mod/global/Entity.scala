package typings.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an object "entity" on the map that can typically moves and has a sub-tile coordinate.
  */
trait Entity extends StObject {
  
  /**
    * The entity index within the entity list.
    */
  val id: Double
  
  /**
    * Removes the entity from the map.
    * Note: removing vehicles and peeps that are on rides is currently unsupported.
    */
  def remove(): Unit
  
  /**
    * The type of entity, e.g. car, duck, litter, or peep.
    */
  val `type`: EntityType
  
  /**
    * The x-coordinate of the entity in game units.
    */
  var x: Double
  
  /**
    * The y-coordinate of the entity in game units.
    */
  var y: Double
  
  /**
    * The z-coordinate of the entity in game units.
    */
  var z: Double
}
object Entity {
  
  inline def apply(id: Double, remove: () => Unit, `type`: EntityType, x: Double, y: Double, z: Double): Entity = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Entity] (val x: Self) extends AnyVal {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    
    inline def setType(value: EntityType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
