package typings.n3.n3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("n3", "BlankNode")
@js.native
class BlankNode protected ()
  extends typings.rdfDashJs.rdfDashJsMod.BlankNode
     with Quad_Graph
     with Quad_Object
     with Quad_Subject
     with Term {
  def this(name: String) = this()
  val id: String = js.native
  /**
    * Contains the constant "BlankNode".
    */
  /* CompleteClass */
  override var termType: typings.rdfDashJs.rdfDashJsStrings.BlankNode = js.native
  @JSName("termType")
  val termType_BlankNode: typings.n3.n3Strings.BlankNode = js.native
  /**
    * Blank node name as a string, without any serialization specific prefixes,
    * e.g. when parsing,
    * if the data was sourced from Turtle, remove _:,
    * if it was sourced from RDF/XML, do not change the blank node name (example: blank3).
    */
  /* CompleteClass */
  override var value: String = js.native
  /**
    * @param other The term to compare with.
    * @return True if and only if other has termType "BlankNode" and the same `value`.
    */
  /* CompleteClass */
  override def equals(other: typings.rdfDashJs.rdfDashJsMod.Term): Boolean = js.native
  def toJSON(): js.Object = js.native
}

/* static members */
@JSImport("n3", "BlankNode")
@js.native
object BlankNode extends js.Object {
  var nextId: Double = js.native
  def subclass(`type`: js.Any): Unit = js.native
}

