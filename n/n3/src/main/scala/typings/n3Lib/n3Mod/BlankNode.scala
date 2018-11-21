package typings
package n3Lib.n3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("n3", "BlankNode")
@js.native
class BlankNode protected ()
  extends rdfDashJsLib.rdfDashJsMod.BlankNode {
  def this(name: java.lang.String) = this()
  val id: java.lang.String = js.native
  /**
       * Contains the constant "BlankNode".
       */
  /* CompleteClass */
  override var termType: rdfDashJsLib.rdfDashJsLibStrings.BlankNode = js.native
  @JSName("termType")
  val termType_BlankNode: n3Lib.n3LibStrings.BlankNode = js.native
  /**
       * Blank node name as a string, without any serialization specific prefixes,
       * e.g. when parsing,
       * if the data was sourced from Turtle, remove _:,
       * if it was sourced from RDF/XML, do not change the blank node name (example: blank3).
       */
  /* CompleteClass */
  override var value: java.lang.String = js.native
  /**
       * @param other The term to compare with.
       * @return True if and only if other has termType "BlankNode" and the same `value`.
       */
  /* CompleteClass */
  override def equals(other: rdfDashJsLib.rdfDashJsMod.Term): scala.Boolean = js.native
  def toJSON(): js.Object = js.native
}

@JSImport("n3", "BlankNode")
@js.native
object BlankNode extends js.Object {
  var nextId: scala.Double = js.native
  def subclass(`type`: js.Any): scala.Unit = js.native
}

