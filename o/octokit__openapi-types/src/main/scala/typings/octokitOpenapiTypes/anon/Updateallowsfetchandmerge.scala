package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Updateallowsfetchandmerge extends StObject {
  
  /** @description Branch can pull changes from its upstream repository */
  var update_allows_fetch_and_merge: Boolean
}
object Updateallowsfetchandmerge {
  
  inline def apply(update_allows_fetch_and_merge: Boolean): Updateallowsfetchandmerge = {
    val __obj = js.Dynamic.literal(update_allows_fetch_and_merge = update_allows_fetch_and_merge.asInstanceOf[js.Any])
    __obj.asInstanceOf[Updateallowsfetchandmerge]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Updateallowsfetchandmerge] (val x: Self) extends AnyVal {
    
    inline def setUpdate_allows_fetch_and_merge(value: Boolean): Self = StObject.set(x, "update_allows_fetch_and_merge", value.asInstanceOf[js.Any])
  }
}
