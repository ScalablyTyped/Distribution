package typings.objection.mod

import org.scalablytyped.runtime.StringDictionary
import typings.knex.mod.Knex
import typings.objection.TypeofModel
import typings.objection.TypeofQueryBuilder
import typings.std.Error
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("objection", "Model")
@js.native
class Model () extends js.Object {
  var QueryBuilderType: QueryBuilder[this.type, js.Array[this.type]] = js.native
  @JSName("$afterDelete")
  def $afterDelete(queryContext: QueryContext): js.Promise[_] | Unit = js.native
  @JSName("$afterGet")
  def $afterGet(queryContext: QueryContext): js.Promise[_] | Unit = js.native
  @JSName("$afterInsert")
  def $afterInsert(queryContext: QueryContext): js.Promise[_] | Unit = js.native
  @JSName("$afterUpdate")
  def $afterUpdate(opt: ModelOptions, queryContext: QueryContext): js.Promise[_] | Unit = js.native
   // may throw ValidationError if validation fails
  @JSName("$afterValidate")
  def $afterValidate(json: Pojo, opt: ModelOptions): Unit = js.native
  @JSName("$appendRelated")
  def $appendRelated[RM /* <: Model */](relation: String): this.type = js.native
  @JSName("$appendRelated")
  def $appendRelated[RM /* <: Model */](relation: String, related: RM): this.type = js.native
  @JSName("$appendRelated")
  def $appendRelated[RM /* <: Model */](relation: String, related: js.Array[RM]): this.type = js.native
  @JSName("$appendRelated")
  def $appendRelated[RM /* <: Model */](relation: Relation): this.type = js.native
  @JSName("$appendRelated")
  def $appendRelated[RM /* <: Model */](relation: Relation, related: RM): this.type = js.native
  @JSName("$appendRelated")
  def $appendRelated[RM /* <: Model */](relation: Relation, related: js.Array[RM]): this.type = js.native
  @JSName("$beforeDelete")
  def $beforeDelete(queryContext: QueryContext): js.Promise[_] | Unit = js.native
   // may throw ValidationError if validation fails
  @JSName("$beforeInsert")
  def $beforeInsert(queryContext: QueryContext): js.Promise[_] | Unit = js.native
  @JSName("$beforeUpdate")
  def $beforeUpdate(opt: ModelOptions, queryContext: QueryContext): js.Promise[_] | Unit = js.native
  @JSName("$beforeValidate")
  def $beforeValidate(jsonSchema: JSONSchema, json: Pojo, opt: ModelOptions): JSONSchema = js.native
  @JSName("$clone")
  def $clone(): this.type = js.native
  @JSName("$clone")
  def $clone(opt: CloneOptions): this.type = js.native
  @JSName("$fetchGraph")
  def $fetchGraph(expression: RelationExpression[this.type]): SingleQueryBuilder[QueryBuilderType[this.type]] = js.native
  @JSName("$fetchGraph")
  def $fetchGraph(expression: RelationExpression[this.type], options: FetchGraphOptions): SingleQueryBuilder[QueryBuilderType[this.type]] = js.native
  @JSName("$formatDatabaseJson")
  def $formatDatabaseJson(json: Pojo): Pojo = js.native
  @JSName("$formatJson")
  def $formatJson(json: Pojo): Pojo = js.native
  @JSName("$id")
  def $id(): js.Any = js.native
  @JSName("$id")
  def $id(id: js.Any): Unit = js.native
  @JSName("$knex")
  def $knex(): Knex[_, js.Array[_]] = js.native
  // Deprecated
  @JSName("$loadRelated")
  def $loadRelated(expression: RelationExpression[this.type]): SingleQueryBuilder[QueryBuilderType[this.type]] = js.native
  @JSName("$loadRelated")
  def $loadRelated(expression: RelationExpression[this.type], modifiers: Modifiers[QueryBuilderType[this.type]]): SingleQueryBuilder[QueryBuilderType[this.type]] = js.native
  @JSName("$loadRelated")
  def $loadRelated(
    expression: RelationExpression[this.type],
    modifiers: Modifiers[QueryBuilderType[this.type]],
    trxOrKnex: TransactionOrKnex
  ): SingleQueryBuilder[QueryBuilderType[this.type]] = js.native
  @JSName("$omit")
  def $omit(keys: String): this.type = js.native
  @JSName("$omit")
  def $omit(keys: js.Array[String]): this.type = js.native
  @JSName("$omit")
  def $omit(keys: StringDictionary[Boolean]): this.type = js.native
  @JSName("$parseDatabaseJson")
  def $parseDatabaseJson(json: Pojo): Pojo = js.native
  @JSName("$parseJson")
  def $parseJson(json: Pojo): Pojo = js.native
  @JSName("$parseJson")
  def $parseJson(json: Pojo, opt: ModelOptions): Pojo = js.native
  @JSName("$pick")
  def $pick(keys: String): this.type = js.native
  @JSName("$pick")
  def $pick(keys: js.Array[String]): this.type = js.native
  @JSName("$pick")
  def $pick(keys: StringDictionary[Boolean]): this.type = js.native
  @JSName("$query")
  def $query(): SingleQueryBuilder[QueryBuilderType[this.type]] = js.native
  @JSName("$query")
  def $query(trxOrKnex: TransactionOrKnex): SingleQueryBuilder[QueryBuilderType[this.type]] = js.native
  @JSName("$relatedQuery")
  def $relatedQuery[K /* <: String */](relationName: K): RelatedQueryBuilder[
    /* import warning: importer.ImportType#apply Failed type conversion: this[K] */ js.Any
  ] = js.native
  @JSName("$relatedQuery")
  def $relatedQuery[K /* <: String */](relationName: K, trxOrKnex: TransactionOrKnex): RelatedQueryBuilder[
    /* import warning: importer.ImportType#apply Failed type conversion: this[K] */ js.Any
  ] = js.native
  @JSName("$relatedQuery")
  def $relatedQuery[RM /* <: Model */](relationName: String): QueryBuilderType[RM] = js.native
  @JSName("$relatedQuery")
  def $relatedQuery[RM /* <: Model */](relationName: String, trxOrKnex: TransactionOrKnex): QueryBuilderType[RM] = js.native
  @JSName("$set")
  def $set(obj: Pojo): this.type = js.native
  @JSName("$setDatabaseJson")
  def $setDatabaseJson(json: js.Object): this.type = js.native
  @JSName("$setJson")
  def $setJson(json: js.Object): this.type = js.native
  @JSName("$setJson")
  def $setJson(json: js.Object, opt: ModelOptions): this.type = js.native
  @JSName("$setRelated")
  def $setRelated[RM /* <: Model */](relation: String): this.type = js.native
  @JSName("$setRelated")
  def $setRelated[RM /* <: Model */](relation: String, related: RM): this.type = js.native
  @JSName("$setRelated")
  def $setRelated[RM /* <: Model */](relation: String, related: js.Array[RM]): this.type = js.native
  @JSName("$setRelated")
  def $setRelated[RM /* <: Model */](relation: Relation): this.type = js.native
  @JSName("$setRelated")
  def $setRelated[RM /* <: Model */](relation: Relation, related: RM): this.type = js.native
  @JSName("$setRelated")
  def $setRelated[RM /* <: Model */](relation: Relation, related: js.Array[RM]): this.type = js.native
  @JSName("$toDatabaseJson")
  def $toDatabaseJson(): Pojo = js.native
  @JSName("$toJson")
  def $toJson(): Pojo = js.native
  @JSName("$toJson")
  def $toJson(opt: ToJsonOptions): Pojo = js.native
  @JSName("$transaction")
  def $transaction(): Knex[_, js.Array[_]] = js.native
  @JSName("$traverse")
  def $traverse(filterConstructor: TypeofModel, traverser: TraverserFunction): this.type = js.native
  @JSName("$traverse")
  def $traverse(traverser: TraverserFunction): this.type = js.native
  @JSName("$validate")
  def $validate(): Pojo = js.native
  @JSName("$validate")
  def $validate(json: Pojo): Pojo = js.native
  @JSName("$validate")
  def $validate(json: Pojo, opt: ModelOptions): Pojo = js.native
  def toJSON(): Pojo = js.native
  def toJSON(opt: ToJsonOptions): Pojo = js.native
}

