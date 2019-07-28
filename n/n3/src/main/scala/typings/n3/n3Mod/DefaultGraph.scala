package typings.n3.n3Mod

import typings.rdfDashJs.rdfDashJsStrings.Empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("n3", "DefaultGraph")
@js.native
class DefaultGraph ()
  extends typings.rdfDashJs.rdfDashJsMod.DefaultGraph
     with Quad_Graph
     with Term {
  val id: String = js.native
  /**
    * Contains the constant "DefaultGraph".
    */
  /* CompleteClass */
  override var termType: typings.rdfDashJs.rdfDashJsStrings.DefaultGraph = js.native
  @JSName("termType")
  val termType_DefaultGraph: typings.n3.n3Strings.DefaultGraph = js.native
  /**
    * Contains an empty string as constant value.
    */
  /* CompleteClass */
  override var value: Empty = js.native
  @JSName("value")
  val value_DefaultGraph: typings.n3.n3Strings.Empty = js.native
  /**
    * @param other The term to compare with.
    * @return True if and only if other has termType "DefaultGraph".
    */
  /* CompleteClass */
  override def equals(other: typings.rdfDashJs.rdfDashJsMod.Term): Boolean = js.native
  def toJSON(): js.Object = js.native
}

/* static members */
@JSImport("n3", "DefaultGraph")
@js.native
object DefaultGraph extends js.Object {
  def subclass(`type`: js.Any): Unit = js.native
}

