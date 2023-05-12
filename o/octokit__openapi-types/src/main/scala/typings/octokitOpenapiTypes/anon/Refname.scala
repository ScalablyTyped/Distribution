package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Refname extends StObject {
  
  var ref_name: js.UndefOr[Include] = js.undefined
}
object Refname {
  
  inline def apply(): Refname = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Refname]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Refname] (val x: Self) extends AnyVal {
    
    inline def setRef_name(value: Include): Self = StObject.set(x, "ref_name", value.asInstanceOf[js.Any])
    
    inline def setRef_nameUndefined: Self = StObject.set(x, "ref_name", js.undefined)
  }
}
