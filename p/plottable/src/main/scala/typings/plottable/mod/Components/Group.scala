package typings.plottable.mod.Components

import typings.plottable.componentMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable", "Components.Group")
@js.native
/**
  * Constructs a Group.
  *
  * A Group contains Components that will be rendered on top of each other.
  * Components added later will be rendered above Components already in the Group.
  *
  * @constructor
  * @param {Component[]} [components=[]] Components to be added to the Group.
  */
class Group ()
  extends typings.plottable.componentsMod.Group {
  def this(components: js.Array[Component]) = this()
}

