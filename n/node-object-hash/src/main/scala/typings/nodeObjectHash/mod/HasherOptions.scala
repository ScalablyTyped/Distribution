package typings.nodeObjectHash.mod

import typings.node.cryptoMod.HexBase64Latin1Encoding
import typings.nodeObjectHash.objectSorterMod.CoerceOptions
import typings.nodeObjectHash.objectSorterMod.SortOptions
import typings.nodeObjectHash.objectSorterMod.SorterOptions
import typings.nodeObjectHash.objectSorterMod.TrimOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object hasher options
  */
trait HasherOptions extends SorterOptions {
  /**
    * Hash algorithm to use
    * @default 'sha256'
    */
  var alg: js.UndefOr[String] = js.undefined
  /**
    * String encoding for hash
    * @default 'hex'
    */
  var enc: js.UndefOr[HexBase64Latin1Encoding] = js.undefined
}

object HasherOptions {
  @scala.inline
  def apply(
    alg: String = null,
    coerce: Boolean | CoerceOptions = null,
    enc: HexBase64Latin1Encoding = null,
    sort: Boolean | SortOptions = null,
    trim: Boolean | TrimOptions = null
  ): HasherOptions = {
    val __obj = js.Dynamic.literal()
    if (alg != null) __obj.updateDynamic("alg")(alg.asInstanceOf[js.Any])
    if (coerce != null) __obj.updateDynamic("coerce")(coerce.asInstanceOf[js.Any])
    if (enc != null) __obj.updateDynamic("enc")(enc.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (trim != null) __obj.updateDynamic("trim")(trim.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasherOptions]
  }
}

