package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexOptions
  extends StObject
     with CommonOptions {
  
  /**
    * Creates the index in the background, yielding whenever possible.
    */
  var background: js.UndefOr[Boolean] = js.undefined
  
  var collation: js.UndefOr[CollationDocument] = js.undefined
  
  var default_language: js.UndefOr[String] = js.undefined
  
  /**
    * A unique index cannot be created on a key that has pre-existing duplicate values.
    *
    * If you would like to create the index anyway, keeping the first document the database indexes and
    * deleting all subsequent documents that have duplicate value
    */
  var dropDups: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Allows you to expire data on indexes applied to a data (MongoDB 2.2 or higher)
    */
  var expireAfterSeconds: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * For geo spatial indexes set the high bound for the co-ordinates.
    */
  var max: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * For geo spatial indexes set the lower bound for the co-ordinates.
    */
  var min: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * Override the auto generated index name (useful if the resulting name is larger than 128 bytes)
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Creates a partial index based on the given filter object (MongoDB 3.2 or higher)
    */
  var partialFilterExpression: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Creates a sparse index.
    */
  var sparse: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Creates an unique index.
    */
  var unique: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specify the format version of the indexes.
    */
  var v: js.UndefOr[scala.Double] = js.undefined
}
object IndexOptions {
  
  inline def apply(): IndexOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndexOptions]
  }
  
  extension [Self <: IndexOptions](x: Self) {
    
    inline def setBackground(value: Boolean): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setCollation(value: CollationDocument): Self = StObject.set(x, "collation", value.asInstanceOf[js.Any])
    
    inline def setCollationUndefined: Self = StObject.set(x, "collation", js.undefined)
    
    inline def setDefault_language(value: String): Self = StObject.set(x, "default_language", value.asInstanceOf[js.Any])
    
    inline def setDefault_languageUndefined: Self = StObject.set(x, "default_language", js.undefined)
    
    inline def setDropDups(value: Boolean): Self = StObject.set(x, "dropDups", value.asInstanceOf[js.Any])
    
    inline def setDropDupsUndefined: Self = StObject.set(x, "dropDups", js.undefined)
    
    inline def setExpireAfterSeconds(value: scala.Double): Self = StObject.set(x, "expireAfterSeconds", value.asInstanceOf[js.Any])
    
    inline def setExpireAfterSecondsUndefined: Self = StObject.set(x, "expireAfterSeconds", js.undefined)
    
    inline def setMax(value: scala.Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: scala.Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPartialFilterExpression(value: js.Any): Self = StObject.set(x, "partialFilterExpression", value.asInstanceOf[js.Any])
    
    inline def setPartialFilterExpressionUndefined: Self = StObject.set(x, "partialFilterExpression", js.undefined)
    
    inline def setSparse(value: Boolean): Self = StObject.set(x, "sparse", value.asInstanceOf[js.Any])
    
    inline def setSparseUndefined: Self = StObject.set(x, "sparse", js.undefined)
    
    inline def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
    
    inline def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
    
    inline def setV(value: scala.Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    
    inline def setVUndefined: Self = StObject.set(x, "v", js.undefined)
  }
}
