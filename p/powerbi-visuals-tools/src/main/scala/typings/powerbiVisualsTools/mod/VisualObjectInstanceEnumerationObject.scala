package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisualObjectInstanceEnumerationObject extends StObject {
  
  /** Defines a set of containers for related object instances. */
  var containers: js.UndefOr[js.Array[VisualObjectInstanceContainer]] = js.undefined
  
  /** The visual object instances. */
  var instances: js.Array[VisualObjectInstance]
}
object VisualObjectInstanceEnumerationObject {
  
  inline def apply(instances: js.Array[VisualObjectInstance]): VisualObjectInstanceEnumerationObject = {
    val __obj = js.Dynamic.literal(instances = instances.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisualObjectInstanceEnumerationObject]
  }
  
  extension [Self <: VisualObjectInstanceEnumerationObject](x: Self) {
    
    inline def setContainers(value: js.Array[VisualObjectInstanceContainer]): Self = StObject.set(x, "containers", value.asInstanceOf[js.Any])
    
    inline def setContainersUndefined: Self = StObject.set(x, "containers", js.undefined)
    
    inline def setContainersVarargs(value: VisualObjectInstanceContainer*): Self = StObject.set(x, "containers", js.Array(value*))
    
    inline def setInstances(value: js.Array[VisualObjectInstance]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesVarargs(value: VisualObjectInstance*): Self = StObject.set(x, "instances", js.Array(value*))
  }
}
