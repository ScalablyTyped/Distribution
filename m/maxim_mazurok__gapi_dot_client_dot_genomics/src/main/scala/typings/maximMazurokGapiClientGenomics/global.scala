package typings.maximMazurokGapiClientGenomics

import typings.maximMazurokGapiClientGenomics.gapi.client.genomics.OperationsResource
import typings.maximMazurokGapiClientGenomics.maximMazurokGapiClientGenomicsStrings.genomics
import typings.maximMazurokGapiClientGenomics.maximMazurokGapiClientGenomicsStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object genomics {
        
        @JSGlobal("gapi.client.genomics.operations")
        @js.native
        val operations: OperationsResource = js.native
      }
      
      /** Load Genomics API v1 */
      @scala.inline
      def load(name: genomics, version: v1): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      @scala.inline
      def load(name: genomics, version: v1, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
