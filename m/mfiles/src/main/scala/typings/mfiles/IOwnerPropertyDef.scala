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
    val __obj = js.Dynamic.literal(DependencyRelation = DependencyRelation.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], IndexForAutomaticFilling = IndexForAutomaticFilling.asInstanceOf[js.Any], IsRelationFiltering = IsRelationFiltering.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOwnerPropertyDef]
  }
}

