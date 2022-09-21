package typings.playmusic.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlayMusic extends StObject {
  
  /**
    * Creates a new playlist.
    *
    * @param playlistName string - the playlist name
    * @param callback function(error, mutateResponses) - success callback
    */
  def addPlayList(
    playlistName: String,
    callback: js.Function2[/* error */ js.Error, /* mutateResponses */ MutateResponses, Unit]
  ): Unit = js.native
  
  /**
    * Adds a track to end of a playlist.
    *
    * @param songId string or array of string - the song id(s)
    * @param playlistId string - the playlist id
    * @param callback function(error, mutateResponses) - success callback
    * @param entryBeforeClientId - optional clientId of playlist entry where to add song after
    * @param entryAfterClientId - optional clientId of playlist entry where to add song before
    */
  def addTrackToPlayList(
    songIds: String,
    playlistId: String,
    callback: js.Function2[/* error */ js.Error, /* mutateResponses */ MutateResponses, Unit]
  ): Unit = js.native
  def addTrackToPlayList(
    songIds: String,
    playlistId: String,
    callback: js.Function2[/* error */ js.Error, /* mutateResponses */ MutateResponses, Unit],
    entryBeforeClientId: String
  ): Unit = js.native
  def addTrackToPlayList(
    songIds: String,
    playlistId: String,
    callback: js.Function2[/* error */ js.Error, /* mutateResponses */ MutateResponses, Unit],
    entryBeforeClientId: String,
    entryAfterClientId: String
  ): Unit = js.native
  def addTrackToPlayList(
    songIds: String,
    playlistId: String,
    callback: js.Function2[/* error */ js.Error, /* mutateResponses */ MutateResponses, Unit],
    entryBeforeClientId: Unit,
    entryAfterClientId: String
  ): Unit = js.native
  def addTrackToPlayList(
    songIds: js.Array[String],
    playlistId: String,
    callback: js.Function2[/* error */ js.Error, /* mutateResponses */ MutateResponses, Unit]
  ): Unit = js.native
  def addTrackToPlayList(
    songIds: js.Array[String],
    playlistId: String,
    callback: js.Function2[/* error */ js.Error, /* mutateResponses */ MutateResponses, Unit],
    entryBeforeClientId: String
  ): Unit = js.native
  def addTrackToPlayList(
    songIds: js.Array[String],
    playlistId: String,
    callback: js.Function2[/* error */ js.Error, /* mutateResponses */ MutateResponses, Unit],
    entryBeforeClientId: String,
    entryAfterClientId: String
  ): Unit = js.native
  def addTrackToPlayList(
    songIds: js.Array[String],
    playlistId: String,
    callback: js.Function2[/* error */ js.Error, /* mutateResponses */ MutateResponses, Unit],
    entryBeforeClientId: Unit,
    entryAfterClientId: String
  ): Unit = js.native
  
  /**
    * Change metadata of a track a library
    * Currently only support changing rating
    * You need to change a song object with a different rating value:
    * 5 = thumb up, 1 = thumb down, 0 = no thumb
    *
    * @param song object - the track dictionary. You can get from getAllAccessTrack or from getLibrary
    * @param callback function(err, success) - success callback
    */
  def changeTrackMetadata(song: Any, callback: js.Function2[/* error */ js.Error, /* success */ MutateResponses, Unit]): Unit = js.native
  
  /**
    * Deletes a playlist
    *
    * @param playlistId string - the playlist id
    * @param callback function(err, mutationStatus) - success callback
    */
  def deletePlaylist(
    playlistId: String,
    callback: js.Function2[/* error */ js.Error, /* mutationStatus */ MutateResponses, Unit]
  ): Unit = js.native
  
  /**
    * Returns list of all tracks.
    *
    * @param callback function(error, response) - success callback
    */
  def getLibrary(callback: js.Function2[/* error */ js.Error, /* response */ LibraryResponse, Unit]): Unit = js.native
  /**
    * Returns list of all tracks.
    *
    * @param options object - parameters
    * @param callback function(error, response) - success callback
    */
  def getLibrary(
    options: LibraryOptions,
    callback: js.Function2[/* error */ js.Error, /* response */ LibraryResponse, Unit]
  ): Unit = js.native
  
  /**
    * Returns tracks on all playlists.
    *
    * @param callback function(error, response) - success callback
    */
  def getPlayListEntries(callback: js.Function2[/* error */ js.Error, /* response */ PlaylistResponse, Unit]): Unit = js.native
  /**
    * Returns tracks on all playlists.
    *
    * @param options object - parameters
    * @param callback function(error, response) - success callback
    */
  def getPlayListEntries(
    options: PlaylistOptions,
    callback: js.Function2[/* error */ js.Error, /* response */ PlaylistResponse, Unit]
  ): Unit = js.native
  
  /**
    * Returns list of all playlists.
    *
    * @param callback function(error, playlists) - success callback
    */
  def getPlayLists(callback: js.Function2[/* error */ js.Error, /* response */ PlaylistListResponse, Unit]): Unit = js.native
  
  /**
    * Returns settings / device ids authorized for account.
    *
    * @param callback function(error, response) - success callback
    */
  def getSettings(callback: js.Function2[/* error */ js.Error, /* response */ Any, Unit]): Unit = js.native
  
  /**
    * Opens and returns a stream object
    *
    * @param id string - track id, hyphenated is preferred, but "nid" will work for all access tracks (not uploaded ones)
    * @param callback function(stream) - success callback
    */
  def getStream(id: String, callback: js.Function2[/* error */ js.Error, /* stream */ Any, Unit]): Unit = js.native
  
  /**
    * Returns stream URL for a track.
    *
    * @param id string - track id, hyphenated is preferred, but "nid" will work for all access tracks (not uploaded ones)
    * @param callback function(err, streamUrl) - success callback
    */
  def getStreamUrl(id: String, callback: js.Function2[/* error */ js.Error, /* streamUrl */ String, Unit]): Unit = js.native
  
  /**
    * Increments track's playcount
    *
    * @param songId int - the song id. See http://bit.ly/1L4U6oK for id requirements.
    * @param callback function(err, mutationStatus) - success callback
    */
  def incrementTrackPlaycount(
    songId: String,
    callback: js.Function2[/* error */ js.Error, /* mutationStatus */ MutateResponses, Unit]
  ): Unit = js.native
  
  def init(options: InitOptions, callback: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
  
  def login(
    options: LoginOptions,
    callback: js.Function2[/* error */ js.Error, /* response */ LoginResponse, Unit]
  ): Unit = js.native
  
  /**
    * Move the specified entry inbetween two specified entries (identified by their clientIds)
    *
    * @param entryToMove string - the song id to move
    * @param entryBeforeClientId - optional clientId of playlist entry where to move song after
    * @param entryAfterClientId - optional clientId of playlist entry where to move song before
    * @param callback function(err, playlistEntries) - success callback
    */
  def movePlayListEntry(
    entryToMove: String,
    entryBeforeClientId: String,
    entryAfterClientId: String,
    callback: js.Function2[/* error */ js.Error, /* mutateResponses */ MutateResponses, Unit]
  ): Unit = js.native
  
  /**
    * Removes given entry ids from playlist entries.
    *
    * @param playlistItemIds string or array of string - the entry id(s). You can get this from getPlayListEntries or PlaylistItem#id.
    * @param callback function(error, mutateResponses) - success callback
    */
  def removePlayListEntry(
    playlistItemIds: String,
    callback: js.Function2[/* error */ js.Error, /* mutateResponses */ MutateResponses, Unit]
  ): Unit = js.native
  def removePlayListEntry(
    playlistItemIds: js.Array[String],
    callback: js.Function2[/* error */ js.Error, /* mutateResponses */ MutateResponses, Unit]
  ): Unit = js.native
  
  /**
    * Searches for All Access tracks.
    *
    * @param text string - search text
    * @param maxResults int - max number of results to return
    * @param callback function(err, searchResults) - success callback
    */
  def search(
    text: String,
    maxResults: Double,
    callback: js.Function2[/* error */ js.Error, /* searchResults */ Any, Unit]
  ): Unit = js.native
  
  /**
    * Updates a playlist's metadata
    *
    * @param playlistId string - the playlist id
    * @param updates object - data to update the playlist with
    * @param callback function(err, mutationStatus) - success callback
    */
  def updatePlayListMeta(
    playlistId: String,
    updates: PlaylistMeta,
    callback: js.Function2[/* error */ js.Error, /* mutationStatus */ MutateResponses, Unit]
  ): Unit = js.native
}
