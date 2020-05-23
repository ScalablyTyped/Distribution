package typings.phaser.MatterJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompositesFactory extends js.Object {
  /**
    * Creates a composite with simple car setup of bodies and constraints.
    * @method car
    * @param {number} xx
    * @param {number} yy
    * @param {number} width
    * @param {number} height
    * @param {number} wheelSize
    * @return {composite} A new composite car body
    */
  def car(xx: Double, yy: Double, width: Double, height: Double, wheelSize: Double): CompositeType
  /**
    * Chains all bodies in the given composite together using constraints.
    * @method chain
    * @param {composite} composite
    * @param {number} xOffsetA
    * @param {number} yOffsetA
    * @param {number} xOffsetB
    * @param {number} yOffsetB
    * @param {object} options
    * @return {composite} A new composite containing objects chained together with constraints
    */
  def chain(
    composite: CompositeType,
    xOffsetA: Double,
    yOffsetA: Double,
    xOffsetB: Double,
    yOffsetB: Double,
    options: js.Any
  ): CompositeType
  /**
    * Connects bodies in the composite with constraints in a grid pattern, with optional cross braces.
    * @method mesh
    * @param {composite} composite
    * @param {number} columns
    * @param {number} rows
    * @param {boolean} crossBrace
    * @param {object} options
    * @return {composite} The composite containing objects meshed together with constraints
    */
  def mesh(composite: CompositeType, columns: Double, rows: Double, crossBrace: Boolean, options: js.Any): CompositeType
  /**
    * Creates a composite with a Newton's Cradle setup of bodies and constraints.
    * @method newtonsCradle
    * @param {number} xx
    * @param {number} yy
    * @param {number} number
    * @param {number} size
    * @param {number} length
    * @return {composite} A new composite newtonsCradle body
    */
  def newtonsCradle(xx: Double, yy: Double, number: Double, size: Double, length: Double): CompositeType
  /**
    * Create a new composite containing bodies created in the callback in a pyramid arrangement.
    * This function uses the body's bounds to prevent overlaps.
    * @method pyramid
    * @param {number} xx
    * @param {number} yy
    * @param {number} columns
    * @param {number} rows
    * @param {number} columnGap
    * @param {number} rowGap
    * @param {function} callback
    * @return {composite} A new composite containing objects created in the callback
    */
  def pyramid(
    xx: Double,
    yy: Double,
    columns: Double,
    rows: Double,
    columnGap: Double,
    rowGap: Double,
    callback: js.Function
  ): CompositeType
  /**
    * Creates a simple soft body like object.
    * @method softBody
    * @param {number} xx
    * @param {number} yy
    * @param {number} columns
    * @param {number} rows
    * @param {number} columnGap
    * @param {number} rowGap
    * @param {boolean} crossBrace
    * @param {number} particleRadius
    * @param {} particleOptions
    * @param {} constraintOptions
    * @return {composite} A new composite softBody
    */
  def softBody(
    xx: Double,
    yy: Double,
    columns: Double,
    rows: Double,
    columnGap: Double,
    rowGap: Double,
    crossBrace: Boolean,
    particleRadius: Double,
    particleOptions: js.Any,
    constraintOptions: js.Any
  ): CompositeType
  /**
    * Create a new composite containing bodies created in the callback in a grid arrangement.
    * This function uses the body's bounds to prevent overlaps.
    * @method stack
    * @param {number} xx
    * @param {number} yy
    * @param {number} columns
    * @param {number} rows
    * @param {number} columnGap
    * @param {number} rowGap
    * @param {function} callback
    * @return {composite} A new composite containing objects created in the callback
    */
  def stack(
    xx: Double,
    yy: Double,
    columns: Double,
    rows: Double,
    columnGap: Double,
    rowGap: Double,
    callback: js.Function
  ): CompositeType
}

object CompositesFactory {
  @scala.inline
  def apply(
    car: (Double, Double, Double, Double, Double) => CompositeType,
    chain: (CompositeType, Double, Double, Double, Double, js.Any) => CompositeType,
    mesh: (CompositeType, Double, Double, Boolean, js.Any) => CompositeType,
    newtonsCradle: (Double, Double, Double, Double, Double) => CompositeType,
    pyramid: (Double, Double, Double, Double, Double, Double, js.Function) => CompositeType,
    softBody: (Double, Double, Double, Double, Double, Double, Boolean, Double, js.Any, js.Any) => CompositeType,
    stack: (Double, Double, Double, Double, Double, Double, js.Function) => CompositeType
  ): CompositesFactory = {
    val __obj = js.Dynamic.literal(car = js.Any.fromFunction5(car), chain = js.Any.fromFunction6(chain), mesh = js.Any.fromFunction5(mesh), newtonsCradle = js.Any.fromFunction5(newtonsCradle), pyramid = js.Any.fromFunction7(pyramid), softBody = js.Any.fromFunction10(softBody), stack = js.Any.fromFunction7(stack))
    __obj.asInstanceOf[CompositesFactory]
  }
}

