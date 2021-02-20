package typings.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("p2", "ContactEquationPool")
@js.native
class ContactEquationPool () extends Pool {
  def this(options: PoolOptions) = this()
  
  def create(): ContactEquation = js.native
  
  def destroy(equation: ContactEquation): ContactEquationPool = js.native
}
