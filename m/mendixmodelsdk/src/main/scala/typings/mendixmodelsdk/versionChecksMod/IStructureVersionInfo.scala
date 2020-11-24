package typings.mendixmodelsdk.versionChecksMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStructureVersionInfo extends ILifeCycle {
  
  var experimental: js.UndefOr[IModifierValueHistory] = js.native
  
  var properties: js.UndefOr[StringDictionary[IPropertyVersionInfo]] = js.native
  
  var public: js.UndefOr[IModifierValueHistory] = js.native
}
object IStructureVersionInfo {
  
  @scala.inline
  def apply(): IStructureVersionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStructureVersionInfo]
  }
  
  @scala.inline
  implicit class IStructureVersionInfoOps[Self <: IStructureVersionInfo] (val x: Self) extends AnyVal {
    
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
    def setExperimental(value: IModifierValueHistory): Self = this.set("experimental", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExperimental: Self = this.set("experimental", js.undefined)
    
    @scala.inline
    def setProperties(value: StringDictionary[IPropertyVersionInfo]): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    
    @scala.inline
    def setPublic(value: IModifierValueHistory): Self = this.set("public", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublic: Self = this.set("public", js.undefined)
  }
}
