package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackageName extends StObject {
  
  var packageName: String
  
  var packageVersion: String
}
object PackageName {
  
  inline def apply(packageName: String, packageVersion: String): PackageName = {
    val __obj = js.Dynamic.literal(packageName = packageName.asInstanceOf[js.Any], packageVersion = packageVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageName]
  }
  
  extension [Self <: PackageName](x: Self) {
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageVersion(value: String): Self = StObject.set(x, "packageVersion", value.asInstanceOf[js.Any])
  }
}
