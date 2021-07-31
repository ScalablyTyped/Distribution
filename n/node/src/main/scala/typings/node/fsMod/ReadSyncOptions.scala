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
  var position: js.UndefOr[Double | Null] = js.undefined
}
object ReadSyncOptions {
  
  @scala.inline
  def apply(): ReadSyncOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadSyncOptions]
  }
  
  @scala.inline
  implicit class ReadSyncOptionsMutableBuilder[Self <: ReadSyncOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionNull: Self = StObject.set(x, "position", null)
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
