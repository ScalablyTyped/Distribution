package typings.objection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object objectionMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.node.Buffer
  import typings.objection.Anon_DbRef
  import typings.objection.Anon_Id
  import typings.objection.Anon_Ref
  import typings.objection.TypeofClassModel
  import typings.std.Date
  import typings.std.Partial

  type As[QM /* <: Model */, RM, RV] = js.Function1[/* alias */ String, QueryBuilder[QM, RM, RV]]
  type BluebirdMapper[T, Result] = js.Function2[/* item */ T, /* index */ Double, Result]
  type ColumnRef = String | Raw | Reference | (QueryBuilder[
    js.Any, 
    js.Array[js.Any], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ js.Any
  ])
  type DeepPartialGraph[T] = T | DeepPartialGraphModel[T] | (DeepPartialGraphArray[/* import warning: ImportType.apply Failed type conversion: T[number] */ js.Any])
  type DeepPartialGraphModel[T] = (GraphModel[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in objection.objection.NonFunctionPropertyNames<T> ]:? objection.objection.DeepPartialGraph<T[P]>}
    */ typings.objection.objectionStrings.DeepPartialGraphModel with T
  ]) | Partial[T]
  type Distinct[QM /* <: Model */, RM, RV] = ColumnNamesMethod[QM, RM, RV]
  type ErrorHash = StringDictionary[js.Array[ValidationErrorItem]]
  /**
    * @see http://vincit.github.io/objection.js/#fieldexpression
    */
  type FieldExpression = String
  type FilterExpression[QM /* <: Model */] = StringDictionary[FilterFunction[QM]]
  type FilterFunction[QM /* <: Model */] = js.ThisFunction1[
    /* this */ QueryBuilder[
      QM, 
      js.Array[QM], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ js.Any
    ], 
    /* queryBuilder */ QueryBuilder[
      QM, 
      js.Array[QM], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ js.Any
    ], 
    Unit
  ]
  type Filters[QM /* <: Model */] = StringDictionary[
    js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ js.Any
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ js.Any
      ], 
      Unit
    ]
  ]
  type GraphModel[T] = (Anon_Id with T) | (Anon_Ref with typings.objection.objectionStrings.GraphModel with js.Any) | (Anon_DbRef with typings.objection.objectionStrings.GraphModel with js.Any)
  type Id = String | Double
  type IdOrIds = Id | Ids
  type Ids = js.Array[Id]
  type JoinRaw[QM /* <: Model */, RM, RV] = js.Function2[/* sql */ String, /* bindings */ js.UndefOr[js.Any], QueryBuilder[QM, RM, RV]]
  type JoinRelation = js.Function2[
    /* relationName */ String, 
    /* opt */ js.UndefOr[RelationOptions], 
    QueryBuilder[
      Model, 
      js.Array[Model], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ js.Any
    ]
  ]
  type JsonObjectOrFieldExpression = js.Object | js.Array[js.Object] | FieldExpression
  type Literal = Castable
  type LiteralBuilder = js.Function1[/* value */ Value | LiteralObject, Literal]
  type LiteralObject = StringDictionary[Value]
  type Modifiers = StringDictionary[
    js.Function1[
      /* builder */ QueryBuilder[
        js.Any, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RM */ js.Any, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ js.Any
      ], 
      Unit
    ]
  ]
  type NodeStyleCallback = js.Function2[/* err */ js.Any, /* result */ js.UndefOr[js.Any], Unit]
  type NonFunctionPropertyNames[T] = /* import warning: ImportType.apply Failed type conversion: {[ K in keyof T ]: T[K] extends std.Function? never : K}[keyof T] */ js.Any
  type OrderBy[QM /* <: Model */, RM, RV] = js.Function2[/* column */ ColumnRef, /* direction */ js.UndefOr[String], QueryBuilder[QM, RM, RV]]
  type PartialUpdate[QM /* <: Model */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof QM ]:? QM[P] | objection.objection.Raw | objection.objection.Reference | objection.objection.QueryBuilder<any, std.Array<any>, / * import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV * / any>}
    */ typings.objection.objectionStrings.PartialUpdate with QM
  type Plugin = js.Function1[/* modelClass */ TypeofClassModel, TypeofClassModel]
  type Pojo = StringDictionary[js.Any]
  type Properties = StringDictionary[Boolean]
  type QueryBuilderYieldingOne[QM /* <: Model */] = QueryBuilder[QM, QM, QM]
  type QueryBuilderYieldingOneOrNone[QM /* <: Model */] = QueryBuilder[QM, QM, js.UndefOr[QM]]
  type Raw = typings.knex.knexMod.Raw[js.Any]
  type Reference = Castable
  type ReferenceBuilder = js.Function1[/* expression */ String, Reference]
  /**
    * @see http://vincit.github.io/objection.js/#relationexpression
    */
  type RelationExpression = String | js.Object
  type RelationExpressionMethod[QM /* <: Model */, RM, RV] = js.Function1[/* relationExpression */ RelationExpression, QueryBuilder[QM, RM, RV]]
  type RelationMappings = StringDictionary[RelationMapping]
  type Select[QM /* <: Model */, RM, RV] = ColumnNamesMethod[QM, RM, RV]
  type TableName = String | Raw | Reference | (QueryBuilder[
    js.Any, 
    js.Array[js.Any], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ js.Any
  ])
  type TraverserFunction = js.Function3[/* model */ Model, /* parentModel */ Model, /* relationName */ String, Unit]
  type ValidatorContext = StringDictionary[js.Any]
  //
  // Partial revision of
  // https://raw.githubusercontent.com/DefinitelyTyped/DefinitelyTyped/master/types/knex/index.d.ts,
  // to change the signatures to return Objection's typed QueryBuilder wrapper:
  //
  type Value = String | Double | Boolean | Date | (js.Array[Boolean | Date | Double | String]) | Null | Buffer | Raw | Literal
  type WhereBetween[QM /* <: Model */, RM, RV] = js.Function2[
    /* column */ ColumnRef, 
    /* range */ js.Tuple2[Value, Value], 
    QueryBuilder[QM, RM, RV]
  ]
  type WhereFieldExpression[QM /* <: Model */, RM, RV] = js.Function1[/* fieldExpression */ FieldExpression, QueryBuilder[QM, RM, RV]]
  type WhereJson[QM /* <: Model */, RM, RV] = js.Function2[
    /* fieldExpression */ FieldExpression, 
    /* jsonObjectOrFieldExpression */ JsonObjectOrFieldExpression, 
    QueryBuilder[QM, RM, RV]
  ]
  type WhereJsonExpression[QM /* <: Model */, RM, RV] = js.Function2[
    /* fieldExpression */ FieldExpression, 
    /* keys */ String | js.Array[String], 
    QueryBuilder[QM, RM, RV]
  ]
  type WhereJsonField[QM /* <: Model */, RM, RV] = js.Function3[
    /* fieldExpression */ FieldExpression, 
    /* operator */ String, 
    /* value */ Boolean | Double | String | Null, 
    QueryBuilder[QM, RM, RV]
  ]
  type WhereNull[QM /* <: Model */, RM, RV] = js.Function1[/* column */ ColumnRef, QueryBuilder[QM, RM, RV]]
  type WhereWrapped[QM /* <: Model */, RM, RV] = js.Function1[
    /* callback */ js.Function1[
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ js.Any
      ], 
      Unit
    ], 
    QueryBuilder[QM, RM, RV]
  ]
  type WithWrapped[QM /* <: Model */, RM, RV] = js.Function2[
    /* alias */ String, 
    /* callback */ js.Function1[
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ js.Any
      ], 
      js.Any
    ], 
    QueryBuilder[QM, RM, RV]
  ]
}
