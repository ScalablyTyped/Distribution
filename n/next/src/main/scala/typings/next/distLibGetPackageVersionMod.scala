package typings.next

import typings.next.anon.Cwd
import typings.next.anon.CwdName
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibGetPackageVersionMod {
  
  @JSImport("next/dist/lib/get-package-version", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDependencies(param0: Cwd): js.Promise[PackageJsonDependencies] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDependencies")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PackageJsonDependencies]]
  
  inline def getPackageVersion(param0: CwdName): js.Promise[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPackageVersion")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String | Null]]
  
  trait PackageJsonDependencies extends StObject {
    
    var dependencies: Record[String, String]
    
    var devDependencies: Record[String, String]
  }
  object PackageJsonDependencies {
    
    inline def apply(dependencies: Record[String, String], devDependencies: Record[String, String]): PackageJsonDependencies = {
      val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], devDependencies = devDependencies.asInstanceOf[js.Any])
      __obj.asInstanceOf[PackageJsonDependencies]
    }
    
    extension [Self <: PackageJsonDependencies](x: Self) {
      
      inline def setDependencies(value: Record[String, String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDevDependencies(value: Record[String, String]): Self = StObject.set(x, "devDependencies", value.asInstanceOf[js.Any])
    }
  }
}
