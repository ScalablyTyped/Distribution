package typings.mongorito.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mongodb.mod.Collection
import typings.mongodb.mod.CommonOptions
import typings.mongodb.mod.Db
import typings.mongodb.mod.IndexOptions
import typings.mongorito.anon.BatchSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongorito", "Model")
@js.native
class Model () extends Query {
  def this(fields: js.Object) = this()
  
  def collection(): String = js.native
  
  def get(): js.Any = js.native
  def get(key: String): js.Any = js.native
  
  def getCollection(): js.Promise[Collection[js.Any]] = js.native
  
  def getConnection(): js.Promise[Db] = js.native
  
  def increment(key: String): js.Promise[RefreshedAction] = js.native
  def increment(key: String, value: Double): js.Promise[RefreshedAction] = js.native
  def increment(keys: StringDictionary[Double]): js.Promise[RefreshedAction] = js.native
  
  def isSaved(): Boolean = js.native
  
  def refresh(): js.Promise[RefreshedAction] = js.native
  
  def remove(): js.Promise[RemovedAction] = js.native
  
  def save(): js.Promise[CreatedAction | UpdatedAction] = js.native
  
  def set(key: String, value: js.Any): Unit = js.native
  def set(value: js.Object): Unit = js.native
  
  def toJSON(): js.Object = js.native
  
  def unset(): Unit = js.native
  def unset(keys: String): Unit = js.native
  def unset(keys: js.Array[String]): Unit = js.native
}
/* static members */
object Model {
  
  @JSImport("mongorito", "Model")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @see mongodb.Collection#createIndex()
    */
  inline def createIndex(fieldOrSpec: js.Any): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("createIndex")(fieldOrSpec.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def createIndex(fieldOrSpec: js.Any, options: IndexOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("createIndex")(fieldOrSpec.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  /**
    * @see mongodb.Collection#dropIndex()
    */
  inline def dropIndex(indexName: String): js.Promise[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("dropIndex")(indexName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Object]]
  inline def dropIndex(indexName: String, options: CommonOptions): js.Promise[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("dropIndex")(indexName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Object]]
  
  inline def embeds(key: String, model: ModelClass): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("embeds")(key.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * @see Db#collection(string)
    */
  inline def getCollection(): js.Promise[Collection[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCollection")().asInstanceOf[js.Promise[Collection[js.Any]]]
  
  /**
    * @see Model#database
    * @see Database#connection()
    */
  inline def getConnection(): js.Promise[Db] = ^.asInstanceOf[js.Dynamic].applyDynamic("getConnection")().asInstanceOf[js.Promise[Db]]
  
  /**
    * @see mongodb.Collection#listIndexes()
    * @see mongodb.CommandCursor#toArray()
    */
  inline def listIndexes(): js.Promise[js.Array[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listIndexes")().asInstanceOf[js.Promise[js.Array[js.Any]]]
  inline def listIndexes(options: BatchSize): js.Promise[js.Array[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listIndexes")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[js.Any]]]
  
  inline def modifyReducer(reducerModifier: ReducerModifier): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("modifyReducer")(reducerModifier.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def query(method: String, query: js.Array[js.Tuple2[String, js.Any]]): js.Promise[js.Array[js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("query")(method.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[js.Object]]]
  
  inline def use(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("use")().asInstanceOf[Unit]
  inline def use(plugins: js.Array[Plugin]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("use")(plugins.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def use(plugins: Plugin): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("use")(plugins.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
