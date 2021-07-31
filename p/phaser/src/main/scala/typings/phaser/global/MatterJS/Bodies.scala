package typings.phaser.global.MatterJS

import typings.phaser.MatterJS.BodyType
import typings.phaser.MatterJS.IBodyDefinition
import typings.phaser.MatterJS.IChamferableBodyDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `Matter.Bodies` module contains factory methods for creating rigid body models
  * with commonly used body configurations (such as rectangles, circles and other polygons).
  *
  * See the included usage [examples](https://github.com/liabru/matter-js/tree/master/examples).
  */
@JSGlobal("MatterJS.Bodies")
@js.native
class Bodies ()
  extends StObject
     with typings.phaser.MatterJS.Bodies
object Bodies {
  
  @JSGlobal("MatterJS.Bodies")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new rigid body model with a circle hull.
    * The options parameter is an object that specifies any properties you wish to override the defaults.
    * See the properties section of the `Matter.Body` module for detailed information on what you can pass via the `options` object.
    * @method circle
    * @param {number} x
    * @param {number} y
    * @param {number} radius
    * @param {object} [options]
    * @param {number} [maxSides]
    * @return {body} A new circle body
    */
  /* static member */
  @scala.inline
  def circle(x: Double, y: Double, radius: Double): BodyType = (^.asInstanceOf[js.Dynamic].applyDynamic("circle")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[BodyType]
  @scala.inline
  def circle(x: Double, y: Double, radius: Double, options: Unit, maxSides: Double): BodyType = (^.asInstanceOf[js.Dynamic].applyDynamic("circle")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], options.asInstanceOf[js.Any], maxSides.asInstanceOf[js.Any])).asInstanceOf[BodyType]
  @scala.inline
  def circle(x: Double, y: Double, radius: Double, options: IBodyDefinition): BodyType = (^.asInstanceOf[js.Dynamic].applyDynamic("circle")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[BodyType]
  @scala.inline
  def circle(x: Double, y: Double, radius: Double, options: IBodyDefinition, maxSides: Double): BodyType = (^.asInstanceOf[js.Dynamic].applyDynamic("circle")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], options.asInstanceOf[js.Any], maxSides.asInstanceOf[js.Any])).asInstanceOf[BodyType]
  
  /**
    * Creates a body using the supplied vertices (or an array containing multiple sets of vertices).
    * If the vertices are convex, they will pass through as supplied.
    * Otherwise if the vertices are concave, they will be decomposed if [poly-decomp.js](https://github.com/schteppe/poly-decomp.js) is available.
    * Note that this process is not guaranteed to support complex sets of vertices (e.g. those with holes may fail).
    * By default the decomposition will discard collinear edges (to improve performance).
    * It can also optionally discard any parts that have an area less than `minimumArea`.
    * If the vertices can not be decomposed, the result will fall back to using the convex hull.
    * The options parameter is an object that specifies any `Matter.Body` properties you wish to override the defaults.
    * See the properties section of the `Matter.Body` module for detailed information on what you can pass via the `options` object.
    * @method fromVertices
    * @param {number} x
    * @param {number} y
    * @param [[vector]] vertexSets
    * @param {object} [options]
    * @param {bool} [flagInternal=false]
    * @param {number} [removeCollinear=0.01]
    * @param {number} [minimumArea=10]
    * @return {body}
    */
  /* static member */
  @scala.inline
  def fromVertices(x: Double, y: Double, vertexSets: js.Array[js.Array[typings.phaser.MatterJS.Vector]]): BodyType = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], vertexSets.asInstanceOf[js.Any])).asInstanceOf[BodyType]
  @scala.inline
  def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[js.Array[typings.phaser.MatterJS.Vector]],
    options: Unit,
    flagInternal: Boolean
  ): BodyType = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], vertexSets.asInstanceOf[js.Any], options.asInstanceOf[js.Any], flagInternal.asInstanceOf[js.Any])).asInstanceOf[BodyType]
  @scala.inline
  def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[js.Array[typings.phaser.MatterJS.Vector]],
    options: Unit,
    flagInternal: Boolean,
    removeCollinear: Double
  ): BodyType = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], vertexSets.asInstanceOf[js.Any], options.asInstanceOf[js.Any], flagInternal.asInstanceOf[js.Any], removeCollinear.asInstanceOf[js.Any])).asInstanceOf[BodyType]
  @scala.inline
  def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[js.Array[typings.phaser.MatterJS.Vector]],
    options: Unit,
    flagInternal: Boolean,
    removeCollinear: Double,
    minimumArea: Double
  ): BodyType = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], vertexSets.asInstanceOf[js.Any], options.asInstanceOf[js.Any], flagInternal.asInstanceOf[js.Any], removeCollinear.asInstanceOf[js.Any], minimumArea.asInstanceOf[js.Any])).asInstanceOf[BodyType]
  @scala.inline
  def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[js.Array[typings.phaser.MatterJS.Vector]],
    options: Unit,
    flagInternal: Boolean,
    removeCollinear: Unit,
    minimumArea: Double
  ): BodyType = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], vertexSets.asInstanceOf[js.Any], options.asInstanceOf[js.Any], flagInternal.asInstanceOf[js.Any], removeCollinear.asInstanceOf[js.Any], minimumArea.asInstanceOf[js.Any])).asInstanceOf[BodyType]
  @scala.inline
  def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[js.Array[typings.phaser.MatterJS.Vector]],
    options: Unit,
    flagInternal: Unit,
    removeCollinear: Double
  ): BodyType = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], vertexSets.asInstanceOf[js.Any], options.asInstanceOf[js.Any], flagInternal.asInstanceOf[js.Any], removeCollinear.asInstanceOf[js.Any])).asInstanceOf[BodyType]
  @scala.inline
  def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[js.Array[typings.phaser.MatterJS.Vector]],
    options: Unit,
    flagInternal: Unit,
    removeCollinear: Double,
    minimumArea: Double
  ): BodyType = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], vertexSets.asInstanceOf[js.Any], options.asInstanceOf[js.Any], flagInternal.asInstanceOf[js.Any], removeCollinear.asInstanceOf[js.Any], minimumArea.asInstanceOf[js.Any])).asInstanceOf[BodyType]
  @scala.inline
  def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[js.Array[typings.phaser.MatterJS.Vector]],
    options: Unit,
    flagInternal: Unit,
    removeCollinear: Unit,
    minimumArea: Double
  ): BodyType = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], vertexSets.asInstanceOf[js.Any], options.asInstanceOf[js.Any], flagInternal.asInstanceOf[js.Any], removeCollinear.asInstanceOf[js.Any], minimumArea.asInstanceOf[js.Any])).asInstanceOf[BodyType]
  @scala.inline
  def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[js.Array[typings.phaser.MatterJS.Vector]],
    options: IBodyDefinition
  ): BodyType = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], vertexSets.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[BodyType]
  @scala.inline
  def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[js.Array[typings.phaser.MatterJS.Vector]],
    options: IBodyDefinition,
    flagInternal: Boolean
  ): BodyType = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], vertexSets.asInstanceOf[js.Any], options.asInstanceOf[js.Any], flagInternal.asInstanceOf[js.Any])).asInstanceOf[BodyType]
  @scala.inline
  def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[js.Array[typings.phaser.MatterJS.Vector]],
    options: IBodyDefinition,
    flagInternal: Boolean,
    removeCollinear: Double
  ): BodyType = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], vertexSets.asInstanceOf[js.Any], options.asInstanceOf[js.Any], flagInternal.asInstanceOf[js.Any], removeCollinear.asInstanceOf[js.Any])).asInstanceOf[BodyType]
  @scala.inline
  def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[js.Array[typings.phaser.MatterJS.Vector]],
    options: IBodyDefinition,
    flagInternal: Boolean,
    removeCollinear: Double,
    minimumArea: Double
  ): BodyType = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], vertexSets.asInstanceOf[js.Any], options.asInstanceOf[js.Any], flagInternal.asInstanceOf[js.Any], removeCollinear.asInstanceOf[js.Any], minimumArea.asInstanceOf[js.Any])).asInstanceOf[BodyType]
  @scala.inline
  def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[js.Array[typings.phaser.MatterJS.Vector]],
    options: IBodyDefinition,
    flagInternal: Boolean,
    removeCollinear: Unit,
    minimumArea: Double
  ): BodyType = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], vertexSets.asInstanceOf[js.Any], options.asInstanceOf[js.Any], flagInternal.asInstanceOf[js.Any], removeCollinear.asInstanceOf[js.Any], minimumArea.asInstanceOf[js.Any])).asInstanceOf[BodyType]
  @scala.inline
  def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[js.Array[typings.phaser.MatterJS.Vector]],
    options: IBodyDefinition,
    flagInternal: Unit,
    removeCollinear: Double
  ): BodyType = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], vertexSets.asInstanceOf[js.Any], options.asInstanceOf[js.Any], flagInternal.asInstanceOf[js.Any], removeCollinear.asInstanceOf[js.Any])).asInstanceOf[BodyType]
  @scala.inline
  def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[js.Array[typings.phaser.MatterJS.Vector]],
    options: IBodyDefinition,
    flagInternal: Unit,
    removeCollinear: Double,
    minimumArea: Double
  ): BodyType = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], vertexSets.asInstanceOf[js.Any], options.asInstanceOf[js.Any], flagInternal.asInstanceOf[js.Any], removeCollinear.asInstanceOf[js.Any], minimumArea.asInstanceOf[js.Any])).asInstanceOf[BodyType]
  @scala.inline
  def fromVertices(
    x: Double,
    y: Double,
    vertexSets: js.Array[js.Array[typings.phaser.MatterJS.Vector]],
    options: IBodyDefinition,
    flagInternal: Unit,
    removeCollinear: Unit,
    minimumArea: Double
  ): BodyType = (^.asInstanceOf[js.Dynamic].applyDynamic("fromVertices")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], vertexSets.asInstanceOf[js.Any], options.asInstanceOf[js.Any], flagInternal.asInstanceOf[js.Any], removeCollinear.asInstanceOf[js.Any], minimumArea.asInstanceOf[js.Any])).asInstanceOf[BodyType]
  
  /**
    * Creates a new rigid body model with a regular polygon hull with the given number of sides.
    * The options parameter is an object that specifies any properties you wish to override the defaults.
    * See the properties section of the `Matter.Body` module for detailed information on what you can pass via the `options` object.
    * @method polygon
    * @param {number} x
    * @param {number} y
    * @param {number} sides
    * @param {number} radius
    * @param {object} [options]
    * @return {body} A new regular polygon body
    */
  /* static member */
  @scala.inline
  def polygon(x: Double, y: Double, sides: Double, radius: Double): BodyType = (^.asInstanceOf[js.Dynamic].applyDynamic("polygon")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], sides.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[BodyType]
  @scala.inline
  def polygon(x: Double, y: Double, sides: Double, radius: Double, options: IChamferableBodyDefinition): BodyType = (^.asInstanceOf[js.Dynamic].applyDynamic("polygon")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], sides.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[BodyType]
  
  /**
    * Creates a new rigid body model with a rectangle hull.
    * The options parameter is an object that specifies any properties you wish to override the defaults.
    * See the properties section of the `Matter.Body` module for detailed information on what you can pass via the `options` object.
    * @method rectangle
    * @param {number} x
    * @param {number} y
    * @param {number} width
    * @param {number} height
    * @param {object} [options]
    * @return {body} A new rectangle body
    */
  /* static member */
  @scala.inline
  def rectangle(x: Double, y: Double, width: Double, height: Double): BodyType = (^.asInstanceOf[js.Dynamic].applyDynamic("rectangle")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[BodyType]
  @scala.inline
  def rectangle(x: Double, y: Double, width: Double, height: Double, options: IChamferableBodyDefinition): BodyType = (^.asInstanceOf[js.Dynamic].applyDynamic("rectangle")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[BodyType]
  
  /**
    * Creates a new rigid body model with a trapezoid hull.
    * The options parameter is an object that specifies any properties you wish to override the defaults.
    * See the properties section of the `Matter.Body` module for detailed information on what you can pass via the `options` object.
    * @method trapezoid
    * @param {number} x
    * @param {number} y
    * @param {number} width
    * @param {number} height
    * @param {number} slope
    * @param {object} [options]
    * @return {body} A new trapezoid body
    */
  /* static member */
  @scala.inline
  def trapezoid(x: Double, y: Double, width: Double, height: Double, slope: Double): BodyType = (^.asInstanceOf[js.Dynamic].applyDynamic("trapezoid")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], slope.asInstanceOf[js.Any])).asInstanceOf[BodyType]
  @scala.inline
  def trapezoid(
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    slope: Double,
    options: IChamferableBodyDefinition
  ): BodyType = (^.asInstanceOf[js.Dynamic].applyDynamic("trapezoid")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], slope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[BodyType]
}
