package typings.nodeRedEditorClient.mod

import typings.nodeRedEditorClient.nodeRedEditorClientInts.`0`
import typings.nodeRedEditorClient.nodeRedEditorClientInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Node properties
  * Read more: https://nodered.org/docs/creating-nodes/properties
  */
trait NodeProperties extends StObject {
  
  var inputs: js.UndefOr[`0` | `1`] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object NodeProperties {
  
  inline def apply(): NodeProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeProperties]
  }
  
  extension [Self <: NodeProperties](x: Self) {
    
    inline def setInputs(value: `0` | `1`): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
