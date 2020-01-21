package typings.n3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("n3", "Variable")
@js.native
class Variable protected ()
  extends typings.rdfJs.mod.Variable
     with QuadGraph
     with QuadObject
     with QuadSubject
     with Quad_Predicate
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

