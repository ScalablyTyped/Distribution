package typings.n3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("n3", "BlankNode")
@js.native
class BlankNode protected ()
  extends typings.rdfJs.mod.BlankNode
     with QuadGraph
     with QuadObject
     with QuadSubject
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

