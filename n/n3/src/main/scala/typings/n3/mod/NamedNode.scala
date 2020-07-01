package typings.n3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("n3", "NamedNode")
@js.native
class NamedNode protected ()
  extends typings.rdfJs.mod.NamedNode[String]
     with QuadGraph
     with QuadObject
     with QuadSubject
     with Quad_Predicate
     with Term {
  def this(iri: String) = this()
  val id: String = js.native
  def toJSON(): js.Object = js.native
}

/* static members */
@JSImport("n3", "NamedNode")
@js.native
object NamedNode extends js.Object {
  def subclass(`type`: js.Any): Unit = js.native
}

