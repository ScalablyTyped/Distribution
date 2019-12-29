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
  def toJSON(): js.Object = js.native
}

/* static members */
@JSImport("n3", "BlankNode")
@js.native
object BlankNode extends js.Object {
  var nextId: Double = js.native
  def subclass(`type`: js.Any): Unit = js.native
}

