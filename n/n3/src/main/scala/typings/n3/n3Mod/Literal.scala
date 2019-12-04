package typings.n3.n3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("n3", "Literal")
@js.native
class Literal protected ()
  extends typings.rdfDashJs.rdfDashJsMod.Literal
     with Quad_Object
     with Term {
  def this(id: String) = this()
  /**
    * A NamedNode whose IRI represents the datatype of the literal.
    */
  /* CompleteClass */
  override var datatype: typings.rdfDashJs.rdfDashJsMod.NamedNode = js.native
  val datatypeString: String = js.native
  val id: String = js.native
  /**
    * the language as lowercase BCP47 string (examples: en, en-gb)
    * or an empty string if the literal has no language.
    * @link http://tools.ietf.org/html/bcp47
    */
  /* CompleteClass */
  override var language: String = js.native
  /**
    * Contains the constant "Literal".
    */
  /* CompleteClass */
  override var termType: typings.rdfDashJs.rdfDashJsStrings.Literal = js.native
  /**
    * The text value, unescaped, without language or type (example: Brad Pitt).
    */
  /* CompleteClass */
  override var value: String = js.native
  /**
    * @param other The term to compare with.
    * @return True if and only if other has termType "Literal"
    *                   and the same `value`, `language`, and `datatype`.
    */
  /* CompleteClass */
  override def equals(other: typings.rdfDashJs.rdfDashJsMod.Term): Boolean = js.native
  def toJSON(): js.Object = js.native
}

/* static members */
@JSImport("n3", "Literal")
@js.native
object Literal extends js.Object {
  val langStringDatatype: NamedNode = js.native
  def subclass(`type`: js.Any): Unit = js.native
}

