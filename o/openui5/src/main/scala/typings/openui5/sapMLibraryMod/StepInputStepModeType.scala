package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StepInputStepModeType extends StObject
@JSImport("sap/m/library", "StepInputStepModeType")
@js.native
object StepInputStepModeType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[StepInputStepModeType & String] = js.native
  
  /**
    * Choosing increase/decrease button will add/subtract the `step` value to/from the current value. For example,
    * if `step` is 5, current `value` is 17 and increase button is chosen, the result will be 22 (5+17).
    *
    * **Note:** Using keyboard PageUp/PageDown will add/subtract the `step` multiplied by the `largerStep`
    * values to/from the current `value`. For example, if `step` is 5, `largerStep` is 3, current `value` is
    * 17 and PageUp is chosen, the result would be 32 (5*3+17).
    *
    * For more information, see {@link sap.m.StepInput}'s `step`, `largerStep` and `stepMode` properties.
    */
  @js.native
  sealed trait AdditionAndSubtraction
    extends StObject
       with StepInputStepModeType
  /* "AdditionAndSubtraction" */ val AdditionAndSubtraction: typings.openui5.sapMLibraryMod.StepInputStepModeType.AdditionAndSubtraction & String = js.native
  
  /**
    * Pressing increase/decrease button will increase/decrease the current `value` to the closest number that
    * is divisible by the `step`.
    *
    * For example, if `step` is 5, current `value` is 17 and increase button is chosen, the result will be
    * 20 as it is the closest larger number that is divisible by 5.
    *
    * **Note:** Using keyboard PageUp/PageDown will increase/decrease the current `value` to the closest number
    * that is divisible by the multiplication of the `step` and the `largerStep` values. For example, if `step`
    * is 5, `largerStep` is 3, current `value` is 17 and PageUp is chosen, the result would be 30 as it is
    * the closest larger number that is divisible by 15.
    *
    * The logic above will work only if both `step` and `largerStep` are integers.
    *
    * For more information, see {@link sap.m.StepInput}'s `step`, `largerStep` and `stepMode` properties.
    */
  @js.native
  sealed trait Multiple
    extends StObject
       with StepInputStepModeType
  /* "Multiple" */ val Multiple: typings.openui5.sapMLibraryMod.StepInputStepModeType.Multiple & String = js.native
}
