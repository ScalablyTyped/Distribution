package typings.n3.n3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("n3", "Variable")
@js.native
class Variable protected ()
  extends typings.rdfDashJs.rdfDashJsMod.Variable
     with Quad_Graph
     with Quad_Object
     with Quad_Predicate
     with Quad_Subject
     with Term {
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

