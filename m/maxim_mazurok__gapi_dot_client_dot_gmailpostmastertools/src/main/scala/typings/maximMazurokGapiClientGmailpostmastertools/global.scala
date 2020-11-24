package typings.maximMazurokGapiClientGmailpostmastertools

import typings.maximMazurokGapiClientGmailpostmastertools.gapi.client.gmailpostmastertools.DomainsResource
import typings.maximMazurokGapiClientGmailpostmastertools.maximMazurokGapiClientGmailpostmastertoolsStrings.gmailpostmastertools
import typings.maximMazurokGapiClientGmailpostmastertools.maximMazurokGapiClientGmailpostmastertoolsStrings.v1beta1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object gapi extends js.Object {
    
    @js.native
    object client extends js.Object {
      
      /** Load Gmail Postmaster Tools API v1beta1 */
      def load(name: gmailpostmastertools, version: v1beta1): js.Thenable[Unit] = js.native
      def load(name: gmailpostmastertools, version: v1beta1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object gmailpostmastertools extends js.Object {
        
        val domains: DomainsResource = js.native
      }
    }
  }
}
