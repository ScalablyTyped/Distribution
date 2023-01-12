package typings.meteor.anon

import typings.meteor.meteorStrings.LoadBalancer
import typings.meteor.meteorStrings.Mongos
import typings.meteor.meteorStrings.PossiblePrimary
import typings.meteor.meteorStrings.RSArbiter
import typings.meteor.meteorStrings.RSGhost
import typings.meteor.meteorStrings.RSOther
import typings.meteor.meteorStrings.RSPrimary
import typings.meteor.meteorStrings.RSSecondary
import typings.meteor.meteorStrings.Standalone
import typings.meteor.meteorStrings.Unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofServerType extends StObject {
  
  val LoadBalancer: typings.meteor.meteorStrings.LoadBalancer
  
  val Mongos: typings.meteor.meteorStrings.Mongos
  
  val PossiblePrimary: typings.meteor.meteorStrings.PossiblePrimary
  
  val RSArbiter: typings.meteor.meteorStrings.RSArbiter
  
  val RSGhost: typings.meteor.meteorStrings.RSGhost
  
  val RSOther: typings.meteor.meteorStrings.RSOther
  
  val RSPrimary: typings.meteor.meteorStrings.RSPrimary
  
  val RSSecondary: typings.meteor.meteorStrings.RSSecondary
  
  val Standalone: typings.meteor.meteorStrings.Standalone
  
  val Unknown: typings.meteor.meteorStrings.Unknown
}
object TypeofServerType {
  
  inline def apply(): TypeofServerType = {
    val __obj = js.Dynamic.literal(LoadBalancer = "LoadBalancer", Mongos = "Mongos", PossiblePrimary = "PossiblePrimary", RSArbiter = "RSArbiter", RSGhost = "RSGhost", RSOther = "RSOther", RSPrimary = "RSPrimary", RSSecondary = "RSSecondary", Standalone = "Standalone", Unknown = "Unknown")
    __obj.asInstanceOf[TypeofServerType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofServerType] (val x: Self) extends AnyVal {
    
    inline def setLoadBalancer(value: LoadBalancer): Self = StObject.set(x, "LoadBalancer", value.asInstanceOf[js.Any])
    
    inline def setMongos(value: Mongos): Self = StObject.set(x, "Mongos", value.asInstanceOf[js.Any])
    
    inline def setPossiblePrimary(value: PossiblePrimary): Self = StObject.set(x, "PossiblePrimary", value.asInstanceOf[js.Any])
    
    inline def setRSArbiter(value: RSArbiter): Self = StObject.set(x, "RSArbiter", value.asInstanceOf[js.Any])
    
    inline def setRSGhost(value: RSGhost): Self = StObject.set(x, "RSGhost", value.asInstanceOf[js.Any])
    
    inline def setRSOther(value: RSOther): Self = StObject.set(x, "RSOther", value.asInstanceOf[js.Any])
    
    inline def setRSPrimary(value: RSPrimary): Self = StObject.set(x, "RSPrimary", value.asInstanceOf[js.Any])
    
    inline def setRSSecondary(value: RSSecondary): Self = StObject.set(x, "RSSecondary", value.asInstanceOf[js.Any])
    
    inline def setStandalone(value: Standalone): Self = StObject.set(x, "Standalone", value.asInstanceOf[js.Any])
    
    inline def setUnknown(value: Unknown): Self = StObject.set(x, "Unknown", value.asInstanceOf[js.Any])
  }
}
