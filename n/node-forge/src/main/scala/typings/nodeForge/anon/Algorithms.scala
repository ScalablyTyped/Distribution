package typings.nodeForge.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Algorithms extends StObject {
  
  var algorithms: Md5
  
  var md5: `4`
  
  var sha1: Create
  
  var sha256: `0`
  
  var sha512: Sha224
}
object Algorithms {
  
  inline def apply(algorithms: Md5, md5: `4`, sha1: Create, sha256: `0`, sha512: Sha224): Algorithms = {
    val __obj = js.Dynamic.literal(algorithms = algorithms.asInstanceOf[js.Any], md5 = md5.asInstanceOf[js.Any], sha1 = sha1.asInstanceOf[js.Any], sha256 = sha256.asInstanceOf[js.Any], sha512 = sha512.asInstanceOf[js.Any])
    __obj.asInstanceOf[Algorithms]
  }
  
  extension [Self <: Algorithms](x: Self) {
    
    inline def setAlgorithms(value: Md5): Self = StObject.set(x, "algorithms", value.asInstanceOf[js.Any])
    
    inline def setMd5(value: `4`): Self = StObject.set(x, "md5", value.asInstanceOf[js.Any])
    
    inline def setSha1(value: Create): Self = StObject.set(x, "sha1", value.asInstanceOf[js.Any])
    
    inline def setSha256(value: `0`): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
    
    inline def setSha512(value: Sha224): Self = StObject.set(x, "sha512", value.asInstanceOf[js.Any])
  }
}
