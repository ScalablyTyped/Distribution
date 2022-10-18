package typings.officeJsPreview.OfficeExtension

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Collection of tracked objects, contained within a request context.
  * See {@link https://learn.microsoft.com/javascript/api/office/officeextension.clientrequestcontext#office-officeextension-clientrequestcontext-trackedobjects-member | context.trackedObjects}
  * for more information.
  */
@js.native
trait TrackedObjects extends StObject {
  
  /**
    * Track a set of objects  for automatic adjustment based on surrounding changes in the document. Only some object types require this.
    * If you are using an object across ".sync" calls and outside the sequential execution of a ".run" batch,
    * and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object
    * to the tracked object collection when the object was first created. If this object is part of a collection in Word, you should also track
    * the parent collection.
    */
  def add(objects: js.Array[ClientObject]): Unit = js.native
  /**
    * Track a new object for automatic adjustment based on surrounding changes in the document. Only some object types require this.
    * If you are using an object across ".sync" calls and outside the sequential execution of a ".run" batch,
    * and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object
    * to the tracked object collection when the object was first created. If this object is part of a collection in Word, you should also track
    * the parent collection.
    */
  def add(`object`: ClientObject): Unit = js.native
  
  /**
    * Release the memory associated with an object that was previously added to this collection.
    * Having many tracked objects slows down the Office application, so please remember to free any objects you add, once you're done using them.
    * You will need to call `context.sync()` before the memory release takes effect.
    */
  def remove(objects: js.Array[ClientObject]): Unit = js.native
  /**
    * Release the memory associated with an object that was previously added to this collection.
    * Having many tracked objects slows down the Office application, so please remember to free any objects you add, once you're done using them.
    * You will need to call `context.sync()` before the memory release takes effect.
    */
  def remove(`object`: ClientObject): Unit = js.native
}
