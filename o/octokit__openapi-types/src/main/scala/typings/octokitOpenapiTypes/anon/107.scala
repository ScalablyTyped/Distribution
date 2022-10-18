package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `107` extends StObject {
  
  /** The name of the commit/branch/tag. Default: the repository’s default branch (usually `master`) */
  var ref: js.UndefOr[String] = js.undefined
}
object `107` {
  
  inline def apply(): `107` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`107`]
  }
  
  extension [Self <: `107`](x: Self) {
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