/* static members */
@JSImport("objection", "Model")
@js.native
object Model extends js.Object {
  var BelongsToOneRelation: RelationType = js.native
  var HasManyRelation: RelationType = js.native
  var HasOneRelation: RelationType = js.native
  var HasOneThroughRelation: RelationType = js.native
  // Deprecated
  var JoinEagerAlgorithm: EagerAlgorithm = js.native
  var ManyToManyRelation: RelationType = js.native
  // Deprecated
  var NaiveEagerAlgorithm: EagerAlgorithm = js.native
  var QueryBuilder: TypeofQueryBuilder = js.native
  // Deprecated
  var WhereInEagerAlgorithm: EagerAlgorithm = js.native
  var columnNameMappers: ColumnNameMappers = js.native
  var dbRefProp: String = js.native
  // Deprecated
  var defaultEagerAlgorithm: js.UndefOr[EagerAlgorithm] = js.native
  // Deprecated
  var defaultEagerOptions: js.UndefOr[EagerOptions] = js.native
  var defaultGraphOptions: js.UndefOr[GraphOptions] = js.native
  @JSName("fn")
  var fn_Original: FunctionFunction = js.native
  var idColumn: String | js.Array[String] = js.native
  var jsonAttributes: js.Array[String] = js.native
  var jsonSchema: JSONSchema = js.native
  var modelPaths: js.Array[String] = js.native
  var modifiers: Modifiers[AnyQueryBuilder] = js.native
  var pickJsonSchemaProperties: Boolean = js.native
  var propRefRegex: RegExp = js.native
  @JSName("raw")
  var raw_Original: RawFunction = js.native
  @JSName("ref")
  var ref_Original: ReferenceFunction = js.native
  var relatedFindQueryMutates: Boolean = js.native
  var relatedInsertQueryMutates: Boolean = js.native
  var relationMappings: RelationMappings | RelationMappingsThunk = js.native
  var tableName: String = js.native
  var uidProp: String = js.native
  var uidRefProp: String = js.native
  var virtualAttributes: js.Array[String] = js.native
  def afterDelete(args: StaticHookArguments[_, _]): js.Any = js.native
  def afterFind(args: StaticHookArguments[_, _]): js.Any = js.native
  def afterInsert(args: StaticHookArguments[_, _]): js.Any = js.native
  def afterUpdate(args: StaticHookArguments[_, _]): js.Any = js.native
  def beforeDelete(args: StaticHookArguments[_, _]): js.Any = js.native
  def beforeFind(args: StaticHookArguments[_, _]): js.Any = js.native
  def beforeInsert(args: StaticHookArguments[_, _]): js.Any = js.native
  def beforeUpdate(args: StaticHookArguments[_, _]): js.Any = js.native
  def bindKnex[M](trxOrKnex: TransactionOrKnex): M = js.native
  def bindTransaction[M](trxOrKnex: TransactionOrKnex): M = js.native
  def createNotFoundError(): Error = js.native
  def createValidationError(args: CreateValidationErrorArgs): Error = js.native
  def createValidator(): Validator = js.native
  def fetchGraph[M /* <: Model */](modelOrObject: js.Array[PartialModelObject[M]], expression: RelationExpression[M]): QueryBuilderType[M] = js.native
  def fetchGraph[M /* <: Model */](
    modelOrObject: js.Array[PartialModelObject[M]],
    expression: RelationExpression[M],
    options: FetchGraphOptions
  ): QueryBuilderType[M] = js.native
  def fetchGraph[M /* <: Model */](modelOrObject: PartialModelObject[M], expression: RelationExpression[M]): SingleQueryBuilder[QueryBuilderType[M]] = js.native
  def fetchGraph[M /* <: Model */](
    modelOrObject: PartialModelObject[M],
    expression: RelationExpression[M],
    options: FetchGraphOptions
  ): SingleQueryBuilder[QueryBuilderType[M]] = js.native
  def fetchTableMetadata(): js.Promise[TableMetadata] = js.native
  def fetchTableMetadata(opt: FetchTableMetadataOptions): js.Promise[TableMetadata] = js.native
  def fn(functionName: String, arguments: js.Any*): FunctionBuilder = js.native
  def fromDatabaseJson[M /* <: Model */](json: js.Object): M = js.native
  def fromJson[M /* <: Model */](json: js.Object): M = js.native
  def fromJson[M /* <: Model */](json: js.Object, opt: ModelOptions): M = js.native
  def getRelation(name: String): Relation = js.native
  def getRelations(): Relations = js.native
  def knex(): Knex[_, js.Array[_]] = js.native
  def knex(knex: Knex[_, js.Array[_]]): Knex[_, js.Array[_]] = js.native
  def knexQuery(): typings.knex.mod.QueryBuilder[_, _] = js.native
  // Deprecated
  def loadRelated[M /* <: Model */](modelOrObject: js.Array[PartialModelObject[M]], expression: RelationExpression[M]): QueryBuilderType[M] = js.native
  def loadRelated[M /* <: Model */](
    modelOrObject: js.Array[PartialModelObject[M]],
    expression: RelationExpression[M],
    modifiers: Modifiers[QueryBuilderType[M]]
  ): QueryBuilderType[M] = js.native
  def loadRelated[M /* <: Model */](
    modelOrObject: js.Array[PartialModelObject[M]],
    expression: RelationExpression[M],
    modifiers: Modifiers[QueryBuilderType[M]],
    trxOrKnex: TransactionOrKnex
  ): QueryBuilderType[M] = js.native
  // Deprecated
  def loadRelated[M /* <: Model */](modelOrObject: PartialModelObject[M], expression: RelationExpression[M]): SingleQueryBuilder[QueryBuilderType[M]] = js.native
  def loadRelated[M /* <: Model */](
    modelOrObject: PartialModelObject[M],
    expression: RelationExpression[M],
    modifiers: Modifiers[QueryBuilderType[M]]
  ): SingleQueryBuilder[QueryBuilderType[M]] = js.native
  def loadRelated[M /* <: Model */](
    modelOrObject: PartialModelObject[M],
    expression: RelationExpression[M],
    modifiers: Modifiers[QueryBuilderType[M]],
    trxOrKnex: TransactionOrKnex
  ): SingleQueryBuilder[QueryBuilderType[M]] = js.native
  def query[M /* <: Model */](): QueryBuilderType[M] = js.native
  def query[M /* <: Model */](trxOrKnex: TransactionOrKnex): QueryBuilderType[M] = js.native
  def raw(sql: String, bindings: js.Any*): RawBuilder = js.native
  def ref(expression: String): ReferenceBuilder = js.native
  def relatedQuery[RM /* <: Model */](relationName: String): QueryBuilderType[RM] = js.native
  def relatedQuery[RM /* <: Model */](relationName: String, trxOrKnex: TransactionOrKnex): QueryBuilderType[RM] = js.native
  def relatedQuery[M /* <: Model */, K /* <: String */](relationName: K): ArrayRelatedQueryBuilder[
    /* import warning: importer.ImportType#apply Failed type conversion: M[K] */ js.Any
  ] = js.native
  def relatedQuery[M /* <: Model */, K /* <: String */](relationName: K, trxOrKnex: TransactionOrKnex): ArrayRelatedQueryBuilder[
    /* import warning: importer.ImportType#apply Failed type conversion: M[K] */ js.Any
  ] = js.native
  def startTransaction(): js.Promise[Transaction_] = js.native
  def startTransaction(knexOrTransaction: TransactionOrKnex): js.Promise[Transaction_] = js.native
  def tableMetadata(): TableMetadata = js.native
  def tableMetadata(opt: TableMetadataOptions): TableMetadata = js.native
  def transaction[T](callback: js.Function1[/* trx */ Transaction_, js.Promise[T]]): js.Promise[T] = js.native
  def transaction[T](trxOrKnex: TransactionOrKnex, callback: js.Function1[/* trx */ Transaction_, js.Promise[T]]): js.Promise[T] = js.native
  def traverse(filterConstructor: TypeofModel, models: js.Array[Model], traverser: TraverserFunction): Unit = js.native
  def traverse(filterConstructor: TypeofModel, models: Model, traverser: TraverserFunction): Unit = js.native
  def traverse(models: js.Array[Model], traverser: TraverserFunction): Unit = js.native
  def traverse(models: Model, traverser: TraverserFunction): Unit = js.native
}

