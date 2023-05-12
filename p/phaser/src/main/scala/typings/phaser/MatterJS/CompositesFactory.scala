package typings.phaser.MatterJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompositesFactory extends StObject {
  
  /**
    * Creates a composite with simple car setup of bodies and constraints.
    * @method car
    * @param {number} x
    * @param {number} y
    * @param {number} width
    * @param {number} height
    * @param {number} wheelSize
    * @return {composite} A new composite car body
    */
  def car(x: Double, y: Double, width: Double, height: Double, wheelSize: Double): CompositeType
  
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
    options: Any
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
  def mesh(composite: CompositeType, columns: Double, rows: Double, crossBrace: Boolean, options: Any): CompositeType
  
  /**
    * Creates a composite with a Newton's Cradle setup of bodies and constraints.
    * @method newtonsCradle
    * @param {number} x
    * @param {number} y
    * @param {number} number
    * @param {number} size
    * @param {number} length
    * @return {composite} A new composite newtonsCradle body
    */
  def newtonsCradle(x: Double, y: Double, number: Double, size: Double, length: Double): CompositeType
  
  /**
    * Create a new composite containing bodies created in the callback in a pyramid arrangement.
    * This function uses the body's bounds to prevent overlaps.
    * @method pyramid
    * @param {number} x
    * @param {number} y
    * @param {number} columns
    * @param {number} rows
    * @param {number} columnGap
    * @param {number} rowGap
    * @param {function} callback
    * @return {composite} A new composite containing objects created in the callback
    */
  def pyramid(
    x: Double,
    y: Double,
    columns: Double,
    rows: Double,
    columnGap: Double,
    rowGap: Double,
    callback: js.Function
  ): CompositeType
  
  /**
    * Creates a simple soft body like object.
    * @method softBody
    * @param {number} x
    * @param {number} y
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
    x: Double,
    y: Double,
    columns: Double,
    rows: Double,
    columnGap: Double,
    rowGap: Double,
    crossBrace: Boolean,
    particleRadius: Double,
    particleOptions: Any,
    constraintOptions: Any
  ): CompositeType
  
  /**
    * Create a new composite containing bodies created in the callback in a grid arrangement.
    * This function uses the body's bounds to prevent overlaps.
    * @method stack
    * @param {number} x
    * @param {number} y
    * @param {number} columns
    * @param {number} rows
    * @param {number} columnGap
    * @param {number} rowGap
    * @param {function} callback
    * @return {composite} A new composite containing objects created in the callback
    */
  def stack(
    x: Double,
    y: Double,
    columns: Double,
    rows: Double,
    columnGap: Double,
    rowGap: Double,
    callback: js.Function
  ): CompositeType
}
object CompositesFactory {
  
  inline def apply(
    car: (Double, Double, Double, Double, Double) => CompositeType,
    chain: (CompositeType, Double, Double, Double, Double, Any) => CompositeType,
    mesh: (CompositeType, Double, Double, Boolean, Any) => CompositeType,
    newtonsCradle: (Double, Double, Double, Double, Double) => CompositeType,
    pyramid: (Double, Double, Double, Double, Double, Double, js.Function) => CompositeType,
    softBody: (Double, Double, Double, Double, Double, Double, Boolean, Double, Any, Any) => CompositeType,
    stack: (Double, Double, Double, Double, Double, Double, js.Function) => CompositeType
  ): CompositesFactory = {
    val __obj = js.Dynamic.literal(car = js.Any.fromFunction5(car), chain = js.Any.fromFunction6(chain), mesh = js.Any.fromFunction5(mesh), newtonsCradle = js.Any.fromFunction5(newtonsCradle), pyramid = js.Any.fromFunction7(pyramid), softBody = js.Any.fromFunction10(softBody), stack = js.Any.fromFunction7(stack))
    __obj.asInstanceOf[CompositesFactory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompositesFactory] (val x: Self) extends AnyVal {
    
    inline def setCar(value: (Double, Double, Double, Double, Double) => CompositeType): Self = StObject.set(x, "car", js.Any.fromFunction5(value))
    
    inline def setChain(value: (CompositeType, Double, Double, Double, Double, Any) => CompositeType): Self = StObject.set(x, "chain", js.Any.fromFunction6(value))
    
    inline def setMesh(value: (CompositeType, Double, Double, Boolean, Any) => CompositeType): Self = StObject.set(x, "mesh", js.Any.fromFunction5(value))
    
    inline def setNewtonsCradle(value: (Double, Double, Double, Double, Double) => CompositeType): Self = StObject.set(x, "newtonsCradle", js.Any.fromFunction5(value))
    
    inline def setPyramid(value: (Double, Double, Double, Double, Double, Double, js.Function) => CompositeType): Self = StObject.set(x, "pyramid", js.Any.fromFunction7(value))
    
    inline def setSoftBody(
      value: (Double, Double, Double, Double, Double, Double, Boolean, Double, Any, Any) => CompositeType
    ): Self = StObject.set(x, "softBody", js.Any.fromFunction10(value))
    
    inline def setStack(value: (Double, Double, Double, Double, Double, Double, js.Function) => CompositeType): Self = StObject.set(x, "stack", js.Any.fromFunction7(value))
  }
}
