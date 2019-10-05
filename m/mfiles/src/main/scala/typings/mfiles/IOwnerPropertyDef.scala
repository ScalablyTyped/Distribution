package typings.mfiles

import typings.mfiles.MFiles.MFDependencyRelation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOwnerPropertyDef extends js.Object {
  var DependencyRelation: MFDependencyRelation
  var ID: Double
  var IndexForAutomaticFilling: Double
  val IsRelationFiltering: Boolean
}

object IOwnerPropertyDef {
  @scala.inline
  def apply(
    DependencyRelation: MFDependencyRelation,
    ID: Double,
    IndexForAutomaticFilling: Double,
    IsRelationFiltering: Boolean
  ): IOwnerPropertyDef = {
    val __obj = js.Dynamic.literal(DependencyRelation = DependencyRelation, ID = ID, IndexForAutomaticFilling = IndexForAutomaticFilling, IsRelationFiltering = IsRelationFiltering)
  
    __obj.asInstanceOf[IOwnerPropertyDef]
  }
}

