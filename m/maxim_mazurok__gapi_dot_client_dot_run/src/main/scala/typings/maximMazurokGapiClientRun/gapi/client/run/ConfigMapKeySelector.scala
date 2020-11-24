package typings.maximMazurokGapiClientRun.gapi.client.run

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigMapKeySelector extends js.Object {
  
  /** Cloud Run fully managed: not supported Cloud Run for Anthos: supported The key to select. */
  var key: js.UndefOr[String] = js.native
  
  /** This field should not be used directly as it is meant to be inlined directly into the message. Use the "name" field instead. */
  var localObjectReference: js.UndefOr[LocalObjectReference] = js.native
  
  /** Cloud Run fully managed: not supported Cloud Run for Anthos: supported The ConfigMap to select from. */
  var name: js.UndefOr[String] = js.native
  
  /** (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported Specify whether the ConfigMap or its key must be defined */
  var optional: js.UndefOr[Boolean] = js.native
}
object ConfigMapKeySelector {
  
  @scala.inline
  def apply(): ConfigMapKeySelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigMapKeySelector]
  }
  
  @scala.inline
  implicit class ConfigMapKeySelectorOps[Self <: ConfigMapKeySelector] (val x: Self) extends AnyVal {
    
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
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
