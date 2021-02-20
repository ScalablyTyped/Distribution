package typings.maximMazurokGapiClientGenomics

import typings.maximMazurokGapiClientGenomics.gapi.client.genomics.OperationsResource
import typings.maximMazurokGapiClientGenomics.maximMazurokGapiClientGenomicsStrings.genomics
import typings.maximMazurokGapiClientGenomics.maximMazurokGapiClientGenomicsStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object genomics {
        
        @JSGlobal("gapi.client.genomics.operations")
        @js.native
        val operations: OperationsResource = js.native
      }
      
      /** Load Genomics API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: genomics, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: genomics, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
