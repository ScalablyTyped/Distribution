package typings.popoto.anon

import typings.popoto.providerMod.Node
import typings.popoto.queryMod.Query.NEO4J_INTERNAL_ID
import typings.std.SVGGElement
import typings.std.SVGPathElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<popoto.popoto/provider.Node> */
trait PartialNode extends StObject {
  
  var DisplayTypes: js.UndefOr[IMAGE] = js.undefined
  
  var autoExpandRelations: js.UndefOr[Boolean] = js.undefined
  
  var constraintAttribute: js.UndefOr[NEO4J_INTERNAL_ID] = js.undefined
  
  var displayAttribute: js.UndefOr[js.Array[Any]] = js.undefined
  
  var displayResults: js.UndefOr[js.Function1[/* pElmt */ SVGPathElement, Unit]] = js.undefined
  
  var filterNodeCountQuery: js.UndefOr[
    js.Function2[
      /* node */ Node, 
      /* initialQuery */ Any, 
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof initialQuery */ Any
    ]
  ] = js.undefined
  
  var filterNodeRelationQuery: js.UndefOr[
    js.Function2[
      /* node */ Node, 
      /* initialQuery */ Any, 
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof initialQuery */ Any
    ]
  ] = js.undefined
  
  var filterNodeValueQuery: js.UndefOr[
    js.Function2[
      /* node */ Node, 
      /* initialQuery */ Any, 
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof initialQuery */ Any
    ]
  ] = js.undefined
  
  var filterResultQuery: js.UndefOr[
    js.Function1[
      /* initialQuery */ Any, 
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof initialQuery */ Any
    ]
  ] = js.undefined
  
  var generateNegativeNodeValueConstraints: js.UndefOr[js.Array[Any]] = js.undefined
  
  var generateNodeValueConstraints: js.UndefOr[js.Array[Any]] = js.undefined
  
  var getCSSClass: js.UndefOr[js.Function2[/* node */ Node, /* element */ SVGGElement, String]] = js.undefined
  
  var getColor: js.UndefOr[js.Function1[/* node */ Node, String]] = js.undefined
  
  var getConstraintAttribute: js.UndefOr[js.Function1[/* label */ String, Any]] = js.undefined
  
  var getDisplayAttribute: js.UndefOr[js.Function1[/* label */ String, Any]] = js.undefined
  
  var getDisplayResults: js.UndefOr[js.Function1[/* label */ String, Any]] = js.undefined
  
  var getDisplayType: js.UndefOr[js.Function1[/* node */ Node, Double]] = js.undefined
  
  var getGenerateNegativeNodeValueConstraints: js.UndefOr[js.Function1[/* node */ Node, js.Array[String]]] = js.undefined
  
  var getGenerateNodeValueConstraints: js.UndefOr[js.Function1[/* node */ Node, Any]] = js.undefined
  
  var getImageHeight: js.UndefOr[js.Function1[/* node */ Node, Double]] = js.undefined
  
  var getImagePath: js.UndefOr[js.Function1[/* node */ Node, String]] = js.undefined
  
  var getImageWidth: js.UndefOr[js.Function1[/* node */ Node, Double]] = js.undefined
  
  var getIsAutoExpandRelations: js.UndefOr[js.Function1[/* label */ String, Boolean]] = js.undefined
  
  var getIsAutoLoadValue: js.UndefOr[js.Function1[/* label */ String, Boolean]] = js.undefined
  
  var getIsGroup: js.UndefOr[js.Function1[/* node */ Node, Boolean]] = js.undefined
  
  var getIsSearchable: js.UndefOr[js.Function1[/* label */ String, Boolean]] = js.undefined
  
  var getIsTextDisplayed: js.UndefOr[js.Function1[/* node */ Node, Boolean]] = js.undefined
  
  var getNodeDisplayType: js.UndefOr[js.Function1[/* node */ Node, Any]] = js.undefined
  
  var getPredefinedConstraints: js.UndefOr[js.Array[Any]] = js.undefined
  
  var getProperty: js.UndefOr[js.Function2[/* label */ String, /* name */ String, Any]] = js.undefined
  
  var getProvider: js.UndefOr[js.Function1[/* label */ String, Node]] = js.undefined
  
