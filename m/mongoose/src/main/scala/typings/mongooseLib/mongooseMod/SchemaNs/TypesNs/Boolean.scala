package typings
package mongooseLib.mongooseMod.SchemaNs.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
        * section schema/boolean.js
        * http://mongoosejs.com/docs/api.html#schema-boolean-js
        */
@js.native
trait Boolean
  extends mongooseLib.mongooseMod.SchemaType {
  /**
           * Check if the given value satisfies a required validator. For a
           * boolean to satisfy a required validator, it must be strictly
           * equal to true or to false.
           */
  def checkRequired(value: js.Any): scala.Boolean = js.native
}

