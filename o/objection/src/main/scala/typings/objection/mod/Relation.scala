package typings.objection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Relation extends js.Object {
  var joinModelClass: ModelClass[_]
  var joinTable: String
  var joinTableOwnerProp: RelationProperty
  var joinTableRelatedProp: RelationProperty
  var name: String
  var ownerModelClass: ModelClass[_]
  var ownerProp: RelationProperty
  var relatedModelClass: ModelClass[_]
  var relatedProp: RelationProperty
}

object Relation {
  @scala.inline
  def apply(
    joinModelClass: ModelClass[_],
    joinTable: String,
    joinTableOwnerProp: RelationProperty,
    joinTableRelatedProp: RelationProperty,
    name: String,
    ownerModelClass: ModelClass[_],
    ownerProp: RelationProperty,
    relatedModelClass: ModelClass[_],
    relatedProp: RelationProperty
  ): Relation = {
    val __obj = js.Dynamic.literal(joinModelClass = joinModelClass.asInstanceOf[js.Any], joinTable = joinTable.asInstanceOf[js.Any], joinTableOwnerProp = joinTableOwnerProp.asInstanceOf[js.Any], joinTableRelatedProp = joinTableRelatedProp.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ownerModelClass = ownerModelClass.asInstanceOf[js.Any], ownerProp = ownerProp.asInstanceOf[js.Any], relatedModelClass = relatedModelClass.asInstanceOf[js.Any], relatedProp = relatedProp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Relation]
  }
}

