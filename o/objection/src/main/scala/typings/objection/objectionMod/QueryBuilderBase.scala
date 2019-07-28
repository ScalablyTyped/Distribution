package typings.objection.objectionMod

import typings.knex.knexMod.ColumnInfo
import typings.knex.knexMod.SafePartial
import typings.objection.TypeofClassModel
import typings.std.Error
import typings.std.Partial
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
  var upsertGraphAndFetch_Original: UpsertGraphAndFetch[QM] = js.native
  @JSName("upsertGraph")
  var upsertGraph_Original: UpsertGraph[QM] = js.native
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
  def alias(alias: String): this.type = js.native
  def aliasFor(modelClassOrTableName: String, alias: String): this.type = js.native
  def aliasFor(modelClassOrTableName: ModelClass[_], alias: String): this.type = js.native
  def allowEager(relationExpression: RelationExpression): QueryBuilder[QM, RM, RV] = js.native
  def allowInsert(relationExpression: RelationExpression): QueryBuilder[QM, RM, RV] = js.native
  def allowUpsert(relationExpression: RelationExpression): QueryBuilder[QM, RM, RV] = js.native
  def applyFilter(namedFilters: String*): this.type = js.native
  def asCallback(callback: NodeStyleCallback): js.Promise[QM] = js.native
  def bind(context: js.Any): js.Promise[QM] = js.native
  // TODO: avgDistinct does not exist in current knex documentation: http://knexjs.org/#Builder-fromJS
  // TODO: modify does not exist in current knex documentation: http://knexjs.org/#Builder-modify
  // TODO: the return value of this method matches the knex typescript and documentation.
  // The Objection documentation incorrectly states this returns a QueryBuilder.
  def columnInfo(): js.Promise[ColumnInfo] = js.native
  def columnInfo(column: String): js.Promise[ColumnInfo] = js.native
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
  def filterEager[QM2 /* <: Model */](relationExpression: RelationExpression, modifier: String): QueryBuilder[QM, RM, RV] = js.native
  def filterEager[QM2 /* <: Model */](relationExpression: RelationExpression, modifier: js.Array[String]): QueryBuilder[QM, RM, RV] = js.native
  def filterEager[QM2 /* <: Model */](
    relationExpression: RelationExpression,
    modifier: js.Function1[
      /* builder */ QueryBuilder[
        QM2, 
        js.Array[QM2], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def findById(id: Id): QueryBuilderYieldingOneOrNone[QM] = js.native
  @JSName("findById")
  def findById_This(idOrIds: IdOrIds): this.type = js.native
  def findByIds(ids: js.Array[js.Array[Id] | Id]): this.type = js.native
  /** findOne is shorthand for .where(...whereArgs).first() */
  def findOne(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilderYieldingOneOrNone[QM] = js.native
  /** findOne is shorthand for .where(...whereArgs).first() */
  def findOne(
    column: ColumnRef,
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilderYieldingOneOrNone[QM] = js.native
  def findOne(
    column: ColumnRef,
    operator: String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilderYieldingOneOrNone[QM] = js.native
  def findOne(column: ColumnRef, operator: String, value: Reference): QueryBuilderYieldingOneOrNone[QM] = js.native
  /** findOne is shorthand for .where(...whereArgs).first() */
  def findOne(column: ColumnRef, operator: String, value: Value): QueryBuilderYieldingOneOrNone[QM] = js.native
  def findOne(
    column: ColumnRef,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilderYieldingOneOrNone[QM] = js.native
  def findOne(column: ColumnRef, value: Reference): QueryBuilderYieldingOneOrNone[QM] = js.native
  /** findOne is shorthand for .where(...whereArgs).first() */
  def findOne(column: ColumnRef, value: Value): QueryBuilderYieldingOneOrNone[QM] = js.native
  /** findOne is shorthand for .where(...whereArgs).first() */
  def findOne(condition: Boolean): QueryBuilderYieldingOneOrNone[QM] = js.native
  /** findOne is shorthand for .where(...whereArgs).first() */
  def findOne(`object`: js.Object): QueryBuilderYieldingOneOrNone[QM] = js.native
  /** findOne is shorthand for .where(...whereArgs).first() */
  def findOne(sql: String, bindings: js.Any*): QueryBuilderYieldingOneOrNone[QM] = js.native
  /** findOne is shorthand for .where(...whereArgs).first() */
  def findOne(sql: String, bindings: js.Any): QueryBuilderYieldingOneOrNone[QM] = js.native
  def first(): QueryBuilderYieldingOneOrNone[QM] = js.native
  def forShare(): this.type = js.native
  def forUpdate(): this.type = js.native
  def fullOuterJoinRelation[QM /* <: Model */](relationName: String): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def fullOuterJoinRelation[QM /* <: Model */](relationName: String, opt: RelationOptions): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def hasEager(): Boolean = js.native
  def hasSelects(): Boolean = js.native
  def hasWheres(): Boolean = js.native
  def innerJoinRelation[QM /* <: Model */](relationName: String): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def innerJoinRelation[QM /* <: Model */](relationName: String, opt: RelationOptions): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def insert(): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def insert(modelOrObject: Partial[QM]): QueryBuilder[
    QM, 
    QM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def insert(modelsOrObjects: js.Array[Partial[QM]]): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def insertAndFetch(): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def insertAndFetch(modelOrObject: Partial[QM]): QueryBuilder[
    QM, 
    QM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def insertAndFetch(modelsOrObjects: js.Array[Partial[QM]]): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def insertGraph(): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def insertGraph(modelOrObject: DeepPartialGraph[QM]): QueryBuilder[
    QM, 
    QM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def insertGraph(modelOrObject: DeepPartialGraph[QM], options: InsertGraphOptions): QueryBuilder[
    QM, 
    QM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def insertGraph(modelsOrObjects: js.Array[DeepPartialGraph[QM]]): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def insertGraph(modelsOrObjects: js.Array[DeepPartialGraph[QM]], options: InsertGraphOptions): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def insertGraphAndFetch(): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def insertGraphAndFetch(modelOrObject: DeepPartialGraph[QM]): QueryBuilder[
    QM, 
    QM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def insertGraphAndFetch(modelOrObject: DeepPartialGraph[QM], options: InsertGraphOptions): QueryBuilder[
    QM, 
    QM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def insertGraphAndFetch(modelsOrObjects: js.Array[DeepPartialGraph[QM]]): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def insertGraphAndFetch(modelsOrObjects: js.Array[DeepPartialGraph[QM]], options: InsertGraphOptions): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  @JSName("insertGraph")
  def insertGraph_This(): this.type = js.native
  /**
    * insertWithRelated is an alias for insertGraph.
    */
  def insertWithRelated(): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def insertWithRelated(modelOrObject: DeepPartialGraph[QM]): QueryBuilder[
    QM, 
    QM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def insertWithRelated(modelOrObject: DeepPartialGraph[QM], options: InsertGraphOptions): QueryBuilder[
    QM, 
    QM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def insertWithRelated(modelsOrObjects: js.Array[DeepPartialGraph[QM]]): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def insertWithRelated(modelsOrObjects: js.Array[DeepPartialGraph[QM]], options: InsertGraphOptions): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def insertWithRelatedAndFetch(): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def insertWithRelatedAndFetch(modelOrObject: DeepPartialGraph[QM]): QueryBuilder[
    QM, 
    QM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def insertWithRelatedAndFetch(modelOrObject: DeepPartialGraph[QM], options: InsertGraphOptions): QueryBuilder[
    QM, 
    QM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def insertWithRelatedAndFetch(modelsOrObjects: js.Array[DeepPartialGraph[QM]]): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def insertWithRelatedAndFetch(modelsOrObjects: js.Array[DeepPartialGraph[QM]], options: InsertGraphOptions): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  /**
    * insertWithRelated is an alias for insertGraph.
    */
  @JSName("insertWithRelated")
  def insertWithRelated_This(): this.type = js.native
  @JSName("insert")
  def insert_This(): this.type = js.native
  def isDelete(): Boolean = js.native
  def isExecutable(): Boolean = js.native
  def isFind(): Boolean = js.native
  def isInsert(): Boolean = js.native
  def isRelate(): Boolean = js.native
  def isUnrelate(): Boolean = js.native
  def isUpdate(): Boolean = js.native
  def joinEager(relationExpression: RelationExpression): this.type = js.native
  def joinEager(relationExpression: RelationExpression, filters: FilterExpression[QM]): this.type = js.native
  def joinRelation[QM /* <: Model */](relationName: String): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def joinRelation[QM /* <: Model */](relationName: String, opt: RelationOptions): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def leftJoinRelation[QM /* <: Model */](relationName: String): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def leftJoinRelation[QM /* <: Model */](relationName: String, opt: RelationOptions): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def leftOuterJoinRelation[QM /* <: Model */](relationName: String): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def leftOuterJoinRelation[QM /* <: Model */](relationName: String, opt: RelationOptions): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  // We get `then` and `catch` by extending Promise
  def map[V, Result](mapper: BluebirdMapper[V, Result]): js.Promise[js.Array[Result]] = js.native
  def mergeContext(queryContext: js.Object): this.type = js.native
  def mergeEager(relationExpression: RelationExpression): this.type = js.native
  def mergeEager(relationExpression: RelationExpression, filters: FilterExpression[QM]): this.type = js.native
  def mergeJoinEager(relationExpression: RelationExpression): this.type = js.native
  def mergeJoinEager(relationExpression: RelationExpression, filters: FilterExpression[QM]): this.type = js.native
  def mergeNaiveEager(relationExpression: RelationExpression): this.type = js.native
  def mergeNaiveEager(relationExpression: RelationExpression, filters: FilterExpression[QM]): this.type = js.native
  def modelClass(): TypeofClassModel = js.native
  def modify(func: js.Function1[/* builder */ this.type, Unit]): this.type = js.native
  def modify(namedFilter: String): this.type = js.native
  def modifyEager[QM2 /* <: Model */](relationExpression: RelationExpression, modifier: String): QueryBuilder[QM, RM, RV] = js.native
  def modifyEager[QM2 /* <: Model */](relationExpression: RelationExpression, modifier: js.Array[String]): QueryBuilder[QM, RM, RV] = js.native
  def modifyEager[QM2 /* <: Model */](
    relationExpression: RelationExpression,
    modifier: js.Function1[
      /* builder */ QueryBuilder[
        QM2, 
        js.Array[QM2], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def naiveEager(relationExpression: RelationExpression): this.type = js.native
  def naiveEager(relationExpression: RelationExpression, filters: FilterExpression[QM]): this.type = js.native
  def nodeify(callback: NodeStyleCallback): js.Promise[QM] = js.native
  def omit(modelClass: TypeofClassModel, properties: js.Array[String]): this.type = js.native
  def omit(properties: js.Array[String]): this.type = js.native
  def onBuild(fn: js.Function1[/* builder */ this.type, Unit]): this.type = js.native
  def onBuildKnex(
    fn: js.Function2[
      /* knexBuilder */ typings.knex.knexMod.QueryBuilder[_, js.Array[SafePartial[_]]], 
      /* builder */ this.type, 
      Unit
    ]
  ): this.type = js.native
  def onError(fn: js.Function2[/* error */ Error, /* builder */ this.type, _]): this.type = js.native
  def orWhereJsonHasAll(fieldExpression: FieldExpression, keys: String): QueryBuilder[QM, RM, RV] = js.native
  def orWhereJsonHasAll(fieldExpression: FieldExpression, keys: js.Array[String]): QueryBuilder[QM, RM, RV] = js.native
  def orWhereJsonHasAny(fieldExpression: FieldExpression, keys: String): QueryBuilder[QM, RM, RV] = js.native
  def orWhereJsonHasAny(fieldExpression: FieldExpression, keys: js.Array[String]): QueryBuilder[QM, RM, RV] = js.native
  def orWhereJsonIsArray(fieldExpression: FieldExpression): QueryBuilder[QM, RM, RV] = js.native
  def orWhereJsonIsObject(fieldExpression: FieldExpression): QueryBuilder[QM, RM, RV] = js.native
  def orWhereJsonNotArray(fieldExpression: FieldExpression): QueryBuilder[QM, RM, RV] = js.native
  def orWhereJsonNotObject(fieldExpression: FieldExpression): QueryBuilder[QM, RM, RV] = js.native
  def orWhereJsonNotSubsetOf(fieldExpression: FieldExpression, jsonObjectOrFieldExpression: JsonObjectOrFieldExpression): QueryBuilder[QM, RM, RV] = js.native
  def orWhereJsonNotSupersetOf(fieldExpression: FieldExpression, jsonObjectOrFieldExpression: JsonObjectOrFieldExpression): QueryBuilder[QM, RM, RV] = js.native
  def orWhereJsonSubsetOf(fieldExpression: FieldExpression, jsonObjectOrFieldExpression: JsonObjectOrFieldExpression): QueryBuilder[QM, RM, RV] = js.native
  def orWhereJsonSupersetOf(fieldExpression: FieldExpression, jsonObjectOrFieldExpression: JsonObjectOrFieldExpression): QueryBuilder[QM, RM, RV] = js.native
  def outerJoinRelation[QM /* <: Model */](relationName: String): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def outerJoinRelation[QM /* <: Model */](relationName: String, opt: RelationOptions): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def page(page: Double, pageSize: Double): QueryBuilder[
    QM, 
    Page[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  /**
    * @return a Promise of the number of patched rows
    */
  def patch(modelOrObject: PartialUpdate[QM]): QueryBuilderYieldingCount[QM, RM] = js.native
  def patchAndFetch(modelOrObject: PartialUpdate[QM]): QueryBuilder[
    QM, 
    QM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def patchAndFetchById(idOrIds: IdOrIds, modelOrObject: PartialUpdate[QM]): QueryBuilder[
    QM, 
    QM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def pick(modelClass: TypeofClassModel, properties: js.Array[String]): this.type = js.native
  def pick(properties: js.Array[String]): this.type = js.native
  def range(): QueryBuilder[
    QM, 
    Page[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def range(start: Double, end: Double): QueryBuilder[
    QM, 
    Page[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def reflect(): js.Promise[QM] = js.native
  def reject(reason: js.Any): this.type = js.native
  def relate[RelatedM /* <: Model */](ids: js.Array[Partial[RelatedM]]): this.type = js.native
  def relate[RelatedM /* <: Model */](ids: IdOrIds): this.type = js.native
  def relate[RelatedM /* <: Model */](ids: Partial[RelatedM]): this.type = js.native
  def resolve(value: js.Any): this.type = js.native
  def resultSize(): js.Promise[Double] = js.native
  def `return`[V](returnValue: V): js.Promise[V] = js.native
  def returning(columns: String): QueryBuilder[
    QM, 
    RM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def returning(columns: js.Array[String]): QueryBuilder[
    QM, 
    RM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def rightJoinRelation[QM /* <: Model */](relationName: String): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def rightJoinRelation[QM /* <: Model */](relationName: String, opt: RelationOptions): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def rightOuterJoinRelation[QM /* <: Model */](relationName: String): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def rightOuterJoinRelation[QM /* <: Model */](relationName: String, opt: RelationOptions): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def runAfter(
    fn: js.Function2[
      /* result */ js.Any, 
      /* builder */ QueryBuilder[
        QM, 
        _, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      _
    ]
  ): this.type = js.native
  def runBefore(
    fn: js.Function2[
      /* result */ js.Any, 
      /* builder */ QueryBuilder[
        QM, 
        _, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      _
    ]
  ): this.type = js.native
  def skipUndefined(): this.type = js.native
  def tableNameFor(modelClass: ModelClass[_]): String = js.native
  def tableRefFor(modelClass: ModelClass[_]): String = js.native
  def timeout(ms: Double): this.type = js.native
  def timeout(ms: Double, options: TimeoutOptions): this.type = js.native
  def toSql(): String = js.native
  def traverse(modelClass: TypeofClassModel, traverser: TraverserFunction): this.type = js.native
  def unrelate(): this.type = js.native
  /**
    * @return a Promise of the number of updated rows
    */
  def update(modelOrObject: PartialUpdate[QM]): QueryBuilderYieldingCount[QM, RM] = js.native
  def updateAndFetch(modelOrObject: PartialUpdate[QM]): QueryBuilder[
    QM, 
    QM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def updateAndFetchById(id: Id, modelOrObject: PartialUpdate[QM]): QueryBuilder[
    QM, 
    QM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def upsertGraph(): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def upsertGraph(modelOrObject: DeepPartialGraph[QM]): QueryBuilder[
    QM, 
    QM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def upsertGraph(modelOrObject: DeepPartialGraph[QM], options: UpsertGraphOptions): QueryBuilder[
    QM, 
    QM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def upsertGraph(modelsOrObjects: js.Array[DeepPartialGraph[QM]]): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def upsertGraph(modelsOrObjects: js.Array[DeepPartialGraph[QM]], options: UpsertGraphOptions): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def upsertGraphAndFetch(): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def upsertGraphAndFetch(modelOrObject: DeepPartialGraph[QM]): QueryBuilder[
    QM, 
    QM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def upsertGraphAndFetch(modelOrObject: DeepPartialGraph[QM], options: UpsertGraphOptions): QueryBuilder[
    QM, 
    QM, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def upsertGraphAndFetch(modelsOrObjects: js.Array[DeepPartialGraph[QM]]): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def upsertGraphAndFetch(modelsOrObjects: js.Array[DeepPartialGraph[QM]], options: UpsertGraphOptions): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def whereComposite(column: js.Array[ColumnRef], operator: String, value: js.Array[Value]): this.type = js.native
  def whereComposite(
    column: js.Array[ColumnRef],
    operator: String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): this.type = js.native
  def whereComposite(column: js.Array[ColumnRef], value: js.Array[Value]): this.type = js.native
  def whereComposite(
    column: js.Array[ColumnRef],
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): this.type = js.native
  def whereComposite(
    column: ColumnRef,
    operator: String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): this.type = js.native
  def whereComposite(column: ColumnRef, operator: String, value: Value): this.type = js.native
  def whereComposite(
    column: ColumnRef,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): this.type = js.native
  def whereComposite(column: ColumnRef, value: Value): this.type = js.native
  def whereInComposite(column: js.Array[ColumnRef], values: js.Array[Value]): this.type = js.native
  def whereInComposite(
    column: js.Array[ColumnRef],
    values: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): this.type = js.native
  def whereInComposite(column: ColumnRef, values: js.Array[Value]): this.type = js.native
  def whereInComposite(
    column: ColumnRef,
    values: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): this.type = js.native
  def whereJsonHasAll(fieldExpression: FieldExpression, keys: String): QueryBuilder[QM, RM, RV] = js.native
  def whereJsonHasAll(fieldExpression: FieldExpression, keys: js.Array[String]): QueryBuilder[QM, RM, RV] = js.native
  def whereJsonHasAny(fieldExpression: FieldExpression, keys: String): QueryBuilder[QM, RM, RV] = js.native
  def whereJsonHasAny(fieldExpression: FieldExpression, keys: js.Array[String]): QueryBuilder[QM, RM, RV] = js.native
  def whereJsonIsArray(fieldExpression: FieldExpression): QueryBuilder[QM, RM, RV] = js.native
  def whereJsonIsObject(fieldExpression: FieldExpression): QueryBuilder[QM, RM, RV] = js.native
  def whereJsonNotArray(fieldExpression: FieldExpression): QueryBuilder[QM, RM, RV] = js.native
  def whereJsonNotObject(fieldExpression: FieldExpression): QueryBuilder[QM, RM, RV] = js.native
  def whereJsonNotSubsetOf(fieldExpression: FieldExpression, jsonObjectOrFieldExpression: JsonObjectOrFieldExpression): QueryBuilder[QM, RM, RV] = js.native
  def whereJsonNotSupersetOf(fieldExpression: FieldExpression, jsonObjectOrFieldExpression: JsonObjectOrFieldExpression): QueryBuilder[QM, RM, RV] = js.native
  def whereJsonSubsetOf(fieldExpression: FieldExpression, jsonObjectOrFieldExpression: JsonObjectOrFieldExpression): QueryBuilder[QM, RM, RV] = js.native
  def whereJsonSupersetOf(fieldExpression: FieldExpression, jsonObjectOrFieldExpression: JsonObjectOrFieldExpression): QueryBuilder[QM, RM, RV] = js.native
  // TODO: fromJS does not exist in current knex documentation: http://knexjs.org/#Builder-fromJS
  def withSchema(schemaName: String): this.type = js.native
}

