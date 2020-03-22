package typings.nodePgMigrate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object extensionsTypesMod {
  type CreateExtension = typings.nodePgMigrate.extensionsTypesMod.CreateExtensionFn with typings.nodePgMigrate.AnonReverseCreateExtensionFn
  type CreateExtensionFn = js.Function2[
    /* extension */ (typings.nodePgMigrate.generalTypesMod.LiteralUnion[typings.nodePgMigrate.extensionsTypesMod.Extension, java.lang.String]) | (js.Array[
      typings.nodePgMigrate.generalTypesMod.LiteralUnion[typings.nodePgMigrate.extensionsTypesMod.Extension, java.lang.String]
    ]), 
    /* options */ js.UndefOr[
      typings.nodePgMigrate.extensionsTypesMod.CreateExtensionOptions with typings.nodePgMigrate.generalTypesMod.DropOptions
    ], 
    java.lang.String | js.Array[java.lang.String]
  ]
  type DropExtension = js.Function2[
    /* extension */ (typings.nodePgMigrate.generalTypesMod.LiteralUnion[typings.nodePgMigrate.extensionsTypesMod.Extension, java.lang.String]) | (js.Array[
      typings.nodePgMigrate.generalTypesMod.LiteralUnion[typings.nodePgMigrate.extensionsTypesMod.Extension, java.lang.String]
    ]), 
    /* dropOptions */ js.UndefOr[typings.nodePgMigrate.generalTypesMod.DropOptions], 
    java.lang.String | js.Array[java.lang.String]
  ]
}
