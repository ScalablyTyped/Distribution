package typings
package mongooseLib.mongooseMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * section types/subdocument.js
  * http://mongoosejs.com/docs/api.html#types-subdocument-js
  */
@js.native
trait Subdocument
  extends mongooseLib.mongooseMod.MongooseDocument {
  /** Returns the top level document of this sub-document. */
  def ownerDocument(): mongooseLib.mongooseMod.MongooseDocument = js.native
  /**
    * Null-out this subdoc
    * @param callback optional callback for compatibility with Document.prototype.remove
    */
  def remove(): scala.Unit = js.native
  def remove(callback: js.Function1[/* err */ js.Any, scala.Unit]): scala.Unit = js.native
  def remove(options: js.Any): scala.Unit = js.native
  def remove(options: js.Any, callback: js.Function1[/* err */ js.Any, scala.Unit]): scala.Unit = js.native
}

