package typings.plottable

import typings.plottable.buildSrcComponentsComponentContainerMod.ComponentContainer
import typings.plottable.buildSrcComponentsComponentMod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcComponentsGroupMod {
  
  @JSImport("plottable/build/src/components/group", "Group")
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
  open class Group () extends ComponentContainer {
    def this(components: js.Array[Component]) = this()
    
    /* private */ var _components: Any = js.native
    
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
