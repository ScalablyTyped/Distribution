package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Readonly extends StObject {
  
  /** @description The contents of the key. */
  var key: String
  
  /**
    * @description If `true`, the key will only be able to read repository contents. Otherwise, the key will be able to read and write.
    *
    * Deploy keys with write access can perform the same actions as an organization member with admin access, or a collaborator on a personal repository. For more information, see "[Repository permission levels for an organization](https://docs.github.com/articles/repository-permission-levels-for-an-organization/)" and "[Permission levels for a user account repository](https://docs.github.com/articles/permission-levels-for-a-user-account-repository/)."
    */
  var read_only: js.UndefOr[Boolean] = js.undefined
  
  /** @description A name for the key. */
  var title: js.UndefOr[String] = js.undefined
}
object Readonly {
  
  inline def apply(key: String): Readonly = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonly]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Readonly] (val x: Self) extends AnyVal {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setRead_only(value: Boolean): Self = StObject.set(x, "read_only", value.asInstanceOf[js.Any])
    
    inline def setRead_onlyUndefined: Self = StObject.set(x, "read_only", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
