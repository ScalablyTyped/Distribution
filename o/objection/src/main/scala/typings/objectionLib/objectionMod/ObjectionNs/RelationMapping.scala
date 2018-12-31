package typings
package objectionLib.objectionMod.ObjectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelationMapping extends js.Object {
  var filter: js.UndefOr[
    js.Function1[
      /* queryBuilder */ QueryBuilder[_, js.Array[_], js.Array[_]], 
      QueryBuilder[_, js.Array[_], js.Array[_]]
    ]
  ] = js.undefined
  var join: RelationJoin
  var modelClass: ModelClass[_] | java.lang.String
  var modify: js.UndefOr[
    js.Function1[
      /* queryBuilder */ QueryBuilder[_, js.Array[_], js.Array[_]], 
      QueryBuilder[_, js.Array[_], js.Array[_]]
    ]
  ] = js.undefined
  var relation: Relation
}

