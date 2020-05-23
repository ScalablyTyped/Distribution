package typings.objection.mod

import org.scalablytyped.runtime.StringDictionary
import typings.knex.mod.ColumnInfo
import typings.knex.mod.JoinClause
import typings.objection.anon.As
import typings.objection.anon.TypeofModel
import typings.std.Promise
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("objection", "QueryBuilder")
@js.native
class QueryBuilder[M /* <: Model */, R] () extends Promise[R] {
  var ArrayQueryBuilderType: QueryBuilder[M, js.Array[M]] = js.native
  var ModelType: M = js.native
  var NumberQueryBuilderType: QueryBuilder[M, Double] = js.native
  var PageQueryBuilderType: QueryBuilder[M, Page[M]] = js.native
  var ResultType: R = js.native
  var SingleQueryBuilderType: QueryBuilder[M, M] = js.native
  @JSName("aliasFor")
  var aliasFor_Original: AliasForMethod[this.type] = js.native
  @JSName("alias")
  var alias_Original: OneArgMethod[String, this.type] = js.native
  // Deprecated
  @JSName("allowEager")
  var allowEager_Original: AllowGraphMethod[this.type] = js.native
  @JSName("allowGraph")
  var allowGraph_Original: AllowGraphMethod[this.type] = js.native
  // Deprecated
  @JSName("allowInsert")
  var allowInsert_Original: AllowGraphMethod[this.type] = js.native
  // Deprecated
  @JSName("allowUpsert")
  var allowUpsert_Original: AllowGraphMethod[this.type] = js.native
  @JSName("andHaving")
  var andHaving_Original: WhereMethod[this.type] = js.native
  @JSName("andWhereBetween")
  var andWhereBetween_Original: WhereBetweenMethod[this.type] = js.native
  @JSName("andWhereColumn")
  var andWhereColumn_Original: WhereColumnMethod[this.type] = js.native
  @JSName("andWhereNotBetween")
  var andWhereNotBetween_Original: WhereBetweenMethod[this.type] = js.native
  @JSName("andWhereNotColumn")
  var andWhereNotColumn_Original: WhereColumnMethod[this.type] = js.native
  @JSName("andWhereNot")
  var andWhereNot_Original: WhereMethod[this.type] = js.native
  @JSName("andWhereRaw")
  var andWhereRaw_Original: WhereRawMethod[this.type] = js.native
  @JSName("andWhere")
  var andWhere_Original: WhereMethod[this.type] = js.native
  // Deprecated
  @JSName("applyFilter")
  var applyFilter_Original: ApplyFilterMethod[this.type] = js.native
  @JSName("as")
  var as_Original: AsMethod[this.type] = js.native
  @JSName("avgDistinct")
  var avgDistinct_Original: AggregateMethod[this.type] = js.native
  @JSName("avg")
  var avg_Original: AggregateMethod[this.type] = js.native
  @JSName("clearAllowGraph")
  var clearAllowGraph_Original: IdentityMethod[this.type] = js.native
  @JSName("clearContext")
  var clearContext_Original: ClearContextMethod[this.type] = js.native
  // Deprecated
  @JSName("clearEager")
  var clearEager_Original: IdentityMethod[this.type] = js.native
  @JSName("clearOrder")
  var clearOrder_Original: IdentityMethod[this.type] = js.native
  @JSName("clearSelect")
  var clearSelect_Original: IdentityMethod[this.type] = js.native
  @JSName("clearWhere")
  var clearWhere_Original: IdentityMethod[this.type] = js.native
  @JSName("clearWithGraph")
  var clearWithGraph_Original: IdentityMethod[this.type] = js.native
  @JSName("clear")
  var clear_Original: ClearMethod[this.type] = js.native
  @JSName("columnInfo")
  var columnInfo_Original: ColumnInfoMethod[this.type] = js.native
  @JSName("column")
  var column_Original: SelectMethod[this.type] = js.native
  @JSName("columns")
  var columns_Original: SelectMethod[this.type] = js.native
  @JSName("connection")
  var connection_Original: OneArgMethod[TransactionOrKnex, this.type] = js.native
  @JSName("context")
  var context_Original: ContextMethod[this.type] = js.native
  @JSName("countDistinct")
  var countDistinct_Original: CountMethod[this.type] = js.native
  @JSName("count")
  var count_Original: CountMethod[this.type] = js.native
  @JSName("crossJoin")
  var crossJoin_Original: JoinMethod[this.type] = js.native
  @JSName("debug")
  var debug_Original: IdentityMethod[this.type] = js.native
  @JSName("decrement")
  var decrement_Original: IncrementDecrementMethod[this.type] = js.native
  @JSName("distinct")
  var distinct_Original: SelectMethod[this.type] = js.native
  // Deprecated
  @JSName("eagerAlgorithm")
  var eagerAlgorithm_Original: EagerAlgorithmMethod[this.type] = js.native
  // Deprecated
  @JSName("eagerOptions")
  var eagerOptions_Original: EagerOptionsMethod[this.type] = js.native
  // Deprecated
  @JSName("eager")
  var eager_Original: EagerMethod[this.type] = js.native
  // Deprecated
  @JSName("filterEager")
  var filterEager_Original: ModifyGraphMethod[this.type] = js.native
  @JSName("findOne")
  var findOne_Original: WhereMethod[SingleQueryBuilder[this.type]] = js.native
  @JSName("first")
  var first_Original: FirstMethod = js.native
  @JSName("forShare")
  var forShare_Original: IdentityMethod[this.type] = js.native
  @JSName("forUpdate")
  var forUpdate_Original: IdentityMethod[this.type] = js.native
  @JSName("from")
  var from_Original: FromMethod[this.type] = js.native
  @JSName("fullOuterJoinRelated")
  var fullOuterJoinRelated_Original: JoinRelatedMethod[this.type] = js.native
  // Deprecated
  @JSName("fullOuterJoinRelation")
  var fullOuterJoinRelation_Original: JoinRelatedMethod[this.type] = js.native
  @JSName("fullOuterJoin")
  var fullOuterJoin_Original: JoinMethod[this.type] = js.native
  @JSName("graphExpressionObject")
  var graphExpressionObject_Original: GraphExpressionObjectMethod[this.type] = js.native
  @JSName("groupByRaw")
  var groupByRaw_Original: RawInterface[this.type] = js.native
  @JSName("groupBy")
  var groupBy_Original: GroupByMethod[this.type] = js.native
  // Deprecated
  @JSName("hasEager")
  var hasEager_Original: BooleanReturningMethod = js.native
  @JSName("hasSelects")
  var hasSelects_Original: BooleanReturningMethod = js.native
  @JSName("hasWheres")
  var hasWheres_Original: BooleanReturningMethod = js.native
  @JSName("hasWithGraph")
  var hasWithGraph_Original: BooleanReturningMethod = js.native
  @JSName("has")
  var has_Original: HasMethod = js.native
  @JSName("havingBetween")
  var havingBetween_Original: WhereMethod[this.type] = js.native
  @JSName("havingExists")
  var havingExists_Original: WhereMethod[this.type] = js.native
  @JSName("havingIn")
  var havingIn_Original: WhereMethod[this.type] = js.native
  @JSName("havingNotBetween")
  var havingNotBetween_Original: WhereMethod[this.type] = js.native
  @JSName("havingNotExists")
  var havingNotExists_Original: WhereMethod[this.type] = js.native
  @JSName("havingNotIn")
  var havingNotIn_Original: WhereMethod[this.type] = js.native
  @JSName("havingNotNull")
  var havingNotNull_Original: WhereMethod[this.type] = js.native
  @JSName("havingNull")
  var havingNull_Original: WhereMethod[this.type] = js.native
  @JSName("havingRaw")
  var havingRaw_Original: WhereMethod[this.type] = js.native
  @JSName("havingWrapped")
  var havingWrapped_Original: WhereWrappedMethod[this.type] = js.native
  @JSName("having")
  var having_Original: WhereMethod[this.type] = js.native
  @JSName("increment")
  var increment_Original: IncrementDecrementMethod[this.type] = js.native
  @JSName("innerJoinRelated")
  var innerJoinRelated_Original: JoinRelatedMethod[this.type] = js.native
  // Deprecated
  @JSName("innerJoinRelation")
  var innerJoinRelation_Original: JoinRelatedMethod[this.type] = js.native
  @JSName("innerJoin")
  var innerJoin_Original: JoinMethod[this.type] = js.native
  @JSName("insertGraphAndFetch")
  var insertGraphAndFetch_Original: InsertGraphMethod[M] = js.native
  @JSName("insertGraph")
  var insertGraph_Original: InsertGraphMethod[M] = js.native
  @JSName("insertWithRelatedAndFetch")
  var insertWithRelatedAndFetch_Original: InsertGraphMethod[M] = js.native
  @JSName("insertWithRelated")
  var insertWithRelated_Original: InsertGraphMethod[M] = js.native
  @JSName("intersect")
  var intersect_Original: SetOperationsMethod[this.type] = js.native
  @JSName("into")
  var into_Original: FromMethod[this.type] = js.native
  @JSName("isDelete")
  var isDelete_Original: BooleanReturningMethod = js.native
  @JSName("isExecutable")
  var isExecutable_Original: BooleanReturningMethod = js.native
  @JSName("isFind")
  var isFind_Original: BooleanReturningMethod = js.native
  @JSName("isInsert")
  var isInsert_Original: BooleanReturningMethod = js.native
  @JSName("isInternal")
  var isInternal_Original: BooleanReturningMethod = js.native
  @JSName("isRelate")
  var isRelate_Original: BooleanReturningMethod = js.native
  @JSName("isUnrelate")
  var isUnrelate_Original: BooleanReturningMethod = js.native
  @JSName("isUpdate")
  var isUpdate_Original: BooleanReturningMethod = js.native
  // Deprecated
  @JSName("joinEager")
  var joinEager_Original: EagerMethod[this.type] = js.native
  @JSName("joinRaw")
  var joinRaw_Original: JoinRawMethod[this.type] = js.native
  @JSName("joinRelated")
  var joinRelated_Original: JoinRelatedMethod[this.type] = js.native
  // Deprecated
  @JSName("joinRelation")
  var joinRelation_Original: JoinRelatedMethod[this.type] = js.native
  @JSName("join")
  var join_Original: JoinMethod[this.type] = js.native
  @JSName("leftJoinRelated")
  var leftJoinRelated_Original: JoinRelatedMethod[this.type] = js.native
  // Deprecated
  @JSName("leftJoinRelation")
  var leftJoinRelation_Original: JoinRelatedMethod[this.type] = js.native
  @JSName("leftJoin")
  var leftJoin_Original: JoinMethod[this.type] = js.native
  @JSName("leftOuterJoinRelated")
  var leftOuterJoinRelated_Original: JoinRelatedMethod[this.type] = js.native
  // Deprecated
  @JSName("leftOuterJoinRelation")
  var leftOuterJoinRelation_Original: JoinRelatedMethod[this.type] = js.native
  @JSName("leftOuterJoin")
  var leftOuterJoin_Original: JoinMethod[this.type] = js.native
  @JSName("max")
  var max_Original: AggregateMethod[this.type] = js.native
  // Deprecated
  @JSName("mergeAllowEager")
  var mergeAllowEager_Original: AllowGraphMethod[this.type] = js.native
  // Deprecated
  @JSName("mergeContext")
  var mergeContext_Original: ContextMethod[this.type] = js.native
  // Deprecated
  @JSName("mergeEager")
  var mergeEager_Original: EagerMethod[this.type] = js.native
  // Deprecated
  @JSName("mergeJoinEager")
  var mergeJoinEager_Original: EagerMethod[this.type] = js.native
  // Deprecated
  @JSName("mergeNaiveEager")
  var mergeNaiveEager_Original: EagerMethod[this.type] = js.native
  @JSName("min")
  var min_Original: AggregateMethod[this.type] = js.native
  @JSName("modelClass")
  var modelClass_Original: ModelClassMethod[M] = js.native
  @JSName("modifiers")
  var modifiers_Original: ModifiersMethod[this.type] = js.native
  // Deprecated
  @JSName("modifyEager")
  var modifyEager_Original: ModifyGraphMethod[this.type] = js.native
  @JSName("modifyGraph")
  var modifyGraph_Original: ModifyGraphMethod[this.type] = js.native
  @JSName("modify")
  var modify_Original: ModifyMethod[this.type] = js.native
  // Deprecated
  @JSName("naiveEager")
  var naiveEager_Original: EagerMethod[this.type] = js.native
  @JSName("onBuildKnex")
  var onBuildKnex_Original: OnBuildKnexMethod[this.type] = js.native
  @JSName("onBuild")
  var onBuild_Original: OnBuildMethod[this.type] = js.native
  @JSName("onError")
  var onError_Original: OnErrorMethod[this.type] = js.native
  @JSName("orHavingBetween")
  var orHavingBetween_Original: WhereMethod[this.type] = js.native
  @JSName("orHavingExists")
  var orHavingExists_Original: WhereMethod[this.type] = js.native
  @JSName("orHavingIn")
  var orHavingIn_Original: WhereMethod[this.type] = js.native
  @JSName("orHavingNotBetween")
  var orHavingNotBetween_Original: WhereMethod[this.type] = js.native
  @JSName("orHavingNotExists")
  var orHavingNotExists_Original: WhereMethod[this.type] = js.native
  @JSName("orHavingNotIn")
  var orHavingNotIn_Original: WhereMethod[this.type] = js.native
  @JSName("orHavingNotNull")
  var orHavingNotNull_Original: WhereMethod[this.type] = js.native
  @JSName("orHavingNull")
  var orHavingNull_Original: WhereMethod[this.type] = js.native
  @JSName("orHavingRaw")
  var orHavingRaw_Original: WhereMethod[this.type] = js.native
  @JSName("orHaving")
  var orHaving_Original: WhereMethod[this.type] = js.native
  @JSName("orWhereBetween")
  var orWhereBetween_Original: WhereBetweenMethod[this.type] = js.native
  @JSName("orWhereColumn")
  var orWhereColumn_Original: WhereColumnMethod[this.type] = js.native
  @JSName("orWhereExists")
  var orWhereExists_Original: WhereExistsMethod[this.type] = js.native
  @JSName("orWhereIn")
  var orWhereIn_Original: WhereInMethod[this.type] = js.native
  @JSName("orWhereJsonHasAll")
  var orWhereJsonHasAll_Original: WhereJsonExpressionMethod[this.type] = js.native
  @JSName("orWhereJsonHasAny")
  var orWhereJsonHasAny_Original: WhereJsonExpressionMethod[this.type] = js.native
  @JSName("orWhereJsonIsArray")
  var orWhereJsonIsArray_Original: WhereFieldExpressionMethod[this.type] = js.native
  @JSName("orWhereJsonIsObject")
  var orWhereJsonIsObject_Original: WhereFieldExpressionMethod[this.type] = js.native
  @JSName("orWhereJsonNotArray")
  var orWhereJsonNotArray_Original: WhereFieldExpressionMethod[this.type] = js.native
  @JSName("orWhereJsonNotObject")
  var orWhereJsonNotObject_Original: WhereFieldExpressionMethod[this.type] = js.native
  @JSName("orWhereJsonNotSubsetOf")
  var orWhereJsonNotSubsetOf_Original: WhereJsonMethod[this.type] = js.native
  @JSName("orWhereJsonNotSupersetOf")
  var orWhereJsonNotSupersetOf_Original: WhereJsonMethod[this.type] = js.native
  @JSName("orWhereJsonSubsetOf")
  var orWhereJsonSubsetOf_Original: WhereJsonMethod[this.type] = js.native
  @JSName("orWhereJsonSupersetOf")
  var orWhereJsonSupersetOf_Original: WhereJsonMethod[this.type] = js.native
  @JSName("orWhereNotBetween")
  var orWhereNotBetween_Original: WhereBetweenMethod[this.type] = js.native
  @JSName("orWhereNotColumn")
  var orWhereNotColumn_Original: WhereColumnMethod[this.type] = js.native
  @JSName("orWhereNotExists")
  var orWhereNotExists_Original: WhereExistsMethod[this.type] = js.native
  @JSName("orWhereNotIn")
  var orWhereNotIn_Original: WhereInMethod[this.type] = js.native
  @JSName("orWhereNotNull")
  var orWhereNotNull_Original: WhereNullMethod[this.type] = js.native
  @JSName("orWhereNot")
  var orWhereNot_Original: WhereMethod[this.type] = js.native
  @JSName("orWhereNull")
  var orWhereNull_Original: WhereNullMethod[this.type] = js.native
  @JSName("orWhereRaw")
  var orWhereRaw_Original: WhereRawMethod[this.type] = js.native
  @JSName("orWhere")
  var orWhere_Original: WhereMethod[this.type] = js.native
  @JSName("orderByRaw")
  var orderByRaw_Original: OrderByRawMethod[this.type] = js.native
  @JSName("orderBy")
  var orderBy_Original: OrderByMethod[this.type] = js.native
  @JSName("outerJoinRelated")
  var outerJoinRelated_Original: JoinRelatedMethod[this.type] = js.native
  // Deprecated
  @JSName("outerJoinRelation")
  var outerJoinRelation_Original: JoinRelatedMethod[this.type] = js.native
  @JSName("outerJoin")
  var outerJoin_Original: JoinMethod[this.type] = js.native
  @JSName("reject")
  var reject_Original: OneArgMethod[_, this.type] = js.native
  @JSName("resolve")
  var resolve_Original: OneArgMethod[_, this.type] = js.native
  @JSName("returning")
  var returning_Original: ReturningMethod = js.native
  @JSName("rightJoinRelated")
  var rightJoinRelated_Original: JoinRelatedMethod[this.type] = js.native
  // Deprecated
  @JSName("rightJoinRelation")
  var rightJoinRelation_Original: JoinRelatedMethod[this.type] = js.native
  @JSName("rightJoin")
  var rightJoin_Original: JoinMethod[this.type] = js.native
  @JSName("rightOuterJoinRelated")
  var rightOuterJoinRelated_Original: JoinRelatedMethod[this.type] = js.native
  // Deprecated
  @JSName("rightOuterJoinRelation")
  var rightOuterJoinRelation_Original: JoinRelatedMethod[this.type] = js.native
  @JSName("rightOuterJoin")
  var rightOuterJoin_Original: JoinMethod[this.type] = js.native
  @JSName("runAfter")
  var runAfter_Original: RunAfterMethod[this.type] = js.native
  @JSName("runBefore")
  var runBefore_Original: RunBeforeMethod[this.type] = js.native
  @JSName("select")
  var select_Original: SelectMethod[this.type] = js.native
  @JSName("skipUndefined")
  var skipUndefined_Original: IdentityMethod[this.type] = js.native
  @JSName("sumDistinct")
  var sumDistinct_Original: AggregateMethod[this.type] = js.native
  @JSName("sum")
  var sum_Original: AggregateMethod[this.type] = js.native
  @JSName("tableNameFor")
  var tableNameFor_Original: TableRefForMethod = js.native
  @JSName("tableRefFor")
  var tableRefFor_Original: TableRefForMethod = js.native
  @JSName("table")
  var table_Original: FromMethod[this.type] = js.native
  @JSName("throwIfNotFound")
  var throwIfNotFound_Original: IdentityMethod[this.type] = js.native
  @JSName("timeout")
  var timeout_Original: TimeoutMethod[this.type] = js.native
  @JSName("transacting")
  var transacting_Original: OneArgMethod[TransactionOrKnex, this.type] = js.native
  @JSName("unionAll")
  var unionAll_Original: UnionMethod[this.type] = js.native
  @JSName("union")
  var union_Original: UnionMethod[this.type] = js.native
  @JSName("upsertGraphAndFetch")
  var upsertGraphAndFetch_Original: UpsertGraphMethod[M] = js.native
  @JSName("upsertGraph")
  var upsertGraph_Original: UpsertGraphMethod[M] = js.native
  @JSName("whereBetween")
  var whereBetween_Original: WhereBetweenMethod[this.type] = js.native
  @JSName("whereColumn")
  var whereColumn_Original: WhereColumnMethod[this.type] = js.native
  @JSName("whereComposite")
  var whereComposite_Original: WhereCompositeMethod[this.type] = js.native
  @JSName("whereExists")
  var whereExists_Original: WhereExistsMethod[this.type] = js.native
  @JSName("whereInComposite")
  var whereInComposite_Original: WhereInCompositeMethod[this.type] = js.native
  @JSName("whereIn")
  var whereIn_Original: WhereInMethod[this.type] = js.native
  @JSName("whereJsonHasAll")
  var whereJsonHasAll_Original: WhereJsonExpressionMethod[this.type] = js.native
  @JSName("whereJsonHasAny")
  var whereJsonHasAny_Original: WhereJsonExpressionMethod[this.type] = js.native
  @JSName("whereJsonIsArray")
  var whereJsonIsArray_Original: WhereFieldExpressionMethod[this.type] = js.native
  @JSName("whereJsonIsObject")
  var whereJsonIsObject_Original: WhereFieldExpressionMethod[this.type] = js.native
  @JSName("whereJsonNotArray")
  var whereJsonNotArray_Original: WhereFieldExpressionMethod[this.type] = js.native
  @JSName("whereJsonNotObject")
  var whereJsonNotObject_Original: WhereFieldExpressionMethod[this.type] = js.native
  @JSName("whereJsonNotSubsetOf")
  var whereJsonNotSubsetOf_Original: WhereJsonMethod[this.type] = js.native
  @JSName("whereJsonNotSupersetOf")
  var whereJsonNotSupersetOf_Original: WhereJsonMethod[this.type] = js.native
  @JSName("whereJsonSubsetOf")
  var whereJsonSubsetOf_Original: WhereJsonMethod[this.type] = js.native
  @JSName("whereJsonSupersetOf")
  var whereJsonSupersetOf_Original: WhereJsonMethod[this.type] = js.native
  @JSName("whereNotBetween")
  var whereNotBetween_Original: WhereBetweenMethod[this.type] = js.native
  @JSName("whereNotColumn")
  var whereNotColumn_Original: WhereColumnMethod[this.type] = js.native
  @JSName("whereNotExists")
  var whereNotExists_Original: WhereExistsMethod[this.type] = js.native
  @JSName("whereNotIn")
  var whereNotIn_Original: WhereInMethod[this.type] = js.native
  @JSName("whereNotNull")
  var whereNotNull_Original: WhereNullMethod[this.type] = js.native
  @JSName("whereNot")
  var whereNot_Original: WhereMethod[this.type] = js.native
  @JSName("whereNull")
  var whereNull_Original: WhereNullMethod[this.type] = js.native
  @JSName("whereRaw")
  var whereRaw_Original: WhereRawMethod[this.type] = js.native
  @JSName("whereWrapped")
  var whereWrapped_Original: WhereWrappedMethod[this.type] = js.native
  @JSName("where")
  var where_Original: WhereMethod[this.type] = js.native
  @JSName("withSchema")
  var withSchema_Original: OneArgMethod[String, this.type] = js.native
  @JSName("withWrapped")
  var withWrapped_Original: WithMethod[this.type] = js.native
  @JSName("with")
  var with_Original: WithMethod[this.type] = js.native
  def alias(arg: String): this.type = js.native
  def aliasFor(modelClassOrTableName: String, alias: String): this.type = js.native
  def aliasFor(modelClassOrTableName: AnyModelConstructor, alias: String): this.type = js.native
  // Deprecated
  def allowEager(expr: RelationExpression[ModelType[this.type]]): this.type = js.native
  def allowGraph(expr: RelationExpression[ModelType[this.type]]): this.type = js.native
  // Deprecated
  def allowInsert(expr: RelationExpression[ModelType[this.type]]): this.type = js.native
  // Deprecated
  def allowUpsert(expr: RelationExpression[ModelType[this.type]]): this.type = js.native
  def andHaving(cb: CallbackVoid[this.type]): this.type = js.native
  def andHaving(col: ColumnRef, expr: Expression[PrimitiveValue]): this.type = js.native
  def andHaving(col: ColumnRef, op: Operator, expr: Expression[PrimitiveValue]): this.type = js.native
  def andHaving(condition: Boolean): this.type = js.native
  // We must allow any keys in the object. The previous type
  // is kind of useless, but maybe one day vscode and other
  // tools can autocomplete using it.
  def andHaving(obj: js.Object): this.type = js.native
  def andHaving(obj: PartialModelObject[ModelType[this.type]]): this.type = js.native
  def andHaving(raw: Raw_): this.type = js.native
  def andHaving[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], expr: Expression[PrimitiveValue]): this.type = js.native
  // These must come first so that we get autocomplete.
  def andHaving[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], op: Operator, expr: Expression[PrimitiveValue]): this.type = js.native
  def andHaving[QBA /* <: AnyQueryBuilder */](qb: QBA): this.type = js.native
  def andWhere(cb: CallbackVoid[this.type]): this.type = js.native
  def andWhere(col: ColumnRef, expr: Expression[PrimitiveValue]): this.type = js.native
  def andWhere(col: ColumnRef, op: Operator, expr: Expression[PrimitiveValue]): this.type = js.native
  def andWhere(condition: Boolean): this.type = js.native
  // We must allow any keys in the object. The previous type
  // is kind of useless, but maybe one day vscode and other
  // tools can autocomplete using it.
  def andWhere(obj: js.Object): this.type = js.native
  def andWhere(obj: PartialModelObject[ModelType[this.type]]): this.type = js.native
  def andWhere(raw: Raw_): this.type = js.native
  def andWhere[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], expr: Expression[PrimitiveValue]): this.type = js.native
  // These must come first so that we get autocomplete.
  def andWhere[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], op: Operator, expr: Expression[PrimitiveValue]): this.type = js.native
  def andWhere[QBA /* <: AnyQueryBuilder */](qb: QBA): this.type = js.native
  def andWhereBetween(column: ColumnRef, range: js.Tuple2[Expression[PrimitiveValue], Expression[PrimitiveValue]]): this.type = js.native
  def andWhereColumn(col1: ColumnRef, col2: ColumnRef): this.type = js.native
  def andWhereColumn(col1: ColumnRef, op: Operator, col2: ColumnRef): this.type = js.native
  def andWhereColumn[QBP /* <: this.type */](col1: ModelProps[ModelType[QBP]], col2: ColumnRef): this.type = js.native
  // These must come first so that we get autocomplete.
  def andWhereColumn[QBP /* <: this.type */](col1: ModelProps[ModelType[QBP]], op: Operator, col2: ColumnRef): this.type = js.native
  def andWhereNot(cb: CallbackVoid[this.type]): this.type = js.native
  def andWhereNot(col: ColumnRef, expr: Expression[PrimitiveValue]): this.type = js.native
  def andWhereNot(col: ColumnRef, op: Operator, expr: Expression[PrimitiveValue]): this.type = js.native
  def andWhereNot(condition: Boolean): this.type = js.native
  // We must allow any keys in the object. The previous type
  // is kind of useless, but maybe one day vscode and other
  // tools can autocomplete using it.
  def andWhereNot(obj: js.Object): this.type = js.native
  def andWhereNot(obj: PartialModelObject[ModelType[this.type]]): this.type = js.native
  def andWhereNot(raw: Raw_): this.type = js.native
  def andWhereNot[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], expr: Expression[PrimitiveValue]): this.type = js.native
  // These must come first so that we get autocomplete.
  def andWhereNot[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], op: Operator, expr: Expression[PrimitiveValue]): this.type = js.native
  def andWhereNot[QBA /* <: AnyQueryBuilder */](qb: QBA): this.type = js.native
  def andWhereNotBetween(column: ColumnRef, range: js.Tuple2[Expression[PrimitiveValue], Expression[PrimitiveValue]]): this.type = js.native
  def andWhereNotColumn(col1: ColumnRef, col2: ColumnRef): this.type = js.native
  def andWhereNotColumn(col1: ColumnRef, op: Operator, col2: ColumnRef): this.type = js.native
  def andWhereNotColumn[QBP /* <: this.type */](col1: ModelProps[ModelType[QBP]], col2: ColumnRef): this.type = js.native
  // These must come first so that we get autocomplete.
  def andWhereNotColumn[QBP /* <: this.type */](col1: ModelProps[ModelType[QBP]], op: Operator, col2: ColumnRef): this.type = js.native
  def andWhereRaw(sql: String, bindings: js.Any*): this.type = js.native
  // Deprecated
  def applyFilter(filters: String*): this.type = js.native
  def as(alias: String): this.type = js.native
  def avg(column: ColumnRef): this.type = js.native
  def avgDistinct(column: ColumnRef): this.type = js.native
  def castTo[MC /* <: Model */](modelClass: ModelConstructor[MC]): QueryBuilderType[MC] = js.native
  def clear(selector: String): this.type = js.native
  def clear(selector: RegExp): this.type = js.native
  def clearAllowGraph(): this.type = js.native
  def clearContext(): this.type = js.native
  // Deprecated
  def clearEager(): this.type = js.native
  def clearOrder(): this.type = js.native
  def clearSelect(): this.type = js.native
  def clearWhere(): this.type = js.native
  def clearWithGraph(): this.type = js.native
  // These must come first so that we get autocomplete.
  // Allows things like `select(1)`, not sure if we should be more specific here?
  def column[QBP /* <: this.type */](columns: (js.Any | ModelProps[ModelType[QBP]] | Selection[QBP])*): this.type = js.native
  def column[QBP /* <: this.type */](columns: js.Array[ModelProps[ModelType[QBP]] | Selection[QBP]]): this.type = js.native
  def columnInfo(): js.Promise[ColumnInfo] = js.native
  // These must come first so that we get autocomplete.
  // Allows things like `select(1)`, not sure if we should be more specific here?
  def columns[QBP /* <: this.type */](columns: (js.Any | ModelProps[ModelType[QBP]] | Selection[QBP])*): this.type = js.native
  def columns[QBP /* <: this.type */](columns: js.Array[ModelProps[ModelType[QBP]] | Selection[QBP]]): this.type = js.native
  def connection(arg: TransactionOrKnex): this.type = js.native
  def context(): QueryContext = js.native
  def context(context: js.Object): this.type = js.native
  def count(): this.type = js.native
  def count(aliasToColumnDict: StringDictionary[String | js.Array[String]]): this.type = js.native
  def count(columns: ColumnRef*): this.type = js.native
  def count(column: ColumnRef): this.type = js.native
  def count(column: ColumnRef, options: As): this.type = js.native
  def countDistinct(): this.type = js.native
  def countDistinct(aliasToColumnDict: StringDictionary[String | js.Array[String]]): this.type = js.native
  def countDistinct(columns: ColumnRef*): this.type = js.native
  def countDistinct(column: ColumnRef): this.type = js.native
  def countDistinct(column: ColumnRef, options: As): this.type = js.native
  def crossJoin(raw: Raw_): this.type = js.native
  def crossJoin(table: TableRef, cb: CallbackVoid[JoinClause]): this.type = js.native
  def crossJoin(table: TableRef, leftCol: ColumnRef, op: Operator, rightCol: ColumnRef): this.type = js.native
  def crossJoin(table: TableRef, leftCol: ColumnRef, rightCol: ColumnRef): this.type = js.native
  def crossJoin(table: TableRef, raw: Raw_): this.type = js.native
  def debug(): this.type = js.native
  def decrement(column: String): this.type = js.native
  def decrement(column: String, amount: Double): this.type = js.native
  def del(): NumberQueryBuilder[this.type] = js.native
  def delete(): NumberQueryBuilder[this.type] = js.native
  def deleteById(id: MaybeCompositeId): NumberQueryBuilder[this.type] = js.native
  // These must come first so that we get autocomplete.
  // Allows things like `select(1)`, not sure if we should be more specific here?
  def distinct[QBP /* <: this.type */](columns: (js.Any | ModelProps[ModelType[QBP]] | Selection[QBP])*): this.type = js.native
  def distinct[QBP /* <: this.type */](columns: js.Array[ModelProps[ModelType[QBP]] | Selection[QBP]]): this.type = js.native
  // Deprecated
  def eager(expr: RelationExpression[ModelType[this.type]]): this.type = js.native
  def eager(expr: RelationExpression[ModelType[this.type]], modifiers: Modifiers[AnyQueryBuilder]): this.type = js.native
  // Deprecated
  def eagerAlgorithm(algorithm: EagerAlgorithm): this.type = js.native
  // Deprecated
  def eagerOptions(options: EagerOptions): this.type = js.native
  def execute(): js.Promise[R] = js.native
  // Deprecated
  def filterEager[M /* <: Model */](expr: RelationExpression[ModelType[this.type]], modifier: Modifier[QueryBuilderType[M]]): this.type = js.native
  def findById(id: MaybeCompositeId): SingleQueryBuilder[this.type] = js.native
  def findByIds(ids: js.Array[MaybeCompositeId]): this.type = js.native
  def findOne(cb: CallbackVoid[SingleQueryBuilder[this.type]]): SingleQueryBuilder[this.type] = js.native
  def findOne(col: ColumnRef, expr: Expression[PrimitiveValue]): SingleQueryBuilder[this.type] = js.native
  def findOne(col: ColumnRef, op: Operator, expr: Expression[PrimitiveValue]): SingleQueryBuilder[this.type] = js.native
  def findOne(condition: Boolean): SingleQueryBuilder[this.type] = js.native
  // We must allow any keys in the object. The previous type
  // is kind of useless, but maybe one day vscode and other
  // tools can autocomplete using it.
  def findOne(obj: js.Object): SingleQueryBuilder[this.type] = js.native
  def findOne(obj: PartialModelObject[ModelType[SingleQueryBuilder[this.type]]]): SingleQueryBuilder[this.type] = js.native
  def findOne(raw: Raw_): SingleQueryBuilder[this.type] = js.native
  def findOne[QBP /* <: SingleQueryBuilder[this.type] */](col: ModelProps[ModelType[QBP]], expr: Expression[PrimitiveValue]): SingleQueryBuilder[this.type] = js.native
  // These must come first so that we get autocomplete.
  def findOne[QBP /* <: SingleQueryBuilder[this.type] */](col: ModelProps[ModelType[QBP]], op: Operator, expr: Expression[PrimitiveValue]): SingleQueryBuilder[this.type] = js.native
  def findOne[QBA /* <: AnyQueryBuilder */](qb: QBA): SingleQueryBuilder[this.type] = js.native
  def first[QB /* <: AnyQueryBuilder */](): QB | SingleQueryBuilder[QB] = js.native
  def `for`(ids: js.Array[ForIdValue]): this.type = js.native
  def `for`(ids: ForIdValue): this.type = js.native
  def forShare(): this.type = js.native
  def forUpdate(): this.type = js.native
  def from(cb: CallbackVoid[this.type]): this.type = js.native
  def from(raw: Raw_): this.type = js.native
  def from(table: String): this.type = js.native
  def from[QBP /* <: AnyQueryBuilder */](qb: QBP): this.type = js.native
  def fullOuterJoin(raw: Raw_): this.type = js.native
  def fullOuterJoin(table: TableRef, cb: CallbackVoid[JoinClause]): this.type = js.native
  def fullOuterJoin(table: TableRef, leftCol: ColumnRef, op: Operator, rightCol: ColumnRef): this.type = js.native
  def fullOuterJoin(table: TableRef, leftCol: ColumnRef, rightCol: ColumnRef): this.type = js.native
  def fullOuterJoin(table: TableRef, raw: Raw_): this.type = js.native
  def fullOuterJoinRelated(expr: RelationExpression[ModelType[this.type]]): this.type = js.native
  def fullOuterJoinRelated(expr: RelationExpression[ModelType[this.type]], opt: JoinRelatedOptions): this.type = js.native
  // Deprecated
  def fullOuterJoinRelation(expr: RelationExpression[ModelType[this.type]]): this.type = js.native
  def fullOuterJoinRelation(expr: RelationExpression[ModelType[this.type]], opt: JoinRelatedOptions): this.type = js.native
  def graphExpressionObject(): js.Any = js.native
  def groupBy(columns: ColumnRef*): this.type = js.native
  def groupBy(columns: js.Array[ColumnRef]): this.type = js.native
  def groupByRaw(sql: String, bindings: js.Any*): this.type = js.native
  def has(selector: String): Boolean = js.native
  def has(selector: RegExp): Boolean = js.native
  // Deprecated
  def hasEager(): Boolean = js.native
  def hasSelects(): Boolean = js.native
  def hasWheres(): Boolean = js.native
  def hasWithGraph(): Boolean = js.native
  def having(cb: CallbackVoid[this.type]): this.type = js.native
  def having(col: ColumnRef, expr: Expression[PrimitiveValue]): this.type = js.native
  def having(col: ColumnRef, op: Operator, expr: Expression[PrimitiveValue]): this.type = js.native
  def having(condition: Boolean): this.type = js.native
  // We must allow any keys in the object. The previous type
  // is kind of useless, but maybe one day vscode and other
  // tools can autocomplete using it.
  def having(obj: js.Object): this.type = js.native
  def having(obj: PartialModelObject[ModelType[this.type]]): this.type = js.native
  def having(raw: Raw_): this.type = js.native
  def having[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], expr: Expression[PrimitiveValue]): this.type = js.native
  // These must come first so that we get autocomplete.
  def having[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], op: Operator, expr: Expression[PrimitiveValue]): this.type = js.native
  def having[QBA /* <: AnyQueryBuilder */](qb: QBA): this.type = js.native
  def havingBetween(cb: CallbackVoid[this.type]): this.type = js.native
  def havingBetween(col: ColumnRef, expr: Expression[PrimitiveValue]): this.type = js.native
  def havingBetween(col: ColumnRef, op: Operator, expr: Expression[PrimitiveValue]): this.type = js.native
  def havingBetween(condition: Boolean): this.type = js.native
  // We must allow any keys in the object. The previous type
  // is kind of useless, but maybe one day vscode and other
  // tools can autocomplete using it.
  def havingBetween(obj: js.Object): this.type = js.native
  def havingBetween(obj: PartialModelObject[ModelType[this.type]]): this.type = js.native
  def havingBetween(raw: Raw_): this.type = js.native
  def havingBetween[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], expr: Expression[PrimitiveValue]): this.type = js.native
  // These must come first so that we get autocomplete.
  def havingBetween[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], op: Operator, expr: Expression[PrimitiveValue]): this.type = js.native
  def havingBetween[QBA /* <: AnyQueryBuilder */](qb: QBA): this.type = js.native
  def havingExists(cb: CallbackVoid[this.type]): this.type = js.native
  def havingExists(col: ColumnRef, expr: Expression[PrimitiveValue]): this.type = js.native
  def havingExists(col: ColumnRef, op: Operator, expr: Expression[PrimitiveValue]): this.type = js.native
  def havingExists(condition: Boolean): this.type = js.native
  // We must allow any keys in the object. The previous type
  // is kind of useless, but maybe one day vscode and other
  // tools can autocomplete using it.
  def havingExists(obj: js.Object): this.type = js.native
  def havingExists(obj: PartialModelObject[ModelType[this.type]]): this.type = js.native
  def havingExists(raw: Raw_): this.type = js.native
  def havingExists[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], expr: Expression[PrimitiveValue]): this.type = js.native
  // These must come first so that we get autocomplete.
  def havingExists[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], op: Operator, expr: Expression[PrimitiveValue]): this.type = js.native
  def havingExists[QBA /* <: AnyQueryBuilder */](qb: QBA): this.type = js.native
  def havingIn(cb: CallbackVoid[this.type]): this.type = js.native
  def havingIn(col: ColumnRef, expr: Expression[PrimitiveValue]): this.type = js.native
  def havingIn(col: ColumnRef, op: Operator, expr: Expression[PrimitiveValue]): this.type = js.native
  def havingIn(condition: Boolean): this.type = js.native
  // We must allow any keys in the object. The previous type
  // is kind of useless, but maybe one day vscode and other
  // tools can autocomplete using it.
  def havingIn(obj: js.Object): this.type = js.native
  def havingIn(obj: PartialModelObject[ModelType[this.type]]): this.type = js.native
  def havingIn(raw: Raw_): this.type = js.native
  def havingIn[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], expr: Expression[PrimitiveValue]): this.type = js.native
  // These must come first so that we get autocomplete.
  def havingIn[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], op: Operator, expr: Expression[PrimitiveValue]): this.type = js.native
  def havingIn[QBA /* <: AnyQueryBuilder */](qb: QBA): this.type = js.native
  def havingNotBetween(cb: CallbackVoid[this.type]): this.type = js.native
  def havingNotBetween(col: ColumnRef, expr: Expression[PrimitiveValue]): this.type = js.native
  def havingNotBetween(col: ColumnRef, op: Operator, expr: Expression[PrimitiveValue]): this.type = js.native
  def havingNotBetween(condition: Boolean): this.type = js.native
  // We must allow any keys in the object. The previous type
  // is kind of useless, but maybe one day vscode and other
  // tools can autocomplete using it.
  def havingNotBetween(obj: js.Object): this.type = js.native
  def havingNotBetween(obj: PartialModelObject[ModelType[this.type]]): this.type = js.native
  def havingNotBetween(raw: Raw_): this.type = js.native
  def havingNotBetween[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], expr: Expression[PrimitiveValue]): this.type = js.native
  // These must come first so that we get autocomplete.
  def havingNotBetween[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], op: Operator, expr: Expression[PrimitiveValue]): this.type = js.native
  def havingNotBetween[QBA /* <: AnyQueryBuilder */](qb: QBA): this.type = js.native
  def havingNotExists(cb: CallbackVoid[this.type]): this.type = js.native
  def havingNotExists(col: ColumnRef, expr: Expression[PrimitiveValue]): this.type = js.native
  def havingNotExists(col: ColumnRef, op: Operator, expr: Expression[PrimitiveValue]): this.type = js.native
  def havingNotExists(condition: Boolean): this.type = js.native
  // We must allow any keys in the object. The previous type
  // is kind of useless, but maybe one day vscode and other
  // tools can autocomplete using it.
  def havingNotExists(obj: js.Object): this.type = js.native
  def havingNotExists(obj: PartialModelObject[ModelType[this.type]]): this.type = js.native
  def havingNotExists(raw: Raw_): this.type = js.native
  def havingNotExists[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], expr: Expression[PrimitiveValue]): this.type = js.native
  // These must come first so that we get autocomplete.
  def havingNotExists[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], op: Operator, expr: Expression[PrimitiveValue]): this.type = js.native
  def havingNotExists[QBA /* <: AnyQueryBuilder */](qb: QBA): this.type = js.native
  def havingNotIn(cb: CallbackVoid[this.type]): this.type = js.native
  def havingNotIn(col: ColumnRef, expr: Expression[PrimitiveValue]): this.type = js.native
  def havingNotIn(col: ColumnRef, op: Operator, expr: Expression[PrimitiveValue]): this.type = js.native
  def havingNotIn(condition: Boolean): this.type = js.native
  // We must allow any keys in the object. The previous type
  // is kind of useless, but maybe one day vscode and other
  // tools can autocomplete using it.
  def havingNotIn(obj: js.Object): this.type = js.native
  def havingNotIn(obj: PartialModelObject[ModelType[this.type]]): this.type = js.native
  def havingNotIn(raw: Raw_): this.type = js.native
  def havingNotIn[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], expr: Expression[PrimitiveValue]): this.type = js.native
  // These must come first so that we get autocomplete.
  def havingNotIn[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], op: Operator, expr: Expression[PrimitiveValue]): this.type = js.native
  def havingNotIn[QBA /* <: AnyQueryBuilder */](qb: QBA): this.type = js.native
  def havingNotNull(cb: CallbackVoid[this.type]): this.type = js.native
  def havingNotNull(col: ColumnRef, expr: Expression[PrimitiveValue]): this.type = js.native
  def havingNotNull(col: ColumnRef, op: Operator, expr: Expression[PrimitiveValue]): this.type = js.native
  def havingNotNull(condition: Boolean): this.type = js.native
  // We must allow any keys in the object. The previous type
  // is kind of useless, but maybe one day vscode and other
  // tools can autocomplete using it.
  def havingNotNull(obj: js.Object): this.type = js.native
  def havingNotNull(obj: PartialModelObject[ModelType[this.type]]): this.type = js.native
  def havingNotNull(raw: Raw_): this.type = js.native
  def havingNotNull[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], expr: Expression[PrimitiveValue]): this.type = js.native
  // These must come first so that we get autocomplete.
  def havingNotNull[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], op: Operator, expr: Expression[PrimitiveValue]): this.type = js.native
  def havingNotNull[QBA /* <: AnyQueryBuilder */](qb: QBA): this.type = js.native
  def havingNull(cb: CallbackVoid[this.type]): this.type = js.native
  def havingNull(col: ColumnRef, expr: Expression[PrimitiveValue]): this.type = js.native
  def havingNull(col: ColumnRef, op: Operator, expr: Expression[PrimitiveValue]): this.type = js.native
  def havingNull(condition: Boolean): this.type = js.native
  // We must allow any keys in the object. The previous type
  // is kind of useless, but maybe one day vscode and other
  // tools can autocomplete using it.
  def havingNull(obj: js.Object): this.type = js.native
  def havingNull(obj: PartialModelObject[ModelType[this.type]]): this.type = js.native
  def havingNull(raw: Raw_): this.type = js.native
  def havingNull[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], expr: Expression[PrimitiveValue]): this.type = js.native
  // These must come first so that we get autocomplete.
  def havingNull[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], op: Operator, expr: Expression[PrimitiveValue]): this.type = js.native
  def havingNull[QBA /* <: AnyQueryBuilder */](qb: QBA): this.type = js.native
  def havingRaw(cb: CallbackVoid[this.type]): this.type = js.native
  def havingRaw(col: ColumnRef, expr: Expression[PrimitiveValue]): this.type = js.native
  def havingRaw(col: ColumnRef, op: Operator, expr: Expression[PrimitiveValue]): this.type = js.native
  def havingRaw(condition: Boolean): this.type = js.native
  // We must allow any keys in the object. The previous type
  // is kind of useless, but maybe one day vscode and other
  // tools can autocomplete using it.
  def havingRaw(obj: js.Object): this.type = js.native
  def havingRaw(obj: PartialModelObject[ModelType[this.type]]): this.type = js.native
  def havingRaw(raw: Raw_): this.type = js.native
  def havingRaw[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], expr: Expression[PrimitiveValue]): this.type = js.native
  // These must come first so that we get autocomplete.
  def havingRaw[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], op: Operator, expr: Expression[PrimitiveValue]): this.type = js.native
  def havingRaw[QBA /* <: AnyQueryBuilder */](qb: QBA): this.type = js.native
  def havingWrapped(cb: CallbackVoid[this.type]): this.type = js.native
  def increment(column: String): this.type = js.native
  def increment(column: String, amount: Double): this.type = js.native
  def innerJoin(raw: Raw_): this.type = js.native
  def innerJoin(table: TableRef, cb: CallbackVoid[JoinClause]): this.type = js.native
  def innerJoin(table: TableRef, leftCol: ColumnRef, op: Operator, rightCol: ColumnRef): this.type = js.native
  def innerJoin(table: TableRef, leftCol: ColumnRef, rightCol: ColumnRef): this.type = js.native
  def innerJoin(table: TableRef, raw: Raw_): this.type = js.native
  def innerJoinRelated(expr: RelationExpression[ModelType[this.type]]): this.type = js.native
  def innerJoinRelated(expr: RelationExpression[ModelType[this.type]], opt: JoinRelatedOptions): this.type = js.native
  // Deprecated
  def innerJoinRelation(expr: RelationExpression[ModelType[this.type]]): this.type = js.native
  def innerJoinRelation(expr: RelationExpression[ModelType[this.type]], opt: JoinRelatedOptions): this.type = js.native
  def insert(): SingleQueryBuilder[this.type] = js.native
  def insert(insert: js.Array[PartialModelObject[M]]): ArrayQueryBuilder[this.type] = js.native
  def insert(insert: PartialModelObject[M]): SingleQueryBuilder[this.type] = js.native
  def insertAndFetch(): SingleQueryBuilder[this.type] = js.native
  def insertAndFetch(insert: js.Array[PartialModelObject[M]]): ArrayQueryBuilder[this.type] = js.native
  def insertAndFetch(insert: PartialModelObject[M]): SingleQueryBuilder[this.type] = js.native
  def insertGraph[QB /* <: AnyQueryBuilder */](graph: js.Array[PartialModelGraph[M, M with GraphParameters]]): ArrayQueryBuilder[QB] = js.native
  def insertGraph[QB /* <: AnyQueryBuilder */](graph: js.Array[PartialModelGraph[M, M with GraphParameters]], options: InsertGraphOptions): ArrayQueryBuilder[QB] = js.native
  def insertGraph[QB /* <: AnyQueryBuilder */](graph: PartialModelGraph[M, M with GraphParameters]): SingleQueryBuilder[QB] = js.native
  def insertGraph[QB /* <: AnyQueryBuilder */](graph: PartialModelGraph[M, M with GraphParameters], options: InsertGraphOptions): SingleQueryBuilder[QB] = js.native
  def insertGraphAndFetch[QB /* <: AnyQueryBuilder */](graph: js.Array[PartialModelGraph[M, M with GraphParameters]]): ArrayQueryBuilder[QB] = js.native
  def insertGraphAndFetch[QB /* <: AnyQueryBuilder */](graph: js.Array[PartialModelGraph[M, M with GraphParameters]], options: InsertGraphOptions): ArrayQueryBuilder[QB] = js.native
  def insertGraphAndFetch[QB /* <: AnyQueryBuilder */](graph: PartialModelGraph[M, M with GraphParameters]): SingleQueryBuilder[QB] = js.native
  def insertGraphAndFetch[QB /* <: AnyQueryBuilder */](graph: PartialModelGraph[M, M with GraphParameters], options: InsertGraphOptions): SingleQueryBuilder[QB] = js.native
  def insertWithRelated[QB /* <: AnyQueryBuilder */](graph: js.Array[PartialModelGraph[M, M with GraphParameters]]): ArrayQueryBuilder[QB] = js.native
  def insertWithRelated[QB /* <: AnyQueryBuilder */](graph: js.Array[PartialModelGraph[M, M with GraphParameters]], options: InsertGraphOptions): ArrayQueryBuilder[QB] = js.native
  def insertWithRelated[QB /* <: AnyQueryBuilder */](graph: PartialModelGraph[M, M with GraphParameters]): SingleQueryBuilder[QB] = js.native
  def insertWithRelated[QB /* <: AnyQueryBuilder */](graph: PartialModelGraph[M, M with GraphParameters], options: InsertGraphOptions): SingleQueryBuilder[QB] = js.native
  def insertWithRelatedAndFetch[QB /* <: AnyQueryBuilder */](graph: js.Array[PartialModelGraph[M, M with GraphParameters]]): ArrayQueryBuilder[QB] = js.native
  def insertWithRelatedAndFetch[QB /* <: AnyQueryBuilder */](graph: js.Array[PartialModelGraph[M, M with GraphParameters]], options: InsertGraphOptions): ArrayQueryBuilder[QB] = js.native
  def insertWithRelatedAndFetch[QB /* <: AnyQueryBuilder */](graph: PartialModelGraph[M, M with GraphParameters]): SingleQueryBuilder[QB] = js.native
  def insertWithRelatedAndFetch[QB /* <: AnyQueryBuilder */](graph: PartialModelGraph[M, M with GraphParameters], options: InsertGraphOptions): SingleQueryBuilder[QB] = js.native
  def intersect(callbackOrBuilder: QBOrCallback[this.type]): this.type = js.native
  def intersect(callbackOrBuilder: QBOrCallback[this.type], wrap: Boolean): this.type = js.native
  def intersect(callbacksOrBuilders: QBOrCallback[this.type]*): this.type = js.native
  def intersect(callbacksOrBuilders: js.Array[QBOrCallback[this.type]]): this.type = js.native
  def intersect(callbacksOrBuilders: js.Array[QBOrCallback[this.type]], wrap: Boolean): this.type = js.native
  def into(cb: CallbackVoid[this.type]): this.type = js.native
  def into(raw: Raw_): this.type = js.native
  def into(table: String): this.type = js.native
  def into[QBP /* <: AnyQueryBuilder */](qb: QBP): this.type = js.native
  def isDelete(): Boolean = js.native
  def isExecutable(): Boolean = js.native
  def isFind(): Boolean = js.native
  def isInsert(): Boolean = js.native
  def isInternal(): Boolean = js.native
  def isRelate(): Boolean = js.native
  def isUnrelate(): Boolean = js.native
  def isUpdate(): Boolean = js.native
  def join(raw: Raw_): this.type = js.native
  def join(table: TableRef, cb: CallbackVoid[JoinClause]): this.type = js.native
  def join(table: TableRef, leftCol: ColumnRef, op: Operator, rightCol: ColumnRef): this.type = js.native
  def join(table: TableRef, leftCol: ColumnRef, rightCol: ColumnRef): this.type = js.native
  def join(table: TableRef, raw: Raw_): this.type = js.native
  // Deprecated
  def joinEager(expr: RelationExpression[ModelType[this.type]]): this.type = js.native
  def joinEager(expr: RelationExpression[ModelType[this.type]], modifiers: Modifiers[AnyQueryBuilder]): this.type = js.native
  def joinRaw(sql: String, bindings: js.Any*): this.type = js.native
  def joinRelated(expr: RelationExpression[ModelType[this.type]]): this.type = js.native
  def joinRelated(expr: RelationExpression[ModelType[this.type]], opt: JoinRelatedOptions): this.type = js.native
  // Deprecated
  def joinRelation(expr: RelationExpression[ModelType[this.type]]): this.type = js.native
  def joinRelation(expr: RelationExpression[ModelType[this.type]], opt: JoinRelatedOptions): this.type = js.native
  def leftJoin(raw: Raw_): this.type = js.native
  def leftJoin(table: TableRef, cb: CallbackVoid[JoinClause]): this.type = js.native
  def leftJoin(table: TableRef, leftCol: ColumnRef, op: Operator, rightCol: ColumnRef): this.type = js.native
  def leftJoin(table: TableRef, leftCol: ColumnRef, rightCol: ColumnRef): this.type = js.native
  def leftJoin(table: TableRef, raw: Raw_): this.type = js.native
  def leftJoinRelated(expr: RelationExpression[ModelType[this.type]]): this.type = js.native
  def leftJoinRelated(expr: RelationExpression[ModelType[this.type]], opt: JoinRelatedOptions): this.type = js.native
  // Deprecated
  def leftJoinRelation(expr: RelationExpression[ModelType[this.type]]): this.type = js.native
  def leftJoinRelation(expr: RelationExpression[ModelType[this.type]], opt: JoinRelatedOptions): this.type = js.native
  def leftOuterJoin(raw: Raw_): this.type = js.native
  def leftOuterJoin(table: TableRef, cb: CallbackVoid[JoinClause]): this.type = js.native
  def leftOuterJoin(table: TableRef, leftCol: ColumnRef, op: Operator, rightCol: ColumnRef): this.type = js.native
  def leftOuterJoin(table: TableRef, leftCol: ColumnRef, rightCol: ColumnRef): this.type = js.native
  def leftOuterJoin(table: TableRef, raw: Raw_): this.type = js.native
  def leftOuterJoinRelated(expr: RelationExpression[ModelType[this.type]]): this.type = js.native
  def leftOuterJoinRelated(expr: RelationExpression[ModelType[this.type]], opt: JoinRelatedOptions): this.type = js.native
  // Deprecated
  def leftOuterJoinRelation(expr: RelationExpression[ModelType[this.type]]): this.type = js.native
  def leftOuterJoinRelation(expr: RelationExpression[ModelType[this.type]], opt: JoinRelatedOptions): this.type = js.native
  def limit(limit: Double): this.type = js.native
  def max(column: ColumnRef): this.type = js.native
  // Deprecated
  def mergeAllowEager(expr: RelationExpression[ModelType[this.type]]): this.type = js.native
  // Deprecated
  def mergeContext(): QueryContext = js.native
  // Deprecated
  def mergeContext(context: js.Object): this.type = js.native
  // Deprecated
  def mergeEager(expr: RelationExpression[ModelType[this.type]]): this.type = js.native
  def mergeEager(expr: RelationExpression[ModelType[this.type]], modifiers: Modifiers[AnyQueryBuilder]): this.type = js.native
  // Deprecated
  def mergeJoinEager(expr: RelationExpression[ModelType[this.type]]): this.type = js.native
  def mergeJoinEager(expr: RelationExpression[ModelType[this.type]], modifiers: Modifiers[AnyQueryBuilder]): this.type = js.native
  // Deprecated
  def mergeNaiveEager(expr: RelationExpression[ModelType[this.type]]): this.type = js.native
  def mergeNaiveEager(expr: RelationExpression[ModelType[this.type]], modifiers: Modifiers[AnyQueryBuilder]): this.type = js.native
  def min(column: ColumnRef): this.type = js.native
  def modelClass(): ModelClass[M] = js.native
  def modifiers(): this.type = js.native
  def modifiers(modifiers: Modifiers[AnyQueryBuilder]): this.type = js.native
  def modify(modifier: js.Array[Modifier[this.type]], args: js.Any*): this.type = js.native
  def modify(modifier: Modifier[this.type], args: js.Any*): this.type = js.native
  // Deprecated
  def modifyEager[M /* <: Model */](expr: RelationExpression[ModelType[this.type]], modifier: Modifier[QueryBuilderType[M]]): this.type = js.native
  def modifyGraph[M /* <: Model */](expr: RelationExpression[ModelType[this.type]], modifier: Modifier[QueryBuilderType[M]]): this.type = js.native
  // Deprecated
  def naiveEager(expr: RelationExpression[ModelType[this.type]]): this.type = js.native
  def naiveEager(expr: RelationExpression[ModelType[this.type]], modifiers: Modifiers[AnyQueryBuilder]): this.type = js.native
  def offset(offset: Double): this.type = js.native
  // Deprecated
  def omit(modelClass: TypeofModel, properties: js.Array[String]): this.type = js.native
  // Deprecated
  def omit(properties: js.Array[String]): this.type = js.native
  def onBuild(cb: CallbackVoid[this.type]): this.type = js.native
  def onBuildKnex(cb: OnBuildKnexCallback[this.type]): this.type = js.native
  def onError(cb: OnErrorCallback[this.type]): this.type = js.native
  def orHaving(cb: CallbackVoid[this.type]): this.type = js.native
  def orHaving(col: ColumnRef, expr: Expression[PrimitiveValue]): this.type = js.native
  def orHaving(col: ColumnRef, op: Operator, expr: Expression[PrimitiveValue]): this.type = js.native
  def orHaving(condition: Boolean): this.type = js.native
  // We must allow any keys in the object. The previous type
  // is kind of useless, but maybe one day vscode and other
  // tools can autocomplete using it.
  def orHaving(obj: js.Object): this.type = js.native
  def orHaving(obj: PartialModelObject[ModelType[this.type]]): this.type = js.native
  def orHaving(raw: Raw_): this.type = js.native
  def orHaving[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], expr: Expression[PrimitiveValue]): this.type = js.native
  // These must come first so that we get autocomplete.
  def orHaving[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], op: Operator, expr: Expression[PrimitiveValue]): this.type = js.native
  def orHaving[QBA /* <: AnyQueryBuilder */](qb: QBA): this.type = js.native
  def orHavingBetween(cb: CallbackVoid[this.type]): this.type = js.native
  def orHavingBetween(col: ColumnRef, expr: Expression[PrimitiveValue]): this.type = js.native
  def orHavingBetween(col: ColumnRef, op: Operator, expr: Expression[PrimitiveValue]): this.type = js.native
  def orHavingBetween(condition: Boolean): this.type = js.native
  // We must allow any keys in the object. The previous type
  // is kind of useless, but maybe one day vscode and other
  // tools can autocomplete using it.
  def orHavingBetween(obj: js.Object): this.type = js.native
  def orHavingBetween(obj: PartialModelObject[ModelType[this.type]]): this.type = js.native
  def orHavingBetween(raw: Raw_): this.type = js.native
  def orHavingBetween[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], expr: Expression[PrimitiveValue]): this.type = js.native
  // These must come first so that we get autocomplete.
  def orHavingBetween[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], op: Operator, expr: Expression[PrimitiveValue]): this.type = js.native
  def orHavingBetween[QBA /* <: AnyQueryBuilder */](qb: QBA): this.type = js.native
  def orHavingExists(cb: CallbackVoid[this.type]): this.type = js.native
  def orHavingExists(col: ColumnRef, expr: Expression[PrimitiveValue]): this.type = js.native
  def orHavingExists(col: ColumnRef, op: Operator, expr: Expression[PrimitiveValue]): this.type = js.native
  def orHavingExists(condition: Boolean): this.type = js.native
  // We must allow any keys in the object. The previous type
  // is kind of useless, but maybe one day vscode and other
  // tools can autocomplete using it.
  def orHavingExists(obj: js.Object): this.type = js.native
  def orHavingExists(obj: PartialModelObject[ModelType[this.type]]): this.type = js.native
  def orHavingExists(raw: Raw_): this.type = js.native
  def orHavingExists[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], expr: Expression[PrimitiveValue]): this.type = js.native
  // These must come first so that we get autocomplete.
  def orHavingExists[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], op: Operator, expr: Expression[PrimitiveValue]): this.type = js.native
  def orHavingExists[QBA /* <: AnyQueryBuilder */](qb: QBA): this.type = js.native
  def orHavingIn(cb: CallbackVoid[this.type]): this.type = js.native
  def orHavingIn(col: ColumnRef, expr: Expression[PrimitiveValue]): this.type = js.native
  def orHavingIn(col: ColumnRef, op: Operator, expr: Expression[PrimitiveValue]): this.type = js.native
  def orHavingIn(condition: Boolean): this.type = js.native
  // We must allow any keys in the object. The previous type
  // is kind of useless, but maybe one day vscode and other
  // tools can autocomplete using it.
  def orHavingIn(obj: js.Object): this.type = js.native
  def orHavingIn(obj: PartialModelObject[ModelType[this.type]]): this.type = js.native
  def orHavingIn(raw: Raw_): this.type = js.native
  def orHavingIn[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], expr: Expression[PrimitiveValue]): this.type = js.native
  // These must come first so that we get autocomplete.
  def orHavingIn[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], op: Operator, expr: Expression[PrimitiveValue]): this.type = js.native
  def orHavingIn[QBA /* <: AnyQueryBuilder */](qb: QBA): this.type = js.native
  def orHavingNotBetween(cb: CallbackVoid[this.type]): this.type = js.native
  def orHavingNotBetween(col: ColumnRef, expr: Expression[PrimitiveValue]): this.type = js.native
  def orHavingNotBetween(col: ColumnRef, op: Operator, expr: Expression[PrimitiveValue]): this.type = js.native
  def orHavingNotBetween(condition: Boolean): this.type = js.native
  // We must allow any keys in the object. The previous type
  // is kind of useless, but maybe one day vscode and other
  // tools can autocomplete using it.
  def orHavingNotBetween(obj: js.Object): this.type = js.native
  def orHavingNotBetween(obj: PartialModelObject[ModelType[this.type]]): this.type = js.native
  def orHavingNotBetween(raw: Raw_): this.type = js.native
  def orHavingNotBetween[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], expr: Expression[PrimitiveValue]): this.type = js.native
  // These must come first so that we get autocomplete.
  def orHavingNotBetween[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], op: Operator, expr: Expression[PrimitiveValue]): this.type = js.native
  def orHavingNotBetween[QBA /* <: AnyQueryBuilder */](qb: QBA): this.type = js.native
  def orHavingNotExists(cb: CallbackVoid[this.type]): this.type = js.native
  def orHavingNotExists(col: ColumnRef, expr: Expression[PrimitiveValue]): this.type = js.native
  def orHavingNotExists(col: ColumnRef, op: Operator, expr: Expression[PrimitiveValue]): this.type = js.native
  def orHavingNotExists(condition: Boolean): this.type = js.native
  // We must allow any keys in the object. The previous type
  // is kind of useless, but maybe one day vscode and other
  // tools can autocomplete using it.
  def orHavingNotExists(obj: js.Object): this.type = js.native
  def orHavingNotExists(obj: PartialModelObject[ModelType[this.type]]): this.type = js.native
  def orHavingNotExists(raw: Raw_): this.type = js.native
  def orHavingNotExists[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], expr: Expression[PrimitiveValue]): this.type = js.native
  // These must come first so that we get autocomplete.
  def orHavingNotExists[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], op: Operator, expr: Expression[PrimitiveValue]): this.type = js.native
  def orHavingNotExists[QBA /* <: AnyQueryBuilder */](qb: QBA): this.type = js.native
  def orHavingNotIn(cb: CallbackVoid[this.type]): this.type = js.native
  def orHavingNotIn(col: ColumnRef, expr: Expression[PrimitiveValue]): this.type = js.native
  def orHavingNotIn(col: ColumnRef, op: Operator, expr: Expression[PrimitiveValue]): this.type = js.native
  def orHavingNotIn(condition: Boolean): this.type = js.native
  // We must allow any keys in the object. The previous type
  // is kind of useless, but maybe one day vscode and other
  // tools can autocomplete using it.
  def orHavingNotIn(obj: js.Object): this.type = js.native
  def orHavingNotIn(obj: PartialModelObject[ModelType[this.type]]): this.type = js.native
  def orHavingNotIn(raw: Raw_): this.type = js.native
  def orHavingNotIn[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], expr: Expression[PrimitiveValue]): this.type = js.native
  // These must come first so that we get autocomplete.
  def orHavingNotIn[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], op: Operator, expr: Expression[PrimitiveValue]): this.type = js.native
  def orHavingNotIn[QBA /* <: AnyQueryBuilder */](qb: QBA): this.type = js.native
  def orHavingNotNull(cb: CallbackVoid[this.type]): this.type = js.native
  def orHavingNotNull(col: ColumnRef, expr: Expression[PrimitiveValue]): this.type = js.native
  def orHavingNotNull(col: ColumnRef, op: Operator, expr: Expression[PrimitiveValue]): this.type = js.native
  def orHavingNotNull(condition: Boolean): this.type = js.native
  // We must allow any keys in the object. The previous type
  // is kind of useless, but maybe one day vscode and other
  // tools can autocomplete using it.
  def orHavingNotNull(obj: js.Object): this.type = js.native
  def orHavingNotNull(obj: PartialModelObject[ModelType[this.type]]): this.type = js.native
  def orHavingNotNull(raw: Raw_): this.type = js.native
  def orHavingNotNull[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], expr: Expression[PrimitiveValue]): this.type = js.native
  // These must come first so that we get autocomplete.
  def orHavingNotNull[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], op: Operator, expr: Expression[PrimitiveValue]): this.type = js.native
  def orHavingNotNull[QBA /* <: AnyQueryBuilder */](qb: QBA): this.type = js.native
  def orHavingNull(cb: CallbackVoid[this.type]): this.type = js.native
  def orHavingNull(col: ColumnRef, expr: Expression[PrimitiveValue]): this.type = js.native
  def orHavingNull(col: ColumnRef, op: Operator, expr: Expression[PrimitiveValue]): this.type = js.native
  def orHavingNull(condition: Boolean): this.type = js.native
  // We must allow any keys in the object. The previous type
  // is kind of useless, but maybe one day vscode and other
  // tools can autocomplete using it.
  def orHavingNull(obj: js.Object): this.type = js.native
  def orHavingNull(obj: PartialModelObject[ModelType[this.type]]): this.type = js.native
  def orHavingNull(raw: Raw_): this.type = js.native
  def orHavingNull[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], expr: Expression[PrimitiveValue]): this.type = js.native
  // These must come first so that we get autocomplete.
  def orHavingNull[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], op: Operator, expr: Expression[PrimitiveValue]): this.type = js.native
  def orHavingNull[QBA /* <: AnyQueryBuilder */](qb: QBA): this.type = js.native
  def orHavingRaw(cb: CallbackVoid[this.type]): this.type = js.native
  def orHavingRaw(col: ColumnRef, expr: Expression[PrimitiveValue]): this.type = js.native
  def orHavingRaw(col: ColumnRef, op: Operator, expr: Expression[PrimitiveValue]): this.type = js.native
  def orHavingRaw(condition: Boolean): this.type = js.native
  // We must allow any keys in the object. The previous type
  // is kind of useless, but maybe one day vscode and other
  // tools can autocomplete using it.
  def orHavingRaw(obj: js.Object): this.type = js.native
  def orHavingRaw(obj: PartialModelObject[ModelType[this.type]]): this.type = js.native
  def orHavingRaw(raw: Raw_): this.type = js.native
  def orHavingRaw[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], expr: Expression[PrimitiveValue]): this.type = js.native
  // These must come first so that we get autocomplete.
  def orHavingRaw[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], op: Operator, expr: Expression[PrimitiveValue]): this.type = js.native
  def orHavingRaw[QBA /* <: AnyQueryBuilder */](qb: QBA): this.type = js.native
  def orWhere(cb: CallbackVoid[this.type]): this.type = js.native
  def orWhere(col: ColumnRef, expr: Expression[PrimitiveValue]): this.type = js.native
  def orWhere(col: ColumnRef, op: Operator, expr: Expression[PrimitiveValue]): this.type = js.native
  def orWhere(condition: Boolean): this.type = js.native
  // We must allow any keys in the object. The previous type
  // is kind of useless, but maybe one day vscode and other
  // tools can autocomplete using it.
  def orWhere(obj: js.Object): this.type = js.native
  def orWhere(obj: PartialModelObject[ModelType[this.type]]): this.type = js.native
  def orWhere(raw: Raw_): this.type = js.native
  def orWhere[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], expr: Expression[PrimitiveValue]): this.type = js.native
  // These must come first so that we get autocomplete.
  def orWhere[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], op: Operator, expr: Expression[PrimitiveValue]): this.type = js.native
  def orWhere[QBA /* <: AnyQueryBuilder */](qb: QBA): this.type = js.native
  def orWhereBetween(column: ColumnRef, range: js.Tuple2[Expression[PrimitiveValue], Expression[PrimitiveValue]]): this.type = js.native
  def orWhereColumn(col1: ColumnRef, col2: ColumnRef): this.type = js.native
  def orWhereColumn(col1: ColumnRef, op: Operator, col2: ColumnRef): this.type = js.native
  def orWhereColumn[QBP /* <: this.type */](col1: ModelProps[ModelType[QBP]], col2: ColumnRef): this.type = js.native
  // These must come first so that we get autocomplete.
  def orWhereColumn[QBP /* <: this.type */](col1: ModelProps[ModelType[QBP]], op: Operator, col2: ColumnRef): this.type = js.native
  def orWhereExists(cb: CallbackVoid[this.type]): this.type = js.native
  def orWhereExists(raw: Raw_): this.type = js.native
  def orWhereExists[QBA /* <: AnyQueryBuilder */](qb: QBA): this.type = js.native
  def orWhereIn(col: js.Array[ColumnRef], cb: CallbackVoid[this.type]): this.type = js.native
  def orWhereIn(col: js.Array[ColumnRef], expr: js.Array[Expression[PrimitiveValue]]): this.type = js.native
  def orWhereIn(col: js.Array[ColumnRef], qb: AnyQueryBuilder): this.type = js.native
  def orWhereIn(col: ColumnRef, cb: CallbackVoid[this.type]): this.type = js.native
  def orWhereIn(col: ColumnRef, expr: js.Array[Expression[PrimitiveValue]]): this.type = js.native
  def orWhereIn(col: ColumnRef, qb: AnyQueryBuilder): this.type = js.native
  def orWhereIn[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], cb: CallbackVoid[this.type]): this.type = js.native
  // These must come first so that we get autocomplete.
  def orWhereIn[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], expr: Expression[PrimitiveValue]): this.type = js.native
  def orWhereIn[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], qb: AnyQueryBuilder): this.type = js.native
  def orWhereJsonHasAll(fieldExpression: FieldExpression, keys: String): this.type = js.native
  def orWhereJsonHasAll(fieldExpression: FieldExpression, keys: js.Array[String]): this.type = js.native
  def orWhereJsonHasAny(fieldExpression: FieldExpression, keys: String): this.type = js.native
  def orWhereJsonHasAny(fieldExpression: FieldExpression, keys: js.Array[String]): this.type = js.native
  def orWhereJsonIsArray(fieldExpression: FieldExpression): this.type = js.native
  def orWhereJsonIsObject(fieldExpression: FieldExpression): this.type = js.native
  def orWhereJsonNotArray(fieldExpression: FieldExpression): this.type = js.native
  def orWhereJsonNotObject(fieldExpression: FieldExpression): this.type = js.native
  def orWhereJsonNotSubsetOf(fieldExpression: FieldExpression, jsonObjectOrFieldExpression: JsonObjectOrFieldExpression): this.type = js.native
  def orWhereJsonNotSupersetOf(fieldExpression: FieldExpression, jsonObjectOrFieldExpression: JsonObjectOrFieldExpression): this.type = js.native
  def orWhereJsonSubsetOf(fieldExpression: FieldExpression, jsonObjectOrFieldExpression: JsonObjectOrFieldExpression): this.type = js.native
  def orWhereJsonSupersetOf(fieldExpression: FieldExpression, jsonObjectOrFieldExpression: JsonObjectOrFieldExpression): this.type = js.native
  def orWhereNot(cb: CallbackVoid[this.type]): this.type = js.native
  def orWhereNot(col: ColumnRef, expr: Expression[PrimitiveValue]): this.type = js.native
  def orWhereNot(col: ColumnRef, op: Operator, expr: Expression[PrimitiveValue]): this.type = js.native
  def orWhereNot(condition: Boolean): this.type = js.native
  // We must allow any keys in the object. The previous type
  // is kind of useless, but maybe one day vscode and other
  // tools can autocomplete using it.
  def orWhereNot(obj: js.Object): this.type = js.native
  def orWhereNot(obj: PartialModelObject[ModelType[this.type]]): this.type = js.native
  def orWhereNot(raw: Raw_): this.type = js.native
  def orWhereNot[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], expr: Expression[PrimitiveValue]): this.type = js.native
  // These must come first so that we get autocomplete.
  def orWhereNot[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], op: Operator, expr: Expression[PrimitiveValue]): this.type = js.native
  def orWhereNot[QBA /* <: AnyQueryBuilder */](qb: QBA): this.type = js.native
  def orWhereNotBetween(column: ColumnRef, range: js.Tuple2[Expression[PrimitiveValue], Expression[PrimitiveValue]]): this.type = js.native
  def orWhereNotColumn(col1: ColumnRef, col2: ColumnRef): this.type = js.native
  def orWhereNotColumn(col1: ColumnRef, op: Operator, col2: ColumnRef): this.type = js.native
  def orWhereNotColumn[QBP /* <: this.type */](col1: ModelProps[ModelType[QBP]], col2: ColumnRef): this.type = js.native
  // These must come first so that we get autocomplete.
  def orWhereNotColumn[QBP /* <: this.type */](col1: ModelProps[ModelType[QBP]], op: Operator, col2: ColumnRef): this.type = js.native
  def orWhereNotExists(cb: CallbackVoid[this.type]): this.type = js.native
  def orWhereNotExists(raw: Raw_): this.type = js.native
  def orWhereNotExists[QBA /* <: AnyQueryBuilder */](qb: QBA): this.type = js.native
  def orWhereNotIn(col: js.Array[ColumnRef], cb: CallbackVoid[this.type]): this.type = js.native
  def orWhereNotIn(col: js.Array[ColumnRef], expr: js.Array[Expression[PrimitiveValue]]): this.type = js.native
  def orWhereNotIn(col: js.Array[ColumnRef], qb: AnyQueryBuilder): this.type = js.native
  def orWhereNotIn(col: ColumnRef, cb: CallbackVoid[this.type]): this.type = js.native
  def orWhereNotIn(col: ColumnRef, expr: js.Array[Expression[PrimitiveValue]]): this.type = js.native
  def orWhereNotIn(col: ColumnRef, qb: AnyQueryBuilder): this.type = js.native
  def orWhereNotIn[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], cb: CallbackVoid[this.type]): this.type = js.native
  // These must come first so that we get autocomplete.
  def orWhereNotIn[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], expr: Expression[PrimitiveValue]): this.type = js.native
  def orWhereNotIn[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], qb: AnyQueryBuilder): this.type = js.native
  def orWhereNotNull(column: ColumnRef): this.type = js.native
  def orWhereNull(column: ColumnRef): this.type = js.native
  def orWhereRaw(sql: String, bindings: js.Any*): this.type = js.native
  def orderBy(columns: js.Array[ColumnRefOrOrderByDescriptor]): this.type = js.native
  def orderBy(column: ColumnRef): this.type = js.native
  def orderBy(column: ColumnRef, order: OrderByDirection): this.type = js.native
  def orderByRaw(sql: String, bindings: js.Any*): this.type = js.native
  def outerJoin(raw: Raw_): this.type = js.native
  def outerJoin(table: TableRef, cb: CallbackVoid[JoinClause]): this.type = js.native
  def outerJoin(table: TableRef, leftCol: ColumnRef, op: Operator, rightCol: ColumnRef): this.type = js.native
  def outerJoin(table: TableRef, leftCol: ColumnRef, rightCol: ColumnRef): this.type = js.native
  def outerJoin(table: TableRef, raw: Raw_): this.type = js.native
  def outerJoinRelated(expr: RelationExpression[ModelType[this.type]]): this.type = js.native
  def outerJoinRelated(expr: RelationExpression[ModelType[this.type]], opt: JoinRelatedOptions): this.type = js.native
  // Deprecated
  def outerJoinRelation(expr: RelationExpression[ModelType[this.type]]): this.type = js.native
  def outerJoinRelation(expr: RelationExpression[ModelType[this.type]], opt: JoinRelatedOptions): this.type = js.native
  def page(page: Double, pageSize: Double): PageQueryBuilder[this.type] = js.native
  def patch(): NumberQueryBuilder[this.type] = js.native
  def patch(update: PartialModelObject[M]): NumberQueryBuilder[this.type] = js.native
  def patchAndFetch(update: PartialModelObject[M]): SingleQueryBuilder[this.type] = js.native
  def patchAndFetchById(id: MaybeCompositeId, update: PartialModelObject[M]): SingleQueryBuilder[this.type] = js.native
  // Deprecated
  def pick(modelClass: TypeofModel, properties: js.Array[String]): this.type = js.native
  // Deprecated
  def pick(properties: js.Array[String]): this.type = js.native
  // Deprecated
  def pluck(property: String): this.type = js.native
  def range(): PageQueryBuilder[this.type] = js.native
  def range(start: Double, end: Double): PageQueryBuilder[this.type] = js.native
  def reject(arg: js.Any): this.type = js.native
  def relate(ids: js.Array[MaybeCompositeId | PartialModelObject[M]]): NumberQueryBuilder[this.type] = js.native
  def relate(ids: MaybeCompositeId): NumberQueryBuilder[this.type] = js.native
  def relate(ids: PartialModelObject[M]): NumberQueryBuilder[this.type] = js.native
  def resolve(arg: js.Any): this.type = js.native
  def resultSize(): js.Promise[Double] = js.native
  def returning[QB /* <: AnyQueryBuilder */](column: String): SingleQueryBuilder[QB] | ArrayQueryBuilder[QB] = js.native
  def returning[QB /* <: AnyQueryBuilder */](column: js.Array[String]): SingleQueryBuilder[QB] | ArrayQueryBuilder[QB] = js.native
  def rightJoin(raw: Raw_): this.type = js.native
  def rightJoin(table: TableRef, cb: CallbackVoid[JoinClause]): this.type = js.native
  def rightJoin(table: TableRef, leftCol: ColumnRef, op: Operator, rightCol: ColumnRef): this.type = js.native
  def rightJoin(table: TableRef, leftCol: ColumnRef, rightCol: ColumnRef): this.type = js.native
  def rightJoin(table: TableRef, raw: Raw_): this.type = js.native
  def rightJoinRelated(expr: RelationExpression[ModelType[this.type]]): this.type = js.native
  def rightJoinRelated(expr: RelationExpression[ModelType[this.type]], opt: JoinRelatedOptions): this.type = js.native
  // Deprecated
  def rightJoinRelation(expr: RelationExpression[ModelType[this.type]]): this.type = js.native
  def rightJoinRelation(expr: RelationExpression[ModelType[this.type]], opt: JoinRelatedOptions): this.type = js.native
  def rightOuterJoin(raw: Raw_): this.type = js.native
  def rightOuterJoin(table: TableRef, cb: CallbackVoid[JoinClause]): this.type = js.native
  def rightOuterJoin(table: TableRef, leftCol: ColumnRef, op: Operator, rightCol: ColumnRef): this.type = js.native
  def rightOuterJoin(table: TableRef, leftCol: ColumnRef, rightCol: ColumnRef): this.type = js.native
  def rightOuterJoin(table: TableRef, raw: Raw_): this.type = js.native
  def rightOuterJoinRelated(expr: RelationExpression[ModelType[this.type]]): this.type = js.native
  def rightOuterJoinRelated(expr: RelationExpression[ModelType[this.type]], opt: JoinRelatedOptions): this.type = js.native
  // Deprecated
  def rightOuterJoinRelation(expr: RelationExpression[ModelType[this.type]]): this.type = js.native
  def rightOuterJoinRelation(expr: RelationExpression[ModelType[this.type]], opt: JoinRelatedOptions): this.type = js.native
  def runAfter(cb: RunAfterCallback[this.type]): this.type = js.native
  def runBefore(cb: RunBeforeCallback[this.type]): this.type = js.native
  // These must come first so that we get autocomplete.
  // Allows things like `select(1)`, not sure if we should be more specific here?
  def select[QBP /* <: this.type */](columns: (js.Any | ModelProps[ModelType[QBP]] | Selection[QBP])*): this.type = js.native
  def select[QBP /* <: this.type */](columns: js.Array[ModelProps[ModelType[QBP]] | Selection[QBP]]): this.type = js.native
  def skipUndefined(): this.type = js.native
  def sum(column: ColumnRef): this.type = js.native
  def sumDistinct(column: ColumnRef): this.type = js.native
  def table(cb: CallbackVoid[this.type]): this.type = js.native
  def table(raw: Raw_): this.type = js.native
  def table(table: String): this.type = js.native
  def table[QBP /* <: AnyQueryBuilder */](qb: QBP): this.type = js.native
  def tableNameFor(modelClass: TypeofModel): String = js.native
  def tableRefFor(modelClass: TypeofModel): String = js.native
  def throwIfNotFound(): this.type = js.native
  def timeout(ms: Double): this.type = js.native
  def timeout(ms: Double, options: TimeoutOptions): this.type = js.native
  def toKnexQuery[T](): typings.knex.mod.QueryBuilder[T, js.Array[T]] = js.native
  def transacting(arg: TransactionOrKnex): this.type = js.native
  // Deprecated
  def traverse(filterConstructor: TypeofModel, traverser: TraverserFunction): R = js.native
  // Deprecated
  def traverse(traverser: TraverserFunction): R = js.native
  def truncate(): js.Promise[Unit] = js.native
  def union(arg1: QBOrCallback[this.type]): this.type = js.native
  def union(arg1: QBOrCallback[this.type], arg2: QBOrCallback[this.type]): this.type = js.native
  def union(arg1: QBOrCallback[this.type], arg2: QBOrCallback[this.type], arg3: QBOrCallback[this.type]): this.type = js.native
  def union(
    arg1: QBOrCallback[this.type],
    arg2: QBOrCallback[this.type],
    arg3: QBOrCallback[this.type],
    arg4: QBOrCallback[this.type]
  ): this.type = js.native
  def union(
    arg1: QBOrCallback[this.type],
    arg2: QBOrCallback[this.type],
    arg3: QBOrCallback[this.type],
    arg4: QBOrCallback[this.type],
    arg5: QBOrCallback[this.type]
  ): this.type = js.native
  def union(
    arg1: QBOrCallback[this.type],
    arg2: QBOrCallback[this.type],
    arg3: QBOrCallback[this.type],
    arg4: QBOrCallback[this.type],
    arg5: QBOrCallback[this.type],
    arg6: QBOrCallback[this.type]
  ): this.type = js.native
  def union(
    arg1: QBOrCallback[this.type],
    arg2: QBOrCallback[this.type],
    arg3: QBOrCallback[this.type],
    arg4: QBOrCallback[this.type],
    arg5: QBOrCallback[this.type],
    arg6: QBOrCallback[this.type],
    arg7: QBOrCallback[this.type]
  ): this.type = js.native
  def union(
    arg1: QBOrCallback[this.type],
    arg2: QBOrCallback[this.type],
    arg3: QBOrCallback[this.type],
    arg4: QBOrCallback[this.type],
    arg5: QBOrCallback[this.type],
    arg6: QBOrCallback[this.type],
    arg7: QBOrCallback[this.type],
    wrap: Boolean
  ): this.type = js.native
  def union(
    arg1: QBOrCallback[this.type],
    arg2: QBOrCallback[this.type],
    arg3: QBOrCallback[this.type],
    arg4: QBOrCallback[this.type],
    arg5: QBOrCallback[this.type],
    arg6: QBOrCallback[this.type],
    wrap: Boolean
  ): this.type = js.native
  def union(
    arg1: QBOrCallback[this.type],
    arg2: QBOrCallback[this.type],
    arg3: QBOrCallback[this.type],
    arg4: QBOrCallback[this.type],
    arg5: QBOrCallback[this.type],
    wrap: Boolean
  ): this.type = js.native
  def union(
    arg1: QBOrCallback[this.type],
    arg2: QBOrCallback[this.type],
    arg3: QBOrCallback[this.type],
    arg4: QBOrCallback[this.type],
    wrap: Boolean
  ): this.type = js.native
  def union(
    arg1: QBOrCallback[this.type],
    arg2: QBOrCallback[this.type],
    arg3: QBOrCallback[this.type],
    wrap: Boolean
  ): this.type = js.native
  def union(arg1: QBOrCallback[this.type], arg2: QBOrCallback[this.type], wrap: Boolean): this.type = js.native
  def union(arg1: QBOrCallback[this.type], wrap: Boolean): this.type = js.native
  def union(callbacksOrBuilders: js.Array[QBOrCallback[this.type]]): this.type = js.native
  def union(callbacksOrBuilders: js.Array[QBOrCallback[this.type]], wrap: Boolean): this.type = js.native
  def unionAll(arg1: QBOrCallback[this.type]): this.type = js.native
  def unionAll(arg1: QBOrCallback[this.type], arg2: QBOrCallback[this.type]): this.type = js.native
  def unionAll(arg1: QBOrCallback[this.type], arg2: QBOrCallback[this.type], arg3: QBOrCallback[this.type]): this.type = js.native
  def unionAll(
    arg1: QBOrCallback[this.type],
    arg2: QBOrCallback[this.type],
    arg3: QBOrCallback[this.type],
    arg4: QBOrCallback[this.type]
  ): this.type = js.native
  def unionAll(
    arg1: QBOrCallback[this.type],
    arg2: QBOrCallback[this.type],
    arg3: QBOrCallback[this.type],
    arg4: QBOrCallback[this.type],
    arg5: QBOrCallback[this.type]
  ): this.type = js.native
  def unionAll(
    arg1: QBOrCallback[this.type],
    arg2: QBOrCallback[this.type],
    arg3: QBOrCallback[this.type],
    arg4: QBOrCallback[this.type],
    arg5: QBOrCallback[this.type],
    arg6: QBOrCallback[this.type]
  ): this.type = js.native
  def unionAll(
    arg1: QBOrCallback[this.type],
    arg2: QBOrCallback[this.type],
    arg3: QBOrCallback[this.type],
    arg4: QBOrCallback[this.type],
    arg5: QBOrCallback[this.type],
    arg6: QBOrCallback[this.type],
    arg7: QBOrCallback[this.type]
  ): this.type = js.native
  def unionAll(
    arg1: QBOrCallback[this.type],
    arg2: QBOrCallback[this.type],
    arg3: QBOrCallback[this.type],
    arg4: QBOrCallback[this.type],
    arg5: QBOrCallback[this.type],
    arg6: QBOrCallback[this.type],
    arg7: QBOrCallback[this.type],
    wrap: Boolean
  ): this.type = js.native
  def unionAll(
    arg1: QBOrCallback[this.type],
    arg2: QBOrCallback[this.type],
    arg3: QBOrCallback[this.type],
    arg4: QBOrCallback[this.type],
    arg5: QBOrCallback[this.type],
    arg6: QBOrCallback[this.type],
    wrap: Boolean
  ): this.type = js.native
  def unionAll(
    arg1: QBOrCallback[this.type],
    arg2: QBOrCallback[this.type],
    arg3: QBOrCallback[this.type],
    arg4: QBOrCallback[this.type],
    arg5: QBOrCallback[this.type],
    wrap: Boolean
  ): this.type = js.native
  def unionAll(
    arg1: QBOrCallback[this.type],
    arg2: QBOrCallback[this.type],
    arg3: QBOrCallback[this.type],
    arg4: QBOrCallback[this.type],
    wrap: Boolean
  ): this.type = js.native
  def unionAll(
    arg1: QBOrCallback[this.type],
    arg2: QBOrCallback[this.type],
    arg3: QBOrCallback[this.type],
    wrap: Boolean
  ): this.type = js.native
  def unionAll(arg1: QBOrCallback[this.type], arg2: QBOrCallback[this.type], wrap: Boolean): this.type = js.native
  def unionAll(arg1: QBOrCallback[this.type], wrap: Boolean): this.type = js.native
  def unionAll(callbacksOrBuilders: js.Array[QBOrCallback[this.type]]): this.type = js.native
  def unionAll(callbacksOrBuilders: js.Array[QBOrCallback[this.type]], wrap: Boolean): this.type = js.native
  def unrelate(): NumberQueryBuilder[this.type] = js.native
  def update(): NumberQueryBuilder[this.type] = js.native
  def update(update: PartialModelObject[M]): NumberQueryBuilder[this.type] = js.native
  def updateAndFetch(update: PartialModelObject[M]): SingleQueryBuilder[this.type] = js.native
  def updateAndFetchById(id: MaybeCompositeId, update: PartialModelObject[M]): SingleQueryBuilder[this.type] = js.native
  def upsertGraph[QB /* <: AnyQueryBuilder */](graph: js.Array[PartialModelGraph[M, M with GraphParameters]]): ArrayQueryBuilder[QB] = js.native
  def upsertGraph[QB /* <: AnyQueryBuilder */](graph: js.Array[PartialModelGraph[M, M with GraphParameters]], options: UpsertGraphOptions): ArrayQueryBuilder[QB] = js.native
  def upsertGraph[QB /* <: AnyQueryBuilder */](graph: PartialModelGraph[M, M with GraphParameters]): SingleQueryBuilder[QB] = js.native
  def upsertGraph[QB /* <: AnyQueryBuilder */](graph: PartialModelGraph[M, M with GraphParameters], options: UpsertGraphOptions): SingleQueryBuilder[QB] = js.native
  def upsertGraphAndFetch[QB /* <: AnyQueryBuilder */](graph: js.Array[PartialModelGraph[M, M with GraphParameters]]): ArrayQueryBuilder[QB] = js.native
  def upsertGraphAndFetch[QB /* <: AnyQueryBuilder */](graph: js.Array[PartialModelGraph[M, M with GraphParameters]], options: UpsertGraphOptions): ArrayQueryBuilder[QB] = js.native
  def upsertGraphAndFetch[QB /* <: AnyQueryBuilder */](graph: PartialModelGraph[M, M with GraphParameters]): SingleQueryBuilder[QB] = js.native
  def upsertGraphAndFetch[QB /* <: AnyQueryBuilder */](graph: PartialModelGraph[M, M with GraphParameters], options: UpsertGraphOptions): SingleQueryBuilder[QB] = js.native
  def where(cb: CallbackVoid[this.type]): this.type = js.native
  def where(col: ColumnRef, expr: Expression[PrimitiveValue]): this.type = js.native
  def where(col: ColumnRef, op: Operator, expr: Expression[PrimitiveValue]): this.type = js.native
  def where(condition: Boolean): this.type = js.native
  // We must allow any keys in the object. The previous type
  // is kind of useless, but maybe one day vscode and other
  // tools can autocomplete using it.
  def where(obj: js.Object): this.type = js.native
  def where(obj: PartialModelObject[ModelType[this.type]]): this.type = js.native
  def where(raw: Raw_): this.type = js.native
  def where[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], expr: Expression[PrimitiveValue]): this.type = js.native
  // These must come first so that we get autocomplete.
  def where[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], op: Operator, expr: Expression[PrimitiveValue]): this.type = js.native
  def where[QBA /* <: AnyQueryBuilder */](qb: QBA): this.type = js.native
  def whereBetween(column: ColumnRef, range: js.Tuple2[Expression[PrimitiveValue], Expression[PrimitiveValue]]): this.type = js.native
  def whereColumn(col1: ColumnRef, col2: ColumnRef): this.type = js.native
  def whereColumn(col1: ColumnRef, op: Operator, col2: ColumnRef): this.type = js.native
  def whereColumn[QBP /* <: this.type */](col1: ModelProps[ModelType[QBP]], col2: ColumnRef): this.type = js.native
  // These must come first so that we get autocomplete.
  def whereColumn[QBP /* <: this.type */](col1: ModelProps[ModelType[QBP]], op: Operator, col2: ColumnRef): this.type = js.native
  def whereComposite(column: js.Array[ColumnRef], expr: js.Array[Expression[PrimitiveValue]]): this.type = js.native
  def whereComposite(column: js.Array[ColumnRef], op: Operator, expr: js.Array[Expression[PrimitiveValue]]): this.type = js.native
  def whereComposite(column: js.Array[ColumnRef], qb: AnyQueryBuilder): this.type = js.native
  def whereComposite(column: ColumnRef, expr: Expression[PrimitiveValue]): this.type = js.native
  def whereComposite(column: ColumnRef, op: Operator, expr: Expression[PrimitiveValue]): this.type = js.native
  def whereExists(cb: CallbackVoid[this.type]): this.type = js.native
  def whereExists(raw: Raw_): this.type = js.native
  def whereExists[QBA /* <: AnyQueryBuilder */](qb: QBA): this.type = js.native
  def whereIn(col: js.Array[ColumnRef], cb: CallbackVoid[this.type]): this.type = js.native
  def whereIn(col: js.Array[ColumnRef], expr: js.Array[Expression[PrimitiveValue]]): this.type = js.native
  def whereIn(col: js.Array[ColumnRef], qb: AnyQueryBuilder): this.type = js.native
  def whereIn(col: ColumnRef, cb: CallbackVoid[this.type]): this.type = js.native
  def whereIn(col: ColumnRef, expr: js.Array[Expression[PrimitiveValue]]): this.type = js.native
  def whereIn(col: ColumnRef, qb: AnyQueryBuilder): this.type = js.native
  def whereIn[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], cb: CallbackVoid[this.type]): this.type = js.native
  // These must come first so that we get autocomplete.
  def whereIn[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], expr: Expression[PrimitiveValue]): this.type = js.native
  def whereIn[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], qb: AnyQueryBuilder): this.type = js.native
  def whereInComposite(column: js.Array[ColumnRef], expr: js.Array[js.Array[Expression[PrimitiveValue]]]): this.type = js.native
  def whereInComposite(column: js.Array[ColumnRef], qb: AnyQueryBuilder): this.type = js.native
  def whereInComposite(column: ColumnRef, expr: js.Array[Expression[PrimitiveValue]]): this.type = js.native
  def whereInComposite(column: ColumnRef, qb: AnyQueryBuilder): this.type = js.native
  def whereJsonHasAll(fieldExpression: FieldExpression, keys: String): this.type = js.native
  def whereJsonHasAll(fieldExpression: FieldExpression, keys: js.Array[String]): this.type = js.native
  def whereJsonHasAny(fieldExpression: FieldExpression, keys: String): this.type = js.native
  def whereJsonHasAny(fieldExpression: FieldExpression, keys: js.Array[String]): this.type = js.native
  def whereJsonIsArray(fieldExpression: FieldExpression): this.type = js.native
  def whereJsonIsObject(fieldExpression: FieldExpression): this.type = js.native
  def whereJsonNotArray(fieldExpression: FieldExpression): this.type = js.native
  def whereJsonNotObject(fieldExpression: FieldExpression): this.type = js.native
  def whereJsonNotSubsetOf(fieldExpression: FieldExpression, jsonObjectOrFieldExpression: JsonObjectOrFieldExpression): this.type = js.native
  def whereJsonNotSupersetOf(fieldExpression: FieldExpression, jsonObjectOrFieldExpression: JsonObjectOrFieldExpression): this.type = js.native
  def whereJsonSubsetOf(fieldExpression: FieldExpression, jsonObjectOrFieldExpression: JsonObjectOrFieldExpression): this.type = js.native
  def whereJsonSupersetOf(fieldExpression: FieldExpression, jsonObjectOrFieldExpression: JsonObjectOrFieldExpression): this.type = js.native
  def whereNot(cb: CallbackVoid[this.type]): this.type = js.native
  def whereNot(col: ColumnRef, expr: Expression[PrimitiveValue]): this.type = js.native
  def whereNot(col: ColumnRef, op: Operator, expr: Expression[PrimitiveValue]): this.type = js.native
  def whereNot(condition: Boolean): this.type = js.native
  // We must allow any keys in the object. The previous type
  // is kind of useless, but maybe one day vscode and other
  // tools can autocomplete using it.
  def whereNot(obj: js.Object): this.type = js.native
  def whereNot(obj: PartialModelObject[ModelType[this.type]]): this.type = js.native
  def whereNot(raw: Raw_): this.type = js.native
  def whereNot[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], expr: Expression[PrimitiveValue]): this.type = js.native
  // These must come first so that we get autocomplete.
  def whereNot[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], op: Operator, expr: Expression[PrimitiveValue]): this.type = js.native
  def whereNot[QBA /* <: AnyQueryBuilder */](qb: QBA): this.type = js.native
  def whereNotBetween(column: ColumnRef, range: js.Tuple2[Expression[PrimitiveValue], Expression[PrimitiveValue]]): this.type = js.native
  def whereNotColumn(col1: ColumnRef, col2: ColumnRef): this.type = js.native
  def whereNotColumn(col1: ColumnRef, op: Operator, col2: ColumnRef): this.type = js.native
  def whereNotColumn[QBP /* <: this.type */](col1: ModelProps[ModelType[QBP]], col2: ColumnRef): this.type = js.native
  // These must come first so that we get autocomplete.
  def whereNotColumn[QBP /* <: this.type */](col1: ModelProps[ModelType[QBP]], op: Operator, col2: ColumnRef): this.type = js.native
  def whereNotExists(cb: CallbackVoid[this.type]): this.type = js.native
  def whereNotExists(raw: Raw_): this.type = js.native
  def whereNotExists[QBA /* <: AnyQueryBuilder */](qb: QBA): this.type = js.native
  def whereNotIn(col: js.Array[ColumnRef], cb: CallbackVoid[this.type]): this.type = js.native
  def whereNotIn(col: js.Array[ColumnRef], expr: js.Array[Expression[PrimitiveValue]]): this.type = js.native
  def whereNotIn(col: js.Array[ColumnRef], qb: AnyQueryBuilder): this.type = js.native
  def whereNotIn(col: ColumnRef, cb: CallbackVoid[this.type]): this.type = js.native
  def whereNotIn(col: ColumnRef, expr: js.Array[Expression[PrimitiveValue]]): this.type = js.native
  def whereNotIn(col: ColumnRef, qb: AnyQueryBuilder): this.type = js.native
  def whereNotIn[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], cb: CallbackVoid[this.type]): this.type = js.native
  // These must come first so that we get autocomplete.
  def whereNotIn[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], expr: Expression[PrimitiveValue]): this.type = js.native
  def whereNotIn[QBP /* <: this.type */](col: ModelProps[ModelType[QBP]], qb: AnyQueryBuilder): this.type = js.native
  def whereNotNull(column: ColumnRef): this.type = js.native
  def whereNull(column: ColumnRef): this.type = js.native
  def whereRaw(sql: String, bindings: js.Any*): this.type = js.native
  def whereWrapped(cb: CallbackVoid[this.type]): this.type = js.native
  def `with`(alias: String, expr: AnyQueryBuilder): this.type = js.native
  def `with`(alias: String, expr: CallbackVoid[this.type]): this.type = js.native
  def `with`(alias: String, expr: Raw_): this.type = js.native
  def withGraphFetched(expr: RelationExpression[M]): this.type = js.native
  def withGraphFetched(expr: RelationExpression[M], options: GraphOptions): this.type = js.native
  def withGraphJoined(expr: RelationExpression[M]): this.type = js.native
  def withGraphJoined(expr: RelationExpression[M], options: GraphOptions): this.type = js.native
  def withSchema(arg: String): this.type = js.native
  def withWrapped(alias: String, expr: AnyQueryBuilder): this.type = js.native
  def withWrapped(alias: String, expr: CallbackVoid[this.type]): this.type = js.native
  def withWrapped(alias: String, expr: Raw_): this.type = js.native
}

/* static members */
@JSImport("objection", "QueryBuilder")
@js.native
object QueryBuilder extends js.Object {
  @JSName("forClass")
  var forClass_Original: ForClassMethod = js.native
  def forClass[M /* <: Model */](modelClass: ModelConstructor[M]): QueryBuilderType[M] = js.native
}

