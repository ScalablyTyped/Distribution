package typings.node.inspectorMod.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object containing abbreviated remote object value.
  * @experimental
  */
trait ObjectPreview extends StObject {
  
  /**
    * String representation of the object.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * List of the entries. Specified for <code>map</code> and <code>set</code> subtype values only.
    */
  var entries: js.UndefOr[js.Array[EntryPreview]] = js.undefined
  
  /**
    * True iff some of the properties or entries of the original object did not fit.
    */
  var overflow: Boolean
  
  /**
    * List of the properties.
    */
  var properties: js.Array[PropertyPreview]
  
  /**
    * Object subtype hint. Specified for <code>object</code> type values only.
    */
  var subtype: js.UndefOr[String] = js.undefined
  
  /**
    * Object type.
    */
  var `type`: String
}
object ObjectPreview {
  
  inline def apply(overflow: Boolean, properties: js.Array[PropertyPreview], `type`: String): ObjectPreview = {
    val __obj = js.Dynamic.literal(overflow = overflow.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectPreview]
  }
  
  extension [Self <: ObjectPreview](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEntries(value: js.Array[EntryPreview]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    inline def setEntriesVarargs(value: EntryPreview*): Self = StObject.set(x, "entries", js.Array(value :_*))
    
    inline def setOverflow(value: Boolean): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: js.Array[PropertyPreview]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesVarargs(value: PropertyPreview*): Self = StObject.set(x, "properties", js.Array(value :_*))
    
    inline def setSubtype(value: String): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
    
    inline def setSubtypeUndefined: Self = StObject.set(x, "subtype", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
