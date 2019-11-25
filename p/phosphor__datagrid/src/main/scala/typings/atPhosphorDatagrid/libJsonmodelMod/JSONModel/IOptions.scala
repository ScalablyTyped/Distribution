package typings.atPhosphorDatagrid.libJsonmodelMod.JSONModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for initializing a JSON data model.
  */
trait IOptions extends js.Object {
  /**
    * The data source for the data model.
    *
    * The data model takes full ownership of the data source.
    */
  var data: DataSource
  /**
    * The schema for the for the data model.
    *
    * The schema should be treated as an immutable object.
    */
  var schema: ISchema
}

object IOptions {
  @scala.inline
  def apply(data: DataSource, schema: ISchema): IOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IOptions]
  }
}

