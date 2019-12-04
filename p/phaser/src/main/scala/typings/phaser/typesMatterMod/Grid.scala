package typings.phaser.typesMatterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("phaser/types/matter", "Grid")
@js.native
class Grid () extends js.Object

/* static members */
@JSImport("phaser/types/matter", "Grid")
@js.native
object Grid extends js.Object {
  /**
    * Clears the grid.
    * @method clear
    * @param {grid} grid
    */
  def clear(grid: Grid): Unit = js.native
  /**
    * Creates a new grid.
    * @method create
    * @param {} options
    * @return {grid} A new grid
    */
  def create(): Grid = js.native
  def create(options: IGridDefinition): Grid = js.native
  /**
    * Updates the grid.
    * @method update
    * @param {grid} grid
    * @param {body[]} bodies
    * @param {engine} engine
    * @param {boolean} forceUpdate
    */
  def update(grid: Grid, bodies: js.Array[Body], engine: Engine, forceUpdate: Boolean): Unit = js.native
}

