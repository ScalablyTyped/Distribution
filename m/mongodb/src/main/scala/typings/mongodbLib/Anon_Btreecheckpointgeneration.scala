package typings
package mongodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Btreecheckpointgeneration extends js.Object {
  var `btree checkpoint generation`: scala.Double
  var `column-store fixed-size leaf pages`: scala.Double
  var `column-store internal pages`: scala.Double
  var `column-store variable-size RLE encoded values`: scala.Double
  var `column-store variable-size deleted values`: scala.Double
  var `column-store variable-size leaf pages`: scala.Double
  var `fixed-record size`: scala.Double
  var `maximum internal page key size`: scala.Double
  var `maximum internal page size`: scala.Double
  var `maximum leaf page key size`: scala.Double
  var `maximum leaf page size`: scala.Double
  var `maximum leaf page value size`: scala.Double
  var `maximum tree depth`: scala.Double
  var `number of key/value pairs`: scala.Double
  var `overflow pages`: scala.Double
  var `pages rewritten by compaction`: scala.Double
  var `row-store internal pages`: scala.Double
  var `row-store leaf pages`: scala.Double
}

object Anon_Btreecheckpointgeneration {
  @scala.inline
  def apply(
    `btree checkpoint generation`: scala.Double,
    `column-store fixed-size leaf pages`: scala.Double,
    `column-store internal pages`: scala.Double,
    `column-store variable-size RLE encoded values`: scala.Double,
    `column-store variable-size deleted values`: scala.Double,
    `column-store variable-size leaf pages`: scala.Double,
    `fixed-record size`: scala.Double,
    `maximum internal page key size`: scala.Double,
    `maximum internal page size`: scala.Double,
    `maximum leaf page key size`: scala.Double,
    `maximum leaf page size`: scala.Double,
    `maximum leaf page value size`: scala.Double,
    `maximum tree depth`: scala.Double,
    `number of key/value pairs`: scala.Double,
    `overflow pages`: scala.Double,
    `pages rewritten by compaction`: scala.Double,
    `row-store internal pages`: scala.Double,
    `row-store leaf pages`: scala.Double
  ): Anon_Btreecheckpointgeneration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("btree checkpoint generation")(`btree checkpoint generation`)
    __obj.updateDynamic("column-store fixed-size leaf pages")(`column-store fixed-size leaf pages`)
    __obj.updateDynamic("column-store internal pages")(`column-store internal pages`)
    __obj.updateDynamic("column-store variable-size RLE encoded values")(`column-store variable-size RLE encoded values`)
    __obj.updateDynamic("column-store variable-size deleted values")(`column-store variable-size deleted values`)
    __obj.updateDynamic("column-store variable-size leaf pages")(`column-store variable-size leaf pages`)
    __obj.updateDynamic("fixed-record size")(`fixed-record size`)
    __obj.updateDynamic("maximum internal page key size")(`maximum internal page key size`)
    __obj.updateDynamic("maximum internal page size")(`maximum internal page size`)
    __obj.updateDynamic("maximum leaf page key size")(`maximum leaf page key size`)
    __obj.updateDynamic("maximum leaf page size")(`maximum leaf page size`)
    __obj.updateDynamic("maximum leaf page value size")(`maximum leaf page value size`)
    __obj.updateDynamic("maximum tree depth")(`maximum tree depth`)
    __obj.updateDynamic("number of key/value pairs")(`number of key/value pairs`)
    __obj.updateDynamic("overflow pages")(`overflow pages`)
    __obj.updateDynamic("pages rewritten by compaction")(`pages rewritten by compaction`)
    __obj.updateDynamic("row-store internal pages")(`row-store internal pages`)
    __obj.updateDynamic("row-store leaf pages")(`row-store leaf pages`)
    __obj.asInstanceOf[Anon_Btreecheckpointgeneration]
  }
}

