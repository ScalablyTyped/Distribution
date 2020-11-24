package typings.nodePgMigrate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object sequencesTypesMod {
  
  type AlterSequence = js.Function2[
    /* sequenceName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* sequenceOptions */ typings.nodePgMigrate.sequencesTypesMod.SequenceOptionsAlter, 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type CreateSequence = typings.nodePgMigrate.sequencesTypesMod.CreateSequenceFn with typings.nodePgMigrate.anon.ReverseCreateSequenceFn
  
  type CreateSequenceFn = js.Function2[
    /* sequenceName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* sequenceOptions */ js.UndefOr[
      typings.nodePgMigrate.sequencesTypesMod.SequenceOptionsCreate with typings.nodePgMigrate.generalTypesMod.DropOptions
    ], 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type DropSequence = js.Function2[
    /* sequenceName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* dropOptions */ js.UndefOr[typings.nodePgMigrate.generalTypesMod.DropOptions], 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type RenameSequence = typings.nodePgMigrate.sequencesTypesMod.RenameSequenceFn with typings.nodePgMigrate.anon.ReverseRenameSequenceFn
  
  type RenameSequenceFn = js.Function2[
    /* oldSequenceName */ typings.nodePgMigrate.generalTypesMod.Name, 
    /* newSequenceName */ typings.nodePgMigrate.generalTypesMod.Name, 
    java.lang.String | js.Array[java.lang.String]
  ]
}
