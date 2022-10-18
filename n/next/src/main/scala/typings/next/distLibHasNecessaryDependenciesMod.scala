package typings.next

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibHasNecessaryDependenciesMod {
  
  @JSImport("next/dist/lib/has-necessary-dependencies", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hasNecessaryDependencies(baseDir: String, requiredPackages: js.Array[MissingDependency]): js.Promise[NecessaryDependencies] = (^.asInstanceOf[js.Dynamic].applyDynamic("hasNecessaryDependencies")(baseDir.asInstanceOf[js.Any], requiredPackages.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NecessaryDependencies]]
  
  trait MissingDependency extends StObject {
    
    var exportsRestrict: Boolean
    
    var file: String
    
    var pkg: String
  }
  object MissingDependency {
    
    inline def apply(exportsRestrict: Boolean, file: String, pkg: String): MissingDependency = {
      val __obj = js.Dynamic.literal(exportsRestrict = exportsRestrict.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], pkg = pkg.asInstanceOf[js.Any])
      __obj.asInstanceOf[MissingDependency]
    }
    
    extension [Self <: MissingDependency](x: Self) {
      
      inline def setExportsRestrict(value: Boolean): Self = StObject.set(x, "exportsRestrict", value.asInstanceOf[js.Any])
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setPkg(value: String): Self = StObject.set(x, "pkg", value.asInstanceOf[js.Any])
    }
  }
  
  trait NecessaryDependencies extends StObject {
    
    var missing: js.Array[MissingDependency]
    
    var resolved: Map[String, String]
  }
  object NecessaryDependencies {
    
    inline def apply(missing: js.Array[MissingDependency], resolved: Map[String, String]): NecessaryDependencies = {
      val __obj = js.Dynamic.literal(missing = missing.asInstanceOf[js.Any], resolved = resolved.asInstanceOf[js.Any])
      __obj.asInstanceOf[NecessaryDependencies]
    }
    
    extension [Self <: NecessaryDependencies](x: Self) {
      
      inline def setMissing(value: js.Array[MissingDependency]): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
      
      inline def setMissingVarargs(value: MissingDependency*): Self = StObject.set(x, "missing", js.Array(value*))
      
      inline def setResolved(value: Map[String, String]): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
    }
  }
}
