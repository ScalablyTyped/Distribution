package typings.phaser.mod

import typings.phaser.MatterJS.BodyType
import typings.phaser.MatterJS.IGridDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The `Matter.Grid` module contains methods for creating and manipulating collision broadphase grid structures.
  *
  * @class Grid
  */
@JSImport("matter", "Grid")
@js.native
class Grid ()
  extends typings.phaser.MatterJS.Grid

/* static members */
@JSImport("matter", "Grid")
@js.native
object Grid extends js.Object {
  /**
    * Clears the grid.
    * @method clear
    * @param {grid} grid
    */
  def clear(grid: typings.phaser.MatterJS.Grid): Unit = js.native
  /**
    * Creates a new grid.
    * @method create
    * @param {} options
    * @return {grid} A new grid
    */
  def create(): typings.phaser.MatterJS.Grid = js.native
  def create(options: IGridDefinition): typings.phaser.MatterJS.Grid = js.native
  /**
    * Updates the grid.
    * @method update
    * @param {grid} grid
    * @param {body[]} bodies
    * @param {engine} engine
    * @param {boolean} forceUpdate
    */
  def update(
    grid: typings.phaser.MatterJS.Grid,
    bodies: js.Array[BodyType],
    engine: typings.phaser.MatterJS.Engine,
    forceUpdate: Boolean
  ): Unit = js.native
}

