package typings
package atOracleOraclejetLib.ojmodelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@oracle/oraclejet/ojmodel", "Collection")
@js.native
class Collection () extends js.Object {
  def this(models: js.Array[Model]) = this()
  def this(models: js.Array[Model], options: js.Object) = this()
  var changes: js.Array[scala.Double] = js.native
  var comparator: scala.Null | java.lang.String | (js.Function2[/* param0 */ Model, /* param1 */ js.UndefOr[Model], scala.Double]) = js.native
  var customPagingOptions: (js.Function1[
    /* response */ js.Object, 
    atOracleOraclejetLib.ojmodelMod.CollectionNs.CustomPagingOptionsReturn | scala.Null
  ]) | scala.Null = js.native
  var customURL: (js.Function3[
    /* param0 */ java.lang.String, 
    /* param1 */ this.type, 
    /* param2 */ js.Object, 
    java.lang.String | js.Object | scala.Null
  ]) | scala.Null = js.native
  var fetchSize: scala.Double = js.native
  var hasMore: scala.Boolean = js.native
  var lastFetchCount: scala.Double = js.native
  var lastFetchSize: scala.Double = js.native
  var length: scala.Double = js.native
  var model: js.Object = js.native
  var modelLimit: scala.Double = js.native
  var models: js.Array[Model] = js.native
  var offset: scala.Double = js.native
  var omitLanguageHeader: scala.Boolean = js.native
  var sortDirection: scala.Double = js.native
  var totalResults: scala.Double = js.native
  var url: scala.Null | java.lang.String | js.Function0[java.lang.String] = js.native
  def abort(): js.Promise[scala.Null] = js.native
  def add(m: Model): js.Promise[js.Array[Model]] | js.Array[Model] = js.native
  def add(m: Model, options: atOracleOraclejetLib.Anon_At): js.Promise[js.Array[Model]] | js.Array[Model] = js.native
  def add(m: js.Array[Model | js.Object]): js.Promise[js.Array[Model]] | js.Array[Model] = js.native
  def add(m: js.Array[Model | js.Object], options: atOracleOraclejetLib.Anon_At): js.Promise[js.Array[Model]] | js.Array[Model] = js.native
  def add(m: js.Object): js.Promise[js.Array[Model]] | js.Array[Model] = js.native
  def add(m: js.Object, options: atOracleOraclejetLib.Anon_At): js.Promise[js.Array[Model]] | js.Array[Model] = js.native
  def any(iterator: js.Function1[/* param0 */ js.Object, scala.Unit]): scala.Boolean = js.native
  def any(iterator: js.Function1[/* param0 */ js.Object, scala.Unit], context: js.Object): scala.Boolean = js.native
  def at(index: scala.Double): Model | js.Promise[Model] | scala.Null = js.native
  def at(index: scala.Double, options: atOracleOraclejetLib.Anon_Deferred): Model | js.Promise[Model] | scala.Null = js.native
  def contains(model: js.Object): scala.Boolean | js.Promise[scala.Boolean] = js.native
  def contains(model: js.Object, options: js.Object): scala.Boolean | js.Promise[scala.Boolean] = js.native
  def create(): Model | scala.Boolean | js.Promise[Model] = js.native
  def create(attributes: js.Object): Model | scala.Boolean | js.Promise[Model] = js.native
  def create(attributes: js.Object, options: atOracleOraclejetLib.Anon_At): Model | scala.Boolean | js.Promise[Model] = js.native
  def difference(var_args: js.Array[Model]*): js.Array[Model] = js.native
  def each(iterator: js.Function1[/* param0 */ Model, scala.Unit]): js.UndefOr[scala.Nothing] = js.native
  def each(iterator: js.Function1[/* param0 */ Model, scala.Unit], context: js.Object): js.UndefOr[scala.Nothing] = js.native
  def fetch(): js.Object = js.native
  def fetch(options: atOracleOraclejetLib.Anon_Add): js.Object = js.native
  def filter(iterator: js.Function1[/* param0 */ Model, scala.Unit]): js.Array[Model] = js.native
  def filter(iterator: js.Function1[/* param0 */ Model, scala.Unit], context: js.Object): js.Array[Model] = js.native
  def findWhere(attrs: js.Array[js.Object]): Model | js.Promise[Model] = js.native
  def findWhere(attrs: js.Array[js.Object], options: atOracleOraclejetLib.Anon_DeferredPropName): Model | js.Promise[Model] = js.native
  def findWhere(attrs: js.Object): Model | js.Promise[Model] = js.native
  def findWhere(attrs: js.Object, options: atOracleOraclejetLib.Anon_DeferredPropName): Model | js.Promise[Model] = js.native
  def first(): js.Array[Model] | scala.Null | js.Promise[_] = js.native
  def first(n: scala.Double): js.Array[Model] | scala.Null | js.Promise[_] = js.native
  def first(n: scala.Double, options: js.Object): js.Array[Model] | scala.Null | js.Promise[_] = js.native
  def get(id: java.lang.String): Model | scala.Null | js.Promise[Model] = js.native
  def get(id: java.lang.String, options: js.Object): Model | scala.Null | js.Promise[Model] = js.native
  def get(id: js.Object): Model | scala.Null | js.Promise[Model] = js.native
  def get(id: js.Object, options: js.Object): Model | scala.Null | js.Promise[Model] = js.native
  def getByCid(clientId: java.lang.String): Model | scala.Null = js.native
  def groupBy(iterator: java.lang.String): js.Object = js.native
  def groupBy(iterator: java.lang.String, context: js.Object): js.Object = js.native
  def groupBy(iterator: js.Function1[/* param0 */ Model, js.Object]): js.Object = js.native
  def groupBy(iterator: js.Function1[/* param0 */ Model, js.Object], context: js.Object): js.Object = js.native
  def include(model: js.Object): scala.Boolean | js.Promise[scala.Boolean] = js.native
  def include(model: js.Object, options: js.Object): scala.Boolean | js.Promise[scala.Boolean] = js.native
  def indexBy(iterator: java.lang.String): js.Object = js.native
  def indexBy(iterator: java.lang.String, context: js.Object): js.Object = js.native
  def indexBy(iterator: js.Function1[/* param0 */ Model, scala.Unit]): js.Object = js.native
  def indexBy(iterator: js.Function1[/* param0 */ Model, scala.Unit], context: js.Object): js.Object = js.native
  def indexOf(model: js.Object): scala.Double | js.Promise[scala.Double] = js.native
  def indexOf(model: js.Object, options: js.Object): scala.Double | js.Promise[scala.Double] = js.native
  def initial(): js.Array[Model] = js.native
  def initial(n: scala.Double): js.Array[Model] = js.native
  def isEmpty(): scala.Boolean = js.native
  def isRangeLocal(start: scala.Double, count: scala.Double): scala.Boolean = js.native
  def last(): js.Promise[Model] | js.Array[Model] | scala.Null = js.native
  def last(n: scala.Double): js.Promise[Model] | js.Array[Model] | scala.Null = js.native
  def last(n: scala.Double, options: js.Object): js.Promise[Model] | js.Array[Model] | scala.Null = js.native
  def lastIndexOf(model: Model): scala.Double = js.native
  def lastIndexOf(model: Model, fromIndex: scala.Double): scala.Double = js.native
  def listenTo(
    otherObj: js.Object,
    eventType: java.lang.String,
    callback: js.Function2[/* eventType */ java.lang.String, /* data */ js.Object, scala.Unit]
  ): js.UndefOr[scala.Nothing] = js.native
  def listenToOnce(
    otherObj: js.Object,
    eventType: java.lang.String,
    callback: js.Function2[/* eventType */ java.lang.String, /* data */ js.Object, scala.Unit]
  ): js.UndefOr[scala.Nothing] = js.native
  def map(iterator: js.Function1[/* param0 */ Model, js.Object]): js.Array[js.Object] = js.native
  def map(iterator: js.Function1[/* param0 */ Model, js.Object], context: js.Object): js.Array[js.Object] = js.native
  def max(iterator: js.Function1[/* param0 */ Model, js.Object]): js.Object = js.native
  def max(iterator: js.Function1[/* param0 */ Model, js.Object], context: js.Object): js.Object = js.native
  def min(iterator: js.Function1[/* param0 */ js.Object, scala.Unit]): js.Object = js.native
  def min(iterator: js.Function1[/* param0 */ js.Object, scala.Unit], context: js.Object): js.Object = js.native
  def modelId(attrs: js.Object): scala.Null | java.lang.String = js.native
  def next(n: scala.Double): js.Object | scala.Null = js.native
  def next(n: scala.Double, options: atOracleOraclejetLib.Anon_Collection): js.Object | scala.Null = js.native
  def off(): js.UndefOr[scala.Nothing] = js.native
  def off(eventType: java.lang.String): js.UndefOr[scala.Nothing] = js.native
  def off(
    eventType: java.lang.String,
    callback: js.Function2[/* eventType */ java.lang.String, /* data */ js.Object, scala.Unit]
  ): js.UndefOr[scala.Nothing] = js.native
  def off(
    eventType: java.lang.String,
    callback: js.Function2[/* eventType */ java.lang.String, /* data */ js.Object, scala.Unit],
    context: js.Object
  ): js.UndefOr[scala.Nothing] = js.native
  def off(eventType: js.Object): js.UndefOr[scala.Nothing] = js.native
  def off(
    eventType: js.Object,
    callback: js.Function2[/* eventType */ java.lang.String, /* data */ js.Object, scala.Unit]
  ): js.UndefOr[scala.Nothing] = js.native
  def off(
    eventType: js.Object,
    callback: js.Function2[/* eventType */ java.lang.String, /* data */ js.Object, scala.Unit],
    context: js.Object
  ): js.UndefOr[scala.Nothing] = js.native
  def on(
    eventType: java.lang.String,
    callback: js.Function2[/* eventType */ java.lang.String, /* data */ js.Object, scala.Unit]
  ): js.UndefOr[scala.Nothing] = js.native
  def on(
    eventType: java.lang.String,
    callback: js.Function2[/* eventType */ java.lang.String, /* data */ js.Object, scala.Unit],
    context: js.Object
  ): js.UndefOr[scala.Nothing] = js.native
  def on(
    eventType: js.Object,
    callback: js.Function2[/* eventType */ java.lang.String, /* data */ js.Object, scala.Unit]
  ): js.UndefOr[scala.Nothing] = js.native
  def on(
    eventType: js.Object,
    callback: js.Function2[/* eventType */ java.lang.String, /* data */ js.Object, scala.Unit],
    context: js.Object
  ): js.UndefOr[scala.Nothing] = js.native
  def once(
    eventType: java.lang.String,
    callback: js.Function2[/* eventType */ java.lang.String, /* data */ js.Object, scala.Unit]
  ): js.UndefOr[scala.Nothing] = js.native
  def once(
    eventType: java.lang.String,
    callback: js.Function2[/* eventType */ java.lang.String, /* data */ js.Object, scala.Unit],
    context: js.Object
  ): js.UndefOr[scala.Nothing] = js.native
  def parse(param0: js.Object): js.Object = js.native
  def pluck(attr: java.lang.String): js.Array[js.Object] = js.native
  def pop(): Model | js.Promise[Model] = js.native
  def pop(options: atOracleOraclejetLib.Anon_DeferredPropNameSilent): Model | js.Promise[Model] = js.native
  def previous(n: scala.Double): js.Object = js.native
  def previous(n: scala.Double, options: atOracleOraclejetLib.Anon_Collection): js.Object = js.native
  def push(m: Model): js.UndefOr[js.Promise[js.Array[Model]]] = js.native
  def push(m: Model, options: atOracleOraclejetLib.Anon_At): js.UndefOr[js.Promise[js.Array[Model]]] = js.native
  def push(m: js.Object): js.UndefOr[js.Promise[js.Array[Model]]] = js.native
  def push(m: js.Object, options: atOracleOraclejetLib.Anon_At): js.UndefOr[js.Promise[js.Array[Model]]] = js.native
  def refresh(): js.Promise[js.UndefOr[atOracleOraclejetLib.ojmodelMod.CollectionNs.SetRangeLocalPromise]] = js.native
  def refresh(options: atOracleOraclejetLib.Anon_PropNameSilent): js.Promise[js.UndefOr[atOracleOraclejetLib.ojmodelMod.CollectionNs.SetRangeLocalPromise]] = js.native
  def remove(m: Model): js.Array[Model] | js.Object = js.native
  def remove(m: Model, options: js.Object): js.Array[Model] | js.Object = js.native
  def remove(m: js.Array[Model]): js.Array[Model] | js.Object = js.native
  def remove(m: js.Array[Model], options: js.Object): js.Array[Model] | js.Object = js.native
  def reset(): Model | js.Array[Model] = js.native
  def reset(data: js.Object): Model | js.Array[Model] = js.native
  def reset(data: js.Object, options: atOracleOraclejetLib.Anon_PropNameSilentAny): Model | js.Array[Model] = js.native
  def rest(): js.Array[js.Object] | js.Promise[_] = js.native
  def rest(n: scala.Double): js.Array[js.Object] | js.Promise[_] = js.native
  def rest(n: scala.Double, options: js.Object): js.Array[js.Object] | js.Promise[_] = js.native
  def set(models: js.Object): js.Promise[_] | scala.Null = js.native
  def set(models: js.Object, options: atOracleOraclejetLib.Anon_AddDeferred): js.Promise[_] | scala.Null = js.native
  def setFetchSize(n: scala.Double): js.UndefOr[scala.Nothing] = js.native
  def setModelLimit(n: scala.Double): js.UndefOr[scala.Nothing] = js.native
  def setRangeLocal(start: scala.Double, count: scala.Double): js.Promise[atOracleOraclejetLib.ojmodelMod.CollectionNs.SetRangeLocalPromise] = js.native
  def shift(): Model | js.Promise[Model] | scala.Null = js.native
  def shift(options: js.Object): Model | js.Promise[Model] | scala.Null = js.native
  def size(): scala.Double = js.native
  def slice(start: scala.Double): js.Promise[js.Array[Model]] | js.Array[Model] = js.native
  def slice(start: scala.Double, end: scala.Double): js.Promise[js.Array[Model]] | js.Array[Model] = js.native
  def slice(start: scala.Double, end: scala.Double, options: js.Object): js.Promise[js.Array[Model]] | js.Array[Model] = js.native
  def sort(): js.Promise[atOracleOraclejetLib.ojmodelMod.CollectionNs.SetRangeLocalPromise] | scala.Null = js.native
  def sort(options: atOracleOraclejetLib.Anon_PropNameSilent): js.Promise[atOracleOraclejetLib.ojmodelMod.CollectionNs.SetRangeLocalPromise] | scala.Null = js.native
  def sortBy(iterator: java.lang.String): js.Array[Model] = js.native
  def sortBy(iterator: java.lang.String, context: js.Object): js.Array[Model] = js.native
  def sortBy(iterator: js.Function1[/* param0 */ Model, js.Object]): js.Array[Model] = js.native
  def sortBy(iterator: js.Function1[/* param0 */ Model, js.Object], context: js.Object): js.Array[Model] = js.native
  def sortedIndex(comparator: java.lang.String): scala.Double = js.native
  def sortedIndex(comparator: js.Function2[/* param0 */ Model, /* param1 */ js.UndefOr[Model], js.Object]): scala.Double = js.native
  def stopListening(): js.UndefOr[scala.Nothing] = js.native
  def stopListening(otherObj: js.Object): js.UndefOr[scala.Nothing] = js.native
  def stopListening(otherObj: js.Object, eventType: java.lang.String): js.UndefOr[scala.Nothing] = js.native
  def stopListening(
    otherObj: js.Object,
    eventType: java.lang.String,
    callback: js.Function2[/* eventType */ java.lang.String, /* data */ js.Object, scala.Unit]
  ): js.UndefOr[scala.Nothing] = js.native
  def sync(method: java.lang.String, collection: Collection): js.Object = js.native
  def sync(method: java.lang.String, collection: Collection, options: atOracleOraclejetLib.Anon_Error): js.Object = js.native
  def toJSON(): js.Array[js.Object] = js.native
  def trigger(eventType: java.lang.String): js.UndefOr[scala.Nothing] = js.native
  def unshift(m: js.Object): js.Promise[js.Array[Model]] | js.Array[Model] = js.native
  def unshift(m: js.Object, options: atOracleOraclejetLib.Anon_At): js.Promise[js.Array[Model]] | js.Array[Model] = js.native
  def whenReady(): js.Promise[_] = js.native
  def where(attrs: js.Array[js.Object]): js.Promise[js.Array[Model]] | js.Array[Model] = js.native
  def where(attrs: js.Array[js.Object], options: js.Object): js.Promise[js.Array[Model]] | js.Array[Model] = js.native
  def where(attrs: js.Object): js.Promise[js.Array[Model]] | js.Array[Model] = js.native
  def where(attrs: js.Object, options: js.Object): js.Promise[js.Array[Model]] | js.Array[Model] = js.native
  def whereToCollection(attrs: js.Array[js.Object]): Collection | js.Promise[Collection] = js.native
  def whereToCollection(attrs: js.Array[js.Object], options: js.Object): Collection | js.Promise[Collection] = js.native
  def whereToCollection(attrs: js.Object): Collection | js.Promise[Collection] = js.native
  def whereToCollection(attrs: js.Object, options: js.Object): Collection | js.Promise[Collection] = js.native
  def without(var_args: Model*): js.Array[Model] = js.native
}

@JSImport("@oracle/oraclejet/ojmodel", "Collection")
@js.native
object Collection extends js.Object {
  def extend(): js.Any = js.native
  def extend(properties: atOracleOraclejetLib.Anon_Comparator): js.Any = js.native
  def extend(properties: atOracleOraclejetLib.Anon_Comparator, classProperties: js.Object): js.Any = js.native
}

