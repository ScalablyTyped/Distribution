package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Baseref extends StObject {
  
  /** @description The full ref of the branch the merge group will be merged into. */
  var base_ref: String
  
  /** @description The SHA of the merge group's parent commit. */
  var base_sha: String
  
  var head_commit: Timestamp
  
  /** @description The full ref of the merge group. */
  var head_ref: String
  
  /** @description The SHA of the merge group. */
  var head_sha: String
}
object Baseref {
  
  inline def apply(base_ref: String, base_sha: String, head_commit: Timestamp, head_ref: String, head_sha: String): Baseref = {
    val __obj = js.Dynamic.literal(base_ref = base_ref.asInstanceOf[js.Any], base_sha = base_sha.asInstanceOf[js.Any], head_commit = head_commit.asInstanceOf[js.Any], head_ref = head_ref.asInstanceOf[js.Any], head_sha = head_sha.asInstanceOf[js.Any])
    __obj.asInstanceOf[Baseref]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Baseref] (val x: Self) extends AnyVal {
    
    inline def setBase_ref(value: String): Self = StObject.set(x, "base_ref", value.asInstanceOf[js.Any])
    
    inline def setBase_sha(value: String): Self = StObject.set(x, "base_sha", value.asInstanceOf[js.Any])
    
    inline def setHead_commit(value: Timestamp): Self = StObject.set(x, "head_commit", value.asInstanceOf[js.Any])
    
    inline def setHead_ref(value: String): Self = StObject.set(x, "head_ref", value.asInstanceOf[js.Any])
    
    inline def setHead_sha(value: String): Self = StObject.set(x, "head_sha", value.asInstanceOf[js.Any])
  }
}
