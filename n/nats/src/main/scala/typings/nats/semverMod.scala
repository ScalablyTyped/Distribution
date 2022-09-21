package typings.nats

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object semverMod {
  
  @JSImport("nats/lib/nats-base-client/semver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compare(a: SemVer, b: SemVer): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def parseSemVer(s: String): SemVer = ^.asInstanceOf[js.Dynamic].applyDynamic("parseSemVer")(s.asInstanceOf[js.Any]).asInstanceOf[SemVer]
  
  trait SemVer extends StObject {
    
    var major: Double
    
    var micro: Double
    
    var minor: Double
  }
  object SemVer {
    
    inline def apply(major: Double, micro: Double, minor: Double): SemVer = {
      val __obj = js.Dynamic.literal(major = major.asInstanceOf[js.Any], micro = micro.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any])
      __obj.asInstanceOf[SemVer]
    }
    
    extension [Self <: SemVer](x: Self) {
      
      inline def setMajor(value: Double): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
      
      inline def setMicro(value: Double): Self = StObject.set(x, "micro", value.asInstanceOf[js.Any])
      
      inline def setMinor(value: Double): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
    }
  }
}
