package typings.nodeRedEditorClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Node properties
  * Read more: https://nodered.org/docs/creating-nodes/properties
  */
@js.native
trait NodeProperties extends js.Object {
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var a: js.UndefOr[scala.Nothing] = js.native
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var b: js.UndefOr[scala.Nothing] = js.native
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var c: js.UndefOr[scala.Nothing] = js.native
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var changed: js.UndefOr[scala.Nothing] = js.native
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var d: js.UndefOr[scala.Nothing] = js.native
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var dirty: js.UndefOr[scala.Nothing] = js.native
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var e: js.UndefOr[scala.Nothing] = js.native
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var f: js.UndefOr[scala.Nothing] = js.native
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var g: js.UndefOr[scala.Nothing] = js.native
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var h: js.UndefOr[scala.Nothing] = js.native
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var i: js.UndefOr[scala.Nothing] = js.native
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var icon: js.UndefOr[scala.Nothing] = js.native
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var id: js.UndefOr[scala.Nothing] = js.native
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var info: js.UndefOr[scala.Nothing] = js.native
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var inputLabels: js.UndefOr[scala.Nothing] = js.native
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var inputs: js.UndefOr[scala.Nothing] = js.native
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var j: js.UndefOr[scala.Nothing] = js.native
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var k: js.UndefOr[scala.Nothing] = js.native
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var l: js.UndefOr[scala.Nothing] = js.native
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var m: js.UndefOr[scala.Nothing] = js.native
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var n: js.UndefOr[scala.Nothing] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var o: js.UndefOr[scala.Nothing] = js.native
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var outputLabels: js.UndefOr[scala.Nothing] = js.native
  
  /** If a node wants to allow the number of outputs it provides to be configurable then outputs may be included. */
  var outputs: js.UndefOr[Double] = js.native
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var p: js.UndefOr[scala.Nothing] = js.native
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var ports: js.UndefOr[scala.Nothing] = js.native
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var q: js.UndefOr[scala.Nothing] = js.native
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var r: js.UndefOr[scala.Nothing] = js.native
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var s: js.UndefOr[scala.Nothing] = js.native
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var selected: js.UndefOr[scala.Nothing] = js.native
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var t: js.UndefOr[scala.Nothing] = js.native
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var `type`: js.UndefOr[scala.Nothing] = js.native
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var u: js.UndefOr[scala.Nothing] = js.native
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var v: js.UndefOr[scala.Nothing] = js.native
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var valid: js.UndefOr[scala.Nothing] = js.native
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var validationErrors: js.UndefOr[scala.Nothing] = js.native
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var w: js.UndefOr[scala.Nothing] = js.native
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var wires: js.UndefOr[scala.Nothing] = js.native
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var x: js.UndefOr[scala.Nothing] = js.native
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var y: js.UndefOr[scala.Nothing] = js.native
  
  /** Reserved name for properties that MUST NOT BE USED. */
  var z: js.UndefOr[scala.Nothing] = js.native
}
object NodeProperties {
  
  @scala.inline
  def apply(): NodeProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeProperties]
  }
  
  @scala.inline
  implicit class NodePropertiesOps[Self <: NodeProperties] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOutputs(value: Double): Self = this.set("outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputs: Self = this.set("outputs", js.undefined)
  }
}
