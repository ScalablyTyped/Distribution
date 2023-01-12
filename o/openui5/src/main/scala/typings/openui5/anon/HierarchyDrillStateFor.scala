package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HierarchyDrillStateFor extends StObject {
  
  /**
    * The property name in the same type holding the drill state for the node; the referenced property may
    * have the values "collapsed", "expanded" or "leaf"
    */
  var hierarchyDrillStateFor: js.UndefOr[String] = js.undefined
  
  /**
    * The property name in the same type holding the hierarchy level information; the type of the referenced
    * property has to be an integer type
    */
  var hierarchyLevelFor: js.UndefOr[String] = js.undefined
  
  /**
    * The property name in the same type holding the descendant count for the node; the type of the referenced
    * property has to be an integer type
    */
  var hierarchyNodeDescendantCountFor: js.UndefOr[String] = js.undefined
  
  /**
    * The property name in the same type holding the hierarchy node id
    */
  var hierarchyNodeFor: js.UndefOr[String] = js.undefined
  
  /**
    * The property name in the same type holding the parent node id
    */
  var hierarchyParentNodeFor: js.UndefOr[String] = js.undefined
}
object HierarchyDrillStateFor {
  
  inline def apply(): HierarchyDrillStateFor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HierarchyDrillStateFor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HierarchyDrillStateFor] (val x: Self) extends AnyVal {
    
    inline def setHierarchyDrillStateFor(value: String): Self = StObject.set(x, "hierarchyDrillStateFor", value.asInstanceOf[js.Any])
    
    inline def setHierarchyDrillStateForUndefined: Self = StObject.set(x, "hierarchyDrillStateFor", js.undefined)
    
    inline def setHierarchyLevelFor(value: String): Self = StObject.set(x, "hierarchyLevelFor", value.asInstanceOf[js.Any])
    
    inline def setHierarchyLevelForUndefined: Self = StObject.set(x, "hierarchyLevelFor", js.undefined)
    
    inline def setHierarchyNodeDescendantCountFor(value: String): Self = StObject.set(x, "hierarchyNodeDescendantCountFor", value.asInstanceOf[js.Any])
    
    inline def setHierarchyNodeDescendantCountForUndefined: Self = StObject.set(x, "hierarchyNodeDescendantCountFor", js.undefined)
    
    inline def setHierarchyNodeFor(value: String): Self = StObject.set(x, "hierarchyNodeFor", value.asInstanceOf[js.Any])
    
    inline def setHierarchyNodeForUndefined: Self = StObject.set(x, "hierarchyNodeFor", js.undefined)
    
    inline def setHierarchyParentNodeFor(value: String): Self = StObject.set(x, "hierarchyParentNodeFor", value.asInstanceOf[js.Any])
    
    inline def setHierarchyParentNodeForUndefined: Self = StObject.set(x, "hierarchyParentNodeFor", js.undefined)
  }
}
