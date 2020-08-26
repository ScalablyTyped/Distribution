package typings.openui5.sap.ui.model.analytics.odata4analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecursiveHierarchy extends js.Object {
  /**
    * Get the property holding the node ID of the hierarchy node
    * @returns The DataJS object representing this property
    */
  def getNodeIDProperty(): js.Any = js.native
  /**
    * Get the property holding the level of the hierarchy node
    * @returns The DataJS object representing this property
    */
  def getNodeLevelProperty(): js.Any = js.native
  /**
    * Get the property holding the value that is structurally organized by thehierarchy
    * @returns The DataJS object representing this property
    */
  def getNodeValueProperty(): js.Any = js.native
  /**
    * Get the property holding the parent node ID of the hierarchy node
    * @returns The DataJS object representing this property
    */
  def getParentNodeIDProperty(): js.Any = js.native
  /**
    * Get indicator if this is a leveled hierarchy
    * @returns False
    */
  def isLeveledHierarchy(): Boolean = js.native
  /**
    * Get indicator if this is a recursive hierarchy
    * @returns True
    */
  def isRecursiveHierarchy(): Boolean = js.native
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
  implicit class RecursiveHierarchyOps[Self <: RecursiveHierarchy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetNodeIDProperty(value: () => js.Any): Self = this.set("getNodeIDProperty", js.Any.fromFunction0(value))
    @scala.inline
    def setGetNodeLevelProperty(value: () => js.Any): Self = this.set("getNodeLevelProperty", js.Any.fromFunction0(value))
    @scala.inline
    def setGetNodeValueProperty(value: () => js.Any): Self = this.set("getNodeValueProperty", js.Any.fromFunction0(value))
    @scala.inline
    def setGetParentNodeIDProperty(value: () => js.Any): Self = this.set("getParentNodeIDProperty", js.Any.fromFunction0(value))
    @scala.inline
    def setIsLeveledHierarchy(value: () => Boolean): Self = this.set("isLeveledHierarchy", js.Any.fromFunction0(value))
    @scala.inline
    def setIsRecursiveHierarchy(value: () => Boolean): Self = this.set("isRecursiveHierarchy", js.Any.fromFunction0(value))
  }
  
}

