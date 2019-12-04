package typings.mongoose.mongooseMod

import typings.mongodb.mongodbMod.Default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * section collection.js
  * http://mongoosejs.com/docs/api.html#collection-js
  */
@js.native
trait CollectionBase
  extends typings.mongodb.mongodbMod.Collection[Default] {
  /** The Connection instance */
  var conn: Connection = js.native
  /** The collection name */
  var name: String = js.native
  /*
    * Abstract methods. Some of these are already defined on the
    * mongodb.Collection interface so they've been commented out.
    */
  def ensureIndex(args: js.Any*): js.Any = js.native
  //find(...args: any[]): any;
  def findAndModify(args: js.Any*): js.Any = js.native
  //findOne(...args: any[]): any;
  def getIndexes(args: js.Any*): js.Any = js.native
}

