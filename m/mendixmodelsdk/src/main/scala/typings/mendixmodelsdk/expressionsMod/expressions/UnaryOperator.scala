package typings.mendixmodelsdk.expressionsMod.expressions

import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.UnaryOperator")
@js.native
class UnaryOperator protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object UnaryOperator {
  
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.UnaryOperator")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.UnaryOperator.None")
  @js.native
  def None: UnaryOperator = js.native
  @scala.inline
  def None_=(x: UnaryOperator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("None")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.UnaryOperator.UnaryMinus")
  @js.native
  def UnaryMinus: UnaryOperator = js.native
  @scala.inline
  def UnaryMinus_=(x: UnaryOperator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UnaryMinus")(x.asInstanceOf[js.Any])
}
