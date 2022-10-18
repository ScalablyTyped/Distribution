package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationvndgithubv3starjson extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[Allowmergecommit]
  
  @JSName("application/vnd.github.v3.star+json")
  var applicationSlashvndDotgithubDotv3DotstarPlussignjson: js.Array[StarredatString]
}
object Applicationvndgithubv3starjson {
  
  inline def apply(
    applicationSlashjson: js.Array[Allowmergecommit],
    applicationSlashvndDotgithubDotv3DotstarPlussignjson: js.Array[StarredatString]
  ): Applicationvndgithubv3starjson = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.updateDynamic("application/vnd.github.v3.star+json")(applicationSlashvndDotgithubDotv3DotstarPlussignjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationvndgithubv3starjson]
  }
  
  extension [Self <: Applicationvndgithubv3starjson](x: Self) {
    
    inline def setApplicationSlashjson(value: js.Array[Allowmergecommit]): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(value: Allowmergecommit*): Self = StObject.set(x, "application/json", js.Array(value*))
    
    inline def setApplicationSlashvndDotgithubDotv3DotstarPlussignjson(value: js.Array[StarredatString]): Self = StObject.set(x, "application/vnd.github.v3.star+json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashvndDotgithubDotv3DotstarPlussignjsonVarargs(value: StarredatString*): Self = StObject.set(x, "application/vnd.github.v3.star+json", js.Array(value*))
  }
}
