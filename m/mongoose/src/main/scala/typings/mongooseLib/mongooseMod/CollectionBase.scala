package typings
package mongooseLib.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
   * section collection.js
   * http://mongoosejs.com/docs/api.html#collection-js
   */
@js.native
trait CollectionBase
  extends mongodbLib.mongodbMod.Collection[mongodbLib.Default] {
  /** The Connection instance */
  var conn: Connection = js.native
  /** The collection name */
  var name: java.lang.String = js.native
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

