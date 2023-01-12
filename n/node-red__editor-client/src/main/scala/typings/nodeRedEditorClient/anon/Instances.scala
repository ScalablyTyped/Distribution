package typings.nodeRedEditorClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Instances extends StObject {
  
  var instances: js.Array[js.Object]
}
object Instances {
  
  inline def apply(instances: js.Array[js.Object]): Instances = {
    val __obj = js.Dynamic.literal(instances = instances.asInstanceOf[js.Any])
    __obj.asInstanceOf[Instances]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Instances] (val x: Self) extends AnyVal {
    
    inline def setInstances(value: js.Array[js.Object]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesVarargs(value: js.Object*): Self = StObject.set(x, "instances", js.Array(value*))
  }
}
