package typings.powerappsComponentFramework.ComponentFramework

import typings.powerappsComponentFramework.ComponentFramework.NavigationApi.Types.OpenFileMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Helper of Navigation API interface
  */
object NavigationApi {
  
  /**
    * Interface for alert dialog options.
    */
  trait AlertDialogOptions extends StObject {
    
    /**
      * Height of the alert dialog in pixels.
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * Width of the alert dialog pixels.
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object AlertDialogOptions {
    
    inline def apply(): AlertDialogOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlertDialogOptions]
    }
    
    extension [Self <: AlertDialogOptions](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /**
    * Represents the String parameters for Alert Dialog.
    */
  trait AlertDialogStrings extends StObject {
    
    /**
      * The confirm button label. If you do not specify the button label, OK (in user's preferred language) is used as the button label.
      */
    var confirmButtonLabel: js.UndefOr[String] = js.undefined
    
    /**
      * The message to be displyed in the alert dialog.
      */
    var text: String
  }
  object AlertDialogStrings {
    
    inline def apply(text: String): AlertDialogStrings = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[AlertDialogStrings]
    }
    
    extension [Self <: AlertDialogStrings](x: Self) {
      
      inline def setConfirmButtonLabel(value: String): Self = StObject.set(x, "confirmButtonLabel", value.asInstanceOf[js.Any])
      
