package typings.maximMazurokGapiClientGmailpostmastertools

import typings.maximMazurokGapiClientGmailpostmastertools.gapi.client.gmailpostmastertools.DomainsResource
import typings.maximMazurokGapiClientGmailpostmastertools.maximMazurokGapiClientGmailpostmastertoolsStrings.gmailpostmastertools
import typings.maximMazurokGapiClientGmailpostmastertools.maximMazurokGapiClientGmailpostmastertoolsStrings.v1beta1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object gmailpostmastertools {
        
        @JSGlobal("gapi.client.gmailpostmastertools.domains")
        @js.native
        val domains: DomainsResource = js.native
      }
      
      /** Load Gmail Postmaster Tools API v1beta1 */
      @scala.inline
      def load(name: gmailpostmastertools, version: v1beta1): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      @scala.inline
      def load(name: gmailpostmastertools, version: v1beta1, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
