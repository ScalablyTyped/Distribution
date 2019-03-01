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

object RelationMapping {
  @scala.inline
  def apply(
    join: RelationJoin,
    modelClass: ModelClass[_] | java.lang.String,
    relation: Relation,
    beforeInsert: js.Function2[/* model */ Model, /* context */ QueryContext, js.Promise[scala.Unit] | scala.Unit] = null,
    filter: (js.Function1[
      /* queryBuilder */ QueryBuilder[_, js.Array[_], js.Array[_]], 
      QueryBuilder[_, js.Array[_], js.Array[_]]
    ]) | java.lang.String | js.Object = null,
    modify: (js.Function1[
      /* queryBuilder */ QueryBuilder[_, js.Array[_], js.Array[_]], 
      QueryBuilder[_, js.Array[_], js.Array[_]]
    ]) | java.lang.String | js.Object = null
  ): RelationMapping = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("join")(join)
    __obj.updateDynamic("modelClass")(modelClass.asInstanceOf[js.Any])
    __obj.updateDynamic("relation")(relation)
    if (beforeInsert != null) __obj.updateDynamic("beforeInsert")(beforeInsert)
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (modify != null) __obj.updateDynamic("modify")(modify.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationMapping]
  }
}

