package typings.monk.monkMod

import org.scalablytyped.runtime.StringDictionary
import typings.monk.Anon_0
import typings.monk.Anon_01
import typings.monk.Anon_01AvgObjSize
import typings.monk.Anon_01NNModified
import typings.monk.Anon_Cursor
import typings.monk.Anon_DeletedCount
import typings.monk.monkBooleans.`true`
import typings.monk.monkNumbers.`-1`
import typings.monk.monkNumbers.`1`
import typings.monk.monkStrings.`ns not found`
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monk", "ICollection")
@js.native
class ICollection[T] () extends js.Object {
  val manager: IMonkManager = js.native
  val middlewares: js.Array[TMiddleware] = js.native
  val name: String = js.native
  var options: js.Object = js.native
  def aggregate[U](stages: js.Array[_]): Unit = js.native
  def aggregate[U](stages: js.Array[_], options: js.Object): Unit = js.native
  def aggregate[U](
    stages: js.Array[_],
    options: js.Object,
    callback: js.Function2[/* err */ Error | Null, /* data */ U, Unit]
  ): Unit = js.native
  @JSName("aggregate")
  def aggregate_U_Promise[U](stages: js.Array[_]): js.Promise[U] = js.native
  @JSName("aggregate")
  def aggregate_U_Promise[U](stages: js.Array[_], options: js.Object): js.Promise[U] = js.native
  def bulkWrite[U](operations: js.Array[_]): Unit = js.native
  def bulkWrite[U](operations: js.Array[_], options: js.Object): Unit = js.native
  def bulkWrite[U](
    operations: js.Array[_],
    options: js.Object,
    callback: js.Function2[/* err */ Error | Null, /* data */ U, Unit]
  ): Unit = js.native
  @JSName("bulkWrite")
  def bulkWrite_U_Promise[U](operations: js.Array[_]): js.Promise[U] = js.native
  @JSName("bulkWrite")
  def bulkWrite_U_Promise[U](operations: js.Array[_], options: js.Object): js.Promise[U] = js.native
  def count(): Unit = js.native
  def count(query: TQuery): Unit = js.native
  def count(query: TQuery, options: js.Object): Unit = js.native
  def count(
    query: TQuery,
    options: js.Object,
    callback: js.Function2[/* err */ Error | Null, /* data */ Double, Unit]
  ): Unit = js.native
  @JSName("count")
  def count_Promise(): js.Promise[Double] = js.native
  @JSName("count")
  def count_Promise(query: TQuery): js.Promise[Double] = js.native
  @JSName("count")
  def count_Promise(query: TQuery, options: js.Object): js.Promise[Double] = js.native
  def createIndex(): Unit = js.native
  def createIndex(fields: StringDictionary[`1` | `-1`]): Unit = js.native
  def createIndex(fields: StringDictionary[`1` | `-1`], options: js.Object): Unit = js.native
  def createIndex(
    fields: StringDictionary[`1` | `-1`],
    options: js.Object,
    callback: js.Function2[/* err */ Error | Null, /* data */ String, Unit]
  ): Unit = js.native
  def createIndex(fields: TFields): Unit = js.native
  def createIndex(fields: TFields, options: js.Object): Unit = js.native
  def createIndex(
    fields: TFields,
    options: js.Object,
    callback: js.Function2[/* err */ Error | Null, /* data */ String, Unit]
  ): Unit = js.native
  @JSName("createIndex")
  def createIndex_Promise(): js.Promise[String] = js.native
  @JSName("createIndex")
  def createIndex_Promise(fields: StringDictionary[`1` | `-1`]): js.Promise[String] = js.native
  @JSName("createIndex")
  def createIndex_Promise(fields: StringDictionary[`1` | `-1`], options: js.Object): js.Promise[String] = js.native
  @JSName("createIndex")
  def createIndex_Promise(fields: TFields): js.Promise[String] = js.native
  @JSName("createIndex")
  def createIndex_Promise(fields: TFields, options: js.Object): js.Promise[String] = js.native
  def distinct(field: String): Unit = js.native
  def distinct(field: String, query: TQuery): Unit = js.native
  def distinct(field: String, query: TQuery, options: js.Object): Unit = js.native
  def distinct(
    field: String,
    query: TQuery,
    options: js.Object,
    callback: js.Function2[/* err */ Error | Null, /* data */ Double, Unit]
  ): Unit = js.native
  @JSName("distinct")
  def distinct_Promise(field: String): js.Promise[Double] = js.native
  @JSName("distinct")
  def distinct_Promise(field: String, query: TQuery): js.Promise[Double] = js.native
  @JSName("distinct")
  def distinct_Promise(field: String, query: TQuery, options: js.Object): js.Promise[Double] = js.native
  def drop(): Unit = js.native
  def drop(callback: js.Function2[/* err */ Error | Null, /* data */ (`ns not found`) | `true`, Unit]): Unit = js.native
  def dropIndex(): Unit = js.native
  def dropIndex(fields: TFields): Unit = js.native
  def dropIndex(fields: TFields, options: js.Object): Unit = js.native
  def dropIndex(
    fields: TFields,
    options: js.Object,
    callback: js.Function2[/* err */ Error | Null, /* data */ Anon_0, Unit]
  ): Unit = js.native
  @JSName("dropIndex")
  def dropIndex_Promise(): js.Promise[Anon_0] = js.native
  @JSName("dropIndex")
  def dropIndex_Promise(fields: TFields): js.Promise[Anon_0] = js.native
  @JSName("dropIndex")
  def dropIndex_Promise(fields: TFields, options: js.Object): js.Promise[Anon_0] = js.native
  def dropIndexes(): Unit = js.native
  def dropIndexes(callback: js.Function2[/* err */ Error | Null, /* data */ Anon_01, Unit]): Unit = js.native
  @JSName("dropIndexes")
  def dropIndexes_Promise(): js.Promise[Anon_01] = js.native
  @JSName("drop")
  def drop_Promise(): js.Promise[(`ns not found`) | `true`] = js.native
  def find[U](): js.Promise[js.Array[U]] with Anon_Cursor[U] = js.native
  def find[U](query: TQuery): js.Promise[js.Array[U]] with Anon_Cursor[U] = js.native
  def find[U](query: TQuery, options: js.Object): js.Promise[js.Array[U]] with Anon_Cursor[U] = js.native
  def find[U](
    query: TQuery,
    options: js.Object,
    callback: js.Function2[/* err */ Error | Null, /* data */ js.Array[U] with Anon_Cursor[U], Unit]
  ): Unit = js.native
  def findOne[U](): Unit = js.native
  def findOne[U](query: TQuery): Unit = js.native
  def findOne[U](query: TQuery, options: js.Object): Unit = js.native
  def findOne[U](
    query: TQuery,
    options: js.Object,
    callback: js.Function2[/* err */ Error | Null, /* data */ js.UndefOr[U], Unit]
  ): Unit = js.native
  def findOneAndDelete[U](): Unit = js.native
  def findOneAndDelete[U](query: TQuery): Unit = js.native
  def findOneAndDelete[U](query: TQuery, options: js.Object): Unit = js.native
  def findOneAndDelete[U](
    query: TQuery,
    options: js.Object,
    callback: js.Function2[/* err */ Error | Null, /* data */ js.UndefOr[U], Unit]
  ): Unit = js.native
  @JSName("findOneAndDelete")
  def findOneAndDelete_U_Promise[U](): js.Promise[js.UndefOr[U]] = js.native
  @JSName("findOneAndDelete")
  def findOneAndDelete_U_Promise[U](query: TQuery): js.Promise[js.UndefOr[U]] = js.native
  @JSName("findOneAndDelete")
  def findOneAndDelete_U_Promise[U](query: TQuery, options: js.Object): js.Promise[js.UndefOr[U]] = js.native
  def findOneAndUpdate[U](query: TQuery, update: js.Object): Unit = js.native
  def findOneAndUpdate[U](query: TQuery, update: js.Object, options: js.Object): Unit = js.native
  def findOneAndUpdate[U](
    query: TQuery,
    update: js.Object,
    options: js.Object,
    callback: js.Function2[/* err */ Error | Null, /* data */ U, Unit]
  ): Unit = js.native
  @JSName("findOneAndUpdate")
  def findOneAndUpdate_U_Promise[U](query: TQuery, update: js.Object): js.Promise[js.UndefOr[U]] = js.native
  @JSName("findOneAndUpdate")
  def findOneAndUpdate_U_Promise[U](query: TQuery, update: js.Object, options: js.Object): js.Promise[js.UndefOr[U]] = js.native
  @JSName("findOne")
  def findOne_U_Promise[U](): js.Promise[js.UndefOr[U]] = js.native
  @JSName("findOne")
  def findOne_U_Promise[U](query: TQuery): js.Promise[js.UndefOr[U]] = js.native
  @JSName("findOne")
  def findOne_U_Promise[U](query: TQuery, options: js.Object): js.Promise[js.UndefOr[U]] = js.native
  @JSName("find")
  def find_U_Unit[U](): Unit = js.native
  @JSName("find")
  def find_U_Unit[U](query: TQuery): Unit = js.native
  @JSName("find")
  def find_U_Unit[U](query: TQuery, options: js.Object): Unit = js.native
  def geoHaystackSearch[U](x: Double, y: Double, options: js.Object): Unit = js.native
  def geoHaystackSearch[U](
    x: Double,
    y: Double,
    options: js.Object,
    callback: js.Function2[/* err */ Error | Null, /* data */ js.Array[U], Unit]
  ): Unit = js.native
  @JSName("geoHaystackSearch")
  def geoHaystackSearch_U_Promise[U](x: Double, y: Double, options: js.Object): js.Promise[js.Array[U]] = js.native
  def group[U](
    keys: js.Any,
    condition: js.Any,
    initial: js.Any,
    reduce: js.Any,
    finalize: js.Any,
    command: js.Any
  ): Unit = js.native
  def group[U](
    keys: js.Any,
    condition: js.Any,
    initial: js.Any,
    reduce: js.Any,
    finalize: js.Any,
    command: js.Any,
    options: js.Object
  ): Unit = js.native
  def group[U](
    keys: js.Any,
    condition: js.Any,
    initial: js.Any,
    reduce: js.Any,
    finalize: js.Any,
    command: js.Any,
    options: js.Object,
    callback: js.Function2[/* err */ Error | Null, /* data */ js.Any, Unit]
  ): Unit = js.native
  @JSName("group")
  def group_U_Promise[U](
    keys: js.Any,
    condition: js.Any,
    initial: js.Any,
    reduce: js.Any,
    finalize: js.Any,
    command: js.Any
  ): js.Promise[_] = js.native
  @JSName("group")
  def group_U_Promise[U](
    keys: js.Any,
    condition: js.Any,
    initial: js.Any,
    reduce: js.Any,
    finalize: js.Any,
    command: js.Any,
    options: js.Object
  ): js.Promise[_] = js.native
  def indexes(): Unit = js.native
  def indexes(
    callback: js.Function2[
      /* err */ Error | Null, 
      /* data */ js.Array[StringDictionary[js.Array[js.Tuple2[String, `1` | `-1`]]]], 
      Unit
    ]
  ): Unit = js.native
  @JSName("indexes")
  def indexes_Promise(): js.Promise[js.Array[StringDictionary[js.Array[js.Tuple2[String, `1` | `-1`]]]]] = js.native
  def insert[U](data: js.Array[js.Object]): Unit = js.native
  def insert[U](data: js.Array[js.Object], options: js.Object): Unit = js.native
  def insert[U](
    data: js.Array[js.Object],
    options: js.Object,
    callback: js.Function2[/* err */ Error | Null, /* data */ U, Unit]
  ): Unit = js.native
  def insert[U](data: js.Object): Unit = js.native
  def insert[U](data: js.Object, options: js.Object): Unit = js.native
  def insert[U](
    data: js.Object,
    options: js.Object,
    callback: js.Function2[/* err */ Error | Null, /* data */ U, Unit]
  ): Unit = js.native
  @JSName("insert")
  def insert_U_Promise[U](data: js.Array[js.Object]): js.Promise[U] = js.native
  @JSName("insert")
  def insert_U_Promise[U](data: js.Array[js.Object], options: js.Object): js.Promise[U] = js.native
  @JSName("insert")
  def insert_U_Promise[U](data: js.Object): js.Promise[U] = js.native
  @JSName("insert")
  def insert_U_Promise[U](data: js.Object, options: js.Object): js.Promise[U] = js.native
  def mapReduce(
    map: js.Function0[_],
    reduce: js.Function2[/* key */ String, /* values */ js.Array[_], _],
    options: js.Object
  ): Unit = js.native
  def mapReduce(
    map: js.Function0[_],
    reduce: js.Function2[/* key */ String, /* values */ js.Array[_], _],
    options: js.Object,
    callback: js.Function2[/* err */ Error | Null, /* data */ js.Any, Unit]
  ): Unit = js.native
  @JSName("mapReduce")
  def mapReduce_Promise(
    map: js.Function0[_],
    reduce: js.Function2[/* key */ String, /* values */ js.Array[_], _],
    options: js.Object
  ): js.Promise[_] = js.native
  def remove(): Unit = js.native
  def remove(query: TQuery): Unit = js.native
  def remove(query: TQuery, options: js.Object): Unit = js.native
  def remove(
    query: TQuery,
    options: js.Object,
    callback: js.Function2[/* err */ Error | Null, /* data */ Anon_DeletedCount, Unit]
  ): Unit = js.native
  @JSName("remove")
  def remove_Promise(): js.Promise[Anon_DeletedCount] = js.native
  @JSName("remove")
  def remove_Promise(query: TQuery): js.Promise[Anon_DeletedCount] = js.native
  @JSName("remove")
  def remove_Promise(query: TQuery, options: js.Object): js.Promise[Anon_DeletedCount] = js.native
  def stats(): Unit = js.native
  def stats(options: js.Object): Unit = js.native
  def stats(
    options: js.Object,
    callback: js.Function2[/* err */ Error | Null, /* data */ Anon_01AvgObjSize, Unit]
  ): Unit = js.native
  @JSName("stats")
  def stats_Promise(): js.Promise[Anon_01AvgObjSize] = js.native
  @JSName("stats")
  def stats_Promise(options: js.Object): js.Promise[Anon_01AvgObjSize] = js.native
  def update(query: TQuery, update: js.Object): Unit = js.native
  def update(query: TQuery, update: js.Object, options: js.Object): Unit = js.native
  def update(
    query: TQuery,
    update: js.Object,
    options: js.Object,
    callback: js.Function2[/* err */ Error | Null, /* data */ Anon_01NNModified, Unit]
  ): Unit = js.native
  @JSName("update")
  def update_Promise(query: TQuery, update: js.Object): js.Promise[Anon_01NNModified] = js.native
  @JSName("update")
  def update_Promise(query: TQuery, update: js.Object, options: js.Object): js.Promise[Anon_01NNModified] = js.native
}

