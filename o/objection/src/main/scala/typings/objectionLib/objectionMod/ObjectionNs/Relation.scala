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

