package typings.mendixmodelsdk.mod.expressions

import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "expressions.UnaryOperator")
@js.native
open class UnaryOperator protected ()
  extends typings.mendixmodelsdk.srcGenAllModelClassesMod.expressions.UnaryOperator {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object UnaryOperator {
  
  @JSImport("mendixmodelsdk", "expressions.UnaryOperator")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.UnaryOperator.None")
  @js.native
  def None: typings.mendixmodelsdk.srcGenExpressionsMod.expressions.UnaryOperator = js.native
  inline def None_=(x: typings.mendixmodelsdk.srcGenExpressionsMod.expressions.UnaryOperator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("None")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.UnaryOperator.UnaryMinus")
  @js.native
  def UnaryMinus: typings.mendixmodelsdk.srcGenExpressionsMod.expressions.UnaryOperator = js.native
  inline def UnaryMinus_=(x: typings.mendixmodelsdk.srcGenExpressionsMod.expressions.UnaryOperator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UnaryMinus")(x.asInstanceOf[js.Any])
}
