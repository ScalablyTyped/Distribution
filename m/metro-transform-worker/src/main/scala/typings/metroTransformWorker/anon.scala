package typings.metroTransformWorker

import typings.metroSourceMap.mod.FBSourceFunctionMap
import typings.metroSourceMap.mod.MetroSourceMapSegmentTuple
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Readonly<{  code :string,   lineCount :number,   map :std.Array<metro-source-map.metro-source-map.MetroSourceMapSegmentTuple>,   functionMap :metro-source-map.metro-source-map.FBSourceFunctionMap | undefined}> */
  trait ReadonlycodestringlineCou extends StObject {
    
    val code: String
    
    val functionMap: js.UndefOr[FBSourceFunctionMap] = js.undefined
    
    val lineCount: Double
    
    val map: js.Array[MetroSourceMapSegmentTuple]
  }
  object ReadonlycodestringlineCou {
    
    inline def apply(code: String, lineCount: Double, map: js.Array[MetroSourceMapSegmentTuple]): ReadonlycodestringlineCou = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], lineCount = lineCount.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlycodestringlineCou]
    }
    
    extension [Self <: ReadonlycodestringlineCou](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setFunctionMap(value: FBSourceFunctionMap): Self = StObject.set(x, "functionMap", value.asInstanceOf[js.Any])
      
      inline def setFunctionMapUndefined: Self = StObject.set(x, "functionMap", js.undefined)
      
      inline def setLineCount(value: Double): Self = StObject.set(x, "lineCount", value.asInstanceOf[js.Any])
      
      inline def setMap(value: js.Array[MetroSourceMapSegmentTuple]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapVarargs(value: MetroSourceMapSegmentTuple*): Self = StObject.set(x, "map", js.Array(value*))
    }
  }
}
