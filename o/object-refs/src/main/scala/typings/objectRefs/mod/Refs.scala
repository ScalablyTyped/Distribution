package typings.objectRefs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Refs extends js.Object {
  
  /**
    * Binds one side of a bi-directional reference to a target object.
    * @param {*} target
    * @param {string|Refs.AttributeDescriptor} property
    */
  def bind(target: js.Any, property: String): Unit = js.native
  def bind(target: js.Any, property: AttributeDescriptor): Unit = js.native
  
  def ensureBound(target: js.Any, property: String): Unit = js.native
  def ensureBound(target: js.Any, property: AttributeDescriptor): Unit = js.native
  
  def ensureRefsCollection(target: js.Any, property: AttributeDescriptor): js.Any = js.native
  
  def set(target: js.Any, property: String, value: js.Any): Unit = js.native
  def set(target: js.Any, property: AttributeDescriptor, value: js.Any): Unit = js.native
  
  def unset(target: js.Any, property: String, value: js.Any): Unit = js.native
  def unset(target: js.Any, property: AttributeDescriptor, value: js.Any): Unit = js.native
}
