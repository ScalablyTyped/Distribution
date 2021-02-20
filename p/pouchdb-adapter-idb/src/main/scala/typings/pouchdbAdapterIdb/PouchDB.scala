package typings.pouchdbAdapterIdb

import org.scalablytyped.runtime.Instantiable2
import typings.pouchdbAdapterIdb.PouchDB.IdbAdapter.IdbAdapterConfiguration
import typings.pouchdbAdapterIdb.pouchdbAdapterIdbStrings.base64
import typings.pouchdbAdapterIdb.pouchdbAdapterIdbStrings.binary
import typings.pouchdbAdapterIdb.pouchdbAdapterIdbStrings.idb
import typings.pouchdbAdapterIdb.pouchdbAdapterIdbStrings.persistent
import typings.pouchdbAdapterIdb.pouchdbAdapterIdbStrings.temporary
import typings.pouchdbCore.PouchDB.Configuration.LocalDatabaseConfiguration
import typings.pouchdbCore.PouchDB.Database
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PouchDB {
  
  object Core {
    
    @js.native
    trait DatabaseInfo extends StObject {
      
      var idb_attachment_format: js.UndefOr[base64 | binary] = js.native
    }
    object DatabaseInfo {
      
      @scala.inline
      def apply(): DatabaseInfo = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DatabaseInfo]
      }
      
      @scala.inline
      implicit class DatabaseInfoMutableBuilder[Self <: DatabaseInfo] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setIdb_attachment_format(value: base64 | binary): Self = StObject.set(x, "idb_attachment_format", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdb_attachment_formatUndefined: Self = StObject.set(x, "idb_attachment_format", js.undefined)
      }
    }
  }
  
  object IdbAdapter {
    
    @js.native
    trait IdbAdapterConfiguration extends LocalDatabaseConfiguration {
      
      @JSName("adapter")
      var adapter_IdbAdapterConfiguration: idb = js.native
      
      /**
        * Configures storage persistence.
        *
        * Only works in Firefox 26+.
        */
      var storage: js.UndefOr[persistent | temporary] = js.native
    }
    object IdbAdapterConfiguration {
      
      @scala.inline
      def apply(adapter: idb): IdbAdapterConfiguration = {
        val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any])
        __obj.asInstanceOf[IdbAdapterConfiguration]
      }
      
      @scala.inline
      implicit class IdbAdapterConfigurationMutableBuilder[Self <: IdbAdapterConfiguration] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAdapter(value: idb): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStorage(value: persistent | temporary): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
      }
    }
  }
  
  @js.native
  trait Static
    extends Instantiable2[
          (/* name */ Null) | (/* name */ String), 
          /* options */ IdbAdapterConfiguration, 
          Database[js.Object]
        ]
}
