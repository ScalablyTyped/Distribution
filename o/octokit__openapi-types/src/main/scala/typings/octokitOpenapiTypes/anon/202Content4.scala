package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `202Content4` extends StObject {
  
  var `202`: Content4
  
  /**
    * We will return a 403 with one of the following messages:
    *
    * - Git LFS support not enabled because Git LFS is globally disabled.
    * - Git LFS support not enabled because Git LFS is disabled for the root repository in the network.
    * - Git LFS support not enabled because Git LFS is disabled for <owner>.
    */
  var `403`: Any
}
object `202Content4` {
  
  inline def apply(`202`: Content4, `403`: Any): `202Content4` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("202")(`202`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`202Content4`]
  }
  
  extension [Self <: `202Content4`](x: Self) {
    
    inline def set202(value: Content4): Self = StObject.set(x, "202", value.asInstanceOf[js.Any])
    
    inline def set403(value: Any): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
  }
}
