package typings.multiformats.anon

import typings.multiformats.cidMod.CIDVersion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Codec extends StObject {
  
  var codec: Double
  
  var digestSize: Double
  
  var multihashCode: Double
  
  var multihashSize: Double
  
  var size: Double
  
  var version: CIDVersion
}
object Codec {
  
  inline def apply(
    codec: Double,
    digestSize: Double,
    multihashCode: Double,
    multihashSize: Double,
    size: Double,
    version: CIDVersion
  ): Codec = {
    val __obj = js.Dynamic.literal(codec = codec.asInstanceOf[js.Any], digestSize = digestSize.asInstanceOf[js.Any], multihashCode = multihashCode.asInstanceOf[js.Any], multihashSize = multihashSize.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Codec]
  }
  
  extension [Self <: Codec](x: Self) {
    
    inline def setCodec(value: Double): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
    
    inline def setDigestSize(value: Double): Self = StObject.set(x, "digestSize", value.asInstanceOf[js.Any])
    
    inline def setMultihashCode(value: Double): Self = StObject.set(x, "multihashCode", value.asInstanceOf[js.Any])
    
    inline def setMultihashSize(value: Double): Self = StObject.set(x, "multihashSize", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: CIDVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
