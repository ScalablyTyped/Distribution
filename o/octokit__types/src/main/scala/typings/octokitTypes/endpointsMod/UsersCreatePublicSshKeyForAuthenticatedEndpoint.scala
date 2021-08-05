package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsersCreatePublicSshKeyForAuthenticatedEndpoint extends StObject {
  
  /**
    * The public SSH key to add to your GitHub account. See "[Generating a new SSH key](https://docs.github.com/articles/generating-a-new-ssh-key-and-adding-it-to-the-ssh-agent/)" for guidance on how to create a public SSH key.
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * A descriptive name for the new key. Use a name that will help you recognize this key in your GitHub account. For example, if you're using a personal Mac, you might call this key "Personal MacBook Air".
    */
  var title: js.UndefOr[String] = js.undefined
}
object UsersCreatePublicSshKeyForAuthenticatedEndpoint {
  
  inline def apply(): UsersCreatePublicSshKeyForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsersCreatePublicSshKeyForAuthenticatedEndpoint]
  }
  
  extension [Self <: UsersCreatePublicSshKeyForAuthenticatedEndpoint](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
