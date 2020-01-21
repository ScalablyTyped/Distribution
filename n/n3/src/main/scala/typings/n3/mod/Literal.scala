package typings.n3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("n3", "Literal")
@js.native
class Literal protected ()
  extends typings.rdfJs.mod.Literal
     with QuadObject
     with Term {
  def this(id: String) = this()
  val datatypeString: String = js.native
  val id: String = js.native
  def toJSON(): js.Object = js.native
}

/* static members */
@JSImport("n3", "Literal")
@js.native
object Literal extends js.Object {
  val langStringDatatype: NamedNode = js.native
  def subclass(`type`: js.Any): Unit = js.native
}

