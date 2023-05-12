package typings.phaser.MatterJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConstraintFactory extends StObject {
  
  /**
    * Creates a new constraint.
    * All properties have default values, and many are pre-calculated automatically based on other properties.
    * See the properties section below for detailed information on what you can pass via the `options` object.
    * @method create
    * @param {} options
    * @return {constraint} constraint
    */
  def create(options: IConstraintDefinition): ConstraintType
  
  /**
    * Returns the current length of the constraint.
    * This is the distance between both of the constraint's end points.
    * See `constraint.length` for the target rest length.
    * @method currentLength
    * @param {constraint} ConstraintType
    * @return {number} the current length
    */
  def currentLength(constraint: ConstraintType): Double
}
object ConstraintFactory {
  
  inline def apply(create: IConstraintDefinition => ConstraintType, currentLength: ConstraintType => Double): ConstraintFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), currentLength = js.Any.fromFunction1(currentLength))
    __obj.asInstanceOf[ConstraintFactory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConstraintFactory] (val x: Self) extends AnyVal {
    
    inline def setCreate(value: IConstraintDefinition => ConstraintType): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    
    inline def setCurrentLength(value: ConstraintType => Double): Self = StObject.set(x, "currentLength", js.Any.fromFunction1(value))
  }
}
