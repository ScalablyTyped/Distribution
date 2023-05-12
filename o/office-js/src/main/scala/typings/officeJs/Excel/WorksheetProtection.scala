package typings.officeJs.Excel

import typings.officeJs.Excel.Interfaces.WorksheetProtectionData
import typings.officeJs.Excel.Interfaces.WorksheetProtectionLoadOptions
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.ClientResult
import typings.officeJs.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the protection of a worksheet object.
  *
  * @remarks
  * [Api set: ExcelApi 1.2]
  */
@js.native
trait WorksheetProtection
  extends StObject
     with ClientObject {
  
  /**
    * Specifies the `AllowEditRangeCollection` object found in this worksheet. This is a collection of `AllowEditRange` objects, which work with worksheet protection properties.
    When worksheet protection is enabled, an `AllowEditRange` object can be used to allow editing of a specific range, while maintaining protection on the rest of the worksheet.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    */
  val allowEditRanges: AllowEditRangeCollection = js.native
  
  /**
    * Specifies if protection can be paused for this worksheet.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    */
  val canPauseProtection: Boolean = js.native
  
  /**
    * Specifies if the password can be used to unlock worksheet protection.
    This method doesn't change the worksheet protection state.
    If a password is input but no password is required to unlock worksheet protection, this method will return false.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    *
    * @param password The password to check against the protected worksheet.
    * @returns Returns `true` if the password can be used to unlock worksheet protection. Otherwise, returns `false`.
    */
  def checkPassword(): ClientResult[Boolean] = js.native
  def checkPassword(password: String): ClientResult[Boolean] = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_WorksheetProtection: RequestContext = js.native
  
  /**
    * Specifies if the sheet is password protected.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    */
  val isPasswordProtected: Boolean = js.native
  
  /**
    * Specifies if worksheet protection is paused.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    */
  val isPaused: Boolean = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): WorksheetProtection = js.native
  def load(options: WorksheetProtectionLoadOptions): WorksheetProtection = js.native
  def load(propertyNamesAndPaths: Expand): WorksheetProtection = js.native
  def load(propertyNames: String): WorksheetProtection = js.native
  def load(propertyNames: js.Array[String]): WorksheetProtection = js.native
  
  /**
    * Specifies the protection options for the worksheet.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  val options: WorksheetProtectionOptions = js.native
  
  /**
    * Pauses worksheet protection for the given worksheet object for the user in the current session.
    This method does nothing if worksheet protection isn't enabled or is already paused.
    If the password is incorrect, then this method throws an `InvalidArgument` error and fails to pause protection.
    This method does not change the protection state if worksheet protection is not enabled or already paused.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    *
    * @param password The password associated with the protected worksheet.
    */
  def pauseProtection(): Unit = js.native
  def pauseProtection(password: String): Unit = js.native
  
  /**
    * Protects a worksheet. Fails if the worksheet has already been protected.
    *
    * @remarks
    * [Api set: ExcelApi 1.2 for options; 1.7 for password]
    *
    * @param options Optional. Sheet protection options.
    * @param password Optional. Sheet protection password.
    */
  def protect(): Unit = js.native
  def protect(options: Unit, password: String): Unit = js.native
  def protect(options: WorksheetProtectionOptions): Unit = js.native
  def protect(options: WorksheetProtectionOptions, password: String): Unit = js.native
  
  /**
    * Specifies if the worksheet is protected.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  val `protected`: Boolean = js.native
  
  /**
    * Resumes worksheet protection for the given worksheet object for the user in a given session.
    Worksheet protection must be paused for this method to work. If worksheet protection is not paused, then this method will not change the protection state of the worksheet.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    */
  def resumeProtection(): Unit = js.native
  
  /**
    * Specifies the protection options saved in the worksheet.
    This will return the same `WorksheetProtectionOptions` object regardless of the worksheet protection state.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    */
  val savedOptions: WorksheetProtectionOptions = js.native
  
  /**
    * Changes the password associated with the `WorksheetProtection` object.
    Setting the password as an empty string ("") or as `null` will remove password protection from the `WorksheetProtection` object.
    Worksheet protection must be enabled and paused for this method to work properly.
    If worksheet protection is disabled, this method throws an `InvalidOperation` error and fails to change the password.
    If worksheet protection is enabled and not paused, this method throws an `AccessDenied` error and fails to change the password.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    *
    * @param password The password associated with the `WorksheetProtection` object.
    */
  def setPassword(): Unit = js.native
  def setPassword(password: String): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.WorksheetProtection object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.WorksheetProtectionData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): WorksheetProtectionData = js.native
  
  /**
    * Unprotects a worksheet.
    *
    * @remarks
    * [Api set: ExcelApi 1.7 for password]
    *
    * @param password Sheet protection password.
    */
  def unprotect(): Unit = js.native
  def unprotect(password: String): Unit = js.native
  
  /**
    * Change the worksheet protection options associated with the `WorksheetProtection` object.
    Worksheet protection must be disabled or paused for this method to work properly.
    If worksheet protection is enabled and not paused, this method throws an `AccessDenied` error and fails to change the worksheet protection options.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    *
    * @param options The options interface associated with the `WorksheetProtection` object.
    */
  def updateOptions(options: WorksheetProtectionOptions): Unit = js.native
}
