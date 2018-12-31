package typings
package objectDashRefsLib.objectDashRefsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Refs extends js.Object {
  /**
    * Binds one side of a bi-directional reference to a target object.
    * @param {*} target
    * @param {string|Refs.AttributeDescriptor} property
    */
  def bind(target: js.Any, property: java.lang.String): scala.Unit = js.native
  def bind(target: js.Any, property: objectDashRefsLib.objectDashRefsMod.RefsNs.AttributeDescriptor): scala.Unit = js.native
  def ensureBound(target: js.Any, property: java.lang.String): scala.Unit = js.native
  def ensureBound(target: js.Any, property: objectDashRefsLib.objectDashRefsMod.RefsNs.AttributeDescriptor): scala.Unit = js.native
  def ensureRefsCollection(target: js.Any, property: objectDashRefsLib.objectDashRefsMod.RefsNs.AttributeDescriptor): js.Any = js.native
  def set(target: js.Any, property: java.lang.String, value: js.Any): scala.Unit = js.native
  def set(
    target: js.Any,
    property: objectDashRefsLib.objectDashRefsMod.RefsNs.AttributeDescriptor,
    value: js.Any
  ): scala.Unit = js.native
  def unset(target: js.Any, property: java.lang.String, value: js.Any): scala.Unit = js.native
  def unset(
    target: js.Any,
    property: objectDashRefsLib.objectDashRefsMod.RefsNs.AttributeDescriptor,
    value: js.Any
  ): scala.Unit = js.native
}

