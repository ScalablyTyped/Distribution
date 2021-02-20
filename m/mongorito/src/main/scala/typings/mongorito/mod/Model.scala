package typings.mongorito.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mongodb.mod.Collection
import typings.mongodb.mod.CommonOptions
import typings.mongodb.mod.Db
import typings.mongodb.mod.IndexOptions
import typings.mongorito.anon.BatchSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongorito", "Model")
@js.native
class Model () extends Query {
  def this(fields: js.Object) = this()
  
  def collection(): String = js.native
  
  def get(): js.Any = js.native
  def get(key: String): js.Any = js.native
  
  def getCollection(): js.Promise[Collection[_]] = js.native
  
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
  
  /**
    * @see mongodb.Collection#createIndex()
    */
  @JSImport("mongorito", "Model.createIndex")
  @js.native
  def createIndex(fieldOrSpec: js.Any): js.Promise[String] = js.native
  @JSImport("mongorito", "Model.createIndex")
  @js.native
  def createIndex(fieldOrSpec: js.Any, options: IndexOptions): js.Promise[String] = js.native
  
  /**
    * @see mongodb.Collection#dropIndex()
    */
  @JSImport("mongorito", "Model.dropIndex")
  @js.native
  def dropIndex(indexName: String): js.Promise[js.Object] = js.native
  @JSImport("mongorito", "Model.dropIndex")
  @js.native
  def dropIndex(indexName: String, options: CommonOptions): js.Promise[js.Object] = js.native
  
  @JSImport("mongorito", "Model.embeds")
  @js.native
  def embeds(key: String, model: ModelClass): Unit = js.native
  
  /**
    * @see Db#collection(string)
    */
  @JSImport("mongorito", "Model.getCollection")
  @js.native
  def getCollection(): js.Promise[Collection[_]] = js.native
  
  /**
    * @see Model#database
    * @see Database#connection()
    */
  @JSImport("mongorito", "Model.getConnection")
  @js.native
  def getConnection(): js.Promise[Db] = js.native
  
  /**
    * @see mongodb.Collection#listIndexes()
    * @see mongodb.CommandCursor#toArray()
    */
  @JSImport("mongorito", "Model.listIndexes")
  @js.native
  def listIndexes(): js.Promise[js.Array[_]] = js.native
  @JSImport("mongorito", "Model.listIndexes")
  @js.native
  def listIndexes(options: BatchSize): js.Promise[js.Array[_]] = js.native
  
  @JSImport("mongorito", "Model.modifyReducer")
  @js.native
  def modifyReducer(reducerModifier: ReducerModifier): Unit = js.native
  
  @JSImport("mongorito", "Model.query")
  @js.native
  def query(method: String, query: js.Array[js.Tuple2[String, _]]): js.Promise[js.Array[js.Object]] = js.native
  
  @JSImport("mongorito", "Model.use")
  @js.native
  def use(): Unit = js.native
  @JSImport("mongorito", "Model.use")
  @js.native
  def use(plugins: js.Array[Plugin]): Unit = js.native
  @JSImport("mongorito", "Model.use")
  @js.native
  def use(plugins: Plugin): Unit = js.native
}
