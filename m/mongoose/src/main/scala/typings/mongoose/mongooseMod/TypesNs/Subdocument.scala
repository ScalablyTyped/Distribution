package typings.mongoose.mongooseMod.TypesNs

import typings.mongoose.mongooseMod.MongooseDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * section types/subdocument.js
  * http://mongoosejs.com/docs/api.html#types-subdocument-js
  */
@js.native
trait Subdocument extends MongooseDocument {
  /** Returns the top level document of this sub-document. */
  def ownerDocument(): MongooseDocument = js.native
  /**
    * Null-out this subdoc
    * @param callback optional callback for compatibility with Document.prototype.remove
    */
  def remove(): Unit = js.native
  def remove(callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  def remove(options: js.Any): Unit = js.native
  def remove(options: js.Any, callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
}

