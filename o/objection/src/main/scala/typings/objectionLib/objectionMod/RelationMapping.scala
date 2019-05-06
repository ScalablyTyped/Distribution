package typings
package objectionLib.objectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelationMapping extends js.Object {
  var beforeInsert: js.UndefOr[
    js.Function2[/* model */ Model, /* context */ QueryContext, js.Promise[scala.Unit] | scala.Unit]
  ] = js.undefined
  var filter: js.UndefOr[
    (js.Function1[
      /* queryBuilder */ QueryBuilder[
        _, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RM */ _, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      QueryBuilder[
        _, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RM */ _, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ]
    ]) | java.lang.String | js.Object
  ] = js.undefined
  var join: RelationJoin
  var modelClass: js.Function0[ModelClass[_]] | ModelClass[_] | java.lang.String
  var modify: js.UndefOr[
    (js.Function1[
      /* queryBuilder */ QueryBuilder[
        _, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RM */ _, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      QueryBuilder[
        _, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RM */ _, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ]
    ]) | java.lang.String | js.Object
  ] = js.undefined
  var relation: Relation
}

object RelationMapping {
  @scala.inline
  def apply(
    join: RelationJoin,
    modelClass: js.Function0[ModelClass[_]] | ModelClass[_] | java.lang.String,
    relation: Relation,
    beforeInsert: (/* model */ Model, /* context */ QueryContext) => js.Promise[scala.Unit] | scala.Unit = null,
    filter: (js.Function1[
      /* queryBuilder */ QueryBuilder[
        _, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RM */ _, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      QueryBuilder[
        _, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RM */ _, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ]
    ]) | java.lang.String | js.Object = null,
    modify: (js.Function1[
      /* queryBuilder */ QueryBuilder[
        _, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RM */ _, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      QueryBuilder[
        _, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RM */ _, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ]
    ]) | java.lang.String | js.Object = null
  ): RelationMapping = {
    val __obj = js.Dynamic.literal(join = join, modelClass = modelClass.asInstanceOf[js.Any], relation = relation)
    if (beforeInsert != null) __obj.updateDynamic("beforeInsert")(js.Any.fromFunction2(beforeInsert))
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (modify != null) __obj.updateDynamic("modify")(modify.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationMapping]
  }
}

