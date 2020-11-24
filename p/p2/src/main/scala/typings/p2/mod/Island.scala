package typings.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("p2", "Island")
@js.native
class Island () extends js.Object {
  
  var bodies: js.Array[Body] = js.native
  
  var equations: js.Array[Equation] = js.native
  
  def getBodies(result: js.Array[_]): js.Array[Body] = js.native
  
  def reset(): Unit = js.native
  
  def sleep(): Boolean = js.native
  
  def wantsToSleep(): Boolean = js.native
}
