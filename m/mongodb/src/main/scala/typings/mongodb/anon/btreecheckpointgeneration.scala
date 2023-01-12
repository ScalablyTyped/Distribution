package typings.mongodb.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  btree checkpoint generation :number,   column-store fixed-size leaf pages :number,   column-store internal pages :number,   column-store variable-size RLE encoded values :number,   column-store variable-size deleted values :number,   column-store variable-size leaf pages :number,   fixed-record size :number,   maximum internal page key size :number,   maximum internal page size :number,   maximum leaf page key size :number,   maximum leaf page size :number,   maximum leaf page value size :number,   maximum tree depth :number,   number of key/value pairs :number,   overflow pages :number,   pages rewritten by compaction :number,   row-store internal pages :number,   row-store leaf pages :number} & bson.bson.Document */
trait btreecheckpointgeneration
  extends StObject
     with /* key */ StringDictionary[Any] {
  
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
object btreecheckpointgeneration {
  
  inline def apply(
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
  ): btreecheckpointgeneration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("btree checkpoint generation")((`btree checkpoint generation`).asInstanceOf[js.Any])
    __obj.updateDynamic("column-store fixed-size leaf pages")((`column-store fixed-size leaf pages`).asInstanceOf[js.Any])
    __obj.updateDynamic("column-store internal pages")((`column-store internal pages`).asInstanceOf[js.Any])
    __obj.updateDynamic("column-store variable-size RLE encoded values")((`column-store variable-size RLE encoded values`).asInstanceOf[js.Any])
    __obj.updateDynamic("column-store variable-size deleted values")((`column-store variable-size deleted values`).asInstanceOf[js.Any])
    __obj.updateDynamic("column-store variable-size leaf pages")((`column-store variable-size leaf pages`).asInstanceOf[js.Any])
    __obj.updateDynamic("fixed-record size")((`fixed-record size`).asInstanceOf[js.Any])
    __obj.updateDynamic("maximum internal page key size")((`maximum internal page key size`).asInstanceOf[js.Any])
    __obj.updateDynamic("maximum internal page size")((`maximum internal page size`).asInstanceOf[js.Any])
    __obj.updateDynamic("maximum leaf page key size")((`maximum leaf page key size`).asInstanceOf[js.Any])
    __obj.updateDynamic("maximum leaf page size")((`maximum leaf page size`).asInstanceOf[js.Any])
    __obj.updateDynamic("maximum leaf page value size")((`maximum leaf page value size`).asInstanceOf[js.Any])
    __obj.updateDynamic("maximum tree depth")((`maximum tree depth`).asInstanceOf[js.Any])
    __obj.updateDynamic("number of key/value pairs")((`number of keySlashvalue pairs`).asInstanceOf[js.Any])
    __obj.updateDynamic("overflow pages")((`overflow pages`).asInstanceOf[js.Any])
    __obj.updateDynamic("pages rewritten by compaction")((`pages rewritten by compaction`).asInstanceOf[js.Any])
    __obj.updateDynamic("row-store internal pages")((`row-store internal pages`).asInstanceOf[js.Any])
    __obj.updateDynamic("row-store leaf pages")((`row-store leaf pages`).asInstanceOf[js.Any])
    __obj.asInstanceOf[btreecheckpointgeneration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: btreecheckpointgeneration] (val x: Self) extends AnyVal {
    
    inline def `setBtree checkpoint generation`(value: Double): Self = StObject.set(x, "btree checkpoint generation", value.asInstanceOf[js.Any])
    
    inline def `setColumn-store fixed-size leaf pages`(value: Double): Self = StObject.set(x, "column-store fixed-size leaf pages", value.asInstanceOf[js.Any])
    
    inline def `setColumn-store internal pages`(value: Double): Self = StObject.set(x, "column-store internal pages", value.asInstanceOf[js.Any])
    
    inline def `setColumn-store variable-size RLE encoded values`(value: Double): Self = StObject.set(x, "column-store variable-size RLE encoded values", value.asInstanceOf[js.Any])
    
    inline def `setColumn-store variable-size deleted values`(value: Double): Self = StObject.set(x, "column-store variable-size deleted values", value.asInstanceOf[js.Any])
    
    inline def `setColumn-store variable-size leaf pages`(value: Double): Self = StObject.set(x, "column-store variable-size leaf pages", value.asInstanceOf[js.Any])
    
    inline def `setFixed-record size`(value: Double): Self = StObject.set(x, "fixed-record size", value.asInstanceOf[js.Any])
    
    inline def `setMaximum internal page key size`(value: Double): Self = StObject.set(x, "maximum internal page key size", value.asInstanceOf[js.Any])
    
    inline def `setMaximum internal page size`(value: Double): Self = StObject.set(x, "maximum internal page size", value.asInstanceOf[js.Any])
    
    inline def `setMaximum leaf page key size`(value: Double): Self = StObject.set(x, "maximum leaf page key size", value.asInstanceOf[js.Any])
    
    inline def `setMaximum leaf page size`(value: Double): Self = StObject.set(x, "maximum leaf page size", value.asInstanceOf[js.Any])
    
    inline def `setMaximum leaf page value size`(value: Double): Self = StObject.set(x, "maximum leaf page value size", value.asInstanceOf[js.Any])
    
    inline def `setMaximum tree depth`(value: Double): Self = StObject.set(x, "maximum tree depth", value.asInstanceOf[js.Any])
    
    inline def `setNumber of keySlashvalue pairs`(value: Double): Self = StObject.set(x, "number of key/value pairs", value.asInstanceOf[js.Any])
    
    inline def `setOverflow pages`(value: Double): Self = StObject.set(x, "overflow pages", value.asInstanceOf[js.Any])
    
    inline def `setPages rewritten by compaction`(value: Double): Self = StObject.set(x, "pages rewritten by compaction", value.asInstanceOf[js.Any])
    
    inline def `setRow-store internal pages`(value: Double): Self = StObject.set(x, "row-store internal pages", value.asInstanceOf[js.Any])
    
    inline def `setRow-store leaf pages`(value: Double): Self = StObject.set(x, "row-store leaf pages", value.asInstanceOf[js.Any])
  }
}
