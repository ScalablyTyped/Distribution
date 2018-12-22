package typings
package objectionLib.objectionMod.ObjectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryBuilderBase[QM /* <: Model */, RM, RV] extends QueryInterface[QM, RM, RV] {
  @JSName("allowEager")
  var allowEager_Original: RelationExpressionMethod[QM, RM, RV] = js.native
  @JSName("allowInsert")
  var allowInsert_Original: RelationExpressionMethod[QM, RM, RV] = js.native
  @JSName("allowUpsert")
  var allowUpsert_Original: RelationExpressionMethod[QM, RM, RV] = js.native
  @JSName("filterEager")
  var filterEager_Original: ModifyEager[QM, RM, RV] = js.native
  /** findOne is shorthand for .where(...whereArgs).first() */
  @JSName("findOne")
  var findOne_Original: FindOne[QM] = js.native
  @JSName("fullOuterJoinRelation")
  var fullOuterJoinRelation_Original: JoinRelation = js.native
  @JSName("innerJoinRelation")
  var innerJoinRelation_Original: JoinRelation = js.native
  @JSName("insertGraphAndFetch")
  var insertGraphAndFetch_Original: InsertGraphAndFetch[QM] = js.native
  @JSName("insertGraph")
  var insertGraph_Original: InsertGraph[QM] = js.native
  @JSName("insertWithRelatedAndFetch")
  var insertWithRelatedAndFetch_Original: InsertGraphAndFetch[QM] = js.native
  /**
       * insertWithRelated is an alias for insertGraph.
       */
  @JSName("insertWithRelated")
  var insertWithRelated_Original: InsertGraph[QM] = js.native
  @JSName("insert")
  var insert_Original: Insert[QM] = js.native
  @JSName("joinRelation")
  var joinRelation_Original: JoinRelation = js.native
  @JSName("leftJoinRelation")
  var leftJoinRelation_Original: JoinRelation = js.native
  @JSName("leftOuterJoinRelation")
  var leftOuterJoinRelation_Original: JoinRelation = js.native
  @JSName("modifyEager")
  var modifyEager_Original: ModifyEager[QM, RM, RV] = js.native
  @JSName("orWhereJsonHasAll")
  var orWhereJsonHasAll_Original: WhereJsonExpression[QM, RM, RV] = js.native
  @JSName("orWhereJsonHasAny")
  var orWhereJsonHasAny_Original: WhereJsonExpression[QM, RM, RV] = js.native
  @JSName("orWhereJsonIsArray")
  var orWhereJsonIsArray_Original: WhereFieldExpression[QM, RM, RV] = js.native
  @JSName("orWhereJsonIsObject")
  var orWhereJsonIsObject_Original: WhereFieldExpression[QM, RM, RV] = js.native
  @JSName("orWhereJsonNotArray")
  var orWhereJsonNotArray_Original: WhereFieldExpression[QM, RM, RV] = js.native
  @JSName("orWhereJsonNotObject")
  var orWhereJsonNotObject_Original: WhereFieldExpression[QM, RM, RV] = js.native
  @JSName("orWhereJsonNotSubsetOf")
  var orWhereJsonNotSubsetOf_Original: WhereJson[QM, RM, RV] = js.native
  @JSName("orWhereJsonNotSupersetOf")
  var orWhereJsonNotSupersetOf_Original: WhereJson[QM, RM, RV] = js.native
  @JSName("orWhereJsonSubsetOf")
  var orWhereJsonSubsetOf_Original: WhereJson[QM, RM, RV] = js.native
  @JSName("orWhereJsonSupersetOf")
  var orWhereJsonSupersetOf_Original: WhereJson[QM, RM, RV] = js.native
  @JSName("outerJoinRelation")
  var outerJoinRelation_Original: JoinRelation = js.native
  @JSName("rightJoinRelation")
  var rightJoinRelation_Original: JoinRelation = js.native
  @JSName("rightOuterJoinRelation")
  var rightOuterJoinRelation_Original: JoinRelation = js.native
  @JSName("upsertGraphAndFetch")
  var upsertGraphAndFetch_Original: Upsert[QM] = js.native
  @JSName("upsertGraph")
  var upsertGraph_Original: Upsert[QM] = js.native
  @JSName("whereJsonHasAll")
  var whereJsonHasAll_Original: WhereJsonExpression[QM, RM, RV] = js.native
  @JSName("whereJsonHasAny")
  var whereJsonHasAny_Original: WhereJsonExpression[QM, RM, RV] = js.native
  @JSName("whereJsonIsArray")
  var whereJsonIsArray_Original: WhereFieldExpression[QM, RM, RV] = js.native
  @JSName("whereJsonIsObject")
  var whereJsonIsObject_Original: WhereFieldExpression[QM, RM, RV] = js.native
  @JSName("whereJsonNotArray")
  var whereJsonNotArray_Original: WhereFieldExpression[QM, RM, RV] = js.native
  @JSName("whereJsonNotObject")
  var whereJsonNotObject_Original: WhereFieldExpression[QM, RM, RV] = js.native
  @JSName("whereJsonNotSubsetOf")
  var whereJsonNotSubsetOf_Original: WhereJson[QM, RM, RV] = js.native
  @JSName("whereJsonNotSupersetOf")
  var whereJsonNotSupersetOf_Original: WhereJson[QM, RM, RV] = js.native
  @JSName("whereJsonSubsetOf")
  var whereJsonSubsetOf_Original: WhereJson[QM, RM, RV] = js.native
  @JSName("whereJsonSupersetOf")
  var whereJsonSupersetOf_Original: WhereJson[QM, RM, RV] = js.native
  def alias(alias: java.lang.String): this.type = js.native
  def allowEager(relationExpression: RelationExpression): QueryBuilder[QM, RM, RV] = js.native
  def allowInsert(relationExpression: RelationExpression): QueryBuilder[QM, RM, RV] = js.native
  def allowUpsert(relationExpression: RelationExpression): QueryBuilder[QM, RM, RV] = js.native
  def applyFilter(namedFilters: java.lang.String*): this.type = js.native
  def asCallback(callback: NodeStyleCallback): js.Promise[QM] = js.native
  def bind(context: js.Any): js.Promise[QM] = js.native
  // TODO: avgDistinct does not exist in current knex documentation: http://knexjs.org/#Builder-fromJS
  // TODO: modify does not exist in current knex documentation: http://knexjs.org/#Builder-modify
  // TODO: the return value of this method matches the knex typescript and documentation.
  // The Objection documentation incorrectly states this returns a QueryBuilder.
  def columnInfo(): js.Promise[knexLib.knexMod.KnexNs.ColumnInfo] = js.native
  // TODO: avgDistinct does not exist in current knex documentation: http://knexjs.org/#Builder-fromJS
  // TODO: modify does not exist in current knex documentation: http://knexjs.org/#Builder-modify
  // TODO: the return value of this method matches the knex typescript and documentation.
  // The Objection documentation incorrectly states this returns a QueryBuilder.
  def columnInfo(column: java.lang.String): js.Promise[knexLib.knexMod.KnexNs.ColumnInfo] = js.native
  def context(): QueryContext = js.native
  // Non-query methods:
  def context(queryContext: js.Object): this.type = js.native
  /**
       * @return a Promise of the number of deleted rows
       */
  def deleteById(idOrIds: IdOrIds): QueryBuilderYieldingCount[QM, RM] = js.native
  def eager(relationExpression: RelationExpression): this.type = js.native
  def eager(relationExpression: RelationExpression, filters: FilterExpression[QM]): this.type = js.native
  def eagerAlgorithm(algo: EagerAlgorithm): this.type = js.native
  def eagerOptions(opts: EagerOptions): this.type = js.native
  def filterEager[QM2 /* <: Model */](
    relationExpression: RelationExpression,
    modifier: js.Function1[/* builder */ QueryBuilder[QM2, js.Array[QM2], js.Array[QM2]], scala.Unit]
  ): QueryBuilder[QM, RM, RV] = js.native
  def findById(id: Id): QueryBuilderYieldingOneOrNone[QM] = js.native
  @JSName("findById")
  def `findById_<this>`(idOrIds: IdOrIds): this.type = js.native
  def findByIds(ids: js.Array[js.Array[Id] | Id]): this.type = js.native
  /** findOne is shorthand for .where(...whereArgs).first() */
  def findOne(
    callback: js.Function1[/* queryBuilder */ QueryBuilder[QM, js.Array[QM], js.Array[QM]], scala.Unit]
  ): QueryBuilderYieldingOneOrNone[QM] = js.native
  /** findOne is shorthand for .where(...whereArgs).first() */
  def findOne(
    column: ColumnRef,
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[QM, js.Array[QM], js.Array[QM]], 
      /* queryBuilder */ QueryBuilder[QM, js.Array[QM], js.Array[QM]], 
      scala.Unit
    ]
  ): QueryBuilderYieldingOneOrNone[QM] = js.native
  /** findOne is shorthand for .where(...whereArgs).first() */
  def findOne(column: ColumnRef, operator: java.lang.String, value: QueryBuilder[_, js.Array[_], js.Array[_]]): QueryBuilderYieldingOneOrNone[QM] = js.native
  /** findOne is shorthand for .where(...whereArgs).first() */
  def findOne(column: ColumnRef, operator: java.lang.String, value: Reference): QueryBuilderYieldingOneOrNone[QM] = js.native
  /** findOne is shorthand for .where(...whereArgs).first() */
  def findOne(column: ColumnRef, operator: java.lang.String, value: Value): QueryBuilderYieldingOneOrNone[QM] = js.native
  /** findOne is shorthand for .where(...whereArgs).first() */
  def findOne(column: ColumnRef, value: QueryBuilder[_, js.Array[_], js.Array[_]]): QueryBuilderYieldingOneOrNone[QM] = js.native
  /** findOne is shorthand for .where(...whereArgs).first() */
  def findOne(column: ColumnRef, value: Reference): QueryBuilderYieldingOneOrNone[QM] = js.native
  /** findOne is shorthand for .where(...whereArgs).first() */
  def findOne(column: ColumnRef, value: Value): QueryBuilderYieldingOneOrNone[QM] = js.native
  /** findOne is shorthand for .where(...whereArgs).first() */
  def findOne(condition: scala.Boolean): QueryBuilderYieldingOneOrNone[QM] = js.native
  /** findOne is shorthand for .where(...whereArgs).first() */
  def findOne(`object`: js.Object): QueryBuilderYieldingOneOrNone[QM] = js.native
  /** findOne is shorthand for .where(...whereArgs).first() */
  def findOne(sql: java.lang.String, bindings: js.Any*): QueryBuilderYieldingOneOrNone[QM] = js.native
  /** findOne is shorthand for .where(...whereArgs).first() */
  def findOne(sql: java.lang.String, bindings: js.Any): QueryBuilderYieldingOneOrNone[QM] = js.native
  def first(): QueryBuilderYieldingOneOrNone[QM] = js.native
  def forShare(): this.type = js.native
  def forUpdate(): this.type = js.native
  def fullOuterJoinRelation[QM /* <: Model */](relationName: java.lang.String): QueryBuilder[QM, js.Array[QM], js.Array[QM]] = js.native
  def fullOuterJoinRelation[QM /* <: Model */](relationName: java.lang.String, opt: RelationOptions): QueryBuilder[QM, js.Array[QM], js.Array[QM]] = js.native
  def hasEager(): scala.Boolean = js.native
  def hasSelects(): scala.Boolean = js.native
  def hasWheres(): scala.Boolean = js.native
  def innerJoinRelation[QM /* <: Model */](relationName: java.lang.String): QueryBuilder[QM, js.Array[QM], js.Array[QM]] = js.native
  def innerJoinRelation[QM /* <: Model */](relationName: java.lang.String, opt: RelationOptions): QueryBuilder[QM, js.Array[QM], js.Array[QM]] = js.native
  def insert(): QueryBuilder[QM, js.Array[QM], js.Array[QM]] = js.native
  def insert(modelOrObject: stdLib.Partial[QM]): QueryBuilder[QM, QM, QM] = js.native
  def insert(modelsOrObjects: js.Array[stdLib.Partial[QM]]): QueryBuilder[QM, js.Array[QM], js.Array[QM]] = js.native
  def insertAndFetch(): QueryBuilder[QM, js.Array[QM], js.Array[QM]] = js.native
  def insertAndFetch(modelOrObject: stdLib.Partial[QM]): QueryBuilder[QM, QM, QM] = js.native
  def insertAndFetch(modelsOrObjects: js.Array[stdLib.Partial[QM]]): QueryBuilder[QM, js.Array[QM], js.Array[QM]] = js.native
  def insertGraph(): QueryBuilder[QM, js.Array[QM], js.Array[QM]] = js.native
  def insertGraph(modelOrObject: stdLib.Partial[QM]): QueryBuilder[QM, QM, QM] = js.native
  def insertGraph(modelOrObject: stdLib.Partial[QM], options: InsertGraphOptions): QueryBuilder[QM, QM, QM] = js.native
  def insertGraph(modelsOrObjects: js.Array[stdLib.Partial[QM]]): QueryBuilder[QM, js.Array[QM], js.Array[QM]] = js.native
  def insertGraph(modelsOrObjects: js.Array[stdLib.Partial[QM]], options: InsertGraphOptions): QueryBuilder[QM, js.Array[QM], js.Array[QM]] = js.native
  def insertGraphAndFetch(): QueryBuilder[QM, js.Array[QM], js.Array[QM]] = js.native
  def insertGraphAndFetch(modelOrObject: stdLib.Partial[QM]): QueryBuilder[QM, QM, QM] = js.native
  def insertGraphAndFetch(modelOrObject: stdLib.Partial[QM], options: InsertGraphOptions): QueryBuilder[QM, QM, QM] = js.native
  def insertGraphAndFetch(modelsOrObjects: js.Array[stdLib.Partial[QM]]): QueryBuilder[QM, js.Array[QM], js.Array[QM]] = js.native
  def insertGraphAndFetch(modelsOrObjects: js.Array[stdLib.Partial[QM]], options: InsertGraphOptions): QueryBuilder[QM, js.Array[QM], js.Array[QM]] = js.native
  @JSName("insertGraph")
  def `insertGraph_<this>`(): this.type = js.native
  /**
       * insertWithRelated is an alias for insertGraph.
       */
  def insertWithRelated(): QueryBuilder[QM, js.Array[QM], js.Array[QM]] = js.native
  /**
       * insertWithRelated is an alias for insertGraph.
       */
  def insertWithRelated(modelOrObject: stdLib.Partial[QM]): QueryBuilder[QM, QM, QM] = js.native
  /**
       * insertWithRelated is an alias for insertGraph.
       */
  def insertWithRelated(modelOrObject: stdLib.Partial[QM], options: InsertGraphOptions): QueryBuilder[QM, QM, QM] = js.native
  /**
       * insertWithRelated is an alias for insertGraph.
       */
  def insertWithRelated(modelsOrObjects: js.Array[stdLib.Partial[QM]]): QueryBuilder[QM, js.Array[QM], js.Array[QM]] = js.native
  /**
       * insertWithRelated is an alias for insertGraph.
       */
  def insertWithRelated(modelsOrObjects: js.Array[stdLib.Partial[QM]], options: InsertGraphOptions): QueryBuilder[QM, js.Array[QM], js.Array[QM]] = js.native
  def insertWithRelatedAndFetch(): QueryBuilder[QM, js.Array[QM], js.Array[QM]] = js.native
  def insertWithRelatedAndFetch(modelOrObject: stdLib.Partial[QM]): QueryBuilder[QM, QM, QM] = js.native
  def insertWithRelatedAndFetch(modelOrObject: stdLib.Partial[QM], options: InsertGraphOptions): QueryBuilder[QM, QM, QM] = js.native
  def insertWithRelatedAndFetch(modelsOrObjects: js.Array[stdLib.Partial[QM]]): QueryBuilder[QM, js.Array[QM], js.Array[QM]] = js.native
  def insertWithRelatedAndFetch(modelsOrObjects: js.Array[stdLib.Partial[QM]], options: InsertGraphOptions): QueryBuilder[QM, js.Array[QM], js.Array[QM]] = js.native
  /**
       * insertWithRelated is an alias for insertGraph.
       */
  @JSName("insertWithRelated")
  def `insertWithRelated_<this>`(): this.type = js.native
  @JSName("insert")
  def `insert_<this>`(): this.type = js.native
  def isDelete(): scala.Boolean = js.native
  def isExecutable(): scala.Boolean = js.native
  def isFind(): scala.Boolean = js.native
  def isInsert(): scala.Boolean = js.native
  def isRelate(): scala.Boolean = js.native
  def isUnrelate(): scala.Boolean = js.native
  def isUpdate(): scala.Boolean = js.native
  def joinEager(relationExpression: RelationExpression): this.type = js.native
  def joinEager(relationExpression: RelationExpression, filters: FilterExpression[QM]): this.type = js.native
  def joinRelation[QM /* <: Model */](relationName: java.lang.String): QueryBuilder[QM, js.Array[QM], js.Array[QM]] = js.native
  def joinRelation[QM /* <: Model */](relationName: java.lang.String, opt: RelationOptions): QueryBuilder[QM, js.Array[QM], js.Array[QM]] = js.native
  def leftJoinRelation[QM /* <: Model */](relationName: java.lang.String): QueryBuilder[QM, js.Array[QM], js.Array[QM]] = js.native
  def leftJoinRelation[QM /* <: Model */](relationName: java.lang.String, opt: RelationOptions): QueryBuilder[QM, js.Array[QM], js.Array[QM]] = js.native
  def leftOuterJoinRelation[QM /* <: Model */](relationName: java.lang.String): QueryBuilder[QM, js.Array[QM], js.Array[QM]] = js.native
  def leftOuterJoinRelation[QM /* <: Model */](relationName: java.lang.String, opt: RelationOptions): QueryBuilder[QM, js.Array[QM], js.Array[QM]] = js.native
  // We get `then` and `catch` by extending Promise
  def map[V, Result](mapper: BluebirdMapper[V, Result]): js.Promise[js.Array[Result]] = js.native
  def mergeContext(queryContext: js.Object): this.type = js.native
  def mergeEager(relationExpression: RelationExpression): this.type = js.native
  def mergeEager(relationExpression: RelationExpression, filters: FilterExpression[QM]): this.type = js.native
  def mergeJoinEager(relationExpression: RelationExpression): this.type = js.native
  def mergeJoinEager(relationExpression: RelationExpression, filters: FilterExpression[QM]): this.type = js.native
  def mergeNaiveEager(relationExpression: RelationExpression): this.type = js.native
  def mergeNaiveEager(relationExpression: RelationExpression, filters: FilterExpression[QM]): this.type = js.native
  def modelClass(): org.scalablytyped.runtime.Instantiable0[Model] = js.native
  def modify(func: js.Function1[/* builder */ this.type, scala.Unit]): this.type = js.native
  def modify(namedFilter: java.lang.String): this.type = js.native
  def modifyEager[QM2 /* <: Model */](
    relationExpression: RelationExpression,
    modifier: js.Function1[/* builder */ QueryBuilder[QM2, js.Array[QM2], js.Array[QM2]], scala.Unit]
  ): QueryBuilder[QM, RM, RV] = js.native
  def naiveEager(relationExpression: RelationExpression): this.type = js.native
  def naiveEager(relationExpression: RelationExpression, filters: FilterExpression[QM]): this.type = js.native
  def nodeify(callback: NodeStyleCallback): js.Promise[QM] = js.native
  def omit(modelClass: org.scalablytyped.runtime.Instantiable0[Model], properties: js.Array[java.lang.String]): this.type = js.native
  def omit(properties: js.Array[java.lang.String]): this.type = js.native
  def onBuild(fn: js.Function1[/* builder */ this.type, scala.Unit]): this.type = js.native
  def onBuildKnex(
    fn: js.Function2[
      /* knexBuilder */ knexLib.knexMod.KnexNs.QueryBuilder, 
      /* builder */ this.type, 
      scala.Unit
    ]
  ): this.type = js.native
  def onError(fn: js.Function2[/* error */ nodeLib.Error, /* builder */ this.type, _]): this.type = js.native
  def orWhereJsonHasAll(fieldExpression: FieldExpression, keys: java.lang.String): QueryBuilder[QM, RM, RV] = js.native
  def orWhereJsonHasAll(fieldExpression: FieldExpression, keys: js.Array[java.lang.String]): QueryBuilder[QM, RM, RV] = js.native
  def orWhereJsonHasAny(fieldExpression: FieldExpression, keys: java.lang.String): QueryBuilder[QM, RM, RV] = js.native
  def orWhereJsonHasAny(fieldExpression: FieldExpression, keys: js.Array[java.lang.String]): QueryBuilder[QM, RM, RV] = js.native
  def orWhereJsonIsArray(fieldExpression: FieldExpression): QueryBuilder[QM, RM, RV] = js.native
  def orWhereJsonIsObject(fieldExpression: FieldExpression): QueryBuilder[QM, RM, RV] = js.native
  def orWhereJsonNotArray(fieldExpression: FieldExpression): QueryBuilder[QM, RM, RV] = js.native
  def orWhereJsonNotObject(fieldExpression: FieldExpression): QueryBuilder[QM, RM, RV] = js.native
  def orWhereJsonNotSubsetOf(fieldExpression: FieldExpression, jsonObjectOrFieldExpression: JsonObjectOrFieldExpression): QueryBuilder[QM, RM, RV] = js.native
  def orWhereJsonNotSupersetOf(fieldExpression: FieldExpression, jsonObjectOrFieldExpression: JsonObjectOrFieldExpression): QueryBuilder[QM, RM, RV] = js.native
  def orWhereJsonSubsetOf(fieldExpression: FieldExpression, jsonObjectOrFieldExpression: JsonObjectOrFieldExpression): QueryBuilder[QM, RM, RV] = js.native
  def orWhereJsonSupersetOf(fieldExpression: FieldExpression, jsonObjectOrFieldExpression: JsonObjectOrFieldExpression): QueryBuilder[QM, RM, RV] = js.native
  def outerJoinRelation[QM /* <: Model */](relationName: java.lang.String): QueryBuilder[QM, js.Array[QM], js.Array[QM]] = js.native
  def outerJoinRelation[QM /* <: Model */](relationName: java.lang.String, opt: RelationOptions): QueryBuilder[QM, js.Array[QM], js.Array[QM]] = js.native
  def page(page: scala.Double, pageSize: scala.Double): QueryBuilder[QM, Page[QM], Page[QM]] = js.native
  /**
       * @return a Promise of the number of patched rows
       */
  def patch(modelOrObject: PartialUpdate[QM]): QueryBuilderYieldingCount[QM, RM] = js.native
  def patchAndFetch(modelOrObject: PartialUpdate[QM]): QueryBuilder[QM, QM, QM] = js.native
  def patchAndFetchById(idOrIds: IdOrIds, modelOrObject: PartialUpdate[QM]): QueryBuilder[QM, QM, QM] = js.native
  def pick(modelClass: org.scalablytyped.runtime.Instantiable0[Model], properties: js.Array[java.lang.String]): this.type = js.native
  def pick(properties: js.Array[java.lang.String]): this.type = js.native
  def range(start: scala.Double, end: scala.Double): QueryBuilder[QM, Page[QM], Page[QM]] = js.native
  def reflect(): js.Promise[QM] = js.native
  def reject(reason: js.Any): this.type = js.native
  def relate[RelatedM /* <: Model */](ids: js.Array[stdLib.Partial[RelatedM]]): this.type = js.native
  def relate[RelatedM /* <: Model */](ids: IdOrIds): this.type = js.native
  def relate[RelatedM /* <: Model */](ids: stdLib.Partial[RelatedM]): this.type = js.native
  def resolve(value: js.Any): this.type = js.native
  def resultSize(): js.Promise[scala.Double] = js.native
  def `return`[V](returnValue: V): js.Promise[V] = js.native
  def returning(columns: java.lang.String): QueryBuilder[QM, RM, RM] = js.native
  def returning(columns: js.Array[java.lang.String]): QueryBuilder[QM, RM, RM] = js.native
  def rightJoinRelation[QM /* <: Model */](relationName: java.lang.String): QueryBuilder[QM, js.Array[QM], js.Array[QM]] = js.native
  def rightJoinRelation[QM /* <: Model */](relationName: java.lang.String, opt: RelationOptions): QueryBuilder[QM, js.Array[QM], js.Array[QM]] = js.native
  def rightOuterJoinRelation[QM /* <: Model */](relationName: java.lang.String): QueryBuilder[QM, js.Array[QM], js.Array[QM]] = js.native
  def rightOuterJoinRelation[QM /* <: Model */](relationName: java.lang.String, opt: RelationOptions): QueryBuilder[QM, js.Array[QM], js.Array[QM]] = js.native
  def runAfter(fn: js.Function2[/* result */ js.Any, /* builder */ QueryBuilder[QM, _, _], _]): this.type = js.native
  def runBefore(fn: js.Function2[/* result */ js.Any, /* builder */ QueryBuilder[QM, _, _], _]): this.type = js.native
  def skipUndefined(): this.type = js.native
  def tableNameFor(modelClass: ModelClass[_]): java.lang.String = js.native
  def tableRefFor(modelClass: ModelClass[_]): java.lang.String = js.native
  def timeout(ms: scala.Double): this.type = js.native
  def timeout(ms: scala.Double, options: TimeoutOptions): this.type = js.native
  def toSql(): java.lang.String = js.native
  def traverse(modelClass: org.scalablytyped.runtime.Instantiable0[Model], traverser: TraverserFunction): this.type = js.native
  def unrelate(): this.type = js.native
  /**
       * @return a Promise of the number of updated rows
       */
  def update(modelOrObject: PartialUpdate[QM]): QueryBuilderYieldingCount[QM, RM] = js.native
  def updateAndFetch(modelOrObject: PartialUpdate[QM]): QueryBuilder[QM, QM, QM] = js.native
  def updateAndFetchById(id: Id, modelOrObject: PartialUpdate[QM]): QueryBuilder[QM, QM, QM] = js.native
  def upsertGraph(): QueryBuilder[QM, js.Array[QM], js.Array[QM]] = js.native
  def upsertGraph(modelOrObject: stdLib.Partial[QM]): QueryBuilder[QM, QM, QM] = js.native
  def upsertGraph(modelOrObject: stdLib.Partial[QM], options: UpsertOptions): QueryBuilder[QM, QM, QM] = js.native
  def upsertGraph(modelsOrObjects: js.Array[stdLib.Partial[QM]]): QueryBuilder[QM, js.Array[QM], js.Array[QM]] = js.native
  def upsertGraph(modelsOrObjects: js.Array[stdLib.Partial[QM]], options: UpsertOptions): QueryBuilder[QM, js.Array[QM], js.Array[QM]] = js.native
  def upsertGraphAndFetch(): QueryBuilder[QM, js.Array[QM], js.Array[QM]] = js.native
  def upsertGraphAndFetch(modelOrObject: stdLib.Partial[QM]): QueryBuilder[QM, QM, QM] = js.native
  def upsertGraphAndFetch(modelOrObject: stdLib.Partial[QM], options: UpsertOptions): QueryBuilder[QM, QM, QM] = js.native
  def upsertGraphAndFetch(modelsOrObjects: js.Array[stdLib.Partial[QM]]): QueryBuilder[QM, js.Array[QM], js.Array[QM]] = js.native
  def upsertGraphAndFetch(modelsOrObjects: js.Array[stdLib.Partial[QM]], options: UpsertOptions): QueryBuilder[QM, js.Array[QM], js.Array[QM]] = js.native
  def whereComposite(column: js.Array[ColumnRef], operator: java.lang.String, value: js.Array[Value]): this.type = js.native
  def whereComposite(
    column: js.Array[ColumnRef],
    operator: java.lang.String,
    value: QueryBuilder[_, js.Array[_], js.Array[_]]
  ): this.type = js.native
  def whereComposite(column: js.Array[ColumnRef], value: js.Array[Value]): this.type = js.native
  def whereComposite(column: js.Array[ColumnRef], value: QueryBuilder[_, js.Array[_], js.Array[_]]): this.type = js.native
  def whereComposite(column: ColumnRef, operator: java.lang.String, value: QueryBuilder[_, js.Array[_], js.Array[_]]): this.type = js.native
  def whereComposite(column: ColumnRef, operator: java.lang.String, value: Value): this.type = js.native
  def whereComposite(column: ColumnRef, value: QueryBuilder[_, js.Array[_], js.Array[_]]): this.type = js.native
  def whereComposite(column: ColumnRef, value: Value): this.type = js.native
  def whereInComposite(column: ColumnRef, values: js.Array[Value]): this.type = js.native
  def whereInComposite(column: ColumnRef, values: QueryBuilder[_, js.Array[_], js.Array[_]]): this.type = js.native
  def whereJsonHasAll(fieldExpression: FieldExpression, keys: java.lang.String): QueryBuilder[QM, RM, RV] = js.native
  def whereJsonHasAll(fieldExpression: FieldExpression, keys: js.Array[java.lang.String]): QueryBuilder[QM, RM, RV] = js.native
  def whereJsonHasAny(fieldExpression: FieldExpression, keys: java.lang.String): QueryBuilder[QM, RM, RV] = js.native
  def whereJsonHasAny(fieldExpression: FieldExpression, keys: js.Array[java.lang.String]): QueryBuilder[QM, RM, RV] = js.native
  def whereJsonIsArray(fieldExpression: FieldExpression): QueryBuilder[QM, RM, RV] = js.native
  def whereJsonIsObject(fieldExpression: FieldExpression): QueryBuilder[QM, RM, RV] = js.native
  def whereJsonNotArray(fieldExpression: FieldExpression): QueryBuilder[QM, RM, RV] = js.native
  def whereJsonNotObject(fieldExpression: FieldExpression): QueryBuilder[QM, RM, RV] = js.native
  def whereJsonNotSubsetOf(fieldExpression: FieldExpression, jsonObjectOrFieldExpression: JsonObjectOrFieldExpression): QueryBuilder[QM, RM, RV] = js.native
  def whereJsonNotSupersetOf(fieldExpression: FieldExpression, jsonObjectOrFieldExpression: JsonObjectOrFieldExpression): QueryBuilder[QM, RM, RV] = js.native
  def whereJsonSubsetOf(fieldExpression: FieldExpression, jsonObjectOrFieldExpression: JsonObjectOrFieldExpression): QueryBuilder[QM, RM, RV] = js.native
  def whereJsonSupersetOf(fieldExpression: FieldExpression, jsonObjectOrFieldExpression: JsonObjectOrFieldExpression): QueryBuilder[QM, RM, RV] = js.native
  // TODO: fromJS does not exist in current knex documentation: http://knexjs.org/#Builder-fromJS
  def withSchema(schemaName: java.lang.String): this.type = js.native
}

