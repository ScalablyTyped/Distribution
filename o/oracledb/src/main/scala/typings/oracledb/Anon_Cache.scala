package typings.oracledb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cache extends js.Object {
  /**
    * SecureFiles LOB cache setting.
    *
    * @default true
    */
  var cache: js.UndefOr[Boolean] = js.undefined
  /**
    * SecureFiles LOB compression setting.
    *
    * @default NONE
    */
  var compress: js.UndefOr[String] = js.undefined
  /**
    * SecureFiles LOB encryption setting.
    *
    * Before you create a collection that uses SecureFiles LOB encryption you must set up an encryption wallet.
    *
    * @default NONE
    */
  var encrypt: js.UndefOr[String] = js.undefined
  /**
    * Maximum length of the content column in bytes. This component applies only to content of type VARCHAR2.
    *
    * @default 4000
    */
  var maxLength: js.UndefOr[Double] = js.undefined
  /**
    * Name of the column that stores the database content.
    *
    * @default JSON_DOCUMENT
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * SQL data type of the column that stores the document content.
    *
    * @default BLOB
    */
  var sqlType: js.UndefOr[String] = js.undefined
  /**
    * Syntax to which JavaScript Object Notation (JSON) content must conform—strict or lax.
    *
    * @default STANDARD
    */
  var validation: js.UndefOr[String] = js.undefined
}

object Anon_Cache {
  @scala.inline
  def apply(
    cache: js.UndefOr[Boolean] = js.undefined,
    compress: String = null,
    encrypt: String = null,
    maxLength: Int | Double = null,
    name: String = null,
    sqlType: String = null,
    validation: String = null
  ): Anon_Cache = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (compress != null) __obj.updateDynamic("compress")(compress)
    if (encrypt != null) __obj.updateDynamic("encrypt")(encrypt)
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (sqlType != null) __obj.updateDynamic("sqlType")(sqlType)
    if (validation != null) __obj.updateDynamic("validation")(validation)
    __obj.asInstanceOf[Anon_Cache]
  }
}

