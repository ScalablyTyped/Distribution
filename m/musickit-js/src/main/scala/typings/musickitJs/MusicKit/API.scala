package typings.musickitJs.MusicKit

import typings.musickitJs.anon.Data
import typings.musickitJs.anon.Terms
import typings.musickitJs.anon.keyinMusicCatalogChartReq
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class represents the Apple Music API.
  */
@js.native
trait API extends StObject {
  
  /**
    * Fetch one or more activities using their identifiers.
    *
    * @param ids An array of activity identifiers.
    * @param parameters A query parameters object that is serialized and passed
    * directly to the Apple Music API.
    */
  def activities(ids: js.Array[String]): js.Promise[js.Array[Activities]] = js.native
  def activities(ids: js.Array[String], parameters: QueryParameters): js.Promise[js.Array[Activities]] = js.native
  
  /**
    * Fetch an activity using its identifier.
    *
    * @param id An activity identifier.
    * @param parameters A query params object that is serialized and passed
    * directly to the Apple Music API.
    */
  def activity(id: String): js.Promise[Activities] = js.native
  def activity(id: String, parameters: QueryParameters): js.Promise[Activities] = js.native
  
  /**
    * Add a catalog resource to a user's library.
    */
  def addToLibrary(): js.Promise[Unit] = js.native
  def addToLibrary(parameters: Any): js.Promise[Unit] = js.native
  
  /**
    * Fetch an album using its identifier.
    *
    * @param id An album identifier.
    * @param parameters A query parameters object that is serialized and passed
    * directly to the Apple Music API.
    */
  def album(id: String): js.Promise[Albums] = js.native
  def album(id: String, parameters: QueryParameters): js.Promise[Albums] = js.native
  
  /**
    * Fetch one or more albums using their identifiers.
    *
    * @param ids An array of album identifiers.
    * @param parameters A query parameters object that is serialized and passed
    * directly to the Apple Music API.
    */
  def albums(ids: js.Array[String]): js.Promise[js.Array[Albums]] = js.native
  def albums(ids: js.Array[String], parameters: QueryParameters): js.Promise[js.Array[Albums]] = js.native
  
  /**
    * Fetch an Apple curator using its identifier.
    *
    * @param id An Apple curator identifier.
    * @param parameters A query parameters object that is serialized and passed
    * directly to the Apple Music API.
    */
  def appleCurator(id: String): js.Promise[Curators] = js.native
  def appleCurator(id: String, parameters: QueryParameters): js.Promise[Curators] = js.native
  
  /**
    * Fetch one or more Apple curators using their identifiers.
    *
    * @param ids An array of Apple curator identifiers.
    * @param parameters A query parameters object that is serialized and passed
    * directly to the Apple Music API.
    */
  def appleCurators(ids: js.Array[String]): js.Promise[js.Array[AppleCurators]] = js.native
  def appleCurators(ids: js.Array[String], parameters: QueryParameters): js.Promise[js.Array[AppleCurators]] = js.native
  
  /**
    * Fetch an artist using its identifier.
    *
    * @param id An artist identifier.
    * @param parameters A query parameters object that is serialized and passed
    * directly to the Apple Music API.
    */
  def artist(id: String): js.Promise[Artists] = js.native
  def artist(id: String, parameters: QueryParameters): js.Promise[Artists] = js.native
  
  /**
    * Fetch one or more artists using their identifiers.
    *
    * @param ids An array of artist identifiers.
    * @param parameters A query parameters object that is serialized and passed
    * directly to the Apple Music API.
    */
  def artists(ids: js.Array[String]): js.Promise[js.Array[Artists]] = js.native
  def artists(ids: js.Array[String], parameters: QueryParameters): js.Promise[js.Array[Artists]] = js.native
  
  /**
    * Fetch one or more charts.
    *
    * @param types An array of chart types.
    * @param parameters A query parameters object that is serialized and passed
    * directly to the Apple Music API.
    * https://developer.apple.com/documentation/applemusicapi/chartresponse
    */
  def charts(types: js.Array[MusicCatalogChartRequestable]): js.Promise[keyinMusicCatalogChartReq] = js.native
  def charts(types: js.Array[MusicCatalogChartRequestable], parameters: QueryParameters): js.Promise[keyinMusicCatalogChartReq] = js.native
  
