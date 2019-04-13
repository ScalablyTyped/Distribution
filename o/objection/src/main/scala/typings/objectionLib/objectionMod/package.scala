package typings
package objectionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object objectionMod {
  type As[QM /* <: Model */, RM, RV] = js.Function1[/* alias */ java.lang.String, QueryBuilder[QM, RM, RV]]
  type BluebirdMapper[T, Result] = js.Function2[/* item */ T, /* index */ scala.Double, Result]
  type ColumnRef = java.lang.String | Raw | Reference | (QueryBuilder[
    js.Any, 
    js.Array[js.Any], 
    /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ js.Any
  ])
  type DeepPartialGraph[T] = T | DeepPartialGraphModel[T] | (DeepPartialGraphArray[/* import warning: ImportType.apply Failed type conversion: T[number] */ js.Any])
  type DeepPartialGraphModel[T] = (GraphModel[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in objection.objection.NonFunctionPropertyNames<T> ]:? objection.objection.DeepPartialGraph<T[P]>}
    */ objectionLib.objectionLibStrings.DeepPartialGraphModel with T
  ]) | stdLib.Partial[T]
  type Distinct[QM /* <: Model */, RM, RV] = ColumnNamesMethod[QM, RM, RV]
  type ErrorHash = org.scalablytyped.runtime.StringDictionary[js.Array[ValidationErrorItem]]
  /**
    * @see http://vincit.github.io/objection.js/#fieldexpression
    */
  type FieldExpression = java.lang.String
  type FilterExpression[QM /* <: Model */] = org.scalablytyped.runtime.StringDictionary[FilterFunction[QM]]
  type FilterFunction[QM /* <: Model */] = js.ThisFunction1[
    /* this */ QueryBuilder[
      QM, 
      js.Array[QM], 
      /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ js.Any
    ], 
    /* queryBuilder */ QueryBuilder[
      QM, 
      js.Array[QM], 
      /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ js.Any
    ], 
    scala.Unit
  ]
  type Filters[QM /* <: Model */] = org.scalablytyped.runtime.StringDictionary[
    js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ js.Any
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ js.Any
      ], 
      scala.Unit
    ]
  ]
  type GraphModel[T] = (objectionLib.Anon_DbRef with T) | (objectionLib.Anon_DbRefId with objectionLib.objectionLibStrings.GraphModel with js.Any) | (objectionLib.Anon_DbRefIdRef with objectionLib.objectionLibStrings.GraphModel with js.Any)
  type Id = java.lang.String | scala.Double
  type IdOrIds = Id | Ids
  type Ids = js.Array[Id]
  type JoinRaw[QM /* <: Model */, RM, RV] = js.Function2[
    /* sql */ java.lang.String, 
    /* bindings */ js.UndefOr[js.Any], 
    QueryBuilder[QM, RM, RV]
  ]
  type JoinRelation = js.Function2[
    /* relationName */ java.lang.String, 
    /* opt */ js.UndefOr[RelationOptions], 
    QueryBuilder[
      Model, 
      js.Array[Model], 
      /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ js.Any
    ]
  ]
  type JsonObjectOrFieldExpression = js.Object | js.Array[js.Object] | FieldExpression
  type Literal = Castable
  type LiteralBuilder = js.Function1[/* value */ Value | LiteralObject, Literal]
  type LiteralObject = org.scalablytyped.runtime.StringDictionary[Value]
  type ModifyEager[QM1 /* <: Model */, RM1, RV1] = js.Function2[
    /* relationExpression */ RelationExpression, 
    /* modifier */ js.Function1[
      /* builder */ QueryBuilder[
        Model, 
        js.Array[Model], 
        /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ js.Any
      ], 
      scala.Unit
    ], 
    QueryBuilder[QM1, RM1, RV1]
  ]
  type NodeStyleCallback = js.Function2[/* err */ js.Any, /* result */ js.UndefOr[js.Any], scala.Unit]
  type NonFunctionPropertyNames[T] = /* import warning: ImportType.apply Failed type conversion: {[ K in keyof T ]: K}[keyof T] */ js.Any
  type OrderBy[QM /* <: Model */, RM, RV] = js.Function2[
    /* column */ ColumnRef, 
    /* direction */ js.UndefOr[java.lang.String], 
    QueryBuilder[QM, RM, RV]
  ]
  type PartialUpdate[QM /* <: Model */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof QM ]:? QM[P] | objection.objection.Raw | objection.objection.Reference | objection.objection.QueryBuilder<any, std.Array<any>, any>}
    */ objectionLib.objectionLibStrings.PartialUpdate with QM
  type Plugin = js.Function1[/* modelClass */ objectionLib.Anon_Args, objectionLib.Anon_Args]
  type Pojo = org.scalablytyped.runtime.StringDictionary[js.Any]
  type Properties = org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  type QueryBuilderYieldingOne[QM /* <: Model */] = QueryBuilder[QM, QM, QM]
  type QueryBuilderYieldingOneOrNone[QM /* <: Model */] = QueryBuilder[QM, QM, js.UndefOr[QM]]
  type Raw = knexLib.knexMod.Raw
  type Reference = Castable
  type ReferenceBuilder = js.Function1[/* expression */ java.lang.String, Reference]
  /**
    * @see http://vincit.github.io/objection.js/#relationexpression
    */
  type RelationExpression = java.lang.String | js.Object
  type RelationExpressionMethod[QM /* <: Model */, RM, RV] = js.Function1[/* relationExpression */ RelationExpression, QueryBuilder[QM, RM, RV]]
  type RelationMappings = org.scalablytyped.runtime.StringDictionary[RelationMapping]
  type Select[QM /* <: Model */, RM, RV] = ColumnNamesMethod[QM, RM, RV]
  type TableName = java.lang.String | Raw | Reference | (QueryBuilder[
    js.Any, 
    js.Array[js.Any], 
    /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ js.Any
  ])
  type TraverserFunction = js.Function3[
    /* model */ Model, 
    /* parentModel */ Model, 
    /* relationName */ java.lang.String, 
    scala.Unit
  ]
  type ValidatorContext = org.scalablytyped.runtime.StringDictionary[js.Any]
  //
  // Partial revision of
  // https://raw.githubusercontent.com/DefinitelyTyped/DefinitelyTyped/master/types/knex/index.d.ts,
  // to change the signatures to return Objection's typed QueryBuilder wrapper:
  //
  type Value = java.lang.String | scala.Double | scala.Boolean | stdLib.Date | js.Array[java.lang.String] | js.Array[scala.Double] | js.Array[scala.Boolean] | js.Array[stdLib.Date] | scala.Null | nodeLib.Buffer | Raw | Literal
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
    /* keys */ java.lang.String | js.Array[java.lang.String], 
    QueryBuilder[QM, RM, RV]
  ]
  type WhereJsonField[QM /* <: Model */, RM, RV] = js.Function3[
    /* fieldExpression */ FieldExpression, 
    /* operator */ java.lang.String, 
    /* value */ scala.Boolean | scala.Double | java.lang.String | scala.Null, 
    QueryBuilder[QM, RM, RV]
  ]
  type WhereNull[QM /* <: Model */, RM, RV] = js.Function1[/* column */ ColumnRef, QueryBuilder[QM, RM, RV]]
  type WhereWrapped[QM /* <: Model */, RM, RV] = js.Function1[
    /* callback */ js.Function1[
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ js.Any
      ], 
      scala.Unit
    ], 
    QueryBuilder[QM, RM, RV]
  ]
  type WithWrapped[QM /* <: Model */, RM, RV] = js.Function2[
    /* alias */ java.lang.String, 
    /* callback */ js.Function1[
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ js.Any
      ], 
      js.Any
    ], 
    QueryBuilder[QM, RM, RV]
  ]
}
