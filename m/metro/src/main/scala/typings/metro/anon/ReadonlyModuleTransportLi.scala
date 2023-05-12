package typings.metro.anon

import typings.metro.srcSharedTypesMod.MetroSourceMapOrMappings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<metro.metro/src/shared/types.ModuleTransportLike> */
trait ReadonlyModuleTransportLi extends StObject {
  
  val code: String
  
  val id: Double
  
  val map: js.UndefOr[MetroSourceMapOrMappings | Null] = js.undefined
  
  val name: js.UndefOr[String] = js.undefined
  
  val sourcePath: String
}
object ReadonlyModuleTransportLi {
  
  inline def apply(code: String, id: Double, sourcePath: String): ReadonlyModuleTransportLi = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], sourcePath = sourcePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyModuleTransportLi]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyModuleTransportLi] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMap(value: MetroSourceMapOrMappings): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapNull: Self = StObject.set(x, "map", null)
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setMapVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MetroSourceMapSegmentTuple */ Any)*
    ): Self = StObject.set(x, "map", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSourcePath(value: String): Self = StObject.set(x, "sourcePath", value.asInstanceOf[js.Any])
  }
}
