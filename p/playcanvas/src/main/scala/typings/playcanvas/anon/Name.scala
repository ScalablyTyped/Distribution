package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name extends StObject {
  
  var blockSize: Double
  
  var name: String
  
  var size: Unit
}
object Name {
  
  inline def apply(blockSize: Double, name: String, size: Unit): Name = {
    val __obj = js.Dynamic.literal(blockSize = blockSize.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
    
    inline def setBlockSize(value: Double): Self = StObject.set(x, "blockSize", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Unit): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
