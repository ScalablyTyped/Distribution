package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Headbranch extends StObject {
  
  /** @example main */
  var head_branch: js.UndefOr[String] = js.undefined
  
  /** @example 42 */
  var head_repository_id: js.UndefOr[Double] = js.undefined
  
  /** @example 009b8a3a9ccbb128af87f9b1c0f4c62e8a304f6d */
  var head_sha: js.UndefOr[String] = js.undefined
  
  /** @example 10 */
  var id: js.UndefOr[Double] = js.undefined
  
  /** @example 42 */
  var repository_id: js.UndefOr[Double] = js.undefined
}
object Headbranch {
  
  inline def apply(): Headbranch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Headbranch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Headbranch] (val x: Self) extends AnyVal {
    
    inline def setHead_branch(value: String): Self = StObject.set(x, "head_branch", value.asInstanceOf[js.Any])
    
    inline def setHead_branchUndefined: Self = StObject.set(x, "head_branch", js.undefined)
    
    inline def setHead_repository_id(value: Double): Self = StObject.set(x, "head_repository_id", value.asInstanceOf[js.Any])
    
    inline def setHead_repository_idUndefined: Self = StObject.set(x, "head_repository_id", js.undefined)
    
    inline def setHead_sha(value: String): Self = StObject.set(x, "head_sha", value.asInstanceOf[js.Any])
    
    inline def setHead_shaUndefined: Self = StObject.set(x, "head_sha", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setRepository_id(value: Double): Self = StObject.set(x, "repository_id", value.asInstanceOf[js.Any])
    
    inline def setRepository_idUndefined: Self = StObject.set(x, "repository_id", js.undefined)
  }
}
