package typings.naverWhale.whale

import typings.chrome.chrome.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Font Settings
////////////////////
/**
  * Use the chrome.fontSettings API to manage Chrome's font settings.
  * Availability: Since Chrome 22.
  * Permissions:  "fontSettings"
  */
object fontSettings {
  
  type DefaultFixedFontSizeChangedEvent = Event[
    js.Function1[/* details */ typings.chrome.chrome.fontSettings.FontSizeDetails, Unit]
  ]
  
  type DefaultFontSizeChangedEvent = Event[
    js.Function1[/* details */ typings.chrome.chrome.fontSettings.FontSizeDetails, Unit]
  ]
  
  @js.native
  trait DefaultFontSizeDetails extends StObject {
    
    /** The font size in pixels. */
    var pixelSize: Double = js.native
  }
  object DefaultFontSizeDetails {
    
    @scala.inline
    def apply(pixelSize: Double): DefaultFontSizeDetails = {
      val __obj = js.Dynamic.literal(pixelSize = pixelSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultFontSizeDetails]
    }
    
    @scala.inline
    implicit class DefaultFontSizeDetailsMutableBuilder[Self <: DefaultFontSizeDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPixelSize(value: Double): Self = StObject.set(x, "pixelSize", value.asInstanceOf[js.Any])
    }
  }
  
  type FontChangedEvent = Event[
    js.Function1[/* details */ typings.chrome.chrome.fontSettings.FullFontDetails, Unit]
  ]
  
  @js.native
  trait FontDetails extends StObject {
    
    /** The generic font family for the font. */
    var genericFamily: String = js.native
    
    /** Optional. The script for the font. If omitted, the global script font setting is affected.  */
    var script: js.UndefOr[String] = js.native
  }
  object FontDetails {
    
    @scala.inline
    def apply(genericFamily: String): FontDetails = {
      val __obj = js.Dynamic.literal(genericFamily = genericFamily.asInstanceOf[js.Any])
      __obj.asInstanceOf[FontDetails]
    }
    
    @scala.inline
    implicit class FontDetailsMutableBuilder[Self <: FontDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGenericFamily(value: String): Self = StObject.set(x, "genericFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
    }
  }
  
  @js.native
  trait FontDetailsResult extends StObject {
    
    /** The font ID. Rather than the literal font ID preference value, this may be the ID of the font that the system resolves the preference value to. So, fontId can differ from the font passed to setFont, if, for example, the font is not available on the system. The empty string signifies fallback to the global script font setting. */
    var fontId: String = js.native
    
    /** The level of control this extension has over the setting. */
    var levelOfControl: String = js.native
  }
  object FontDetailsResult {
    
    @scala.inline
    def apply(fontId: String, levelOfControl: String): FontDetailsResult = {
      val __obj = js.Dynamic.literal(fontId = fontId.asInstanceOf[js.Any], levelOfControl = levelOfControl.asInstanceOf[js.Any])
      __obj.asInstanceOf[FontDetailsResult]
    }
    
    @scala.inline
    implicit class FontDetailsResultMutableBuilder[Self <: FontDetailsResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFontId(value: String): Self = StObject.set(x, "fontId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelOfControl(value: String): Self = StObject.set(x, "levelOfControl", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FontName extends StObject {
    
    /** The display name of the font. */
    var displayName: String = js.native
    
    /** The font ID. */
    var fontId: String = js.native
  }
  object FontName {
    
    @scala.inline
    def apply(displayName: String, fontId: String): FontName = {
      val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], fontId = fontId.asInstanceOf[js.Any])
      __obj.asInstanceOf[FontName]
    }
    
    @scala.inline
    implicit class FontNameMutableBuilder[Self <: FontName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontId(value: String): Self = StObject.set(x, "fontId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FontSizeDetails extends StObject {
    
    /** The level of control this extension has over the setting. */
    var levelOfControl: String = js.native
    
    /** The font size in pixels. */
    var pixelSize: Double = js.native
  }
  object FontSizeDetails {
    
    @scala.inline
    def apply(levelOfControl: String, pixelSize: Double): FontSizeDetails = {
      val __obj = js.Dynamic.literal(levelOfControl = levelOfControl.asInstanceOf[js.Any], pixelSize = pixelSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[FontSizeDetails]
    }
    
    @scala.inline
    implicit class FontSizeDetailsMutableBuilder[Self <: FontSizeDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLevelOfControl(value: String): Self = StObject.set(x, "levelOfControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPixelSize(value: Double): Self = StObject.set(x, "pixelSize", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FullFontDetails extends StObject {
    
    /** The font ID. See the description in getFont. */
    var fontId: String = js.native
    
    /** The generic font family for which the font setting has changed. */
    var genericFamily: String = js.native
    
    /** The level of control this extension has over the setting. */
    var levelOfControl: String = js.native
    
    /** Optional. The script code for which the font setting has changed.  */
    var script: js.UndefOr[String] = js.native
  }
  object FullFontDetails {
    
    @scala.inline
    def apply(fontId: String, genericFamily: String, levelOfControl: String): FullFontDetails = {
      val __obj = js.Dynamic.literal(fontId = fontId.asInstanceOf[js.Any], genericFamily = genericFamily.asInstanceOf[js.Any], levelOfControl = levelOfControl.asInstanceOf[js.Any])
      __obj.asInstanceOf[FullFontDetails]
    }
    
    @scala.inline
    implicit class FullFontDetailsMutableBuilder[Self <: FullFontDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFontId(value: String): Self = StObject.set(x, "fontId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGenericFamily(value: String): Self = StObject.set(x, "genericFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelOfControl(value: String): Self = StObject.set(x, "levelOfControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
    }
  }
  
  type MinimumFontSizeChangedEvent = Event[
    js.Function1[/* details */ typings.chrome.chrome.fontSettings.FontSizeDetails, Unit]
  ]
  
  @js.native
  trait SetFontDetails
    extends typings.chrome.chrome.fontSettings.FontDetails {
    
    /** The font ID. The empty string means to fallback to the global script font setting. */
    var fontId: String = js.native
  }
  object SetFontDetails {
    
    @scala.inline
    def apply(fontId: String, genericFamily: String): SetFontDetails = {
      val __obj = js.Dynamic.literal(fontId = fontId.asInstanceOf[js.Any], genericFamily = genericFamily.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetFontDetails]
    }
    
    @scala.inline
    implicit class SetFontDetailsMutableBuilder[Self <: SetFontDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFontId(value: String): Self = StObject.set(x, "fontId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SetFontSizeDetails extends StObject {
    
    /** The font size in pixels. */
    var pixelSize: Double = js.native
  }
  object SetFontSizeDetails {
    
    @scala.inline
    def apply(pixelSize: Double): SetFontSizeDetails = {
      val __obj = js.Dynamic.literal(pixelSize = pixelSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetFontSizeDetails]
    }
    
    @scala.inline
    implicit class SetFontSizeDetailsMutableBuilder[Self <: SetFontSizeDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPixelSize(value: Double): Self = StObject.set(x, "pixelSize", value.asInstanceOf[js.Any])
    }
  }
}
