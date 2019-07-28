package typings.n3.n3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("n3", "NamedNode")
@js.native
class NamedNode protected ()
  extends typings.rdfDashJs.rdfDashJsMod.NamedNode
     with Quad_Graph
     with Quad_Object
     with Quad_Predicate
     with Quad_Subject
     with Term {
  def this(iri: String) = this()
  val id: String = js.native
  /**
    * Contains the constant "NamedNode".
    */
  /* CompleteClass */
  override var termType: typings.rdfDashJs.rdfDashJsStrings.NamedNode = js.native
  @JSName("termType")
  val termType_NamedNode: typings.n3.n3Strings.NamedNode = js.native
  /**
    * The IRI of the named node (example: `http://example.org/resource`)
    */
  /* CompleteClass */
  override var value: String = js.native
  /**
    * @param other The term to compare with.
    * @return True if and only if other has termType "NamedNode" and the same `value`.
    */
  /* CompleteClass */
  override def equals(other: typings.rdfDashJs.rdfDashJsMod.Term): Boolean = js.native
  def toJSON(): js.Object = js.native
}

/* static members */
@JSImport("n3", "NamedNode")
@js.native
object NamedNode extends js.Object {
  def subclass(`type`: js.Any): Unit = js.native
}

