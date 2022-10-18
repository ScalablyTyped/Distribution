package typings.prettierPackageJson

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Files extends StObject {
    
    var files: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Files {
    
    inline def apply(): Files = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Files]
    }
    
    extension [Self <: Files](x: Self) {
      
      inline def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
    }
  }
  
  trait Scripts extends StObject {
    
    var scripts: js.UndefOr[typings.typeFest.sourcePackageJsonMod.PackageJson.Scripts] = js.undefined
  }
  object Scripts {
    
    inline def apply(): Scripts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Scripts]
    }
    
    extension [Self <: Scripts](x: Self) {
      
      inline def setScripts(value: typings.typeFest.sourcePackageJsonMod.PackageJson.Scripts): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
      
      inline def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
    }
  }
}
