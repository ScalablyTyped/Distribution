package typings
package mongooseLib.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(mongooseLib.mongooseMod.ModelProperties because Would inherit conflicting mutable fields List(schema))*/
@js.native
trait Document
  extends nodeLib.NodeJSNs.EventEmitter
     with MongooseDocument {
  /**
       * Version using default version key. See http://mongoosejs.com/docs/guide.html#versionKey
       * If you're using another key, you will have to access it using []: doc[_myVersionKey]
       */
  var __v: js.UndefOr[scala.Double] = js.native
  /** Signal that we desire an increment of this documents version. */
  def increment(): this.type = js.native
  /** whether mongoose thinks this doc is deleted. */
  def isDeleted(): scala.Boolean = js.native
  /** Override whether mongoose thinks this doc is deleted or not */
  def isDeleted(isDeleted: scala.Boolean): scala.Unit = js.native
  /**
       * Returns another Model instance.
       * @param name model name
       */
  def model(name: java.lang.String): Model[this.type, js.Object] = js.native
  /**
       * Removes this document from the db.
       * @param fn optional callback
       */
  def remove(): js.Promise[this.type] = js.native
  /**
       * Removes this document from the db.
       * @param fn optional callback
       */
  def remove(fn: js.Function2[/* err */ js.Any, /* product */ this.type, scala.Unit]): js.Promise[this.type] = js.native
  /**
       * Saves this document.
       * @param options options optional options
       * @param options.safe overrides schema's safe option
       * @param options.validateBeforeSave set to false to save without validating.
       * @param fn optional callback
       */
  def save(): js.Promise[this.type] = js.native
  def save(fn: js.Function2[/* err */ js.Any, /* product */ this.type, scala.Unit]): js.Promise[this.type] = js.native
  /**
       * Saves this document.
       * @param options options optional options
       * @param options.safe overrides schema's safe option
       * @param options.validateBeforeSave set to false to save without validating.
       * @param fn optional callback
       */
  def save(options: SaveOptions): js.Promise[this.type] = js.native
  /**
       * Saves this document.
       * @param options options optional options
       * @param options.safe overrides schema's safe option
       * @param options.validateBeforeSave set to false to save without validating.
       * @param fn optional callback
       */
  def save(options: SaveOptions, fn: js.Function2[/* err */ js.Any, /* product */ this.type, scala.Unit]): js.Promise[this.type] = js.native
}

