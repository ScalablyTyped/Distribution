package typings
package n3Lib.n3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("n3", "NamedNode")
@js.native
class NamedNode protected ()
  extends rdfDashJsLib.rdfDashJsMod.NamedNode {
  def this(iri: java.lang.String) = this()
  val id: java.lang.String = js.native
  /**
       * Contains the constant "NamedNode".
       */
  /* CompleteClass */
  override var termType: rdfDashJsLib.rdfDashJsLibStrings.NamedNode = js.native
  @JSName("termType")
  val termType_NamedNode: n3Lib.n3LibStrings.NamedNode = js.native
  /**
       * The IRI of the named node (example: `http://example.org/resource`)
       */
  /* CompleteClass */
  override var value: java.lang.String = js.native
  /**
       * @param other The term to compare with.
       * @return True if and only if other has termType "NamedNode" and the same `value`.
       */
  /* CompleteClass */
  override def equals(other: rdfDashJsLib.rdfDashJsMod.Term): scala.Boolean = js.native
  def toJSON(): js.Object = js.native
}

@JSImport("n3", "NamedNode")
@js.native
object NamedNode extends js.Object {
  def subclass(`type`: js.Any): scala.Unit = js.native
}

