package typings.msRestAzure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MSIAppServiceOptions extends MSIOptions {
  
  /**
    * @property {string} [msiApiVersion] - The api-version of the local MSI agent. Default value is "2017-09-01".
    */
  var msiApiVersion: js.UndefOr[String] = js.native
  
  /**
    * @property {string} [msiEndpoint] - The local URL from which your app can request tokens.
    * Either provide this parameter or set the environment varaible `MSI_ENDPOINT`.
    * For example: `export MSI_ENDPOINT="http://127.0.0.1:41741/MSI/token/"`
    */
  var msiEndpoint: js.UndefOr[String] = js.native
  
  /**
    * @property {string} [msiSecret] - The secret used in communication between your code and the local MSI agent.
    * Either provide this parameter or set the environment varaible `MSI_SECRET`.
    * For example: `export MSI_SECRET="69418689F1E342DD946CB82994CDA3CB"`
    */
  var msiSecret: js.UndefOr[String] = js.native
}
object MSIAppServiceOptions {
  
  @scala.inline
  def apply(): MSIAppServiceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MSIAppServiceOptions]
  }
  
  @scala.inline
  implicit class MSIAppServiceOptionsOps[Self <: MSIAppServiceOptions] (val x: Self) extends AnyVal {
    
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
    def setMsiApiVersion(value: String): Self = this.set("msiApiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsiApiVersion: Self = this.set("msiApiVersion", js.undefined)
    
    @scala.inline
    def setMsiEndpoint(value: String): Self = this.set("msiEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsiEndpoint: Self = this.set("msiEndpoint", js.undefined)
    
    @scala.inline
    def setMsiSecret(value: String): Self = this.set("msiSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsiSecret: Self = this.set("msiSecret", js.undefined)
  }
}
