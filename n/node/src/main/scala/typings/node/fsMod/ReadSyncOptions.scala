package typings.node.fsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadSyncOptions extends StObject {
  
  /**
    * @default `length of buffer`
    */
  var length: js.UndefOr[Double] = js.undefined
  
  /**
    * @default 0
    */
  var offset: js.UndefOr[Double] = js.undefined
  
  /**
    * @default null
    */
  var position: js.UndefOr[ReadPosition | Null] = js.undefined
}
object ReadSyncOptions {
  
  inline def apply(): ReadSyncOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadSyncOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadSyncOptions] (val x: Self) extends AnyVal {
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPosition(value: ReadPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionNull: Self = StObject.set(x, "position", null)
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
