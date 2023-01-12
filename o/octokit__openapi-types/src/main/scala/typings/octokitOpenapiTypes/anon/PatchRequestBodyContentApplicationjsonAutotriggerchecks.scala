package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatchRequestBodyContentApplicationjsonAutotriggerchecks extends StObject {
  
  /** Changes the default automatic flow when creating check suites. By default, a check suite is automatically created each time code is pushed to a repository. When you disable the automatic creation of check suites, you can manually [Create a check suite](https://docs.github.com/rest/reference/checks#create-a-check-suite). You must have admin permissions in the repository to set preferences for check suites. */
  var patch: RequestBodyContentApplicationjsonAutotriggerchecks
}
object PatchRequestBodyContentApplicationjsonAutotriggerchecks {
  
  inline def apply(patch: RequestBodyContentApplicationjsonAutotriggerchecks): PatchRequestBodyContentApplicationjsonAutotriggerchecks = {
    val __obj = js.Dynamic.literal(patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchRequestBodyContentApplicationjsonAutotriggerchecks]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PatchRequestBodyContentApplicationjsonAutotriggerchecks] (val x: Self) extends AnyVal {
    
    inline def setPatch(value: RequestBodyContentApplicationjsonAutotriggerchecks): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
