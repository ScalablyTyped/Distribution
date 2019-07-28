package typings.mongoose.mongooseMod.TypesNs

import typings.mongoose.Anon_Noop
import typings.mongoose.mongooseMod.MongooseDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * section types/embedded.js
  * http://mongoosejs.com/docs/api.html#types-embedded-js
  */
@js.native
trait Embedded extends MongooseDocument {
  /** Returns the top level document of this sub-document. */
  def ownerDocument(): MongooseDocument = js.native
  /** Returns this sub-documents parent document. */
  def parent(): MongooseDocument = js.native
  /** Returns this sub-documents parent array. */
  def parentArray(): DocumentArray[MongooseDocument] = js.native
  /** Removes the subdocument from its parent array. */
  def remove(): this.type = js.native
  def remove(options: Anon_Noop): this.type = js.native
  def remove(options: Anon_Noop, fn: js.Function1[/* err */ js.Any, Unit]): this.type = js.native
}

