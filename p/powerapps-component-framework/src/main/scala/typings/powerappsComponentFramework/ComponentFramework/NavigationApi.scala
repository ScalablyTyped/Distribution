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
    
    @scala.inline
    def apply(): AlertDialogOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlertDialogOptions]
    }
    
    @scala.inline
    implicit class AlertDialogOptionsMutableBuilder[Self <: AlertDialogOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
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
    
    @scala.inline
    def apply(text: String): AlertDialogStrings = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[AlertDialogStrings]
    }
    
    @scala.inline
    implicit class AlertDialogStringsMutableBuilder[Self <: AlertDialogStrings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfirmButtonLabel(value: String): Self = StObject.set(x, "confirmButtonLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfirmButtonLabelUndefined: Self = StObject.set(x, "confirmButtonLabel", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(): ConfirmDialogOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfirmDialogOptions]
    }
    
    @scala.inline
    implicit class ConfirmDialogOptionsMutableBuilder[Self <: ConfirmDialogOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
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
    
    @scala.inline
    def apply(confirmed: Boolean): ConfirmDialogResponse = {
      val __obj = js.Dynamic.literal(confirmed = confirmed.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfirmDialogResponse]
    }
    
    @scala.inline
    implicit class ConfirmDialogResponseMutableBuilder[Self <: ConfirmDialogResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfirmed(value: Boolean): Self = StObject.set(x, "confirmed", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(text: String): ConfirmDialogStrings = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfirmDialogStrings]
    }
    
    @scala.inline
    implicit class ConfirmDialogStringsMutableBuilder[Self <: ConfirmDialogStrings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancelButtonLabel(value: String): Self = StObject.set(x, "cancelButtonLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelButtonLabelUndefined: Self = StObject.set(x, "cancelButtonLabel", js.undefined)
      
      @scala.inline
      def setConfirmButtonLabel(value: String): Self = StObject.set(x, "confirmButtonLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfirmButtonLabelUndefined: Self = StObject.set(x, "confirmButtonLabel", js.undefined)
      
      @scala.inline
      def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
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
    
    @scala.inline
    def apply(entityName: String): EntityFormOptions = {
      val __obj = js.Dynamic.literal(entityName = entityName.asInstanceOf[js.Any])
      __obj.asInstanceOf[EntityFormOptions]
    }
    
    @scala.inline
    implicit class EntityFormOptionsMutableBuilder[Self <: EntityFormOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateFromEntity(value: EntityReference): Self = StObject.set(x, "createFromEntity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateFromEntityUndefined: Self = StObject.set(x, "createFromEntity", js.undefined)
      
      @scala.inline
      def setEntityId(value: String): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntityIdUndefined: Self = StObject.set(x, "entityId", js.undefined)
      
      @scala.inline
      def setEntityName(value: String): Self = StObject.set(x, "entityName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormId(value: String): Self = StObject.set(x, "formId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormIdUndefined: Self = StObject.set(x, "formId", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setOpenInNewWindow(value: Boolean): Self = StObject.set(x, "openInNewWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenInNewWindowUndefined: Self = StObject.set(x, "openInNewWindow", js.undefined)
      
      @scala.inline
      def setUseQuickCreateForm(value: Boolean): Self = StObject.set(x, "useQuickCreateForm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseQuickCreateFormUndefined: Self = StObject.set(x, "useQuickCreateForm", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setWindowPosition(value: Double): Self = StObject.set(x, "windowPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowPositionUndefined: Self = StObject.set(x, "windowPosition", js.undefined)
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
    
    @scala.inline
    def apply(): ErrorDialogOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorDialogOptions]
    }
    
    @scala.inline
    implicit class ErrorDialogOptionsMutableBuilder[Self <: ErrorDialogOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
      
      @scala.inline
      def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
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
    
    @scala.inline
    def apply(openMode: OpenFileMode): OpenFileOptions = {
      val __obj = js.Dynamic.literal(openMode = openMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenFileOptions]
    }
    
    @scala.inline
    implicit class OpenFileOptionsMutableBuilder[Self <: OpenFileOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOpenMode(value: OpenFileMode): Self = StObject.set(x, "openMode", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * The object returned when a save is successful for open form.
    */
  trait OpenFormSuccessResponse extends StObject {
    
    var savedEntityReference: js.Array[EntityReference]
  }
  object OpenFormSuccessResponse {
    
    @scala.inline
    def apply(savedEntityReference: js.Array[EntityReference]): OpenFormSuccessResponse = {
      val __obj = js.Dynamic.literal(savedEntityReference = savedEntityReference.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenFormSuccessResponse]
    }
    
    @scala.inline
    implicit class OpenFormSuccessResponseMutableBuilder[Self <: OpenFormSuccessResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSavedEntityReference(value: js.Array[EntityReference]): Self = StObject.set(x, "savedEntityReference", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSavedEntityReferenceVarargs(value: EntityReference*): Self = StObject.set(x, "savedEntityReference", js.Array(value :_*))
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
    
    @scala.inline
    def apply(): OpenUrlOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenUrlOptions]
    }
    
    @scala.inline
    implicit class OpenUrlOptionsMutableBuilder[Self <: OpenUrlOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
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
    
    @scala.inline
    def apply(openInNewWindow: Boolean): OpenWebResourceOptions = {
      val __obj = js.Dynamic.literal(openInNewWindow = openInNewWindow.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenWebResourceOptions]
    }
    
    @scala.inline
    implicit class OpenWebResourceOptionsMutableBuilder[Self <: OpenWebResourceOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setOpenInNewWindow(value: Boolean): Self = StObject.set(x, "openInNewWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  object Types {
    
    /**
      * The options for openFile mode.
      * 1 - open - default,
      * 2 - save
      */
    /* Rewritten from type alias, can be one of: 
      - typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`1`
      - typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`2`
    */
    trait OpenFileMode extends StObject
    object OpenFileMode {
      
      @scala.inline
      def `1`: typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`1` = 1.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`1`]
      
      @scala.inline
      def `2`: typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`2` = 2.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`2`]
    }
  }
}
