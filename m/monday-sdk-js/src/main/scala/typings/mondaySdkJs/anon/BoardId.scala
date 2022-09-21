package typings.mondaySdkJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoardId extends StObject {
  
  /**
    * The ID of the board
    */
  var boardId: Double
  
  /**
    * The ID of the file column, where file should be uploaded
    */
  var columnId: String
  
  /**
    * The ID of the item, which contains an asset
    */
  var itemId: Double
}
object BoardId {
  
  inline def apply(boardId: Double, columnId: String, itemId: Double): BoardId = {
    val __obj = js.Dynamic.literal(boardId = boardId.asInstanceOf[js.Any], columnId = columnId.asInstanceOf[js.Any], itemId = itemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoardId]
  }
  
  extension [Self <: BoardId](x: Self) {
    
    inline def setBoardId(value: Double): Self = StObject.set(x, "boardId", value.asInstanceOf[js.Any])
    
    inline def setColumnId(value: String): Self = StObject.set(x, "columnId", value.asInstanceOf[js.Any])
    
    inline def setItemId(value: Double): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
  }
}
