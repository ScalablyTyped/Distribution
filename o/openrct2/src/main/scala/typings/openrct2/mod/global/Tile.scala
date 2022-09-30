package typings.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a tile containing tile elements on the map. This is a fixed handle
  * for a given tile position. It can be re-used safely between game ticks.
  */
@js.native
trait Tile extends StObject {
  
  /**
    * Gets or sets the raw data for this tile.
    * This can provide more control and efficiency for tile manipulation but requires
    * knowledge of tile element structures and may change between versions of OpenRCT2.
    */
  var data: js.typedarray.Uint8Array = js.native
  
  /** Gets an array of all the tile elements on this tile. */
  val elements: js.Array[BaseTileElement] = js.native
  
  /** Gets the tile element at the given index on this tile. */
  def getElement(index: Double): BaseTileElement = js.native
  /** Gets the tile element at the given index on this tile. */
  @JSName("getElement")
  def getElement_T_T[T /* <: BaseTileElement */](index: Double): T = js.native
  
  /** Inserts a new tile element at the given index on this tile. */
  def insertElement(index: Double): BaseTileElement = js.native
  
  /** Gets the number of tile elements on this tile. */
  val numElements: Double = js.native
  
  /** Removes the tile element at the given index from this tile. */
  def removeElement(index: Double): Unit = js.native
  
  /** The x position in tiles. */
  val x: Double = js.native
  
  /** The y position in tiles. */
  val y: Double = js.native
}
