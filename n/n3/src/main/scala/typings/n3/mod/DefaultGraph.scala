package typings.n3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("n3", "DefaultGraph")
@js.native
class DefaultGraph ()
  extends typings.rdfJs.mod.DefaultGraph
     with QuadGraph
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

