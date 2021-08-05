package typings.naverWhale.whale

import typings.chrome.chrome.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Types
////////////////////
/**
  * The chrome.types API contains type declarations for Chrome.
  * @since Chrome 13.
  */
object types {
  
  @js.native
  trait ChromeSetting extends StObject {
    
    /**
      * Clears the setting, restoring any default value.
      * @param details Which setting to clear.
      * @param callback Optional. Called at the completion of the clear operation.
      */
    def clear(details: typings.chrome.chrome.types.ChromeSettingClearDetails): Unit = js.native
    def clear(details: typings.chrome.chrome.types.ChromeSettingClearDetails, callback: js.Function): Unit = js.native
    
    /**
      * Gets the value of a setting.
      * @param details Which setting to consider.
      */
    def get(details: typings.chrome.chrome.types.ChromeSettingGetDetails): Unit = js.native
    def get(
      details: typings.chrome.chrome.types.ChromeSettingGetDetails,
      callback: typings.chrome.chrome.types.DetailsCallback
    ): Unit = js.native
    
    /** Fired after the setting changes. */
    var onChange: typings.chrome.chrome.types.ChromeSettingChangedEvent = js.native
    
    /**
      * Sets the value of a setting.
      * @param details Which setting to change.
      * @param callback Optional. Called at the completion of the set operation.
      */
    def set(details: typings.chrome.chrome.types.ChromeSettingSetDetails): Unit = js.native
    def set(details: typings.chrome.chrome.types.ChromeSettingSetDetails, callback: js.Function): Unit = js.native
  }
  
  type ChromeSettingChangedEvent = Event[typings.chrome.chrome.types.DetailsCallback]
  
  trait ChromeSettingClearDetails extends StObject {
    
    /**
      * Optional.
      * The scope of the ChromeSetting. One of
      * • regular: setting for the regular profile (which is inherited by the incognito profile if not overridden elsewhere),
      * • regular_only: setting for the regular profile only (not inherited by the incognito profile),
      * • incognito_persistent: setting for the incognito profile that survives browser restarts (overrides regular preferences),
      * • incognito_session_only: setting for the incognito profile that can only be set during an incognito session and is deleted when the incognito session ends (overrides regular and incognito_persistent preferences).
      */
    var scope: js.UndefOr[String] = js.undefined
  }
  object ChromeSettingClearDetails {
    
    inline def apply(): ChromeSettingClearDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChromeSettingClearDetails]
    }
    
    extension [Self <: ChromeSettingClearDetails](x: Self) {
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
  
  trait ChromeSettingGetDetails extends StObject {
    
    /** Optional. Whether to return the value that applies to the incognito session (default false). */
    var incognito: js.UndefOr[Boolean] = js.undefined
  }
  object ChromeSettingGetDetails {
    
    inline def apply(): ChromeSettingGetDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChromeSettingGetDetails]
    }
    
    extension [Self <: ChromeSettingGetDetails](x: Self) {
      
      inline def setIncognito(value: Boolean): Self = StObject.set(x, "incognito", value.asInstanceOf[js.Any])
      
      inline def setIncognitoUndefined: Self = StObject.set(x, "incognito", js.undefined)
    }
  }
  
  trait ChromeSettingGetResultDetails extends StObject {
    
    /**
      * Optional.
      * Whether the effective value is specific to the incognito session.
      * This property will only be present if the incognito property in the details parameter of get() was true.
      */
    var incognitoSpecific: js.UndefOr[Boolean] = js.undefined
    
    /**
      * One of
      * • not_controllable: cannot be controlled by any extension
      * • controlled_by_other_extensions: controlled by extensions with higher precedence
      * • controllable_by_this_extension: can be controlled by this extension
      * • controlled_by_this_extension: controlled by this extension
      */
    var levelOfControl: String
    
    /** The value of the setting. */
    var value: js.Any
  }
  object ChromeSettingGetResultDetails {
    
    inline def apply(levelOfControl: String, value: js.Any): ChromeSettingGetResultDetails = {
      val __obj = js.Dynamic.literal(levelOfControl = levelOfControl.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChromeSettingGetResultDetails]
    }
    
    extension [Self <: ChromeSettingGetResultDetails](x: Self) {
      
      inline def setIncognitoSpecific(value: Boolean): Self = StObject.set(x, "incognitoSpecific", value.asInstanceOf[js.Any])
      
      inline def setIncognitoSpecificUndefined: Self = StObject.set(x, "incognitoSpecific", js.undefined)
      
      inline def setLevelOfControl(value: String): Self = StObject.set(x, "levelOfControl", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ChromeSettingSetDetails
    extends StObject
       with typings.chrome.chrome.types.ChromeSettingClearDetails {
    
    /**
      * The value of the setting.
      * Note that every setting has a specific value type, which is described together with the setting. An extension should not set a value of a different type.
      */
    var value: js.Any
  }
  object ChromeSettingSetDetails {
    
    inline def apply(value: js.Any): ChromeSettingSetDetails = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChromeSettingSetDetails]
    }
    
    extension [Self <: ChromeSettingSetDetails](x: Self) {
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type DetailsCallback = js.Function1[/* details */ typings.chrome.chrome.types.ChromeSettingGetResultDetails, Unit]
}
