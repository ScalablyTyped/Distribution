package typings.playmusic.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaylistListResponse extends StObject {
  
  var data: js.UndefOr[PlaylistListData] = js.undefined
  
  var kind: js.UndefOr[String] = js.undefined
}
object PlaylistListResponse {
  
  inline def apply(): PlaylistListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaylistListResponse]
  }
  
  extension [Self <: PlaylistListResponse](x: Self) {
    
    inline def setData(value: PlaylistListData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
