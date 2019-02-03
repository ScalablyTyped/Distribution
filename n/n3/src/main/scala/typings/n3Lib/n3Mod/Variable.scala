package typings
package n3Lib.n3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("n3", "Variable")
@js.native
class Variable protected ()
  extends rdfDashJsLib.rdfDashJsMod.Variable {
  def this(name: java.lang.String) = this()
  val id: java.lang.String = js.native
  /**
    * Contains the constant "Variable".
    */
  /* CompleteClass */
  override var termType: rdfDashJsLib.rdfDashJsLibStrings.Variable = js.native
  @JSName("termType")
  val termType_Variable: n3Lib.n3LibStrings.Variable = js.native
  /**
    * The name of the variable *without* leading ? (example: a).
    */
  /* CompleteClass */
  override var value: java.lang.String = js.native
  /**
    * @param other The term to compare with.
    * @return True if and only if other has termType "Variable" and the same `value`.
    */
  /* CompleteClass */
  override def equals(other: rdfDashJsLib.rdfDashJsMod.Term): scala.Boolean = js.native
  def toJSON(): js.Object = js.native
}

/* static members */
@JSImport("n3", "Variable")
@js.native
object Variable extends js.Object {
  def subclass(`type`: js.Any): scala.Unit = js.native
}

