package typings.musickitJs.MusicKit

import typings.musickitJs.anon.AuthorizationStatus
import typings.musickitJs.anon.OldState
import typings.musickitJs.anon.Progress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A dictionary containing events for a MusicKit instance.
  */
trait Events extends StObject {
  
  /**
    * A notification name indicating a change in the authorization status.
    */
  var authorizationStatusDidChange: AuthorizationStatus
  
  /**
    * A notification name indicating an upcoming change in the authorization status.
    */
  var authorizationStatusWillChange: Any
  
  /**
    * A notification name indicating a user is eligible for a subscribe view.
    */
  var eligibleForSubscribeView: Any
  
  /**
    * A notification name indicating MusicKit JS is loaded.
    */
  var loaded: Any
  
  /**
    * A notification name indicating the player has obtained enough data for
    * playback to start.
    */
  var mediaCanPlay: Any
  
  /**
    * A notification name indicating that the currently-playing media item has
    * changed.
    */
  var mediaItemDidChange: Any
  
  /**
    * A notification name indicating the currently-playing media item is about
    * to change.
    */
  var mediaItemWillChange: Any
  
  /**
    * A notification name indicating that the player has thrown an error during
    * playback.
    */
  var mediaPlaybackError: Any
  
  /**
    * A notification name indicating the media item's metadata has finished
    * loading.
    */
  var metadataDidChange: Any
  
  /**
    * A notification indicating the playback bit rate has changed.
    */
  var playbackBitrateDidChange: Any
  
  /**
    * A notification name indicating the current playback duration changed.
    */
  var playbackDurationDidChange: Any
  
  /**
    * A notification name indicating the current playback progress changed.
    */
  var playbackProgressDidChange: Progress
  
  /**
    * A notification indicating the playback state has changed.
    */
  var playbackStateDidChange: OldState
  
  /**
    * A notification indicating the playback state is about to be changed.
    */
  var playbackStateWillChange: Any
  
  /**
    * A notification indicating that a playback target's availability has changed.
    */
  var playbackTargetAvailableDidChange: Any
  
  /**
    * A notification name indicating the current playback time has changed.
    */
  var playbackTimeDidChange: Any
  
  /**
    * A notification name indicating the player volume has changed.
    */
  var playbackVolumeDidChange: Any
  
  /**
    * A notification name indicating the playback has started in another context
    * on your domain, and the current player has stopped playback.
    */
  var primaryPlayerDidChange: Any
  
  /**
    * A notification name indicating that the items in the current playback
    * queue have changed.
    */
  var queueItemsDidChange: Any
  
  /**
    * A notification name indicating that the current queue position has changed.
    */
  var queuePositionDidChange: Any
  
  /**
    * A notification name indicating a change in the storefront country code.
    */
  var storefrontCountryCodeDidChange: Any
  
  /**
    * A notification name indicating that the device's inferred storefront
    * identifier changed.
    */
  var storefrontIdentifierDidChange: Any
  
  /**
    * A notification name indicating the user token changed.
    */
  var userTokenDidChange: Any
}
object Events {
  
  inline def apply(
    authorizationStatusDidChange: AuthorizationStatus,
    authorizationStatusWillChange: Any,
    eligibleForSubscribeView: Any,
    loaded: Any,
    mediaCanPlay: Any,
    mediaItemDidChange: Any,
    mediaItemWillChange: Any,
    mediaPlaybackError: Any,
    metadataDidChange: Any,
    playbackBitrateDidChange: Any,
    playbackDurationDidChange: Any,
    playbackProgressDidChange: Progress,
    playbackStateDidChange: OldState,
    playbackStateWillChange: Any,
    playbackTargetAvailableDidChange: Any,
    playbackTimeDidChange: Any,
    playbackVolumeDidChange: Any,
    primaryPlayerDidChange: Any,
    queueItemsDidChange: Any,
    queuePositionDidChange: Any,
    storefrontCountryCodeDidChange: Any,
    storefrontIdentifierDidChange: Any,
    userTokenDidChange: Any
  ): Events = {
    val __obj = js.Dynamic.literal(authorizationStatusDidChange = authorizationStatusDidChange.asInstanceOf[js.Any], authorizationStatusWillChange = authorizationStatusWillChange.asInstanceOf[js.Any], eligibleForSubscribeView = eligibleForSubscribeView.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any], mediaCanPlay = mediaCanPlay.asInstanceOf[js.Any], mediaItemDidChange = mediaItemDidChange.asInstanceOf[js.Any], mediaItemWillChange = mediaItemWillChange.asInstanceOf[js.Any], mediaPlaybackError = mediaPlaybackError.asInstanceOf[js.Any], metadataDidChange = metadataDidChange.asInstanceOf[js.Any], playbackBitrateDidChange = playbackBitrateDidChange.asInstanceOf[js.Any], playbackDurationDidChange = playbackDurationDidChange.asInstanceOf[js.Any], playbackProgressDidChange = playbackProgressDidChange.asInstanceOf[js.Any], playbackStateDidChange = playbackStateDidChange.asInstanceOf[js.Any], playbackStateWillChange = playbackStateWillChange.asInstanceOf[js.Any], playbackTargetAvailableDidChange = playbackTargetAvailableDidChange.asInstanceOf[js.Any], playbackTimeDidChange = playbackTimeDidChange.asInstanceOf[js.Any], playbackVolumeDidChange = playbackVolumeDidChange.asInstanceOf[js.Any], primaryPlayerDidChange = primaryPlayerDidChange.asInstanceOf[js.Any], queueItemsDidChange = queueItemsDidChange.asInstanceOf[js.Any], queuePositionDidChange = queuePositionDidChange.asInstanceOf[js.Any], storefrontCountryCodeDidChange = storefrontCountryCodeDidChange.asInstanceOf[js.Any], storefrontIdentifierDidChange = storefrontIdentifierDidChange.asInstanceOf[js.Any], userTokenDidChange = userTokenDidChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[Events]
  }
  
