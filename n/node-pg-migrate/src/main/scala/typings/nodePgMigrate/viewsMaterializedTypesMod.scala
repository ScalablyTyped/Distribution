package typings.nodePgMigrate

import org.scalablytyped.runtime.StringDictionary
import typings.nodePgMigrate.anon.ReverseCreateMaterializedViewFn
import typings.nodePgMigrate.anon.ReverseRefreshMaterializedViewFn
import typings.nodePgMigrate.anon.ReverseRenameMaterializedViewColumnFn
import typings.nodePgMigrate.anon.ReverseRenameMaterializedViewFn
import typings.nodePgMigrate.generalTypesMod.DropOptions
import typings.nodePgMigrate.generalTypesMod.IfNotExistsOption
import typings.nodePgMigrate.generalTypesMod.Name
import typings.nodePgMigrate.nodePgMigrateBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewsMaterializedTypesMod {
  
  type AlterMaterializedView = js.Function2[
    /* viewName */ Name, 
    /* options */ AlterMaterializedViewOptions, 
    String | js.Array[String]
  ]
  
  @js.native
  trait AlterMaterializedViewOptions extends StObject {
    
    var cluster: js.UndefOr[Null | `false` | String] = js.native
    
    var extension: js.UndefOr[String] = js.native
    
    var storageParameters: js.UndefOr[js.Object] = js.native
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
  
  type CreateMaterializedView = CreateMaterializedViewFn with ReverseCreateMaterializedViewFn
  
  type CreateMaterializedViewFn = js.Function3[
    /* viewName */ Name, 
    /* options */ CreateMaterializedViewOptions with DropOptions, 
    /* definition */ String, 
    String | js.Array[String]
  ]
  
  @js.native
  trait CreateMaterializedViewOptions extends IfNotExistsOption {
    
    var columns: js.UndefOr[String | js.Array[String]] = js.native
    
    var data: js.UndefOr[Boolean] = js.native
    
    var storageParameters: js.UndefOr[StorageParameters] = js.native
    
    var tablespace: js.UndefOr[String] = js.native
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
  
  type RefreshMaterializedView = RefreshMaterializedViewFn with ReverseRefreshMaterializedViewFn
  
  type RefreshMaterializedViewFn = js.Function2[
    /* viewName */ Name, 
    /* options */ js.UndefOr[RefreshMaterializedViewOptions], 
    String | js.Array[String]
  ]
  
  @js.native
  trait RefreshMaterializedViewOptions extends StObject {
    
    var concurrently: js.UndefOr[Boolean] = js.native
    
    var data: js.UndefOr[Boolean] = js.native
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
  
  type RenameMaterializedView = RenameMaterializedViewFn with ReverseRenameMaterializedViewFn
  
  type RenameMaterializedViewColumn = RenameMaterializedViewColumnFn with ReverseRenameMaterializedViewColumnFn
  
  type RenameMaterializedViewColumnFn = js.Function3[
    /* viewName */ Name, 
    /* columnName */ String, 
    /* newColumnName */ String, 
    String | js.Array[String]
  ]
  
  type RenameMaterializedViewFn = js.Function2[/* viewName */ Name, /* newViewName */ Name, String | js.Array[String]]
  
  type StorageParameters = StringDictionary[Boolean | Double]
}
