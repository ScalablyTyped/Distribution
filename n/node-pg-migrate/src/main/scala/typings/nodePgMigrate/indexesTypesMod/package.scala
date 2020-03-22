package typings.nodePgMigrate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object indexesTypesMod {
  type AddIndex = js.Function3[
    /* tableName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* columns */ java.lang.String | js.Array[java.lang.String], 
    /* options */ js.UndefOr[typings.nodePgMigrate.indexesTypesMod.CreateIndexOptions], 
    java.lang.String | js.Array[java.lang.String]
  ]
  type CreateIndex = typings.nodePgMigrate.indexesTypesMod.CreateIndexFn with typings.nodePgMigrate.AnonReverseCreateIndexFn
  type CreateIndexFn = js.Function3[
    /* tableName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* columns */ java.lang.String | js.Array[java.lang.String], 
    /* options */ js.UndefOr[
      typings.nodePgMigrate.indexesTypesMod.CreateIndexOptions with typings.nodePgMigrate.indexesTypesMod.DropIndexOptions
    ], 
    java.lang.String | js.Array[java.lang.String]
  ]
  type DropIndex = js.Function3[
    /* tableName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* columns */ java.lang.String | js.Array[java.lang.String], 
    /* options */ js.UndefOr[typings.nodePgMigrate.indexesTypesMod.DropIndexOptions], 
    java.lang.String | js.Array[java.lang.String]
  ]
}
