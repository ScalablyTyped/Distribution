package typings.openui5.sap.ui.model.analytics.odata4analytics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecursiveHierarchy extends StObject {
  
  /**
    * Get the property holding the node ID of the hierarchy node
    * @returns The DataJS object representing this property
    */
  def getNodeIDProperty(): js.Any
  
  /**
    * Get the property holding the level of the hierarchy node
    * @returns The DataJS object representing this property
    */
  def getNodeLevelProperty(): js.Any
  
  /**
    * Get the property holding the value that is structurally organized by thehierarchy
    * @returns The DataJS object representing this property
    */
  def getNodeValueProperty(): js.Any
  
  /**
    * Get the property holding the parent node ID of the hierarchy node
    * @returns The DataJS object representing this property
    */
  def getParentNodeIDProperty(): js.Any
  
  /**
    * Get indicator if this is a leveled hierarchy
    * @returns False
    */
  def isLeveledHierarchy(): Boolean
  
  /**
    * Get indicator if this is a recursive hierarchy
    * @returns True
    */
  def isRecursiveHierarchy(): Boolean
}
object RecursiveHierarchy {
  
  @scala.inline
  def apply(
    getNodeIDProperty: () => js.Any,
    getNodeLevelProperty: () => js.Any,
    getNodeValueProperty: () => js.Any,
    getParentNodeIDProperty: () => js.Any,
    isLeveledHierarchy: () => Boolean,
    isRecursiveHierarchy: () => Boolean
  ): RecursiveHierarchy = {
    val __obj = js.Dynamic.literal(getNodeIDProperty = js.Any.fromFunction0(getNodeIDProperty), getNodeLevelProperty = js.Any.fromFunction0(getNodeLevelProperty), getNodeValueProperty = js.Any.fromFunction0(getNodeValueProperty), getParentNodeIDProperty = js.Any.fromFunction0(getParentNodeIDProperty), isLeveledHierarchy = js.Any.fromFunction0(isLeveledHierarchy), isRecursiveHierarchy = js.Any.fromFunction0(isRecursiveHierarchy))
    __obj.asInstanceOf[RecursiveHierarchy]
  }
  
  @scala.inline
  implicit class RecursiveHierarchyMutableBuilder[Self <: RecursiveHierarchy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetNodeIDProperty(value: () => js.Any): Self = StObject.set(x, "getNodeIDProperty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNodeLevelProperty(value: () => js.Any): Self = StObject.set(x, "getNodeLevelProperty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNodeValueProperty(value: () => js.Any): Self = StObject.set(x, "getNodeValueProperty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetParentNodeIDProperty(value: () => js.Any): Self = StObject.set(x, "getParentNodeIDProperty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsLeveledHierarchy(value: () => Boolean): Self = StObject.set(x, "isLeveledHierarchy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsRecursiveHierarchy(value: () => Boolean): Self = StObject.set(x, "isRecursiveHierarchy", js.Any.fromFunction0(value))
  }
}
