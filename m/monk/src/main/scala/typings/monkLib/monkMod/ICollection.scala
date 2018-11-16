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
  def aggregate[U](stages: js.Array[_]): stdLib.Promise[U] = js.native
  def aggregate[U](stages: js.Array[_], options: js.Object): stdLib.Promise[U] = js.native
  def bulkWrite[U](operations: js.Array[_]): stdLib.Promise[U] = js.native
  def bulkWrite[U](operations: js.Array[_], options: js.Object): stdLib.Promise[U] = js.native
  def count(): stdLib.Promise[scala.Double] = js.native
  def count(query: TQuery): stdLib.Promise[scala.Double] = js.native
  def count(query: TQuery, options: js.Object): stdLib.Promise[scala.Double] = js.native
  def createIndex(): stdLib.Promise[java.lang.String] = js.native
  def createIndex(
    fields: ScalablyTyped.runtime.StringDictionary[monkLib.monkLibNumbers.`1` | monkLib.monkLibNumbers.`-1`]
  ): stdLib.Promise[java.lang.String] = js.native
  def createIndex(
    fields: ScalablyTyped.runtime.StringDictionary[monkLib.monkLibNumbers.`1` | monkLib.monkLibNumbers.`-1`],
    options: js.Object
  ): stdLib.Promise[java.lang.String] = js.native
  def createIndex(fields: TFields): stdLib.Promise[java.lang.String] = js.native
  def createIndex(fields: TFields, options: js.Object): stdLib.Promise[java.lang.String] = js.native
  def distinct(field: java.lang.String): stdLib.Promise[scala.Double] = js.native
  def distinct(field: java.lang.String, query: TQuery): stdLib.Promise[scala.Double] = js.native
  def distinct(field: java.lang.String, query: TQuery, options: js.Object): stdLib.Promise[scala.Double] = js.native
  def drop(): stdLib.Promise[(monkLib.monkLibStrings.`ns not found`) | monkLib.monkLibNumbers.`true`] = js.native
  def dropIndex(): stdLib.Promise[monkLib.Anon_Ok] = js.native
  def dropIndex(fields: TFields): stdLib.Promise[monkLib.Anon_Ok] = js.native
  def dropIndex(fields: TFields, options: js.Object): stdLib.Promise[monkLib.Anon_Ok] = js.native
  def dropIndexes(): stdLib.Promise[monkLib.Anon_Msg] = js.native
  def find[U](): stdLib.Promise[js.Array[U]] with monkLib.Anon_Each[U] = js.native
  def find[U](query: TQuery): stdLib.Promise[js.Array[U]] with monkLib.Anon_Each[U] = js.native
  def find[U](query: TQuery, options: js.Object): stdLib.Promise[js.Array[U]] with monkLib.Anon_Each[U] = js.native
  def findOne[U](): stdLib.Promise[js.UndefOr[U]] = js.native
  def findOne[U](query: TQuery): stdLib.Promise[js.UndefOr[U]] = js.native
  def findOne[U](query: TQuery, options: js.Object): stdLib.Promise[js.UndefOr[U]] = js.native
  def findOneAndDelete[U](): stdLib.Promise[js.UndefOr[U]] = js.native
  def findOneAndDelete[U](query: TQuery): stdLib.Promise[js.UndefOr[U]] = js.native
  def findOneAndDelete[U](query: TQuery, options: js.Object): stdLib.Promise[js.UndefOr[U]] = js.native
  def findOneAndUpdate[U](query: TQuery, update: js.Object): stdLib.Promise[js.UndefOr[U]] = js.native
  def findOneAndUpdate[U](query: TQuery, update: js.Object, options: js.Object): stdLib.Promise[js.UndefOr[U]] = js.native
  def geoHaystackSearch[U](x: scala.Double, y: scala.Double, options: js.Object): stdLib.Promise[js.Array[U]] = js.native
  def geoNear[U](x: scala.Double, y: scala.Double): stdLib.Promise[js.Array[U]] = js.native
  def geoNear[U](x: scala.Double, y: scala.Double, options: js.Object): stdLib.Promise[js.Array[U]] = js.native
  def group[U](
    keys: js.Any,
    condition: js.Any,
    initial: js.Any,
    reduce: js.Any,
    finalize: js.Any,
    command: js.Any
  ): stdLib.Promise[_] = js.native
  def group[U](
    keys: js.Any,
    condition: js.Any,
    initial: js.Any,
    reduce: js.Any,
    finalize: js.Any,
    command: js.Any,
    options: js.Object
  ): stdLib.Promise[_] = js.native
  def indexes(): stdLib.Promise[
    js.Array[
      ScalablyTyped.runtime.StringDictionary[
        js.Array[
          js.Tuple2[java.lang.String, monkLib.monkLibNumbers.`1` | monkLib.monkLibNumbers.`-1`]
        ]
      ]
    ]
  ] = js.native
  def insert[U](data: js.Array[js.Object]): stdLib.Promise[U] = js.native
  def insert[U](data: js.Array[js.Object], options: js.Object): stdLib.Promise[U] = js.native
  def insert[U](data: js.Object): stdLib.Promise[U] = js.native
  def insert[U](data: js.Object, options: js.Object): stdLib.Promise[U] = js.native
  def mapReduce(
    map: js.Function0[_],
    reduce: js.Function2[/* key */ java.lang.String, /* values */ js.Array[_], _],
    options: js.Object
  ): stdLib.Promise[_] = js.native
  def remove(): stdLib.Promise[monkLib.Anon_Result] = js.native
  def remove(query: TQuery): stdLib.Promise[monkLib.Anon_Result] = js.native
  def remove(query: TQuery, options: js.Object): stdLib.Promise[monkLib.Anon_Result] = js.native
  def stats(): stdLib.Promise[monkLib.Anon_AvgObjSize] = js.native
  def stats(options: js.Object): stdLib.Promise[monkLib.Anon_AvgObjSize] = js.native
  def update(query: TQuery, update: js.Object): stdLib.Promise[monkLib.Anon_NNModified] = js.native
  def update(query: TQuery, update: js.Object, options: js.Object): stdLib.Promise[monkLib.Anon_NNModified] = js.native
}

