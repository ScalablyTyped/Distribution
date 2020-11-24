package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DbCollectionOptions extends CommonOptions {
  
  var pkFactory: js.UndefOr[js.Object] = js.native
  
  var raw: js.UndefOr[Boolean] = js.native
  
  var readConcern: js.UndefOr[ReadConcern] = js.native
  
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.native
  
  var serializeFunctions: js.UndefOr[Boolean] = js.native
  
  var strict: js.UndefOr[Boolean] = js.native
}
object DbCollectionOptions {
  
  @scala.inline
  def apply(): DbCollectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DbCollectionOptions]
  }
  
  @scala.inline
  implicit class DbCollectionOptionsOps[Self <: DbCollectionOptions] (val x: Self) extends AnyVal {
    
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
    def setPkFactory(value: js.Object): Self = this.set("pkFactory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePkFactory: Self = this.set("pkFactory", js.undefined)
    
    @scala.inline
    def setRaw(value: Boolean): Self = this.set("raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
    
    @scala.inline
    def setReadConcern(value: ReadConcern): Self = this.set("readConcern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadConcern: Self = this.set("readConcern", js.undefined)
    
    @scala.inline
    def setReadPreference(value: ReadPreferenceOrMode): Self = this.set("readPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadPreference: Self = this.set("readPreference", js.undefined)
    
    @scala.inline
    def setSerializeFunctions(value: Boolean): Self = this.set("serializeFunctions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSerializeFunctions: Self = this.set("serializeFunctions", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
  }
}
