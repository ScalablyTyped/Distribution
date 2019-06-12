package typings
package monkLib.monkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monk", "ICollection")
@js.native
class ICollection[T] () extends js.Object {
  val manager: IMonkManager = js.native
  val middlewares: js.Array[TMiddleware] = js.native
  val name: java.lang.String = js.native
  var options: js.Object = js.native
  def aggregate[U](stages: js.Array[_]): scala.Unit = js.native
  def aggregate[U](stages: js.Array[_], options: js.Object): scala.Unit = js.native
  def aggregate[U](
    stages: js.Array[_],
    options: js.Object,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* data */ U, scala.Unit]
  ): scala.Unit = js.native
  @JSName("aggregate")
  def aggregate_UPromise[U](stages: js.Array[_]): js.Promise[U] = js.native
  @JSName("aggregate")
  def aggregate_UPromise[U](stages: js.Array[_], options: js.Object): js.Promise[U] = js.native
  def bulkWrite[U](operations: js.Array[_]): scala.Unit = js.native
  def bulkWrite[U](operations: js.Array[_], options: js.Object): scala.Unit = js.native
  def bulkWrite[U](
    operations: js.Array[_],
    options: js.Object,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* data */ U, scala.Unit]
  ): scala.Unit = js.native
  @JSName("bulkWrite")
  def bulkWrite_UPromise[U](operations: js.Array[_]): js.Promise[U] = js.native
  @JSName("bulkWrite")
  def bulkWrite_UPromise[U](operations: js.Array[_], options: js.Object): js.Promise[U] = js.native
  def count(): js.Promise[scala.Double] = js.native
  def count(query: TQuery): js.Promise[scala.Double] = js.native
  def count(query: TQuery, options: js.Object): js.Promise[scala.Double] = js.native
  def count(
    query: TQuery,
    options: js.Object,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* data */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  @JSName("count")
  def count_Unit(): scala.Unit = js.native
  @JSName("count")
  def count_Unit(query: TQuery): scala.Unit = js.native
  @JSName("count")
  def count_Unit(query: TQuery, options: js.Object): scala.Unit = js.native
  def createIndex(): js.Promise[java.lang.String] = js.native
  def createIndex(fields: TFields): js.Promise[java.lang.String] = js.native
  def createIndex(fields: TFields, options: js.Object): js.Promise[java.lang.String] = js.native
  def createIndex(
    fields: TFields,
    options: js.Object,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* data */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def createIndex(
    fields: org.scalablytyped.runtime.StringDictionary[monkLib.monkLibNumbers.`1` | monkLib.monkLibNumbers.`-1`]
  ): js.Promise[java.lang.String] = js.native
  def createIndex(
    fields: org.scalablytyped.runtime.StringDictionary[monkLib.monkLibNumbers.`1` | monkLib.monkLibNumbers.`-1`],
    options: js.Object
  ): js.Promise[java.lang.String] = js.native
  def createIndex(
    fields: org.scalablytyped.runtime.StringDictionary[monkLib.monkLibNumbers.`1` | monkLib.monkLibNumbers.`-1`],
    options: js.Object,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* data */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  @JSName("createIndex")
  def createIndex_Unit(): scala.Unit = js.native
  @JSName("createIndex")
  def createIndex_Unit(fields: TFields): scala.Unit = js.native
  @JSName("createIndex")
  def createIndex_Unit(fields: TFields, options: js.Object): scala.Unit = js.native
  @JSName("createIndex")
  def createIndex_Unit(
    fields: org.scalablytyped.runtime.StringDictionary[monkLib.monkLibNumbers.`1` | monkLib.monkLibNumbers.`-1`]
  ): scala.Unit = js.native
  @JSName("createIndex")
  def createIndex_Unit(
    fields: org.scalablytyped.runtime.StringDictionary[monkLib.monkLibNumbers.`1` | monkLib.monkLibNumbers.`-1`],
    options: js.Object
  ): scala.Unit = js.native
  def distinct(field: java.lang.String): js.Promise[scala.Double] = js.native
  def distinct(field: java.lang.String, query: TQuery): js.Promise[scala.Double] = js.native
  def distinct(field: java.lang.String, query: TQuery, options: js.Object): js.Promise[scala.Double] = js.native
  def distinct(
    field: java.lang.String,
    query: TQuery,
    options: js.Object,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* data */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  @JSName("distinct")
  def distinct_Unit(field: java.lang.String): scala.Unit = js.native
  @JSName("distinct")
  def distinct_Unit(field: java.lang.String, query: TQuery): scala.Unit = js.native
  @JSName("distinct")
  def distinct_Unit(field: java.lang.String, query: TQuery, options: js.Object): scala.Unit = js.native
  def drop(): js.Promise[(monkLib.monkLibStrings.`ns not found`) | monkLib.monkLibNumbers.`true`] = js.native
  def drop(
    callback: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* data */ (monkLib.monkLibStrings.`ns not found`) | monkLib.monkLibNumbers.`true`, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def dropIndex(): js.Promise[monkLib.Anon_0] = js.native
  def dropIndex(fields: TFields): js.Promise[monkLib.Anon_0] = js.native
  def dropIndex(fields: TFields, options: js.Object): js.Promise[monkLib.Anon_0] = js.native
  def dropIndex(
    fields: TFields,
    options: js.Object,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* data */ monkLib.Anon_0, scala.Unit]
  ): scala.Unit = js.native
  @JSName("dropIndex")
  def dropIndex_Unit(): scala.Unit = js.native
  @JSName("dropIndex")
  def dropIndex_Unit(fields: TFields): scala.Unit = js.native
  @JSName("dropIndex")
  def dropIndex_Unit(fields: TFields, options: js.Object): scala.Unit = js.native
  def dropIndexes(): js.Promise[monkLib.Anon_01] = js.native
  def dropIndexes(
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* data */ monkLib.Anon_01, scala.Unit]
  ): scala.Unit = js.native
  @JSName("dropIndexes")
  def dropIndexes_Unit(): scala.Unit = js.native
  @JSName("drop")
  def drop_Unit(): scala.Unit = js.native
  def find[U](): js.Promise[js.Array[U]] with monkLib.Anon_Cursor[U] = js.native
  def find[U](query: TQuery): js.Promise[js.Array[U]] with monkLib.Anon_Cursor[U] = js.native
  def find[U](query: TQuery, options: js.Object): js.Promise[js.Array[U]] with monkLib.Anon_Cursor[U] = js.native
  def find[U](
    query: TQuery,
    options: js.Object,
    callback: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* data */ js.Array[U] with monkLib.Anon_Cursor[U], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def findOne[U](): scala.Unit = js.native
  def findOne[U](query: TQuery): scala.Unit = js.native
  def findOne[U](query: TQuery, options: js.Object): scala.Unit = js.native
  def findOne[U](
    query: TQuery,
    options: js.Object,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* data */ js.UndefOr[U], scala.Unit]
  ): scala.Unit = js.native
  def findOneAndDelete[U](): scala.Unit = js.native
  def findOneAndDelete[U](query: TQuery): scala.Unit = js.native
  def findOneAndDelete[U](query: TQuery, options: js.Object): scala.Unit = js.native
  def findOneAndDelete[U](
    query: TQuery,
    options: js.Object,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* data */ js.UndefOr[U], scala.Unit]
  ): scala.Unit = js.native
  @JSName("findOneAndDelete")
  def findOneAndDelete_UPromise[U](): js.Promise[js.UndefOr[U]] = js.native
  @JSName("findOneAndDelete")
  def findOneAndDelete_UPromise[U](query: TQuery): js.Promise[js.UndefOr[U]] = js.native
  @JSName("findOneAndDelete")
  def findOneAndDelete_UPromise[U](query: TQuery, options: js.Object): js.Promise[js.UndefOr[U]] = js.native
  def findOneAndUpdate[U](query: TQuery, update: js.Object): scala.Unit = js.native
  def findOneAndUpdate[U](query: TQuery, update: js.Object, options: js.Object): scala.Unit = js.native
  def findOneAndUpdate[U](
    query: TQuery,
    update: js.Object,
    options: js.Object,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* data */ U, scala.Unit]
  ): scala.Unit = js.native
  @JSName("findOneAndUpdate")
  def findOneAndUpdate_UPromise[U](query: TQuery, update: js.Object): js.Promise[js.UndefOr[U]] = js.native
  @JSName("findOneAndUpdate")
  def findOneAndUpdate_UPromise[U](query: TQuery, update: js.Object, options: js.Object): js.Promise[js.UndefOr[U]] = js.native
  @JSName("findOne")
  def findOne_UPromise[U](): js.Promise[js.UndefOr[U]] = js.native
  @JSName("findOne")
  def findOne_UPromise[U](query: TQuery): js.Promise[js.UndefOr[U]] = js.native
  @JSName("findOne")
  def findOne_UPromise[U](query: TQuery, options: js.Object): js.Promise[js.UndefOr[U]] = js.native
  @JSName("find")
  def find_UUnit[U](): scala.Unit = js.native
  @JSName("find")
  def find_UUnit[U](query: TQuery): scala.Unit = js.native
  @JSName("find")
  def find_UUnit[U](query: TQuery, options: js.Object): scala.Unit = js.native
  def geoHaystackSearch[U](x: scala.Double, y: scala.Double, options: js.Object): scala.Unit = js.native
  def geoHaystackSearch[U](
    x: scala.Double,
    y: scala.Double,
    options: js.Object,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* data */ js.Array[U], scala.Unit]
  ): scala.Unit = js.native
  @JSName("geoHaystackSearch")
  def geoHaystackSearch_UPromise[U](x: scala.Double, y: scala.Double, options: js.Object): js.Promise[js.Array[U]] = js.native
  def group[U](
    keys: js.Any,
    condition: js.Any,
    initial: js.Any,
    reduce: js.Any,
    finalize: js.Any,
    command: js.Any
  ): scala.Unit = js.native
  def group[U](
    keys: js.Any,
    condition: js.Any,
    initial: js.Any,
    reduce: js.Any,
    finalize: js.Any,
    command: js.Any,
    options: js.Object
  ): scala.Unit = js.native
  def group[U](
    keys: js.Any,
    condition: js.Any,
    initial: js.Any,
    reduce: js.Any,
    finalize: js.Any,
    command: js.Any,
    options: js.Object,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  @JSName("group")
  def group_UPromise[U](
    keys: js.Any,
    condition: js.Any,
    initial: js.Any,
    reduce: js.Any,
    finalize: js.Any,
    command: js.Any
  ): js.Promise[_] = js.native
  @JSName("group")
  def group_UPromise[U](
    keys: js.Any,
    condition: js.Any,
    initial: js.Any,
    reduce: js.Any,
    finalize: js.Any,
    command: js.Any,
    options: js.Object
  ): js.Promise[_] = js.native
  def indexes(): js.Promise[
    js.Array[
      org.scalablytyped.runtime.StringDictionary[
        js.Array[
          js.Tuple2[java.lang.String, monkLib.monkLibNumbers.`1` | monkLib.monkLibNumbers.`-1`]
        ]
      ]
    ]
  ] = js.native
  def indexes(
    callback: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* data */ js.Array[
        org.scalablytyped.runtime.StringDictionary[
          js.Array[
            js.Tuple2[java.lang.String, monkLib.monkLibNumbers.`1` | monkLib.monkLibNumbers.`-1`]
          ]
        ]
      ], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("indexes")
  def indexes_Unit(): scala.Unit = js.native
  def insert[U](data: js.Array[js.Object]): scala.Unit = js.native
  def insert[U](data: js.Array[js.Object], options: js.Object): scala.Unit = js.native
  def insert[U](
    data: js.Array[js.Object],
    options: js.Object,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* data */ U, scala.Unit]
  ): scala.Unit = js.native
  def insert[U](data: js.Object): scala.Unit = js.native
  def insert[U](data: js.Object, options: js.Object): scala.Unit = js.native
  def insert[U](
    data: js.Object,
    options: js.Object,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* data */ U, scala.Unit]
  ): scala.Unit = js.native
  @JSName("insert")
  def insert_UPromise[U](data: js.Array[js.Object]): js.Promise[U] = js.native
  @JSName("insert")
  def insert_UPromise[U](data: js.Array[js.Object], options: js.Object): js.Promise[U] = js.native
  @JSName("insert")
  def insert_UPromise[U](data: js.Object): js.Promise[U] = js.native
  @JSName("insert")
  def insert_UPromise[U](data: js.Object, options: js.Object): js.Promise[U] = js.native
  def mapReduce(
    map: js.Function0[_],
    reduce: js.Function2[/* key */ java.lang.String, /* values */ js.Array[_], _],
    options: js.Object
  ): js.Promise[_] = js.native
  def mapReduce(
    map: js.Function0[_],
    reduce: js.Function2[/* key */ java.lang.String, /* values */ js.Array[_], _],
    options: js.Object,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* data */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  @JSName("mapReduce")
  def mapReduce_Unit(
    map: js.Function0[_],
    reduce: js.Function2[/* key */ java.lang.String, /* values */ js.Array[_], _],
    options: js.Object
  ): scala.Unit = js.native
  def remove(): js.Promise[monkLib.Anon_DeletedCount] = js.native
  def remove(query: TQuery): js.Promise[monkLib.Anon_DeletedCount] = js.native
  def remove(query: TQuery, options: js.Object): js.Promise[monkLib.Anon_DeletedCount] = js.native
  def remove(
    query: TQuery,
    options: js.Object,
    callback: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* data */ monkLib.Anon_DeletedCount, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("remove")
  def remove_Unit(): scala.Unit = js.native
  @JSName("remove")
  def remove_Unit(query: TQuery): scala.Unit = js.native
  @JSName("remove")
  def remove_Unit(query: TQuery, options: js.Object): scala.Unit = js.native
  def stats(): js.Promise[monkLib.Anon_01AvgObjSize] = js.native
  def stats(options: js.Object): js.Promise[monkLib.Anon_01AvgObjSize] = js.native
  def stats(
    options: js.Object,
    callback: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* data */ monkLib.Anon_01AvgObjSize, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("stats")
  def stats_Unit(): scala.Unit = js.native
  @JSName("stats")
  def stats_Unit(options: js.Object): scala.Unit = js.native
  def update(query: TQuery, update: js.Object): js.Promise[monkLib.Anon_01NNModified] = js.native
  def update(query: TQuery, update: js.Object, options: js.Object): js.Promise[monkLib.Anon_01NNModified] = js.native
  def update(
    query: TQuery,
    update: js.Object,
    options: js.Object,
    callback: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* data */ monkLib.Anon_01NNModified, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("update")
  def update_Unit(query: TQuery, update: js.Object): scala.Unit = js.native
  @JSName("update")
  def update_Unit(query: TQuery, update: js.Object, options: js.Object): scala.Unit = js.native
}

