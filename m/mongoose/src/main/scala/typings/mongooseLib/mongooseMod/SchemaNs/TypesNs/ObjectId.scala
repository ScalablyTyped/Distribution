package typings
package mongooseLib.mongooseMod.SchemaNs.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
        * section schema/objectid.js
        * http://mongoosejs.com/docs/api.html#schema-objectid-js
        */
@js.native
trait ObjectId
  extends mongooseLib.mongooseMod.SchemaType {
  /**
           * Adds an auto-generated ObjectId default if turnOn is true.
           * @param turnOn auto generated ObjectId defaults
           */
  def auto(turnOn: scala.Boolean): this.type = js.native
  /** Check if the given value satisfies a required validator. */
  def checkRequired(value: js.Any, doc: mongooseLib.mongooseMod.MongooseDocument): scala.Boolean = js.native
}

