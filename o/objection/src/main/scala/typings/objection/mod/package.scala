package typings.objection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AggregateMethod[QB /* <: typings.objection.mod.AnyQueryBuilder */] = js.Function1[/* column */ typings.objection.mod.ColumnRef, QB]
  type AliasForMethod[QB /* <: typings.objection.mod.AnyQueryBuilder */] = js.Function2[
    /* modelClassOrTableName */ java.lang.String | typings.objection.mod.AnyModelConstructor, 
    /* alias */ java.lang.String, 
    QB
  ]
  type AllowGraphMethod[QB /* <: typings.objection.mod.AnyQueryBuilder */] = js.Function1[
    /* expr */ typings.objection.mod.RelationExpression[typings.objection.mod.ModelType[QB]], 
    QB
  ]
  type AnyModelConstructor = typings.objection.mod.ModelConstructor[typings.objection.mod.Model]
  type AnyQueryBuilder = typings.objection.mod.QueryBuilder[js.Any, js.Any]
  // Deprecated
  type ApplyFilterMethod[QB /* <: typings.objection.mod.AnyQueryBuilder */] = js.Function1[/* repeated */ java.lang.String, QB]
  /**
    * Gets the multi-item query builder type for a query builder.
    */
  type ArrayQueryBuilder[QB /* <: typings.objection.mod.AnyQueryBuilder */] = /* import warning: importer.ImportType#apply Failed type conversion: QB['ArrayQueryBuilderType'] */ js.Any
  type ArrayQueryBuilderThunk[M /* <: typings.objection.mod.Model */] = js.Function0[
    typings.objection.mod.ArrayQueryBuilder[typings.objection.mod.QueryBuilderType[M]]
  ]
  /**
    * Just like RelatedQueryBuilder but always returns an array
    * query builder even if the property type is a model and not
    * an array of models.
    */
  type ArrayRelatedQueryBuilder[T] = typings.objection.mod.QueryBuilderType[js.Any | T]
  type AsMethod[QB /* <: typings.objection.mod.AnyQueryBuilder */] = js.Function1[/* alias */ java.lang.String, QB]
  type BooleanReturningMethod = js.Function0[scala.Boolean]
  type CallbackVoid[T] = js.ThisFunction1[/* this */ T, /* arg */ T, scala.Unit]
  type CancelQueryThunk = js.Function1[/* result */ js.Any, scala.Unit]
  type ClearContextMethod[QB /* <: typings.objection.mod.AnyQueryBuilder */] = js.Function0[QB]
  type ClearMethod[QB /* <: typings.objection.mod.AnyQueryBuilder */] = js.Function1[/* selector */ java.lang.String | typings.std.RegExp, QB]
  type ColumnInfoMethod[QB /* <: typings.objection.mod.AnyQueryBuilder */] = js.Function0[js.Promise[typings.knex.mod.ColumnInfo]]
  type ColumnRef = java.lang.String | typings.objection.mod.Raw_ | typings.objection.mod.ReferenceBuilder
  type ColumnRefOrOrderByDescriptor = typings.objection.mod.ColumnRef | typings.objection.mod.OrderByDescriptor
  type CompositeId = js.Array[typings.objection.mod.Id]
  /**
    * Removes `undefined` from a type.
    */
  type Defined[T] = typings.std.Exclude[T, js.UndefOr[scala.Nothing]]
  // Deprecated
  type EagerAlgorithmMethod[QB /* <: typings.objection.mod.AnyQueryBuilder */] = js.Function1[/* algorithm */ typings.objection.mod.EagerAlgorithm, QB]
  // Deprecated
  type EagerMethod[QB /* <: typings.objection.mod.AnyQueryBuilder */] = js.Function2[
    /* expr */ typings.objection.mod.RelationExpression[typings.objection.mod.ModelType[QB]], 
    /* modifiers */ js.UndefOr[typings.objection.mod.Modifiers[typings.objection.mod.AnyQueryBuilder]], 
    QB
  ]
  // Deprecated
  type EagerOptionsMethod[QB /* <: typings.objection.mod.AnyQueryBuilder */] = js.Function1[/* options */ typings.objection.mod.EagerOptions, QB]
  type ErrorHash = org.scalablytyped.runtime.StringDictionary[js.Array[typings.objection.mod.ValidationErrorItem]]
  type Expression[T] = T | typings.objection.mod.Raw_ | typings.objection.mod.ReferenceBuilder | typings.objection.mod.ValueBuilder | typings.objection.mod.AnyQueryBuilder
  type ExpressionObject = org.scalablytyped.runtime.StringDictionary[typings.objection.mod.Expression[typings.objection.mod.PrimitiveValue]]
  /**
    * https://vincit.github.io/objection.js/api/types/#type-fieldexpression
    */
  type FieldExpression = java.lang.String
  type FirstMethod = js.ThisFunction0[
    /* this */ typings.objection.mod.AnyQueryBuilder, 
    typings.objection.mod.AnyQueryBuilder | typings.objection.mod.SingleQueryBuilder[typings.objection.mod.AnyQueryBuilder]
  ]
  type ForClassMethod = js.Function1[
    /* modelClass */ typings.objection.mod.ModelConstructor[typings.objection.mod.Model], 
    typings.objection.mod.QueryBuilderType[typings.objection.mod.Model]
  ]
  type ForIdValue = typings.objection.mod.MaybeCompositeId | typings.objection.mod.AnyQueryBuilder
  type FunctionBuilder = typings.objection.mod.Castable
  type GraphExpressionObjectMethod[QB /* <: typings.objection.mod.AnyQueryBuilder */] = js.Function0[js.Any]
  type HasMethod = js.Function1[/* selector */ java.lang.String | typings.std.RegExp, scala.Boolean]
  type Id = java.lang.String | scala.Double
  type Identity[T] = js.Function1[/* value */ T, T]
  type IdentityMethod[QB /* <: typings.objection.mod.AnyQueryBuilder */] = js.Function0[QB]
  type IncrementDecrementMethod[QB /* <: typings.objection.mod.AnyQueryBuilder */] = js.Function2[/* column */ java.lang.String, /* amount */ js.UndefOr[scala.Double], QB]
  /**
    * If T is an array, returns the item type, otherwise returns T.
    */
  type ItemType[T] = T | (/* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any)
  type JSONSchemaDefinition = typings.objection.mod.JSONSchema | scala.Boolean
  type JSONSchemaType = js.Array[typings.objection.mod.JSONSchemaArray] | scala.Boolean | scala.Double | scala.Null | js.Object | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.objection.objectionStrings.string
    - typings.objection.objectionStrings.number
    - typings.objection.objectionStrings.integer
    - typings.objection.objectionStrings.boolean
    - typings.objection.objectionStrings.`object`
    - typings.objection.objectionStrings.array
    - typings.objection.objectionStrings.`null`
    - java.lang.String
  */
  type JSONSchemaTypeName = typings.objection.mod._JSONSchemaTypeName | java.lang.String
  type JSONSchemaVersion = java.lang.String
  type JoinRawMethod[QB /* <: typings.objection.mod.AnyQueryBuilder */] = typings.objection.mod.RawInterface[QB]
  type JoinRelatedMethod[QB /* <: typings.objection.mod.AnyQueryBuilder */] = js.Function2[
    /* expr */ typings.objection.mod.RelationExpression[typings.objection.mod.ModelType[QB]], 
    /* opt */ js.UndefOr[typings.objection.mod.JoinRelatedOptions], 
    QB
  ]
  type JsonObjectOrFieldExpression = js.Object | js.Array[js.Object] | typings.objection.mod.FieldExpression
  type KnexSnakeCaseMappersFactory = js.Function1[
    /* options */ js.UndefOr[typings.objection.mod.SnakeCaseMappersOptions], 
    typings.objection.mod.KnexMappers
  ]
  type MaybeCompositeId = typings.objection.mod.Id | typings.objection.mod.CompositeId
  type ModelClassFactory = js.Function0[typings.objection.mod.AnyModelConstructor]
  type ModelClassMethod[M /* <: typings.objection.mod.Model */] = js.Function0[typings.objection.mod.ModelClass[M]]
  type ModelClassSpecifier = typings.objection.mod.ModelClassFactory | typings.objection.mod.AnyModelConstructor | java.lang.String
  type ModelConstructor[M /* <: typings.objection.mod.Model */] = typings.objection.mod.Constructor[M]
  /**
    * A Pojo version of model.
    */
  type ModelObject[T /* <: typings.objection.mod.Model */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in objection.objection.NonFunctionPropertyNames<T> ]: T[K]}
    */ typings.objection.objectionStrings.ModelObject with T
  /**
    * Extracts the property names (excluding relations) of a model class.
    */
  type ModelProps[T /* <: typings.objection.mod.Model */] = typings.std.Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]:? objection.objection.Defined<T[K]> extends objection.objection.Model? never : objection.objection.Defined<T[K]> extends std.Array<infer I>? any extends objection.objection.Model? never : K : T[K] extends std.Function? never : K}[keyof T] */ js.Any, 
    js.UndefOr[typings.objection.objectionStrings.QueryBuilderType]
  ]
  /**
    * Extracts the relation names of the a model class.
    */
  type ModelRelations[T /* <: typings.objection.mod.Model */] = typings.objection.mod.Defined[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]:? objection.objection.Defined<T[K]> extends objection.objection.Model? K : objection.objection.Defined<T[K]> extends std.Array<infer I>? any extends objection.objection.Model? K : never : never}[keyof T] */ js.Any
  ]
  /**
    * Gets the model type from a query builder type.
    */
  type ModelType[QB /* <: typings.objection.mod.AnyQueryBuilder */] = /* import warning: importer.ImportType#apply Failed type conversion: QB['ModelType'] */ js.Any
  type Modifier[QB /* <: typings.objection.mod.AnyQueryBuilder */] = typings.objection.mod.ModifierFunction[QB] | java.lang.String | js.Array[java.lang.String] | (typings.std.Record[
    java.lang.String, 
    typings.objection.mod.Expression[typings.objection.mod.PrimitiveValue]
  ])
  type ModifierFunction[QB /* <: typings.objection.mod.AnyQueryBuilder */] = js.Function2[/* qb */ QB, /* repeated */ js.Any, scala.Unit]
  type Modifiers[QB /* <: typings.objection.mod.AnyQueryBuilder */] = org.scalablytyped.runtime.StringDictionary[typings.objection.mod.Modifier[QB]]
  type ModifyGraphMethod[QB /* <: typings.objection.mod.AnyQueryBuilder */] = js.Function2[
    /* expr */ typings.objection.mod.RelationExpression[typings.objection.mod.ModelType[QB]], 
    /* modifier */ typings.objection.mod.Modifier[typings.objection.mod.QueryBuilderType[typings.objection.mod.Model]], 
    QB
  ]
  type ModifyMethod[QB /* <: typings.objection.mod.AnyQueryBuilder */] = js.Function2[
    /* modifier */ typings.objection.mod.Modifier[QB] | js.Array[typings.objection.mod.Modifier[QB]], 
    /* repeated */ js.Any, 
    QB
  ]
  /**
    * Type for keys of non-function properties of T.
    */
  type NonFunctionPropertyNames[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends std.Function? never : K}[keyof T] */ js.Any
  /**
    * Gets the number query builder type for a query builder.
    */
  type NumberQueryBuilder[QB /* <: typings.objection.mod.AnyQueryBuilder */] = /* import warning: importer.ImportType#apply Failed type conversion: QB['NumberQueryBuilderType'] */ js.Any
  type OnBuildKnexCallback[QB /* <: typings.objection.mod.AnyQueryBuilder */] = js.ThisFunction2[
    /* this */ QB, 
    /* knexQuery */ typings.knex.mod.QueryBuilder[js.Any, js.Any], 
    /* query */ QB, 
    scala.Unit
  ]
  type OnBuildKnexMethod[QB /* <: typings.objection.mod.AnyQueryBuilder */] = js.Function1[/* cb */ typings.objection.mod.OnBuildKnexCallback[QB], QB]
  type OnBuildMethod[QB /* <: typings.objection.mod.AnyQueryBuilder */] = js.Function1[/* cb */ typings.objection.mod.CallbackVoid[QB], QB]
  type OnErrorCallback[QB /* <: typings.objection.mod.AnyQueryBuilder */] = js.ThisFunction2[/* this */ QB, /* error */ typings.std.Error, /* query */ QB, js.Any]
  type OnErrorMethod[QB /* <: typings.objection.mod.AnyQueryBuilder */] = js.Function1[/* cb */ typings.objection.mod.OnErrorCallback[QB], QB]
  type OneArgMethod[T, QB /* <: typings.objection.mod.AnyQueryBuilder */] = js.Function1[/* arg */ T, QB]
  type Operator = java.lang.String
  type OrderByRawMethod[QB /* <: typings.objection.mod.AnyQueryBuilder */] = typings.objection.mod.RawInterface[QB]
  /**
    * Gets the page query builder type for a query builder.
    */
  type PageQueryBuilder[QB /* <: typings.objection.mod.AnyQueryBuilder */] = /* import warning: importer.ImportType#apply Failed type conversion: QB['PageQueryBuilderType'] */ js.Any
  /**
    * Just like PartialModelObject but this is applied recursively to relations.
    */
  type PartialModelGraph[M, T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in objection.objection.NonFunctionPropertyNames<T> ]:? objection.objection.Defined<T[K]> extends objection.objection.Model? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias objection.objection.PartialModelGraph<objection.objection.Defined<T[K]>, objection.objection.Defined<T[K]> & objection.objection.GraphParameters> * / object : objection.objection.Defined<T[K]> extends std.Array<infer I>? any extends objection.objection.Model? std.Array</ * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias objection.objection.PartialModelGraph<I, I & objection.objection.GraphParameters> * / object> : objection.objection.Expression<T[K]> : objection.objection.Expression<T[K]>}
    */ typings.objection.objectionStrings.PartialModelGraph with js.Any
  /**
    * Any object that has some of the properties of model class T match this type.
    */
  type PartialModelObject[T /* <: typings.objection.mod.Model */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in objection.objection.NonFunctionPropertyNames<T> ]:? objection.objection.Defined<T[K]> extends objection.objection.Model? T[K] : objection.objection.Defined<T[K]> extends std.Array<infer I>? any extends objection.objection.Model? std.Array<any> : objection.objection.Expression<T[K]> : objection.objection.Expression<T[K]>}
    */ typings.objection.objectionStrings.PartialModelObject with js.Any
  type Plugin = js.Function1[/* modelClass */ typings.objection.TypeofModel, typings.objection.TypeofModel]
  type Pojo = org.scalablytyped.runtime.StringDictionary[js.Any]
  type PrimitiveValue = java.lang.String | scala.Double | scala.Boolean | typings.std.Date | (js.Array[scala.Boolean | typings.std.Date | scala.Double | java.lang.String]) | scala.Null | typings.node.Buffer
  type PrimitiveValueObject = org.scalablytyped.runtime.StringDictionary[typings.objection.mod.PrimitiveValue]
  type QBOrCallback[QB /* <: typings.objection.mod.AnyQueryBuilder */] = typings.objection.mod.AnyQueryBuilder | typings.objection.mod.CallbackVoid[QB]
  /**
    * Gets the query builder type for a model type.
    */
  type QueryBuilderType[M /* <: typings.objection.mod.Model */] = /* import warning: importer.ImportType#apply Failed type conversion: M['QueryBuilderType'] */ js.Any
  type RawBuilder = typings.objection.mod.Aliasable
  type RawFunction = typings.objection.mod.RawInterface[typings.objection.mod.RawBuilder]
  type RawInterface[R] = js.Function2[/* sql */ java.lang.String, /* repeated */ js.Any, R]
  type Raw_ = typings.objection.mod.RawBuilder | typings.knex.mod.Raw[js.Any]
  type ReferenceBuilder = typings.objection.mod.Castable
  type ReferenceFunction = js.Function1[/* expression */ java.lang.String, typings.objection.mod.ReferenceBuilder]
  /**
    * Given a model property type, returns a query builer type of
    * correct kind if the property is a model or a model array.
    */
  type RelatedQueryBuilder[T] = typings.objection.mod.QueryBuilderType[js.Any] | typings.objection.mod.SingleQueryBuilder[typings.objection.mod.QueryBuilderType[T]]
  type RelationExpression[M /* <: typings.objection.mod.Model */] = java.lang.String | js.Object
  type RelationMappingColumnRef = typings.objection.mod.StringOrReferenceBuilder | js.Array[typings.objection.mod.StringOrReferenceBuilder]
  type RelationMappingHook[M /* <: typings.objection.mod.Model */] = js.Function2[
    /* model */ M, 
    /* context */ typings.objection.mod.QueryContext, 
    js.Promise[scala.Unit] | scala.Unit
  ]
  type RelationMappings = org.scalablytyped.runtime.StringDictionary[typings.objection.mod.RelationMapping[js.Any]]
  type RelationMappingsThunk = js.Function0[typings.objection.mod.RelationMappings]
  type RelationType = typings.objection.mod.Constructor[typings.objection.mod.Relation]
  type Relations = org.scalablytyped.runtime.StringDictionary[typings.objection.mod.Relation]
  /**
    * Gets the result type from a query builder type.
    */
  type ResultType[QB /* <: typings.objection.mod.AnyQueryBuilder */] = /* import warning: importer.ImportType#apply Failed type conversion: QB['ResultType'] */ js.Any
  type ReturningMethod = js.ThisFunction1[
    /* this */ typings.objection.mod.AnyQueryBuilder, 
    /* column */ java.lang.String | js.Array[java.lang.String], 
    typings.objection.mod.SingleQueryBuilder[typings.objection.mod.AnyQueryBuilder] | typings.objection.mod.ArrayQueryBuilder[typings.objection.mod.AnyQueryBuilder]
  ]
  type RunAfterCallback[QB /* <: typings.objection.mod.AnyQueryBuilder */] = js.ThisFunction2[
    /* this */ QB, 
    /* result */ typings.objection.mod.ResultType[QB], 
    /* query */ QB, 
    js.Any
  ]
  type RunAfterMethod[QB /* <: typings.objection.mod.AnyQueryBuilder */] = js.Function1[/* cb */ typings.objection.mod.RunAfterCallback[QB], QB]
  type RunBeforeCallback[QB /* <: typings.objection.mod.AnyQueryBuilder */] = js.ThisFunction2[/* this */ QB, /* result */ js.Any, /* query */ QB, js.Any]
  type RunBeforeMethod[QB /* <: typings.objection.mod.AnyQueryBuilder */] = js.Function1[/* cb */ typings.objection.mod.RunBeforeCallback[QB], QB]
  type Selection[QB /* <: typings.objection.mod.AnyQueryBuilder */] = typings.objection.mod.ColumnRef | typings.objection.mod.AnyQueryBuilder | typings.objection.mod.CallbackVoid[QB]
  /**
    * Gets the single item query builder type for a query builder.
    */
  type SingleQueryBuilder[QB /* <: typings.objection.mod.AnyQueryBuilder */] = /* import warning: importer.ImportType#apply Failed type conversion: QB['SingleQueryBuilderType'] */ js.Any
  type SnakeCaseMappersFactory = js.Function1[
    /* options */ js.UndefOr[typings.objection.mod.SnakeCaseMappersOptions], 
    typings.objection.mod.ColumnNameMappers
  ]
  type SqlFunctionShortcut = js.Function1[/* repeated */ js.Any, typings.objection.mod.FunctionBuilder]
  type StringOrReferenceBuilder = java.lang.String | typings.objection.mod.ReferenceBuilder
  type StringReturningMethod = js.Function0[java.lang.String]
  type TableRef = typings.objection.mod.ColumnRef | typings.objection.mod.AnyQueryBuilder
  type TableRefForMethod = js.Function1[/* modelClass */ typings.objection.TypeofModel, java.lang.String]
  type TimeoutMethod[QB /* <: typings.objection.mod.AnyQueryBuilder */] = js.Function2[
    /* ms */ scala.Double, 
    /* options */ js.UndefOr[typings.objection.mod.TimeoutOptions], 
    QB
  ]
  type TransactionOrKnex = typings.objection.mod.Transaction_ | (typings.knex.mod.Knex[js.Any, js.Array[js.Any]])
  type Transaction_ = typings.knex.mod.Transaction[js.Any, js.Any]
  type TraverserFunction = js.Function3[
    /* model */ typings.objection.mod.Model, 
    /* parentModel */ typings.objection.mod.Model, 
    /* relationName */ java.lang.String, 
    scala.Unit
  ]
  type ValidatorContext = org.scalablytyped.runtime.StringDictionary[js.Any]
  type ValueBuilder = typings.objection.mod.Castable
  type ValueFunction = js.Function1[
    /* value */ typings.objection.mod.PrimitiveValue | (js.Array[
      typings.objection.mod.PrimitiveValue | typings.objection.mod.PrimitiveValueObject
    ]) | typings.objection.mod.PrimitiveValueObject, 
    typings.objection.mod.ValueBuilder
  ]
  type WhereBetweenMethod[QB /* <: typings.objection.mod.AnyQueryBuilder */] = js.Function2[
    /* column */ typings.objection.mod.ColumnRef, 
    /* range */ js.Tuple2[
      typings.objection.mod.Expression[typings.objection.mod.PrimitiveValue], 
      typings.objection.mod.Expression[typings.objection.mod.PrimitiveValue]
    ], 
    QB
  ]
  type WhereFieldExpressionMethod[QB /* <: typings.objection.mod.AnyQueryBuilder */] = js.Function1[/* fieldExpression */ typings.objection.mod.FieldExpression, QB]
  type WhereJsonExpressionMethod[QB /* <: typings.objection.mod.AnyQueryBuilder */] = js.Function2[
    /* fieldExpression */ typings.objection.mod.FieldExpression, 
    /* keys */ java.lang.String | js.Array[java.lang.String], 
    QB
  ]
  type WhereJsonField[QB /* <: typings.objection.mod.AnyQueryBuilder */] = js.Function3[
    /* fieldExpression */ typings.objection.mod.FieldExpression, 
    /* operator */ java.lang.String, 
    /* value */ scala.Boolean | scala.Double | java.lang.String | scala.Null, 
    QB
  ]
  type WhereJsonMethod[QB /* <: typings.objection.mod.AnyQueryBuilder */] = js.Function2[
    /* fieldExpression */ typings.objection.mod.FieldExpression, 
    /* jsonObjectOrFieldExpression */ typings.objection.mod.JsonObjectOrFieldExpression, 
    QB
  ]
  type WhereNullMethod[QB /* <: typings.objection.mod.AnyQueryBuilder */] = js.Function1[/* column */ typings.objection.mod.ColumnRef, QB]
  type WhereRawMethod[QB /* <: typings.objection.mod.AnyQueryBuilder */] = typings.objection.mod.RawInterface[QB]
  type WhereWrappedMethod[QB /* <: typings.objection.mod.AnyQueryBuilder */] = js.Function1[/* cb */ typings.objection.mod.CallbackVoid[QB], QB]
  type WithMethod[QB /* <: typings.objection.mod.AnyQueryBuilder */] = js.Function2[
    /* alias */ java.lang.String, 
    /* expr */ typings.objection.mod.CallbackVoid[QB] | typings.objection.mod.AnyQueryBuilder | typings.objection.mod.Raw_, 
    QB
  ]
}
