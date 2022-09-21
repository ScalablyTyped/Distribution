package typings.n3.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("n3", "DefaultGraph")
@js.native
open class DefaultGraph ()
  extends StObject
     with typings.rdfjsTypes.dataModelMod.DefaultGraph
     with _QuadGraph
     with _Term {
  
  val id: String = js.native
  
  def toJSON(): js.Object = js.native
}
/* static members */
object DefaultGraph {
  
  @JSImport("n3", "DefaultGraph")
  @js.native
  val ^ : js.Any = js.native
  
  inline def subclass(`type`: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("subclass")(`type`.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
