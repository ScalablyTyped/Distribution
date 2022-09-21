package typings.openrct2.mod.global

import typings.openrct2.openrct2Strings.peep
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * APIs for the map.
  */
@js.native
trait GameMap extends StObject {
  
  def getAllEntities(`type`: EntityType): js.Array[Entity] = js.native
  @JSName("getAllEntities")
  def getAllEntities_peep(`type`: peep): js.Array[Peep] = js.native
  
  def getEntity(id: Double): Entity = js.native
  
  def getRide(id: Double): Ride = js.native
  
  def getTile(x: Double, y: Double): Tile = js.native
  
  val numEntities: Double = js.native
  
  val numRides: Double = js.native
  
  val rides: js.Array[Ride] = js.native
  
  val size: CoordsXY = js.native
}
