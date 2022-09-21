package typings.musickitJs

import typings.musickitJs.MusicKit.Artwork
import typings.musickitJs.MusicKit.Configuration
import typings.musickitJs.MusicKit.EmbedOptions
import typings.musickitJs.MusicKit.FormattedPlaybackDuration
import typings.musickitJs.MusicKit.MediaItemOptions
import typings.musickitJs.MusicKit.MusicKitInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /**
    * Use the MusicKit namespace to configure MusicKit JS and to access app
    * instances, control music playback, and fetch data from the Apple Music API.
    */
  object MusicKit {
    
    @JSGlobal("MusicKit")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A class that describes an error that may occur when using MusicKit JS,
      * including server and local errors.
      */
    @JSGlobal("MusicKit.MKError")
    @js.native
    open class MKError ()
      extends StObject
         with typings.musickitJs.MusicKit.MKError {
      
      /**
        * The error code for this error.
        */
      /* CompleteClass */
      var errorCode: String = js.native
      
      /* standard es5 */
      /* CompleteClass */
      var message: String = js.native
      
      /* standard es5 */
      /* CompleteClass */
      var name: String = js.native
    }
    object MKError {
      
      @JSGlobal("MusicKit.MKError")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Error code indicating that you don't have permission to access the
        * endpoint, media item, or content.
        */
      /* static member */
      @JSGlobal("MusicKit.MKError.ACCESS_DENIED")
      @js.native
      def ACCESS_DENIED: String = js.native
      inline def ACCESS_DENIED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ACCESS_DENIED")(x.asInstanceOf[js.Any])
      
      /**
        * Error code indicating the authorization was rejected.
        */
      /* static member */
      @JSGlobal("MusicKit.MKError.AUTHORIZATION_ERROR")
      @js.native
      def AUTHORIZATION_ERROR: String = js.native
      inline def AUTHORIZATION_ERROR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUTHORIZATION_ERROR")(x.asInstanceOf[js.Any])
      
      /**
        * Error code indicating a MusicKit JS configuration error.
        */
      /* static member */
      @JSGlobal("MusicKit.MKError.CONFIGURATION_ERROR")
      @js.native
      def CONFIGURATION_ERROR: String = js.native
      inline def CONFIGURATION_ERROR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONFIGURATION_ERROR")(x.asInstanceOf[js.Any])
      
      /**
        * Error code indicating you don't have permission to access this content,
        * due to content restrictions.
        */
      /* static member */
      @JSGlobal("MusicKit.MKError.CONTENT_RESTRICTED")
      @js.native
      def CONTENT_RESTRICTED: String = js.native
      inline def CONTENT_RESTRICTED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONTENT_RESTRICTED")(x.asInstanceOf[js.Any])
      
      /**
        * Error code indicating the parameters provided for this method are invalid.
        */
      /* static member */
      @JSGlobal("MusicKit.MKError.INVALID_ARGUMENTS")
      @js.native
      def INVALID_ARGUMENTS: String = js.native
      inline def INVALID_ARGUMENTS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_ARGUMENTS")(x.asInstanceOf[js.Any])
      
      /**
        * Error code indicating that the VM certificate could not be applied.
        */
      /* static member */
      @JSGlobal("MusicKit.MKError.MEDIA_CERTIFICATE")
      @js.native
      def MEDIA_CERTIFICATE: String = js.native
      inline def MEDIA_CERTIFICATE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MEDIA_CERTIFICATE")(x.asInstanceOf[js.Any])
      
      /**
        * Error code indicating that the media item descriptor is invalid.
        */
      /* static member */
      @JSGlobal("MusicKit.MKError.MEDIA_DESCRIPTOR")
      @js.native
      def MEDIA_DESCRIPTOR: String = js.native
      inline def MEDIA_DESCRIPTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MEDIA_DESCRIPTOR")(x.asInstanceOf[js.Any])
      
      /**
        * Error code indicating that a DRM key could not be generated.
        */
      /* static member */
      @JSGlobal("MusicKit.MKError.MEDIA_KEY")
      @js.native
      def MEDIA_KEY: String = js.native
      inline def MEDIA_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MEDIA_KEY")(x.asInstanceOf[js.Any])
      
      /**
        * Error code indicating a DRM license error.
        */
      /* static member */
      @JSGlobal("MusicKit.MKError.MEDIA_LICENSE")
      @js.native
      def MEDIA_LICENSE: String = js.native
      inline def MEDIA_LICENSE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MEDIA_LICENSE")(x.asInstanceOf[js.Any])
      
      /**
        * Error code indicating a media playback error.
        */
      /* static member */
      @JSGlobal("MusicKit.MKError.MEDIA_PLAYBACK")
      @js.native
      def MEDIA_PLAYBACK: String = js.native
      inline def MEDIA_PLAYBACK_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MEDIA_PLAYBACK")(x.asInstanceOf[js.Any])
      
      /**
        * Error code indicating that an EME session could not be created.
        */
      /* static member */
      @JSGlobal("MusicKit.MKError.MEDIA_SESSION")
      @js.native
      def MEDIA_SESSION: String = js.native
      inline def MEDIA_SESSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MEDIA_SESSION")(x.asInstanceOf[js.Any])
      
      /**
        * Error code indicating a network error.
        */
      /* static member */
      @JSGlobal("MusicKit.MKError.NETWORK_ERROR")
      @js.native
      def NETWORK_ERROR: String = js.native
      inline def NETWORK_ERROR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NETWORK_ERROR")(x.asInstanceOf[js.Any])
      
      /**
        * Error code indicating that the resource was not found.
        */
      /* static member */
      @JSGlobal("MusicKit.MKError.NOT_FOUND")
      @js.native
      def NOT_FOUND: String = js.native
      inline def NOT_FOUND_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOT_FOUND")(x.asInstanceOf[js.Any])
      
      /**
        * Error code indicating that you have exceeded the Apple Music API quota.
        */
      /* static member */
      @JSGlobal("MusicKit.MKError.QUOTA_EXCEEDED")
      @js.native
      def QUOTA_EXCEEDED: String = js.native
      inline def QUOTA_EXCEEDED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("QUOTA_EXCEEDED")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("MusicKit.MKError.SERVER_ERROR")
      @js.native
      def SERVER_ERROR: String = js.native
      inline def SERVER_ERROR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SERVER_ERROR")(x.asInstanceOf[js.Any])
      
      /**
        * Error code indicating the MusicKit service could not be reached.
        */
      /* static member */
      @JSGlobal("MusicKit.MKError.SERVICE_UNAVAILABLE")
      @js.native
      def SERVICE_UNAVAILABLE: String = js.native
      inline def SERVICE_UNAVAILABLE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SERVICE_UNAVAILABLE")(x.asInstanceOf[js.Any])
      
      /**
        * Error code indicating that the user's Apple Music subscription has expired.
        */
      /* static member */
      @JSGlobal("MusicKit.MKError.SUBSCRIPTION_ERROR")
      @js.native
      def SUBSCRIPTION_ERROR: String = js.native
      inline def SUBSCRIPTION_ERROR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUBSCRIPTION_ERROR")(x.asInstanceOf[js.Any])
      
      /**
        * Error code indicating an unknown error.
        */
      /* static member */
      @JSGlobal("MusicKit.MKError.UNKNOWN_ERROR")
      @js.native
      def UNKNOWN_ERROR: String = js.native
      inline def UNKNOWN_ERROR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNKNOWN_ERROR")(x.asInstanceOf[js.Any])
      
      /**
        * Error code indicating that the operation is not supported.
        */
      /* static member */
      @JSGlobal("MusicKit.MKError.UNSUPPORTED_ERROR")
      @js.native
      def UNSUPPORTED_ERROR: String = js.native
      inline def UNSUPPORTED_ERROR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNSUPPORTED_ERROR")(x.asInstanceOf[js.Any])
    }
    
    /**
      * This class represents a single media item.
      */
    @JSGlobal("MusicKit.MediaItem")
    @js.native
    /**
      * A constructor that creates a new media item from specified options.
      */
    open class MediaItem ()
      extends StObject
         with typings.musickitJs.MusicKit.MediaItem {
      def this(options: MediaItemOptions) = this()
      
      /**
        * A string of information about the album.
        */
      /* CompleteClass */
      override val albumInfo: String = js.native
      
      /**
        * The title of the album.
        */
      /* CompleteClass */
      override val albumName: String = js.native
      
      /**
        * The artist for a media item.
        */
      /* CompleteClass */
      override val artistName: String = js.native
      
      /**
        * The artwork object for the media item.
        */
      /* CompleteClass */
      override val artwork: Artwork = js.native
      
      /**
        * The artwork image for the media item.
        */
      /* CompleteClass */
      override val artworkURL: String = js.native
      
      /**
        * The attributes object for the media item.
        */
      /* CompleteClass */
      override val attributes: Any = js.native
      
      /**
        * A string containing the content rating for the media item.
        */
      /* CompleteClass */
      override val contentRating: String = js.native
      
      /**
        * The disc number where the media item appears.
        */
      /* CompleteClass */
      override val discNumber: Double = js.native
      
      /**
        * The identifier for the media item.
        */
      /* CompleteClass */
      override val id: String = js.native
      
      /**
        * A string of common information about the media item.
        */
      /* CompleteClass */
      override val info: String = js.native
      
      /**
        * A Boolean value that indicates whether the item has explicit lyrics or language.
        */
      /* CompleteClass */
      override val isExplicitItem: Boolean = js.native
      
      /**
        * A Boolean value that indicated whether the item is playable.
        */
      /* CompleteClass */
      override val isPlayable: Boolean = js.native
      
      /**
        * A Boolean value indicating whether the media item is prepared to play.
        */
      /* CompleteClass */
      override val isPreparedToPlay: Boolean = js.native
      
      /**
        * The ISRC (International Standard Recording Code) for a media item.
        */
      /* CompleteClass */
      override val isrc: String = js.native
      
      /**
        * The playback duration of the media item.
        */
      /* CompleteClass */
      override val playbackDuration: Double = js.native
      
      /* CompleteClass */
      override val playlistArtworkURL: String = js.native
      
      /* CompleteClass */
      override val playlistName: String = js.native
      
      /**
        * Prepares a media item for playback.
        */
      /* CompleteClass */
      override def prepareToPlay(): js.Promise[Unit] = js.native
      
      /**
        * The URL to an unencrypted preview of the media item.
        */
      /* CompleteClass */
      override val previewURL: String = js.native
      
      /**
        * The name of the media item.
        */
      /* CompleteClass */
      override val title: String = js.native
      
      /**
        * The number of the media item in the album's track list.
        */
      /* CompleteClass */
      override val trackNumber: Double = js.native
      
      /**
        * The type of the media item.
        */
      /* CompleteClass */
      var `type`: Any = js.native
    }
    
    /**
      * The playback bit rate of the music player.
      */
    @JSGlobal("MusicKit.PlaybackBitrate")
    @js.native
    object PlaybackBitrate extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.musickitJs.MusicKit.PlaybackBitrate & Double] = js.native
      
      /* 256 */ val HIGH: typings.musickitJs.MusicKit.PlaybackBitrate.HIGH & Double = js.native
      
      /* 64 */ val STANDARD: typings.musickitJs.MusicKit.PlaybackBitrate.STANDARD & Double = js.native
    }
    
    /**
      * The playback states of the music player.
      */
    @JSGlobal("MusicKit.PlaybackState")
    @js.native
    object PlaybackState extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.musickitJs.MusicKit.PlaybackState & Double] = js.native
      
      /* 5 */ val ENDED: typings.musickitJs.MusicKit.PlaybackState.ENDED & Double = js.native
      
      /* 1 */ val LOADING: typings.musickitJs.MusicKit.PlaybackState.LOADING & Double = js.native
      
      /* 0 */ val NONE: typings.musickitJs.MusicKit.PlaybackState.NONE & Double = js.native
      
      /* 3 */ val PAUSED: typings.musickitJs.MusicKit.PlaybackState.PAUSED & Double = js.native
      
      /* 2 */ val PLAYING: typings.musickitJs.MusicKit.PlaybackState.PLAYING & Double = js.native
      
      /* 6 */ val SEEKING: typings.musickitJs.MusicKit.PlaybackState.SEEKING & Double = js.native
      
      /* 4 */ val STOPPED: typings.musickitJs.MusicKit.PlaybackState.STOPPED & Double = js.native
      
      /* 9 */ val completed: typings.musickitJs.MusicKit.PlaybackState.completed & Double = js.native
      
      /* 8 */ val stalled: typings.musickitJs.MusicKit.PlaybackState.stalled & Double = js.native
      
      /* 7 */ val waiting: typings.musickitJs.MusicKit.PlaybackState.waiting & Double = js.native
    }
    
    /**
      * Configure a MusicKit instance.
      */
    inline def configure(configuration: Configuration): MusicKitInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(configuration.asInstanceOf[js.Any]).asInstanceOf[MusicKitInstance]
    
    @JSGlobal("MusicKit.errors")
    @js.native
    val errors: js.Array[typings.musickitJs.MusicKit.MKError] = js.native
    
    /**
      * Returns a formatted artwork URL.
      *
      * @param artwork An artwork resource object.
      * @param height The desired artwork height.
      * @param width the desired artwork width.
      */
    inline def formatArtworkURL(artwork: Artwork, height: Double, width: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatArtworkURL")(artwork.asInstanceOf[js.Any], height.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def formatMediaTime(seconds: Double, separator: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatMediaTime")(seconds.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Returns an object with milliseconds formatted into hours and minutes.
      */
    inline def formattedMilliseconds(milliseconds: Double): FormattedPlaybackDuration = ^.asInstanceOf[js.Dynamic].applyDynamic("formattedMilliseconds")(milliseconds.asInstanceOf[js.Any]).asInstanceOf[FormattedPlaybackDuration]
    
    /**
      * Returns an object with seconds formatted into hours and minutes.
      */
    inline def formattedSeconds(seconds: Double): FormattedPlaybackDuration = ^.asInstanceOf[js.Dynamic].applyDynamic("formattedSeconds")(seconds.asInstanceOf[js.Any]).asInstanceOf[FormattedPlaybackDuration]
    
    /**
      * Generates Apple Music web player markup.
      *
      * @param url The iTunes URL for the Apple Music content.
      * @param options The object containing the height and width of the player.
      */
    inline def generateEmbedCode(url: String, options: EmbedOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateEmbedCode")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Returns the configured MusicKit instance.
      */
    inline def getInstance(): MusicKitInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[MusicKitInstance]
    
    @JSGlobal("MusicKit.version")
    @js.native
    val version: String = js.native
  }
}
