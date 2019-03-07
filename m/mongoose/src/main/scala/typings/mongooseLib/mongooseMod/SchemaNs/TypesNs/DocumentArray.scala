package typings
package mongooseLib.mongooseMod.SchemaNs.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * section schema/documentarray.js
  * http://mongoosejs.com/docs/api.html#schema-documentarray-js
  */
@js.native
trait DocumentArray extends Array {
  /**
    * Adds a discriminator type.
    * @param name discriminator model name
    * @param schema discriminator model schema
    */
  def discriminator[U /* <: mongooseLib.mongooseMod.Document */](name: java.lang.String, schema: mongooseLib.mongooseMod.Schema[_]): mongooseLib.mongooseMod.Model[U, js.Object] = js.native
  /**
    * Adds a discriminator type.
    * @param name discriminator model name
    * @param schema discriminator model schema
    */
  @JSName("discriminator")
  def discriminator_UDocumentMModelM[U /* <: mongooseLib.mongooseMod.Document */, M /* <: mongooseLib.mongooseMod.Model[U, js.Object] */](name: java.lang.String, schema: mongooseLib.mongooseMod.Schema[_]): M = js.native
}

