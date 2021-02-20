package typings.maximMazurokGapiClientGmailpostmastertools

import typings.maximMazurokGapiClientGmailpostmastertools.gapi.client.gmailpostmastertools.DomainsResource
import typings.maximMazurokGapiClientGmailpostmastertools.maximMazurokGapiClientGmailpostmastertoolsStrings.gmailpostmastertools
import typings.maximMazurokGapiClientGmailpostmastertools.maximMazurokGapiClientGmailpostmastertoolsStrings.v1beta1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object gmailpostmastertools {
        
        @JSGlobal("gapi.client.gmailpostmastertools.domains")
        @js.native
        val domains: DomainsResource = js.native
      }
      
      /** Load Gmail Postmaster Tools API v1beta1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: gmailpostmastertools, version: v1beta1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: gmailpostmastertools, version: v1beta1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
