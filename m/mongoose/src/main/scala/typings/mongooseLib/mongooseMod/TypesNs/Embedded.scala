package typings
package mongooseLib.mongooseMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
      * section types/embedded.js
      * http://mongoosejs.com/docs/api.html#types-embedded-js
      */
@js.native
trait Embedded
  extends mongooseLib.mongooseMod.MongooseDocument {
  /**
         * Marks a path as invalid, causing validation to fail.
         * @param path the field to invalidate
         * @param err error which states the reason path was invalid
         */
  def invalidate(path: java.lang.String, err: java.lang.String): scala.Boolean = js.native
  /**
         * Marks a path as invalid, causing validation to fail.
         * @param path the field to invalidate
         * @param err error which states the reason path was invalid
         */
  def invalidate(path: java.lang.String, err: mongooseLib.mongooseMod.NativeError): scala.Boolean = js.native
  /** Returns the top level document of this sub-document. */
  def ownerDocument(): mongooseLib.mongooseMod.MongooseDocument = js.native
  /** Returns this sub-documents parent document. */
  def parent(): mongooseLib.mongooseMod.MongooseDocument = js.native
  /** Returns this sub-documents parent array. */
  def parentArray(): DocumentArray[mongooseLib.mongooseMod.MongooseDocument] = js.native
  /** Removes the subdocument from its parent array. */
  def remove(): this.type = js.native
  /** Removes the subdocument from its parent array. */
  def remove(options: mongooseLib.Anon_Noop): this.type = js.native
  /** Removes the subdocument from its parent array. */
  def remove(options: mongooseLib.Anon_Noop, fn: js.Function1[/* err */ js.Any, scala.Unit]): this.type = js.native
}

