package typings.multiformats.anon

import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Codec[V_1 /* <: Version */, C_1 /* <: Double */, A_1 /* <: Double */] extends StObject {
  
  var codec: C_1
  
  var digestSize: Double
  
  var multihashCode: A_1
  
  var multihashSize: Double
  
  var size: Double
  
  var version: V_1
}
object Codec {
  
  inline def apply[V_1 /* <: Version */, C_1 /* <: Double */, A_1 /* <: Double */](
    codec: C_1,
    digestSize: Double,
    multihashCode: A_1,
    multihashSize: Double,
    size: Double,
    version: V_1
  ): Codec[V_1, C_1, A_1] = {
    val __obj = js.Dynamic.literal(codec = codec.asInstanceOf[js.Any], digestSize = digestSize.asInstanceOf[js.Any], multihashCode = multihashCode.asInstanceOf[js.Any], multihashSize = multihashSize.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Codec[V_1, C_1, A_1]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Codec[?, ?, ?], V_1 /* <: Version */, C_1 /* <: Double */, A_1 /* <: Double */] (val x: Self & (Codec[V_1, C_1, A_1])) extends AnyVal {
    
    inline def setCodec(value: C_1): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
    
    inline def setDigestSize(value: Double): Self = StObject.set(x, "digestSize", value.asInstanceOf[js.Any])
    
    inline def setMultihashCode(value: A_1): Self = StObject.set(x, "multihashCode", value.asInstanceOf[js.Any])
    
    inline def setMultihashSize(value: Double): Self = StObject.set(x, "multihashSize", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: V_1): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
