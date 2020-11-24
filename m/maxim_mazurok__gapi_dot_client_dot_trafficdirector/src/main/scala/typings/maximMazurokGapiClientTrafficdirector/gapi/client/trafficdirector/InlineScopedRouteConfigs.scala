package typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InlineScopedRouteConfigs extends js.Object {
  
  /** The timestamp when the scoped route config set was last updated. */
  var lastUpdated: js.UndefOr[String] = js.native
  
  /** The name assigned to the scoped route configurations. */
  var name: js.UndefOr[String] = js.native
  
  /** The scoped route configurations. */
  var scopedRouteConfigs: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientTrafficdirector.maximMazurokGapiClientTrafficdirectorStrings.InlineScopedRouteConfigs with TopLevel[js.Any]
    ]
  ] = js.native
}
object InlineScopedRouteConfigs {
  
  @scala.inline
  def apply(): InlineScopedRouteConfigs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InlineScopedRouteConfigs]
  }
  
  @scala.inline
  implicit class InlineScopedRouteConfigsOps[Self <: InlineScopedRouteConfigs] (val x: Self) extends AnyVal {
    
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
    def setLastUpdated(value: String): Self = this.set("lastUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdated: Self = this.set("lastUpdated", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setScopedRouteConfigsVarargs(
      value: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientTrafficdirector.maximMazurokGapiClientTrafficdirectorStrings.InlineScopedRouteConfigs with TopLevel[js.Any])*
    ): Self = this.set("scopedRouteConfigs", js.Array(value :_*))
    
    @scala.inline
    def setScopedRouteConfigs(
      value: js.Array[
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientTrafficdirector.maximMazurokGapiClientTrafficdirectorStrings.InlineScopedRouteConfigs with TopLevel[js.Any]
        ]
    ): Self = this.set("scopedRouteConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScopedRouteConfigs: Self = this.set("scopedRouteConfigs", js.undefined)
  }
}
