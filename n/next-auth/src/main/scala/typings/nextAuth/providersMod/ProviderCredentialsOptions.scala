package typings.nextAuth.providersMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProviderCredentialsOptions extends StObject {
  
  def authorize(credentials: Record[String, String]): js.Promise[GenericReturnConfig | Null]
  
  var credentials: CredentialInput
  
  var id: js.UndefOr[String] = js.undefined
  
  var name: String
}
object ProviderCredentialsOptions {
  
  @scala.inline
  def apply(
    authorize: Record[String, String] => js.Promise[GenericReturnConfig | Null],
    credentials: CredentialInput,
    name: String
  ): ProviderCredentialsOptions = {
    val __obj = js.Dynamic.literal(authorize = js.Any.fromFunction1(authorize), credentials = credentials.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderCredentialsOptions]
  }
  
  @scala.inline
  implicit class ProviderCredentialsOptionsMutableBuilder[Self <: ProviderCredentialsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorize(value: Record[String, String] => js.Promise[GenericReturnConfig | Null]): Self = StObject.set(x, "authorize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCredentials(value: CredentialInput): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
