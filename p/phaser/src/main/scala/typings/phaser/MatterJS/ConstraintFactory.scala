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
}
object ConstraintFactory {
  
  inline def apply(create: IConstraintDefinition => ConstraintType): ConstraintFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[ConstraintFactory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConstraintFactory] (val x: Self) extends AnyVal {
    
    inline def setCreate(value: IConstraintDefinition => ConstraintType): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
  }
}
