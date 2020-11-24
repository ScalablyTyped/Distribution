package typings.n3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("n3", "NamedNode")
@js.native
class NamedNode[Iri /* <: String */] protected ()
  extends typings.rdfJs.mod.NamedNode[Iri] {
  def this(iri: Iri) = this()
  
  val id: String = js.native
  
  def toJSON(): js.Object = js.native
}
/* static members */
@JSImport("n3", "NamedNode")
@js.native
object NamedNode extends js.Object {
  
  def subclass(`type`: js.Any): Unit = js.native
}
