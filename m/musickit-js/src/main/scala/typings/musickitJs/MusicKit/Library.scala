package typings.musickitJs.MusicKit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class represents a user's Cloud Library.
  */
@js.native
trait Library extends StObject {
  
  /**
    * Fetch a library album using its identifier.
    *
    * @param id A library album identifier
    * @param parameters A query parameters object that is serialized and passed
    * directly to the Cloud Library API.
    * https://developer.apple.com/documentation/musickitjs/musickit/library/3001494-albums
    */
  def album(id: String): js.Promise[Albums] = js.native
  def album(id: String, parameters: QueryParameters): js.Promise[Albums] = js.native
  
  /**
    * Fetch one or more library albums using their identifiers.
    *
    * @param ids An array of library album identifiers.
    * @param parameters A query parameters object that is serialized and passed
    * directly to the Cloud Library API.
    * https://developer.apple.com/documentation/musickitjs/musickit/library/3001494-albums
    */
  def albums(): js.Promise[js.Array[Albums]] = js.native
  def albums(ids: js.Array[String]): js.Promise[js.Array[Albums]] = js.native
  def albums(ids: js.Array[String], parameters: QueryParameters): js.Promise[js.Array[Albums]] = js.native
  def albums(ids: Null, parameters: QueryParameters): js.Promise[js.Array[Albums]] = js.native
  
  /**
    * Fetch a library artist using its identifier.
    *
    * @param id A library artist identifier.
    * @param parameters A query parameters object that is serialized and passed
    * directly to the Cloud Library API.
    * https://developer.apple.com/documentation/musickitjs/musickit/library/3001495-artist
    */
  def artist(id: String): js.Promise[Artists] = js.native
  def artist(id: String, parameters: QueryParameters): js.Promise[Artists] = js.native
  
  /**
    * Fetch one or more library artists using their identifiers.
    *
    * @param ids An array of library artist identifiers.
    * @param parameters A query parameters object that is serialized and passed
    * directly to the Cloud Library API.
    * https://developer.apple.com/documentation/musickitjs/musickit/library/3001496-artists
    */
  def artists(): js.Promise[js.Array[Artists]] = js.native
  def artists(ids: js.Array[String]): js.Promise[js.Array[Artists]] = js.native
  def artists(ids: js.Array[String], parameters: QueryParameters): js.Promise[js.Array[Artists]] = js.native
  def artists(ids: Null, parameters: QueryParameters): js.Promise[js.Array[Artists]] = js.native
  
  /**
    * Fetch a library music video using its identifier.
    *
    * @param id A library music video identifier.
    * @param parameters A query parameters object that is serialized and passed
    * directly to the Cloud Library API.
    * https://developer.apple.com/documentation/musickitjs/musickit/library/3001497-musicvideo
    */
  def musicVideo(id: String): js.Promise[MusicVideos] = js.native
  def musicVideo(id: String, parameters: QueryParameters): js.Promise[MusicVideos] = js.native
  
  /**
    * Fetch one or more library music videos using their identifiers.
    *
    * @param ids An array of library music video identifiers.
    * @param parameters A query parameters object that is serialized and passed
    * directly to the Cloud Library API.
    * https://developer.apple.com/documentation/musickitjs/musickit/library/3001498-musicvideos
    */
  def musicVideos(): js.Promise[js.Array[MusicVideos]] = js.native
  def musicVideos(ids: js.Array[String]): js.Promise[js.Array[MusicVideos]] = js.native
  def musicVideos(ids: js.Array[String], parameters: QueryParameters): js.Promise[js.Array[MusicVideos]] = js.native
  def musicVideos(ids: Null, parameters: QueryParameters): js.Promise[js.Array[MusicVideos]] = js.native
  
  /**
    * Fetch a library playlist using its identifier.
    *
    * @param id A library playlist identifier.
    * @param parameters A query parameters object that is serialized and passed
    * directly to the Cloud Library API.
    * https://developer.apple.com/documentation/musickitjs/musickit/library/3001499-playlist
    */
  def playlist(id: String): js.Promise[Playlists] = js.native
  def playlist(id: String, parameters: QueryParameters): js.Promise[Playlists] = js.native
  
  /**
    * Fetch one or more library playlists using their identifiers.
    *
    * @param ids An array of library playlist identifiers.
    * @param parameters A query parameters object that is serialized and passed
    * directly to the Cloud Library API.
    * https://developer.apple.com/documentation/musickitjs/musickit/library/3001500-playlists
    */
  def playlists(): js.Promise[js.Array[Playlists]] = js.native
  def playlists(ids: js.Array[String]): js.Promise[js.Array[Playlists]] = js.native
  def playlists(ids: js.Array[String], parameters: QueryParameters): js.Promise[js.Array[Playlists]] = js.native
  def playlists(ids: Null, parameters: QueryParameters): js.Promise[js.Array[Playlists]] = js.native
  
  /**
    * Search the library using a query.
    *
    * @param term The term to search.
    * @param parameters A query parameters object that is serialized and passed
    * directly to the Cloud Library API.
    * https://developer.apple.com/documentation/musickitjs/musickit/library/3002049-search
    */
  def search(term: String): js.Promise[js.Array[Resource]] = js.native
  def search(term: String, parameters: QueryParameters): js.Promise[js.Array[Resource]] = js.native
  
  /**
    * Fetch a library song using its identifier.
    *
    * @param id A library song identifier.
    * @param parameters A query parameters object that is serialized and passed
    * directly to the Cloud Library API.
    * https://developer.apple.com/documentation/musickitjs/musickit/library/3001501-song
    */
  def song(id: String): js.Promise[Songs] = js.native
  def song(id: String, parameters: QueryParameters): js.Promise[Songs] = js.native
  
  /**
    * Fetch one or more library songs using their identifiers.
    *
    * @param ids An array of library song identifiers.
    * @param parameters A query parameters object that is serialized and passed
    * directly to the Cloud Library API.
    * https://developer.apple.com/documentation/musickitjs/musickit/library/3001502-songs
    */
  def songs(): js.Promise[js.Array[Songs]] = js.native
  def songs(ids: js.Array[String]): js.Promise[js.Array[Songs]] = js.native
  def songs(ids: js.Array[String], parameters: QueryParameters): js.Promise[js.Array[Songs]] = js.native
  def songs(ids: Null, parameters: QueryParameters): js.Promise[js.Array[Songs]] = js.native
}
