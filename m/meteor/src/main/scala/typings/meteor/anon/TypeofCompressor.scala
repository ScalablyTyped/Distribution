package typings.meteor.anon

import typings.meteor.meteorInts.`1`
import typings.meteor.meteorInts.`2`
import typings.meteor.meteorInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCompressor extends StObject {
  
  val none: typings.meteor.meteorInts.`0`
  
  val snappy: `1`
  
  val zlib: `2`
  
  val zstd: `3`
}
object TypeofCompressor {
  
  inline def apply(): TypeofCompressor = {
    val __obj = js.Dynamic.literal(none = 0, snappy = 1, zlib = 2, zstd = 3)
    __obj.asInstanceOf[TypeofCompressor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofCompressor] (val x: Self) extends AnyVal {
    
    inline def setNone(value: typings.meteor.meteorInts.`0`): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setSnappy(value: `1`): Self = StObject.set(x, "snappy", value.asInstanceOf[js.Any])
    
    inline def setZlib(value: `2`): Self = StObject.set(x, "zlib", value.asInstanceOf[js.Any])
    
    inline def setZstd(value: `3`): Self = StObject.set(x, "zstd", value.asInstanceOf[js.Any])
  }
}
