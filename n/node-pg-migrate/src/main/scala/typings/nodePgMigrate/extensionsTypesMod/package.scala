package typings.nodePgMigrate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object extensionsTypesMod {
  
  type CreateExtension = typings.nodePgMigrate.extensionsTypesMod.CreateExtensionFn with typings.nodePgMigrate.anon.ReverseCreateExtensionFn
  
  type CreateExtensionFn = js.Function2[
    /* extension */ typings.nodePgMigrate.extensionsTypesMod.StringExtension | js.Array[typings.nodePgMigrate.extensionsTypesMod.StringExtension], 
    /* options */ js.UndefOr[
      typings.nodePgMigrate.extensionsTypesMod.CreateExtensionOptions with typings.nodePgMigrate.generalTypesMod.DropOptions
    ], 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type DropExtension = js.Function2[
    /* extension */ typings.nodePgMigrate.extensionsTypesMod.StringExtension | js.Array[typings.nodePgMigrate.extensionsTypesMod.StringExtension], 
    /* dropOptions */ js.UndefOr[typings.nodePgMigrate.generalTypesMod.DropOptions], 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type StringExtension = typings.nodePgMigrate.generalTypesMod.LiteralUnion[typings.nodePgMigrate.extensionsTypesMod.Extension]
}
