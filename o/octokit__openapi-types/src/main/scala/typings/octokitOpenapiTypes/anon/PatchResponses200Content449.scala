package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatchResponses200Content449 extends StObject {
  
  /** Changes the default automatic flow when creating check suites. By default, a check suite is automatically created each time code is pushed to a repository. When you disable the automatic creation of check suites, you can manually [Create a check suite](https://docs.github.com/rest/reference/checks#create-a-check-suite). You must have admin permissions in the repository to set preferences for check suites. */
  var patch: Responses200Content449
}
object PatchResponses200Content449 {
  
  inline def apply(patch: Responses200Content449): PatchResponses200Content449 = {
    val __obj = js.Dynamic.literal(patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchResponses200Content449]
  }
  
  extension [Self <: PatchResponses200Content449](x: Self) {
    
    inline def setPatch(value: Responses200Content449): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
