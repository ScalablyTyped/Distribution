package typings.pouchdbAdapterHttp

import org.scalablytyped.runtime.Instantiable2
import typings.pouchdbAdapterHttp.PouchDB.HttpAdapter.HttpAdapterConfiguration
import typings.pouchdbAdapterHttp.pouchdbAdapterHttpStrings.http
import typings.pouchdbCore.PouchDB.Configuration.RemoteDatabaseConfiguration
import typings.pouchdbCore.PouchDB.Database
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PouchDB {
  
  object HttpAdapter {
    
    @js.native
    trait HttpAdapterConfiguration extends RemoteDatabaseConfiguration {
      
      @JSName("adapter")
      var adapter_HttpAdapterConfiguration: http = js.native
    }
    object HttpAdapterConfiguration {
      
      @scala.inline
      def apply(adapter: http): HttpAdapterConfiguration = {
        val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any])
        __obj.asInstanceOf[HttpAdapterConfiguration]
      }
      
      @scala.inline
      implicit class HttpAdapterConfigurationMutableBuilder[Self <: HttpAdapterConfiguration] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAdapter(value: http): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @js.native
  trait Static
    extends Instantiable2[
          (/* name */ Null) | (/* name */ String), 
          /* options */ HttpAdapterConfiguration, 
          Database[js.Object]
        ]
}
