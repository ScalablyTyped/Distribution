package typings
package objectionLib.objectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Relation extends js.Object {
  var joinModelClass: ModelClass[_]
  var joinTable: java.lang.String
  var joinTableOwnerProp: RelationProperty
  var joinTableRelatedProp: RelationProperty
  var name: java.lang.String
  var ownerModelClass: ModelClass[_]
  var ownerProp: RelationProperty
  var relatedModelClass: ModelClass[_]
  var relatedProp: RelationProperty
}

object Relation {
  @scala.inline
  def apply(
    joinModelClass: ModelClass[_],
    joinTable: java.lang.String,
    joinTableOwnerProp: RelationProperty,
    joinTableRelatedProp: RelationProperty,
    name: java.lang.String,
    ownerModelClass: ModelClass[_],
    ownerProp: RelationProperty,
    relatedModelClass: ModelClass[_],
    relatedProp: RelationProperty
  ): Relation = {
    val __obj = js.Dynamic.literal(joinModelClass = joinModelClass, joinTable = joinTable, joinTableOwnerProp = joinTableOwnerProp, joinTableRelatedProp = joinTableRelatedProp, name = name, ownerModelClass = ownerModelClass, ownerProp = ownerProp, relatedModelClass = relatedModelClass, relatedProp = relatedProp)
  
    __obj.asInstanceOf[Relation]
  }
}

