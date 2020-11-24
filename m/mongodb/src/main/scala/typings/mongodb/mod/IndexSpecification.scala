package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexSpecification extends js.Object {
  
  var `2dsphereIndexVersion`: js.UndefOr[scala.Double] = js.native
  
  var background: js.UndefOr[Boolean] = js.native
  
  var bits: js.UndefOr[scala.Double] = js.native
  
  var bucketSize: js.UndefOr[scala.Double] = js.native
  
  var collation: js.UndefOr[CollationDocument] = js.native
  
  var default_language: js.UndefOr[String] = js.native
  
  var expireAfterSeconds: js.UndefOr[scala.Double] = js.native
  
  var key: js.Object = js.native
  
  var language_override: js.UndefOr[String] = js.native
  
  var max: js.UndefOr[scala.Double] = js.native
  
  var min: js.UndefOr[scala.Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var partialFilterExpression: js.UndefOr[js.Object] = js.native
  
  var sparse: js.UndefOr[Boolean] = js.native
  
  var storageEngine: js.UndefOr[js.Object] = js.native
  
  var textIndexVersion: js.UndefOr[scala.Double] = js.native
  
  var unique: js.UndefOr[Boolean] = js.native
  
  var weights: js.UndefOr[js.Object] = js.native
}
object IndexSpecification {
  
  @scala.inline
  def apply(key: js.Object): IndexSpecification = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexSpecification]
  }
  
  @scala.inline
  implicit class IndexSpecificationOps[Self <: IndexSpecification] (val x: Self) extends AnyVal {
    
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
    def setKey(value: js.Object): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set2dsphereIndexVersion(value: scala.Double): Self = this.set("2dsphereIndexVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete2dsphereIndexVersion: Self = this.set("2dsphereIndexVersion", js.undefined)
    
    @scala.inline
    def setBackground(value: Boolean): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setBits(value: scala.Double): Self = this.set("bits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBits: Self = this.set("bits", js.undefined)
    
    @scala.inline
    def setBucketSize(value: scala.Double): Self = this.set("bucketSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucketSize: Self = this.set("bucketSize", js.undefined)
    
    @scala.inline
    def setCollation(value: CollationDocument): Self = this.set("collation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollation: Self = this.set("collation", js.undefined)
    
    @scala.inline
    def setDefault_language(value: String): Self = this.set("default_language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault_language: Self = this.set("default_language", js.undefined)
    
    @scala.inline
    def setExpireAfterSeconds(value: scala.Double): Self = this.set("expireAfterSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpireAfterSeconds: Self = this.set("expireAfterSeconds", js.undefined)
    
    @scala.inline
    def setLanguage_override(value: String): Self = this.set("language_override", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage_override: Self = this.set("language_override", js.undefined)
    
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
    def setPartialFilterExpression(value: js.Object): Self = this.set("partialFilterExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartialFilterExpression: Self = this.set("partialFilterExpression", js.undefined)
    
    @scala.inline
    def setSparse(value: Boolean): Self = this.set("sparse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSparse: Self = this.set("sparse", js.undefined)
    
    @scala.inline
    def setStorageEngine(value: js.Object): Self = this.set("storageEngine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageEngine: Self = this.set("storageEngine", js.undefined)
    
    @scala.inline
    def setTextIndexVersion(value: scala.Double): Self = this.set("textIndexVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextIndexVersion: Self = this.set("textIndexVersion", js.undefined)
    
    @scala.inline
    def setUnique(value: Boolean): Self = this.set("unique", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnique: Self = this.set("unique", js.undefined)
    
    @scala.inline
    def setWeights(value: js.Object): Self = this.set("weights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeights: Self = this.set("weights", js.undefined)
  }
}
