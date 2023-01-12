package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `202403Unknown` extends StObject {
  
  var `202`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['accepted'] */ js.Any
  
  /**
    * We will return a 403 with one of the following messages:
    *
    * - Git LFS support not enabled because Git LFS is globally disabled.
    * - Git LFS support not enabled because Git LFS is disabled for the root repository in the network.
    * - Git LFS support not enabled because Git LFS is disabled for <owner>.
    */
  var `403`: Any
}
object `202403Unknown` {
  
  inline def apply(
    `202`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['accepted'] */ js.Any,
    `403`: Any
  ): `202403Unknown` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("202")(`202`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`202403Unknown`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `202403Unknown`] (val x: Self) extends AnyVal {
    
    inline def set202(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['accepted'] */ js.Any
    ): Self = StObject.set(x, "202", value.asInstanceOf[js.Any])
    
    inline def set403(value: Any): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
  }
}
