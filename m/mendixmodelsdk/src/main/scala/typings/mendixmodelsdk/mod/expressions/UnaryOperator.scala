package typings.mendixmodelsdk.mod.expressions

import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "expressions.UnaryOperator")
@js.native
class UnaryOperator protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.expressions.UnaryOperator {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object UnaryOperator {
  
  @JSImport("mendixmodelsdk", "expressions.UnaryOperator")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.UnaryOperator.None")
  @js.native
  def None: typings.mendixmodelsdk.expressionsMod.expressions.UnaryOperator = js.native
  @scala.inline
  def None_=(x: typings.mendixmodelsdk.expressionsMod.expressions.UnaryOperator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("None")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.UnaryOperator.UnaryMinus")
  @js.native
  def UnaryMinus: typings.mendixmodelsdk.expressionsMod.expressions.UnaryOperator = js.native
  @scala.inline
  def UnaryMinus_=(x: typings.mendixmodelsdk.expressionsMod.expressions.UnaryOperator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UnaryMinus")(x.asInstanceOf[js.Any])
}
