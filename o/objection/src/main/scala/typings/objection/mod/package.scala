package typings.objection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type As[QM /* <: typings.objection.mod.Model */, RM, RV] = js.Function1[/* alias */ java.lang.String, typings.objection.mod.QueryBuilder[QM, RM, RV]]
  type BluebirdMapper[T, Result] = js.Function2[/* item */ T, /* index */ scala.Double, Result]
  type ColumnRef = java.lang.String | typings.objection.mod.Raw_ | typings.objection.mod.Reference | (typings.objection.mod.QueryBuilder[
    js.Any, 
    js.Array[js.Any], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ js.Any
  ])
  type DeepPartialGraph[T] = T | typings.objection.mod.DeepPartialGraphModel[T] | (typings.objection.mod.DeepPartialGraphArray[
    /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
  ])
  type DeepPartialGraphModel[T] = (typings.objection.mod.GraphModel[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in objection.objection.NonFunctionPropertyNames<T> ]:? objection.objection.DeepPartialGraph<T[P]>}
    */ typings.objection.objectionStrings.DeepPartialGraphModel with T
  ]) | typings.std.Partial[T]
  type Distinct[QM /* <: typings.objection.mod.Model */, RM, RV] = typings.objection.mod.ColumnNamesMethod[QM, RM, RV]
  type ErrorHash = org.scalablytyped.runtime.StringDictionary[js.Array[typings.objection.mod.ValidationErrorItem]]
  /**
    * @see http://vincit.github.io/objection.js/#fieldexpression
    */
  type FieldExpression = java.lang.String
  type FilterExpression[QM /* <: typings.objection.mod.Model */] = org.scalablytyped.runtime.StringDictionary[typings.objection.mod.FilterFunction[QM]]
  type FilterFunction[QM /* <: typings.objection.mod.Model */] = js.ThisFunction1[
    /* this */ typings.objection.mod.QueryBuilder[
      QM, 
      js.Array[QM], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ js.Any
    ], 
    /* queryBuilder */ typings.objection.mod.QueryBuilder[
      QM, 
      js.Array[QM], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ js.Any
    ], 
    scala.Unit
  ]
  type Filters[QM /* <: typings.objection.mod.Model */] = org.scalablytyped.runtime.StringDictionary[
    js.ThisFunction1[
      /* this */ typings.objection.mod.QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ js.Any
      ], 
      /* queryBuilder */ typings.objection.mod.QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ js.Any
      ], 
      scala.Unit
    ]
  ]
  type GraphModel[T] = (typings.objection.AnonId with T) | (typings.objection.AnonRef with typings.objection.objectionStrings.GraphModel with js.Any) | (typings.objection.AnonDbRef with typings.objection.objectionStrings.GraphModel with js.Any)
  type Id = java.lang.String | scala.Double
  type IdOrIds = typings.objection.mod.Id | typings.objection.mod.Ids
  type Ids = js.Array[typings.objection.mod.Id]
  type JoinRaw[QM /* <: typings.objection.mod.Model */, RM, RV] = js.Function2[
    /* sql */ java.lang.String, 
    /* bindings */ js.UndefOr[js.Any], 
    typings.objection.mod.QueryBuilder[QM, RM, RV]
  ]
  type JoinRelation = js.Function2[
    /* expr */ typings.objection.mod.RelationExpression, 
    /* opt */ js.UndefOr[typings.objection.mod.RelationOptions], 
    typings.objection.mod.QueryBuilder[
      typings.objection.mod.Model, 
      js.Array[typings.objection.mod.Model], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ js.Any
    ]
  ]
  type JsonObjectOrFieldExpression = js.Object | js.Array[js.Object] | typings.objection.mod.FieldExpression
  type Literal = typings.objection.mod.Castable
  type LiteralBuilder = js.Function1[
    /* value */ typings.objection.mod.Value | typings.objection.mod.LiteralObject, 
    typings.objection.mod.Literal
  ]
  type LiteralObject = org.scalablytyped.runtime.StringDictionary[typings.objection.mod.Value]
  type Modifiers = org.scalablytyped.runtime.StringDictionary[
    js.Function1[
      /* builder */ typings.objection.mod.QueryBuilder[
        js.Any, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RM */ js.Any, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ js.Any
      ], 
      scala.Unit
    ]
  ]
  type NodeStyleCallback = js.Function2[/* err */ js.Any, /* result */ js.UndefOr[js.Any], scala.Unit]
  type NonFunctionPropertyNames[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends std.Function? never : K}[keyof T] */ js.Any
  type PartialUpdate[QM /* <: typings.objection.mod.Model */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof QM ]:? QM[P] | objection.objection.Raw | objection.objection.Reference | objection.objection.QueryBuilder<any, std.Array<any>, / * import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV * / any>}
    */ typings.objection.objectionStrings.PartialUpdate with QM
  type Plugin = js.Function1[
    /* modelClass */ typings.objection.TypeofClassModel, 
    typings.objection.TypeofClassModel
  ]
  type Pojo = org.scalablytyped.runtime.StringDictionary[js.Any]
  type Properties = org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  type QBOrCallback[QM /* <: typings.objection.mod.Model */] = (typings.objection.mod.QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ js.Any
  ]) | (js.ThisFunction1[
    /* this */ typings.objection.mod.QueryBuilder[
      QM, 
      js.Array[QM], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ js.Any
    ], 
    /* queryBuilder */ typings.objection.mod.QueryBuilder[
      QM, 
      js.Array[QM], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ js.Any
    ], 
    scala.Unit
  ])
  type QueryBuilderYieldingOne[QM /* <: typings.objection.mod.Model */] = typings.objection.mod.QueryBuilder[QM, QM, QM]
  type QueryBuilderYieldingOneOrNone[QM /* <: typings.objection.mod.Model */] = typings.objection.mod.QueryBuilder[QM, QM, js.UndefOr[QM]]
  type Raw_ = typings.knex.mod.Raw[js.Any]
  type Reference = typings.objection.mod.Castable
  type ReferenceBuilder = js.Function1[/* expression */ java.lang.String, typings.objection.mod.Reference]
  /**
    * @see http://vincit.github.io/objection.js/#relationexpression
    */
  type RelationExpression = java.lang.String | js.Object
  type RelationExpressionMethod[QM /* <: typings.objection.mod.Model */, RM, RV] = js.Function1[
    /* relationExpression */ typings.objection.mod.RelationExpression, 
    typings.objection.mod.QueryBuilder[QM, RM, RV]
  ]
  type RelationMappings = org.scalablytyped.runtime.StringDictionary[typings.objection.mod.RelationMapping]
  type Select[QM /* <: typings.objection.mod.Model */, RM, RV] = typings.objection.mod.ColumnNamesMethod[QM, RM, RV]
  type TableName = java.lang.String | typings.objection.mod.Raw_ | typings.objection.mod.Reference | (typings.objection.mod.QueryBuilder[
    js.Any, 
    js.Array[js.Any], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ js.Any
  ])
  type TraverserFunction = js.Function3[
    /* model */ typings.objection.mod.Model, 
    /* parentModel */ typings.objection.mod.Model, 
    /* relationName */ java.lang.String, 
    scala.Unit
  ]
  type ValidatorContext = org.scalablytyped.runtime.StringDictionary[js.Any]
  //
  // Partial revision of
  // https://raw.githubusercontent.com/DefinitelyTyped/DefinitelyTyped/master/types/knex/index.d.ts,
  // to change the signatures to return Objection's typed QueryBuilder wrapper:
  //
  type Value = java.lang.String | scala.Double | scala.Boolean | typings.std.Date | (js.Array[scala.Boolean | typings.std.Date | scala.Double | java.lang.String]) | scala.Null | typings.node.Buffer | typings.objection.mod.Raw_ | typings.objection.mod.Literal
  type WhereBetween[QM /* <: typings.objection.mod.Model */, RM, RV] = js.Function2[
    /* column */ typings.objection.mod.ColumnRef, 
    /* range */ js.Tuple2[typings.objection.mod.Value, typings.objection.mod.Value], 
    typings.objection.mod.QueryBuilder[QM, RM, RV]
  ]
  type WhereFieldExpression[QM /* <: typings.objection.mod.Model */, RM, RV] = js.Function1[
    /* fieldExpression */ typings.objection.mod.FieldExpression, 
    typings.objection.mod.QueryBuilder[QM, RM, RV]
  ]
  type WhereJson[QM /* <: typings.objection.mod.Model */, RM, RV] = js.Function2[
    /* fieldExpression */ typings.objection.mod.FieldExpression, 
    /* jsonObjectOrFieldExpression */ typings.objection.mod.JsonObjectOrFieldExpression, 
    typings.objection.mod.QueryBuilder[QM, RM, RV]
  ]
  type WhereJsonExpression[QM /* <: typings.objection.mod.Model */, RM, RV] = js.Function2[
    /* fieldExpression */ typings.objection.mod.FieldExpression, 
    /* keys */ java.lang.String | js.Array[java.lang.String], 
    typings.objection.mod.QueryBuilder[QM, RM, RV]
  ]
  type WhereJsonField[QM /* <: typings.objection.mod.Model */, RM, RV] = js.Function3[
    /* fieldExpression */ typings.objection.mod.FieldExpression, 
    /* operator */ java.lang.String, 
    /* value */ scala.Boolean | scala.Double | java.lang.String | scala.Null, 
    typings.objection.mod.QueryBuilder[QM, RM, RV]
  ]
  type WhereNull[QM /* <: typings.objection.mod.Model */, RM, RV] = js.Function1[
    /* column */ typings.objection.mod.ColumnRef, 
    typings.objection.mod.QueryBuilder[QM, RM, RV]
  ]
  type WhereWrapped[QM /* <: typings.objection.mod.Model */, RM, RV] = js.Function1[
    /* callback */ js.Function1[
      /* queryBuilder */ typings.objection.mod.QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ js.Any
      ], 
      scala.Unit
    ], 
    typings.objection.mod.QueryBuilder[QM, RM, RV]
  ]
  type WithWrapped[QM /* <: typings.objection.mod.Model */, RM, RV] = js.Function2[
    /* alias */ java.lang.String, 
    /* callback */ js.Function1[
      /* queryBuilder */ typings.objection.mod.QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ js.Any
      ], 
      js.Any
    ], 
    typings.objection.mod.QueryBuilder[QM, RM, RV]
  ]
}
