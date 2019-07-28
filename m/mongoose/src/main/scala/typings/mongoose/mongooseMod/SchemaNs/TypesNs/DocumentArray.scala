package typings.mongoose.mongooseMod.SchemaNs.TypesNs

import typings.mongoose.mongooseMod.Document
import typings.mongoose.mongooseMod.Model
import typings.mongoose.mongooseMod.Schema
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
  def discriminator[U /* <: Document */](name: java.lang.String, schema: Schema[_]): Model[U, js.Object] = js.native
  /**
    * Adds a discriminator type.
    * @param name discriminator model name
    * @param schema discriminator model schema
    */
  @JSName("discriminator")
  def discriminator_U_DocumentM_ModelUObject_M[U /* <: Document */, M /* <: Model[U, js.Object] */](name: java.lang.String, schema: Schema[_]): M = js.native
}

