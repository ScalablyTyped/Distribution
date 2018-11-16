package typings
package plottableLib.buildSrcInteractionsInteractionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/interactions/interaction", "Interaction")
@js.native
class Interaction () extends js.Object {
  var _anchorCallback: js.Any = js.native
  var _componentAttachedTo: plottableLib.buildSrcComponentsComponentMod.Component = js.native
  var _enabled: js.Any = js.native
  var _isAnchored: js.Any = js.native
  /* protected */ def _anchor(component: plottableLib.buildSrcComponentsComponentMod.Component): scala.Unit = js.native
  /* private */ def _connect(): js.Any = js.native
  /* private */ def _disconnect(): js.Any = js.native
  /**
       * Checks whether a Component-coordinate-space Point is inside the Component.
       *
       * @param {Point} p A Point in Compoennt-space coordinates.
       * @return {boolean} Whether or not the point is inside the Component.
       */
  /* protected */ def _isInsideComponent(p: plottableLib.buildSrcCoreInterfacesMod.Point): scala.Boolean = js.native
  /**
       * Translates an <svg>-coordinate-space point to Component-space coordinates.
       *
       * @param {Point} p A Point in <svg>-space coordinates.
       * @return {Point} The same location in Component-space coordinates.
       */
  /* protected */ def _translateToComponentSpace(p: plottableLib.buildSrcCoreInterfacesMod.Point): plottableLib.buildSrcCoreInterfacesMod.Point = js.native
  /* protected */ def _unanchor(): scala.Unit = js.native
  /**
       * Attaches this Interaction to a Component.
       * If the Interaction was already attached to a Component, it first detaches itself from the old Component.
       *
       * @param {Component} component
       * @returns {Interaction} The calling Interaction.
       */
  def attachTo(component: plottableLib.buildSrcComponentsComponentMod.Component): this.type = js.native
  /**
       * Detaches this Interaction from whatever component it was attached to.
       * This Interaction can be reused.
       *
       * @returns {Interaction} The calling Interaction.
       */
  def detach(): this.type = js.native
  /**
       * @deprecated renamed to .detach().
       */
  def detachFrom(_component: plottableLib.buildSrcComponentsComponentMod.Component): this.type = js.native
  /**
       * Gets whether this Interaction is enabled.
       */
  def enabled(): scala.Boolean = js.native
  /**
       * Enables or disables this Interaction.
       *
       * @param {boolean} enabled Whether the Interaction should be enabled.
       * @return {Interaction} The calling Interaction.
       */
  def enabled(enabled: scala.Boolean): this.type = js.native
}

