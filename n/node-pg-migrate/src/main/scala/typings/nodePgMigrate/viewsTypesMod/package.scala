package typings.nodePgMigrate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object viewsTypesMod {
  type AlterView = js.Function2[
    /* viewName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* options */ typings.nodePgMigrate.viewsTypesMod.AlterViewOptions, 
    java.lang.String | js.Array[java.lang.String]
  ]
  type AlterViewColumn = js.Function3[
    /* viewName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* columnName */ java.lang.String, 
    /* options */ typings.nodePgMigrate.viewsTypesMod.AlterViewColumnOptions, 
    java.lang.String | js.Array[java.lang.String]
  ]
  type CreateView = typings.nodePgMigrate.viewsTypesMod.CreateViewFn with typings.nodePgMigrate.AnonReverseCreateViewFn
  type CreateViewFn = js.Function3[
    /* viewName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* options */ typings.nodePgMigrate.viewsTypesMod.CreateViewOptions with typings.nodePgMigrate.generalTypesMod.DropOptions, 
    /* definition */ java.lang.String, 
    java.lang.String | js.Array[java.lang.String]
  ]
  type DropView = js.Function2[
    /* viewName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* options */ js.UndefOr[typings.nodePgMigrate.generalTypesMod.DropOptions], 
    java.lang.String | js.Array[java.lang.String]
  ]
  type RenameView = typings.nodePgMigrate.viewsTypesMod.RenameViewFn with typings.nodePgMigrate.AnonReverseRenameViewFn
  type RenameViewFn = js.Function2[
    /* viewName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* newViewName */ typings.nodePgMigrate.generalTypesMod.Name, 
    java.lang.String | js.Array[java.lang.String]
  ]
}
