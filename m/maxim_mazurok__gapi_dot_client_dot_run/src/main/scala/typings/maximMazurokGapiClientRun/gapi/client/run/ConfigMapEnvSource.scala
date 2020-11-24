package typings.maximMazurokGapiClientRun.gapi.client.run

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigMapEnvSource extends js.Object {
  
  /** This field should not be used directly as it is meant to be inlined directly into the message. Use the "name" field instead. */
  var localObjectReference: js.UndefOr[LocalObjectReference] = js.native
  
  /** Cloud Run fully managed: not supported Cloud Run for Anthos: supported The ConfigMap to select from. */
  var name: js.UndefOr[String] = js.native
  
  /** (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported Specify whether the ConfigMap must be defined */
  var optional: js.UndefOr[Boolean] = js.native
}
object ConfigMapEnvSource {
  
  @scala.inline
  def apply(): ConfigMapEnvSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigMapEnvSource]
  }
  
  @scala.inline
  implicit class ConfigMapEnvSourceOps[Self <: ConfigMapEnvSource] (val x: Self) extends AnyVal {
    
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
    def setLocalObjectReference(value: LocalObjectReference): Self = this.set("localObjectReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalObjectReference: Self = this.set("localObjectReference", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOptional(value: Boolean): Self = this.set("optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptional: Self = this.set("optional", js.undefined)
  }
}
