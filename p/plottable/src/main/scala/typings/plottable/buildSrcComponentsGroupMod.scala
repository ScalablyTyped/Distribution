package typings.plottable

import typings.plottable.buildSrcComponentsComponentContainerMod.ComponentContainer
import typings.plottable.buildSrcComponentsComponentMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/components/group", JSImport.Namespace)
@js.native
object buildSrcComponentsGroupMod extends js.Object {
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
  class Group () extends ComponentContainer {
    def this(components: js.Array[Component]) = this()
    var _components: js.Any = js.native
    /**
      * Adds a Component to this Group.
      * The added Component will be rendered above Components already in the Group.
      */
    def append(component: Component): this.type = js.native
    /**
      * @return {Component[]} The Components in this Group.
      */
    def components(): js.Array[Component] = js.native
  }
  
}

