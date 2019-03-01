package typings
package n3Lib.n3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("n3", "DefaultGraph")
@js.native
class DefaultGraph ()
  extends rdfDashJsLib.rdfDashJsMod.DefaultGraph
     with Quad_Graph
     with Term {
  val id: java.lang.String = js.native
  /**
    * Contains the constant "DefaultGraph".
    */
  /* CompleteClass */
  override var termType: rdfDashJsLib.rdfDashJsLibStrings.DefaultGraph = js.native
  @JSName("termType")
  val termType_DefaultGraph: n3Lib.n3LibStrings.DefaultGraph = js.native
  /**
    * Contains an empty string as constant value.
    */
  /* CompleteClass */
  override var value: rdfDashJsLib.rdfDashJsLibStrings.Empty = js.native
  @JSName("value")
  val value_DefaultGraph: n3Lib.n3LibStrings.Empty = js.native
  /**
    * @param other The term to compare with.
    * @return True if and only if other has termType "DefaultGraph".
    */
  /* CompleteClass */
  override def equals(other: rdfDashJsLib.rdfDashJsMod.Term): scala.Boolean = js.native
  def toJSON(): js.Object = js.native
}

/* static members */
@JSImport("n3", "DefaultGraph")
@js.native
object DefaultGraph extends js.Object {
  def subclass(`type`: js.Any): scala.Unit = js.native
}

