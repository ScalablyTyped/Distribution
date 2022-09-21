package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object javaRequestMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/java/JavaRequest", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with JavaRequest
  @JSImport("@nginstack/engine/lib/java/JavaRequest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait JavaRequest extends StObject {
    
    def getParameter(indexOrName: String): String = js.native
    def getParameter(indexOrName: Double): String = js.native
    
    def getParameterCount(): Double = js.native
    
    def getParameterName(index: Double): String = js.native
  }
}
