package typings.multiStageSourcemap

import typings.sourceMap.mod.RawSourceMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait FromSourceMap extends StObject {
    
    var fromSourceMap: RawSourceMap | String
    
    var toSourceMap: RawSourceMap | String
  }
  object FromSourceMap {
    
    inline def apply(fromSourceMap: RawSourceMap | String, toSourceMap: RawSourceMap | String): FromSourceMap = {
      val __obj = js.Dynamic.literal(fromSourceMap = fromSourceMap.asInstanceOf[js.Any], toSourceMap = toSourceMap.asInstanceOf[js.Any])
      __obj.asInstanceOf[FromSourceMap]
    }
    
    extension [Self <: FromSourceMap](x: Self) {
      
      inline def setFromSourceMap(value: RawSourceMap | String): Self = StObject.set(x, "fromSourceMap", value.asInstanceOf[js.Any])
      
      inline def setToSourceMap(value: RawSourceMap | String): Self = StObject.set(x, "toSourceMap", value.asInstanceOf[js.Any])
    }
  }
}
