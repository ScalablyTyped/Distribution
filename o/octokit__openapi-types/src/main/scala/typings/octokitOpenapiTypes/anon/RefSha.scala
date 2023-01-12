package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefSha extends StObject {
  
  /** @example "refs/heads/newbranch" */
  var key: js.UndefOr[String] = js.undefined
  
  /** @description The name of the fully qualified reference (ie: `refs/heads/master`). If it doesn't start with 'refs' and have at least two slashes, it will be rejected. */
  var ref: String
  
  /** @description The SHA1 value for this reference. */
  var sha: String
}
object RefSha {
  
  inline def apply(ref: String, sha: String): RefSha = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefSha]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RefSha] (val x: Self) extends AnyVal {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
  }
}
