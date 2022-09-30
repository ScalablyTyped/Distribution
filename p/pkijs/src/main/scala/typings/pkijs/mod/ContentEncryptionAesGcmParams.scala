package typings.pkijs.mod

import typings.std.AesGcmParams
import typings.std.BufferSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.std.Algorithm because Already inherited
- typings.std.AesDerivedKeyParams because var conflicts: name. Inlined length */ trait ContentEncryptionAesGcmParams
  extends StObject
     with AesGcmParams
     with ContentEncryptionAlgorithm {
  
  /* standard dom */
  var length: Double
}
object ContentEncryptionAesGcmParams {
  
  inline def apply(iv: BufferSource, length: Double, name: String): ContentEncryptionAesGcmParams = {
    val __obj = js.Dynamic.literal(iv = iv.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentEncryptionAesGcmParams]
  }
  
  extension [Self <: ContentEncryptionAesGcmParams](x: Self) {
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
