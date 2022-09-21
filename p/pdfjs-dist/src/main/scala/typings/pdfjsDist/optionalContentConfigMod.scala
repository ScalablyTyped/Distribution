package typings.pdfjsDist

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionalContentConfigMod {
  
  @JSImport("pdfjs-dist/types/src/display/optional_content_config", "OptionalContentConfig")
  @js.native
  open class OptionalContentConfig protected () extends StObject {
    def this(data: Any) = this()
    
    var creator: Any = js.native
    
    def getGroup(id: Any): Any = js.native
    
    def getGroups(): Any = js.native
    
    def getOrder(): Any = js.native
    
    def hasInitialVisibility: Boolean = js.native
    
    def isVisible(group: Any): Any = js.native
    
    var name: Any = js.native
    
    /* private */ var `private`: Any = js.native
    
    def setVisibility(id: Any): Unit = js.native
    def setVisibility(id: Any, visible: Boolean): Unit = js.native
  }
}
