package typings.objection.mod

import typings.knex.mod.FunctionHelper
import typings.knex.mod.Knex
import typings.knex.mod.Raw
import typings.knex.mod.RawBinding
import typings.knex.mod.RawBuilder
import typings.knex.mod.SafePartial
import typings.knex.mod.ValueDict
import typings.objection.TypeofClassModel
import typings.objection.TypeofClassQueryBuilder
import typings.std.Error
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ModelClass is a TypeScript hack to support referencing a Model
  * subclass constructor and not losing access to static members. See
  * https://github.com/Microsoft/TypeScript/issues/5863#issuecomment-242782664
  */
@js.native
trait ModelClass[M /* <: Model */] extends Constructor[M] {
  var BelongsToOneRelation: Relation = js.native
  var HasManyRelation: Relation = js.native
  var HasOneRelation: Relation = js.native
  var HasOneThroughRelation: Relation = js.native
  var ManyToManyRelation: Relation = js.native
  var QueryBuilder: TypeofClassQueryBuilder = js.native
  var columnNameMappers: ColumnNameMappers = js.native
  var dbRefProp: String = js.native
  var defaultEagerAlgorithm: js.UndefOr[EagerAlgorithm] = js.native
  var defaultEagerOptions: js.UndefOr[EagerOptions] = js.native
  var fn: FunctionHelper = js.native
  var idColumn: String | js.Array[String] = js.native
  var jsonAttributes: js.Array[String] = js.native
  var jsonSchema: JsonSchema = js.native
  var modelPaths: js.Array[String] = js.native
  var modifiers: Modifiers = js.native
  var pickJsonSchemaProperties: Boolean = js.native
  var propRefRegex: RegExp = js.native
  @JSName("raw")
  var raw_Original: RawBuilder[_, _] = js.native
  var relatedFindQueryMutates: Boolean = js.native
  var relatedInsertQueryMutates: Boolean = js.native
  var relationMappings: RelationMappings | js.Function0[RelationMappings] = js.native
  var tableName: String = js.native
  var uidProp: String = js.native
  var uidRefProp: String = js.native
  var useLimitInFirst: js.UndefOr[Boolean] = js.native
  var virtualAttributes: js.Array[String] = js.native
  def bindKnex(knex: Knex[_, js.Array[_]]): this.type = js.native
  def bindTransaction(transaction: Transaction_): this.type = js.native
  def createNotFoundError(): Error = js.native
  def createValidationError(args: CreateValidationErrorArgs): Error = js.native
  def createValidator(): Validator = js.native
  def fetchTableMetadata(): js.Promise[TableMetadata] = js.native
  def fetchTableMetadata(opt: FetchTableMetadataOptions): js.Promise[TableMetadata] = js.native
  def fromDatabaseJson(row: js.Object): M = js.native
  def fromJson(json: js.Object): M = js.native
  def fromJson(json: js.Object, opt: ModelOptions): M = js.native
  def knex(): Knex[_, js.Array[_]] = js.native
  def knex(knex: Knex[_, js.Array[_]]): Knex[_, js.Array[_]] = js.native
  def knexQuery(): typings.knex.mod.QueryBuilder[_, js.Array[SafePartial[_]]] = js.native
  def loadRelated(model: M, expression: RelationExpression): QueryBuilderYieldingOne[M] = js.native
  def loadRelated(model: M, expression: RelationExpression, filters: Filters[M]): QueryBuilderYieldingOne[M] = js.native
  def loadRelated(model: M, expression: RelationExpression, filters: Filters[M], trxOrKnex: Knex[_, js.Array[_]]): QueryBuilderYieldingOne[M] = js.native
  def loadRelated(model: M, expression: RelationExpression, filters: Filters[M], trxOrKnex: Transaction_): QueryBuilderYieldingOne[M] = js.native
  // loadRelated is overloaded to support both Model and Model[] variants:
  def loadRelated(models: js.Array[M], expression: RelationExpression): QueryBuilder[
    M, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RM */ _, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def loadRelated(models: js.Array[M], expression: RelationExpression, filters: Filters[M]): QueryBuilder[
    M, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RM */ _, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def loadRelated(
    models: js.Array[M],
    expression: RelationExpression,
    filters: Filters[M],
    trxOrKnex: Knex[_, js.Array[_]]
  ): QueryBuilder[
    M, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RM */ _, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def loadRelated(models: js.Array[M], expression: RelationExpression, filters: Filters[M], trxOrKnex: Transaction_): QueryBuilder[
    M, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RM */ _, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def omitImpl(f: js.Function2[/* obj */ js.Object, /* prop */ String, Unit]): Unit = js.native
  def query(): QueryBuilder[
    M, 
    js.Array[M], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def query(trxOrKnex: Knex[_, js.Array[_]]): QueryBuilder[
    M, 
    js.Array[M], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def query(trxOrKnex: Transaction_): QueryBuilder[
    M, 
    js.Array[M], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def raw[TResult2](sql: String, bindings: RawBinding*): Raw[TResult2] = js.native
  def raw[TResult2](sql: String, bindings: js.Array[RawBinding]): Raw[TResult2] = js.native
  def raw[TResult2](sql: String, bindings: ValueDict): Raw[TResult2] = js.native
  def raw[TResult2](value: typings.knex.mod.Value): Raw[TResult2] = js.native
  // This can only be used as a subquery so the result model type is irrelevant.
  def relatedQuery(relationName: String): QueryBuilder[
    _, 
    js.Array[_], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for RV */ _
  ] = js.native
  def tableMetadata(): TableMetadata = js.native
  def tableMetadata(opt: TableMetadataOptions): TableMetadata = js.native
  def traverse(filterConstructor: TypeofClassModel, models: js.Array[Model], traverser: TraverserFunction): Unit = js.native
  def traverse(filterConstructor: TypeofClassModel, models: Model, traverser: TraverserFunction): Unit = js.native
  def traverse(models: js.Array[Model], traverser: TraverserFunction): Unit = js.native
  def traverse(models: Model, traverser: TraverserFunction): Unit = js.native
}

