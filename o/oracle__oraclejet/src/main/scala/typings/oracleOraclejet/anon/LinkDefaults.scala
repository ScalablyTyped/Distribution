package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkDefaults extends StObject {
  
  var linkDefaults: LabelLayoutPath
  
  var links: CoordinateSpace
  
  var nodeDefaults: `4`
  
  var nodes: LabelLayout
  
  var viewport: H
}
object LinkDefaults {
  
  inline def apply(
    linkDefaults: LabelLayoutPath,
    links: CoordinateSpace,
    nodeDefaults: `4`,
    nodes: LabelLayout,
    viewport: H
  ): LinkDefaults = {
    val __obj = js.Dynamic.literal(linkDefaults = linkDefaults.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], nodeDefaults = nodeDefaults.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkDefaults]
  }
  
  extension [Self <: LinkDefaults](x: Self) {
    
    inline def setLinkDefaults(value: LabelLayoutPath): Self = StObject.set(x, "linkDefaults", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: CoordinateSpace): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setNodeDefaults(value: `4`): Self = StObject.set(x, "nodeDefaults", value.asInstanceOf[js.Any])
    
    inline def setNodes(value: LabelLayout): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setViewport(value: H): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
  }
}
