package typings.nodePgMigrate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object viewsMaterializedTypesMod {
  
  type AlterMaterializedView = js.Function2[
    /* viewName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* options */ typings.nodePgMigrate.viewsMaterializedTypesMod.AlterMaterializedViewOptions, 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type CreateMaterializedView = typings.nodePgMigrate.viewsMaterializedTypesMod.CreateMaterializedViewFn with typings.nodePgMigrate.anon.ReverseCreateMaterializedViewFn
  
  type CreateMaterializedViewFn = js.Function3[
    /* viewName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* options */ typings.nodePgMigrate.viewsMaterializedTypesMod.CreateMaterializedViewOptions with typings.nodePgMigrate.generalTypesMod.DropOptions, 
    /* definition */ java.lang.String, 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type DropMaterializedView = js.Function2[
    /* viewName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* options */ js.UndefOr[typings.nodePgMigrate.generalTypesMod.DropOptions], 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type RefreshMaterializedView = typings.nodePgMigrate.viewsMaterializedTypesMod.RefreshMaterializedViewFn with typings.nodePgMigrate.anon.ReverseRefreshMaterializedViewFn
  
  type RefreshMaterializedViewFn = js.Function2[
    /* viewName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* options */ js.UndefOr[typings.nodePgMigrate.viewsMaterializedTypesMod.RefreshMaterializedViewOptions], 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type RenameMaterializedView = typings.nodePgMigrate.viewsMaterializedTypesMod.RenameMaterializedViewFn with typings.nodePgMigrate.anon.ReverseRenameMaterializedViewFn
  
  type RenameMaterializedViewColumn = typings.nodePgMigrate.viewsMaterializedTypesMod.RenameMaterializedViewColumnFn with typings.nodePgMigrate.anon.ReverseRenameMaterializedViewColumnFn
  
  type RenameMaterializedViewColumnFn = js.Function3[
    /* viewName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* columnName */ java.lang.String, 
    /* newColumnName */ java.lang.String, 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type RenameMaterializedViewFn = js.Function2[
    /* viewName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* newViewName */ typings.nodePgMigrate.generalTypesMod.Name, 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type StorageParameters = org.scalablytyped.runtime.StringDictionary[scala.Boolean | scala.Double]
}
