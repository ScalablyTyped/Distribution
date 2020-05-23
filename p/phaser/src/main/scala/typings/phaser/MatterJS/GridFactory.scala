package typings.phaser.MatterJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridFactory extends js.Object {
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
  def update(grid: Grid, bodies: js.Array[BodyType], engine: Engine, forceUpdate: Boolean): Unit = js.native
}

