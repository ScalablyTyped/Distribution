package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOwnerPropertyDef extends js.Object {
  var DependencyRelation: mfilesLib.MFilesNs.MFDependencyRelation
  var ID: scala.Double
  var IndexForAutomaticFilling: scala.Double
  val IsRelationFiltering: scala.Boolean
}

object IOwnerPropertyDef {
  @scala.inline
  def apply(
    DependencyRelation: mfilesLib.MFilesNs.MFDependencyRelation,
    ID: scala.Double,
    IndexForAutomaticFilling: scala.Double,
    IsRelationFiltering: scala.Boolean
  ): IOwnerPropertyDef = {
    val __obj = js.Dynamic.literal(DependencyRelation = DependencyRelation, ID = ID, IndexForAutomaticFilling = IndexForAutomaticFilling, IsRelationFiltering = IsRelationFiltering)
  
    __obj.asInstanceOf[IOwnerPropertyDef]
  }
}

