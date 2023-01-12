package typings.meteor.anon

import typings.meteor.meteorStrings.LoadBalanced
import typings.meteor.meteorStrings.ReplicaSetNoPrimary
import typings.meteor.meteorStrings.ReplicaSetWithPrimary
import typings.meteor.meteorStrings.Sharded
import typings.meteor.meteorStrings.Single
import typings.meteor.meteorStrings.Unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTopologyType extends StObject {
  
  val LoadBalanced: typings.meteor.meteorStrings.LoadBalanced
  
  val ReplicaSetNoPrimary: typings.meteor.meteorStrings.ReplicaSetNoPrimary
  
  val ReplicaSetWithPrimary: typings.meteor.meteorStrings.ReplicaSetWithPrimary
  
  val Sharded: typings.meteor.meteorStrings.Sharded
  
  val Single: typings.meteor.meteorStrings.Single
  
  val Unknown: typings.meteor.meteorStrings.Unknown
}
object TypeofTopologyType {
  
  inline def apply(): TypeofTopologyType = {
    val __obj = js.Dynamic.literal(LoadBalanced = "LoadBalanced", ReplicaSetNoPrimary = "ReplicaSetNoPrimary", ReplicaSetWithPrimary = "ReplicaSetWithPrimary", Sharded = "Sharded", Single = "Single", Unknown = "Unknown")
    __obj.asInstanceOf[TypeofTopologyType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofTopologyType] (val x: Self) extends AnyVal {
    
    inline def setLoadBalanced(value: LoadBalanced): Self = StObject.set(x, "LoadBalanced", value.asInstanceOf[js.Any])
    
    inline def setReplicaSetNoPrimary(value: ReplicaSetNoPrimary): Self = StObject.set(x, "ReplicaSetNoPrimary", value.asInstanceOf[js.Any])
    
    inline def setReplicaSetWithPrimary(value: ReplicaSetWithPrimary): Self = StObject.set(x, "ReplicaSetWithPrimary", value.asInstanceOf[js.Any])
    
    inline def setSharded(value: Sharded): Self = StObject.set(x, "Sharded", value.asInstanceOf[js.Any])
    
    inline def setSingle(value: Single): Self = StObject.set(x, "Single", value.asInstanceOf[js.Any])
    
    inline def setUnknown(value: Unknown): Self = StObject.set(x, "Unknown", value.asInstanceOf[js.Any])
  }
}
