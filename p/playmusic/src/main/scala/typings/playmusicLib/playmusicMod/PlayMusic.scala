package typings
package playmusicLib.playmusicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlayMusic extends js.Object {
  /**
    * Creates a new playlist.
    *
    * @param playlistName string - the playlist name
    * @param callback function(error, mutateResponses) - success callback
    */
  def addPlayList(
    playlistName: java.lang.String,
    callback: js.Function2[/* error */ nodeLib.Error, /* mutateResponses */ MutateResponses, scala.Unit]
  ): scala.Unit = js.native
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
    songIds: java.lang.String,
    playlistId: java.lang.String,
    callback: js.Function2[/* error */ nodeLib.Error, /* mutateResponses */ MutateResponses, scala.Unit]
  ): scala.Unit = js.native
  def addTrackToPlayList(
    songIds: java.lang.String,
    playlistId: java.lang.String,
    callback: js.Function2[/* error */ nodeLib.Error, /* mutateResponses */ MutateResponses, scala.Unit],
    entryBeforeClientId: java.lang.String
  ): scala.Unit = js.native
  def addTrackToPlayList(
    songIds: java.lang.String,
    playlistId: java.lang.String,
    callback: js.Function2[/* error */ nodeLib.Error, /* mutateResponses */ MutateResponses, scala.Unit],
    entryBeforeClientId: java.lang.String,
    entryAfterClientId: java.lang.String
  ): scala.Unit = js.native
  def addTrackToPlayList(
    songIds: js.Array[java.lang.String],
    playlistId: java.lang.String,
    callback: js.Function2[/* error */ nodeLib.Error, /* mutateResponses */ MutateResponses, scala.Unit]
  ): scala.Unit = js.native
  def addTrackToPlayList(
    songIds: js.Array[java.lang.String],
    playlistId: java.lang.String,
    callback: js.Function2[/* error */ nodeLib.Error, /* mutateResponses */ MutateResponses, scala.Unit],
    entryBeforeClientId: java.lang.String
  ): scala.Unit = js.native
  def addTrackToPlayList(
    songIds: js.Array[java.lang.String],
    playlistId: java.lang.String,
    callback: js.Function2[/* error */ nodeLib.Error, /* mutateResponses */ MutateResponses, scala.Unit],
    entryBeforeClientId: java.lang.String,
    entryAfterClientId: java.lang.String
  ): scala.Unit = js.native
  /**
    * Change metadata of a track a library
    * Currently only support changing rating
    * You need to change a song object with a different rating value:
    * 5 = thumb up, 1 = thumb down, 0 = no thumb
    *
    * @param song object - the track dictionary. You can get from getAllAccessTrack or from getLibrary
    * @param callback function(err, success) - success callback
    */
  def changeTrackMetadata(
    song: js.Any,
    callback: js.Function2[/* error */ nodeLib.Error, /* success */ MutateResponses, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Deletes a playlist
    *
    * @param playlistId string - the playlist id
    * @param callback function(err, mutationStatus) - success callback
    */
  def deletePlaylist(
    playlistId: java.lang.String,
    callback: js.Function2[/* error */ nodeLib.Error, /* mutationStatus */ MutateResponses, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Returns list of all tracks.
    *
    * @param callback function(error, response) - success callback
    */
  def getLibrary(callback: js.Function2[/* error */ nodeLib.Error, /* response */ LibraryResponse, scala.Unit]): scala.Unit = js.native
  /**
    * Returns list of all tracks.
    *
    * @param options object - parameters
    * @param callback function(error, response) - success callback
    */
  def getLibrary(
    options: LibraryOptions,
    callback: js.Function2[/* error */ nodeLib.Error, /* response */ LibraryResponse, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Returns tracks on all playlists.
    *
    * @param callback function(error, response) - success callback
    */
  def getPlayListEntries(callback: js.Function2[/* error */ nodeLib.Error, /* response */ PlaylistResponse, scala.Unit]): scala.Unit = js.native
  /**
    * Returns tracks on all playlists.
    *
    * @param options object - parameters
    * @param callback function(error, response) - success callback
    */
  def getPlayListEntries(
    options: PlaylistOptions,
    callback: js.Function2[/* error */ nodeLib.Error, /* response */ PlaylistResponse, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Returns list of all playlists.
    *
    * @param callback function(error, playlists) - success callback
    */
  def getPlayLists(callback: js.Function2[/* error */ nodeLib.Error, /* response */ PlaylistListResponse, scala.Unit]): scala.Unit = js.native
  /**
    * Returns settings / device ids authorized for account.
    *
    * @param callback function(error, response) - success callback
    */
  def getSettings(callback: js.Function2[/* error */ nodeLib.Error, /* response */ js.Any, scala.Unit]): scala.Unit = js.native
  /**
    * Opens and returns a stream object
    *
    * @param id string - track id, hyphenated is preferred, but "nid" will work for all access tracks (not uploaded ones)
    * @param callback function(stream) - success callback
    */
  def getStream(
    id: java.lang.String,
    callback: js.Function2[/* error */ nodeLib.Error, /* stream */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Returns stream URL for a track.
    *
    * @param id string - track id, hyphenated is preferred, but "nid" will work for all access tracks (not uploaded ones)
    * @param callback function(err, streamUrl) - success callback
    */
  def getStreamUrl(
    id: java.lang.String,
    callback: js.Function2[/* error */ nodeLib.Error, /* streamUrl */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Increments track's playcount
    *
    * @param songId int - the song id. See http://bit.ly/1L4U6oK for id requirements.
    * @param callback function(err, mutationStatus) - success callback
    */
  def incrementTrackPlaycount(
    songId: java.lang.String,
    callback: js.Function2[/* error */ nodeLib.Error, /* mutationStatus */ MutateResponses, scala.Unit]
  ): scala.Unit = js.native
  def init(options: InitOptions, callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  def login(
    options: LoginOptions,
    callback: js.Function2[/* error */ nodeLib.Error, /* response */ LoginResponse, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Move the specified entry inbetween two specified entries (identified by their clientIds)
    *
    * @param entryToMove string - the song id to move
    * @param entryBeforeClientId - optional clientId of playlist entry where to move song after
    * @param entryAfterClientId - optional clientId of playlist entry where to move song before
    * @param callback function(err, playlistEntries) - success callback
    */
  def movePlayListEntry(
    entryToMove: java.lang.String,
    entryBeforeClientId: java.lang.String,
    entryAfterClientId: java.lang.String,
    callback: js.Function2[/* error */ nodeLib.Error, /* mutateResponses */ MutateResponses, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Removes given entry ids from playlist entries.
    *
    * @param playlistItemIds string or array of string - the entry id(s). You can get this from getPlayListEntries or PlaylistItem#id.
    * @param callback function(error, mutateResponses) - success callback
    */
  def removePlayListEntry(
    playlistItemIds: java.lang.String,
    callback: js.Function2[/* error */ nodeLib.Error, /* mutateResponses */ MutateResponses, scala.Unit]
  ): scala.Unit = js.native
  def removePlayListEntry(
    playlistItemIds: js.Array[java.lang.String],
    callback: js.Function2[/* error */ nodeLib.Error, /* mutateResponses */ MutateResponses, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Searches for All Access tracks.
    *
    * @param text string - search text
    * @param maxResults int - max number of results to return
    * @param callback function(err, searchResults) - success callback
    */
  def search(
    text: java.lang.String,
    maxResults: scala.Double,
    callback: js.Function2[/* error */ nodeLib.Error, /* searchResults */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Updates a playlist's metadata
    *
    * @param playlistId string - the playlist id
    * @param updates object - data to update the playlist with
    * @param callback function(err, mutationStatus) - success callback
    */
  def updatePlayListMeta(
    playlistId: java.lang.String,
    updates: PlaylistMeta,
    callback: js.Function2[/* error */ nodeLib.Error, /* mutationStatus */ MutateResponses, scala.Unit]
  ): scala.Unit = js.native
}

