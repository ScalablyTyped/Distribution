package typings
package objectionLib.objectionMod

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
  var QueryBuilder: objectionLib.TypeofClassQueryBuilder = js.native
  var columnNameMappers: ColumnNameMappers = js.native
  var dbRefProp: java.lang.String = js.native
  var defaultEagerAlgorithm: js.UndefOr[EagerAlgorithm] = js.native
  var defaultEagerOptions: js.UndefOr[EagerOptions] = js.native
  var fn: knexLib.knexMod.FunctionHelper = js.native
  var idColumn: java.lang.String | js.Array[java.lang.String] = js.native
  var jsonAttributes: js.Array[java.lang.String] = js.native
  var jsonSchema: JsonSchema = js.native
  var modelPaths: js.Array[java.lang.String] = js.native
  var modifiers: Modifiers = js.native
  var pickJsonSchemaProperties: scala.Boolean = js.native
  var propRefRegex: stdLib.RegExp = js.native
  @JSName("raw")
  var raw_Original: knexLib.knexMod.RawBuilder = js.native
  var relatedFindQueryMutates: scala.Boolean = js.native
  var relatedInsertQueryMutates: scala.Boolean = js.native
  var relationMappings: RelationMappings | js.Function0[RelationMappings] = js.native
  var tableName: java.lang.String = js.native
  var uidProp: java.lang.String = js.native
  var uidRefProp: java.lang.String = js.native
  var useLimitInFirst: js.UndefOr[scala.Boolean] = js.native
  var virtualAttributes: js.Array[java.lang.String] = js.native
  def bindKnex(knex: knexLib.knexMod.Knex): this.type = js.native
  def bindTransaction(transaction: Transaction): this.type = js.native
  def createNotFoundError(): stdLib.Error = js.native
  def createValidationError(args: CreateValidationErrorArgs): stdLib.Error = js.native
  def createValidator(): Validator = js.native
  def fetchTableMetadata(): js.Promise[TableMetadata] = js.native
  def fetchTableMetadata(opt: FetchTableMetadataOptions): js.Promise[TableMetadata] = js.native
  def fromDatabaseJson(row: js.Object): M = js.native
  def fromJson(json: js.Object): M = js.native
  def fromJson(json: js.Object, opt: ModelOptions): M = js.native
  def knex(): knexLib.knexMod.Knex = js.native
  def knex(knex: knexLib.knexMod.Knex): knexLib.knexMod.Knex = js.native
  def knexQuery(): knexLib.knexMod.QueryBuilder = js.native
  def loadRelated(model: M, expression: RelationExpression): QueryBuilderYieldingOne[M] = js.native
  def loadRelated(model: M, expression: RelationExpression, filters: Filters[M]): QueryBuilderYieldingOne[M] = js.native
  def loadRelated(model: M, expression: RelationExpression, filters: Filters[M], trxOrKnex: knexLib.knexMod.Knex): QueryBuilderYieldingOne[M] = js.native
  def loadRelated(model: M, expression: RelationExpression, filters: Filters[M], trxOrKnex: Transaction): QueryBuilderYieldingOne[M] = js.native
  // loadRelated is overloaded to support both Model and Model[] variants:
  def loadRelated(models: js.Array[M], expression: RelationExpression): QueryBuilder[
    M, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RM */ _, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def loadRelated(models: js.Array[M], expression: RelationExpression, filters: Filters[M]): QueryBuilder[
    M, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RM */ _, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def loadRelated(
    models: js.Array[M],
    expression: RelationExpression,
    filters: Filters[M],
    trxOrKnex: knexLib.knexMod.Knex
  ): QueryBuilder[
    M, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RM */ _, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def loadRelated(models: js.Array[M], expression: RelationExpression, filters: Filters[M], trxOrKnex: Transaction): QueryBuilder[
    M, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RM */ _, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def omitImpl(f: js.Function2[/* obj */ js.Object, /* prop */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def query(): QueryBuilder[
    M, 
    js.Array[M], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def query(trxOrKnex: knexLib.knexMod.Knex): QueryBuilder[
    M, 
    js.Array[M], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def query(trxOrKnex: Transaction): QueryBuilder[
    M, 
    js.Array[M], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def raw(sql: java.lang.String, bindings: (knexLib.knexMod.Value | knexLib.knexMod.QueryBuilder)*): knexLib.knexMod.Raw = js.native
  def raw(sql: java.lang.String, bindings: js.Array[knexLib.knexMod.Value | knexLib.knexMod.QueryBuilder]): knexLib.knexMod.Raw = js.native
  def raw(sql: java.lang.String, bindings: knexLib.knexMod.ValueMap): knexLib.knexMod.Raw = js.native
  def raw(value: knexLib.knexMod.Value): knexLib.knexMod.Raw = js.native
  // This can only be used as a subquery so the result model type is irrelevant.
  def relatedQuery(relationName: java.lang.String): QueryBuilder[
    _, 
    js.Array[_], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def tableMetadata(): TableMetadata = js.native
  def tableMetadata(opt: TableMetadataOptions): TableMetadata = js.native
  def traverse(
    filterConstructor: objectionLib.TypeofClassModel,
    models: js.Array[Model],
    traverser: TraverserFunction
  ): scala.Unit = js.native
  def traverse(filterConstructor: objectionLib.TypeofClassModel, models: Model, traverser: TraverserFunction): scala.Unit = js.native
  def traverse(models: js.Array[Model], traverser: TraverserFunction): scala.Unit = js.native
  def traverse(models: Model, traverser: TraverserFunction): scala.Unit = js.native
}

