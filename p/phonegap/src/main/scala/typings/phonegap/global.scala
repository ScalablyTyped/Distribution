package typings.phonegap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Acceleration")
  @js.native
  open class Acceleration ()
    extends StObject
       with typings.phonegap.Acceleration {
    
    /* CompleteClass */
    var timestamp: Double = js.native
    
    /* CompleteClass */
    var x: Double = js.native
    
    /* CompleteClass */
    var y: Double = js.native
    
    /* CompleteClass */
    var z: Double = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("CameraPopoverOptions")
  @js.native
  open class CameraPopoverOptions protected ()
    extends StObject
       with typings.phonegap.CameraPopoverOptions {
    def this(x: Double, y: Double, width: Double, height: Double, arrowDir: Double) = this()
  }
  
  object CompassError {
    
    @JSGlobal("CompassError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("CompassError.COMPASS_INTERNAL_ERR")
    @js.native
    def COMPASS_INTERNAL_ERR: Double = js.native
    inline def COMPASS_INTERNAL_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COMPASS_INTERNAL_ERR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("CompassError.COMPASS_NOT_SUPPORTED")
    @js.native
    def COMPASS_NOT_SUPPORTED: Double = js.native
    inline def COMPASS_NOT_SUPPORTED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COMPASS_NOT_SUPPORTED")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Connection")
  @js.native
  def Connection: typings.phonegap.Connection = js.native
  inline def Connection_=(x: Connection): Unit = js.Dynamic.global.updateDynamic("Connection")(x.asInstanceOf[js.Any])
  
  object ContactError {
    
    @JSGlobal("ContactError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("ContactError.INVALID_ARGUMENT_ERROR")
    @js.native
    def INVALID_ARGUMENT_ERROR: Double = js.native
    inline def INVALID_ARGUMENT_ERROR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_ARGUMENT_ERROR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("ContactError.IO_ERROR")
    @js.native
    def IO_ERROR: Double = js.native
    inline def IO_ERROR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IO_ERROR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("ContactError.NOT_SUPPORTED_ERROR")
    @js.native
    def NOT_SUPPORTED_ERROR: Double = js.native
    inline def NOT_SUPPORTED_ERROR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOT_SUPPORTED_ERROR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("ContactError.PENDING_OPERATION_ERROR")
    @js.native
    def PENDING_OPERATION_ERROR: Double = js.native
    inline def PENDING_OPERATION_ERROR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PENDING_OPERATION_ERROR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("ContactError.PERMISSION_DENIED_ERROR")
    @js.native
    def PERMISSION_DENIED_ERROR: Double = js.native
    inline def PERMISSION_DENIED_ERROR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PERMISSION_DENIED_ERROR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("ContactError.TIMEOUT_ERROR")
    @js.native
    def TIMEOUT_ERROR: Double = js.native
    inline def TIMEOUT_ERROR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TIMEOUT_ERROR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("ContactError.UNKNOWN_ERROR")
    @js.native
    def UNKNOWN_ERROR: Double = js.native
    inline def UNKNOWN_ERROR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNKNOWN_ERROR")(x.asInstanceOf[js.Any])
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("ContactField")
  @js.native
  open class ContactField protected ()
    extends StObject
       with typings.phonegap.ContactField {
    def this(`type`: String, calue: String, perf: Boolean) = this()
    
    /* CompleteClass */
    var pref: Boolean = js.native
    
    /* CompleteClass */
    var `type`: String = js.native
    
    /* CompleteClass */
    var value: String = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("ContactFindOptions")
  @js.native
  open class ContactFindOptions ()
    extends StObject
       with typings.phonegap.ContactFindOptions
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("ContactName")
  @js.native
  open class ContactName ()
    extends StObject
       with typings.phonegap.ContactName {
    
    /* CompleteClass */
    var familyName: String = js.native
    
    /* CompleteClass */
    var formatted: String = js.native
    
    /* CompleteClass */
    var givenName: String = js.native
    
    /* CompleteClass */
    var honorificPrefix: String = js.native
    
    /* CompleteClass */
    var honorificSuffix: String = js.native
    
    /* CompleteClass */
    var middleName: String = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("DirectoryEntry")
  @js.native
  open class DirectoryEntry protected ()
    extends StObject
       with FileSystemDirectoryEntry {
    def this(name: String, root: FileSystemDirectoryEntry) = this()
  }
  
  object FileError {
    
    @JSGlobal("FileError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("FileError.ABORT_ERR")
    @js.native
    def ABORT_ERR: Double = js.native
    inline def ABORT_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ABORT_ERR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("FileError.ENCODING_ERR")
    @js.native
    def ENCODING_ERR: Double = js.native
    inline def ENCODING_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENCODING_ERR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("FileError.INVALID_MODIFICATION_ERR")
    @js.native
    def INVALID_MODIFICATION_ERR: Double = js.native
    inline def INVALID_MODIFICATION_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_MODIFICATION_ERR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("FileError.INVALID_STATE_ERR")
    @js.native
    def INVALID_STATE_ERR: Double = js.native
    inline def INVALID_STATE_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_STATE_ERR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("FileError.NOT_FOUND_ERR")
    @js.native
    def NOT_FOUND_ERR: Double = js.native
    inline def NOT_FOUND_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOT_FOUND_ERR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("FileError.NOT_READABLE_ERR")
    @js.native
    def NOT_READABLE_ERR: Double = js.native
    inline def NOT_READABLE_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOT_READABLE_ERR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("FileError.NO_MODIFICATION_ALLOWED_ERR")
    @js.native
    def NO_MODIFICATION_ALLOWED_ERR: Double = js.native
    inline def NO_MODIFICATION_ALLOWED_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NO_MODIFICATION_ALLOWED_ERR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("FileError.PATH_EXISTS_ERR")
    @js.native
    def PATH_EXISTS_ERR: Double = js.native
    inline def PATH_EXISTS_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PATH_EXISTS_ERR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("FileError.QUOTA_EXCEEDED_ERR")
    @js.native
    def QUOTA_EXCEEDED_ERR: Double = js.native
    inline def QUOTA_EXCEEDED_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("QUOTA_EXCEEDED_ERR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("FileError.SECURITY_ERR")
    @js.native
    def SECURITY_ERR: Double = js.native
    inline def SECURITY_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SECURITY_ERR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("FileError.SYNTAX_ERR")
    @js.native
    def SYNTAX_ERR: Double = js.native
    inline def SYNTAX_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SYNTAX_ERR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("FileError.TYPE_MISMATCH_ERR")
    @js.native
    def TYPE_MISMATCH_ERR: Double = js.native
    inline def TYPE_MISMATCH_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TYPE_MISMATCH_ERR")(x.asInstanceOf[js.Any])
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("FileTransfer")
  @js.native
  open class FileTransfer ()
    extends StObject
       with typings.phonegap.FileTransfer
  
  object FileTransferError {
    
    @JSGlobal("FileTransferError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("FileTransferError.ABORT_ERR")
    @js.native
    def ABORT_ERR: Double = js.native
    inline def ABORT_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ABORT_ERR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("FileTransferError.CONNECTION_ERR")
    @js.native
    def CONNECTION_ERR: Double = js.native
    inline def CONNECTION_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONNECTION_ERR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("FileTransferError.FILE_NOT_FOUND_ERR")
    @js.native
    def FILE_NOT_FOUND_ERR: Double = js.native
    inline def FILE_NOT_FOUND_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FILE_NOT_FOUND_ERR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("FileTransferError.INVALID_URL_ERR")
    @js.native
    def INVALID_URL_ERR: Double = js.native
    inline def INVALID_URL_ERR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_URL_ERR")(x.asInstanceOf[js.Any])
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("FileUploadOptions")
  @js.native
  open class FileUploadOptions ()
    extends StObject
       with typings.phonegap.FileUploadOptions
  
  object GlobalizationError {
    
    @JSGlobal("GlobalizationError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("GlobalizationError.FORMATTING_ERROR")
    @js.native
    def FORMATTING_ERROR: Double = js.native
    inline def FORMATTING_ERROR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FORMATTING_ERROR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("GlobalizationError.PARSING_ERROR")
    @js.native
    def PARSING_ERROR: Double = js.native
    inline def PARSING_ERROR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PARSING_ERROR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("GlobalizationError.PATTERN_ERROR")
    @js.native
    def PATTERN_ERROR: Double = js.native
    inline def PATTERN_ERROR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PATTERN_ERROR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("GlobalizationError.UNKNOWN_ERROR")
    @js.native
    def UNKNOWN_ERROR: Double = js.native
    inline def UNKNOWN_ERROR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNKNOWN_ERROR")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Keyboard")
  @js.native
  def Keyboard: typings.phonegap.Keyboard = js.native
  inline def Keyboard_=(x: Keyboard): Unit = js.Dynamic.global.updateDynamic("Keyboard")(x.asInstanceOf[js.Any])
  
  @JSGlobal("LocalFileSystem")
  @js.native
  def LocalFileSystem: typings.phonegap.LocalFileSystem = js.native
  inline def LocalFileSystem_=(x: LocalFileSystem): Unit = js.Dynamic.global.updateDynamic("LocalFileSystem")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Media")
  @js.native
  open class Media protected ()
    extends StObject
       with typings.phonegap.Media {
    def this(
      src: String,
      onSuccess: js.Function1[/* arg */ Any, Any],
      onError: js.Function1[/* error */ Any, Any]
    ) = this()
  }
  
  @JSGlobal("StatusBar")
  @js.native
  def StatusBar: typings.phonegap.StatusBar = js.native
  inline def StatusBar_=(x: StatusBar): Unit = js.Dynamic.global.updateDynamic("StatusBar")(x.asInstanceOf[js.Any])
  
  @JSGlobal("device")
  @js.native
  def device: Device = js.native
  inline def device_=(x: Device): Unit = js.Dynamic.global.updateDynamic("device")(x.asInstanceOf[js.Any])
  
  @JSGlobal("phoneGapNavigator")
  @js.native
  def phoneGapNavigator: Navigator = js.native
  inline def phoneGapNavigator_=(x: Navigator): Unit = js.Dynamic.global.updateDynamic("phoneGapNavigator")(x.asInstanceOf[js.Any])
}