      inline def setConfirmButtonLabelUndefined: Self = StObject.set(x, "confirmButtonLabel", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Interface for confirm dialog options.
    */
  trait ConfirmDialogOptions extends StObject {
    
    /**
      * Height of the confirmation dialog in pixels.
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      *  Width of the confirmation dialog pixels.
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object ConfirmDialogOptions {
    
    inline def apply(): ConfirmDialogOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfirmDialogOptions]
    }
    
    extension [Self <: ConfirmDialogOptions](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /**
    * An object with the confirmed (Boolean) attribute is passed that indicates whether the confirm button was clicked to close the dialog.
    */
  trait ConfirmDialogResponse extends StObject {
    
    /**
      *  confirmed (Boolean) attribute is passed that indicates whether the confirm button was clicked to close the dialog.
      */
    var confirmed: Boolean
  }
  object ConfirmDialogResponse {
    
    inline def apply(confirmed: Boolean): ConfirmDialogResponse = {
      val __obj = js.Dynamic.literal(confirmed = confirmed.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfirmDialogResponse]
    }
    
    extension [Self <: ConfirmDialogResponse](x: Self) {
      
      inline def setConfirmed(value: Boolean): Self = StObject.set(x, "confirmed", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Represents the String parameters for Confirm Dialog.
    */
  trait ConfirmDialogStrings extends StObject {
    
    /**
      * Cancel Button label.
      */
    var cancelButtonLabel: js.UndefOr[String] = js.undefined
    
    /**
      * The confirm button label. If you do not specify the button label, OK (in user's preferred language) is used as the button label.
      */
    var confirmButtonLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Confirm Dialog Subtitle
      */
    var subtitle: js.UndefOr[String] = js.undefined
    
    /**
      * Confirm Dialog Text\Message.
      */
    var text: String
    
    /**
      * Confirm Dialog Title.
      */
    var title: js.UndefOr[String] = js.undefined
  }
  object ConfirmDialogStrings {
    
    inline def apply(text: String): ConfirmDialogStrings = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfirmDialogStrings]
    }
    
    extension [Self <: ConfirmDialogStrings](x: Self) {
      
      inline def setCancelButtonLabel(value: String): Self = StObject.set(x, "cancelButtonLabel", value.asInstanceOf[js.Any])
      
      inline def setCancelButtonLabelUndefined: Self = StObject.set(x, "cancelButtonLabel", js.undefined)
      
      inline def setConfirmButtonLabel(value: String): Self = StObject.set(x, "confirmButtonLabel", value.asInstanceOf[js.Any])
      
      inline def setConfirmButtonLabelUndefined: Self = StObject.set(x, "confirmButtonLabel", js.undefined)
      
      inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  /**
    * Interface for entity form options.
    */
  trait EntityFormOptions extends StObject {
    
    /**
      * Designates a record that will provide default values based on mapped attribute values. The lookup object has the following String properties: entityType, id, and name
      */
    var createFromEntity: js.UndefOr[EntityReference] = js.undefined
    
    /**
      * ID of the entity record to display the form for.
      */
    var entityId: js.UndefOr[String] = js.undefined
    
    /**
      * Logical name of the entity to display the form for.
      */
    var entityName: String
    
    /**
      * ID of the form instance to be displayed.
      */
    var formId: js.UndefOr[String] = js.undefined
    
    /**
      * Height of the form window to be displayed in pixels.
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * Indicates whether to display form in a new window.
      */
    var openInNewWindow: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates whether to open a quick create form. If you do not specify this, by default false is passed.
      */
    var useQuickCreateForm: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Width of the form window to be displayed in pixels.
      */
    var width: js.UndefOr[Double] = js.undefined
    
    /**
      * Specify one of the following values for the window position of the form on the screen:
      *   1:center
      *   2:side
      */
    var windowPosition: js.UndefOr[Double] = js.undefined
  }
  object EntityFormOptions {
    
    inline def apply(entityName: String): EntityFormOptions = {
      val __obj = js.Dynamic.literal(entityName = entityName.asInstanceOf[js.Any])
      __obj.asInstanceOf[EntityFormOptions]
    }
    
    extension [Self <: EntityFormOptions](x: Self) {
      
      inline def setCreateFromEntity(value: EntityReference): Self = StObject.set(x, "createFromEntity", value.asInstanceOf[js.Any])
      
      inline def setCreateFromEntityUndefined: Self = StObject.set(x, "createFromEntity", js.undefined)
      
      inline def setEntityId(value: String): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
      
      inline def setEntityIdUndefined: Self = StObject.set(x, "entityId", js.undefined)
      
      inline def setEntityName(value: String): Self = StObject.set(x, "entityName", value.asInstanceOf[js.Any])
      
      inline def setFormId(value: String): Self = StObject.set(x, "formId", value.asInstanceOf[js.Any])
      
      inline def setFormIdUndefined: Self = StObject.set(x, "formId", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setOpenInNewWindow(value: Boolean): Self = StObject.set(x, "openInNewWindow", value.asInstanceOf[js.Any])
      
      inline def setOpenInNewWindowUndefined: Self = StObject.set(x, "openInNewWindow", js.undefined)
      
      inline def setUseQuickCreateForm(value: Boolean): Self = StObject.set(x, "useQuickCreateForm", value.asInstanceOf[js.Any])
      
      inline def setUseQuickCreateFormUndefined: Self = StObject.set(x, "useQuickCreateForm", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWindowPosition(value: Double): Self = StObject.set(x, "windowPosition", value.asInstanceOf[js.Any])
      
      inline def setWindowPositionUndefined: Self = StObject.set(x, "windowPosition", js.undefined)
    }
  }
  
  /**
    * Interface for error dialog options.
    * You must set either the errorCode or message attribute.
    */
  trait ErrorDialogOptions extends StObject {
    
    /**
      * Details about the error. When you specify this, the Download Log File button is available in the error message, and clicking it will let users download a text file with
      * the content specified in this attribute.
      */
    var details: js.UndefOr[String] = js.undefined
    
    /**
      * If you just set errorCode, the message for the error code is automatically retrieved from the server and displayed in the error dialog. If you specify an errorCode value,
      * an error dialog with a default error message is displyed.
      */
    var errorCode: js.UndefOr[Double] = js.undefined
    
    /**
      * The message to be displayed in the error dialog.
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object ErrorDialogOptions {
    
    inline def apply(): ErrorDialogOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorDialogOptions]
    }
    
    extension [Self <: ErrorDialogOptions](x: Self) {
      
      inline def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
      
      inline def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
      
      inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
  
  /**
    * Interface for open file options.
    */
  trait OpenFileOptions extends StObject {
    
    /**
      * Specify whether to open or save the file
      * Values:
      *   1 - open
      *   2 - save
      */
    var openMode: OpenFileMode
  }
  object OpenFileOptions {
    
    inline def apply(openMode: OpenFileMode): OpenFileOptions = {
      val __obj = js.Dynamic.literal(openMode = openMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenFileOptions]
    }
    
    extension [Self <: OpenFileOptions](x: Self) {
      
      inline def setOpenMode(value: OpenFileMode): Self = StObject.set(x, "openMode", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * The object returned when a save is successful for open form.
    */
  trait OpenFormSuccessResponse extends StObject {
    
    var savedEntityReference: js.Array[LookupValue]
  }
  object OpenFormSuccessResponse {
    
    inline def apply(savedEntityReference: js.Array[LookupValue]): OpenFormSuccessResponse = {
      val __obj = js.Dynamic.literal(savedEntityReference = savedEntityReference.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenFormSuccessResponse]
    }
    
    extension [Self <: OpenFormSuccessResponse](x: Self) {
      
      inline def setSavedEntityReference(value: js.Array[LookupValue]): Self = StObject.set(x, "savedEntityReference", value.asInstanceOf[js.Any])
      
      inline def setSavedEntityReferenceVarargs(value: LookupValue*): Self = StObject.set(x, "savedEntityReference", js.Array(value*))
    }
  }
  
  /**
    * Interface for OpenUrl options.
    */
  trait OpenUrlOptions extends StObject {
    
    /**
      * Height of the window to display the resultant page in pixels.
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * Width of the window to display the resultant page in pixels.
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object OpenUrlOptions {
    
    inline def apply(): OpenUrlOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenUrlOptions]
    }
    
    extension [Self <: OpenUrlOptions](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /**
    * Interface for OpenWebResource options.
    */
  trait OpenWebResourceOptions extends StObject {
    
    /**
      * Height of the window to display the resultant page in pixels.
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * Indicates whether to open the web resource in a new window.
      */
    var openInNewWindow: Boolean
    
    /**
      * Width of the window to display the resultant page in pixels.
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object OpenWebResourceOptions {
    
    inline def apply(openInNewWindow: Boolean): OpenWebResourceOptions = {
      val __obj = js.Dynamic.literal(openInNewWindow = openInNewWindow.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenWebResourceOptions]
    }
    
    extension [Self <: OpenWebResourceOptions](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setOpenInNewWindow(value: Boolean): Self = StObject.set(x, "openInNewWindow", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  object Types {
    
    /**
      * The options for openFile mode.
      * 1 - open - default,
      * 2 - save
      */
    /* Rewritten from type alias, can be one of: 
      - typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`1`
      - typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`2`
    */
    trait OpenFileMode extends StObject
    object OpenFileMode {
      
      inline def `1`: typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`1` = 1.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`1`]
      
      inline def `2`: typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`2` = 2.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`2`]
    }
  }
}
