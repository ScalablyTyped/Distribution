package typings.popoto

import org.scalablytyped.runtime.StringDictionary
import typings.popoto.anon.PickQueryStructurewhereEl
import typings.popoto.graphLinkMod.Link
import typings.popoto.graphNodeMod.Node
import typings.popoto.popotoStrings.NEO4JID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queryMod {
  
  object Query {
    
    @JSImport("popoto/query", "Query")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("popoto/query", "Query.COLLECT_RELATIONS_WITH_VALUES")
    @js.native
    val COLLECT_RELATIONS_WITH_VALUES: Boolean = js.native
    
    /**
      * Define the number of results displayed in result list.
      */
    @JSImport("popoto/query", "Query.MAX_RESULTS_COUNT")
    @js.native
    val MAX_RESULTS_COUNT: Double = js.native
    
    @JSImport("popoto/query", "Query.RETURN_LABELS")
    @js.native
    val RETURN_LABELS: Boolean = js.native
    
    @JSImport("popoto/query", "Query.USE_PARENT_RELATION")
    @js.native
    val USE_PARENT_RELATION: Boolean = js.native
    
    @JSImport("popoto/query", "Query.USE_RELATION_DIRECTION")
    @js.native
    val USE_RELATION_DIRECTION: Boolean = js.native
    
    @JSImport("popoto/query", "Query.VALUE_QUERY_LIMIT")
    @js.native
    val VALUE_QUERY_LIMIT: Double = js.native
    
    inline def applyPrefilters(queryStructure: QueryStructure): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("applyPrefilters")(queryStructure.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /**
      * Function used to filter returned relations
      * return false if the result should be filtered out.
      *
      * @param d relation returned object
      * @returns boolean
      */
    inline def filterRelation(d: Link): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("filterRelation")(d.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def generateNegativeQueryElements(): PickQueryStructurewhereEl = ^.asInstanceOf[js.Dynamic].applyDynamic("generateNegativeQueryElements")().asInstanceOf[PickQueryStructurewhereEl]
    
    /**
      * Generate a cypher query to the get the node count, set as parameter matching the current graph.
      *
      * @param countedNode the counted node
      * @returns the node count cypher query
      */
    inline def generateNodeCountQuery(countedNode: Node): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateNodeCountQuery")(countedNode.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Generate a Cypher query to retrieve all the relation available for a given node.
      *
      * @param targetNode
      * @returns node relation query
      */
    inline def generateNodeRelationQuery(targetNode: Node): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateNodeRelationQuery")(targetNode.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Generate the where and parameter statements for the nodes with value
      *
      * @param node the node to generate value constraints
      * @param useCustomConstraints define whether to use custom generation in popoto config
      */
    inline def generateNodeValueConstraints(node: Node, useCustomConstraints: Boolean): PickQueryStructurewhereEl = (^.asInstanceOf[js.Dynamic].applyDynamic("generateNodeValueConstraints")(node.asInstanceOf[js.Any], useCustomConstraints.asInstanceOf[js.Any])).asInstanceOf[PickQueryStructurewhereEl]
    
    /**
      * Generate a Cypher query from the graph model to get all the possible values for the targetNode element.
      *
      * @param targetNode node in the graph to get the values.
      * @returns the query to execute to get all the values of targetNode corresponding to the graph.
      */
    inline def generateNodeValueQuery(targetNode: Node): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateNodeValueQuery")(targetNode.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Generate Cypher query match and where elements from root node, selected node and a set of the graph links.
      *
      * @param rootNode root node in the graph.
      * @param selectedNode graph target node.
      * @param links list of links subset of the graph.
      * @returns list of match and where elements.
      * @param isConstraintNeeded (used only for relation query)
      * @param useCustomConstraints define whether to use the custom constraints (actually it is used only for results)
      */
    inline def generateQueryElements(
      rootNode: Node,
      selectedNode: Node,
      links: js.Array[Link],
      isConstraintNeeded: Boolean,
      useCustomConstraints: Boolean
    ): QueryStructure = (^.asInstanceOf[js.Dynamic].applyDynamic("generateQueryElements")(rootNode.asInstanceOf[js.Any], selectedNode.asInstanceOf[js.Any], links.asInstanceOf[js.Any], isConstraintNeeded.asInstanceOf[js.Any], useCustomConstraints.asInstanceOf[js.Any])).asInstanceOf[QueryStructure]
    
    /**
      * Generate a Cypher query to retrieve the results matching the current graph.
      *
      * @param isGraph
      * @returns query structure
      */
    inline def generateResultQuery(isGraph: Boolean): QueryStructure = ^.asInstanceOf[js.Dynamic].applyDynamic("generateResultQuery")(isGraph.asInstanceOf[js.Any]).asInstanceOf[QueryStructure]
    
    /**
      * Generate the query to count nodes of a label.
      * If the label is defined as distinct in configuration the query will count only distinct values on constraint attribute.
      */
    inline def generateTaxonomyCountQuery(label: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateTaxonomyCountQuery")(label.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Get the list of link defining the complete path from node to root.
      * All other links are ignored.
      *
      * @param node The node where to start in the graph.
      * @param links
      */
    inline def getLinksToRoot(node: Node, links: js.Array[Link]): js.Array[Link] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLinksToRoot")(node.asInstanceOf[js.Any], links.asInstanceOf[js.Any])).asInstanceOf[js.Array[Link]]
    
    /**
      * Filter links to get only paths from root to leaf containing a value or being the selectedNode.
      * All other paths in the graph containing no value are ignored.
      *
      * @param rootNode root node of the graph.
      * @param targetNode node in the graph target of the query.
      * @param initialLinks list of links representing the graph to filter.
      * @returns list of relevant links.
      */
    inline def getRelevantLinks(rootNode: Node, targetNode: Node, initialLinks: js.Array[Link]): js.Array[Link] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRelevantLinks")(rootNode.asInstanceOf[js.Any], targetNode.asInstanceOf[js.Any], initialLinks.asInstanceOf[js.Any])).asInstanceOf[js.Array[Link]]
    
    @JSImport("popoto/query", "Query.prefilter")
    @js.native
    val prefilter: String = js.native
    
    /**
      * Immutable constant object to identify Neo4j internal ID
      */
    /* Inlined std.Readonly<{  queryInternalName :'NEO4JID'}> */
    trait NEO4J_INTERNAL_ID extends StObject {
      
      val queryInternalName: NEO4JID
    }
    object NEO4J_INTERNAL_ID {
      
      inline def apply(): NEO4J_INTERNAL_ID = {
        val __obj = js.Dynamic.literal(queryInternalName = "NEO4JID")
        __obj.asInstanceOf[NEO4J_INTERNAL_ID]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: NEO4J_INTERNAL_ID] (val x: Self) extends AnyVal {
        
        inline def setQueryInternalName(value: NEO4JID): Self = StObject.set(x, "queryInternalName", value.asInstanceOf[js.Any])
      }
    }
  }
  
  trait QueryStructure extends StObject {
    
    var endElements: js.Array[String]
    
    var matchElements: js.Array[String]
    
    var parameters: StringDictionary[Any]
    
    var returnElements: js.Array[String]
    
    var statement: String
    
    var whereElements: js.Array[String]
    
    var withElements: js.Array[String]
  }
  object QueryStructure {
    
    inline def apply(
      endElements: js.Array[String],
      matchElements: js.Array[String],
      parameters: StringDictionary[Any],
      returnElements: js.Array[String],
      statement: String,
      whereElements: js.Array[String],
      withElements: js.Array[String]
    ): QueryStructure = {
      val __obj = js.Dynamic.literal(endElements = endElements.asInstanceOf[js.Any], matchElements = matchElements.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], returnElements = returnElements.asInstanceOf[js.Any], statement = statement.asInstanceOf[js.Any], whereElements = whereElements.asInstanceOf[js.Any], withElements = withElements.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryStructure]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QueryStructure] (val x: Self) extends AnyVal {
      
      inline def setEndElements(value: js.Array[String]): Self = StObject.set(x, "endElements", value.asInstanceOf[js.Any])
      
      inline def setEndElementsVarargs(value: String*): Self = StObject.set(x, "endElements", js.Array(value*))
      
      inline def setMatchElements(value: js.Array[String]): Self = StObject.set(x, "matchElements", value.asInstanceOf[js.Any])
      
      inline def setMatchElementsVarargs(value: String*): Self = StObject.set(x, "matchElements", js.Array(value*))
      
      inline def setParameters(value: StringDictionary[Any]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setReturnElements(value: js.Array[String]): Self = StObject.set(x, "returnElements", value.asInstanceOf[js.Any])
      
      inline def setReturnElementsVarargs(value: String*): Self = StObject.set(x, "returnElements", js.Array(value*))
      
      inline def setStatement(value: String): Self = StObject.set(x, "statement", value.asInstanceOf[js.Any])
      
      inline def setWhereElements(value: js.Array[String]): Self = StObject.set(x, "whereElements", value.asInstanceOf[js.Any])
      
      inline def setWhereElementsVarargs(value: String*): Self = StObject.set(x, "whereElements", js.Array(value*))
      
      inline def setWithElements(value: js.Array[String]): Self = StObject.set(x, "withElements", value.asInstanceOf[js.Any])
      
      inline def setWithElementsVarargs(value: String*): Self = StObject.set(x, "withElements", js.Array(value*))
    }
  }
}
