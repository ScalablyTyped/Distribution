package typings.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("p2", "FrictionEquationPool")
@js.native
open class FrictionEquationPool () extends Pool {
  def this(options: PoolOptions) = this()
  
  def create(): FrictionEquation = js.native
  
  def destroy(equation: FrictionEquation): FrictionEquationPool = js.native
}
