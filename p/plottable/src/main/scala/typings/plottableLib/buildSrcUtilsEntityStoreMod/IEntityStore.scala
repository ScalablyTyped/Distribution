package typings
package plottableLib.buildSrcUtilsEntityStoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEntityStore[T /* <: IPositionedEntity */] extends js.Object {
  /**
       * Adds all of the supplied entities to the store.
       *
       * If the optional bounds argument is provided, only entities within the
       * bounds will be available to `entityNearest` queries. Regardless, all
       * entities will be available with the `entities` method.
       *
       * @param {T[]} [entities] Entity array to add to the store. Entities must be
       * positionable
       * @param [entityBoundsFactory] A factory method for producing {IEntityBounds}
       * for each entity.
       * @param {Bounds} [bounds] Optionally add bounds filter for entityNearest
       * queries
       */
  def addAll(
    entities: js.Array[T],
    entityBoundsFactory: js.Function1[/* entity */ T, plottableLib.buildSrcCoreInterfacesMod.IEntityBounds]
  ): scala.Unit = js.native
  /**
       * Adds all of the supplied entities to the store.
       *
       * If the optional bounds argument is provided, only entities within the
       * bounds will be available to `entityNearest` queries. Regardless, all
       * entities will be available with the `entities` method.
       *
       * @param {T[]} [entities] Entity array to add to the store. Entities must be
       * positionable
       * @param [entityBoundsFactory] A factory method for producing {IEntityBounds}
       * for each entity.
       * @param {Bounds} [bounds] Optionally add bounds filter for entityNearest
       * queries
       */
  def addAll(
    entities: js.Array[T],
    entityBoundsFactory: js.Function1[/* entity */ T, plottableLib.buildSrcCoreInterfacesMod.IEntityBounds],
    bounds: plottableLib.buildSrcCoreInterfacesMod.Bounds
  ): scala.Unit = js.native
  /**
       * Returns the current internal array of all entities.
       *
       * @returns {T[]} the current internal array of entities.
       */
  def entities(): js.Array[T] = js.native
  /**
       * Returns the entites whose bounding boxes overlap the parameter.
       *
       * @param {IEntityBounds} [bounds] The query bounding box.
       */
  def entitiesInBounds(bounds: plottableLib.buildSrcCoreInterfacesMod.IEntityBounds): js.Array[T] = js.native
  /**
       * Returns the entites whose bounding boxes overlap the parameter on the
       * x-axis.
       *
       * @param {IEntityBounds} [bounds] The query bounding box.
       */
  def entitiesInXBounds(bounds: plottableLib.buildSrcCoreInterfacesMod.IEntityBounds): js.Array[T] = js.native
  /**
       * Returns the entites whose bounding boxes overlap the parameter on the
       * y-axis.
       *
       * @param {IEntityBounds} [bounds] The query bounding box.
       */
  def entitiesInYBounds(bounds: plottableLib.buildSrcCoreInterfacesMod.IEntityBounds): js.Array[T] = js.native
  /**
       * Returns the entity closest to a given {Point}
       *
       * Note that if a {Bounds} was provided to the `addAll` method, entities
       * outside those bounds will not be returned by this method.
       *
       * @param {Point} [point] Point around which to search for a closest entity
       * @returns {T} Will return the nearest entity or undefined if none are found
       */
  def entityNearest(point: plottableLib.buildSrcCoreInterfacesMod.Point): T = js.native
  /**
       * Returns the entity closest to a given {Point} in the x-dimension. Ties are
       * broken with a sort in the y-dimension.
       *
       * @param {Point} [point] Point around which to search for a closest entity
       * @returns {T} Will return the nearest entity or undefined if none are found
       */
  def entityNearestX(point: plottableLib.buildSrcCoreInterfacesMod.Point): T = js.native
  /**
       * Returns the entity closest to a given {Point} in the y-dimension. Ties are
       * broken with a sort in the x-dimension.
       *
       * @param {Point} [point] Point around which to search for a closest entity
       * @returns {T} Will return the nearest entity or undefined if none are found
       */
  def entityNearestY(point: plottableLib.buildSrcCoreInterfacesMod.Point): T = js.native
}

