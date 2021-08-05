package typings.openfin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeIntegration extends StObject {
  
  var nodeIntegration: Boolean
  
  var plugins: Boolean
}
object NodeIntegration {
  
  inline def apply(nodeIntegration: Boolean, plugins: Boolean): NodeIntegration = {
    val __obj = js.Dynamic.literal(nodeIntegration = nodeIntegration.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeIntegration]
  }
  
  extension [Self <: NodeIntegration](x: Self) {
    
    inline def setNodeIntegration(value: Boolean): Self = StObject.set(x, "nodeIntegration", value.asInstanceOf[js.Any])
    
    inline def setPlugins(value: Boolean): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
  }
}
