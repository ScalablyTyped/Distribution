package typings
package oracledbLib.oracledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used when creating a new SODA document.
  */
trait SodaDocumentOptions extends js.Object {
  /**
    * Must be supplied if the document in intended to be inserted into a collection with client-assigned keys. It should be undefined, otherwise.
    */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If the document has non-JSON content, then mediaType should be set to the desired media type. Using a MIME type is recommended.
    *
    * @default application/json
    */
  var mediaType: js.UndefOr[java.lang.String] = js.undefined
}

object SodaDocumentOptions {
  @scala.inline
  def apply(key: java.lang.String = null, mediaType: java.lang.String = null): SodaDocumentOptions = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    if (mediaType != null) __obj.updateDynamic("mediaType")(mediaType)
    __obj.asInstanceOf[SodaDocumentOptions]
  }
}

