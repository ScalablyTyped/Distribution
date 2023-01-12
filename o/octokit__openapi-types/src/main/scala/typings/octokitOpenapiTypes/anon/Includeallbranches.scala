package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Includeallbranches extends StObject {
  
  /** @description A short description of the new repository. */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * @description Set to `true` to include the directory structure and files from all branches in the template repository, and not just the default branch. Default: `false`.
    * @default false
    */
  var include_all_branches: js.UndefOr[Boolean] = js.undefined
  
  /** @description The name of the new repository. */
  var name: String
  
  /** @description The organization or person who will own the new repository. To create a new repository in an organization, the authenticated user must be a member of the specified organization. */
  var owner: js.UndefOr[String] = js.undefined
  
  /**
    * @description Either `true` to create a new private repository or `false` to create a new public one.
    * @default false
    */
  var `private`: js.UndefOr[Boolean] = js.undefined
}
object Includeallbranches {
  
  inline def apply(name: String): Includeallbranches = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Includeallbranches]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Includeallbranches] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setInclude_all_branches(value: Boolean): Self = StObject.set(x, "include_all_branches", value.asInstanceOf[js.Any])
    
    inline def setInclude_all_branchesUndefined: Self = StObject.set(x, "include_all_branches", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
    
    inline def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
  }
}
