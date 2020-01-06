package typings.objection.objectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelationMapping extends js.Object {
  var beforeInsert: js.UndefOr[
    js.Function2[/* model */ Model, /* context */ QueryContext, js.Promise[Unit] | Unit]
  ] = js.undefined
  var filter: js.UndefOr[
    (js.Function1[
      /* queryBuilder */ QueryBuilder[
        _, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RM */ _, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      QueryBuilder[
        _, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RM */ _, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ]
    ]) | String | js.Object
  ] = js.undefined
  var join: RelationJoin
  var modelClass: js.Function0[ModelClass[_]] | ModelClass[_] | String
  var modify: js.UndefOr[
    (js.Function1[
      /* queryBuilder */ QueryBuilder[
        _, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RM */ _, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      QueryBuilder[
        _, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RM */ _, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ]
    ]) | String | js.Object
  ] = js.undefined
  var relation: Relation
}

object RelationMapping {
  @scala.inline
  def apply(
    join: RelationJoin,
    modelClass: js.Function0[ModelClass[_]] | ModelClass[_] | String,
    relation: Relation,
    beforeInsert: (/* model */ Model, /* context */ QueryContext) => js.Promise[Unit] | Unit = null,
    filter: (js.Function1[
      /* queryBuilder */ QueryBuilder[
        _, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RM */ _, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      QueryBuilder[
        _, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RM */ _, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ]
    ]) | String | js.Object = null,
    modify: (js.Function1[
      /* queryBuilder */ QueryBuilder[
        _, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RM */ _, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ], 
      QueryBuilder[
        _, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RM */ _, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
      ]
    ]) | String | js.Object = null
  ): RelationMapping = {
    val __obj = js.Dynamic.literal(join = join.asInstanceOf[js.Any], modelClass = modelClass.asInstanceOf[js.Any], relation = relation.asInstanceOf[js.Any])
    if (beforeInsert != null) __obj.updateDynamic("beforeInsert")(js.Any.fromFunction2(beforeInsert))
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (modify != null) __obj.updateDynamic("modify")(modify.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationMapping]
  }
}

