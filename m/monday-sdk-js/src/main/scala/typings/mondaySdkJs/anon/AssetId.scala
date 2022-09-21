package typings.mondaySdkJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssetId extends StObject {
  
  /**
    * The ID of the asset to open
    */
  var assetId: Double
  
  /**
    * The ID of the board
    */
  var boardId: Double
  
  /**
    * The ID of the column, which contains an asset
    */
  var columnId: String
  
  /**
    * The ID of the item, which contains an asset
    */
  var itemId: Double
}
object AssetId {
  
  inline def apply(assetId: Double, boardId: Double, columnId: String, itemId: Double): AssetId = {
    val __obj = js.Dynamic.literal(assetId = assetId.asInstanceOf[js.Any], boardId = boardId.asInstanceOf[js.Any], columnId = columnId.asInstanceOf[js.Any], itemId = itemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetId]
  }
  
  extension [Self <: AssetId](x: Self) {
    
    inline def setAssetId(value: Double): Self = StObject.set(x, "assetId", value.asInstanceOf[js.Any])
    
    inline def setBoardId(value: Double): Self = StObject.set(x, "boardId", value.asInstanceOf[js.Any])
    
    inline def setColumnId(value: String): Self = StObject.set(x, "columnId", value.asInstanceOf[js.Any])
    
    inline def setItemId(value: Double): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
  }
}
