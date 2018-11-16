package typings
package plottableLib.buildSrcComponentsComponentContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/components/componentContainer", "ComponentContainer")
@js.native
class ComponentContainer ()
  extends plottableLib.buildSrcComponentsComponentMod.Component {
  var _detachCallback: js.Any = js.native
  /* protected */ def _adoptAndAnchor(component: plottableLib.buildSrcComponentsComponentMod.Component): scala.Unit = js.native
  /**
       * Invokes a callback on each Component in the ComponentContainer.
       */
  /* protected */ def _forEach(
    callback: js.Function1[/* component */ plottableLib.buildSrcComponentsComponentMod.Component, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Carry out the actual removal of a Component.
       * Implementation dependent on the type of container.
       *
       * @return {boolean} true if the Component was successfully removed, false otherwise.
       */
  /* protected */ def _remove(component: plottableLib.buildSrcComponentsComponentMod.Component): scala.Boolean = js.native
  /**
       * Checks whether the specified Component is in the ComponentContainer.
       */
  def has(component: plottableLib.buildSrcComponentsComponentMod.Component): scala.Boolean = js.native
  /**
       * Removes the specified Component from the ComponentContainer.
       */
  def remove(component: plottableLib.buildSrcComponentsComponentMod.Component): this.type = js.native
}

