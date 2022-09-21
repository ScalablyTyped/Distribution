package typings.n3.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("n3", "NamedNode")
@js.native
open class NamedNode[Iri /* <: String */] protected ()
  extends StObject
     with typings.rdfjsTypes.dataModelMod.NamedNode[Iri] {
  def this(iri: Iri) = this()
  
  val id: String = js.native
  
  def toJSON(): js.Object = js.native
}
/* static members */
object NamedNode {
  
  @JSImport("n3", "NamedNode")
  @js.native
  val ^ : js.Any = js.native
  
  inline def subclass(`type`: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("subclass")(`type`.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
