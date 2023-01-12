package typings.popoto.anon

import typings.popoto.popotoStrings.graphDotnodeDotadd_value
import typings.popoto.popotoStrings.graphDotnodeDotdata_loaded
import typings.popoto.popotoStrings.graphDotnodeDotrelation_add
import typings.popoto.popotoStrings.graphDotnodeDotvalue_collapse
import typings.popoto.popotoStrings.graphDotnodeDotvalue_expand
import typings.popoto.popotoStrings.graphDotreset
import typings.popoto.popotoStrings.graphDotsave
import typings.popoto.popotoStrings.nodeDotexpandRelationship
import typings.popoto.popotoStrings.rootDotnodeDotadd
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GRAPHNODEADDVALUE extends StObject {
  
  var GRAPH_NODE_ADD_VALUE: graphDotnodeDotadd_value
  
  var GRAPH_NODE_DATA_LOADED: graphDotnodeDotdata_loaded
  
  var GRAPH_NODE_RELATION_ADD: graphDotnodeDotrelation_add
  
  var GRAPH_NODE_VALUE_COLLAPSE: graphDotnodeDotvalue_collapse
  
  var GRAPH_NODE_VALUE_EXPAND: graphDotnodeDotvalue_expand
  
  var GRAPH_RESET: graphDotreset
  
  var GRAPH_SAVE: graphDotsave
  
  var NODE_EXPAND_RELATIONSHIP: nodeDotexpandRelationship
  
  var NODE_ROOT_ADD: rootDotnodeDotadd
}
object GRAPHNODEADDVALUE {
  
  inline def apply(): GRAPHNODEADDVALUE = {
    val __obj = js.Dynamic.literal(GRAPH_NODE_ADD_VALUE = "graph.node.add_value", GRAPH_NODE_DATA_LOADED = "graph.node.data_loaded", GRAPH_NODE_RELATION_ADD = "graph.node.relation_add", GRAPH_NODE_VALUE_COLLAPSE = "graph.node.value_collapse", GRAPH_NODE_VALUE_EXPAND = "graph.node.value_expand", GRAPH_RESET = "graph.reset", GRAPH_SAVE = "graph.save", NODE_EXPAND_RELATIONSHIP = "node.expandRelationship", NODE_ROOT_ADD = "root.node.add")
    __obj.asInstanceOf[GRAPHNODEADDVALUE]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GRAPHNODEADDVALUE] (val x: Self) extends AnyVal {
    
    inline def setGRAPH_NODE_ADD_VALUE(value: graphDotnodeDotadd_value): Self = StObject.set(x, "GRAPH_NODE_ADD_VALUE", value.asInstanceOf[js.Any])
    
    inline def setGRAPH_NODE_DATA_LOADED(value: graphDotnodeDotdata_loaded): Self = StObject.set(x, "GRAPH_NODE_DATA_LOADED", value.asInstanceOf[js.Any])
    
    inline def setGRAPH_NODE_RELATION_ADD(value: graphDotnodeDotrelation_add): Self = StObject.set(x, "GRAPH_NODE_RELATION_ADD", value.asInstanceOf[js.Any])
    
    inline def setGRAPH_NODE_VALUE_COLLAPSE(value: graphDotnodeDotvalue_collapse): Self = StObject.set(x, "GRAPH_NODE_VALUE_COLLAPSE", value.asInstanceOf[js.Any])
    
    inline def setGRAPH_NODE_VALUE_EXPAND(value: graphDotnodeDotvalue_expand): Self = StObject.set(x, "GRAPH_NODE_VALUE_EXPAND", value.asInstanceOf[js.Any])
    
    inline def setGRAPH_RESET(value: graphDotreset): Self = StObject.set(x, "GRAPH_RESET", value.asInstanceOf[js.Any])
    
    inline def setGRAPH_SAVE(value: graphDotsave): Self = StObject.set(x, "GRAPH_SAVE", value.asInstanceOf[js.Any])
    
    inline def setNODE_EXPAND_RELATIONSHIP(value: nodeDotexpandRelationship): Self = StObject.set(x, "NODE_EXPAND_RELATIONSHIP", value.asInstanceOf[js.Any])
    
    inline def setNODE_ROOT_ADD(value: rootDotnodeDotadd): Self = StObject.set(x, "NODE_ROOT_ADD", value.asInstanceOf[js.Any])
  }
}
