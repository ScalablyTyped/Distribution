package typings.n3.n3Mod

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
  def toJSON(): js.Object = js.native
}

/* static members */
@JSImport("n3", "DefaultGraph")
@js.native
object DefaultGraph extends js.Object {
  def subclass(`type`: js.Any): Unit = js.native
}

