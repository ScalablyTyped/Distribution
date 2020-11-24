package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexOptions extends CommonOptions {
  
  /**
    * Creates the index in the background, yielding whenever possible.
    */
  var background: js.UndefOr[Boolean] = js.native
  
  var collation: js.UndefOr[CollationDocument] = js.native
  
  var default_language: js.UndefOr[String] = js.native
  
  /**
    * A unique index cannot be created on a key that has pre-existing duplicate values.
    *
    * If you would like to create the index anyway, keeping the first document the database indexes and
    * deleting all subsequent documents that have duplicate value
    */
  var dropDups: js.UndefOr[Boolean] = js.native
  
  /**
    * Allows you to expire data on indexes applied to a data (MongoDB 2.2 or higher)
    */
  var expireAfterSeconds: js.UndefOr[scala.Double] = js.native
  
  /**
    * For geo spatial indexes set the high bound for the co-ordinates.
    */
  var max: js.UndefOr[scala.Double] = js.native
  
  /**
    * For geo spatial indexes set the lower bound for the co-ordinates.
    */
  var min: js.UndefOr[scala.Double] = js.native
  
  /**
    * Override the auto generated index name (useful if the resulting name is larger than 128 bytes)
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Creates a partial index based on the given filter object (MongoDB 3.2 or higher)
    */
  var partialFilterExpression: js.UndefOr[js.Any] = js.native
  
  /**
    * Creates a sparse index.
    */
  var sparse: js.UndefOr[Boolean] = js.native
  
  /**
    * Creates an unique index.
    */
  var unique: js.UndefOr[Boolean] = js.native
  
  /**
    * Specify the format version of the indexes.
    */
  var v: js.UndefOr[scala.Double] = js.native
}
object IndexOptions {
  
  @scala.inline
  def apply(): IndexOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndexOptions]
  }
  
  @scala.inline
  implicit class IndexOptionsOps[Self <: IndexOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBackground(value: Boolean): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setCollation(value: CollationDocument): Self = this.set("collation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollation: Self = this.set("collation", js.undefined)
    
    @scala.inline
    def setDefault_language(value: String): Self = this.set("default_language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault_language: Self = this.set("default_language", js.undefined)
    
    @scala.inline
    def setDropDups(value: Boolean): Self = this.set("dropDups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropDups: Self = this.set("dropDups", js.undefined)
    
    @scala.inline
    def setExpireAfterSeconds(value: scala.Double): Self = this.set("expireAfterSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpireAfterSeconds: Self = this.set("expireAfterSeconds", js.undefined)
    
    @scala.inline
    def setMax(value: scala.Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: scala.Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPartialFilterExpression(value: js.Any): Self = this.set("partialFilterExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartialFilterExpression: Self = this.set("partialFilterExpression", js.undefined)
    
    @scala.inline
    def setSparse(value: Boolean): Self = this.set("sparse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSparse: Self = this.set("sparse", js.undefined)
    
    @scala.inline
    def setUnique(value: Boolean): Self = this.set("unique", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnique: Self = this.set("unique", js.undefined)
    
    @scala.inline
    def setV(value: scala.Double): Self = this.set("v", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteV: Self = this.set("v", js.undefined)
  }
}
