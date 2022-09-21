package typings.microsoftGraph.mod.ExternalConnectors

import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Property extends StObject {
  
  /**
    * A set of aliases or a friendly names for the property. Maximum 32 characters. Only alphanumeric characters allowed. For
    * example, each string may not contain control characters, whitespace, or any of the following: :, ;, ,, (, ), [, ], {,
    * }, %, $, +, !, *, =, &amp;, ?, @, #, /, ~, ', ', &amp;lt;, &amp;gt;, `, ^. Optional.
    */
  var aliases: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  /**
    * Specifies if the property is queryable. Queryable properties can be used in Keyword Query Language (KQL) queries.
    * Optional.
    */
  var isQueryable: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * Specifies if the property is refinable. Refinable properties can be used to filter search results in the Search API and
    * add a refiner control in the Microsoft Search user experience. Optional.
    */
  var isRefinable: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * Specifies if the property is retrievable. Retrievable properties are returned in the result set when items are returned
    * by the search API. Retrievable properties are also available to add to the display template used to render search
    * results. Optional.
    */
  var isRetrievable: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * Specifies if the property is searchable. Only properties of type String or StringCollection can be searchable.
    * Non-searchable properties are not added to the search index. Optional.
    */
  var isSearchable: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * Specifies one or more well-known tags added against a property. Labels help Microsoft Search understand the semantics
    * of the data in the connection. Adding appropriate labels would result in an enhanced search experience (e.g. better
    * relevance). The possible values are: title, url, createdBy, lastModifiedBy, authors, createdDateTime,
    * lastModifiedDateTime, fileName, fileExtension, unknownFutureValue. Optional.
    */
  var labels: js.UndefOr[NullableOption[js.Array[Label]]] = js.undefined
  
  /**
    * The name of the property. Maximum 32 characters. Only alphanumeric characters allowed. For example, each string may not
    * contain control characters, whitespace, or any of the following: :, ;, ,, (, ), [, ], {, }, %, $, +, !, *, =, &amp;, ?,
    * @, #, /, ~, ', ', &amp;lt;, &amp;gt;, `, ^. Required.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The data type of the property. Possible values are: string, int64, double, dateTime, boolean, stringCollection,
    * int64Collection, doubleCollection, dateTimeCollection, unknownFutureValue.
    */
  var `type`: js.UndefOr[PropertyType] = js.undefined
}
object Property {
  
  inline def apply(): Property = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Property]
  }
  
  extension [Self <: Property](x: Self) {
    
    inline def setAliases(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    inline def setAliasesNull: Self = StObject.set(x, "aliases", null)
    
    inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
    
    inline def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value*))
    
    inline def setIsQueryable(value: NullableOption[Boolean]): Self = StObject.set(x, "isQueryable", value.asInstanceOf[js.Any])
    
    inline def setIsQueryableNull: Self = StObject.set(x, "isQueryable", null)
    
    inline def setIsQueryableUndefined: Self = StObject.set(x, "isQueryable", js.undefined)
    
    inline def setIsRefinable(value: NullableOption[Boolean]): Self = StObject.set(x, "isRefinable", value.asInstanceOf[js.Any])
    
    inline def setIsRefinableNull: Self = StObject.set(x, "isRefinable", null)
    
    inline def setIsRefinableUndefined: Self = StObject.set(x, "isRefinable", js.undefined)
    
    inline def setIsRetrievable(value: NullableOption[Boolean]): Self = StObject.set(x, "isRetrievable", value.asInstanceOf[js.Any])
    
    inline def setIsRetrievableNull: Self = StObject.set(x, "isRetrievable", null)
    
    inline def setIsRetrievableUndefined: Self = StObject.set(x, "isRetrievable", js.undefined)
    
    inline def setIsSearchable(value: NullableOption[Boolean]): Self = StObject.set(x, "isSearchable", value.asInstanceOf[js.Any])
    
    inline def setIsSearchableNull: Self = StObject.set(x, "isSearchable", null)
    
    inline def setIsSearchableUndefined: Self = StObject.set(x, "isSearchable", js.undefined)
    
    inline def setLabels(value: NullableOption[js.Array[Label]]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLabelsVarargs(value: Label*): Self = StObject.set(x, "labels", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: PropertyType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
