package typings.objection.mod

import typings.objection.TypeofModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Relation extends js.Object {
  var joinModelClass: TypeofModel
  var joinTable: String
  var joinTableOwnerProp: RelationProperty
  var joinTableRelatedProp: RelationProperty
  var name: String
  var ownerModelClass: TypeofModel
  var ownerProp: RelationProperty
  var relatedModelClass: TypeofModel
  var relatedProp: RelationProperty
}

object Relation {
  @scala.inline
  def apply(
    joinModelClass: TypeofModel,
    joinTable: String,
    joinTableOwnerProp: RelationProperty,
    joinTableRelatedProp: RelationProperty,
    name: String,
    ownerModelClass: TypeofModel,
    ownerProp: RelationProperty,
    relatedModelClass: TypeofModel,
    relatedProp: RelationProperty
  ): Relation = {
    val __obj = js.Dynamic.literal(joinModelClass = joinModelClass.asInstanceOf[js.Any], joinTable = joinTable.asInstanceOf[js.Any], joinTableOwnerProp = joinTableOwnerProp.asInstanceOf[js.Any], joinTableRelatedProp = joinTableRelatedProp.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ownerModelClass = ownerModelClass.asInstanceOf[js.Any], ownerProp = ownerProp.asInstanceOf[js.Any], relatedModelClass = relatedModelClass.asInstanceOf[js.Any], relatedProp = relatedProp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Relation]
  }
}

