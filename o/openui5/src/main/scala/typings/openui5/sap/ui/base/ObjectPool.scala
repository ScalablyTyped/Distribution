package typings.openui5.sap.ui.base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.base.ObjectPool")
@js.native
class ObjectPool protected () extends Object {
  /**
    * Creates an ObjectPool instance based on the given oObjectClass.&lt;br/&gt;If there is a free pooled
    * instance, returns that one, otherwise creates a new one.&lt;br/&gt;In order to be maintained by the
    * ObjectPool, oObjectClass must implementmethods described in the class description.
    * @param oObjectClass constructor for the class of objects that this pool should manage
    */
  def this(oObjectClass: js.Any) = this()
  /**
    * Borrows a free object from the pool. Any arguments to this methodare forwarded to the init method of
    * the borrowed object.
    * @param any optional initialization parameters for the borrowed object
    * @returns the borrowed object of the same type that has been specified for this pool
    */
  def borrowObject(any: js.Any): js.Any = js.native
  /**
    * Returns an object to the pool. The object must have been borrowed from thispool beforehand. The
    * reset method is called on the object before it is addedto the set of free objects.
    * @param oObject the object to return to the pool
    */
  def returnObject(oObject: js.Any): Unit = js.native
}

