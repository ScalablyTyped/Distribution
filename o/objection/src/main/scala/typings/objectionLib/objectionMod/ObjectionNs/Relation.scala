package typings
package objectionLib.objectionMod.ObjectionNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("joinModelClass")(joinModelClass)
    __obj.updateDynamic("joinTable")(joinTable)
    __obj.updateDynamic("joinTableOwnerProp")(joinTableOwnerProp)
    __obj.updateDynamic("joinTableRelatedProp")(joinTableRelatedProp)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("ownerModelClass")(ownerModelClass)
    __obj.updateDynamic("ownerProp")(ownerProp)
    __obj.updateDynamic("relatedModelClass")(relatedModelClass)
    __obj.updateDynamic("relatedProp")(relatedProp)
    __obj.asInstanceOf[Relation]
  }
}

