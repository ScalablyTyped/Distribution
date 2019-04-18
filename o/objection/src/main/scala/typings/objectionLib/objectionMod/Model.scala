package typings
package objectionLib.objectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("objection", "Model")
@js.native
class Model () extends js.Object {
  @JSName("$afterDelete")
  def $afterDelete(queryContext: QueryContext): js.Promise[_] | scala.Unit = js.native
  @JSName("$afterGet")
  def $afterGet(queryContext: QueryContext): js.Promise[_] | scala.Unit = js.native
  @JSName("$afterInsert")
  def $afterInsert(queryContext: QueryContext): js.Promise[_] | scala.Unit = js.native
  @JSName("$afterUpdate")
  def $afterUpdate(opt: ModelOptions, queryContext: QueryContext): js.Promise[_] | scala.Unit = js.native
   // may throw ValidationError if validation fails
  @JSName("$afterValidate")
  def $afterValidate(json: Pojo, opt: ModelOptions): scala.Unit = js.native
  @JSName("$appendRelated")
  def $appendRelated[T, RelatedM /* <: Model */](`this`: T, relation: java.lang.String): T = js.native
  @JSName("$appendRelated")
  def $appendRelated[T, RelatedM /* <: Model */](`this`: T, relation: java.lang.String, related: RelatedM): T = js.native
  @JSName("$appendRelated")
  def $appendRelated[T, RelatedM /* <: Model */](`this`: T, relation: java.lang.String, related: js.Array[RelatedM]): T = js.native
  @JSName("$appendRelated")
  def $appendRelated[T, RelatedM /* <: Model */](`this`: T, relation: Relation): T = js.native
  @JSName("$appendRelated")
  def $appendRelated[T, RelatedM /* <: Model */](`this`: T, relation: Relation, related: RelatedM): T = js.native
  @JSName("$appendRelated")
  def $appendRelated[T, RelatedM /* <: Model */](`this`: T, relation: Relation, related: js.Array[RelatedM]): T = js.native
  @JSName("$beforeDelete")
  def $beforeDelete(queryContext: QueryContext): js.Promise[_] | scala.Unit = js.native
  @JSName("$beforeInsert")
  def $beforeInsert(queryContext: QueryContext): js.Promise[_] | scala.Unit = js.native
  @JSName("$beforeUpdate")
  def $beforeUpdate(opt: ModelOptions, queryContext: QueryContext): js.Promise[_] | scala.Unit = js.native
  @JSName("$beforeValidate")
  def $beforeValidate(jsonSchema: JsonSchema, json: Pojo, opt: ModelOptions): JsonSchema = js.native
  @JSName("$clone")
  def $clone[T](`this`: T): T = js.native
  @JSName("$clone")
  def $clone[T](`this`: T, opt: CloneOptions): T = js.native
  @JSName("$formatDatabaseJson")
  def $formatDatabaseJson(json: Pojo): Pojo = js.native
  @JSName("$formatJson")
  def $formatJson(json: Pojo): Pojo = js.native
  // Implementation note: At least as of TypeScript 2.7, subclasses of
  // methods that return `this` are not compatible with their superclass.
  // For example, `class Movie extends Model` could not be passed as a
  // "Model" to a function, because the methods that return `this` return
  // `Movie`, and not `Model`. The `foo<M>(this: M, ...` is a workaround.
  @JSName("$id")
  def $id(): js.Any = js.native
  @JSName("$id")
  def $id(id: js.Any): scala.Unit = js.native
  @JSName("$knex")
  def $knex(): knexLib.knexMod.Knex = js.native
  @JSName("$loadRelated")
  def $loadRelated[QM /* <: Model */](`this`: QM, expression: java.lang.String): QueryBuilder[
    QM, 
    QM, 
    /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  @JSName("$loadRelated")
  def $loadRelated[QM /* <: Model */](`this`: QM, expression: java.lang.String, filters: Filters[QM]): QueryBuilder[
    QM, 
    QM, 
    /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  @JSName("$loadRelated")
  def $loadRelated[QM /* <: Model */](`this`: QM, expression: java.lang.String, filters: Filters[QM], trxOrKnex: knexLib.knexMod.Knex): QueryBuilder[
    QM, 
    QM, 
    /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  @JSName("$loadRelated")
  def $loadRelated[QM /* <: Model */](`this`: QM, expression: java.lang.String, filters: Filters[QM], trxOrKnex: Transaction): QueryBuilder[
    QM, 
    QM, 
    /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  @JSName("$omit")
  def $omit[T](`this`: T, keys: java.lang.String): T = js.native
  @JSName("$omit")
  def $omit[T](`this`: T, keys: js.Array[java.lang.String]): T = js.native
  @JSName("$omit")
  def $omit[T](`this`: T, keys: Properties): T = js.native
  @JSName("$parseDatabaseJson")
  def $parseDatabaseJson(json: Pojo): Pojo = js.native
  @JSName("$parseJson")
  def $parseJson(json: Pojo): Pojo = js.native
  @JSName("$parseJson")
  def $parseJson(json: Pojo, opt: ModelOptions): Pojo = js.native
  @JSName("$pick")
  def $pick[T](`this`: T, keys: java.lang.String): T = js.native
  @JSName("$pick")
  def $pick[T](`this`: T, keys: js.Array[java.lang.String]): T = js.native
  @JSName("$pick")
  def $pick[T](`this`: T, keys: Properties): T = js.native
  @JSName("$query")
  def $query[QM /* <: Model */](`this`: QM): QueryBuilder[
    QM, 
    QM, 
    /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  @JSName("$query")
  def $query[QM /* <: Model */](`this`: QM, trxOrKnex: knexLib.knexMod.Knex): QueryBuilder[
    QM, 
    QM, 
    /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  @JSName("$query")
  def $query[QM /* <: Model */](`this`: QM, trxOrKnex: Transaction): QueryBuilder[
    QM, 
    QM, 
    /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  /**
    * If you add fields to your model, you get $relatedQuery typings for
    * free.
    *
    * Note that if you make any chained calls to the QueryBuilder,
    * though, you should apply a cast, which will make your code use not this
    * signatue, but the following signature.
    */
  @JSName("$relatedQuery")
  def $relatedQuery[K /* <: java.lang.String */, V /* <: (/* import warning: ImportType.apply Failed type conversion: this[K] */ js.Any) with Model */](relationName: K): QueryBuilder[V, V, V] = js.native
  @JSName("$relatedQuery")
  def $relatedQuery[K /* <: java.lang.String */, V /* <: (/* import warning: ImportType.apply Failed type conversion: this[K] */ js.Any) with Model */](relationName: K, trxOrKnex: knexLib.knexMod.Knex): QueryBuilder[V, V, V] = js.native
  @JSName("$relatedQuery")
  def $relatedQuery[K /* <: java.lang.String */, V /* <: (/* import warning: ImportType.apply Failed type conversion: this[K] */ js.Any) with Model */](relationName: K, trxOrKnex: Transaction): QueryBuilder[V, V, V] = js.native
  /**
    * Builds a query that only affects the models related to this instance
    * through a relation. Note that this signature requires a
    * type cast (like `bob.$relatedQuery<Animal>('pets')`).
    */
  @JSName("$relatedQuery")
  def $relatedQuery[QM /* <: Model */, RM](relationName: java.lang.String): QueryBuilder[
    QM, 
    RM, 
    /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  @JSName("$relatedQuery")
  def $relatedQuery[QM /* <: Model */, RM](relationName: java.lang.String, trxOrKnex: knexLib.knexMod.Knex): QueryBuilder[
    QM, 
    RM, 
    /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  @JSName("$relatedQuery")
  def $relatedQuery[QM /* <: Model */, RM](relationName: java.lang.String, trxOrKnex: Transaction): QueryBuilder[
    QM, 
    RM, 
    /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  @JSName("$set")
  def $set[T](`this`: T, obj: Pojo): T = js.native
  @JSName("$setDatabaseJson")
  def $setDatabaseJson[M](`this`: M, json: Pojo): M = js.native
  @JSName("$setJson")
  def $setJson[T](`this`: T, json: Pojo): T = js.native
  @JSName("$setJson")
  def $setJson[T](`this`: T, json: Pojo, opt: ModelOptions): T = js.native
  @JSName("$setRelated")
  def $setRelated[T, RelatedM /* <: Model */](`this`: T, relation: java.lang.String): T = js.native
  @JSName("$setRelated")
  def $setRelated[T, RelatedM /* <: Model */](`this`: T, relation: java.lang.String, related: RelatedM): T = js.native
  @JSName("$setRelated")
  def $setRelated[T, RelatedM /* <: Model */](`this`: T, relation: java.lang.String, related: js.Array[RelatedM]): T = js.native
  @JSName("$setRelated")
  def $setRelated[T, RelatedM /* <: Model */](`this`: T, relation: Relation): T = js.native
  @JSName("$setRelated")
  def $setRelated[T, RelatedM /* <: Model */](`this`: T, relation: Relation, related: RelatedM): T = js.native
  @JSName("$setRelated")
  def $setRelated[T, RelatedM /* <: Model */](`this`: T, relation: Relation, related: js.Array[RelatedM]): T = js.native
   // may throw ValidationError if validation fails
  @JSName("$toDatabaseJson")
  def $toDatabaseJson(): js.Object = js.native
  @JSName("$toJson")
  def $toJson(): js.Object = js.native
  @JSName("$toJson")
  def $toJson(opt: ToJsonOptions): js.Object = js.native
  @JSName("$transaction")
  def $transaction(): knexLib.knexMod.Knex = js.native
  @JSName("$traverse")
  def $traverse(filterConstructor: this.type, traverser: TraverserFunction): scala.Unit = js.native
  @JSName("$traverse")
  def $traverse(traverser: TraverserFunction): scala.Unit = js.native
  @JSName("$validate")
  def $validate(json: Pojo, opt: ModelOptions): Pojo = js.native
  def toJSON(): js.Object = js.native
  def toJSON(opt: ToJsonOptions): js.Object = js.native
}

/* static members */
@JSImport("objection", "Model")
@js.native
object Model extends js.Object {
  var BelongsToOneRelation: objectionLib.objectionMod.Relation = js.native
  var HasManyRelation: objectionLib.objectionMod.Relation = js.native
  var HasOneRelation: objectionLib.objectionMod.Relation = js.native
  var HasOneThroughRelation: objectionLib.objectionMod.Relation = js.native
  var JoinEagerAlgorithm: objectionLib.objectionMod.EagerAlgorithm = js.native
  var ManyToManyRelation: objectionLib.objectionMod.Relation = js.native
  var NaiveEagerAlgorithm: objectionLib.objectionMod.EagerAlgorithm = js.native
  var QueryBuilder: objectionLib.Anon_ForClass = js.native
  var WhereInEagerAlgorithm: objectionLib.objectionMod.EagerAlgorithm = js.native
  var columnNameMappers: objectionLib.objectionMod.ColumnNameMappers = js.native
  var dbRefProp: java.lang.String = js.native
  var defaultEagerAlgorithm: js.UndefOr[objectionLib.objectionMod.EagerAlgorithm] = js.native
  var defaultEagerOptions: js.UndefOr[objectionLib.objectionMod.EagerOptions] = js.native
  var fn: knexLib.knexMod.FunctionHelper = js.native
  var idColumn: java.lang.String | js.Array[java.lang.String] = js.native
  var jsonAttributes: js.Array[java.lang.String] = js.native
  var jsonSchema: objectionLib.objectionMod.JsonSchema = js.native
  var modelPaths: js.Array[java.lang.String] = js.native
  var modifiers: objectionLib.objectionMod.Modifiers = js.native
  var pickJsonSchemaProperties: scala.Boolean = js.native
  var propRefRegex: stdLib.RegExp = js.native
  @JSName("raw")
  var raw_Original: knexLib.knexMod.RawBuilder = js.native
  var relatedFindQueryMutates: scala.Boolean = js.native
  var relatedInsertQueryMutates: scala.Boolean = js.native
  var relationMappings: objectionLib.objectionMod.RelationMappings | js.Function0[objectionLib.objectionMod.RelationMappings] = js.native
  var tableName: java.lang.String = js.native
  var uidProp: java.lang.String = js.native
  var uidRefProp: java.lang.String = js.native
  var virtualAttributes: js.Array[java.lang.String] = js.native
  def bindKnex[M](`this`: M, knex: knexLib.knexMod.Knex): M = js.native
  def bindTransaction[M](`this`: M, transaction: objectionLib.objectionMod.Transaction): M = js.native
  def createNotFoundError(): stdLib.Error = js.native
  def createValidationError(args: objectionLib.objectionMod.CreateValidationErrorArgs): stdLib.Error = js.native
  def createValidator(): objectionLib.objectionMod.Validator = js.native
  def fetchTableMetadata(): js.Promise[objectionLib.objectionMod.TableMetadata] = js.native
  def fetchTableMetadata(opt: objectionLib.objectionMod.FetchTableMetadataOptions): js.Promise[objectionLib.objectionMod.TableMetadata] = js.native
  def fromDatabaseJson[M](`this`: objectionLib.objectionMod.Constructor[M], row: objectionLib.objectionMod.Pojo): M = js.native
  // fromJson and fromDatabaseJson both return an instance of Model, not a Model class:
  def fromJson[M](`this`: objectionLib.objectionMod.Constructor[M], json: objectionLib.objectionMod.Pojo): M = js.native
  def fromJson[M](
    `this`: objectionLib.objectionMod.Constructor[M],
    json: objectionLib.objectionMod.Pojo,
    opt: objectionLib.objectionMod.ModelOptions
  ): M = js.native
  def getRelations(): org.scalablytyped.runtime.StringDictionary[objectionLib.objectionMod.Relation] = js.native
  def knex(): knexLib.knexMod.Knex = js.native
  def knex(knex: knexLib.knexMod.Knex): knexLib.knexMod.Knex = js.native
  def knexQuery(): knexLib.knexMod.QueryBuilder = js.native
  def loadRelated[QM /* <: objectionLib.objectionMod.Model */](
    `this`: objectionLib.objectionMod.Constructor[QM],
    model: QM,
    expression: objectionLib.objectionMod.RelationExpression
  ): objectionLib.objectionMod.QueryBuilderYieldingOne[QM] = js.native
  def loadRelated[QM /* <: objectionLib.objectionMod.Model */](
    `this`: objectionLib.objectionMod.Constructor[QM],
    model: QM,
    expression: objectionLib.objectionMod.RelationExpression,
    filters: objectionLib.objectionMod.Filters[QM]
  ): objectionLib.objectionMod.QueryBuilderYieldingOne[QM] = js.native
  def loadRelated[QM /* <: objectionLib.objectionMod.Model */](
    `this`: objectionLib.objectionMod.Constructor[QM],
    model: QM,
    expression: objectionLib.objectionMod.RelationExpression,
    filters: objectionLib.objectionMod.Filters[QM],
    trxOrKnex: knexLib.knexMod.Knex
  ): objectionLib.objectionMod.QueryBuilderYieldingOne[QM] = js.native
  def loadRelated[QM /* <: objectionLib.objectionMod.Model */](
    `this`: objectionLib.objectionMod.Constructor[QM],
    model: QM,
    expression: objectionLib.objectionMod.RelationExpression,
    filters: objectionLib.objectionMod.Filters[QM],
    trxOrKnex: objectionLib.objectionMod.Transaction
  ): objectionLib.objectionMod.QueryBuilderYieldingOne[QM] = js.native
  // loadRelated is overloaded to support both Model and Model[] variants:
  def loadRelated[QM /* <: objectionLib.objectionMod.Model */](
    `this`: objectionLib.objectionMod.Constructor[QM],
    models: js.Array[QM],
    expression: objectionLib.objectionMod.RelationExpression
  ): objectionLib.objectionMod.QueryBuilder[
    QM, 
    /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RM */ _, 
    /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def loadRelated[QM /* <: objectionLib.objectionMod.Model */](
    `this`: objectionLib.objectionMod.Constructor[QM],
    models: js.Array[QM],
    expression: objectionLib.objectionMod.RelationExpression,
    filters: objectionLib.objectionMod.Filters[QM]
  ): objectionLib.objectionMod.QueryBuilder[
    QM, 
    /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RM */ _, 
    /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def loadRelated[QM /* <: objectionLib.objectionMod.Model */](
    `this`: objectionLib.objectionMod.Constructor[QM],
    models: js.Array[QM],
    expression: objectionLib.objectionMod.RelationExpression,
    filters: objectionLib.objectionMod.Filters[QM],
    trxOrKnex: knexLib.knexMod.Knex
  ): objectionLib.objectionMod.QueryBuilder[
    QM, 
    /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RM */ _, 
    /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def loadRelated[QM /* <: objectionLib.objectionMod.Model */](
    `this`: objectionLib.objectionMod.Constructor[QM],
    models: js.Array[QM],
    expression: objectionLib.objectionMod.RelationExpression,
    filters: objectionLib.objectionMod.Filters[QM],
    trxOrKnex: objectionLib.objectionMod.Transaction
  ): objectionLib.objectionMod.QueryBuilder[
    QM, 
    /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RM */ _, 
    /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def omitImpl(f: js.Function2[/* obj */ js.Object, /* prop */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def query[QM /* <: objectionLib.objectionMod.Model */](`this`: objectionLib.objectionMod.Constructor[QM]): objectionLib.objectionMod.QueryBuilder[
    QM, 
    /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RM */ _, 
    /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def query[QM /* <: objectionLib.objectionMod.Model */](`this`: objectionLib.objectionMod.Constructor[QM], trxOrKnex: knexLib.knexMod.Knex): objectionLib.objectionMod.QueryBuilder[
    QM, 
    /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RM */ _, 
    /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def query[QM /* <: objectionLib.objectionMod.Model */](
    `this`: objectionLib.objectionMod.Constructor[QM],
    trxOrKnex: objectionLib.objectionMod.Transaction
  ): objectionLib.objectionMod.QueryBuilder[
    QM, 
    /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RM */ _, 
    /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def raw(sql: java.lang.String, bindings: (knexLib.Value | knexLib.knexMod.QueryBuilder)*): knexLib.knexMod.Raw = js.native
  def raw(sql: java.lang.String, bindings: js.Array[knexLib.Value | knexLib.knexMod.QueryBuilder]): knexLib.knexMod.Raw = js.native
  def raw(sql: java.lang.String, bindings: knexLib.ValueMap): knexLib.knexMod.Raw = js.native
  def raw(value: knexLib.Value): knexLib.knexMod.Raw = js.native
  // This can only be used as a subquery so the result model type is irrelevant.
  def relatedQuery(relationName: java.lang.String): objectionLib.objectionMod.QueryBuilder[
    _, 
    js.Array[_], 
    /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def tableMetadata(): objectionLib.objectionMod.TableMetadata = js.native
  def tableMetadata(opt: objectionLib.objectionMod.TableMetadataOptions): objectionLib.objectionMod.TableMetadata = js.native
  def traverse(
    filterConstructor: objectionLib.Anon_Args,
    models: js.Array[objectionLib.objectionMod.Model],
    traverser: objectionLib.objectionMod.TraverserFunction
  ): scala.Unit = js.native
  def traverse(
    filterConstructor: objectionLib.Anon_Args,
    models: objectionLib.objectionMod.Model,
    traverser: objectionLib.objectionMod.TraverserFunction
  ): scala.Unit = js.native
  def traverse(
    models: js.Array[objectionLib.objectionMod.Model],
    traverser: objectionLib.objectionMod.TraverserFunction
  ): scala.Unit = js.native
  def traverse(models: objectionLib.objectionMod.Model, traverser: objectionLib.objectionMod.TraverserFunction): scala.Unit = js.native
}

