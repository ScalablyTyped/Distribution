package typings.pkijs.mod

import typings.std.AesCbcParams
import typings.std.BufferSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.std.Algorithm because Already inherited
- typings.std.AesDerivedKeyParams because var conflicts: name. Inlined length */ trait ContentEncryptionAesCbcParams
  extends StObject
     with AesCbcParams
     with ContentEncryptionAlgorithm {
  
  /* standard dom */
  var length: Double
}
object ContentEncryptionAesCbcParams {
  
  inline def apply(iv: BufferSource, length: Double, name: String): ContentEncryptionAesCbcParams = {
    val __obj = js.Dynamic.literal(iv = iv.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentEncryptionAesCbcParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentEncryptionAesCbcParams] (val x: Self) extends AnyVal {
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
