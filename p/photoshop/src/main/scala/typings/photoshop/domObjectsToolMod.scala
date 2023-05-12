package typings.photoshop

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domObjectsToolMod {
  
  @JSImport("photoshop/dom/objects/Tool", "Tool")
  @js.native
  /** @ignore */
  open class Tool () extends StObject {
    
    /* private */ var _id: Any = js.native
    
    /**
      * Name of the tool.
      * @minVersion 23.0
      */
    def id: String = js.native
    def id_=(name: String): Unit = js.native
    
    /**
      * The class name of the referenced object: *"Tool"*.
      * @minVersion 23.0
      */
    def typename: typings.photoshop.photoshopStrings.Tool = js.native
  }
}