  var getResultOrderByAttribute: js.UndefOr[js.Function1[/* label */ String, Any]] = js.undefined
  
  var getReturnAttributes: js.UndefOr[js.Function1[/* label */ String, js.Array[Any]]] = js.undefined
  
  var getSVGPaths: js.UndefOr[js.Function1[/* node */ Node, js.Array[Any]]] = js.undefined
  
  var getSchema: js.UndefOr[js.Function1[/* label */ String, Any]] = js.undefined
  
  var getSemanticValue: js.UndefOr[js.Function1[/* node */ Node, String]] = js.undefined
  
  var getSize: js.UndefOr[js.Function1[/* node */ Node, Double]] = js.undefined
  
  var getTextValue: js.UndefOr[js.Function2[/* node */ Node, /* maxLength */ Double, String]] = js.undefined
  
  var getValueOrderByAttribute: js.UndefOr[js.Function1[/* label */ String, Any]] = js.undefined
  
  var isAutoLoadValue: js.UndefOr[Boolean] = js.undefined
  
  var isResultOrderAscending: js.UndefOr[Boolean] = js.undefined
  
  var isSearchable: js.UndefOr[Boolean] = js.undefined
  
  var isTextDisplayed: js.UndefOr[js.Function1[/* node */ Node, Boolean]] = js.undefined
  
  var isValueOrderAscending: js.UndefOr[Boolean] = js.undefined
  
  var resultOrderByAttribute: js.UndefOr[Null | String] = js.undefined
  
  var returnAttributes: js.UndefOr[js.Array[Any]] = js.undefined
  
  var valueOrderByAttribute: js.UndefOr[String] = js.undefined
}
object PartialNode {
  
