package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockSize extends StObject {
  
  var blockSize: Unit
  
  var name: String
  
  var size: Double
}
object BlockSize {
  
  inline def apply(blockSize: Unit, name: String, size: Double): BlockSize = {
    val __obj = js.Dynamic.literal(blockSize = blockSize.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockSize]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BlockSize] (val x: Self) extends AnyVal {
    
    inline def setBlockSize(value: Unit): Self = StObject.set(x, "blockSize", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
