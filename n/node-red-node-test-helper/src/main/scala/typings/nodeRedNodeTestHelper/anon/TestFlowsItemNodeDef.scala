package typings.nodeRedNodeTestHelper.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined node-red-node-test-helper.node-red-node-test-helper.TestFlowsItem<node-red.node-red.NodeDef> */
@js.native
trait TestFlowsItemNodeDef extends js.Object {
  
  var id: js.UndefOr[String] with String = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] with String = js.native
  
  var wires: js.UndefOr[js.Array[js.Array[String]]] = js.native
  
  var z: js.UndefOr[String] = js.native
}
object TestFlowsItemNodeDef {
  
  @scala.inline
  def apply(id: js.UndefOr[String] with String, `type`: js.UndefOr[String] with String): TestFlowsItemNodeDef = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestFlowsItemNodeDef]
  }
  
  @scala.inline
  implicit class TestFlowsItemNodeDefOps[Self <: TestFlowsItemNodeDef] (val x: Self) extends AnyVal {
    
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
    def setId(value: js.UndefOr[String] with String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: js.UndefOr[String] with String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setWiresVarargs(value: js.Array[String]*): Self = this.set("wires", js.Array(value :_*))
    
    @scala.inline
    def setWires(value: js.Array[js.Array[String]]): Self = this.set("wires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWires: Self = this.set("wires", js.undefined)
    
    @scala.inline
    def setZ(value: String): Self = this.set("z", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZ: Self = this.set("z", js.undefined)
  }
}