  inline def apply(): PartialNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialNode]
  }
  
  extension [Self <: PartialNode](x: Self) {
    
    inline def setAutoExpandRelations(value: Boolean): Self = StObject.set(x, "autoExpandRelations", value.asInstanceOf[js.Any])
    
    inline def setAutoExpandRelationsUndefined: Self = StObject.set(x, "autoExpandRelations", js.undefined)
    
    inline def setConstraintAttribute(value: NEO4J_INTERNAL_ID): Self = StObject.set(x, "constraintAttribute", value.asInstanceOf[js.Any])
    
    inline def setConstraintAttributeUndefined: Self = StObject.set(x, "constraintAttribute", js.undefined)
    
    inline def setDisplayAttribute(value: js.Array[Any]): Self = StObject.set(x, "displayAttribute", value.asInstanceOf[js.Any])
    
    inline def setDisplayAttributeUndefined: Self = StObject.set(x, "displayAttribute", js.undefined)
    
    inline def setDisplayAttributeVarargs(value: Any*): Self = StObject.set(x, "displayAttribute", js.Array(value*))
    
    inline def setDisplayResults(value: /* pElmt */ SVGPathElement => Unit): Self = StObject.set(x, "displayResults", js.Any.fromFunction1(value))
    
    inline def setDisplayResultsUndefined: Self = StObject.set(x, "displayResults", js.undefined)
    
    inline def setDisplayTypes(value: IMAGE): Self = StObject.set(x, "DisplayTypes", value.asInstanceOf[js.Any])
    
    inline def setDisplayTypesUndefined: Self = StObject.set(x, "DisplayTypes", js.undefined)
    
    inline def setFilterNodeCountQuery(
      value: (/* node */ Node, /* initialQuery */ Any) => /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof initialQuery */ Any
    ): Self = StObject.set(x, "filterNodeCountQuery", js.Any.fromFunction2(value))
    
    inline def setFilterNodeCountQueryUndefined: Self = StObject.set(x, "filterNodeCountQuery", js.undefined)
    
    inline def setFilterNodeRelationQuery(
      value: (/* node */ Node, /* initialQuery */ Any) => /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof initialQuery */ Any
    ): Self = StObject.set(x, "filterNodeRelationQuery", js.Any.fromFunction2(value))
    
    inline def setFilterNodeRelationQueryUndefined: Self = StObject.set(x, "filterNodeRelationQuery", js.undefined)
    
    inline def setFilterNodeValueQuery(
      value: (/* node */ Node, /* initialQuery */ Any) => /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof initialQuery */ Any
    ): Self = StObject.set(x, "filterNodeValueQuery", js.Any.fromFunction2(value))
    
    inline def setFilterNodeValueQueryUndefined: Self = StObject.set(x, "filterNodeValueQuery", js.undefined)
    
    inline def setFilterResultQuery(
      value: /* initialQuery */ Any => /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof initialQuery */ Any
    ): Self = StObject.set(x, "filterResultQuery", js.Any.fromFunction1(value))
    
    inline def setFilterResultQueryUndefined: Self = StObject.set(x, "filterResultQuery", js.undefined)
    
    inline def setGenerateNegativeNodeValueConstraints(value: js.Array[Any]): Self = StObject.set(x, "generateNegativeNodeValueConstraints", value.asInstanceOf[js.Any])
    
    inline def setGenerateNegativeNodeValueConstraintsUndefined: Self = StObject.set(x, "generateNegativeNodeValueConstraints", js.undefined)
    
    inline def setGenerateNegativeNodeValueConstraintsVarargs(value: Any*): Self = StObject.set(x, "generateNegativeNodeValueConstraints", js.Array(value*))
    
    inline def setGenerateNodeValueConstraints(value: js.Array[Any]): Self = StObject.set(x, "generateNodeValueConstraints", value.asInstanceOf[js.Any])
    
    inline def setGenerateNodeValueConstraintsUndefined: Self = StObject.set(x, "generateNodeValueConstraints", js.undefined)
    
    inline def setGenerateNodeValueConstraintsVarargs(value: Any*): Self = StObject.set(x, "generateNodeValueConstraints", js.Array(value*))
    
    inline def setGetCSSClass(value: (/* node */ Node, /* element */ SVGGElement) => String): Self = StObject.set(x, "getCSSClass", js.Any.fromFunction2(value))
    
    inline def setGetCSSClassUndefined: Self = StObject.set(x, "getCSSClass", js.undefined)
    
    inline def setGetColor(value: /* node */ Node => String): Self = StObject.set(x, "getColor", js.Any.fromFunction1(value))
    
    inline def setGetColorUndefined: Self = StObject.set(x, "getColor", js.undefined)
    
    inline def setGetConstraintAttribute(value: /* label */ String => Any): Self = StObject.set(x, "getConstraintAttribute", js.Any.fromFunction1(value))
    
    inline def setGetConstraintAttributeUndefined: Self = StObject.set(x, "getConstraintAttribute", js.undefined)
    
    inline def setGetDisplayAttribute(value: /* label */ String => Any): Self = StObject.set(x, "getDisplayAttribute", js.Any.fromFunction1(value))
    
    inline def setGetDisplayAttributeUndefined: Self = StObject.set(x, "getDisplayAttribute", js.undefined)
    
    inline def setGetDisplayResults(value: /* label */ String => Any): Self = StObject.set(x, "getDisplayResults", js.Any.fromFunction1(value))
    
    inline def setGetDisplayResultsUndefined: Self = StObject.set(x, "getDisplayResults", js.undefined)
    
    inline def setGetDisplayType(value: /* node */ Node => Double): Self = StObject.set(x, "getDisplayType", js.Any.fromFunction1(value))
    
    inline def setGetDisplayTypeUndefined: Self = StObject.set(x, "getDisplayType", js.undefined)
    
    inline def setGetGenerateNegativeNodeValueConstraints(value: /* node */ Node => js.Array[String]): Self = StObject.set(x, "getGenerateNegativeNodeValueConstraints", js.Any.fromFunction1(value))
    
    inline def setGetGenerateNegativeNodeValueConstraintsUndefined: Self = StObject.set(x, "getGenerateNegativeNodeValueConstraints", js.undefined)
    
    inline def setGetGenerateNodeValueConstraints(value: /* node */ Node => Any): Self = StObject.set(x, "getGenerateNodeValueConstraints", js.Any.fromFunction1(value))
    
    inline def setGetGenerateNodeValueConstraintsUndefined: Self = StObject.set(x, "getGenerateNodeValueConstraints", js.undefined)
    
    inline def setGetImageHeight(value: /* node */ Node => Double): Self = StObject.set(x, "getImageHeight", js.Any.fromFunction1(value))
    
    inline def setGetImageHeightUndefined: Self = StObject.set(x, "getImageHeight", js.undefined)
    
    inline def setGetImagePath(value: /* node */ Node => String): Self = StObject.set(x, "getImagePath", js.Any.fromFunction1(value))
    
    inline def setGetImagePathUndefined: Self = StObject.set(x, "getImagePath", js.undefined)
    
    inline def setGetImageWidth(value: /* node */ Node => Double): Self = StObject.set(x, "getImageWidth", js.Any.fromFunction1(value))
    
    inline def setGetImageWidthUndefined: Self = StObject.set(x, "getImageWidth", js.undefined)
    
    inline def setGetIsAutoExpandRelations(value: /* label */ String => Boolean): Self = StObject.set(x, "getIsAutoExpandRelations", js.Any.fromFunction1(value))
    
    inline def setGetIsAutoExpandRelationsUndefined: Self = StObject.set(x, "getIsAutoExpandRelations", js.undefined)
    
    inline def setGetIsAutoLoadValue(value: /* label */ String => Boolean): Self = StObject.set(x, "getIsAutoLoadValue", js.Any.fromFunction1(value))
    
    inline def setGetIsAutoLoadValueUndefined: Self = StObject.set(x, "getIsAutoLoadValue", js.undefined)
    
    inline def setGetIsGroup(value: /* node */ Node => Boolean): Self = StObject.set(x, "getIsGroup", js.Any.fromFunction1(value))
    
    inline def setGetIsGroupUndefined: Self = StObject.set(x, "getIsGroup", js.undefined)
    
    inline def setGetIsSearchable(value: /* label */ String => Boolean): Self = StObject.set(x, "getIsSearchable", js.Any.fromFunction1(value))
    
    inline def setGetIsSearchableUndefined: Self = StObject.set(x, "getIsSearchable", js.undefined)
    
    inline def setGetIsTextDisplayed(value: /* node */ Node => Boolean): Self = StObject.set(x, "getIsTextDisplayed", js.Any.fromFunction1(value))
    
    inline def setGetIsTextDisplayedUndefined: Self = StObject.set(x, "getIsTextDisplayed", js.undefined)
    
    inline def setGetNodeDisplayType(value: /* node */ Node => Any): Self = StObject.set(x, "getNodeDisplayType", js.Any.fromFunction1(value))
    
    inline def setGetNodeDisplayTypeUndefined: Self = StObject.set(x, "getNodeDisplayType", js.undefined)
    
    inline def setGetPredefinedConstraints(value: js.Array[Any]): Self = StObject.set(x, "getPredefinedConstraints", value.asInstanceOf[js.Any])
    
    inline def setGetPredefinedConstraintsUndefined: Self = StObject.set(x, "getPredefinedConstraints", js.undefined)
    
    inline def setGetPredefinedConstraintsVarargs(value: Any*): Self = StObject.set(x, "getPredefinedConstraints", js.Array(value*))
    
    inline def setGetProperty(value: (/* label */ String, /* name */ String) => Any): Self = StObject.set(x, "getProperty", js.Any.fromFunction2(value))
    
    inline def setGetPropertyUndefined: Self = StObject.set(x, "getProperty", js.undefined)
    
    inline def setGetProvider(value: /* label */ String => Node): Self = StObject.set(x, "getProvider", js.Any.fromFunction1(value))
    
    inline def setGetProviderUndefined: Self = StObject.set(x, "getProvider", js.undefined)
    
    inline def setGetResultOrderByAttribute(value: /* label */ String => Any): Self = StObject.set(x, "getResultOrderByAttribute", js.Any.fromFunction1(value))
    
    inline def setGetResultOrderByAttributeUndefined: Self = StObject.set(x, "getResultOrderByAttribute", js.undefined)
    
    inline def setGetReturnAttributes(value: /* label */ String => js.Array[Any]): Self = StObject.set(x, "getReturnAttributes", js.Any.fromFunction1(value))
    
    inline def setGetReturnAttributesUndefined: Self = StObject.set(x, "getReturnAttributes", js.undefined)
    
    inline def setGetSVGPaths(value: /* node */ Node => js.Array[Any]): Self = StObject.set(x, "getSVGPaths", js.Any.fromFunction1(value))
    
    inline def setGetSVGPathsUndefined: Self = StObject.set(x, "getSVGPaths", js.undefined)
    
    inline def setGetSchema(value: /* label */ String => Any): Self = StObject.set(x, "getSchema", js.Any.fromFunction1(value))
    
    inline def setGetSchemaUndefined: Self = StObject.set(x, "getSchema", js.undefined)
    
    inline def setGetSemanticValue(value: /* node */ Node => String): Self = StObject.set(x, "getSemanticValue", js.Any.fromFunction1(value))
    
    inline def setGetSemanticValueUndefined: Self = StObject.set(x, "getSemanticValue", js.undefined)
    
    inline def setGetSize(value: /* node */ Node => Double): Self = StObject.set(x, "getSize", js.Any.fromFunction1(value))
    
    inline def setGetSizeUndefined: Self = StObject.set(x, "getSize", js.undefined)
    
    inline def setGetTextValue(value: (/* node */ Node, /* maxLength */ Double) => String): Self = StObject.set(x, "getTextValue", js.Any.fromFunction2(value))
    
    inline def setGetTextValueUndefined: Self = StObject.set(x, "getTextValue", js.undefined)
    
    inline def setGetValueOrderByAttribute(value: /* label */ String => Any): Self = StObject.set(x, "getValueOrderByAttribute", js.Any.fromFunction1(value))
    
    inline def setGetValueOrderByAttributeUndefined: Self = StObject.set(x, "getValueOrderByAttribute", js.undefined)
    
    inline def setIsAutoLoadValue(value: Boolean): Self = StObject.set(x, "isAutoLoadValue", value.asInstanceOf[js.Any])
    
    inline def setIsAutoLoadValueUndefined: Self = StObject.set(x, "isAutoLoadValue", js.undefined)
    
    inline def setIsResultOrderAscending(value: Boolean): Self = StObject.set(x, "isResultOrderAscending", value.asInstanceOf[js.Any])
    
    inline def setIsResultOrderAscendingUndefined: Self = StObject.set(x, "isResultOrderAscending", js.undefined)
    
    inline def setIsSearchable(value: Boolean): Self = StObject.set(x, "isSearchable", value.asInstanceOf[js.Any])
    
    inline def setIsSearchableUndefined: Self = StObject.set(x, "isSearchable", js.undefined)
    
    inline def setIsTextDisplayed(value: /* node */ Node => Boolean): Self = StObject.set(x, "isTextDisplayed", js.Any.fromFunction1(value))
    
    inline def setIsTextDisplayedUndefined: Self = StObject.set(x, "isTextDisplayed", js.undefined)
    
    inline def setIsValueOrderAscending(value: Boolean): Self = StObject.set(x, "isValueOrderAscending", value.asInstanceOf[js.Any])
    
    inline def setIsValueOrderAscendingUndefined: Self = StObject.set(x, "isValueOrderAscending", js.undefined)
    
    inline def setResultOrderByAttribute(value: String): Self = StObject.set(x, "resultOrderByAttribute", value.asInstanceOf[js.Any])
    
    inline def setResultOrderByAttributeNull: Self = StObject.set(x, "resultOrderByAttribute", null)
    
    inline def setResultOrderByAttributeUndefined: Self = StObject.set(x, "resultOrderByAttribute", js.undefined)
    
    inline def setReturnAttributes(value: js.Array[Any]): Self = StObject.set(x, "returnAttributes", value.asInstanceOf[js.Any])
    
    inline def setReturnAttributesUndefined: Self = StObject.set(x, "returnAttributes", js.undefined)
    
    inline def setReturnAttributesVarargs(value: Any*): Self = StObject.set(x, "returnAttributes", js.Array(value*))
    
    inline def setValueOrderByAttribute(value: String): Self = StObject.set(x, "valueOrderByAttribute", value.asInstanceOf[js.Any])
    
    inline def setValueOrderByAttributeUndefined: Self = StObject.set(x, "valueOrderByAttribute", js.undefined)
  }
}
