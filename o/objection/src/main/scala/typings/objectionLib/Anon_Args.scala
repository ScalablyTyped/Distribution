package typings
package objectionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Args
  extends org.scalablytyped.runtime.Instantiable0[objectionLib.objectionMod.Model] {
  var BelongsToOneRelation: objectionLib.objectionMod.Relation = js.native
  var HasManyRelation: objectionLib.objectionMod.Relation = js.native
  var HasOneRelation: objectionLib.objectionMod.Relation = js.native
  var HasOneThroughRelation: objectionLib.objectionMod.Relation = js.native
  var JoinEagerAlgorithm: objectionLib.objectionMod.EagerAlgorithm = js.native
  var ManyToManyRelation: objectionLib.objectionMod.Relation = js.native
  var NaiveEagerAlgorithm: objectionLib.objectionMod.EagerAlgorithm = js.native
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
    filterConstructor: /* import warning: ImportType.apply Failed type conversion: typeof Model */ js.Any,
    models: js.Array[objectionLib.objectionMod.Model],
    traverser: objectionLib.objectionMod.TraverserFunction
  ): scala.Unit = js.native
  def traverse(
    filterConstructor: /* import warning: ImportType.apply Failed type conversion: typeof Model */ js.Any,
    models: objectionLib.objectionMod.Model,
    traverser: objectionLib.objectionMod.TraverserFunction
  ): scala.Unit = js.native
  def traverse(
    models: js.Array[objectionLib.objectionMod.Model],
    traverser: objectionLib.objectionMod.TraverserFunction
  ): scala.Unit = js.native
  def traverse(models: objectionLib.objectionMod.Model, traverser: objectionLib.objectionMod.TraverserFunction): scala.Unit = js.native
}

