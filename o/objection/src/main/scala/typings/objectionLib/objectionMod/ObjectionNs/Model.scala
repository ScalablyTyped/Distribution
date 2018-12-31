package typings
package objectionLib.objectionMod.ObjectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
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
  def $appendRelated[T, RelatedM /* <: Model */](`this`: T, relation: nodeLib.String): T = js.native
  @JSName("$appendRelated")
  def $appendRelated[T, RelatedM /* <: Model */](`this`: T, relation: nodeLib.String, related: RelatedM): T = js.native
  @JSName("$appendRelated")
  def $appendRelated[T, RelatedM /* <: Model */](`this`: T, relation: nodeLib.String, related: js.Array[RelatedM]): T = js.native
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
  def $loadRelated[QM /* <: Model */](`this`: QM, expression: java.lang.String): QueryBuilder[QM, QM, QM] = js.native
  @JSName("$loadRelated")
  def $loadRelated[QM /* <: Model */](`this`: QM, expression: java.lang.String, filters: Filters[QM]): QueryBuilder[QM, QM, QM] = js.native
  @JSName("$loadRelated")
  def $loadRelated[QM /* <: Model */](`this`: QM, expression: java.lang.String, filters: Filters[QM], trxOrKnex: knexLib.knexMod.Knex): QueryBuilder[QM, QM, QM] = js.native
  @JSName("$loadRelated")
  def $loadRelated[QM /* <: Model */](`this`: QM, expression: java.lang.String, filters: Filters[QM], trxOrKnex: Transaction): QueryBuilder[QM, QM, QM] = js.native
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
  def $query[QM /* <: Model */](`this`: QM): QueryBuilder[QM, QM, QM] = js.native
  @JSName("$query")
  def $query[QM /* <: Model */](`this`: QM, trxOrKnex: knexLib.knexMod.Knex): QueryBuilder[QM, QM, QM] = js.native
  @JSName("$query")
  def $query[QM /* <: Model */](`this`: QM, trxOrKnex: Transaction): QueryBuilder[QM, QM, QM] = js.native
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
  def $relatedQuery[QM /* <: Model */, RM](relationName: java.lang.String): QueryBuilder[QM, RM, RM] = js.native
  @JSName("$relatedQuery")
  def $relatedQuery[QM /* <: Model */, RM](relationName: java.lang.String, trxOrKnex: knexLib.knexMod.Knex): QueryBuilder[QM, RM, RM] = js.native
  @JSName("$relatedQuery")
  def $relatedQuery[QM /* <: Model */, RM](relationName: java.lang.String, trxOrKnex: Transaction): QueryBuilder[QM, RM, RM] = js.native
  @JSName("$set")
  def $set[T](`this`: T, obj: Pojo): T = js.native
  @JSName("$setDatabaseJson")
  def $setDatabaseJson[M](`this`: M, json: Pojo): M = js.native
  @JSName("$setJson")
  def $setJson[T](`this`: T, json: Pojo): T = js.native
  @JSName("$setJson")
  def $setJson[T](`this`: T, json: Pojo, opt: ModelOptions): T = js.native
  @JSName("$setRelated")
  def $setRelated[T, RelatedM /* <: Model */](`this`: T, relation: nodeLib.String): T = js.native
  @JSName("$setRelated")
  def $setRelated[T, RelatedM /* <: Model */](`this`: T, relation: nodeLib.String, related: RelatedM): T = js.native
  @JSName("$setRelated")
  def $setRelated[T, RelatedM /* <: Model */](`this`: T, relation: nodeLib.String, related: js.Array[RelatedM]): T = js.native
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
  def $toJson(opt: CloneOptions): js.Object = js.native
  @JSName("$transaction")
  def $transaction(): knexLib.knexMod.Knex = js.native
  @JSName("$traverse")
  def $traverse(filterConstructor: this.type, traverser: TraverserFunction): scala.Unit = js.native
  @JSName("$traverse")
  def $traverse(traverser: TraverserFunction): scala.Unit = js.native
  @JSName("$validate")
  def $validate(json: Pojo, opt: ModelOptions): Pojo = js.native
  def toJSON(): js.Object = js.native
  def toJSON(opt: CloneOptions): js.Object = js.native
}

