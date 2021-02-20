package typings.phaser.mod

import typings.phaser.MatterJS.BodyType
import typings.phaser.MatterJS.IGridDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `Matter.Grid` module contains methods for creating and manipulating collision broadphase grid structures.
  *
  * @class Grid
  */
@JSImport("matter", "Grid")
@js.native
class Grid ()
  extends typings.phaser.MatterJS.Grid
object Grid {
  
  /**
    * Clears the grid.
    * @method clear
    * @param {grid} grid
    */
  /* static member */
  @JSImport("matter", "Grid.clear")
  @js.native
  def clear(grid: typings.phaser.MatterJS.Grid): Unit = js.native
  
  /**
    * Creates a new grid.
    * @method create
    * @param {} options
    * @return {grid} A new grid
    */
  /* static member */
  @JSImport("matter", "Grid.create")
  @js.native
  def create(): typings.phaser.MatterJS.Grid = js.native
  @JSImport("matter", "Grid.create")
  @js.native
  def create(options: IGridDefinition): typings.phaser.MatterJS.Grid = js.native
  
  /**
    * Updates the grid.
    * @method update
    * @param {grid} grid
    * @param {body[]} bodies
    * @param {engine} engine
    * @param {boolean} forceUpdate
    */
  /* static member */
  @JSImport("matter", "Grid.update")
  @js.native
  def update(
    grid: typings.phaser.MatterJS.Grid,
    bodies: js.Array[BodyType],
    engine: typings.phaser.MatterJS.Engine,
    forceUpdate: Boolean
  ): Unit = js.native
}
