package typings.nextAuth.providersMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProviderCredentialsOptions extends js.Object {
  
  def authorize(credentials: Record[String, String]): js.Promise[GenericReturnConfig | Null] = js.native
  
  var credentials: CredentialInput = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var name: String = js.native
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
  implicit class ProviderCredentialsOptionsOps[Self <: ProviderCredentialsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuthorize(value: Record[String, String] => js.Promise[GenericReturnConfig | Null]): Self = this.set("authorize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCredentials(value: CredentialInput): Self = this.set("credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
}
