package typings.openui5.sap.ui.model.analytics.odata4analytics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dimension extends StObject {
  
  /**
    * Find attribute by name
    * @param sName Attribute name
    * @returns The dimension attribute         object with this name or null if it does not exist
    */
  def findAttributeByName(sName: String): Dimension
  
  /**
    * Get the names of all attributes included in this dimension
    * @returns List of all attribute names
    */
  def getAllAttributeNames(): js.Array[String]
  
  /**
    * Get all attributes of this dimension
    * @returns An object with individual JS properties for each         attribute of this dimension. The
    * JS object properties all are         objects of type odata4analytics.DimensionAttribute. The        
    * names of the JS object properties are given by the OData entity         type property names
    * representing the dimension attribute keys.
    */
  def getAllAttributes(): js.Any
  
  /**
    * Get query result containing this dimension
    * @returns The query result object
    */
  def getContainingQueryResult(): QueryResult
  
  /**
    * Get associated hierarchy
    * @returns The hierarchy object or null if there is none. It can         be an instance of class      
    *   odata4analytics.RecursiveHierarchy (TODO later: or a         leveled hierarchy). Use methods
    * isLeveledHierarchy and         isRecursiveHierarchy to determine object type.
    */
  def getHierarchy(): js.Any
  
  /**
    * Get the key property
    * @returns The DataJS object representing the property for the         dimension key
    */
  def getKeyProperty(): js.Any
  
  /**
    * Get label
    * @returns The (possibly language-dependent) label text for this         dimension
    */
  def getLabelText(): String
  
  /**
    * Get master data entity set for this dimension
    * @returns The master data entity set        for this dimension, or null, if it does not exist
    */
  def getMasterDataEntitySet(): EntitySet
  
  /**
    * Get the name of the dimension
    * @returns The name of this dimension, which is identical to the         name of the dimension key
    * property in the entity type
    */
  def getName(): String
  
  /**
    * Get super-ordinate dimension
    * @returns The super-ordinate dimension or null if there is none
    */
  def getSuperOrdinateDimension(): js.Any
  
  /**
    * Get text property related to this dimension
    * @returns The DataJS object representing the text property or         null if it does not exist
    */
  def getTextProperty(): js.Any
  
  /**
    * Get indicator whether or not master data is available for this dimension
    * @returns True iff master data is available
    */
  def hasMasterData(): Boolean
}
object Dimension {
  
  inline def apply(
    findAttributeByName: String => Dimension,
    getAllAttributeNames: () => js.Array[String],
    getAllAttributes: () => js.Any,
    getContainingQueryResult: () => QueryResult,
    getHierarchy: () => js.Any,
    getKeyProperty: () => js.Any,
    getLabelText: () => String,
    getMasterDataEntitySet: () => EntitySet,
    getName: () => String,
    getSuperOrdinateDimension: () => js.Any,
    getTextProperty: () => js.Any,
    hasMasterData: () => Boolean
  ): Dimension = {
    val __obj = js.Dynamic.literal(findAttributeByName = js.Any.fromFunction1(findAttributeByName), getAllAttributeNames = js.Any.fromFunction0(getAllAttributeNames), getAllAttributes = js.Any.fromFunction0(getAllAttributes), getContainingQueryResult = js.Any.fromFunction0(getContainingQueryResult), getHierarchy = js.Any.fromFunction0(getHierarchy), getKeyProperty = js.Any.fromFunction0(getKeyProperty), getLabelText = js.Any.fromFunction0(getLabelText), getMasterDataEntitySet = js.Any.fromFunction0(getMasterDataEntitySet), getName = js.Any.fromFunction0(getName), getSuperOrdinateDimension = js.Any.fromFunction0(getSuperOrdinateDimension), getTextProperty = js.Any.fromFunction0(getTextProperty), hasMasterData = js.Any.fromFunction0(hasMasterData))
    __obj.asInstanceOf[Dimension]
  }
  
  extension [Self <: Dimension](x: Self) {
    
    inline def setFindAttributeByName(value: String => Dimension): Self = StObject.set(x, "findAttributeByName", js.Any.fromFunction1(value))
    
    inline def setGetAllAttributeNames(value: () => js.Array[String]): Self = StObject.set(x, "getAllAttributeNames", js.Any.fromFunction0(value))
    
    inline def setGetAllAttributes(value: () => js.Any): Self = StObject.set(x, "getAllAttributes", js.Any.fromFunction0(value))
    
    inline def setGetContainingQueryResult(value: () => QueryResult): Self = StObject.set(x, "getContainingQueryResult", js.Any.fromFunction0(value))
    
    inline def setGetHierarchy(value: () => js.Any): Self = StObject.set(x, "getHierarchy", js.Any.fromFunction0(value))
    
    inline def setGetKeyProperty(value: () => js.Any): Self = StObject.set(x, "getKeyProperty", js.Any.fromFunction0(value))
    
    inline def setGetLabelText(value: () => String): Self = StObject.set(x, "getLabelText", js.Any.fromFunction0(value))
    
    inline def setGetMasterDataEntitySet(value: () => EntitySet): Self = StObject.set(x, "getMasterDataEntitySet", js.Any.fromFunction0(value))
    
    inline def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    inline def setGetSuperOrdinateDimension(value: () => js.Any): Self = StObject.set(x, "getSuperOrdinateDimension", js.Any.fromFunction0(value))
    
    inline def setGetTextProperty(value: () => js.Any): Self = StObject.set(x, "getTextProperty", js.Any.fromFunction0(value))
    
    inline def setHasMasterData(value: () => Boolean): Self = StObject.set(x, "hasMasterData", js.Any.fromFunction0(value))
  }
}
