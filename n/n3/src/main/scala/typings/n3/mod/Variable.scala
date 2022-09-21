package typings.n3.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("n3", "Variable")
@js.native
open class Variable protected ()
  extends StObject
     with typings.rdfjsTypes.dataModelMod.Variable
     with _QuadGraph
     with _QuadObject
     with _QuadSubject
     with _Term {
  def this(name: String) = this()
  
  val id: String = js.native
  
  def toJSON(): js.Object = js.native
}
/* static members */
object Variable {
  
  @JSImport("n3", "Variable")
  @js.native
  val ^ : js.Any = js.native
  
  inline def subclass(`type`: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("subclass")(`type`.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
