package typings.nodePgMigrate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object indexesTypesMod {
  
  type CreateIndex = typings.nodePgMigrate.indexesTypesMod.CreateIndexFn with typings.nodePgMigrate.anon.ReverseCreateIndexFn
  
  type CreateIndexFn = js.Function3[
    /* tableName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* columns */ java.lang.String | (js.Array[java.lang.String | typings.nodePgMigrate.indexesTypesMod.IndexColumn]), 
    /* options */ js.UndefOr[
      typings.nodePgMigrate.indexesTypesMod.CreateIndexOptions with typings.nodePgMigrate.indexesTypesMod.DropIndexOptions
    ], 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type DropIndex = js.Function3[
    /* tableName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* columns */ java.lang.String | (js.Array[java.lang.String | typings.nodePgMigrate.indexesTypesMod.IndexColumn]), 
    /* options */ js.UndefOr[typings.nodePgMigrate.indexesTypesMod.DropIndexOptions], 
    java.lang.String | js.Array[java.lang.String]
  ]
}
