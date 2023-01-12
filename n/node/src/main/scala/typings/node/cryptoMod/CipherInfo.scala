package typings.node.cryptoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CipherInfo extends StObject {
  
  /**
    * The block size of the cipher in bytes.
    * This property is omitted when mode is 'stream'.
    */
  var blockSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The expected or default initialization vector length in bytes.
    * This property is omitted if the cipher does not use an initialization vector.
    */
  var ivLength: js.UndefOr[Double] = js.undefined
  
  /**
    * The expected or default key length in bytes.
    */
  var keyLength: Double
  
  /**
    * The cipher mode.
    */
  var mode: CipherMode
  
  /**
    * The name of the cipher.
    */
  var name: String
  
  /**
    * The nid of the cipher.
    */
  var nid: Double
}
object CipherInfo {
  
  inline def apply(keyLength: Double, mode: CipherMode, name: String, nid: Double): CipherInfo = {
    val __obj = js.Dynamic.literal(keyLength = keyLength.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nid = nid.asInstanceOf[js.Any])
    __obj.asInstanceOf[CipherInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CipherInfo] (val x: Self) extends AnyVal {
    
    inline def setBlockSize(value: Double): Self = StObject.set(x, "blockSize", value.asInstanceOf[js.Any])
    
    inline def setBlockSizeUndefined: Self = StObject.set(x, "blockSize", js.undefined)
    
    inline def setIvLength(value: Double): Self = StObject.set(x, "ivLength", value.asInstanceOf[js.Any])
    
    inline def setIvLengthUndefined: Self = StObject.set(x, "ivLength", js.undefined)
    
    inline def setKeyLength(value: Double): Self = StObject.set(x, "keyLength", value.asInstanceOf[js.Any])
    
    inline def setMode(value: CipherMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNid(value: Double): Self = StObject.set(x, "nid", value.asInstanceOf[js.Any])
  }
}
