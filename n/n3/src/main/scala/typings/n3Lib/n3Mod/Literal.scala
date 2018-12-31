package typings
package n3Lib.n3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("n3", "Literal")
@js.native
class Literal protected ()
  extends rdfDashJsLib.rdfDashJsMod.Literal {
  def this(id: java.lang.String) = this()
  /**
    * A NamedNode whose IRI represents the datatype of the literal.
    */
  /* CompleteClass */
  override var datatype: rdfDashJsLib.rdfDashJsMod.NamedNode = js.native
  val datatypeString: java.lang.String = js.native
  @JSName("datatype")
  val datatype_Literal: NamedNode = js.native
  val id: java.lang.String = js.native
  /**
    * the language as lowercase BCP47 string (examples: en, en-gb)
    * or an empty string if the literal has no language.
    * @link http://tools.ietf.org/html/bcp47
    */
  /* CompleteClass */
  override var language: java.lang.String = js.native
  /**
    * Contains the constant "Literal".
    */
  /* CompleteClass */
  override var termType: rdfDashJsLib.rdfDashJsLibStrings.Literal = js.native
  @JSName("termType")
  val termType_Literal: n3Lib.n3LibStrings.Literal = js.native
  /**
    * The text value, unescaped, without language or type (example: Brad Pitt).
    */
  /* CompleteClass */
  override var value: java.lang.String = js.native
  /**
    * @param other The term to compare with.
    * @return True if and only if other has termType "Literal"
    *                   and the same `value`, `language`, and `datatype`.
    */
  /* CompleteClass */
  override def equals(other: rdfDashJsLib.rdfDashJsMod.Term): scala.Boolean = js.native
  def toJSON(): js.Object = js.native
}

@JSImport("n3", "Literal")
@js.native
object Literal extends js.Object {
  val langStringDatatype: n3Lib.n3Mod.NamedNode = js.native
  def subclass(`type`: js.Any): scala.Unit = js.native
}

