package typings.nodeGeocoder

import typings.nodeGeocoder.anon.Confidence
import typings.nodeGeocoder.anon.Level1long
import typings.nodeGeocoder.nodeGeocoderStrings.agol
import typings.nodeGeocoder.nodeGeocoderStrings.google
import typings.nodeGeocoder.nodeGeocoderStrings.here
import typings.nodeGeocoder.nodeGeocoderStrings.http
import typings.nodeGeocoder.nodeGeocoderStrings.https
import typings.nodeGeocoder.nodeGeocoderStrings.opendatafrance
import typings.nodeGeocoder.nodeGeocoderStrings.openstreetmap
import typings.nodeGeocoder.nodeGeocoderStrings.request
import typings.nodeGeocoder.nodeGeocoderStrings.smartyStreet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: Options): Geocoder = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Geocoder]
  
  @JSImport("node-geocoder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("node-geocoder", "Geocoder")
  @js.native
  open class Geocoder () extends StObject {
    
    def batchGeocode(queries: js.Array[Query | String]): js.Promise[js.Array[BatchResult]] = js.native
    def batchGeocode(
      queries: js.Array[Query | String],
      cb: js.Function2[/* err */ Any, /* data */ js.Array[BatchResult], Unit]
    ): js.Promise[js.Array[BatchResult]] = js.native
    
    def geocode(query: String): js.Promise[js.Array[Entry]] = js.native
    def geocode(query: String, cb: js.Function2[/* err */ Any, /* data */ js.Array[Entry], Unit]): js.Promise[js.Array[Entry]] = js.native
    def geocode(query: Query): js.Promise[js.Array[Entry]] = js.native
    def geocode(query: Query, cb: js.Function2[/* err */ Any, /* data */ js.Array[Entry], Unit]): js.Promise[js.Array[Entry]] = js.native
    
    def reverse(loc: Location): js.Promise[js.Array[Entry]] = js.native
    def reverse(loc: Location, cb: js.Function2[/* err */ Any, /* data */ js.Array[Entry], Unit]): js.Promise[js.Array[Entry]] = js.native
  }
  
  trait AgolOptions extends StObject {
    
    var client_id: js.UndefOr[String] = js.undefined
    
    var client_secret: js.UndefOr[String] = js.undefined
    
    var provider: agol
  }
  object AgolOptions {
    
    inline def apply(): AgolOptions = {
      val __obj = js.Dynamic.literal(provider = "agol")
      __obj.asInstanceOf[AgolOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AgolOptions] (val x: Self) extends AnyVal {
      
      inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
      
      inline def setClient_idUndefined: Self = StObject.set(x, "client_id", js.undefined)
      
      inline def setClient_secret(value: String): Self = StObject.set(x, "client_secret", value.asInstanceOf[js.Any])
      
      inline def setClient_secretUndefined: Self = StObject.set(x, "client_secret", js.undefined)
      
      inline def setProvider(value: agol): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    }
  }
  
  trait BaseOptions extends StObject {
    
    var formatter: js.UndefOr[Any] = js.undefined
    
    var formatterPattern: js.UndefOr[String] = js.undefined
    
    var httpAdapter: js.UndefOr[https | http | request] = js.undefined
    
    var provider: String
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object BaseOptions {
    
    inline def apply(provider: String): BaseOptions = {
      val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseOptions] (val x: Self) extends AnyVal {
      
      inline def setFormatter(value: Any): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
      
      inline def setFormatterPattern(value: String): Self = StObject.set(x, "formatterPattern", value.asInstanceOf[js.Any])
      
      inline def setFormatterPatternUndefined: Self = StObject.set(x, "formatterPattern", js.undefined)
      
      inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      inline def setHttpAdapter(value: https | http | request): Self = StObject.set(x, "httpAdapter", value.asInstanceOf[js.Any])
      
      inline def setHttpAdapterUndefined: Self = StObject.set(x, "httpAdapter", js.undefined)
      
      inline def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait BatchResult extends StObject {
    
    var error: Any
    
    var value: js.Array[Entry]
  }
  object BatchResult {
    
    inline def apply(error: Any, value: js.Array[Entry]): BatchResult = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[BatchResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BatchResult] (val x: Self) extends AnyVal {
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.Array[Entry]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueVarargs(value: Entry*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
  
  trait Entry extends StObject {
    
    var administrativeLevels: js.UndefOr[Level1long] = js.undefined
    
    var building: js.UndefOr[String] = js.undefined
    
    var city: js.UndefOr[String] = js.undefined
    
    var country: js.UndefOr[String] = js.undefined
    
    var countryCode: js.UndefOr[String] = js.undefined
    
    var county: js.UndefOr[String] = js.undefined
    
    var district: js.UndefOr[String] = js.undefined
    
    var extra: js.UndefOr[Confidence] = js.undefined
    
    var formattedAddress: js.UndefOr[String] = js.undefined
    
    var latitude: js.UndefOr[Double] = js.undefined
    
    var longitude: js.UndefOr[Double] = js.undefined
    
    var provider: js.UndefOr[String] = js.undefined
    
    var state: js.UndefOr[String] = js.undefined
    
    var stateCode: js.UndefOr[String] = js.undefined
    
    var streetName: js.UndefOr[String] = js.undefined
    
    var streetNumber: js.UndefOr[String] = js.undefined
    
    var zipcode: js.UndefOr[String] = js.undefined
  }
  object Entry {
    
    inline def apply(): Entry = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Entry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Entry] (val x: Self) extends AnyVal {
      
      inline def setAdministrativeLevels(value: Level1long): Self = StObject.set(x, "administrativeLevels", value.asInstanceOf[js.Any])
      
      inline def setAdministrativeLevelsUndefined: Self = StObject.set(x, "administrativeLevels", js.undefined)
      
      inline def setBuilding(value: String): Self = StObject.set(x, "building", value.asInstanceOf[js.Any])
      
      inline def setBuildingUndefined: Self = StObject.set(x, "building", js.undefined)
      
      inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      inline def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
      
      inline def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
      
      inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      inline def setCounty(value: String): Self = StObject.set(x, "county", value.asInstanceOf[js.Any])
      
      inline def setCountyUndefined: Self = StObject.set(x, "county", js.undefined)
      
      inline def setDistrict(value: String): Self = StObject.set(x, "district", value.asInstanceOf[js.Any])
      
      inline def setDistrictUndefined: Self = StObject.set(x, "district", js.undefined)
      
      inline def setExtra(value: Confidence): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      inline def setFormattedAddress(value: String): Self = StObject.set(x, "formattedAddress", value.asInstanceOf[js.Any])
      
      inline def setFormattedAddressUndefined: Self = StObject.set(x, "formattedAddress", js.undefined)
      
      inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      inline def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
      
      inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
      
      inline def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
      
      inline def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateCode(value: String): Self = StObject.set(x, "stateCode", value.asInstanceOf[js.Any])
      
      inline def setStateCodeUndefined: Self = StObject.set(x, "stateCode", js.undefined)
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setStreetName(value: String): Self = StObject.set(x, "streetName", value.asInstanceOf[js.Any])
      
      inline def setStreetNameUndefined: Self = StObject.set(x, "streetName", js.undefined)
      
      inline def setStreetNumber(value: String): Self = StObject.set(x, "streetNumber", value.asInstanceOf[js.Any])
      
      inline def setStreetNumberUndefined: Self = StObject.set(x, "streetNumber", js.undefined)
      
      inline def setZipcode(value: String): Self = StObject.set(x, "zipcode", value.asInstanceOf[js.Any])
      
      inline def setZipcodeUndefined: Self = StObject.set(x, "zipcode", js.undefined)
    }
  }
  
  trait GenericOptions extends StObject {
    
    var apiKey: js.UndefOr[String] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var language: js.UndefOr[String] = js.undefined
    
    var provider: Providers
  }
  object GenericOptions {
    
    inline def apply(provider: Providers): GenericOptions = {
      val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenericOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GenericOptions] (val x: Self) extends AnyVal {
      
      inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      inline def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setProvider(value: Providers): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    }
  }
  
  trait GoogleOptions extends StObject {
    
    var apiKey: js.UndefOr[String] = js.undefined
    
    var channel: js.UndefOr[String] = js.undefined
    
    var clientId: js.UndefOr[String] = js.undefined
    
    var excludePartialMatches: js.UndefOr[Boolean] = js.undefined
    
    var language: js.UndefOr[String] = js.undefined
    
    var provider: google
    
    var region: js.UndefOr[String] = js.undefined
  }
  object GoogleOptions {
    
    inline def apply(): GoogleOptions = {
      val __obj = js.Dynamic.literal(provider = "google")
      __obj.asInstanceOf[GoogleOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GoogleOptions] (val x: Self) extends AnyVal {
      
      inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      inline def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
      
      inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
      
      inline def setExcludePartialMatches(value: Boolean): Self = StObject.set(x, "excludePartialMatches", value.asInstanceOf[js.Any])
      
      inline def setExcludePartialMatchesUndefined: Self = StObject.set(x, "excludePartialMatches", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setProvider(value: google): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    }
  }
  
  trait HereOptions extends StObject {
    
    var apiKey: String
    
    var appCode: js.UndefOr[String] = js.undefined
    
    var appId: String
    
    var country: js.UndefOr[String] = js.undefined
    
    var language: js.UndefOr[String] = js.undefined
    
    var politicalView: js.UndefOr[String] = js.undefined
    
    var production: js.UndefOr[Boolean] = js.undefined
    
    var provider: here
    
    var state: js.UndefOr[String] = js.undefined
  }
  object HereOptions {
    
    inline def apply(apiKey: String, appId: String): HereOptions = {
      val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], appId = appId.asInstanceOf[js.Any], provider = "here")
      __obj.asInstanceOf[HereOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HereOptions] (val x: Self) extends AnyVal {
      
      inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      inline def setAppCode(value: String): Self = StObject.set(x, "appCode", value.asInstanceOf[js.Any])
      
      inline def setAppCodeUndefined: Self = StObject.set(x, "appCode", js.undefined)
      
      inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setPoliticalView(value: String): Self = StObject.set(x, "politicalView", value.asInstanceOf[js.Any])
      
      inline def setPoliticalViewUndefined: Self = StObject.set(x, "politicalView", js.undefined)
      
      inline def setProduction(value: Boolean): Self = StObject.set(x, "production", value.asInstanceOf[js.Any])
      
      inline def setProductionUndefined: Self = StObject.set(x, "production", js.undefined)
      
      inline def setProvider(value: here): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  trait Location extends StObject {
    
    var lat: Double
    
    var lon: Double
  }
  object Location {
    
    inline def apply(lat: Double, lon: Double): Location = {
      val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lon = lon.asInstanceOf[js.Any])
      __obj.asInstanceOf[Location]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Location] (val x: Self) extends AnyVal {
      
      inline def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
      
      inline def setLon(value: Double): Self = StObject.set(x, "lon", value.asInstanceOf[js.Any])
    }
  }
  
  trait OpenDataFranceOptions extends StObject {
    
    var apiKey: js.UndefOr[String] = js.undefined
    
    var email: js.UndefOr[String] = js.undefined
    
    var language: js.UndefOr[String] = js.undefined
    
    var provider: opendatafrance
  }
  object OpenDataFranceOptions {
    
    inline def apply(): OpenDataFranceOptions = {
      val __obj = js.Dynamic.literal(provider = "opendatafrance")
      __obj.asInstanceOf[OpenDataFranceOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OpenDataFranceOptions] (val x: Self) extends AnyVal {
      
      inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      inline def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setProvider(value: opendatafrance): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    }
  }
  
  trait OpenStreetMapOptions extends StObject {
    
    var apiKey: js.UndefOr[String] = js.undefined
    
    var email: js.UndefOr[String] = js.undefined
    
    var language: js.UndefOr[String] = js.undefined
    
    var osmServer: js.UndefOr[String] = js.undefined
    
    var provider: openstreetmap
  }
  object OpenStreetMapOptions {
    
    inline def apply(): OpenStreetMapOptions = {
      val __obj = js.Dynamic.literal(provider = "openstreetmap")
      __obj.asInstanceOf[OpenStreetMapOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OpenStreetMapOptions] (val x: Self) extends AnyVal {
      
      inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      inline def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setOsmServer(value: String): Self = StObject.set(x, "osmServer", value.asInstanceOf[js.Any])
      
      inline def setOsmServerUndefined: Self = StObject.set(x, "osmServer", js.undefined)
      
      inline def setProvider(value: openstreetmap): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    }
  }
  
  type Options = (GenericOptions & BaseOptions) | (HereOptions & BaseOptions) | (OpenStreetMapOptions & BaseOptions) | (OpenDataFranceOptions & BaseOptions) | (AgolOptions & BaseOptions) | (SmartyStreetsOptions & BaseOptions) | (GoogleOptions & BaseOptions)
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodeGeocoder.nodeGeocoderStrings.freegeoip
    - typings.nodeGeocoder.nodeGeocoderStrings.datasciencetoolkit
    - typings.nodeGeocoder.nodeGeocoderStrings.locationiq
    - typings.nodeGeocoder.nodeGeocoderStrings.mapquest
    - typings.nodeGeocoder.nodeGeocoderStrings.mapbox
    - typings.nodeGeocoder.nodeGeocoderStrings.openmapquest
    - typings.nodeGeocoder.nodeGeocoderStrings.tomtom
    - typings.nodeGeocoder.nodeGeocoderStrings.nominatimmapquest
    - typings.nodeGeocoder.nodeGeocoderStrings.opencage
    - typings.nodeGeocoder.nodeGeocoderStrings.geocodio
    - typings.nodeGeocoder.nodeGeocoderStrings.yandex
    - typings.nodeGeocoder.nodeGeocoderStrings.teleport
    - typings.nodeGeocoder.nodeGeocoderStrings.pickpoint
  */
  trait Providers extends StObject
  object Providers {
    
    inline def datasciencetoolkit: typings.nodeGeocoder.nodeGeocoderStrings.datasciencetoolkit = "datasciencetoolkit".asInstanceOf[typings.nodeGeocoder.nodeGeocoderStrings.datasciencetoolkit]
    
    inline def freegeoip: typings.nodeGeocoder.nodeGeocoderStrings.freegeoip = "freegeoip".asInstanceOf[typings.nodeGeocoder.nodeGeocoderStrings.freegeoip]
    
    inline def geocodio: typings.nodeGeocoder.nodeGeocoderStrings.geocodio = "geocodio".asInstanceOf[typings.nodeGeocoder.nodeGeocoderStrings.geocodio]
    
    inline def locationiq: typings.nodeGeocoder.nodeGeocoderStrings.locationiq = "locationiq".asInstanceOf[typings.nodeGeocoder.nodeGeocoderStrings.locationiq]
    
    inline def mapbox: typings.nodeGeocoder.nodeGeocoderStrings.mapbox = "mapbox".asInstanceOf[typings.nodeGeocoder.nodeGeocoderStrings.mapbox]
    
    inline def mapquest: typings.nodeGeocoder.nodeGeocoderStrings.mapquest = "mapquest".asInstanceOf[typings.nodeGeocoder.nodeGeocoderStrings.mapquest]
    
    inline def nominatimmapquest: typings.nodeGeocoder.nodeGeocoderStrings.nominatimmapquest = "nominatimmapquest".asInstanceOf[typings.nodeGeocoder.nodeGeocoderStrings.nominatimmapquest]
    
    inline def opencage: typings.nodeGeocoder.nodeGeocoderStrings.opencage = "opencage".asInstanceOf[typings.nodeGeocoder.nodeGeocoderStrings.opencage]
    
    inline def openmapquest: typings.nodeGeocoder.nodeGeocoderStrings.openmapquest = "openmapquest".asInstanceOf[typings.nodeGeocoder.nodeGeocoderStrings.openmapquest]
    
    inline def pickpoint: typings.nodeGeocoder.nodeGeocoderStrings.pickpoint = "pickpoint".asInstanceOf[typings.nodeGeocoder.nodeGeocoderStrings.pickpoint]
    
    inline def teleport: typings.nodeGeocoder.nodeGeocoderStrings.teleport = "teleport".asInstanceOf[typings.nodeGeocoder.nodeGeocoderStrings.teleport]
    
    inline def tomtom: typings.nodeGeocoder.nodeGeocoderStrings.tomtom = "tomtom".asInstanceOf[typings.nodeGeocoder.nodeGeocoderStrings.tomtom]
    
    inline def yandex: typings.nodeGeocoder.nodeGeocoderStrings.yandex = "yandex".asInstanceOf[typings.nodeGeocoder.nodeGeocoderStrings.yandex]
  }
  
  trait Query extends StObject {
    
    var address: js.UndefOr[String] = js.undefined
    
    var country: js.UndefOr[String] = js.undefined
    
    var countryCode: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var minConfidence: js.UndefOr[Double] = js.undefined
    
    var zipcode: js.UndefOr[String] = js.undefined
  }
  object Query {
    
    inline def apply(): Query = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Query]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Query] (val x: Self) extends AnyVal {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
      
      inline def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
      
      inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setMinConfidence(value: Double): Self = StObject.set(x, "minConfidence", value.asInstanceOf[js.Any])
      
      inline def setMinConfidenceUndefined: Self = StObject.set(x, "minConfidence", js.undefined)
      
      inline def setZipcode(value: String): Self = StObject.set(x, "zipcode", value.asInstanceOf[js.Any])
      
      inline def setZipcodeUndefined: Self = StObject.set(x, "zipcode", js.undefined)
    }
  }
  
  trait SmartyStreetsOptions extends StObject {
    
    var auth_id: String
    
    var auth_token: String
    
    var provider: smartyStreet
  }
  object SmartyStreetsOptions {
    
    inline def apply(auth_id: String, auth_token: String): SmartyStreetsOptions = {
      val __obj = js.Dynamic.literal(auth_id = auth_id.asInstanceOf[js.Any], auth_token = auth_token.asInstanceOf[js.Any], provider = "smartyStreet")
      __obj.asInstanceOf[SmartyStreetsOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SmartyStreetsOptions] (val x: Self) extends AnyVal {
      
      inline def setAuth_id(value: String): Self = StObject.set(x, "auth_id", value.asInstanceOf[js.Any])
      
      inline def setAuth_token(value: String): Self = StObject.set(x, "auth_token", value.asInstanceOf[js.Any])
      
      inline def setProvider(value: smartyStreet): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    }
  }
}
