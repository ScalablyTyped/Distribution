package typings.maximMazurokGapiClientGenomics

import typings.maximMazurokGapiClientGenomics.gapi.client.genomics.OperationsResource
import typings.maximMazurokGapiClientGenomics.maximMazurokGapiClientGenomicsStrings.genomics
import typings.maximMazurokGapiClientGenomics.maximMazurokGapiClientGenomicsStrings.v1
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
      
      /** Load Genomics API v1 */
      def load(name: genomics, version: v1): js.Thenable[Unit] = js.native
      def load(name: genomics, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object genomics extends js.Object {
        
        val operations: OperationsResource = js.native
      }
    }
  }
}
