package typings.octokitPluginRestEndpointMethods.typesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndpointDecorations extends js.Object {
  
  var deprecated: js.UndefOr[String] = js.native
  
  var mapToData: js.UndefOr[String] = js.native
  
  var renamed: js.UndefOr[js.Tuple2[String, String]] = js.native
  
  var renamedParameters: js.UndefOr[StringDictionary[String]] = js.native
}
object EndpointDecorations {
  
  @scala.inline
  def apply(): EndpointDecorations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointDecorations]
  }
  
  @scala.inline
  implicit class EndpointDecorationsOps[Self <: EndpointDecorations] (val x: Self) extends AnyVal {
    
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
    def setDeprecated(value: String): Self = this.set("deprecated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeprecated: Self = this.set("deprecated", js.undefined)
    
    @scala.inline
    def setMapToData(value: String): Self = this.set("mapToData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMapToData: Self = this.set("mapToData", js.undefined)
    
    @scala.inline
    def setRenamed(value: js.Tuple2[String, String]): Self = this.set("renamed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenamed: Self = this.set("renamed", js.undefined)
    
    @scala.inline
    def setRenamedParameters(value: StringDictionary[String]): Self = this.set("renamedParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenamedParameters: Self = this.set("renamedParameters", js.undefined)
  }
}
