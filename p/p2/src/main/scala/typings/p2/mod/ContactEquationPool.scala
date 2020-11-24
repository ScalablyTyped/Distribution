package typings.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("p2", "ContactEquationPool")
@js.native
class ContactEquationPool () extends Pool {
  
  def create(): ContactEquation = js.native
  
  def destroy(equation: ContactEquation): ContactEquationPool = js.native
}
