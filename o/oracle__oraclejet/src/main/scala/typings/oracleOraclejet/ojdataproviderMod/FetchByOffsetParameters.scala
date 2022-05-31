package typings.oracleOraclejet.ojdataproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FetchByOffsetParameters[D]
  extends StObject
     with FetchListParameters[D] {
  
  var offset: Double
}
object FetchByOffsetParameters {
  
  inline def apply[D](offset: Double, size: Double): FetchByOffsetParameters[D] = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchByOffsetParameters[D]]
  }
  
  extension [Self <: FetchByOffsetParameters[?], D](x: Self & FetchByOffsetParameters[D]) {
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
  }
}
