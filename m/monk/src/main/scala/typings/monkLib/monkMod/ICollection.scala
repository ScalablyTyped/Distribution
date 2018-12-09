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
  def aggregate[U](stages: js.Array[_]): js.Promise[U] = js.native
  def aggregate[U](stages: js.Array[_], options: js.Object): js.Promise[U] = js.native
  def bulkWrite[U](operations: js.Array[_]): js.Promise[U] = js.native
  def bulkWrite[U](operations: js.Array[_], options: js.Object): js.Promise[U] = js.native
  def count(): js.Promise[scala.Double] = js.native
  def count(query: TQuery): js.Promise[scala.Double] = js.native
  def count(query: TQuery, options: js.Object): js.Promise[scala.Double] = js.native
  def createIndex(): js.Promise[java.lang.String] = js.native
  def createIndex(
    fields: ScalablyTyped.runtime.StringDictionary[monkLib.monkLibNumbers.`1` | monkLib.monkLibNumbers.`-1`]
  ): js.Promise[java.lang.String] = js.native
  def createIndex(
    fields: ScalablyTyped.runtime.StringDictionary[monkLib.monkLibNumbers.`1` | monkLib.monkLibNumbers.`-1`],
    options: js.Object
  ): js.Promise[java.lang.String] = js.native
  def createIndex(fields: TFields): js.Promise[java.lang.String] = js.native
  def createIndex(fields: TFields, options: js.Object): js.Promise[java.lang.String] = js.native
  def distinct(field: java.lang.String): js.Promise[scala.Double] = js.native
  def distinct(field: java.lang.String, query: TQuery): js.Promise[scala.Double] = js.native
  def distinct(field: java.lang.String, query: TQuery, options: js.Object): js.Promise[scala.Double] = js.native
  def drop(): js.Promise[(monkLib.monkLibStrings.`ns not found`) | monkLib.monkLibNumbers.`true`] = js.native
  def dropIndex(): js.Promise[monkLib.Anon_Ok] = js.native
  def dropIndex(fields: TFields): js.Promise[monkLib.Anon_Ok] = js.native
  def dropIndex(fields: TFields, options: js.Object): js.Promise[monkLib.Anon_Ok] = js.native
  def dropIndexes(): js.Promise[monkLib.Anon_Msg] = js.native
  def find[U](): js.Promise[js.Array[U]] with monkLib.Anon_Each[U] = js.native
  def find[U](query: TQuery): js.Promise[js.Array[U]] with monkLib.Anon_Each[U] = js.native
  def find[U](query: TQuery, options: js.Object): js.Promise[js.Array[U]] with monkLib.Anon_Each[U] = js.native
  def findOne[U](): js.Promise[js.UndefOr[U]] = js.native
  def findOne[U](query: TQuery): js.Promise[js.UndefOr[U]] = js.native
  def findOne[U](query: TQuery, options: js.Object): js.Promise[js.UndefOr[U]] = js.native
  def findOneAndDelete[U](): js.Promise[js.UndefOr[U]] = js.native
  def findOneAndDelete[U](query: TQuery): js.Promise[js.UndefOr[U]] = js.native
  def findOneAndDelete[U](query: TQuery, options: js.Object): js.Promise[js.UndefOr[U]] = js.native
  def findOneAndUpdate[U](query: TQuery, update: js.Object): js.Promise[js.UndefOr[U]] = js.native
  def findOneAndUpdate[U](query: TQuery, update: js.Object, options: js.Object): js.Promise[js.UndefOr[U]] = js.native
  def geoHaystackSearch[U](x: scala.Double, y: scala.Double, options: js.Object): js.Promise[js.Array[U]] = js.native
  def geoNear[U](x: scala.Double, y: scala.Double): js.Promise[js.Array[U]] = js.native
  def geoNear[U](x: scala.Double, y: scala.Double, options: js.Object): js.Promise[js.Array[U]] = js.native
  def group[U](
    keys: js.Any,
    condition: js.Any,
    initial: js.Any,
    reduce: js.Any,
    finalize: js.Any,
    command: js.Any
  ): js.Promise[_] = js.native
  def group[U](
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
      ScalablyTyped.runtime.StringDictionary[
        js.Array[
          js.Tuple2[java.lang.String, monkLib.monkLibNumbers.`1` | monkLib.monkLibNumbers.`-1`]
        ]
      ]
    ]
  ] = js.native
  def insert[U](data: js.Array[js.Object]): js.Promise[U] = js.native
  def insert[U](data: js.Array[js.Object], options: js.Object): js.Promise[U] = js.native
  def insert[U](data: js.Object): js.Promise[U] = js.native
  def insert[U](data: js.Object, options: js.Object): js.Promise[U] = js.native
  def mapReduce(
    map: js.Function0[_],
    reduce: js.Function2[/* key */ java.lang.String, /* values */ js.Array[_], _],
    options: js.Object
  ): js.Promise[_] = js.native
  def remove(): js.Promise[monkLib.Anon_Result] = js.native
  def remove(query: TQuery): js.Promise[monkLib.Anon_Result] = js.native
  def remove(query: TQuery, options: js.Object): js.Promise[monkLib.Anon_Result] = js.native
  def stats(): js.Promise[monkLib.Anon_AvgObjSize] = js.native
  def stats(options: js.Object): js.Promise[monkLib.Anon_AvgObjSize] = js.native
  def update(query: TQuery, update: js.Object): js.Promise[monkLib.Anon_NNModified] = js.native
  def update(query: TQuery, update: js.Object, options: js.Object): js.Promise[monkLib.Anon_NNModified] = js.native
}

