package typings.maximMazurokGapiClientGamesconfiguration

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientGamesconfiguration.anon.Accesstoken
import typings.maximMazurokGapiClientGamesconfiguration.anon.AchievementId
import typings.maximMazurokGapiClientGamesconfiguration.anon.Alt
import typings.maximMazurokGapiClientGamesconfiguration.anon.ApplicationId
import typings.maximMazurokGapiClientGamesconfiguration.anon.Callback
import typings.maximMazurokGapiClientGamesconfiguration.anon.Fields
import typings.maximMazurokGapiClientGamesconfiguration.anon.Key
import typings.maximMazurokGapiClientGamesconfiguration.anon.LeaderboardId
import typings.maximMazurokGapiClientGamesconfiguration.anon.Oauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object client {
    
    object gamesconfiguration {
      
      trait AchievementConfiguration extends StObject {
        
        /** The type of the achievement. */
        var achievementType: js.UndefOr[String] = js.undefined
        
        /** The draft data of the achievement. */
        var draft: js.UndefOr[AchievementConfigurationDetail] = js.undefined
        
        /** The ID of the achievement. */
        var id: js.UndefOr[String] = js.undefined
        
        /** The initial state of the achievement. */
        var initialState: js.UndefOr[String] = js.undefined
        
        /** Uniquely identifies the type of this resource. Value is always the fixed string `gamesConfiguration#achievementConfiguration`. */
        var kind: js.UndefOr[String] = js.undefined
        
        /** The read-only published data of the achievement. */
        var published: js.UndefOr[AchievementConfigurationDetail] = js.undefined
        
        /** Steps to unlock. Only applicable to incremental achievements. */
        var stepsToUnlock: js.UndefOr[Double] = js.undefined
        
        /** The token for this resource. */
        var token: js.UndefOr[String] = js.undefined
      }
      object AchievementConfiguration {
        
        inline def apply(): AchievementConfiguration = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[AchievementConfiguration]
        }
        
        extension [Self <: AchievementConfiguration](x: Self) {
          
          inline def setAchievementType(value: String): Self = StObject.set(x, "achievementType", value.asInstanceOf[js.Any])
          
          inline def setAchievementTypeUndefined: Self = StObject.set(x, "achievementType", js.undefined)
          
          inline def setDraft(value: AchievementConfigurationDetail): Self = StObject.set(x, "draft", value.asInstanceOf[js.Any])
          
          inline def setDraftUndefined: Self = StObject.set(x, "draft", js.undefined)
          
          inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
          
          inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
          
          inline def setInitialState(value: String): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
          
          inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
          
          inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
          
          inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
          
          inline def setPublished(value: AchievementConfigurationDetail): Self = StObject.set(x, "published", value.asInstanceOf[js.Any])
          
          inline def setPublishedUndefined: Self = StObject.set(x, "published", js.undefined)
          
          inline def setStepsToUnlock(value: Double): Self = StObject.set(x, "stepsToUnlock", value.asInstanceOf[js.Any])
          
          inline def setStepsToUnlockUndefined: Self = StObject.set(x, "stepsToUnlock", js.undefined)
          
          inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
          
          inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
        }
      }
      
      trait AchievementConfigurationDetail extends StObject {
        
        /** Localized strings for the achievement description. */
        var description: js.UndefOr[LocalizedStringBundle] = js.undefined
        
        /** The icon url of this achievement. Writes to this field are ignored. */
        var iconUrl: js.UndefOr[String] = js.undefined
        
        /** Uniquely identifies the type of this resource. Value is always the fixed string `gamesConfiguration#achievementConfigurationDetail`. */
        var kind: js.UndefOr[String] = js.undefined
        
        /** Localized strings for the achievement name. */
        var name: js.UndefOr[LocalizedStringBundle] = js.undefined
        
        /** Point value for the achievement. */
        var pointValue: js.UndefOr[Double] = js.undefined
        
        /** The sort rank of this achievement. Writes to this field are ignored. */
        var sortRank: js.UndefOr[Double] = js.undefined
      }
      object AchievementConfigurationDetail {
        
        inline def apply(): AchievementConfigurationDetail = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[AchievementConfigurationDetail]
        }
        
        extension [Self <: AchievementConfigurationDetail](x: Self) {
          
          inline def setDescription(value: LocalizedStringBundle): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
          
          inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
          
          inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
          
          inline def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
          
          inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
          
          inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
          
          inline def setName(value: LocalizedStringBundle): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          
          inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
          
          inline def setPointValue(value: Double): Self = StObject.set(x, "pointValue", value.asInstanceOf[js.Any])
          
          inline def setPointValueUndefined: Self = StObject.set(x, "pointValue", js.undefined)
          
          inline def setSortRank(value: Double): Self = StObject.set(x, "sortRank", value.asInstanceOf[js.Any])
          
          inline def setSortRankUndefined: Self = StObject.set(x, "sortRank", js.undefined)
        }
      }
      
      trait AchievementConfigurationListResponse extends StObject {
        
        /** The achievement configurations. */
        var items: js.UndefOr[js.Array[AchievementConfiguration]] = js.undefined
        
        /** Uniquely identifies the type of this resource. Value is always the fixed string `gamesConfiguration#achievementConfigurationListResponse`. */
        var kind: js.UndefOr[String] = js.undefined
        
        /** The pagination token for the next page of results. */
        var nextPageToken: js.UndefOr[String] = js.undefined
      }
      object AchievementConfigurationListResponse {
        
        inline def apply(): AchievementConfigurationListResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[AchievementConfigurationListResponse]
        }
        
        extension [Self <: AchievementConfigurationListResponse](x: Self) {
          
          inline def setItems(value: js.Array[AchievementConfiguration]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
          
          inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
          
          inline def setItemsVarargs(value: AchievementConfiguration*): Self = StObject.set(x, "items", js.Array(value*))
          
          inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
          
          inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
          
          inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
          
          inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        }
      }
      
      @js.native
      trait AchievementConfigurationsResource extends StObject {
        
        /** Delete the achievement configuration with the given ID. */
        def delete(): Request[Unit] = js.native
        def delete(request: Accesstoken): Request[Unit] = js.native
        
        /** Retrieves the metadata of the achievement configuration with the given ID. */
        def get(): Request[AchievementConfiguration] = js.native
        def get(request: Accesstoken): Request[AchievementConfiguration] = js.native
        
        /** Insert a new achievement configuration in this application. */
        def insert(request: Alt): Request[AchievementConfiguration] = js.native
        def insert(request: ApplicationId, body: AchievementConfiguration): Request[AchievementConfiguration] = js.native
        
        /** Returns a list of the achievement configurations in this application. */
        def list(): Request[AchievementConfigurationListResponse] = js.native
        def list(request: Callback): Request[AchievementConfigurationListResponse] = js.native
        
        def update(request: Accesstoken, body: AchievementConfiguration): Request[AchievementConfiguration] = js.native
        /** Update the metadata of the achievement configuration with the given ID. */
        def update(request: AchievementId): Request[AchievementConfiguration] = js.native
      }
      
      trait GamesNumberAffixConfiguration extends StObject {
        
        /** When the language requires special treatment of "small" numbers (as with 2, 3, and 4 in Czech; or numbers ending 2, 3, or 4 but not 12, 13, or 14 in Polish). */
        var few: js.UndefOr[LocalizedStringBundle] = js.undefined
        
        /** When the language requires special treatment of "large" numbers (as with numbers ending 11-99 in Maltese). */
        var many: js.UndefOr[LocalizedStringBundle] = js.undefined
        
        /**
          * When the language requires special treatment of numbers like one (as with the number 1 in English and most other languages; in Russian, any number ending in 1 but not ending in 11
          * is in this class).
          */
        var one: js.UndefOr[LocalizedStringBundle] = js.undefined
        
        /** When the language does not require special treatment of the given quantity (as with all numbers in Chinese, or 42 in English). */
        var other: js.UndefOr[LocalizedStringBundle] = js.undefined
        
        /** When the language requires special treatment of numbers like two (as with 2 in Welsh, or 102 in Slovenian). */
        var two: js.UndefOr[LocalizedStringBundle] = js.undefined
        
        /** When the language requires special treatment of the number 0 (as in Arabic). */
        var zero: js.UndefOr[LocalizedStringBundle] = js.undefined
      }
      object GamesNumberAffixConfiguration {
        
        inline def apply(): GamesNumberAffixConfiguration = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GamesNumberAffixConfiguration]
        }
        
        extension [Self <: GamesNumberAffixConfiguration](x: Self) {
          
          inline def setFew(value: LocalizedStringBundle): Self = StObject.set(x, "few", value.asInstanceOf[js.Any])
          
          inline def setFewUndefined: Self = StObject.set(x, "few", js.undefined)
          
          inline def setMany(value: LocalizedStringBundle): Self = StObject.set(x, "many", value.asInstanceOf[js.Any])
          
          inline def setManyUndefined: Self = StObject.set(x, "many", js.undefined)
          
          inline def setOne(value: LocalizedStringBundle): Self = StObject.set(x, "one", value.asInstanceOf[js.Any])
          
          inline def setOneUndefined: Self = StObject.set(x, "one", js.undefined)
          
          inline def setOther(value: LocalizedStringBundle): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
          
          inline def setOtherUndefined: Self = StObject.set(x, "other", js.undefined)
          
          inline def setTwo(value: LocalizedStringBundle): Self = StObject.set(x, "two", value.asInstanceOf[js.Any])
          
          inline def setTwoUndefined: Self = StObject.set(x, "two", js.undefined)
          
          inline def setZero(value: LocalizedStringBundle): Self = StObject.set(x, "zero", value.asInstanceOf[js.Any])
          
          inline def setZeroUndefined: Self = StObject.set(x, "zero", js.undefined)
        }
      }
      
      trait GamesNumberFormatConfiguration extends StObject {
        
        /** The curreny code string. Only used for CURRENCY format type. */
        var currencyCode: js.UndefOr[String] = js.undefined
        
        /** The number of decimal places for number. Only used for NUMERIC format type. */
        var numDecimalPlaces: js.UndefOr[Double] = js.undefined
        
        /** The formatting for the number. */
        var numberFormatType: js.UndefOr[String] = js.undefined
        
        /** An optional suffix for the NUMERIC format type. These strings follow the same plural rules as all Android string resources. */
        var suffix: js.UndefOr[GamesNumberAffixConfiguration] = js.undefined
      }
      object GamesNumberFormatConfiguration {
        
        inline def apply(): GamesNumberFormatConfiguration = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GamesNumberFormatConfiguration]
        }
        
        extension [Self <: GamesNumberFormatConfiguration](x: Self) {
          
          inline def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
          
          inline def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
          
          inline def setNumDecimalPlaces(value: Double): Self = StObject.set(x, "numDecimalPlaces", value.asInstanceOf[js.Any])
          
          inline def setNumDecimalPlacesUndefined: Self = StObject.set(x, "numDecimalPlaces", js.undefined)
          
          inline def setNumberFormatType(value: String): Self = StObject.set(x, "numberFormatType", value.asInstanceOf[js.Any])
          
          inline def setNumberFormatTypeUndefined: Self = StObject.set(x, "numberFormatType", js.undefined)
          
          inline def setSuffix(value: GamesNumberAffixConfiguration): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
          
          inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
        }
      }
      
      trait ImageConfiguration extends StObject {
        
        /** The image type for the image. */
        var imageType: js.UndefOr[String] = js.undefined
        
        /** Uniquely identifies the type of this resource. Value is always the fixed string `gamesConfiguration#imageConfiguration`. */
        var kind: js.UndefOr[String] = js.undefined
        
        /** The resource ID of resource which the image belongs to. */
        var resourceId: js.UndefOr[String] = js.undefined
        
        /** The url for this image. */
        var url: js.UndefOr[String] = js.undefined
      }
      object ImageConfiguration {
        
        inline def apply(): ImageConfiguration = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[ImageConfiguration]
        }
        
        extension [Self <: ImageConfiguration](x: Self) {
          
          inline def setImageType(value: String): Self = StObject.set(x, "imageType", value.asInstanceOf[js.Any])
          
          inline def setImageTypeUndefined: Self = StObject.set(x, "imageType", js.undefined)
          
          inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
          
          inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
          
          inline def setResourceId(value: String): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
          
          inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
          
          inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
          
          inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
        }
      }
      
      @js.native
      trait ImageConfigurationsResource extends StObject {
        
        /** Uploads an image for a resource with the given ID and image type. */
        def upload(): Request[ImageConfiguration] = js.native
        def upload(request: Fields): Request[ImageConfiguration] = js.native
      }
      
      trait LeaderboardConfiguration extends StObject {
        
        /** The draft data of the leaderboard. */
        var draft: js.UndefOr[LeaderboardConfigurationDetail] = js.undefined
        
        /** The ID of the leaderboard. */
        var id: js.UndefOr[String] = js.undefined
        
        /** Uniquely identifies the type of this resource. Value is always the fixed string `gamesConfiguration#leaderboardConfiguration`. */
        var kind: js.UndefOr[String] = js.undefined
        
        /** The read-only published data of the leaderboard. */
        var published: js.UndefOr[LeaderboardConfigurationDetail] = js.undefined
        
        /** Maximum score that can be posted to this leaderboard. */
        var scoreMax: js.UndefOr[String] = js.undefined
        
        /** Minimum score that can be posted to this leaderboard. */
        var scoreMin: js.UndefOr[String] = js.undefined
        
        var scoreOrder: js.UndefOr[String] = js.undefined
        
        /** The token for this resource. */
        var token: js.UndefOr[String] = js.undefined
      }
      object LeaderboardConfiguration {
        
        inline def apply(): LeaderboardConfiguration = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[LeaderboardConfiguration]
        }
        
        extension [Self <: LeaderboardConfiguration](x: Self) {
          
          inline def setDraft(value: LeaderboardConfigurationDetail): Self = StObject.set(x, "draft", value.asInstanceOf[js.Any])
          
          inline def setDraftUndefined: Self = StObject.set(x, "draft", js.undefined)
          
          inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
          
          inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
          
          inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
          
          inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
          
          inline def setPublished(value: LeaderboardConfigurationDetail): Self = StObject.set(x, "published", value.asInstanceOf[js.Any])
          
          inline def setPublishedUndefined: Self = StObject.set(x, "published", js.undefined)
          
          inline def setScoreMax(value: String): Self = StObject.set(x, "scoreMax", value.asInstanceOf[js.Any])
          
          inline def setScoreMaxUndefined: Self = StObject.set(x, "scoreMax", js.undefined)
          
          inline def setScoreMin(value: String): Self = StObject.set(x, "scoreMin", value.asInstanceOf[js.Any])
          
          inline def setScoreMinUndefined: Self = StObject.set(x, "scoreMin", js.undefined)
          
          inline def setScoreOrder(value: String): Self = StObject.set(x, "scoreOrder", value.asInstanceOf[js.Any])
          
          inline def setScoreOrderUndefined: Self = StObject.set(x, "scoreOrder", js.undefined)
          
          inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
          
          inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
        }
      }
      
      trait LeaderboardConfigurationDetail extends StObject {
        
        /** The icon url of this leaderboard. Writes to this field are ignored. */
        var iconUrl: js.UndefOr[String] = js.undefined
        
        /** Uniquely identifies the type of this resource. Value is always the fixed string `gamesConfiguration#leaderboardConfigurationDetail`. */
        var kind: js.UndefOr[String] = js.undefined
        
        /** Localized strings for the leaderboard name. */
        var name: js.UndefOr[LocalizedStringBundle] = js.undefined
        
        /** The score formatting for the leaderboard. */
        var scoreFormat: js.UndefOr[GamesNumberFormatConfiguration] = js.undefined
        
        /** The sort rank of this leaderboard. Writes to this field are ignored. */
        var sortRank: js.UndefOr[Double] = js.undefined
      }
      object LeaderboardConfigurationDetail {
        
        inline def apply(): LeaderboardConfigurationDetail = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[LeaderboardConfigurationDetail]
        }
        
        extension [Self <: LeaderboardConfigurationDetail](x: Self) {
          
          inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
          
          inline def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
          
          inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
          
          inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
          
          inline def setName(value: LocalizedStringBundle): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          
          inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
          
          inline def setScoreFormat(value: GamesNumberFormatConfiguration): Self = StObject.set(x, "scoreFormat", value.asInstanceOf[js.Any])
          
          inline def setScoreFormatUndefined: Self = StObject.set(x, "scoreFormat", js.undefined)
          
          inline def setSortRank(value: Double): Self = StObject.set(x, "sortRank", value.asInstanceOf[js.Any])
          
          inline def setSortRankUndefined: Self = StObject.set(x, "sortRank", js.undefined)
        }
      }
      
      trait LeaderboardConfigurationListResponse extends StObject {
        
        /** The leaderboard configurations. */
        var items: js.UndefOr[js.Array[LeaderboardConfiguration]] = js.undefined
        
        /** Uniquely identifies the type of this resource. Value is always the fixed string `gamesConfiguration#leaderboardConfigurationListResponse`. */
        var kind: js.UndefOr[String] = js.undefined
        
        /** The pagination token for the next page of results. */
        var nextPageToken: js.UndefOr[String] = js.undefined
      }
      object LeaderboardConfigurationListResponse {
        
        inline def apply(): LeaderboardConfigurationListResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[LeaderboardConfigurationListResponse]
        }
        
        extension [Self <: LeaderboardConfigurationListResponse](x: Self) {
          
          inline def setItems(value: js.Array[LeaderboardConfiguration]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
          
          inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
          
          inline def setItemsVarargs(value: LeaderboardConfiguration*): Self = StObject.set(x, "items", js.Array(value*))
          
          inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
          
          inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
          
          inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
          
          inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        }
      }
      
      @js.native
      trait LeaderboardConfigurationsResource extends StObject {
        
        /** Delete the leaderboard configuration with the given ID. */
        def delete(): Request[Unit] = js.native
        def delete(request: Key): Request[Unit] = js.native
        
        /** Retrieves the metadata of the leaderboard configuration with the given ID. */
        def get(): Request[LeaderboardConfiguration] = js.native
        def get(request: Key): Request[LeaderboardConfiguration] = js.native
        
        def insert(request: ApplicationId, body: LeaderboardConfiguration): Request[LeaderboardConfiguration] = js.native
        /** Insert a new leaderboard configuration in this application. */
        def insert(request: Oauthtoken): Request[LeaderboardConfiguration] = js.native
        
        /** Returns a list of the leaderboard configurations in this application. */
        def list(): Request[LeaderboardConfigurationListResponse] = js.native
        def list(request: Callback): Request[LeaderboardConfigurationListResponse] = js.native
        
        def update(request: Key, body: LeaderboardConfiguration): Request[LeaderboardConfiguration] = js.native
        /** Update the metadata of the leaderboard configuration with the given ID. */
        def update(request: LeaderboardId): Request[LeaderboardConfiguration] = js.native
      }
      
      trait LocalizedString extends StObject {
        
        /** Uniquely identifies the type of this resource. Value is always the fixed string `gamesConfiguration#localizedString`. */
        var kind: js.UndefOr[String] = js.undefined
        
        /** The locale string. */
        var locale: js.UndefOr[String] = js.undefined
        
        /** The string value. */
        var value: js.UndefOr[String] = js.undefined
      }
      object LocalizedString {
        
        inline def apply(): LocalizedString = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[LocalizedString]
        }
        
        extension [Self <: LocalizedString](x: Self) {
          
          inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
          
          inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
          
          inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
          
          inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
          
          inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
          
          inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
        }
      }
      
      trait LocalizedStringBundle extends StObject {
        
        /** Uniquely identifies the type of this resource. Value is always the fixed string `gamesConfiguration#localizedStringBundle`. */
        var kind: js.UndefOr[String] = js.undefined
        
        /** The locale strings. */
        var translations: js.UndefOr[js.Array[LocalizedString]] = js.undefined
      }
      object LocalizedStringBundle {
        
        inline def apply(): LocalizedStringBundle = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[LocalizedStringBundle]
        }
        
        extension [Self <: LocalizedStringBundle](x: Self) {
          
          inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
          
          inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
          
          inline def setTranslations(value: js.Array[LocalizedString]): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
          
          inline def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
          
          inline def setTranslationsVarargs(value: LocalizedString*): Self = StObject.set(x, "translations", js.Array(value*))
        }
      }
    }
  }
}
