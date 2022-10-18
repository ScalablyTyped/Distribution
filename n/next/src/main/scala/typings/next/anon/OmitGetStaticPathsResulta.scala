package typings.next.anon

import typings.next.nextStrings.blocking
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<next.next/types.GetStaticPathsResult</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_querystring.ParsedUrlQuery * / any>, 'paths'> & {  paths :std.Array<string>,   encodedPaths :std.Array<string>} */
trait OmitGetStaticPathsResulta extends StObject {
  
  var encodedPaths: js.Array[String]
  
  var fallback: Boolean | blocking
  
  var paths: js.Array[String]
}
object OmitGetStaticPathsResulta {
  
  inline def apply(encodedPaths: js.Array[String], fallback: Boolean | blocking, paths: js.Array[String]): OmitGetStaticPathsResulta = {
    val __obj = js.Dynamic.literal(encodedPaths = encodedPaths.asInstanceOf[js.Any], fallback = fallback.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitGetStaticPathsResulta]
  }
  
  extension [Self <: OmitGetStaticPathsResulta](x: Self) {
    
    inline def setEncodedPaths(value: js.Array[String]): Self = StObject.set(x, "encodedPaths", value.asInstanceOf[js.Any])
    
    inline def setEncodedPathsVarargs(value: String*): Self = StObject.set(x, "encodedPaths", js.Array(value*))
    
    inline def setFallback(value: Boolean | blocking): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
    
    inline def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
  }
}
