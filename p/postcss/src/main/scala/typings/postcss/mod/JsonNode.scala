package typings.postcss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsonNode extends js.Object {
  /**
    * Returns the node's parent node.
    */
  var parent: js.UndefOr[JsonContainer] = js.native
  /**
    * Contains information to generate byte-to-byte equal node string as it
    * was in origin input.
    */
  var raws: js.UndefOr[NodeRaws] = js.native
  /**
    * Returns the input source of the node. The property is used in source
    * map generation. If you create a node manually (e.g., with
    * postcss.decl() ), that node will not have a  source  property and
    * will be absent from the source map. For this reason, the plugin
    * developer should consider cloning nodes to create new ones (in which
    * case the new node's source will reference the original, cloned node)
    * or setting the source property manually.
    */
  var source: js.UndefOr[NodeSource] = js.native
  /**
    * Returns a string representing the node's type. Possible values are
    * root, atrule, rule, decl or comment.
    */
  var `type`: js.UndefOr[String] = js.native
}

object JsonNode {
  @scala.inline
  def apply(): JsonNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsonNode]
  }
  @scala.inline
  implicit class JsonNodeOps[Self <: JsonNode] (val x: Self) extends AnyVal {
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
    def setParent(value: JsonContainer): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    @scala.inline
    def setRaws(value: NodeRaws): Self = this.set("raws", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRaws: Self = this.set("raws", js.undefined)
    @scala.inline
    def setSource(value: NodeSource): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

