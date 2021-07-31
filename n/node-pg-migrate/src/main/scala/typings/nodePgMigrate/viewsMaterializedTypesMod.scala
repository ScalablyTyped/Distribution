package typings.nodePgMigrate

import org.scalablytyped.runtime.StringDictionary
import typings.nodePgMigrate.generalTypesMod.DropOptions
import typings.nodePgMigrate.generalTypesMod.IfNotExistsOption
import typings.nodePgMigrate.generalTypesMod.Name
import typings.nodePgMigrate.nodePgMigrateBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewsMaterializedTypesMod {
  
  type AlterMaterializedView = js.Function2[
    /* viewName */ Name, 
    /* options */ AlterMaterializedViewOptions, 
    String | js.Array[String]
  ]
  
  trait AlterMaterializedViewOptions extends StObject {
    
    var cluster: js.UndefOr[Null | `false` | String] = js.undefined
    
    var `extension`: js.UndefOr[String] = js.undefined
    
    var storageParameters: js.UndefOr[js.Object] = js.undefined
  }
  object AlterMaterializedViewOptions {
    
    @scala.inline
    def apply(): AlterMaterializedViewOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlterMaterializedViewOptions]
    }
    
    @scala.inline
    implicit class AlterMaterializedViewOptionsMutableBuilder[Self <: AlterMaterializedViewOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCluster(value: `false` | String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterNull: Self = StObject.set(x, "cluster", null)
      
      @scala.inline
      def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
      
      @scala.inline
      def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
      
      @scala.inline
      def setStorageParameters(value: js.Object): Self = StObject.set(x, "storageParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageParametersUndefined: Self = StObject.set(x, "storageParameters", js.undefined)
    }
  }
  
  @js.native
  trait CreateMaterializedView extends CreateMaterializedViewFn {
    
    def reverse(viewName: Name, options: CreateMaterializedViewOptions & DropOptions, definition: String): String | js.Array[String] = js.native
    @JSName("reverse")
    var reverse_Original: CreateMaterializedViewFn = js.native
  }
  
  type CreateMaterializedViewFn = js.Function3[
    /* viewName */ Name, 
    /* options */ CreateMaterializedViewOptions & DropOptions, 
    /* definition */ String, 
    String | js.Array[String]
  ]
  
  trait CreateMaterializedViewOptions
    extends StObject
       with IfNotExistsOption {
    
    var columns: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var data: js.UndefOr[Boolean] = js.undefined
    
    var storageParameters: js.UndefOr[StorageParameters] = js.undefined
    
    var tablespace: js.UndefOr[String] = js.undefined
  }
  object CreateMaterializedViewOptions {
    
    @scala.inline
    def apply(): CreateMaterializedViewOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateMaterializedViewOptions]
    }
    
    @scala.inline
    implicit class CreateMaterializedViewOptionsMutableBuilder[Self <: CreateMaterializedViewOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumns(value: String | js.Array[String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      @scala.inline
      def setColumnsVarargs(value: String*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setData(value: Boolean): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setStorageParameters(value: StorageParameters): Self = StObject.set(x, "storageParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageParametersUndefined: Self = StObject.set(x, "storageParameters", js.undefined)
      
      @scala.inline
      def setTablespace(value: String): Self = StObject.set(x, "tablespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTablespaceUndefined: Self = StObject.set(x, "tablespace", js.undefined)
    }
  }
  
  type DropMaterializedView = js.Function2[
    /* viewName */ Name, 
    /* options */ js.UndefOr[DropOptions], 
    String | js.Array[String]
  ]
  
  @js.native
  trait RefreshMaterializedView extends RefreshMaterializedViewFn {
    
    def reverse(viewName: Name): String | js.Array[String] = js.native
    def reverse(viewName: Name, options: RefreshMaterializedViewOptions): String | js.Array[String] = js.native
    @JSName("reverse")
    var reverse_Original: RefreshMaterializedViewFn = js.native
  }
  
  type RefreshMaterializedViewFn = js.Function2[
    /* viewName */ Name, 
    /* options */ js.UndefOr[RefreshMaterializedViewOptions], 
    String | js.Array[String]
  ]
  
  trait RefreshMaterializedViewOptions extends StObject {
    
    var concurrently: js.UndefOr[Boolean] = js.undefined
    
    var data: js.UndefOr[Boolean] = js.undefined
  }
  object RefreshMaterializedViewOptions {
    
    @scala.inline
    def apply(): RefreshMaterializedViewOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RefreshMaterializedViewOptions]
    }
    
    @scala.inline
    implicit class RefreshMaterializedViewOptionsMutableBuilder[Self <: RefreshMaterializedViewOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConcurrently(value: Boolean): Self = StObject.set(x, "concurrently", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConcurrentlyUndefined: Self = StObject.set(x, "concurrently", js.undefined)
      
      @scala.inline
      def setData(value: Boolean): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    }
  }
  
  @js.native
  trait RenameMaterializedView extends RenameMaterializedViewFn {
    
    def reverse(viewName: Name, newViewName: Name): String | js.Array[String] = js.native
    @JSName("reverse")
    var reverse_Original: RenameMaterializedViewFn = js.native
  }
  
  @js.native
  trait RenameMaterializedViewColumn extends RenameMaterializedViewColumnFn {
    
    def reverse(viewName: Name, columnName: String, newColumnName: String): String | js.Array[String] = js.native
    @JSName("reverse")
    var reverse_Original: RenameMaterializedViewColumnFn = js.native
  }
  
  type RenameMaterializedViewColumnFn = js.Function3[
    /* viewName */ Name, 
    /* columnName */ String, 
    /* newColumnName */ String, 
    String | js.Array[String]
  ]
  
  type RenameMaterializedViewFn = js.Function2[/* viewName */ Name, /* newViewName */ Name, String | js.Array[String]]
  
  type StorageParameters = StringDictionary[Boolean | Double]
}
