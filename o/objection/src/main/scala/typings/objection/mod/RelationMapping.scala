package typings.objection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelationMapping[M /* <: Model */] extends js.Object {
  var beforeInsert: js.UndefOr[RelationMappingHook[M]] = js.undefined
  var filter: js.UndefOr[Modifier[QueryBuilderType[M]]] = js.undefined
  var join: RelationJoin
  var modelClass: ModelClassSpecifier
  var modify: js.UndefOr[Modifier[QueryBuilderType[M]]] = js.undefined
  var relation: RelationType
}

object RelationMapping {
  @scala.inline
  def apply[M /* <: Model */](
    join: RelationJoin,
    modelClass: ModelClassSpecifier,
    relation: RelationType,
    beforeInsert: (M, /* context */ QueryContext) => js.Promise[Unit] | Unit = null,
    filter: Modifier[QueryBuilderType[M]] = null,
    modify: Modifier[QueryBuilderType[M]] = null
  ): RelationMapping[M] = {
    val __obj = js.Dynamic.literal(join = join.asInstanceOf[js.Any], modelClass = modelClass.asInstanceOf[js.Any], relation = relation.asInstanceOf[js.Any])
    if (beforeInsert != null) __obj.updateDynamic("beforeInsert")(js.Any.fromFunction2(beforeInsert))
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (modify != null) __obj.updateDynamic("modify")(modify.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationMapping[M]]
  }
}

