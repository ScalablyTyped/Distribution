package typings.mongodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Btreecheckpointgeneration extends js.Object {
  var `btree checkpoint generation`: Double
  var `column-store fixed-size leaf pages`: Double
  var `column-store internal pages`: Double
  var `column-store variable-size RLE encoded values`: Double
  var `column-store variable-size deleted values`: Double
  var `column-store variable-size leaf pages`: Double
  var `fixed-record size`: Double
  var `maximum internal page key size`: Double
  var `maximum internal page size`: Double
  var `maximum leaf page key size`: Double
  var `maximum leaf page size`: Double
  var `maximum leaf page value size`: Double
  var `maximum tree depth`: Double
  @JSName("number of key/value pairs")
  var `number of keySlashvalue pairs`: Double
  var `overflow pages`: Double
  var `pages rewritten by compaction`: Double
  var `row-store internal pages`: Double
  var `row-store leaf pages`: Double
}

object Anon_Btreecheckpointgeneration {
  @scala.inline
  def apply(
    `btree checkpoint generation`: Double,
    `column-store fixed-size leaf pages`: Double,
    `column-store internal pages`: Double,
    `column-store variable-size RLE encoded values`: Double,
    `column-store variable-size deleted values`: Double,
    `column-store variable-size leaf pages`: Double,
    `fixed-record size`: Double,
    `maximum internal page key size`: Double,
    `maximum internal page size`: Double,
    `maximum leaf page key size`: Double,
    `maximum leaf page size`: Double,
    `maximum leaf page value size`: Double,
    `maximum tree depth`: Double,
    `number of keySlashvalue pairs`: Double,
    `overflow pages`: Double,
    `pages rewritten by compaction`: Double,
    `row-store internal pages`: Double,
    `row-store leaf pages`: Double
  ): Anon_Btreecheckpointgeneration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("btree checkpoint generation")(`btree checkpoint generation`.asInstanceOf[js.Any])
    __obj.updateDynamic("column-store fixed-size leaf pages")(`column-store fixed-size leaf pages`.asInstanceOf[js.Any])
    __obj.updateDynamic("column-store internal pages")(`column-store internal pages`.asInstanceOf[js.Any])
    __obj.updateDynamic("column-store variable-size RLE encoded values")(`column-store variable-size RLE encoded values`.asInstanceOf[js.Any])
    __obj.updateDynamic("column-store variable-size deleted values")(`column-store variable-size deleted values`.asInstanceOf[js.Any])
    __obj.updateDynamic("column-store variable-size leaf pages")(`column-store variable-size leaf pages`.asInstanceOf[js.Any])
    __obj.updateDynamic("fixed-record size")(`fixed-record size`.asInstanceOf[js.Any])
    __obj.updateDynamic("maximum internal page key size")(`maximum internal page key size`.asInstanceOf[js.Any])
    __obj.updateDynamic("maximum internal page size")(`maximum internal page size`.asInstanceOf[js.Any])
    __obj.updateDynamic("maximum leaf page key size")(`maximum leaf page key size`.asInstanceOf[js.Any])
    __obj.updateDynamic("maximum leaf page size")(`maximum leaf page size`.asInstanceOf[js.Any])
    __obj.updateDynamic("maximum leaf page value size")(`maximum leaf page value size`.asInstanceOf[js.Any])
    __obj.updateDynamic("maximum tree depth")(`maximum tree depth`.asInstanceOf[js.Any])
    __obj.updateDynamic("number of key/value pairs")(`number of keySlashvalue pairs`.asInstanceOf[js.Any])
    __obj.updateDynamic("overflow pages")(`overflow pages`.asInstanceOf[js.Any])
    __obj.updateDynamic("pages rewritten by compaction")(`pages rewritten by compaction`.asInstanceOf[js.Any])
    __obj.updateDynamic("row-store internal pages")(`row-store internal pages`.asInstanceOf[js.Any])
    __obj.updateDynamic("row-store leaf pages")(`row-store leaf pages`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Btreecheckpointgeneration]
  }
}

