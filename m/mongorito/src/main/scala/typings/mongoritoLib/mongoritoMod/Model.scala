package typings
package mongoritoLib.mongoritoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongorito", "Model")
@js.native
class Model () extends Query {
  def this(fields: js.Object) = this()
  def collection(): java.lang.String = js.native
  def get(): js.Any = js.native
  def get(key: java.lang.String): js.Any = js.native
  def getCollection(): stdLib.Promise[mongodbLib.mongodbMod.Collection[_]] = js.native
  def getConnection(): stdLib.Promise[mongodbLib.mongodbMod.Db] = js.native
  def increment(key: java.lang.String): stdLib.Promise[RefreshedAction] = js.native
  def increment(key: java.lang.String, value: scala.Double): stdLib.Promise[RefreshedAction] = js.native
  def increment(keys: ScalablyTyped.runtime.StringDictionary[scala.Double]): stdLib.Promise[RefreshedAction] = js.native
  def isSaved(): scala.Boolean = js.native
  def refresh(): stdLib.Promise[RefreshedAction] = js.native
  def remove(): stdLib.Promise[RemovedAction] = js.native
  def save(): stdLib.Promise[CreatedAction | UpdatedAction] = js.native
  def set(key: java.lang.String, value: js.Any): scala.Unit = js.native
  def set(value: js.Object): scala.Unit = js.native
  def toJSON(): js.Object = js.native
  def unset(): scala.Unit = js.native
  def unset(keys: java.lang.String): scala.Unit = js.native
  def unset(keys: js.Array[java.lang.String]): scala.Unit = js.native
}

@JSImport("mongorito", "Model")
@js.native
object Model extends js.Object {
  /**
       * @see mongodb.Collection#createIndex()
       */
  def createIndex(fieldOrSpec: js.Any): stdLib.Promise[java.lang.String] = js.native
  /**
       * @see mongodb.Collection#createIndex()
       */
  def createIndex(fieldOrSpec: js.Any, options: mongodbLib.mongodbMod.IndexOptions): stdLib.Promise[java.lang.String] = js.native
  /**
       * @see mongodb.Collection#dropIndex()
       */
  def dropIndex(indexName: java.lang.String): stdLib.Promise[js.Object] = js.native
  /**
       * @see mongodb.Collection#dropIndex()
       */
  def dropIndex(indexName: java.lang.String, options: mongodbLib.mongodbMod.CommonOptions): stdLib.Promise[js.Object] = js.native
  def embeds(key: java.lang.String, model: mongoritoLib.mongoritoMod.ModelClass): scala.Unit = js.native
  /**
       * @see Db#collection(string)
       */
  def getCollection(): stdLib.Promise[mongodbLib.mongodbMod.Collection[_]] = js.native
  /**
       * @see Model#database
       * @see Database#connection()
       */
  def getConnection(): stdLib.Promise[mongodbLib.mongodbMod.Db] = js.native
  /**
       * @see mongodb.Collection#listIndexes()
       * @see mongodb.CommandCursor#toArray()
       */
  def listIndexes(): stdLib.Promise[js.Array[_]] = js.native
  /**
       * @see mongodb.Collection#listIndexes()
       * @see mongodb.CommandCursor#toArray()
       */
  def listIndexes(options: mongoritoLib.Anon_ReadPreference): stdLib.Promise[js.Array[_]] = js.native
  def modifyReducer(reducerModifier: mongoritoLib.mongoritoMod.ReducerModifier): scala.Unit = js.native
  def query(method: java.lang.String, query: js.Array[js.Tuple2[java.lang.String, _]]): stdLib.Promise[js.Array[js.Object]] = js.native
  def use(): scala.Unit = js.native
  def use(plugins: js.Array[mongoritoLib.mongoritoMod.Plugin]): scala.Unit = js.native
  def use(plugins: mongoritoLib.mongoritoMod.Plugin): scala.Unit = js.native
}

