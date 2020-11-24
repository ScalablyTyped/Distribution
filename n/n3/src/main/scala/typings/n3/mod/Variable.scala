package typings.n3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("n3", "Variable")
@js.native
class Variable protected ()
  extends typings.rdfJs.mod.Variable
     with _QuadGraph
     with _QuadObject
     with _QuadSubject
     with _Term {
  def this(name: String) = this()
  
  val id: String = js.native
  
  def toJSON(): js.Object = js.native
}
/* static members */
@JSImport("n3", "Variable")
@js.native
object Variable extends js.Object {
  
  def subclass(`type`: js.Any): Unit = js.native
}
