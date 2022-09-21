package typings.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("p2", "Island")
@js.native
open class Island () extends StObject {
  
  var bodies: js.Array[Body] = js.native
  
  var equations: js.Array[Equation] = js.native
  
  def getBodies(result: js.Array[Any]): js.Array[Body] = js.native
  
  def reset(): Unit = js.native
  
  def sleep(): Boolean = js.native
  
  def wantsToSleep(): Boolean = js.native
}
