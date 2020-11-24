package typings.mongodb.mod

import typings.mongodb.mongodbStrings.error
import typings.mongodb.mongodbStrings.moderate
import typings.mongodb.mongodbStrings.off
import typings.mongodb.mongodbStrings.strict
import typings.mongodb.mongodbStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectionCreateOptions extends CommonOptions {
  
  var autoIndexId: js.UndefOr[Boolean] = js.native
  
  var capped: js.UndefOr[Boolean] = js.native
  
  var collation: js.UndefOr[CollationDocument] = js.native
  
  var flags: js.UndefOr[scala.Double] = js.native
  
  var indexOptionDefaults: js.UndefOr[js.Object] = js.native
  
  var max: js.UndefOr[scala.Double] = js.native
  
  var pipeline: js.UndefOr[js.Array[_]] = js.native
  
  var pkFactory: js.UndefOr[js.Object] = js.native
  
  var raw: js.UndefOr[Boolean] = js.native
  
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.native
  
  var serializeFunctions: js.UndefOr[Boolean] = js.native
  
  var size: js.UndefOr[scala.Double] = js.native
  
  var storageEngine: js.UndefOr[js.Object] = js.native
  
  var strict: js.UndefOr[Boolean] = js.native
  
  var validationAction: js.UndefOr[error | warn] = js.native
  
  var validationLevel: js.UndefOr[off | strict | moderate] = js.native
  
  var validator: js.UndefOr[js.Object] = js.native
  
  var viewOn: js.UndefOr[String] = js.native
}
object CollectionCreateOptions {
  
  @scala.inline
  def apply(): CollectionCreateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionCreateOptions]
  }
  
  @scala.inline
  implicit class CollectionCreateOptionsOps[Self <: CollectionCreateOptions] (val x: Self) extends AnyVal {
    
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
    def setAutoIndexId(value: Boolean): Self = this.set("autoIndexId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoIndexId: Self = this.set("autoIndexId", js.undefined)
    
    @scala.inline
    def setCapped(value: Boolean): Self = this.set("capped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapped: Self = this.set("capped", js.undefined)
    
    @scala.inline
    def setCollation(value: CollationDocument): Self = this.set("collation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollation: Self = this.set("collation", js.undefined)
    
    @scala.inline
    def setFlags(value: scala.Double): Self = this.set("flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlags: Self = this.set("flags", js.undefined)
    
    @scala.inline
    def setIndexOptionDefaults(value: js.Object): Self = this.set("indexOptionDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexOptionDefaults: Self = this.set("indexOptionDefaults", js.undefined)
    
    @scala.inline
    def setMax(value: scala.Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setPipelineVarargs(value: js.Any*): Self = this.set("pipeline", js.Array(value :_*))
    
    @scala.inline
    def setPipeline(value: js.Array[_]): Self = this.set("pipeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePipeline: Self = this.set("pipeline", js.undefined)
    
    @scala.inline
    def setPkFactory(value: js.Object): Self = this.set("pkFactory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePkFactory: Self = this.set("pkFactory", js.undefined)
    
    @scala.inline
    def setRaw(value: Boolean): Self = this.set("raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
    
    @scala.inline
    def setReadPreference(value: ReadPreferenceOrMode): Self = this.set("readPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadPreference: Self = this.set("readPreference", js.undefined)
    
    @scala.inline
    def setSerializeFunctions(value: Boolean): Self = this.set("serializeFunctions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSerializeFunctions: Self = this.set("serializeFunctions", js.undefined)
    
    @scala.inline
    def setSize(value: scala.Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setStorageEngine(value: js.Object): Self = this.set("storageEngine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageEngine: Self = this.set("storageEngine", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
    
    @scala.inline
    def setValidationAction(value: error | warn): Self = this.set("validationAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationAction: Self = this.set("validationAction", js.undefined)
    
    @scala.inline
    def setValidationLevel(value: off | strict | moderate): Self = this.set("validationLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationLevel: Self = this.set("validationLevel", js.undefined)
    
    @scala.inline
    def setValidator(value: js.Object): Self = this.set("validator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidator: Self = this.set("validator", js.undefined)
    
    @scala.inline
    def setViewOn(value: String): Self = this.set("viewOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewOn: Self = this.set("viewOn", js.undefined)
  }
}
