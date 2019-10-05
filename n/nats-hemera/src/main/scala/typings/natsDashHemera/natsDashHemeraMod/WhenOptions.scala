package typings.natsDashHemera.natsDashHemeraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WhenOptions extends js.Object {
  /**
    * the required condition joi type.
    */
  var is: SchemaLike
  /**
    * the alternative schema type if the condition is false. Required if then is missing
    */
  var otherwise: js.UndefOr[SchemaLike] = js.undefined
  /**
    * the alternative schema type if the condition is true. Required if otherwise is missing.
    */
  var `then`: js.UndefOr[SchemaLike] = js.undefined
}

object WhenOptions {
  @scala.inline
  def apply(is: SchemaLike = null, otherwise: SchemaLike = null, `then`: SchemaLike = null): WhenOptions = {
    val __obj = js.Dynamic.literal()
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    if (otherwise != null) __obj.updateDynamic("otherwise")(otherwise.asInstanceOf[js.Any])
    if (`then` != null) __obj.updateDynamic("then")(`then`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhenOptions]
  }
}

