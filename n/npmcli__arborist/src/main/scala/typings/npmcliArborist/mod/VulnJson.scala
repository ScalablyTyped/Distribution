package typings.npmcliArborist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VulnJson extends StObject {
  
  var effects: js.Array[String]
  
  var fixAvailable: Boolean
  
  var isDirect: Boolean
  
  var name: String
  
  var nodes: js.Array[String]
  
  var range: String
  
  var severity: String
  
  var via: js.Array[Advisory]
}
object VulnJson {
  
  inline def apply(
    effects: js.Array[String],
    fixAvailable: Boolean,
    isDirect: Boolean,
    name: String,
    nodes: js.Array[String],
    range: String,
    severity: String,
    via: js.Array[Advisory]
  ): VulnJson = {
    val __obj = js.Dynamic.literal(effects = effects.asInstanceOf[js.Any], fixAvailable = fixAvailable.asInstanceOf[js.Any], isDirect = isDirect.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any], via = via.asInstanceOf[js.Any])
    __obj.asInstanceOf[VulnJson]
  }
  
  extension [Self <: VulnJson](x: Self) {
    
    inline def setEffects(value: js.Array[String]): Self = StObject.set(x, "effects", value.asInstanceOf[js.Any])
    
    inline def setEffectsVarargs(value: String*): Self = StObject.set(x, "effects", js.Array(value*))
    
    inline def setFixAvailable(value: Boolean): Self = StObject.set(x, "fixAvailable", value.asInstanceOf[js.Any])
    
    inline def setIsDirect(value: Boolean): Self = StObject.set(x, "isDirect", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNodes(value: js.Array[String]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesVarargs(value: String*): Self = StObject.set(x, "nodes", js.Array(value*))
    
    inline def setRange(value: String): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setVia(value: js.Array[Advisory]): Self = StObject.set(x, "via", value.asInstanceOf[js.Any])
    
    inline def setViaVarargs(value: Advisory*): Self = StObject.set(x, "via", js.Array(value*))
  }
}
