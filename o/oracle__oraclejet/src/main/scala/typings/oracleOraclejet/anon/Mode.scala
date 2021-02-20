package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mode extends StObject {
  
  var columnIndex: Double = js.native
  
  var componentElement: typings.std.Element = js.native
  
  var data: js.Object = js.native
  
  var index: Double = js.native
  
  var key: js.Any = js.native
  
  var mode: String = js.native
  
  var row: js.Object = js.native
}
object Mode {
  
  @scala.inline
  def apply(
    columnIndex: Double,
    componentElement: typings.std.Element,
    data: js.Object,
    index: Double,
    key: js.Any,
    mode: String,
    row: js.Object
  ): Mode = {
    val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any], componentElement = componentElement.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mode]
  }
  
  @scala.inline
  implicit class ModeMutableBuilder[Self <: Mode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentElement(value: typings.std.Element): Self = StObject.set(x, "componentElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: js.Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRow(value: js.Object): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
  }
}