  /**
    * Fetch a curator using its identifier.
    *
    * @param id A curator identifier.
    * @param parameters A query parameters object that is serialized and passed
    * directly to the Apple Music API.
    */
  def curator(id: String): js.Promise[Curators] = js.native
  def curator(id: String, parameters: QueryParameters): js.Promise[Curators] = js.native
  
  /**
    * Fetch one or more curators using their identifiers.
    *
    * @param ids An array of curator identifiers.
    * @param parameters A query parameters object that is serialized and passed
    * directly to the Apple Music API.
    */
  def curators(ids: js.Array[String]): js.Promise[js.Array[Curators]] = js.native
  def curators(ids: js.Array[String], parameters: QueryParameters): js.Promise[js.Array[Curators]] = js.native
  
  /**
    * Fetch a genre using its identifier.
    *
    * @param id An array of
    * @param parameters A query parameters object that is serialized and passed
    * directly to the Apple Music API.
    */
  def genre(id: String): js.Promise[Genres] = js.native
  def genre(id: String, parameters: QueryParameters): js.Promise[Genres] = js.native
  
  /**
    * Fetch one or more genres using their identifiers.
    *
    * @param ids An array of genre identifiers.
    * @param parameters A query parameters object that is serialized and passed
    * directly to the Apple Music API.
    */
  def genres(ids: js.Array[String]): js.Promise[js.Array[Genres]] = js.native
  def genres(ids: js.Array[String], parameters: QueryParameters): js.Promise[js.Array[Genres]] = js.native
  
  /**
    * Fetch the resources in heavy rotation for the user.
    *
    * @param parameters A query parameters object that is serialized and passed
    * directly to the Apple Music API.
    * https://developer.apple.com/documentation/applemusicapi/paginatedresourcecollectionresponse
    */
  def historyHeavyRotation(): js.Promise[Data] = js.native
  def historyHeavyRotation(parameters: QueryParameters): js.Promise[Data] = js.native
  
  /**
    * An instance of the Cloud library.
    */
  var library: Library = js.native
  
  /**
    * Fetch a music video using its identifier.
    *
    * @param id An array of video identifier.
    * @param parameters A query parameters object that is serialized and passed
    * directly to the Apple Music API.
    */
  def musicVideo(id: String): js.Promise[MusicVideos] = js.native
  def musicVideo(id: String, parameters: QueryParameters): js.Promise[MusicVideos] = js.native
  
  /**
    * Fetch one or more music videos using their identifiers.
    *
    * @param ids An array of music video identifiers.
    * @param parameters A query parameters object that is serialized and passed
    * directly to the Apple Music API.
    */
  def musicVideos(ids: js.Array[String]): js.Promise[js.Array[MusicVideos]] = js.native
  def musicVideos(ids: js.Array[String], parameters: QueryParameters): js.Promise[js.Array[MusicVideos]] = js.native
  
  /**
    * Fetch a playlist using its identifier.
    *
    * @param id A playlist identifier.
    * @param parameters A query parameters object that is serialized and passed
    * directly to the Apple Music API.
    */
  def playlist(id: String): js.Promise[Playlists] = js.native
  def playlist(id: String, parameters: QueryParameters): js.Promise[Playlists] = js.native
  
  /**
    * Fetch one or more playlists using their identifiers.
    *
    * @param ids An array of playlist identifiers.
    * @param parameters A query parameters object that is serialized and passed
    * directly to the Apple Music API.
    */
  def playlists(ids: js.Array[String]): js.Promise[js.Array[Playlists]] = js.native
  def playlists(ids: js.Array[String], parameters: QueryParameters): js.Promise[js.Array[Playlists]] = js.native
  
  /**
    * Fetch the recently played resources for the user.
    *
    * @param parameters A query parameters object that is serialized and passed
    * directly to the Apple Music API.
    */
  def recentPlayed(): js.Promise[js.Array[Resource]] = js.native
  def recentPlayed(parameters: QueryParameters): js.Promise[js.Array[Resource]] = js.native
  
