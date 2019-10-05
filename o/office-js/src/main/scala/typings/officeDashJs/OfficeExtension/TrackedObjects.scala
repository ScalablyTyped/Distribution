package typings.officeDashJs.OfficeExtension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Collection of tracked objects, contained within a request context. See "context.trackedObjects" for more information. */
@JSGlobal("OfficeExtension.TrackedObjects")
@js.native
class TrackedObjects () extends js.Object {
  /**
    * Track a set of objects  for automatic adjustment based on surrounding changes in the document. Only some object types require this. 
    * If you are using an object across ".sync" calls and outside the sequential execution of a ".run" batch, 
    * and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object 
    * to the tracked object collection when the object was first created.
    */
  def add(objects: js.Array[ClientObject]): Unit = js.native
  /** 
    * Track a new object for automatic adjustment based on surrounding changes in the document. Only some object types require this. 
    * If you are using an object across ".sync" calls and outside the sequential execution of a ".run" batch, 
    * and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object 
    * to the tracked object collection when the object was first created. 
    * 
    * This method also has the following signature: 
    * 
    * `add(objects: ClientObject[]): void;` Where objects is an array of objects to be tracked.
    */
  def add(`object`: ClientObject): Unit = js.native
  /**
    * Release the memory associated with an object that was previously added to this collection. 
    * Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. 
    * You will need to call `context.sync()` before the memory release takes effect.
    */
  def remove(objects: js.Array[ClientObject]): Unit = js.native
  /** 
    * Release the memory associated with an object that was previously added to this collection. 
    * Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. 
    * You will need to call `context.sync()` before the memory release takes effect.
    * 
    * This method also has the following signature: 
    * 
    * `remove(objects: ClientObject[]): void;` Where objects is an array of objects to be removed.
    */
  def remove(`object`: ClientObject): Unit = js.native
}

