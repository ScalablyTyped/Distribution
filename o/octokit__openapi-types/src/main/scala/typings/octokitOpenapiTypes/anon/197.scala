package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `197` extends StObject {
  
  /** The name of the commit/branch/tag. Default: the repository’s default branch (usually `master`) */
  var ref: js.UndefOr[String] = js.undefined
}
object `197` {
  
  inline def apply(): `197` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`197`]
  }
  
  extension [Self <: `197`](x: Self) {
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
