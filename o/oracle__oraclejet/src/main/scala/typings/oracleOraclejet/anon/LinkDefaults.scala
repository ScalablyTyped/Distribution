package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkDefaults extends StObject {
  
  var linkDefaults: LabelLayoutPath = js.native
  
  var links: CoordinateSpace = js.native
  
  var nodeDefaults: `4` = js.native
  
  var nodes: LabelLayout = js.native
  
  var viewport: H = js.native
}
object LinkDefaults {
  
  @scala.inline
  def apply(
    linkDefaults: LabelLayoutPath,
    links: CoordinateSpace,
    nodeDefaults: `4`,
    nodes: LabelLayout,
    viewport: H
  ): LinkDefaults = {
    val __obj = js.Dynamic.literal(linkDefaults = linkDefaults.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], nodeDefaults = nodeDefaults.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkDefaults]
  }
  
  @scala.inline
  implicit class LinkDefaultsMutableBuilder[Self <: LinkDefaults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLinkDefaults(value: LabelLayoutPath): Self = StObject.set(x, "linkDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinks(value: CoordinateSpace): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeDefaults(value: `4`): Self = StObject.set(x, "nodeDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodes(value: LabelLayout): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewport(value: H): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
  }
}
