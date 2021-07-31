package typings.playable

import typings.playable.engineStateMod.EngineState
import typings.playable.errorsMod.Error
import typings.playable.liveStateMod.LiveState
import typings.playable.mediaStreamMod.MediaStreamDeliveryPriority
import typings.playable.mediaStreamMod.MediaStreamType
import typings.playable.textLabelsMod.TextLabel
import typings.playable.uiMod.UIEvent
import typings.playable.videoMod.VideoEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constantsMod {
  
  @JSImport("playable/dist/src/constants", "ENGINE_STATES")
  @js.native
  object ENGINE_STATES extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[EngineState & String] = js.native
    
    /* "engine-state/ended" */ val ENDED: typings.playable.engineStateMod.EngineState.ENDED & String = js.native
    
    /* "engine-state/load-started" */ val LOAD_STARTED: typings.playable.engineStateMod.EngineState.LOAD_STARTED & String = js.native
    
    /* "engine-state/metadata-loaded" */ val METADATA_LOADED: typings.playable.engineStateMod.EngineState.METADATA_LOADED & String = js.native
    
    /* "engine-state/paused" */ val PAUSED: typings.playable.engineStateMod.EngineState.PAUSED & String = js.native
    
    /* "engine-state/playing" */ val PLAYING: typings.playable.engineStateMod.EngineState.PLAYING & String = js.native
    
    /* "engine-state/play-requested" */ val PLAY_REQUESTED: typings.playable.engineStateMod.EngineState.PLAY_REQUESTED & String = js.native
    
    /* "engine-state/ready-to-play" */ val READY_TO_PLAY: typings.playable.engineStateMod.EngineState.READY_TO_PLAY & String = js.native
    
    /* "engine-state/seek-in-progress" */ val SEEK_IN_PROGRESS: typings.playable.engineStateMod.EngineState.SEEK_IN_PROGRESS & String = js.native
    
    /* "engine-state/src-set" */ val SRC_SET: typings.playable.engineStateMod.EngineState.SRC_SET & String = js.native
    
    /* "engine-state/waiting" */ val WAITING: typings.playable.engineStateMod.EngineState.WAITING & String = js.native
  }
  
  @JSImport("playable/dist/src/constants", "ERRORS")
  @js.native
  object ERRORS extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Error & String] = js.native
    
    /* "error-content-load" */ val CONTENT_LOAD: typings.playable.errorsMod.Error.CONTENT_LOAD & String = js.native
    
    /* "error-content-parse" */ val CONTENT_PARSE: typings.playable.errorsMod.Error.CONTENT_PARSE & String = js.native
    
    /* "error-level-load" */ val LEVEL_LOAD: typings.playable.errorsMod.Error.LEVEL_LOAD & String = js.native
    
    /* "error-manifest-incompatible" */ val MANIFEST_INCOMPATIBLE: typings.playable.errorsMod.Error.MANIFEST_INCOMPATIBLE & String = js.native
    
    /* "error-manifest-load" */ val MANIFEST_LOAD: typings.playable.errorsMod.Error.MANIFEST_LOAD & String = js.native
    
    /* "error-manifest-parse" */ val MANIFEST_PARSE: typings.playable.errorsMod.Error.MANIFEST_PARSE & String = js.native
    
    /* "error-media" */ val MEDIA: typings.playable.errorsMod.Error.MEDIA & String = js.native
    
    /* "error-src-parse" */ val SRC_PARSE: typings.playable.errorsMod.Error.SRC_PARSE & String = js.native
    
    /* "error-unknown" */ val UNKNOWN: typings.playable.errorsMod.Error.UNKNOWN & String = js.native
  }
  
  @JSImport("playable/dist/src/constants", "EngineState")
  @js.native
  object EngineState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.playable.engineStateMod.EngineState & String] = js.native
    
    /* "engine-state/ended" */ val ENDED: typings.playable.engineStateMod.EngineState.ENDED & String = js.native
    
    /* "engine-state/load-started" */ val LOAD_STARTED: typings.playable.engineStateMod.EngineState.LOAD_STARTED & String = js.native
    
    /* "engine-state/metadata-loaded" */ val METADATA_LOADED: typings.playable.engineStateMod.EngineState.METADATA_LOADED & String = js.native
    
    /* "engine-state/paused" */ val PAUSED: typings.playable.engineStateMod.EngineState.PAUSED & String = js.native
    
    /* "engine-state/playing" */ val PLAYING: typings.playable.engineStateMod.EngineState.PLAYING & String = js.native
    
    /* "engine-state/play-requested" */ val PLAY_REQUESTED: typings.playable.engineStateMod.EngineState.PLAY_REQUESTED & String = js.native
    
    /* "engine-state/ready-to-play" */ val READY_TO_PLAY: typings.playable.engineStateMod.EngineState.READY_TO_PLAY & String = js.native
    
    /* "engine-state/seek-in-progress" */ val SEEK_IN_PROGRESS: typings.playable.engineStateMod.EngineState.SEEK_IN_PROGRESS & String = js.native
    
    /* "engine-state/src-set" */ val SRC_SET: typings.playable.engineStateMod.EngineState.SRC_SET & String = js.native
    
    /* "engine-state/waiting" */ val WAITING: typings.playable.engineStateMod.EngineState.WAITING & String = js.native
  }
  
  @JSImport("playable/dist/src/constants", "Error")
  @js.native
  object Error extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.playable.errorsMod.Error & String] = js.native
    
    /* "error-content-load" */ val CONTENT_LOAD: typings.playable.errorsMod.Error.CONTENT_LOAD & String = js.native
    
    /* "error-content-parse" */ val CONTENT_PARSE: typings.playable.errorsMod.Error.CONTENT_PARSE & String = js.native
    
    /* "error-level-load" */ val LEVEL_LOAD: typings.playable.errorsMod.Error.LEVEL_LOAD & String = js.native
    
    /* "error-manifest-incompatible" */ val MANIFEST_INCOMPATIBLE: typings.playable.errorsMod.Error.MANIFEST_INCOMPATIBLE & String = js.native
    
    /* "error-manifest-load" */ val MANIFEST_LOAD: typings.playable.errorsMod.Error.MANIFEST_LOAD & String = js.native
    
    /* "error-manifest-parse" */ val MANIFEST_PARSE: typings.playable.errorsMod.Error.MANIFEST_PARSE & String = js.native
    
    /* "error-media" */ val MEDIA: typings.playable.errorsMod.Error.MEDIA & String = js.native
    
    /* "error-src-parse" */ val SRC_PARSE: typings.playable.errorsMod.Error.SRC_PARSE & String = js.native
    
    /* "error-unknown" */ val UNKNOWN: typings.playable.errorsMod.Error.UNKNOWN & String = js.native
  }
  
  @JSImport("playable/dist/src/constants", "LIVE_STATES")
  @js.native
  object LIVE_STATES extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[LiveState & String] = js.native
    
    /* "live-state/ended" */ val ENDED: typings.playable.liveStateMod.LiveState.ENDED & String = js.native
    
    /* "live-state/initial" */ val INITIAL: typings.playable.liveStateMod.LiveState.INITIAL & String = js.native
    
    /* "live-state/none" */ val NONE: typings.playable.liveStateMod.LiveState.NONE & String = js.native
    
    /* "live-state/not-sync" */ val NOT_SYNC: typings.playable.liveStateMod.LiveState.NOT_SYNC & String = js.native
    
    /* "live-state/sync" */ val SYNC: typings.playable.liveStateMod.LiveState.SYNC & String = js.native
  }
  
  @JSImport("playable/dist/src/constants", "LiveState")
  @js.native
  object LiveState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.playable.liveStateMod.LiveState & String] = js.native
    
    /* "live-state/ended" */ val ENDED: typings.playable.liveStateMod.LiveState.ENDED & String = js.native
    
    /* "live-state/initial" */ val INITIAL: typings.playable.liveStateMod.LiveState.INITIAL & String = js.native
    
    /* "live-state/none" */ val NONE: typings.playable.liveStateMod.LiveState.NONE & String = js.native
    
    /* "live-state/not-sync" */ val NOT_SYNC: typings.playable.liveStateMod.LiveState.NOT_SYNC & String = js.native
    
    /* "live-state/sync" */ val SYNC: typings.playable.liveStateMod.LiveState.SYNC & String = js.native
  }
  
  @JSImport("playable/dist/src/constants", "MEDIA_STREAM_DELIVERY_PRIORITY")
  @js.native
  object MEDIA_STREAM_DELIVERY_PRIORITY extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[MediaStreamDeliveryPriority & Double] = js.native
    
    /* 1 */ val ADAPTIVE_VIA_MSE: typings.playable.mediaStreamMod.MediaStreamDeliveryPriority.ADAPTIVE_VIA_MSE & Double = js.native
    
    /* 3 */ val FORCED: typings.playable.mediaStreamMod.MediaStreamDeliveryPriority.FORCED & Double = js.native
    
    /* 2 */ val NATIVE_ADAPTIVE: typings.playable.mediaStreamMod.MediaStreamDeliveryPriority.NATIVE_ADAPTIVE & Double = js.native
    
    /* 0 */ val NATIVE_PROGRESSIVE: typings.playable.mediaStreamMod.MediaStreamDeliveryPriority.NATIVE_PROGRESSIVE & Double = js.native
  }
  
  @JSImport("playable/dist/src/constants", "MEDIA_STREAM_TYPES")
  @js.native
  object MEDIA_STREAM_TYPES extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[MediaStreamType & String] = js.native
    
    /* "DASH" */ val DASH: typings.playable.mediaStreamMod.MediaStreamType.DASH & String = js.native
    
    /* "HLS" */ val HLS: typings.playable.mediaStreamMod.MediaStreamType.HLS & String = js.native
    
    /* "MKV" */ val MKV: typings.playable.mediaStreamMod.MediaStreamType.MKV & String = js.native
    
    /* "MOV" */ val MOV: typings.playable.mediaStreamMod.MediaStreamType.MOV & String = js.native
    
    /* "MP4" */ val MP4: typings.playable.mediaStreamMod.MediaStreamType.MP4 & String = js.native
    
    /* "OGG" */ val OGG: typings.playable.mediaStreamMod.MediaStreamType.OGG & String = js.native
    
    /* "WEBM" */ val WEBM: typings.playable.mediaStreamMod.MediaStreamType.WEBM & String = js.native
  }
  
  @JSImport("playable/dist/src/constants", "MediaStreamDeliveryPriority")
  @js.native
  object MediaStreamDeliveryPriority extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.playable.mediaStreamMod.MediaStreamDeliveryPriority & Double] = js.native
    
    /* 1 */ val ADAPTIVE_VIA_MSE: typings.playable.mediaStreamMod.MediaStreamDeliveryPriority.ADAPTIVE_VIA_MSE & Double = js.native
    
    /* 3 */ val FORCED: typings.playable.mediaStreamMod.MediaStreamDeliveryPriority.FORCED & Double = js.native
    
    /* 2 */ val NATIVE_ADAPTIVE: typings.playable.mediaStreamMod.MediaStreamDeliveryPriority.NATIVE_ADAPTIVE & Double = js.native
    
    /* 0 */ val NATIVE_PROGRESSIVE: typings.playable.mediaStreamMod.MediaStreamDeliveryPriority.NATIVE_PROGRESSIVE & Double = js.native
  }
  
  @JSImport("playable/dist/src/constants", "MediaStreamType")
  @js.native
  object MediaStreamType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.playable.mediaStreamMod.MediaStreamType & String] = js.native
    
    /* "DASH" */ val DASH: typings.playable.mediaStreamMod.MediaStreamType.DASH & String = js.native
    
    /* "HLS" */ val HLS: typings.playable.mediaStreamMod.MediaStreamType.HLS & String = js.native
    
    /* "MKV" */ val MKV: typings.playable.mediaStreamMod.MediaStreamType.MKV & String = js.native
    
    /* "MOV" */ val MOV: typings.playable.mediaStreamMod.MediaStreamType.MOV & String = js.native
    
    /* "MP4" */ val MP4: typings.playable.mediaStreamMod.MediaStreamType.MP4 & String = js.native
    
    /* "OGG" */ val OGG: typings.playable.mediaStreamMod.MediaStreamType.OGG & String = js.native
    
    /* "WEBM" */ val WEBM: typings.playable.mediaStreamMod.MediaStreamType.WEBM & String = js.native
  }
  
  @JSImport("playable/dist/src/constants", "TEXT_LABELS")
  @js.native
  object TEXT_LABELS extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TextLabel & String] = js.native
    
    /* "download-button-label" */ val DOWNLOAD_BUTTON_LABEL: typings.playable.textLabelsMod.TextLabel.DOWNLOAD_BUTTON_LABEL & String = js.native
    
    /* "download-button-tooltip" */ val DOWNLOAD_BUTTON_TOOLTIP: typings.playable.textLabelsMod.TextLabel.DOWNLOAD_BUTTON_TOOLTIP & String = js.native
    
    /* "enter-full-screen-label" */ val ENTER_FULL_SCREEN_LABEL: typings.playable.textLabelsMod.TextLabel.ENTER_FULL_SCREEN_LABEL & String = js.native
    
    /* "enter-full-screen-tooltip" */ val ENTER_FULL_SCREEN_TOOLTIP: typings.playable.textLabelsMod.TextLabel.ENTER_FULL_SCREEN_TOOLTIP & String = js.native
    
    /* "enter-picture-in-picture-button-label" */ val ENTER_PICTURE_IN_PICTURE_LABEL: typings.playable.textLabelsMod.TextLabel.ENTER_PICTURE_IN_PICTURE_LABEL & String = js.native
    
    /* "enter-picture-in-picture-button-tooltip" */ val ENTER_PICTURE_IN_PICTURE_TOOLTIP: typings.playable.textLabelsMod.TextLabel.ENTER_PICTURE_IN_PICTURE_TOOLTIP & String = js.native
    
    /* "exit-full-screen-label" */ val EXIT_FULL_SCREEN_LABEL: typings.playable.textLabelsMod.TextLabel.EXIT_FULL_SCREEN_LABEL & String = js.native
    
    /* "exit-full-screen-tooltip" */ val EXIT_FULL_SCREEN_TOOLTIP: typings.playable.textLabelsMod.TextLabel.EXIT_FULL_SCREEN_TOOLTIP & String = js.native
    
    /* "exit-picture-in-picture-button-label" */ val EXIT_PICTURE_IN_PICTURE_LABEL: typings.playable.textLabelsMod.TextLabel.EXIT_PICTURE_IN_PICTURE_LABEL & String = js.native
    
    /* "exit-picture-in-picture-button-tooltip" */ val EXIT_PICTURE_IN_PICTURE_TOOLTIP: typings.playable.textLabelsMod.TextLabel.EXIT_PICTURE_IN_PICTURE_TOOLTIP & String = js.native
    
    /* "live-indicator-text" */ val LIVE_INDICATOR_TEXT: typings.playable.textLabelsMod.TextLabel.LIVE_INDICATOR_TEXT & String = js.native
    
    /* "live-sync-button-label" */ val LIVE_SYNC_LABEL: typings.playable.textLabelsMod.TextLabel.LIVE_SYNC_LABEL & String = js.native
    
    /* "live-sync-button-tooltip" */ val LIVE_SYNC_TOOLTIP: typings.playable.textLabelsMod.TextLabel.LIVE_SYNC_TOOLTIP & String = js.native
    
    /* "logo-label" */ val LOGO_LABEL: typings.playable.textLabelsMod.TextLabel.LOGO_LABEL & String = js.native
    
    /* "logo-tooltip" */ val LOGO_TOOLTIP: typings.playable.textLabelsMod.TextLabel.LOGO_TOOLTIP & String = js.native
    
    /* "mute-control-label" */ val MUTE_CONTROL_LABEL: typings.playable.textLabelsMod.TextLabel.MUTE_CONTROL_LABEL & String = js.native
    
    /* "mute-control-tooltip" */ val MUTE_CONTROL_TOOLTIP: typings.playable.textLabelsMod.TextLabel.MUTE_CONTROL_TOOLTIP & String = js.native
    
    /* "pause-control-label" */ val PAUSE_CONTROL_LABEL: typings.playable.textLabelsMod.TextLabel.PAUSE_CONTROL_LABEL & String = js.native
    
    /* "play-control-label" */ val PLAY_CONTROL_LABEL: typings.playable.textLabelsMod.TextLabel.PLAY_CONTROL_LABEL & String = js.native
    
    /* "progress-control-label" */ val PROGRESS_CONTROL_LABEL: typings.playable.textLabelsMod.TextLabel.PROGRESS_CONTROL_LABEL & String = js.native
    
    /* "progress-control-value" */ val PROGRESS_CONTROL_VALUE: typings.playable.textLabelsMod.TextLabel.PROGRESS_CONTROL_VALUE & String = js.native
    
    /* "unmute-control-label" */ val UNMUTE_CONTROL_LABEL: typings.playable.textLabelsMod.TextLabel.UNMUTE_CONTROL_LABEL & String = js.native
    
    /* "unmute-control-label" */ val UNMUTE_CONTROL_TOOLTIP: typings.playable.textLabelsMod.TextLabel.UNMUTE_CONTROL_TOOLTIP & String = js.native
    
    /* "volume-control-label" */ val VOLUME_CONTROL_LABEL: typings.playable.textLabelsMod.TextLabel.VOLUME_CONTROL_LABEL & String = js.native
    
    /* "volume-control-value" */ val VOLUME_CONTROL_VALUE: typings.playable.textLabelsMod.TextLabel.VOLUME_CONTROL_VALUE & String = js.native
  }
  
  @JSImport("playable/dist/src/constants", "TextLabel")
  @js.native
  object TextLabel extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.playable.textLabelsMod.TextLabel & String] = js.native
    
    /* "download-button-label" */ val DOWNLOAD_BUTTON_LABEL: typings.playable.textLabelsMod.TextLabel.DOWNLOAD_BUTTON_LABEL & String = js.native
    
    /* "download-button-tooltip" */ val DOWNLOAD_BUTTON_TOOLTIP: typings.playable.textLabelsMod.TextLabel.DOWNLOAD_BUTTON_TOOLTIP & String = js.native
    
    /* "enter-full-screen-label" */ val ENTER_FULL_SCREEN_LABEL: typings.playable.textLabelsMod.TextLabel.ENTER_FULL_SCREEN_LABEL & String = js.native
    
    /* "enter-full-screen-tooltip" */ val ENTER_FULL_SCREEN_TOOLTIP: typings.playable.textLabelsMod.TextLabel.ENTER_FULL_SCREEN_TOOLTIP & String = js.native
    
    /* "enter-picture-in-picture-button-label" */ val ENTER_PICTURE_IN_PICTURE_LABEL: typings.playable.textLabelsMod.TextLabel.ENTER_PICTURE_IN_PICTURE_LABEL & String = js.native
    
    /* "enter-picture-in-picture-button-tooltip" */ val ENTER_PICTURE_IN_PICTURE_TOOLTIP: typings.playable.textLabelsMod.TextLabel.ENTER_PICTURE_IN_PICTURE_TOOLTIP & String = js.native
    
    /* "exit-full-screen-label" */ val EXIT_FULL_SCREEN_LABEL: typings.playable.textLabelsMod.TextLabel.EXIT_FULL_SCREEN_LABEL & String = js.native
    
    /* "exit-full-screen-tooltip" */ val EXIT_FULL_SCREEN_TOOLTIP: typings.playable.textLabelsMod.TextLabel.EXIT_FULL_SCREEN_TOOLTIP & String = js.native
    
    /* "exit-picture-in-picture-button-label" */ val EXIT_PICTURE_IN_PICTURE_LABEL: typings.playable.textLabelsMod.TextLabel.EXIT_PICTURE_IN_PICTURE_LABEL & String = js.native
    
    /* "exit-picture-in-picture-button-tooltip" */ val EXIT_PICTURE_IN_PICTURE_TOOLTIP: typings.playable.textLabelsMod.TextLabel.EXIT_PICTURE_IN_PICTURE_TOOLTIP & String = js.native
    
    /* "live-indicator-text" */ val LIVE_INDICATOR_TEXT: typings.playable.textLabelsMod.TextLabel.LIVE_INDICATOR_TEXT & String = js.native
    
    /* "live-sync-button-label" */ val LIVE_SYNC_LABEL: typings.playable.textLabelsMod.TextLabel.LIVE_SYNC_LABEL & String = js.native
    
    /* "live-sync-button-tooltip" */ val LIVE_SYNC_TOOLTIP: typings.playable.textLabelsMod.TextLabel.LIVE_SYNC_TOOLTIP & String = js.native
    
    /* "logo-label" */ val LOGO_LABEL: typings.playable.textLabelsMod.TextLabel.LOGO_LABEL & String = js.native
    
    /* "logo-tooltip" */ val LOGO_TOOLTIP: typings.playable.textLabelsMod.TextLabel.LOGO_TOOLTIP & String = js.native
    
    /* "mute-control-label" */ val MUTE_CONTROL_LABEL: typings.playable.textLabelsMod.TextLabel.MUTE_CONTROL_LABEL & String = js.native
    
    /* "mute-control-tooltip" */ val MUTE_CONTROL_TOOLTIP: typings.playable.textLabelsMod.TextLabel.MUTE_CONTROL_TOOLTIP & String = js.native
    
    /* "pause-control-label" */ val PAUSE_CONTROL_LABEL: typings.playable.textLabelsMod.TextLabel.PAUSE_CONTROL_LABEL & String = js.native
    
    /* "play-control-label" */ val PLAY_CONTROL_LABEL: typings.playable.textLabelsMod.TextLabel.PLAY_CONTROL_LABEL & String = js.native
    
    /* "progress-control-label" */ val PROGRESS_CONTROL_LABEL: typings.playable.textLabelsMod.TextLabel.PROGRESS_CONTROL_LABEL & String = js.native
    
    /* "progress-control-value" */ val PROGRESS_CONTROL_VALUE: typings.playable.textLabelsMod.TextLabel.PROGRESS_CONTROL_VALUE & String = js.native
    
    /* "unmute-control-label" */ val UNMUTE_CONTROL_LABEL: typings.playable.textLabelsMod.TextLabel.UNMUTE_CONTROL_LABEL & String = js.native
    
    /* "unmute-control-label" */ val UNMUTE_CONTROL_TOOLTIP: typings.playable.textLabelsMod.TextLabel.UNMUTE_CONTROL_TOOLTIP & String = js.native
    
    /* "volume-control-label" */ val VOLUME_CONTROL_LABEL: typings.playable.textLabelsMod.TextLabel.VOLUME_CONTROL_LABEL & String = js.native
    
    /* "volume-control-value" */ val VOLUME_CONTROL_VALUE: typings.playable.textLabelsMod.TextLabel.VOLUME_CONTROL_VALUE & String = js.native
  }
  
  @JSImport("playable/dist/src/constants", "UIEvent")
  @js.native
  object UIEvent extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.playable.uiMod.UIEvent & String] = js.native
    
    /* "ui-events/control-drag-end" */ val CONTROL_DRAG_END: typings.playable.uiMod.UIEvent.CONTROL_DRAG_END & String = js.native
    
    /* "ui-events/control-drag-start" */ val CONTROL_DRAG_START: typings.playable.uiMod.UIEvent.CONTROL_DRAG_START & String = js.native
    
    /* "ui-events/decrease-volume-with-keyboard" */ val DECREASE_VOLUME_WITH_KEYBOARD: typings.playable.uiMod.UIEvent.DECREASE_VOLUME_WITH_KEYBOARD & String = js.native
    
    /* "ui-events/enter-full-screen-click" */ val ENTER_FULL_SCREEN_CLICK: typings.playable.uiMod.UIEvent.ENTER_FULL_SCREEN_CLICK & String = js.native
    
    /* "ui-events/enter-full-screen-with-screen-click" */ val ENTER_FULL_SCREEN_WITH_SCREEN_CLICK: typings.playable.uiMod.UIEvent.ENTER_FULL_SCREEN_WITH_SCREEN_CLICK & String = js.native
    
    /* "ui-events/enter-picture-in-picture-click" */ val ENTER_PICTURE_IN_PICTURE_CLICK: typings.playable.uiMod.UIEvent.ENTER_PICTURE_IN_PICTURE_CLICK & String = js.native
    
    /* "ui-events/exit-full-screen-click" */ val EXIT_FULL_SCREEN_CLICK: typings.playable.uiMod.UIEvent.EXIT_FULL_SCREEN_CLICK & String = js.native
    
    /* "ui-events/exit-full-screen-with-screen-click" */ val EXIT_FULL_SCREEN_WITH_SCREEN_CLICK: typings.playable.uiMod.UIEvent.EXIT_FULL_SCREEN_WITH_SCREEN_CLICK & String = js.native
    
    /* "ui-events/exit-picture-in-picture-click" */ val EXIT_PICTURE_IN_PICTURE_CLICK: typings.playable.uiMod.UIEvent.EXIT_PICTURE_IN_PICTURE_CLICK & String = js.native
    
    /* "ui-events/focus-enter-on-player" */ val FOCUS_ENTER_ON_PLAYER: typings.playable.uiMod.UIEvent.FOCUS_ENTER_ON_PLAYER & String = js.native
    
    /* "ui-events/focus-leave-on-player" */ val FOCUS_LEAVE_ON_PLAYER: typings.playable.uiMod.UIEvent.FOCUS_LEAVE_ON_PLAYER & String = js.native
    
    /* "ui-events/full-screen-state-changed" */ val FULL_SCREEN_STATE_CHANGED: typings.playable.uiMod.UIEvent.FULL_SCREEN_STATE_CHANGED & String = js.native
    
    /* "ui-events/go-backward-with-keyboard" */ val GO_BACKWARD_WITH_KEYBOARD: typings.playable.uiMod.UIEvent.GO_BACKWARD_WITH_KEYBOARD & String = js.native
    
    /* "ui-events/go-forward-with-keyboard" */ val GO_FORWARD_WITH_KEYBOARD: typings.playable.uiMod.UIEvent.GO_FORWARD_WITH_KEYBOARD & String = js.native
    
    /* "ui-events/hide-interaction-indicator" */ val HIDE_INTERACTION_INDICATOR: typings.playable.uiMod.UIEvent.HIDE_INTERACTION_INDICATOR & String = js.native
    
    /* "ui-events/increase-volume-with-keyboard" */ val INCREASE_VOLUME_WITH_KEYBOARD: typings.playable.uiMod.UIEvent.INCREASE_VOLUME_WITH_KEYBOARD & String = js.native
    
    /* "ui-events/keyboard-keydown-intercepted" */ val KEYBOARD_KEYDOWN_INTERCEPTED: typings.playable.uiMod.UIEvent.KEYBOARD_KEYDOWN_INTERCEPTED & String = js.native
    
    /* "ui-events/loader-hide" */ val LOADER_HIDE: typings.playable.uiMod.UIEvent.LOADER_HIDE & String = js.native
    
    /* "ui-events/loader-show" */ val LOADER_SHOW: typings.playable.uiMod.UIEvent.LOADER_SHOW & String = js.native
    
    /* "ui-events/loading-cover-hide" */ val LOADING_COVER_HIDE: typings.playable.uiMod.UIEvent.LOADING_COVER_HIDE & String = js.native
    
    /* "ui-events/loading-cover-show" */ val LOADING_COVER_SHOW: typings.playable.uiMod.UIEvent.LOADING_COVER_SHOW & String = js.native
    
    /* "ui-events/main-block-hide" */ val MAIN_BLOCK_HIDE: typings.playable.uiMod.UIEvent.MAIN_BLOCK_HIDE & String = js.native
    
    /* "ui-events/main-block-show" */ val MAIN_BLOCK_SHOW: typings.playable.uiMod.UIEvent.MAIN_BLOCK_SHOW & String = js.native
    
    /* "ui-events/mouse-enter-on-player" */ val MOUSE_ENTER_ON_PLAYER: typings.playable.uiMod.UIEvent.MOUSE_ENTER_ON_PLAYER & String = js.native
    
    /* "ui-events/mouse-leave-on-player" */ val MOUSE_LEAVE_ON_PLAYER: typings.playable.uiMod.UIEvent.MOUSE_LEAVE_ON_PLAYER & String = js.native
    
    /* "ui-events/mouse-move-on-player" */ val MOUSE_MOVE_ON_PLAYER: typings.playable.uiMod.UIEvent.MOUSE_MOVE_ON_PLAYER & String = js.native
    
    /* "ui-events/mute-click" */ val MUTE_CLICK: typings.playable.uiMod.UIEvent.MUTE_CLICK & String = js.native
    
    /* "ui-events/mute-with-keyboard" */ val MUTE_WITH_KEYBOARD: typings.playable.uiMod.UIEvent.MUTE_WITH_KEYBOARD & String = js.native
    
    /* "ui-events/pause-click" */ val PAUSE_CLICK: typings.playable.uiMod.UIEvent.PAUSE_CLICK & String = js.native
    
    /* "ui-events/pause-with-screen-click" */ val PAUSE_WITH_SCREEN_CLICK: typings.playable.uiMod.UIEvent.PAUSE_WITH_SCREEN_CLICK & String = js.native
    
    /* "ui-events/picture-in-picture-status-changed" */ val PICTURE_IN_PICTURE_STATUS_CHANGE: typings.playable.uiMod.UIEvent.PICTURE_IN_PICTURE_STATUS_CHANGE & String = js.native
    
    /* "ui-events/play-click" */ val PLAY_CLICK: typings.playable.uiMod.UIEvent.PLAY_CLICK & String = js.native
    
    /* "ui-events/play-overlay-click" */ val PLAY_OVERLAY_CLICK: typings.playable.uiMod.UIEvent.PLAY_OVERLAY_CLICK & String = js.native
    
    /* "ui-events/play-with-screen-click" */ val PLAY_WITH_SCREEN_CLICK: typings.playable.uiMod.UIEvent.PLAY_WITH_SCREEN_CLICK & String = js.native
    
    /* "ui-events/progress-change" */ val PROGRESS_CHANGE: typings.playable.uiMod.UIEvent.PROGRESS_CHANGE & String = js.native
    
    /* "ui-events/progress-drag-ended" */ val PROGRESS_DRAG_ENDED: typings.playable.uiMod.UIEvent.PROGRESS_DRAG_ENDED & String = js.native
    
    /* "ui-events/progress-drag-started" */ val PROGRESS_DRAG_STARTED: typings.playable.uiMod.UIEvent.PROGRESS_DRAG_STARTED & String = js.native
    
    /* "ui-events/progress-sync-button-mouse-enter" */ val PROGRESS_SYNC_BUTTON_MOUSE_ENTER: typings.playable.uiMod.UIEvent.PROGRESS_SYNC_BUTTON_MOUSE_ENTER & String = js.native
    
    /* "ui-events/progress-sync-button-mouse-leave" */ val PROGRESS_SYNC_BUTTON_MOUSE_LEAVE: typings.playable.uiMod.UIEvent.PROGRESS_SYNC_BUTTON_MOUSE_LEAVE & String = js.native
    
    /* "ui-events/progress-user-previewing-frame" */ val PROGRESS_USER_PREVIEWING_FRAME: typings.playable.uiMod.UIEvent.PROGRESS_USER_PREVIEWING_FRAME & String = js.native
    
    /* "ui-events/resize" */ val RESIZE: typings.playable.uiMod.UIEvent.RESIZE & String = js.native
    
    /* "ui-events/toggle-playback-with-keyboard" */ val TOGGLE_PLAYBACK_WITH_KEYBOARD: typings.playable.uiMod.UIEvent.TOGGLE_PLAYBACK_WITH_KEYBOARD & String = js.native
    
    /* "ui-events/unmute-click" */ val UNMUTE_CLICK: typings.playable.uiMod.UIEvent.UNMUTE_CLICK & String = js.native
    
    /* "ui-events/unmute-with-keyboard" */ val UNMUTE_WITH_KEYBOARD: typings.playable.uiMod.UIEvent.UNMUTE_WITH_KEYBOARD & String = js.native
    
    /* "ui-events/volume-change" */ val VOLUME_CHANGE: typings.playable.uiMod.UIEvent.VOLUME_CHANGE & String = js.native
  }
  
  @JSImport("playable/dist/src/constants", "UI_EVENTS")
  @js.native
  object UI_EVENTS extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[UIEvent & String] = js.native
    
    /* "ui-events/control-drag-end" */ val CONTROL_DRAG_END: typings.playable.uiMod.UIEvent.CONTROL_DRAG_END & String = js.native
    
    /* "ui-events/control-drag-start" */ val CONTROL_DRAG_START: typings.playable.uiMod.UIEvent.CONTROL_DRAG_START & String = js.native
    
    /* "ui-events/decrease-volume-with-keyboard" */ val DECREASE_VOLUME_WITH_KEYBOARD: typings.playable.uiMod.UIEvent.DECREASE_VOLUME_WITH_KEYBOARD & String = js.native
    
    /* "ui-events/enter-full-screen-click" */ val ENTER_FULL_SCREEN_CLICK: typings.playable.uiMod.UIEvent.ENTER_FULL_SCREEN_CLICK & String = js.native
    
    /* "ui-events/enter-full-screen-with-screen-click" */ val ENTER_FULL_SCREEN_WITH_SCREEN_CLICK: typings.playable.uiMod.UIEvent.ENTER_FULL_SCREEN_WITH_SCREEN_CLICK & String = js.native
    
    /* "ui-events/enter-picture-in-picture-click" */ val ENTER_PICTURE_IN_PICTURE_CLICK: typings.playable.uiMod.UIEvent.ENTER_PICTURE_IN_PICTURE_CLICK & String = js.native
    
    /* "ui-events/exit-full-screen-click" */ val EXIT_FULL_SCREEN_CLICK: typings.playable.uiMod.UIEvent.EXIT_FULL_SCREEN_CLICK & String = js.native
    
    /* "ui-events/exit-full-screen-with-screen-click" */ val EXIT_FULL_SCREEN_WITH_SCREEN_CLICK: typings.playable.uiMod.UIEvent.EXIT_FULL_SCREEN_WITH_SCREEN_CLICK & String = js.native
    
    /* "ui-events/exit-picture-in-picture-click" */ val EXIT_PICTURE_IN_PICTURE_CLICK: typings.playable.uiMod.UIEvent.EXIT_PICTURE_IN_PICTURE_CLICK & String = js.native
    
    /* "ui-events/focus-enter-on-player" */ val FOCUS_ENTER_ON_PLAYER: typings.playable.uiMod.UIEvent.FOCUS_ENTER_ON_PLAYER & String = js.native
    
    /* "ui-events/focus-leave-on-player" */ val FOCUS_LEAVE_ON_PLAYER: typings.playable.uiMod.UIEvent.FOCUS_LEAVE_ON_PLAYER & String = js.native
    
    /* "ui-events/full-screen-state-changed" */ val FULL_SCREEN_STATE_CHANGED: typings.playable.uiMod.UIEvent.FULL_SCREEN_STATE_CHANGED & String = js.native
    
    /* "ui-events/go-backward-with-keyboard" */ val GO_BACKWARD_WITH_KEYBOARD: typings.playable.uiMod.UIEvent.GO_BACKWARD_WITH_KEYBOARD & String = js.native
    
    /* "ui-events/go-forward-with-keyboard" */ val GO_FORWARD_WITH_KEYBOARD: typings.playable.uiMod.UIEvent.GO_FORWARD_WITH_KEYBOARD & String = js.native
    
    /* "ui-events/hide-interaction-indicator" */ val HIDE_INTERACTION_INDICATOR: typings.playable.uiMod.UIEvent.HIDE_INTERACTION_INDICATOR & String = js.native
    
    /* "ui-events/increase-volume-with-keyboard" */ val INCREASE_VOLUME_WITH_KEYBOARD: typings.playable.uiMod.UIEvent.INCREASE_VOLUME_WITH_KEYBOARD & String = js.native
    
    /* "ui-events/keyboard-keydown-intercepted" */ val KEYBOARD_KEYDOWN_INTERCEPTED: typings.playable.uiMod.UIEvent.KEYBOARD_KEYDOWN_INTERCEPTED & String = js.native
    
    /* "ui-events/loader-hide" */ val LOADER_HIDE: typings.playable.uiMod.UIEvent.LOADER_HIDE & String = js.native
    
    /* "ui-events/loader-show" */ val LOADER_SHOW: typings.playable.uiMod.UIEvent.LOADER_SHOW & String = js.native
    
    /* "ui-events/loading-cover-hide" */ val LOADING_COVER_HIDE: typings.playable.uiMod.UIEvent.LOADING_COVER_HIDE & String = js.native
    
    /* "ui-events/loading-cover-show" */ val LOADING_COVER_SHOW: typings.playable.uiMod.UIEvent.LOADING_COVER_SHOW & String = js.native
    
    /* "ui-events/main-block-hide" */ val MAIN_BLOCK_HIDE: typings.playable.uiMod.UIEvent.MAIN_BLOCK_HIDE & String = js.native
    
    /* "ui-events/main-block-show" */ val MAIN_BLOCK_SHOW: typings.playable.uiMod.UIEvent.MAIN_BLOCK_SHOW & String = js.native
    
    /* "ui-events/mouse-enter-on-player" */ val MOUSE_ENTER_ON_PLAYER: typings.playable.uiMod.UIEvent.MOUSE_ENTER_ON_PLAYER & String = js.native
    
    /* "ui-events/mouse-leave-on-player" */ val MOUSE_LEAVE_ON_PLAYER: typings.playable.uiMod.UIEvent.MOUSE_LEAVE_ON_PLAYER & String = js.native
    
    /* "ui-events/mouse-move-on-player" */ val MOUSE_MOVE_ON_PLAYER: typings.playable.uiMod.UIEvent.MOUSE_MOVE_ON_PLAYER & String = js.native
    
    /* "ui-events/mute-click" */ val MUTE_CLICK: typings.playable.uiMod.UIEvent.MUTE_CLICK & String = js.native
    
    /* "ui-events/mute-with-keyboard" */ val MUTE_WITH_KEYBOARD: typings.playable.uiMod.UIEvent.MUTE_WITH_KEYBOARD & String = js.native
    
    /* "ui-events/pause-click" */ val PAUSE_CLICK: typings.playable.uiMod.UIEvent.PAUSE_CLICK & String = js.native
    
    /* "ui-events/pause-with-screen-click" */ val PAUSE_WITH_SCREEN_CLICK: typings.playable.uiMod.UIEvent.PAUSE_WITH_SCREEN_CLICK & String = js.native
    
    /* "ui-events/picture-in-picture-status-changed" */ val PICTURE_IN_PICTURE_STATUS_CHANGE: typings.playable.uiMod.UIEvent.PICTURE_IN_PICTURE_STATUS_CHANGE & String = js.native
    
    /* "ui-events/play-click" */ val PLAY_CLICK: typings.playable.uiMod.UIEvent.PLAY_CLICK & String = js.native
    
    /* "ui-events/play-overlay-click" */ val PLAY_OVERLAY_CLICK: typings.playable.uiMod.UIEvent.PLAY_OVERLAY_CLICK & String = js.native
    
    /* "ui-events/play-with-screen-click" */ val PLAY_WITH_SCREEN_CLICK: typings.playable.uiMod.UIEvent.PLAY_WITH_SCREEN_CLICK & String = js.native
    
    /* "ui-events/progress-change" */ val PROGRESS_CHANGE: typings.playable.uiMod.UIEvent.PROGRESS_CHANGE & String = js.native
    
    /* "ui-events/progress-drag-ended" */ val PROGRESS_DRAG_ENDED: typings.playable.uiMod.UIEvent.PROGRESS_DRAG_ENDED & String = js.native
    
    /* "ui-events/progress-drag-started" */ val PROGRESS_DRAG_STARTED: typings.playable.uiMod.UIEvent.PROGRESS_DRAG_STARTED & String = js.native
    
    /* "ui-events/progress-sync-button-mouse-enter" */ val PROGRESS_SYNC_BUTTON_MOUSE_ENTER: typings.playable.uiMod.UIEvent.PROGRESS_SYNC_BUTTON_MOUSE_ENTER & String = js.native
    
    /* "ui-events/progress-sync-button-mouse-leave" */ val PROGRESS_SYNC_BUTTON_MOUSE_LEAVE: typings.playable.uiMod.UIEvent.PROGRESS_SYNC_BUTTON_MOUSE_LEAVE & String = js.native
    
    /* "ui-events/progress-user-previewing-frame" */ val PROGRESS_USER_PREVIEWING_FRAME: typings.playable.uiMod.UIEvent.PROGRESS_USER_PREVIEWING_FRAME & String = js.native
    
    /* "ui-events/resize" */ val RESIZE: typings.playable.uiMod.UIEvent.RESIZE & String = js.native
    
    /* "ui-events/toggle-playback-with-keyboard" */ val TOGGLE_PLAYBACK_WITH_KEYBOARD: typings.playable.uiMod.UIEvent.TOGGLE_PLAYBACK_WITH_KEYBOARD & String = js.native
    
    /* "ui-events/unmute-click" */ val UNMUTE_CLICK: typings.playable.uiMod.UIEvent.UNMUTE_CLICK & String = js.native
    
    /* "ui-events/unmute-with-keyboard" */ val UNMUTE_WITH_KEYBOARD: typings.playable.uiMod.UIEvent.UNMUTE_WITH_KEYBOARD & String = js.native
    
    /* "ui-events/volume-change" */ val VOLUME_CHANGE: typings.playable.uiMod.UIEvent.VOLUME_CHANGE & String = js.native
  }
  
  @JSImport("playable/dist/src/constants", "VIDEO_EVENTS")
  @js.native
  object VIDEO_EVENTS extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[VideoEvent & String] = js.native
    
    /* "video-events/chunk-loaded" */ val CHUNK_LOADED: typings.playable.videoMod.VideoEvent.CHUNK_LOADED & String = js.native
    
    /* "video-events/current-time-updated" */ val CURRENT_TIME_UPDATED: typings.playable.videoMod.VideoEvent.CURRENT_TIME_UPDATED & String = js.native
    
    /* "video-events/duration-updated" */ val DURATION_UPDATED: typings.playable.videoMod.VideoEvent.DURATION_UPDATED & String = js.native
    
    /* "video-events/dynamic-content-ended" */ val DYNAMIC_CONTENT_ENDED: typings.playable.videoMod.VideoEvent.DYNAMIC_CONTENT_ENDED & String = js.native
    
    /* "video-events/error" */ val ERROR: typings.playable.videoMod.VideoEvent.ERROR & String = js.native
    
    /* "video-events/live-state-changed" */ val LIVE_STATE_CHANGED: typings.playable.videoMod.VideoEvent.LIVE_STATE_CHANGED & String = js.native
    
    /* "video-events/mute-changed" */ val MUTE_CHANGED: typings.playable.videoMod.VideoEvent.MUTE_CHANGED & String = js.native
    
    /* "video-events/play-aborted" */ val PLAY_ABORTED: typings.playable.videoMod.VideoEvent.PLAY_ABORTED & String = js.native
    
    /* "video-events/play-request" */ val PLAY_REQUEST: typings.playable.videoMod.VideoEvent.PLAY_REQUEST & String = js.native
    
    /* "video-events/reset-playback" */ val RESET: typings.playable.videoMod.VideoEvent.RESET & String = js.native
    
    /* "video-events/seek-in-progress" */ val SEEK_IN_PROGRESS: typings.playable.videoMod.VideoEvent.SEEK_IN_PROGRESS & String = js.native
    
    /* "video-events/sound-state-changed" */ val SOUND_STATE_CHANGED: typings.playable.videoMod.VideoEvent.SOUND_STATE_CHANGED & String = js.native
    
    /* "video-events/state-changed" */ val STATE_CHANGED: typings.playable.videoMod.VideoEvent.STATE_CHANGED & String = js.native
    
    /* "video-events/upload-stalled" */ val UPLOAD_STALLED: typings.playable.videoMod.VideoEvent.UPLOAD_STALLED & String = js.native
    
    /* "video-events/upload-suspend" */ val UPLOAD_SUSPEND: typings.playable.videoMod.VideoEvent.UPLOAD_SUSPEND & String = js.native
    
    /* "video-events/volume-changed" */ val VOLUME_CHANGED: typings.playable.videoMod.VideoEvent.VOLUME_CHANGED & String = js.native
  }
  
  @JSImport("playable/dist/src/constants", "VideoEvent")
  @js.native
  object VideoEvent extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.playable.videoMod.VideoEvent & String] = js.native
    
    /* "video-events/chunk-loaded" */ val CHUNK_LOADED: typings.playable.videoMod.VideoEvent.CHUNK_LOADED & String = js.native
    
    /* "video-events/current-time-updated" */ val CURRENT_TIME_UPDATED: typings.playable.videoMod.VideoEvent.CURRENT_TIME_UPDATED & String = js.native
    
    /* "video-events/duration-updated" */ val DURATION_UPDATED: typings.playable.videoMod.VideoEvent.DURATION_UPDATED & String = js.native
    
    /* "video-events/dynamic-content-ended" */ val DYNAMIC_CONTENT_ENDED: typings.playable.videoMod.VideoEvent.DYNAMIC_CONTENT_ENDED & String = js.native
    
    /* "video-events/error" */ val ERROR: typings.playable.videoMod.VideoEvent.ERROR & String = js.native
    
    /* "video-events/live-state-changed" */ val LIVE_STATE_CHANGED: typings.playable.videoMod.VideoEvent.LIVE_STATE_CHANGED & String = js.native
    
    /* "video-events/mute-changed" */ val MUTE_CHANGED: typings.playable.videoMod.VideoEvent.MUTE_CHANGED & String = js.native
    
    /* "video-events/play-aborted" */ val PLAY_ABORTED: typings.playable.videoMod.VideoEvent.PLAY_ABORTED & String = js.native
    
    /* "video-events/play-request" */ val PLAY_REQUEST: typings.playable.videoMod.VideoEvent.PLAY_REQUEST & String = js.native
    
    /* "video-events/reset-playback" */ val RESET: typings.playable.videoMod.VideoEvent.RESET & String = js.native
    
    /* "video-events/seek-in-progress" */ val SEEK_IN_PROGRESS: typings.playable.videoMod.VideoEvent.SEEK_IN_PROGRESS & String = js.native
    
    /* "video-events/sound-state-changed" */ val SOUND_STATE_CHANGED: typings.playable.videoMod.VideoEvent.SOUND_STATE_CHANGED & String = js.native
    
    /* "video-events/state-changed" */ val STATE_CHANGED: typings.playable.videoMod.VideoEvent.STATE_CHANGED & String = js.native
    
    /* "video-events/upload-stalled" */ val UPLOAD_STALLED: typings.playable.videoMod.VideoEvent.UPLOAD_STALLED & String = js.native
    
    /* "video-events/upload-suspend" */ val UPLOAD_SUSPEND: typings.playable.videoMod.VideoEvent.UPLOAD_SUSPEND & String = js.native
    
    /* "video-events/volume-changed" */ val VOLUME_CHANGED: typings.playable.videoMod.VideoEvent.VOLUME_CHANGED & String = js.native
  }
}
