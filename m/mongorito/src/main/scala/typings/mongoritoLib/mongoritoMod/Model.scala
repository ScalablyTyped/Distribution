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
  def getCollection(): js.Promise[mongodbLib.mongodbMod.Collection[_]] = js.native
  def getConnection(): js.Promise[mongodbLib.mongodbMod.Db] = js.native
  def increment(key: java.lang.String): js.Promise[RefreshedAction] = js.native
  def increment(key: java.lang.String, value: scala.Double): js.Promise[RefreshedAction] = js.native
  def increment(keys: org.scalablytyped.runtime.StringDictionary[scala.Double]): js.Promise[RefreshedAction] = js.native
  def isSaved(): scala.Boolean = js.native
  def refresh(): js.Promise[RefreshedAction] = js.native
  def remove(): js.Promise[RemovedAction] = js.native
  def save(): js.Promise[CreatedAction | UpdatedAction] = js.native
  def set(key: java.lang.String, value: js.Any): scala.Unit = js.native
  def set(value: js.Object): scala.Unit = js.native
  def toJSON(): js.Object = js.native
  def unset(): scala.Unit = js.native
  def unset(keys: java.lang.String): scala.Unit = js.native
  def unset(keys: js.Array[java.lang.String]): scala.Unit = js.native
}

/* static members */
@JSImport("mongorito", "Model")
@js.native
object Model extends js.Object {
  /**
    * @see mongodb.Collection#createIndex()
    */
  def createIndex(fieldOrSpec: js.Any): js.Promise[java.lang.String] = js.native
  def createIndex(fieldOrSpec: js.Any, options: mongodbLib.mongodbMod.IndexOptions): js.Promise[java.lang.String] = js.native
  /**
    * @see mongodb.Collection#dropIndex()
    */
  def dropIndex(indexName: java.lang.String): js.Promise[js.Object] = js.native
  def dropIndex(indexName: java.lang.String, options: mongodbLib.mongodbMod.CommonOptions): js.Promise[js.Object] = js.native
  def embeds(key: java.lang.String, model: mongoritoLib.mongoritoMod.ModelClass): scala.Unit = js.native
  /**
    * @see Db#collection(string)
    */
  def getCollection(): js.Promise[mongodbLib.mongodbMod.Collection[_]] = js.native
  /**
    * @see Model#database
    * @see Database#connection()
    */
  def getConnection(): js.Promise[mongodbLib.mongodbMod.Db] = js.native
  /**
    * @see mongodb.Collection#listIndexes()
    * @see mongodb.CommandCursor#toArray()
    */
  def listIndexes(): js.Promise[js.Array[_]] = js.native
  def listIndexes(options: mongoritoLib.Anon_BatchSize): js.Promise[js.Array[_]] = js.native
  def modifyReducer(reducerModifier: mongoritoLib.mongoritoMod.ReducerModifier): scala.Unit = js.native
  def query(method: java.lang.String, query: js.Array[js.Tuple2[java.lang.String, _]]): js.Promise[js.Array[js.Object]] = js.native
  def use(): scala.Unit = js.native
  def use(plugins: js.Array[mongoritoLib.mongoritoMod.Plugin]): scala.Unit = js.native
  def use(plugins: mongoritoLib.mongoritoMod.Plugin): scala.Unit = js.native
}

