package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `237` extends StObject {
  
  /** @description The name of the commit/branch/tag. Default: the repository’s default branch. */
  var ref: js.UndefOr[String] = js.undefined
}
object `237` {
  
  inline def apply(): `237` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`237`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `237`] (val x: Self) extends AnyVal {
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