  /**
    * Fetch a recommendation using its identifier.
    *
    * @param id A recommendation identifier.
    * @param parameters A query parameters object that is serialized and passed
    * directly to the Apple Music API.
    */
  def recommendation(id: String): js.Promise[PersonalRecommendation] = js.native
  def recommendation(id: String, parameters: QueryParameters): js.Promise[PersonalRecommendation] = js.native
  
  /**
    * Fetch one or more recommendations using their identifiers.
    *
    * @param ids An array of recommendation identifiers.
    * @param parameters A query parameters object that is serialized and passed
    * directly to the Apple Music API.
    */
  def recommendations(ids: js.Array[String]): js.Promise[js.Array[PersonalRecommendation]] = js.native
  def recommendations(ids: js.Array[String], parameters: QueryParameters): js.Promise[js.Array[PersonalRecommendation]] = js.native
  
  /**
    * Search the catalog using a query.
    *
    * @param term The term to search.
    * @param parameters A query parameters object that is serialized and passed
    * directly to the Apple Music API.
    * https://developer.apple.com/documentation/applemusicapi/searchresponse
    */
  def search(term: String): js.Promise[typings.musickitJs.anon.Activities] = js.native
  def search(term: String, parameters: QueryParameters): js.Promise[typings.musickitJs.anon.Activities] = js.native
  
  /**
    * Fetch the search term results for a hint.
    *
    * @param term The term to search.
    * @param parameters A query parameters object that is serialized and passed
    * directly to the Apple Music API.
    * https://developer.apple.com/documentation/applemusicapi/searchhintsresponse
    */
  def searchHints(term: String): js.Promise[Terms] = js.native
  def searchHints(term: String, parameters: QueryParameters): js.Promise[Terms] = js.native
  
  /**
    * Fetch a song using its identifier.
    *
    * @param ids An array of identifier.
    * @param parameters A query parameters object that is serialized and passed
    * directly to the Apple Music API.
    */
  def song(id: String): js.Promise[Songs] = js.native
  def song(id: String, parameters: QueryParameters): js.Promise[Songs] = js.native
  
  /**
    * Fetch one or more songs using their identifiers.
    *
    * @param ids An array of song identifiers.
    * @param parameters A query parameters object that is serialized and passed
    * directly to the Apple Music API.
    */
  def songs(ids: js.Array[String]): js.Promise[js.Array[Songs]] = js.native
  def songs(ids: js.Array[String], parameters: QueryParameters): js.Promise[js.Array[Songs]] = js.native
  
  /**
    * Fetch a station using its identifier.
    *
    * @param id A station identifier.
    * @param parameters A query parameters object that is serialized and passed
    * directly to the Apple Music API.
    */
  def station(id: String): js.Promise[Stations] = js.native
  def station(id: String, parameters: QueryParameters): js.Promise[Stations] = js.native
  
  /**
    * Fetch one or more stations using their identifiers.
    *
    * @param ids An array of station identifiers.
    * @param parameters A query parameters object that is serialized and passed
    * directly to the Apple Music API.
    */
  def stations(ids: js.Array[String]): js.Promise[js.Array[Stations]] = js.native
  def stations(ids: js.Array[String], parameters: QueryParameters): js.Promise[js.Array[Stations]] = js.native
  
  /**
    * Fetch a storefront using its identifier.
    *
    * @param id A storefront identifier.
    * @param parameters A query parameters object that is serialized and passed
    * directly to the Apple Music API.
    */
  def storefront(id: String): js.Promise[Storefronts] = js.native
  def storefront(id: String, parameters: QueryParameters): js.Promise[Storefronts] = js.native
  
  /**
    * The storefront used for making calls to the API.
    */
  var storefrontId: String = js.native
  
  /**
    * Fetch one or more storefronts using their identifiers.
    *
    * @param ids An array of storefront identifiers.
    * @param parameters A query parameters object that is serialized and passed
    * directly to the Apple Music API.
    */
  def storefronts(ids: js.Array[String]): js.Promise[js.Array[Storefronts]] = js.native
  def storefronts(ids: js.Array[String], parameters: QueryParameters): js.Promise[js.Array[Storefronts]] = js.native
}