  extension [Self <: Events](x: Self) {
    
    inline def setAuthorizationStatusDidChange(value: AuthorizationStatus): Self = StObject.set(x, "authorizationStatusDidChange", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationStatusWillChange(value: Any): Self = StObject.set(x, "authorizationStatusWillChange", value.asInstanceOf[js.Any])
    
    inline def setEligibleForSubscribeView(value: Any): Self = StObject.set(x, "eligibleForSubscribeView", value.asInstanceOf[js.Any])
    
    inline def setLoaded(value: Any): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
    
    inline def setMediaCanPlay(value: Any): Self = StObject.set(x, "mediaCanPlay", value.asInstanceOf[js.Any])
    
    inline def setMediaItemDidChange(value: Any): Self = StObject.set(x, "mediaItemDidChange", value.asInstanceOf[js.Any])
    
    inline def setMediaItemWillChange(value: Any): Self = StObject.set(x, "mediaItemWillChange", value.asInstanceOf[js.Any])
    
    inline def setMediaPlaybackError(value: Any): Self = StObject.set(x, "mediaPlaybackError", value.asInstanceOf[js.Any])
    
    inline def setMetadataDidChange(value: Any): Self = StObject.set(x, "metadataDidChange", value.asInstanceOf[js.Any])
    
    inline def setPlaybackBitrateDidChange(value: Any): Self = StObject.set(x, "playbackBitrateDidChange", value.asInstanceOf[js.Any])
    
    inline def setPlaybackDurationDidChange(value: Any): Self = StObject.set(x, "playbackDurationDidChange", value.asInstanceOf[js.Any])
    
    inline def setPlaybackProgressDidChange(value: Progress): Self = StObject.set(x, "playbackProgressDidChange", value.asInstanceOf[js.Any])
    
    inline def setPlaybackStateDidChange(value: OldState): Self = StObject.set(x, "playbackStateDidChange", value.asInstanceOf[js.Any])
    
    inline def setPlaybackStateWillChange(value: Any): Self = StObject.set(x, "playbackStateWillChange", value.asInstanceOf[js.Any])
    
    inline def setPlaybackTargetAvailableDidChange(value: Any): Self = StObject.set(x, "playbackTargetAvailableDidChange", value.asInstanceOf[js.Any])
    
    inline def setPlaybackTimeDidChange(value: Any): Self = StObject.set(x, "playbackTimeDidChange", value.asInstanceOf[js.Any])
    
    inline def setPlaybackVolumeDidChange(value: Any): Self = StObject.set(x, "playbackVolumeDidChange", value.asInstanceOf[js.Any])
    
    inline def setPrimaryPlayerDidChange(value: Any): Self = StObject.set(x, "primaryPlayerDidChange", value.asInstanceOf[js.Any])
    
    inline def setQueueItemsDidChange(value: Any): Self = StObject.set(x, "queueItemsDidChange", value.asInstanceOf[js.Any])
    
    inline def setQueuePositionDidChange(value: Any): Self = StObject.set(x, "queuePositionDidChange", value.asInstanceOf[js.Any])
    
    inline def setStorefrontCountryCodeDidChange(value: Any): Self = StObject.set(x, "storefrontCountryCodeDidChange", value.asInstanceOf[js.Any])
    
    inline def setStorefrontIdentifierDidChange(value: Any): Self = StObject.set(x, "storefrontIdentifierDidChange", value.asInstanceOf[js.Any])
    
    inline def setUserTokenDidChange(value: Any): Self = StObject.set(x, "userTokenDidChange", value.asInstanceOf[js.Any])
  }
}
