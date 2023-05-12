package typings.metroTransformWorker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Readonly<{  code :string,   lineCount :number,   map :std.Array</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MetroSourceMapSegmentTuple * / any>,   functionMap :/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FBSourceFunctionMap * / any | null}> */
  trait ReadonlycodestringlineCou extends StObject {
    
    val code: String
    
    val functionMap: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FBSourceFunctionMap */ Any) | Null
      ] = js.undefined
    
    val lineCount: Double
    
    val map: js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MetroSourceMapSegmentTuple */ Any
      ]
  }
  object ReadonlycodestringlineCou {
    
    inline def apply(
      code: String,
      lineCount: Double,
      map: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MetroSourceMapSegmentTuple */ Any
        ]
    ): ReadonlycodestringlineCou = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], lineCount = lineCount.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlycodestringlineCou]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlycodestringlineCou] (val x: Self) extends AnyVal {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setFunctionMap(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FBSourceFunctionMap */ Any
      ): Self = StObject.set(x, "functionMap", value.asInstanceOf[js.Any])
      
      inline def setFunctionMapNull: Self = StObject.set(x, "functionMap", null)
      
      inline def setFunctionMapUndefined: Self = StObject.set(x, "functionMap", js.undefined)
      
      inline def setLineCount(value: Double): Self = StObject.set(x, "lineCount", value.asInstanceOf[js.Any])
      
      inline def setMap(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MetroSourceMapSegmentTuple */ Any
            ]
      ): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MetroSourceMapSegmentTuple */ Any)*
      ): Self = StObject.set(x, "map", js.Array(value*))
    }
  }
}
