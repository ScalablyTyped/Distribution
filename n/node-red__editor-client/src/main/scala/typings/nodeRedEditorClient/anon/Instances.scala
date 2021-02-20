package typings.nodeRedEditorClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Instances extends StObject {
  
  var instances: js.Array[js.Object] = js.native
}
object Instances {
  
  @scala.inline
  def apply(instances: js.Array[js.Object]): Instances = {
    val __obj = js.Dynamic.literal(instances = instances.asInstanceOf[js.Any])
    __obj.asInstanceOf[Instances]
  }
  
  @scala.inline
  implicit class InstancesMutableBuilder[Self <: Instances] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstances(value: js.Array[js.Object]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesVarargs(value: js.Object*): Self = StObject.set(x, "instances", js.Array(value :_*))
  }
}
