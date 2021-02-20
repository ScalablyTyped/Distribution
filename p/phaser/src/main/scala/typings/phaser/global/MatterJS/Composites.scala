package typings.phaser.global.MatterJS

import typings.phaser.MatterJS.CompositeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `Matter.Composites` module contains factory methods for creating composite bodies
  * with commonly used configurations (such as stacks and chains).
  *
  * See the included usage [examples](https://github.com/liabru/matter-js/tree/master/examples).
  *
  * @class Composites
  */
@JSGlobal("MatterJS.Composites")
@js.native
class Composites ()
  extends typings.phaser.MatterJS.Composites
object Composites {
  
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
  /* static member */
  @JSGlobal("MatterJS.Composites.car")
  @js.native
  def car(xx: Double, yy: Double, width: Double, height: Double, wheelSize: Double): CompositeType = js.native
  
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
  /* static member */
  @JSGlobal("MatterJS.Composites.chain")
  @js.native
  def chain(
    composite: CompositeType,
    xOffsetA: Double,
    yOffsetA: Double,
    xOffsetB: Double,
    yOffsetB: Double,
    options: js.Any
  ): CompositeType = js.native
  
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
  /* static member */
  @JSGlobal("MatterJS.Composites.mesh")
  @js.native
  def mesh(composite: CompositeType, columns: Double, rows: Double, crossBrace: Boolean, options: js.Any): CompositeType = js.native
  
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
  /* static member */
  @JSGlobal("MatterJS.Composites.newtonsCradle")
  @js.native
  def newtonsCradle(xx: Double, yy: Double, number: Double, size: Double, length: Double): CompositeType = js.native
  
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
  /* static member */
  @JSGlobal("MatterJS.Composites.pyramid")
  @js.native
  def pyramid(
    xx: Double,
    yy: Double,
    columns: Double,
    rows: Double,
    columnGap: Double,
    rowGap: Double,
    callback: js.Function
  ): CompositeType = js.native
  
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
  /* static member */
  @JSGlobal("MatterJS.Composites.softBody")
  @js.native
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
  ): CompositeType = js.native
  
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
  /* static member */
  @JSGlobal("MatterJS.Composites.stack")
  @js.native
  def stack(
    xx: Double,
    yy: Double,
    columns: Double,
    rows: Double,
    columnGap: Double,
    rowGap: Double,
    callback: js.Function
  ): CompositeType = js.native
}
