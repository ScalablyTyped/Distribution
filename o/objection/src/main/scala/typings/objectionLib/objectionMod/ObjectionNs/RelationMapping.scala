package typings
package objectionLib.objectionMod.ObjectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelationMapping extends js.Object {
  var beforeInsert: js.UndefOr[
    js.Function2[/* model */ Model, /* context */ QueryContext, js.Promise[scala.Unit] | scala.Unit]
  ] = js.undefined
  var filter: js.UndefOr[
    (js.Function1[
      /* queryBuilder */ QueryBuilder[_, js.Array[_], js.Array[_]], 
      QueryBuilder[_, js.Array[_], js.Array[_]]
    ]) | java.lang.String | js.Object
  ] = js.undefined
  var join: RelationJoin
  var modelClass: ModelClass[_] | java.lang.String
  var modify: js.UndefOr[
    (js.Function1[
      /* queryBuilder */ QueryBuilder[_, js.Array[_], js.Array[_]], 
      QueryBuilder[_, js.Array[_], js.Array[_]]
    ]) | java.lang.String | js.Object
  ] = js.undefined
  var relation: Relation
}

