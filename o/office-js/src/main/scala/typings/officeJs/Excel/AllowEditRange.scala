package typings.officeJs.Excel

import typings.officeJs.Excel.Interfaces.AllowEditRangeData
import typings.officeJs.Excel.Interfaces.AllowEditRangeLoadOptions
import typings.officeJs.Excel.Interfaces.AllowEditRangeUpdateData
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.UpdateOptions
import typings.officeJs.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an `AllowEditRange` object found in a worksheet. This object works with worksheet protection properties.
  When worksheet protection is enabled, an `AllowEditRange` object can be used to allow editing of a specific range, while maintaining protection on the rest of the worksheet.
  *
  * @remarks
  * [Api set: ExcelApiOnline 1.1]
  */
@js.native
trait AllowEditRange
  extends StObject
     with ClientObject {
  
  /**
    * Specifies the range associated with the object.
    Worksheet protection must be disabled or paused for this method to work properly.
    If worksheet protection is enabled and not paused, this method throws an `AccessDenied` error and fails to set the range.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    */
  var address: String = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_AllowEditRange: RequestContext = js.native
  
  /**
    * Deletes the object from the `AllowEditRangeCollection`.
    Worksheet protection must be disabled or paused for this method to work properly.
    If worksheet protection is enabled and not paused, this method throws an `AccessDenied` error and fails the delete operation.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    */
  def delete(): Unit = js.native
  
  /**
    * Specifies if the object is password protected.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    */
  val isPasswordProtected: Boolean = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): AllowEditRange = js.native
  def load(options: AllowEditRangeLoadOptions): AllowEditRange = js.native
  def load(propertyNamesAndPaths: Expand): AllowEditRange = js.native
  def load(propertyNames: String): AllowEditRange = js.native
  def load(propertyNames: js.Array[String]): AllowEditRange = js.native
  
  /**
    * Pauses worksheet protection for the object for the user in the current session.
    This method does nothing if worksheet protection isn't enabled or is already paused.
    If worksheet protection cannot be paused, this method throws an `UnsupportedOperation` error and fails to pause protection for the object.
    If the password is incorrect, then this method throws a `BadPassword` error and fails to pause protection for the object.
    If a password is supplied but the object does not require a password, the inputted password will be ignored and the operation will succeed.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    *
    * @param password The password associated with the `AllowEditRange` object.
    */
  def pauseProtection(): Unit = js.native
  def pauseProtection(password: String): Unit = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: AllowEditRange): Unit = js.native
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: AllowEditRangeUpdateData): Unit = js.native
  def set(properties: AllowEditRangeUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    * Changes the password associated with the object.
    Setting the password string as empty ("") or `null` will remove password protection from the object.
    Worksheet protection must be disabled or paused for this method to work properly.
    If worksheet protection is enabled and not paused, then this method throws an `AccessDenied` error and the set operation fails.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    *
    * @param password The password associated with the `AllowEditRange` object.
    */
  def setPassword(): Unit = js.native
  def setPassword(password: String): Unit = js.native
  
  /**
    * Specifies the title of the object.
    Worksheet protection must be disabled or paused for this method to work properly.
    If worksheet protection is enabled and not paused, this method throws an `AccessDenied` error and fails to set the title.
    If there is already an existing `AllowEditRange` with the same string, or if the string is `null` or empty (""), then this method throws an `InvalidArgument` error and fails to set the title.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    */
  var title: String = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.AllowEditRange object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.AllowEditRangeData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): AllowEditRangeData = js.native
}
