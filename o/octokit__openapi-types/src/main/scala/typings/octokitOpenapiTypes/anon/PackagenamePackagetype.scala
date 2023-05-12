package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackagenamePackagetype extends StObject {
  
  var package_name: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['package-name'] */ js.Any
  
  var package_type: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['package-type'] */ js.Any
}
object PackagenamePackagetype {
  
  inline def apply(
    package_name: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['package-name'] */ js.Any,
    package_type: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['package-type'] */ js.Any
  ): PackagenamePackagetype = {
    val __obj = js.Dynamic.literal(package_name = package_name.asInstanceOf[js.Any], package_type = package_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackagenamePackagetype]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PackagenamePackagetype] (val x: Self) extends AnyVal {
    
    inline def setPackage_name(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['package-name'] */ js.Any
    ): Self = StObject.set(x, "package_name", value.asInstanceOf[js.Any])
    
    inline def setPackage_type(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['package-type'] */ js.Any
    ): Self = StObject.set(x, "package_type", value.asInstanceOf[js.Any])
  }
}
