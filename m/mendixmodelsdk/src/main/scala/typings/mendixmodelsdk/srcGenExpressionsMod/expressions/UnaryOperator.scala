package typings.mendixmodelsdk.srcGenExpressionsMod.expressions

import typings.mendixmodelsdk.srcSdkInternalMod.AbstractEnum
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/expressions", "expressions.UnaryOperator")
@js.native
open class UnaryOperator protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object UnaryOperator {
  
  @JSImport("mendixmodelsdk/src/gen/expressions", "expressions.UnaryOperator")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/expressions", "expressions.UnaryOperator.None")
  @js.native
  def None: UnaryOperator = js.native
  inline def None_=(x: UnaryOperator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("None")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/expressions", "expressions.UnaryOperator.UnaryMinus")
  @js.native
  def UnaryMinus: UnaryOperator = js.native
  inline def UnaryMinus_=(x: UnaryOperator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UnaryMinus")(x.asInstanceOf[js.Any])
}
