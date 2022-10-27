package typings.noteflightClient

import typings.noteflightClient.noteflightClientStrings.aeolian
import typings.noteflightClient.noteflightClientStrings.audioTrack
import typings.noteflightClient.noteflightClientStrings.dorian
import typings.noteflightClient.noteflightClientStrings.echo
import typings.noteflightClient.noteflightClientStrings.flash
import typings.noteflightClient.noteflightClientStrings.flow
import typings.noteflightClient.noteflightClientStrings.html5
import typings.noteflightClient.noteflightClientStrings.ionian
import typings.noteflightClient.noteflightClientStrings.locrian
import typings.noteflightClient.noteflightClientStrings.lydian
import typings.noteflightClient.noteflightClientStrings.major
import typings.noteflightClient.noteflightClientStrings.minor
import typings.noteflightClient.noteflightClientStrings.mixolydian
import typings.noteflightClient.noteflightClientStrings.normal
import typings.noteflightClient.noteflightClientStrings.paginated
import typings.noteflightClient.noteflightClientStrings.phrygian
import typings.noteflightClient.noteflightClientStrings.reader
import typings.noteflightClient.noteflightClientStrings.silent
import typings.noteflightClient.noteflightClientStrings.strip
import typings.noteflightClient.noteflightClientStrings.template
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait App extends StObject {
    
    /**
      * This parameter specifies the technology used to display the document.
      * If omitted, the document is displayed with Flash if present, otherwise with HTML5.
      */
    var app: js.UndefOr[flash | html5] = js.undefined
    
    /**
      * This optional parameter specifies the mode in which the document is displayed.
      */
    var displayMode: js.UndefOr[strip | paginated | flow] = js.undefined
    
    /**
      * This parameter hides the full window button in the header of an embed.
      * It also suppresses the display of links to the full score in the Sharing panel. Default is false.
      */
    var hideFullWindow: js.UndefOr[Boolean] = js.undefined
    
    /**
      * This parameter hides the playback controls.
      * Default is false.
      */
    var hidePlaybackControls: js.UndefOr[Boolean] = js.undefined
    
    /**
      * This optional parameter may be used to control how playback is handled in the embed, and also whether instrument sounds are downloaded or not.
      * There are three settings for this parameter. If this option is not provided, then the playback mode is determined by the default setting in the score.
      */
    var playback: js.UndefOr[normal | audioTrack | echo | silent] = js.undefined
    
    /**
      * This optional parameter specifies the user's role with respect to the document.
      * Only two settings are permitted. The default setting is reader.
      */
    var role: js.UndefOr[reader | template] = js.undefined
    
    /**
      * This parameter optionally provides the visual magnification factor to be applied to the score in the embedded view.
      * A value of 1 indicates no magnification (equivalent to a Zoom value of 100%).
      * A value of 1.5 would make the score view larger (equivalent to 150%) while a value of 0.5 would make it smaller (50%).
      * This magnification overrides any Zoom slider settings in the regular Noteflight view of the score.
      * If omitted, the default factor is 1 (again, not necessarily the factor chosen in the Noteflight full page view).
      */
    var scale: js.UndefOr[Double] = js.undefined
    
    /**
      * Determines whether the window for synced media, if present, displays.
      * Default is true.
      */
    var showMediaTab: js.UndefOr[Boolean] = js.undefined
    
    /**
      * This parameter, if set to false, hides the score's title, supertitle, subtitle, composer, and lyricist.
      * Default is true.
      */
    var showScoreInfo: js.UndefOr[Boolean] = js.undefined
    
    /**
      * This parameter shows a watermark in the embed score.
      * The URL of the watermark has to be passed in this parameter.
      */
    var watermark: js.UndefOr[String] = js.undefined
    
    /**
      * This parameter scales the watermark image.
      */
    var watermarkScale: js.UndefOr[Double] = js.undefined
  }
  object App {
    
    inline def apply(): App = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[App]
    }
    
    extension [Self <: App](x: Self) {
      
      inline def setApp(value: flash | html5): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setAppUndefined: Self = StObject.set(x, "app", js.undefined)
      
      inline def setDisplayMode(value: strip | paginated | flow): Self = StObject.set(x, "displayMode", value.asInstanceOf[js.Any])
      
      inline def setDisplayModeUndefined: Self = StObject.set(x, "displayMode", js.undefined)
      
      inline def setHideFullWindow(value: Boolean): Self = StObject.set(x, "hideFullWindow", value.asInstanceOf[js.Any])
      
      inline def setHideFullWindowUndefined: Self = StObject.set(x, "hideFullWindow", js.undefined)
      
      inline def setHidePlaybackControls(value: Boolean): Self = StObject.set(x, "hidePlaybackControls", value.asInstanceOf[js.Any])
      
      inline def setHidePlaybackControlsUndefined: Self = StObject.set(x, "hidePlaybackControls", js.undefined)
      
      inline def setPlayback(value: normal | audioTrack | echo | silent): Self = StObject.set(x, "playback", value.asInstanceOf[js.Any])
      
      inline def setPlaybackUndefined: Self = StObject.set(x, "playback", js.undefined)
      
      inline def setRole(value: reader | template): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setShowMediaTab(value: Boolean): Self = StObject.set(x, "showMediaTab", value.asInstanceOf[js.Any])
      
      inline def setShowMediaTabUndefined: Self = StObject.set(x, "showMediaTab", js.undefined)
      
      inline def setShowScoreInfo(value: Boolean): Self = StObject.set(x, "showScoreInfo", value.asInstanceOf[js.Any])
      
      inline def setShowScoreInfoUndefined: Self = StObject.set(x, "showScoreInfo", js.undefined)
      
      inline def setWatermark(value: String): Self = StObject.set(x, "watermark", value.asInstanceOf[js.Any])
      
      inline def setWatermarkScale(value: Double): Self = StObject.set(x, "watermarkScale", value.asInstanceOf[js.Any])
      
      inline def setWatermarkScaleUndefined: Self = StObject.set(x, "watermarkScale", js.undefined)
      
      inline def setWatermarkUndefined: Self = StObject.set(x, "watermark", js.undefined)
    }
  }
  
  /* Inlined noteflight-client.KeySignature & {  alternateKey :noteflight-client.KeySignature | undefined} */
  trait KeySignaturealternateKeyK extends StObject {
    
    var alternateKey: js.UndefOr[KeySignature] = js.undefined
    
    /**
      * The key signature's distance from C major / A minor by fifths, expressed as a number between -7 and 7.
      * If positive, equal to the number of sharps in the key signature; if negative, equal to the number of flats.
      */
    var fifths: Double
    
    /**
      * 	the mode of the key signature: one of "major", "minor", "ionian", "dorian", "phrygian", "lydian", "mixolydian", "aeolian", or "locrian". Left undefined if the score's mode is unknown.
      */
    var mode: js.UndefOr[
        major | minor | ionian | dorian | phrygian | lydian | mixolydian | aeolian | locrian
      ] = js.undefined
    
    /**
      * the first note of the key signature's scale. Left undefined if the score's mode is unknown.
      */
    var tonic: String
  }
  object KeySignaturealternateKeyK {
    
    inline def apply(fifths: Double, tonic: String): KeySignaturealternateKeyK = {
      val __obj = js.Dynamic.literal(fifths = fifths.asInstanceOf[js.Any], tonic = tonic.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeySignaturealternateKeyK]
    }
    
    extension [Self <: KeySignaturealternateKeyK](x: Self) {
      
      inline def setAlternateKey(value: KeySignature): Self = StObject.set(x, "alternateKey", value.asInstanceOf[js.Any])
      
      inline def setAlternateKeyUndefined: Self = StObject.set(x, "alternateKey", js.undefined)
      
      inline def setFifths(value: Double): Self = StObject.set(x, "fifths", value.asInstanceOf[js.Any])
      
      inline def setMode(value: major | minor | ionian | dorian | phrygian | lydian | mixolydian | aeolian | locrian): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setTonic(value: String): Self = StObject.set(x, "tonic", value.asInstanceOf[js.Any])
    }
  }
  
  trait UsePrinter extends StObject {
    
    var usePrinter: js.UndefOr[Boolean] = js.undefined
  }
  object UsePrinter {
    
    inline def apply(): UsePrinter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UsePrinter]
    }
    
    extension [Self <: UsePrinter](x: Self) {
      
      inline def setUsePrinter(value: Boolean): Self = StObject.set(x, "usePrinter", value.asInstanceOf[js.Any])
      
      inline def setUsePrinterUndefined: Self = StObject.set(x, "usePrinter", js.undefined)
    }
  }
  
  trait Version extends StObject {
    
    var version: String
  }
  object Version {
    
    inline def apply(version: String): Version = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Version]
    }
    
    extension [Self <: Version](x: Self) {
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
