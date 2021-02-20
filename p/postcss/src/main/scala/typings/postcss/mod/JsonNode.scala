package typings.postcss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JsonNode extends StObject {
  
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
  implicit class JsonNodeMutableBuilder[Self <: JsonNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParent(value: JsonContainer): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setRaws(value: NodeRaws): Self = StObject.set(x, "raws", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawsUndefined: Self = StObject.set(x, "raws", js.undefined)
    
    @scala.inline
    def setSource(value: NodeSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
