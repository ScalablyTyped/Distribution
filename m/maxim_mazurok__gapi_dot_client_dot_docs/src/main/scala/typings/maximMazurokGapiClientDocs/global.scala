package typings.maximMazurokGapiClientDocs

import typings.maximMazurokGapiClientDocs.gapi.client.docs.DocumentsResource
import typings.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.docs
import typings.maximMazurokGapiClientDocs.maximMazurokGapiClientDocsStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object docs {
        
        @JSGlobal("gapi.client.docs.documents")
        @js.native
        val documents: DocumentsResource = js.native
      }
      
      /** Load Google Docs API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: docs, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: docs, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
