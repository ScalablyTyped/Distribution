package typings.paypalPaypalJs

import typings.paypalPaypalJs.fundingEligibilityMod.FUNDING_SOURCE
import typings.paypalPaypalJs.ordersMod.INTENT
import typings.paypalPaypalJs.ordersMod.SHIPPING_PREFERENCE
import typings.paypalPaypalJs.shippingMod.ShippingOptionType
import typings.paypalPaypalJs.subscriptionsCommonsMod.API
import typings.paypalPaypalJs.subscriptionsCommonsMod.IntegrationArtifact
import typings.paypalPaypalJs.subscriptionsCommonsMod.Payment
import typings.paypalPaypalJs.subscriptionsCommonsMod.PaymentFailureReason
import typings.paypalPaypalJs.subscriptionsCommonsMod.PaymentStatus
import typings.paypalPaypalJs.subscriptionsCommonsMod.ProductCode
import typings.paypalPaypalJs.subscriptionsCommonsMod.ProductFeature
import typings.paypalPaypalJs.subscriptionsCommonsMod.ProductFlow
import typings.paypalPaypalJs.subscriptionsCommonsMod.ProductType
import typings.paypalPaypalJs.subscriptionsCommonsMod.Status
import typings.paypalPaypalJs.subscriptionsCommonsMod.StatusChangedBy
import typings.paypalPaypalJs.subscriptionsCommonsMod.UserExperienceFlow
import typings.paypalPaypalJs.subscriptionsCommonsMod._Category
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paypalPaypalJsStrings {
  
  @js.native
  sealed trait `1x1` extends StObject
  inline def `1x1`: `1x1` = "1x1".asInstanceOf[`1x1`]
  
  @js.native
  sealed trait `1x4` extends StObject
  inline def `1x4`: `1x4` = "1x4".asInstanceOf[`1x4`]
  
  @js.native
  sealed trait `20x1` extends StObject
  inline def `20x1`: `20x1` = "20x1".asInstanceOf[`20x1`]
  
  @js.native
  sealed trait `8x1` extends StObject
  inline def `8x1`: `8x1` = "8x1".asInstanceOf[`8x1`]
  
  @js.native
  sealed trait A extends StObject
  inline def A: A = "A".asInstanceOf[A]
  
  @js.native
  sealed trait ACADEMIC_SOFTWARE
    extends StObject
       with _Category
  inline def ACADEMIC_SOFTWARE: ACADEMIC_SOFTWARE = "ACADEMIC_SOFTWARE".asInstanceOf[ACADEMIC_SOFTWARE]
  
  @js.native
  sealed trait ACCESSORIES
    extends StObject
       with _Category
  inline def ACCESSORIES: ACCESSORIES = "ACCESSORIES".asInstanceOf[ACCESSORIES]
  
  @js.native
  sealed trait ACCOUNTING
    extends StObject
       with _Category
  inline def ACCOUNTING: ACCOUNTING = "ACCOUNTING".asInstanceOf[ACCOUNTING]
  
  @js.native
  sealed trait ACTIVE
    extends StObject
       with Status
  inline def ACTIVE: ACTIVE = "ACTIVE".asInstanceOf[ACTIVE]
  
  @js.native
  sealed trait AC_REFRIGERATION_REPAIR
    extends StObject
       with _Category
  inline def AC_REFRIGERATION_REPAIR: AC_REFRIGERATION_REPAIR = "AC_REFRIGERATION_REPAIR".asInstanceOf[AC_REFRIGERATION_REPAIR]
  
  @js.native
  sealed trait ADULT
    extends StObject
       with _Category
  inline def ADULT: ADULT = "ADULT".asInstanceOf[ADULT]
  
  @js.native
  sealed trait ADVERTISING
    extends StObject
       with _Category
  inline def ADVERTISING: ADVERTISING = "ADVERTISING".asInstanceOf[ADVERTISING]
  
  @js.native
  sealed trait AFFILIATED_AUTO_RENTAL
    extends StObject
       with _Category
  inline def AFFILIATED_AUTO_RENTAL: AFFILIATED_AUTO_RENTAL = "AFFILIATED_AUTO_RENTAL".asInstanceOf[AFFILIATED_AUTO_RENTAL]
  
  @js.native
  sealed trait AGENCIES
    extends StObject
       with _Category
  inline def AGENCIES: AGENCIES = "AGENCIES".asInstanceOf[AGENCIES]
  
  @js.native
  sealed trait AGGREGATORS
    extends StObject
       with _Category
  inline def AGGREGATORS: AGGREGATORS = "AGGREGATORS".asInstanceOf[AGGREGATORS]
  
  @js.native
  sealed trait AGRICULTURAL_COOPERATIVE_FOR_MAIL_ORDER
    extends StObject
       with _Category
  inline def AGRICULTURAL_COOPERATIVE_FOR_MAIL_ORDER: AGRICULTURAL_COOPERATIVE_FOR_MAIL_ORDER = "AGRICULTURAL_COOPERATIVE_FOR_MAIL_ORDER".asInstanceOf[AGRICULTURAL_COOPERATIVE_FOR_MAIL_ORDER]
  
  @js.native
  sealed trait AIRLINES
    extends StObject
       with _Category
  inline def AIRLINES: AIRLINES = "AIRLINES".asInstanceOf[AIRLINES]
  
  @js.native
  sealed trait AIRPORTS_FLYING_FIELDS
    extends StObject
       with _Category
  inline def AIRPORTS_FLYING_FIELDS: AIRPORTS_FLYING_FIELDS = "AIRPORTS_FLYING_FIELDS".asInstanceOf[AIRPORTS_FLYING_FIELDS]
  
  @js.native
  sealed trait AIR_CARRIERS_AIRLINES
    extends StObject
       with _Category
  inline def AIR_CARRIERS_AIRLINES: AIR_CARRIERS_AIRLINES = "AIR_CARRIERS_AIRLINES".asInstanceOf[AIR_CARRIERS_AIRLINES]
  
  @js.native
  sealed trait ALCOHOLIC_BEVERAGES
    extends StObject
       with _Category
  inline def ALCOHOLIC_BEVERAGES: ALCOHOLIC_BEVERAGES = "ALCOHOLIC_BEVERAGES".asInstanceOf[ALCOHOLIC_BEVERAGES]
  
  @js.native
  sealed trait AMUSEMENT_PARKS_CARNIVALS
    extends StObject
       with _Category
  inline def AMUSEMENT_PARKS_CARNIVALS: AMUSEMENT_PARKS_CARNIVALS = "AMUSEMENT_PARKS_CARNIVALS".asInstanceOf[AMUSEMENT_PARKS_CARNIVALS]
  
  @js.native
  sealed trait ANIMATION
    extends StObject
       with _Category
  inline def ANIMATION: ANIMATION = "ANIMATION".asInstanceOf[ANIMATION]
  
  @js.native
  sealed trait ANTIQUES
    extends StObject
       with _Category
  inline def ANTIQUES: ANTIQUES = "ANTIQUES".asInstanceOf[ANTIQUES]
  
  @js.native
  sealed trait APPLIANCES
    extends StObject
       with _Category
  inline def APPLIANCES: APPLIANCES = "APPLIANCES".asInstanceOf[APPLIANCES]
  
  @js.native
  sealed trait APPROVAL_PENDING
    extends StObject
       with Status
  inline def APPROVAL_PENDING: APPROVAL_PENDING = "APPROVAL_PENDING".asInstanceOf[APPROVAL_PENDING]
  
  @js.native
  sealed trait APPROVED
    extends StObject
       with Status
  inline def APPROVED: APPROVED = "APPROVED".asInstanceOf[APPROVED]
  
  @js.native
  sealed trait AQUARIAMS_SEAQUARIUMS_DOLPHINARIUMS
    extends StObject
       with _Category
  inline def AQUARIAMS_SEAQUARIUMS_DOLPHINARIUMS: AQUARIAMS_SEAQUARIUMS_DOLPHINARIUMS = "AQUARIAMS_SEAQUARIUMS_DOLPHINARIUMS".asInstanceOf[AQUARIAMS_SEAQUARIUMS_DOLPHINARIUMS]
  
  @js.native
  sealed trait ARCHITECTURAL_ENGINEERING_AND_SURVEYING_SERVICES
    extends StObject
       with _Category
  inline def ARCHITECTURAL_ENGINEERING_AND_SURVEYING_SERVICES: ARCHITECTURAL_ENGINEERING_AND_SURVEYING_SERVICES = "ARCHITECTURAL_ENGINEERING_AND_SURVEYING_SERVICES".asInstanceOf[ARCHITECTURAL_ENGINEERING_AND_SURVEYING_SERVICES]
  
  @js.native
  sealed trait ARTIFACTS_GRAVE_RELATED_AND_NATIVE_AMERICAN_CRAFTS
    extends StObject
       with _Category
  inline def ARTIFACTS_GRAVE_RELATED_AND_NATIVE_AMERICAN_CRAFTS: ARTIFACTS_GRAVE_RELATED_AND_NATIVE_AMERICAN_CRAFTS = "ARTIFACTS_GRAVE_RELATED_AND_NATIVE_AMERICAN_CRAFTS".asInstanceOf[ARTIFACTS_GRAVE_RELATED_AND_NATIVE_AMERICAN_CRAFTS]
  
  @js.native
  sealed trait ARTS_AND_CRAFTS
    extends StObject
       with _Category
  inline def ARTS_AND_CRAFTS: ARTS_AND_CRAFTS = "ARTS_AND_CRAFTS".asInstanceOf[ARTS_AND_CRAFTS]
  
  @js.native
  sealed trait ARTS_CRAFTS_AND_COLLECTIBLES
    extends StObject
       with _Category
  inline def ARTS_CRAFTS_AND_COLLECTIBLES: ARTS_CRAFTS_AND_COLLECTIBLES = "ARTS_CRAFTS_AND_COLLECTIBLES".asInstanceOf[ARTS_CRAFTS_AND_COLLECTIBLES]
  
  @js.native
  sealed trait ART_AND_CRAFT_SUPPLIES
    extends StObject
       with _Category
  inline def ART_AND_CRAFT_SUPPLIES: ART_AND_CRAFT_SUPPLIES = "ART_AND_CRAFT_SUPPLIES".asInstanceOf[ART_AND_CRAFT_SUPPLIES]
  
  @js.native
  sealed trait ART_DEALERS_AND_GALLERIES
    extends StObject
       with _Category
  inline def ART_DEALERS_AND_GALLERIES: ART_DEALERS_AND_GALLERIES = "ART_DEALERS_AND_GALLERIES".asInstanceOf[ART_DEALERS_AND_GALLERIES]
  
  @js.native
  sealed trait AUDIO_BOOKS
    extends StObject
       with _Category
  inline def AUDIO_BOOKS: AUDIO_BOOKS = "AUDIO_BOOKS".asInstanceOf[AUDIO_BOOKS]
  
  @js.native
  sealed trait AUTHORIZE
    extends StObject
       with INTENT
  inline def AUTHORIZE: AUTHORIZE = "AUTHORIZE".asInstanceOf[AUTHORIZE]
  
  @js.native
  sealed trait AUTOMATED_FUEL_DISPENSERS
    extends StObject
       with _Category
  inline def AUTOMATED_FUEL_DISPENSERS: AUTOMATED_FUEL_DISPENSERS = "AUTOMATED_FUEL_DISPENSERS".asInstanceOf[AUTOMATED_FUEL_DISPENSERS]
  
  @js.native
  sealed trait AUTOMOBILE_ASSOCIATIONS
    extends StObject
       with _Category
  inline def AUTOMOBILE_ASSOCIATIONS: AUTOMOBILE_ASSOCIATIONS = "AUTOMOBILE_ASSOCIATIONS".asInstanceOf[AUTOMOBILE_ASSOCIATIONS]
  
  @js.native
  sealed trait AUTOMOTIVE
    extends StObject
       with _Category
  inline def AUTOMOTIVE: AUTOMOTIVE = "AUTOMOTIVE".asInstanceOf[AUTOMOTIVE]
  
  @js.native
  sealed trait AUTOMOTIVE_REPAIR_SHOPS_NON_DEALER
    extends StObject
       with _Category
  inline def AUTOMOTIVE_REPAIR_SHOPS_NON_DEALER: AUTOMOTIVE_REPAIR_SHOPS_NON_DEALER = "AUTOMOTIVE_REPAIR_SHOPS_NON_DEALER".asInstanceOf[AUTOMOTIVE_REPAIR_SHOPS_NON_DEALER]
  
  @js.native
  sealed trait AUTOMOTIVE_TOP_AND_BODY_SHOPS
    extends StObject
       with _Category
  inline def AUTOMOTIVE_TOP_AND_BODY_SHOPS: AUTOMOTIVE_TOP_AND_BODY_SHOPS = "AUTOMOTIVE_TOP_AND_BODY_SHOPS".asInstanceOf[AUTOMOTIVE_TOP_AND_BODY_SHOPS]
  
  @js.native
  sealed trait AUTOWITHDRAWAL
    extends StObject
       with ProductCode
  inline def AUTOWITHDRAWAL: AUTOWITHDRAWAL = "AUTOWITHDRAWAL".asInstanceOf[AUTOWITHDRAWAL]
  
  @js.native
  sealed trait AUTO_ASSOCIATIONS_CLUBS
    extends StObject
       with _Category
  inline def AUTO_ASSOCIATIONS_CLUBS: AUTO_ASSOCIATIONS_CLUBS = "AUTO_ASSOCIATIONS_CLUBS".asInstanceOf[AUTO_ASSOCIATIONS_CLUBS]
  
  @js.native
  sealed trait AUTO_DEALER_USED_ONLY
    extends StObject
       with _Category
  inline def AUTO_DEALER_USED_ONLY: AUTO_DEALER_USED_ONLY = "AUTO_DEALER_USED_ONLY".asInstanceOf[AUTO_DEALER_USED_ONLY]
  
  @js.native
  sealed trait AUTO_RENTALS
    extends StObject
       with _Category
  inline def AUTO_RENTALS: AUTO_RENTALS = "AUTO_RENTALS".asInstanceOf[AUTO_RENTALS]
  
  @js.native
  sealed trait AUTO_SERVICE
    extends StObject
       with _Category
  inline def AUTO_SERVICE: AUTO_SERVICE = "AUTO_SERVICE".asInstanceOf[AUTO_SERVICE]
  
  @js.native
  sealed trait AVIATION
    extends StObject
       with _Category
  inline def AVIATION: AVIATION = "AVIATION".asInstanceOf[AVIATION]
  
  @js.native
  sealed trait B extends StObject
  inline def B: B = "B".asInstanceOf[B]
  
  @js.native
  sealed trait BABIES_CLOTHING_AND_SUPPLIES
    extends StObject
       with _Category
  inline def BABIES_CLOTHING_AND_SUPPLIES: BABIES_CLOTHING_AND_SUPPLIES = "BABIES_CLOTHING_AND_SUPPLIES".asInstanceOf[BABIES_CLOTHING_AND_SUPPLIES]
  
  @js.native
  sealed trait BABY
    extends StObject
       with _Category
  inline def BABY: BABY = "BABY".asInstanceOf[BABY]
  
  @js.native
  sealed trait BANDS_ORCHESTRAS_ENTERTAINERS
    extends StObject
       with _Category
  inline def BANDS_ORCHESTRAS_ENTERTAINERS: BANDS_ORCHESTRAS_ENTERTAINERS = "BANDS_ORCHESTRAS_ENTERTAINERS".asInstanceOf[BANDS_ORCHESTRAS_ENTERTAINERS]
  
  @js.native
  sealed trait BARBIES
    extends StObject
       with _Category
  inline def BARBIES: BARBIES = "BARBIES".asInstanceOf[BARBIES]
  
  @js.native
  sealed trait BATCH extends StObject
  inline def BATCH: BATCH = "BATCH".asInstanceOf[BATCH]
  
  @js.native
  sealed trait BATH_AND_BODY
    extends StObject
       with _Category
  inline def BATH_AND_BODY: BATH_AND_BODY = "BATH_AND_BODY".asInstanceOf[BATH_AND_BODY]
  
  @js.native
  sealed trait BATTERIES
    extends StObject
       with _Category
  inline def BATTERIES: BATTERIES = "BATTERIES".asInstanceOf[BATTERIES]
  
  @js.native
  sealed trait BEAN_BABIES
    extends StObject
       with _Category
  inline def BEAN_BABIES: BEAN_BABIES = "BEAN_BABIES".asInstanceOf[BEAN_BABIES]
  
  @js.native
  sealed trait BEAUTY
    extends StObject
       with _Category
  inline def BEAUTY: BEAUTY = "BEAUTY".asInstanceOf[BEAUTY]
  
  @js.native
  sealed trait BEAUTY_AND_FRAGRANCES
    extends StObject
       with _Category
  inline def BEAUTY_AND_FRAGRANCES: BEAUTY_AND_FRAGRANCES = "BEAUTY_AND_FRAGRANCES".asInstanceOf[BEAUTY_AND_FRAGRANCES]
  
  @js.native
  sealed trait BED_AND_BATH
    extends StObject
       with _Category
  inline def BED_AND_BATH: BED_AND_BATH = "BED_AND_BATH".asInstanceOf[BED_AND_BATH]
  
  @js.native
  sealed trait BICYCLES_AND_ACCESSORIES
    extends StObject
       with _Category
  inline def BICYCLES_AND_ACCESSORIES: BICYCLES_AND_ACCESSORIES = "BICYCLES_AND_ACCESSORIES".asInstanceOf[BICYCLES_AND_ACCESSORIES]
  
  @js.native
  sealed trait BICYCLE_SHOPS_SALES_AND_SERVICE
    extends StObject
       with _Category
  inline def BICYCLE_SHOPS_SALES_AND_SERVICE: BICYCLE_SHOPS_SALES_AND_SERVICE = "BICYCLE_SHOPS_SALES_AND_SERVICE".asInstanceOf[BICYCLE_SHOPS_SALES_AND_SERVICE]
  
  @js.native
  sealed trait BILLIARD_POOL_ESTABLISHMENTS
    extends StObject
       with _Category
  inline def BILLIARD_POOL_ESTABLISHMENTS: BILLIARD_POOL_ESTABLISHMENTS = "BILLIARD_POOL_ESTABLISHMENTS".asInstanceOf[BILLIARD_POOL_ESTABLISHMENTS]
  
  @js.native
  sealed trait BILLING extends StObject
  inline def BILLING: BILLING = "BILLING".asInstanceOf[BILLING]
  
  @js.native
  sealed trait BILLING_AGREEMENTS
    extends StObject
       with ProductCode
       with ProductFeature
  inline def BILLING_AGREEMENTS: BILLING_AGREEMENTS = "BILLING_AGREEMENTS".asInstanceOf[BILLING_AGREEMENTS]
  
  @js.native
  sealed trait BILLING_SUBSCRIPTIONS
    extends StObject
       with ProductCode
  inline def BILLING_SUBSCRIPTIONS: BILLING_SUBSCRIPTIONS = "BILLING_SUBSCRIPTIONS".asInstanceOf[BILLING_SUBSCRIPTIONS]
  
  @js.native
  sealed trait BILLING_V1
    extends StObject
       with API
  inline def BILLING_V1: BILLING_V1 = "BILLING_V1".asInstanceOf[BILLING_V1]
  
  @js.native
  sealed trait BOATING_SAILING_AND_ACCESSORIES
    extends StObject
       with _Category
  inline def BOATING_SAILING_AND_ACCESSORIES: BOATING_SAILING_AND_ACCESSORIES = "BOATING_SAILING_AND_ACCESSORIES".asInstanceOf[BOATING_SAILING_AND_ACCESSORIES]
  
  @js.native
  sealed trait BOAT_DEALERS
    extends StObject
       with _Category
  inline def BOAT_DEALERS: BOAT_DEALERS = "BOAT_DEALERS".asInstanceOf[BOAT_DEALERS]
  
  @js.native
  sealed trait BOAT_RENTALS_AND_LEASING
    extends StObject
       with _Category
  inline def BOAT_RENTALS_AND_LEASING: BOAT_RENTALS_AND_LEASING = "BOAT_RENTALS_AND_LEASING".asInstanceOf[BOAT_RENTALS_AND_LEASING]
  
  @js.native
  sealed trait BOOKS
    extends StObject
       with _Category
  inline def BOOKS: BOOKS = "BOOKS".asInstanceOf[BOOKS]
  
  @js.native
  sealed trait BOOKS_AND_MAGAZINES
    extends StObject
       with _Category
  inline def BOOKS_AND_MAGAZINES: BOOKS_AND_MAGAZINES = "BOOKS_AND_MAGAZINES".asInstanceOf[BOOKS_AND_MAGAZINES]
  
  @js.native
  sealed trait BOOKS_MANUSCRIPTS
    extends StObject
       with _Category
  inline def BOOKS_MANUSCRIPTS: BOOKS_MANUSCRIPTS = "BOOKS_MANUSCRIPTS".asInstanceOf[BOOKS_MANUSCRIPTS]
  
  @js.native
  sealed trait BOOKS_PERIODICALS_AND_NEWSPAPERS
    extends StObject
       with _Category
  inline def BOOKS_PERIODICALS_AND_NEWSPAPERS: BOOKS_PERIODICALS_AND_NEWSPAPERS = "BOOKS_PERIODICALS_AND_NEWSPAPERS".asInstanceOf[BOOKS_PERIODICALS_AND_NEWSPAPERS]
  
  @js.native
  sealed trait BOWLING_ALLEYS
    extends StObject
       with _Category
  inline def BOWLING_ALLEYS: BOWLING_ALLEYS = "BOWLING_ALLEYS".asInstanceOf[BOWLING_ALLEYS]
  
  @js.native
  sealed trait BRAINTREE_VZERO
    extends StObject
       with IntegrationArtifact
  inline def BRAINTREE_VZERO: BRAINTREE_VZERO = "BRAINTREE_VZERO".asInstanceOf[BRAINTREE_VZERO]
  
  @js.native
  sealed trait BULLETIN_BOARD
    extends StObject
       with _Category
  inline def BULLETIN_BOARD: BULLETIN_BOARD = "BULLETIN_BOARD".asInstanceOf[BULLETIN_BOARD]
  
  @js.native
  sealed trait BUSINESS
    extends StObject
       with _Category
  inline def BUSINESS: BUSINESS = "BUSINESS".asInstanceOf[BUSINESS]
  
  @js.native
  sealed trait BUSINESS_AND_SECRETARIAL_SCHOOLS
    extends StObject
       with _Category
  inline def BUSINESS_AND_SECRETARIAL_SCHOOLS: BUSINESS_AND_SECRETARIAL_SCHOOLS = "BUSINESS_AND_SECRETARIAL_SCHOOLS".asInstanceOf[BUSINESS_AND_SECRETARIAL_SCHOOLS]
  
  @js.native
  sealed trait BUS_LINE
    extends StObject
       with _Category
  inline def BUS_LINE: BUS_LINE = "BUS_LINE".asInstanceOf[BUS_LINE]
  
  @js.native
  sealed trait BUS_LINES_CHARTERS_TOUR_BUSES
    extends StObject
       with _Category
  inline def BUS_LINES_CHARTERS_TOUR_BUSES: BUS_LINES_CHARTERS_TOUR_BUSES = "BUS_LINES_CHARTERS_TOUR_BUSES".asInstanceOf[BUS_LINES_CHARTERS_TOUR_BUSES]
  
  @js.native
  sealed trait BUYER
    extends StObject
       with StatusChangedBy
  inline def BUYER: BUYER = "BUYER".asInstanceOf[BUYER]
  
  @js.native
  sealed trait BUYER_APPROVAL_BILLING_AGREEMENT_CREATE
    extends StObject
       with ProductFlow
  inline def BUYER_APPROVAL_BILLING_AGREEMENT_CREATE: BUYER_APPROVAL_BILLING_AGREEMENT_CREATE = "BUYER_APPROVAL_BILLING_AGREEMENT_CREATE".asInstanceOf[BUYER_APPROVAL_BILLING_AGREEMENT_CREATE]
  
  @js.native
  sealed trait BUYER_APPROVAL_BILLING_AGREEMENT_WITH_PURCHASE
    extends StObject
       with ProductFlow
  inline def BUYER_APPROVAL_BILLING_AGREEMENT_WITH_PURCHASE: BUYER_APPROVAL_BILLING_AGREEMENT_WITH_PURCHASE = "BUYER_APPROVAL_BILLING_AGREEMENT_WITH_PURCHASE".asInstanceOf[BUYER_APPROVAL_BILLING_AGREEMENT_WITH_PURCHASE]
  
  @js.native
  sealed trait BUYER_APPROVAL_SUBSCRIPTIONS
    extends StObject
       with ProductFlow
  inline def BUYER_APPROVAL_SUBSCRIPTIONS: BUYER_APPROVAL_SUBSCRIPTIONS = "BUYER_APPROVAL_SUBSCRIPTIONS".asInstanceOf[BUYER_APPROVAL_SUBSCRIPTIONS]
  
  @js.native
  sealed trait BUYER_APPROVAL_SUBSCRIPTIONS_PRICING_CHANGE
    extends StObject
       with ProductFlow
  inline def BUYER_APPROVAL_SUBSCRIPTIONS_PRICING_CHANGE: BUYER_APPROVAL_SUBSCRIPTIONS_PRICING_CHANGE = "BUYER_APPROVAL_SUBSCRIPTIONS_PRICING_CHANGE".asInstanceOf[BUYER_APPROVAL_SUBSCRIPTIONS_PRICING_CHANGE]
  
  @js.native
  sealed trait BUYER_APPROVAL_SUBSCRIPTIONS_REVISE
    extends StObject
       with ProductFlow
  inline def BUYER_APPROVAL_SUBSCRIPTIONS_REVISE: BUYER_APPROVAL_SUBSCRIPTIONS_REVISE = "BUYER_APPROVAL_SUBSCRIPTIONS_REVISE".asInstanceOf[BUYER_APPROVAL_SUBSCRIPTIONS_REVISE]
  
  @js.native
  sealed trait BUYER_INSTRUMENT_AUTHENTICATION_BILLING_AGREEMENT
    extends StObject
       with ProductFlow
  inline def BUYER_INSTRUMENT_AUTHENTICATION_BILLING_AGREEMENT: BUYER_INSTRUMENT_AUTHENTICATION_BILLING_AGREEMENT = "BUYER_INSTRUMENT_AUTHENTICATION_BILLING_AGREEMENT".asInstanceOf[BUYER_INSTRUMENT_AUTHENTICATION_BILLING_AGREEMENT]
  
  @js.native
  sealed trait BUYING_AND_SHOPPING_SERVICES_AND_CLUBS
    extends StObject
       with _Category
  inline def BUYING_AND_SHOPPING_SERVICES_AND_CLUBS: BUYING_AND_SHOPPING_SERVICES_AND_CLUBS = "BUYING_AND_SHOPPING_SERVICES_AND_CLUBS".asInstanceOf[BUYING_AND_SHOPPING_SERVICES_AND_CLUBS]
  
  @js.native
  sealed trait C extends StObject
  inline def C: C = "C".asInstanceOf[C]
  
  @js.native
  sealed trait CABLE_SATELLITE_AND_OTHER_PAY_TELEVISION_AND_RADIO_SERVICES
    extends StObject
       with _Category
  inline def CABLE_SATELLITE_AND_OTHER_PAY_TELEVISION_AND_RADIO_SERVICES: CABLE_SATELLITE_AND_OTHER_PAY_TELEVISION_AND_RADIO_SERVICES = "CABLE_SATELLITE_AND_OTHER_PAY_TELEVISION_AND_RADIO_SERVICES".asInstanceOf[CABLE_SATELLITE_AND_OTHER_PAY_TELEVISION_AND_RADIO_SERVICES]
  
  @js.native
  sealed trait CABLE_SATELLITE_AND_OTHER_PAY_TV_AND_RADIO
    extends StObject
       with _Category
  inline def CABLE_SATELLITE_AND_OTHER_PAY_TV_AND_RADIO: CABLE_SATELLITE_AND_OTHER_PAY_TV_AND_RADIO = "CABLE_SATELLITE_AND_OTHER_PAY_TV_AND_RADIO".asInstanceOf[CABLE_SATELLITE_AND_OTHER_PAY_TV_AND_RADIO]
  
  @js.native
  sealed trait CAMERAS
    extends StObject
       with _Category
  inline def CAMERAS: CAMERAS = "CAMERAS".asInstanceOf[CAMERAS]
  
  @js.native
  sealed trait CAMERAS_AND_PHOTOGRAPHY
    extends StObject
       with _Category
  inline def CAMERAS_AND_PHOTOGRAPHY: CAMERAS_AND_PHOTOGRAPHY = "CAMERAS_AND_PHOTOGRAPHY".asInstanceOf[CAMERAS_AND_PHOTOGRAPHY]
  
  @js.native
  sealed trait CAMERA_AND_PHOTOGRAPHIC_SUPPLIES
    extends StObject
       with _Category
  inline def CAMERA_AND_PHOTOGRAPHIC_SUPPLIES: CAMERA_AND_PHOTOGRAPHIC_SUPPLIES = "CAMERA_AND_PHOTOGRAPHIC_SUPPLIES".asInstanceOf[CAMERA_AND_PHOTOGRAPHIC_SUPPLIES]
  
  @js.native
  sealed trait CAMPER_RECREATIONAL_AND_UTILITY_TRAILER_DEALERS
    extends StObject
       with _Category
  inline def CAMPER_RECREATIONAL_AND_UTILITY_TRAILER_DEALERS: CAMPER_RECREATIONAL_AND_UTILITY_TRAILER_DEALERS = "CAMPER_RECREATIONAL_AND_UTILITY_TRAILER_DEALERS".asInstanceOf[CAMPER_RECREATIONAL_AND_UTILITY_TRAILER_DEALERS]
  
  @js.native
  sealed trait CAMPING_AND_OUTDOORS
    extends StObject
       with _Category
  inline def CAMPING_AND_OUTDOORS: CAMPING_AND_OUTDOORS = "CAMPING_AND_OUTDOORS".asInstanceOf[CAMPING_AND_OUTDOORS]
  
  @js.native
  sealed trait CAMPING_AND_SURVIVAL
    extends StObject
       with _Category
  inline def CAMPING_AND_SURVIVAL: CAMPING_AND_SURVIVAL = "CAMPING_AND_SURVIVAL".asInstanceOf[CAMPING_AND_SURVIVAL]
  
  @js.native
  sealed trait CANCEL extends StObject
  inline def CANCEL: CANCEL = "CANCEL".asInstanceOf[CANCEL]
  
  @js.native
  sealed trait CANCELLED
    extends StObject
       with Status
  inline def CANCELLED: CANCELLED = "CANCELLED".asInstanceOf[CANCELLED]
  
  @js.native
  sealed trait CAPTURE
    extends StObject
       with INTENT
  inline def CAPTURE: CAPTURE = "CAPTURE".asInstanceOf[CAPTURE]
  
  @js.native
  sealed trait CARD_ISSUER_INSTALLMENTS extends StObject
  inline def CARD_ISSUER_INSTALLMENTS: CARD_ISSUER_INSTALLMENTS = "CARD_ISSUER_INSTALLMENTS".asInstanceOf[CARD_ISSUER_INSTALLMENTS]
  
  @js.native
  sealed trait CAR_AND_TRUCK_DEALERS
    extends StObject
       with _Category
  inline def CAR_AND_TRUCK_DEALERS: CAR_AND_TRUCK_DEALERS = "CAR_AND_TRUCK_DEALERS".asInstanceOf[CAR_AND_TRUCK_DEALERS]
  
  @js.native
  sealed trait CAR_AND_TRUCK_DEALERS_USED_ONLY
    extends StObject
       with _Category
  inline def CAR_AND_TRUCK_DEALERS_USED_ONLY: CAR_AND_TRUCK_DEALERS_USED_ONLY = "CAR_AND_TRUCK_DEALERS_USED_ONLY".asInstanceOf[CAR_AND_TRUCK_DEALERS_USED_ONLY]
  
  @js.native
  sealed trait CAR_AUDIO_AND_ELECTRONICS
    extends StObject
       with _Category
  inline def CAR_AUDIO_AND_ELECTRONICS: CAR_AUDIO_AND_ELECTRONICS = "CAR_AUDIO_AND_ELECTRONICS".asInstanceOf[CAR_AUDIO_AND_ELECTRONICS]
  
  @js.native
  sealed trait CAR_RENTAL_AGENCY
    extends StObject
       with _Category
  inline def CAR_RENTAL_AGENCY: CAR_RENTAL_AGENCY = "CAR_RENTAL_AGENCY".asInstanceOf[CAR_RENTAL_AGENCY]
  
  @js.native
  sealed trait CATALOG_MERCHANT
    extends StObject
       with _Category
  inline def CATALOG_MERCHANT: CATALOG_MERCHANT = "CATALOG_MERCHANT".asInstanceOf[CATALOG_MERCHANT]
  
  @js.native
  sealed trait CATALOG_RETAIL_MERCHANT
    extends StObject
       with _Category
  inline def CATALOG_RETAIL_MERCHANT: CATALOG_RETAIL_MERCHANT = "CATALOG_RETAIL_MERCHANT".asInstanceOf[CATALOG_RETAIL_MERCHANT]
  
  @js.native
  sealed trait CATERING_SERVICES
    extends StObject
       with _Category
  inline def CATERING_SERVICES: CATERING_SERVICES = "CATERING_SERVICES".asInstanceOf[CATERING_SERVICES]
  
  @js.native
  sealed trait CHARITY
    extends StObject
       with _Category
  inline def CHARITY: CHARITY = "CHARITY".asInstanceOf[CHARITY]
  
  @js.native
  sealed trait CHECK_CASHIER
    extends StObject
       with _Category
  inline def CHECK_CASHIER: CHECK_CASHIER = "CHECK_CASHIER".asInstanceOf[CHECK_CASHIER]
  
  @js.native
  sealed trait CHILDREN_BOOKS
    extends StObject
       with _Category
  inline def CHILDREN_BOOKS: CHILDREN_BOOKS = "CHILDREN_BOOKS".asInstanceOf[CHILDREN_BOOKS]
  
  @js.native
  sealed trait CHILD_CARE_SERVICES
    extends StObject
       with _Category
  inline def CHILD_CARE_SERVICES: CHILD_CARE_SERVICES = "CHILD_CARE_SERVICES".asInstanceOf[CHILD_CARE_SERVICES]
  
  @js.native
  sealed trait CHIROPODISTS_PODIATRISTS
    extends StObject
       with _Category
  inline def CHIROPODISTS_PODIATRISTS: CHIROPODISTS_PODIATRISTS = "CHIROPODISTS_PODIATRISTS".asInstanceOf[CHIROPODISTS_PODIATRISTS]
  
  @js.native
  sealed trait CHIROPRACTORS
    extends StObject
       with _Category
  inline def CHIROPRACTORS: CHIROPRACTORS = "CHIROPRACTORS".asInstanceOf[CHIROPRACTORS]
  
  @js.native
  sealed trait CIGAR_STORES_AND_STANDS
    extends StObject
       with _Category
  inline def CIGAR_STORES_AND_STANDS: CIGAR_STORES_AND_STANDS = "CIGAR_STORES_AND_STANDS".asInstanceOf[CIGAR_STORES_AND_STANDS]
  
  @js.native
  sealed trait CIVIC_SOCIAL_FRATERNAL_ASSOCIATIONS
    extends StObject
       with _Category
  inline def CIVIC_SOCIAL_FRATERNAL_ASSOCIATIONS: CIVIC_SOCIAL_FRATERNAL_ASSOCIATIONS = "CIVIC_SOCIAL_FRATERNAL_ASSOCIATIONS".asInstanceOf[CIVIC_SOCIAL_FRATERNAL_ASSOCIATIONS]
  
  @js.native
  sealed trait CIVIL_SOCIAL_FRAT_ASSOCIATIONS
    extends StObject
       with _Category
  inline def CIVIL_SOCIAL_FRAT_ASSOCIATIONS: CIVIL_SOCIAL_FRAT_ASSOCIATIONS = "CIVIL_SOCIAL_FRAT_ASSOCIATIONS".asInstanceOf[CIVIL_SOCIAL_FRAT_ASSOCIATIONS]
  
  @js.native
  sealed trait CLASSIC
    extends StObject
       with ProductFlow
  inline def CLASSIC: CLASSIC = "CLASSIC".asInstanceOf[CLASSIC]
  
  @js.native
  sealed trait CLOTHING
    extends StObject
       with _Category
  inline def CLOTHING: CLOTHING = "CLOTHING".asInstanceOf[CLOTHING]
  
  @js.native
  sealed trait CLOTHING_ACCESSORIES_AND_SHOES
    extends StObject
       with _Category
  inline def CLOTHING_ACCESSORIES_AND_SHOES: CLOTHING_ACCESSORIES_AND_SHOES = "CLOTHING_ACCESSORIES_AND_SHOES".asInstanceOf[CLOTHING_ACCESSORIES_AND_SHOES]
  
  @js.native
  sealed trait CLOTHING_RENTAL
    extends StObject
       with _Category
  inline def CLOTHING_RENTAL: CLOTHING_RENTAL = "CLOTHING_RENTAL".asInstanceOf[CLOTHING_RENTAL]
  
  @js.native
  sealed trait COFFEE_AND_TEA
    extends StObject
       with _Category
  inline def COFFEE_AND_TEA: COFFEE_AND_TEA = "COFFEE_AND_TEA".asInstanceOf[COFFEE_AND_TEA]
  
  @js.native
  sealed trait COIN_OPERATED_BANKS_AND_CASINOS
    extends StObject
       with _Category
  inline def COIN_OPERATED_BANKS_AND_CASINOS: COIN_OPERATED_BANKS_AND_CASINOS = "COIN_OPERATED_BANKS_AND_CASINOS".asInstanceOf[COIN_OPERATED_BANKS_AND_CASINOS]
  
  @js.native
  sealed trait COLLECTIBLES
    extends StObject
       with _Category
  inline def COLLECTIBLES: COLLECTIBLES = "COLLECTIBLES".asInstanceOf[COLLECTIBLES]
  
  @js.native
  sealed trait COLLECTION_AGENCY
    extends StObject
       with _Category
  inline def COLLECTION_AGENCY: COLLECTION_AGENCY = "COLLECTION_AGENCY".asInstanceOf[COLLECTION_AGENCY]
  
  @js.native
  sealed trait COLLEGES_AND_UNIVERSITIES
    extends StObject
       with _Category
  inline def COLLEGES_AND_UNIVERSITIES: COLLEGES_AND_UNIVERSITIES = "COLLEGES_AND_UNIVERSITIES".asInstanceOf[COLLEGES_AND_UNIVERSITIES]
  
  @js.native
  sealed trait COMMERCIAL_EQUIPMENT
    extends StObject
       with _Category
  inline def COMMERCIAL_EQUIPMENT: COMMERCIAL_EQUIPMENT = "COMMERCIAL_EQUIPMENT".asInstanceOf[COMMERCIAL_EQUIPMENT]
  
  @js.native
  sealed trait COMMERCIAL_FOOTWEAR
    extends StObject
       with _Category
  inline def COMMERCIAL_FOOTWEAR: COMMERCIAL_FOOTWEAR = "COMMERCIAL_FOOTWEAR".asInstanceOf[COMMERCIAL_FOOTWEAR]
  
  @js.native
  sealed trait COMMERCIAL_PHOTOGRAPHY
    extends StObject
       with _Category
  inline def COMMERCIAL_PHOTOGRAPHY: COMMERCIAL_PHOTOGRAPHY = "COMMERCIAL_PHOTOGRAPHY".asInstanceOf[COMMERCIAL_PHOTOGRAPHY]
  
  @js.native
  sealed trait COMMERCIAL_PHOTOGRAPHY_ART_AND_GRAPHICS
    extends StObject
       with _Category
  inline def COMMERCIAL_PHOTOGRAPHY_ART_AND_GRAPHICS: COMMERCIAL_PHOTOGRAPHY_ART_AND_GRAPHICS = "COMMERCIAL_PHOTOGRAPHY_ART_AND_GRAPHICS".asInstanceOf[COMMERCIAL_PHOTOGRAPHY_ART_AND_GRAPHICS]
  
  @js.native
  sealed trait COMMERCIAL_SPORTS_PROFESSIONA
    extends StObject
       with _Category
  inline def COMMERCIAL_SPORTS_PROFESSIONA: COMMERCIAL_SPORTS_PROFESSIONA = "COMMERCIAL_SPORTS_PROFESSIONA".asInstanceOf[COMMERCIAL_SPORTS_PROFESSIONA]
  
  @js.native
  sealed trait COMMODITIES_AND_FUTURES_EXCHANGE
    extends StObject
       with _Category
  inline def COMMODITIES_AND_FUTURES_EXCHANGE: COMMODITIES_AND_FUTURES_EXCHANGE = "COMMODITIES_AND_FUTURES_EXCHANGE".asInstanceOf[COMMODITIES_AND_FUTURES_EXCHANGE]
  
  @js.native
  sealed trait COMPLETED
    extends StObject
       with PaymentStatus
  inline def COMPLETED: COMPLETED = "COMPLETED".asInstanceOf[COMPLETED]
  
  @js.native
  sealed trait COMPUTER_AND_DATA_PROCESSING_SERVICES
    extends StObject
       with _Category
  inline def COMPUTER_AND_DATA_PROCESSING_SERVICES: COMPUTER_AND_DATA_PROCESSING_SERVICES = "COMPUTER_AND_DATA_PROCESSING_SERVICES".asInstanceOf[COMPUTER_AND_DATA_PROCESSING_SERVICES]
  
  @js.native
  sealed trait COMPUTER_HARDWARE_AND_SOFTWARE
    extends StObject
       with _Category
  inline def COMPUTER_HARDWARE_AND_SOFTWARE: COMPUTER_HARDWARE_AND_SOFTWARE = "COMPUTER_HARDWARE_AND_SOFTWARE".asInstanceOf[COMPUTER_HARDWARE_AND_SOFTWARE]
  
  @js.native
  sealed trait COMPUTER_MAINTENANCE_REPAIR_AND_SERVICES_NOT_ELSEWHERE_CLAS
    extends StObject
       with _Category
  inline def COMPUTER_MAINTENANCE_REPAIR_AND_SERVICES_NOT_ELSEWHERE_CLAS: COMPUTER_MAINTENANCE_REPAIR_AND_SERVICES_NOT_ELSEWHERE_CLAS = "COMPUTER_MAINTENANCE_REPAIR_AND_SERVICES_NOT_ELSEWHERE_CLAS".asInstanceOf[COMPUTER_MAINTENANCE_REPAIR_AND_SERVICES_NOT_ELSEWHERE_CLAS]
  
  @js.native
  sealed trait CONNECT extends StObject
  inline def CONNECT: CONNECT = "CONNECT".asInstanceOf[CONNECT]
  
  @js.native
  sealed trait CONSTRUCTION
    extends StObject
       with _Category
  inline def CONSTRUCTION: CONSTRUCTION = "CONSTRUCTION".asInstanceOf[CONSTRUCTION]
  
  @js.native
  sealed trait CONSTRUCTION_MATERIALS_NOT_ELSEWHERE_CLASSIFIED
    extends StObject
       with _Category
  inline def CONSTRUCTION_MATERIALS_NOT_ELSEWHERE_CLASSIFIED: CONSTRUCTION_MATERIALS_NOT_ELSEWHERE_CLASSIFIED = "CONSTRUCTION_MATERIALS_NOT_ELSEWHERE_CLASSIFIED".asInstanceOf[CONSTRUCTION_MATERIALS_NOT_ELSEWHERE_CLASSIFIED]
  
  @js.native
  sealed trait CONSULTING_SERVICES
    extends StObject
       with _Category
  inline def CONSULTING_SERVICES: CONSULTING_SERVICES = "CONSULTING_SERVICES".asInstanceOf[CONSULTING_SERVICES]
  
  @js.native
  sealed trait CONSUMER_CREDIT_REPORTING_AGENCIES
    extends StObject
       with _Category
  inline def CONSUMER_CREDIT_REPORTING_AGENCIES: CONSUMER_CREDIT_REPORTING_AGENCIES = "CONSUMER_CREDIT_REPORTING_AGENCIES".asInstanceOf[CONSUMER_CREDIT_REPORTING_AGENCIES]
  
  @js.native
  sealed trait CONSUMER_EXP_BILLING_AGREEMENT_MODIFY
    extends StObject
       with ProductFlow
  inline def CONSUMER_EXP_BILLING_AGREEMENT_MODIFY: CONSUMER_EXP_BILLING_AGREEMENT_MODIFY = "CONSUMER_EXP_BILLING_AGREEMENT_MODIFY".asInstanceOf[CONSUMER_EXP_BILLING_AGREEMENT_MODIFY]
  
  @js.native
  sealed trait CONSUMER_EXP_SUBSCRIPTIONS_MODIFY
    extends StObject
       with ProductFlow
  inline def CONSUMER_EXP_SUBSCRIPTIONS_MODIFY: CONSUMER_EXP_SUBSCRIPTIONS_MODIFY = "CONSUMER_EXP_SUBSCRIPTIONS_MODIFY".asInstanceOf[CONSUMER_EXP_SUBSCRIPTIONS_MODIFY]
  
  @js.native
  sealed trait CONTINUE extends StObject
  inline def CONTINUE: CONTINUE = "CONTINUE".asInstanceOf[CONTINUE]
  
  @js.native
  sealed trait CONVALESCENT_HOMES
    extends StObject
       with _Category
  inline def CONVALESCENT_HOMES: CONVALESCENT_HOMES = "CONVALESCENT_HOMES".asInstanceOf[CONVALESCENT_HOMES]
  
  @js.native
  sealed trait COSMETIC_STORES
    extends StObject
       with _Category
  inline def COSMETIC_STORES: COSMETIC_STORES = "COSMETIC_STORES".asInstanceOf[COSMETIC_STORES]
  
  @js.native
  sealed trait COUNSELING_SERVICES_DEBT_MARRIAGE_PERSONAL
    extends StObject
       with _Category
  inline def COUNSELING_SERVICES_DEBT_MARRIAGE_PERSONAL: COUNSELING_SERVICES_DEBT_MARRIAGE_PERSONAL = "COUNSELING_SERVICES_DEBT_MARRIAGE_PERSONAL".asInstanceOf[COUNSELING_SERVICES_DEBT_MARRIAGE_PERSONAL]
  
  @js.native
  sealed trait COUNTERFEIT_CURRENCY_AND_STAMPS
    extends StObject
       with _Category
  inline def COUNTERFEIT_CURRENCY_AND_STAMPS: COUNTERFEIT_CURRENCY_AND_STAMPS = "COUNTERFEIT_CURRENCY_AND_STAMPS".asInstanceOf[COUNTERFEIT_CURRENCY_AND_STAMPS]
  
  @js.native
  sealed trait COUNTERFEIT_ITEMS
    extends StObject
       with _Category
  inline def COUNTERFEIT_ITEMS: COUNTERFEIT_ITEMS = "COUNTERFEIT_ITEMS".asInstanceOf[COUNTERFEIT_ITEMS]
  
  @js.native
  sealed trait COUNTRY_CLUBS
    extends StObject
       with _Category
  inline def COUNTRY_CLUBS: COUNTRY_CLUBS = "COUNTRY_CLUBS".asInstanceOf[COUNTRY_CLUBS]
  
  @js.native
  sealed trait COURIER_SERVICES
    extends StObject
       with _Category
  inline def COURIER_SERVICES: COURIER_SERVICES = "COURIER_SERVICES".asInstanceOf[COURIER_SERVICES]
  
  @js.native
  sealed trait COURIER_SERVICES_AIR_AND_GROUND_AND_FREIGHT_FORWARDERS
    extends StObject
       with _Category
  inline def COURIER_SERVICES_AIR_AND_GROUND_AND_FREIGHT_FORWARDERS: COURIER_SERVICES_AIR_AND_GROUND_AND_FREIGHT_FORWARDERS = "COURIER_SERVICES_AIR_AND_GROUND_AND_FREIGHT_FORWARDERS".asInstanceOf[COURIER_SERVICES_AIR_AND_GROUND_AND_FREIGHT_FORWARDERS]
  
  @js.native
  sealed trait COURT_COSTS_ALIMNY_CHILD_SUPT
    extends StObject
       with _Category
  inline def COURT_COSTS_ALIMNY_CHILD_SUPT: COURT_COSTS_ALIMNY_CHILD_SUPT = "COURT_COSTS_ALIMNY_CHILD_SUPT".asInstanceOf[COURT_COSTS_ALIMNY_CHILD_SUPT]
  
  @js.native
  sealed trait CREATED extends StObject
  inline def CREATED: CREATED = "CREATED".asInstanceOf[CREATED]
  
  @js.native
  sealed trait CREDIT_CARDS
    extends StObject
       with _Category
  inline def CREDIT_CARDS: CREDIT_CARDS = "CREDIT_CARDS".asInstanceOf[CREDIT_CARDS]
  
  @js.native
  sealed trait CREDIT_UNION
    extends StObject
       with _Category
  inline def CREDIT_UNION: CREDIT_UNION = "CREDIT_UNION".asInstanceOf[CREDIT_UNION]
  
  @js.native
  sealed trait CULTURE_AND_RELIGION
    extends StObject
       with _Category
  inline def CULTURE_AND_RELIGION: CULTURE_AND_RELIGION = "CULTURE_AND_RELIGION".asInstanceOf[CULTURE_AND_RELIGION]
  
  @js.native
  sealed trait CURRENCY_MISMATCH
    extends StObject
       with PaymentFailureReason
  inline def CURRENCY_MISMATCH: CURRENCY_MISMATCH = "CURRENCY_MISMATCH".asInstanceOf[CURRENCY_MISMATCH]
  
  @js.native
  sealed trait D extends StObject
  inline def D: D = "D".asInstanceOf[D]
  
  @js.native
  sealed trait DAIRY_PRODUCTS_STORES
    extends StObject
       with _Category
  inline def DAIRY_PRODUCTS_STORES: DAIRY_PRODUCTS_STORES = "DAIRY_PRODUCTS_STORES".asInstanceOf[DAIRY_PRODUCTS_STORES]
  
  @js.native
  sealed trait DANCE_HALLS_STUDIOS_AND_SCHOOLS
    extends StObject
       with _Category
  inline def DANCE_HALLS_STUDIOS_AND_SCHOOLS: DANCE_HALLS_STUDIOS_AND_SCHOOLS = "DANCE_HALLS_STUDIOS_AND_SCHOOLS".asInstanceOf[DANCE_HALLS_STUDIOS_AND_SCHOOLS]
  
  @js.native
  sealed trait DAY extends StObject
  inline def DAY: DAY = "DAY".asInstanceOf[DAY]
  
  @js.native
  sealed trait DECLINED
    extends StObject
       with PaymentStatus
  inline def DECLINED: DECLINED = "DECLINED".asInstanceOf[DECLINED]
  
  @js.native
  sealed trait DECORATIVE
    extends StObject
       with _Category
  inline def DECORATIVE: DECORATIVE = "DECORATIVE".asInstanceOf[DECORATIVE]
  
  @js.native
  sealed trait DELAYED extends StObject
  inline def DELAYED: DELAYED = "DELAYED".asInstanceOf[DELAYED]
  
  @js.native
  sealed trait DELETE extends StObject
  inline def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  
  @js.native
  sealed trait DENTAL
    extends StObject
       with _Category
  inline def DENTAL: DENTAL = "DENTAL".asInstanceOf[DENTAL]
  
  @js.native
  sealed trait DENTISTS_AND_ORTHODONTISTS
    extends StObject
       with _Category
  inline def DENTISTS_AND_ORTHODONTISTS: DENTISTS_AND_ORTHODONTISTS = "DENTISTS_AND_ORTHODONTISTS".asInstanceOf[DENTISTS_AND_ORTHODONTISTS]
  
  @js.native
  sealed trait DEPARTMENT_STORES
    extends StObject
       with _Category
  inline def DEPARTMENT_STORES: DEPARTMENT_STORES = "DEPARTMENT_STORES".asInstanceOf[DEPARTMENT_STORES]
  
  @js.native
  sealed trait DESKTOP_PCS
    extends StObject
       with _Category
  inline def DESKTOP_PCS: DESKTOP_PCS = "DESKTOP_PCS".asInstanceOf[DESKTOP_PCS]
  
  @js.native
  sealed trait DEVICES
    extends StObject
       with _Category
  inline def DEVICES: DEVICES = "DEVICES".asInstanceOf[DEVICES]
  
  @js.native
  sealed trait DIECAST_TOYS_VEHICLES
    extends StObject
       with _Category
  inline def DIECAST_TOYS_VEHICLES: DIECAST_TOYS_VEHICLES = "DIECAST_TOYS_VEHICLES".asInstanceOf[DIECAST_TOYS_VEHICLES]
  
  @js.native
  sealed trait DIGITAL
    extends StObject
       with ProductType
  inline def DIGITAL: DIGITAL = "DIGITAL".asInstanceOf[DIGITAL]
  
  @js.native
  sealed trait DIGITAL_GAMES
    extends StObject
       with _Category
  inline def DIGITAL_GAMES: DIGITAL_GAMES = "DIGITAL_GAMES".asInstanceOf[DIGITAL_GAMES]
  
  @js.native
  sealed trait DIGITAL_GOODS extends StObject
  inline def DIGITAL_GOODS: DIGITAL_GOODS = "DIGITAL_GOODS".asInstanceOf[DIGITAL_GOODS]
  
  @js.native
  sealed trait DIGITAL_MEDIA_BOOKS_MOVIES_MUSIC
    extends StObject
       with _Category
  inline def DIGITAL_MEDIA_BOOKS_MOVIES_MUSIC: DIGITAL_MEDIA_BOOKS_MOVIES_MUSIC = "DIGITAL_MEDIA_BOOKS_MOVIES_MUSIC".asInstanceOf[DIGITAL_MEDIA_BOOKS_MOVIES_MUSIC]
  
  @js.native
  sealed trait DIRECT_CREDIT_CARD
    extends StObject
       with ProductCode
  inline def DIRECT_CREDIT_CARD: DIRECT_CREDIT_CARD = "DIRECT_CREDIT_CARD".asInstanceOf[DIRECT_CREDIT_CARD]
  
  @js.native
  sealed trait DIRECT_MARKETING
    extends StObject
       with _Category
  inline def DIRECT_MARKETING: DIRECT_MARKETING = "DIRECT_MARKETING".asInstanceOf[DIRECT_MARKETING]
  
  @js.native
  sealed trait DIRECT_MARKETING_CATALOG_MERCHANT
    extends StObject
       with _Category
  inline def DIRECT_MARKETING_CATALOG_MERCHANT: DIRECT_MARKETING_CATALOG_MERCHANT = "DIRECT_MARKETING_CATALOG_MERCHANT".asInstanceOf[DIRECT_MARKETING_CATALOG_MERCHANT]
  
  @js.native
  sealed trait DIRECT_MARKETING_INBOUND_TELE
    extends StObject
       with _Category
  inline def DIRECT_MARKETING_INBOUND_TELE: DIRECT_MARKETING_INBOUND_TELE = "DIRECT_MARKETING_INBOUND_TELE".asInstanceOf[DIRECT_MARKETING_INBOUND_TELE]
  
  @js.native
  sealed trait DIRECT_MARKETING_OUTBOUND_TELE
    extends StObject
       with _Category
  inline def DIRECT_MARKETING_OUTBOUND_TELE: DIRECT_MARKETING_OUTBOUND_TELE = "DIRECT_MARKETING_OUTBOUND_TELE".asInstanceOf[DIRECT_MARKETING_OUTBOUND_TELE]
  
  @js.native
  sealed trait DIRECT_MARKETING_SUBSCRIPTION
    extends StObject
       with _Category
  inline def DIRECT_MARKETING_SUBSCRIPTION: DIRECT_MARKETING_SUBSCRIPTION = "DIRECT_MARKETING_SUBSCRIPTION".asInstanceOf[DIRECT_MARKETING_SUBSCRIPTION]
  
  @js.native
  sealed trait DISCOUNT_STORES
    extends StObject
       with _Category
  inline def DISCOUNT_STORES: DISCOUNT_STORES = "DISCOUNT_STORES".asInstanceOf[DISCOUNT_STORES]
  
  @js.native
  sealed trait DONATION extends StObject
  inline def DONATION: DONATION = "DONATION".asInstanceOf[DONATION]
  
  @js.native
  sealed trait DOOR_TO_DOOR_SALES
    extends StObject
       with _Category
  inline def DOOR_TO_DOOR_SALES: DOOR_TO_DOOR_SALES = "DOOR_TO_DOOR_SALES".asInstanceOf[DOOR_TO_DOOR_SALES]
  
  @js.native
  sealed trait DRAPERY_WINDOW_COVERING_AND_UPHOLSTERY
    extends StObject
       with _Category
  inline def DRAPERY_WINDOW_COVERING_AND_UPHOLSTERY: DRAPERY_WINDOW_COVERING_AND_UPHOLSTERY = "DRAPERY_WINDOW_COVERING_AND_UPHOLSTERY".asInstanceOf[DRAPERY_WINDOW_COVERING_AND_UPHOLSTERY]
  
  @js.native
  sealed trait DRINKING_PLACES
    extends StObject
       with _Category
  inline def DRINKING_PLACES: DRINKING_PLACES = "DRINKING_PLACES".asInstanceOf[DRINKING_PLACES]
  
  @js.native
  sealed trait DRUGSTORE
    extends StObject
       with _Category
  inline def DRUGSTORE: DRUGSTORE = "DRUGSTORE".asInstanceOf[DRUGSTORE]
  
  @js.native
  sealed trait DURABLE_GOODS
    extends StObject
       with _Category
  inline def DURABLE_GOODS: DURABLE_GOODS = "DURABLE_GOODS".asInstanceOf[DURABLE_GOODS]
  
  @js.native
  sealed trait ECOMMERCE_DEVELOPMENT
    extends StObject
       with _Category
  inline def ECOMMERCE_DEVELOPMENT: ECOMMERCE_DEVELOPMENT = "ECOMMERCE_DEVELOPMENT".asInstanceOf[ECOMMERCE_DEVELOPMENT]
  
  @js.native
  sealed trait ECOMMERCE_SERVICES
    extends StObject
       with _Category
  inline def ECOMMERCE_SERVICES: ECOMMERCE_SERVICES = "ECOMMERCE_SERVICES".asInstanceOf[ECOMMERCE_SERVICES]
  
  @js.native
  sealed trait EDUCATIONAL_AND_TEXTBOOKS
    extends StObject
       with _Category
  inline def EDUCATIONAL_AND_TEXTBOOKS: EDUCATIONAL_AND_TEXTBOOKS = "EDUCATIONAL_AND_TEXTBOOKS".asInstanceOf[EDUCATIONAL_AND_TEXTBOOKS]
  
  @js.native
  sealed trait ELECTRICAL_AND_SMALL_APPLIANCE_REPAIR
    extends StObject
       with _Category
  inline def ELECTRICAL_AND_SMALL_APPLIANCE_REPAIR: ELECTRICAL_AND_SMALL_APPLIANCE_REPAIR = "ELECTRICAL_AND_SMALL_APPLIANCE_REPAIR".asInstanceOf[ELECTRICAL_AND_SMALL_APPLIANCE_REPAIR]
  
  @js.native
  sealed trait ELECTRICAL_CONTRACTORS
    extends StObject
       with _Category
  inline def ELECTRICAL_CONTRACTORS: ELECTRICAL_CONTRACTORS = "ELECTRICAL_CONTRACTORS".asInstanceOf[ELECTRICAL_CONTRACTORS]
  
  @js.native
  sealed trait ELECTRICAL_PARTS_AND_EQUIPMENT
    extends StObject
       with _Category
  inline def ELECTRICAL_PARTS_AND_EQUIPMENT: ELECTRICAL_PARTS_AND_EQUIPMENT = "ELECTRICAL_PARTS_AND_EQUIPMENT".asInstanceOf[ELECTRICAL_PARTS_AND_EQUIPMENT]
  
  @js.native
  sealed trait ELECTRIC_RAZOR_STORES
    extends StObject
       with _Category
  inline def ELECTRIC_RAZOR_STORES: ELECTRIC_RAZOR_STORES = "ELECTRIC_RAZOR_STORES".asInstanceOf[ELECTRIC_RAZOR_STORES]
  
  @js.native
  sealed trait ELECTRONIC_CASH
    extends StObject
       with _Category
  inline def ELECTRONIC_CASH: ELECTRONIC_CASH = "ELECTRONIC_CASH".asInstanceOf[ELECTRONIC_CASH]
  
  @js.native
  sealed trait ELEMENTARY_AND_SECONDARY_SCHOOLS
    extends StObject
       with _Category
  inline def ELEMENTARY_AND_SECONDARY_SCHOOLS: ELEMENTARY_AND_SECONDARY_SCHOOLS = "ELEMENTARY_AND_SECONDARY_SCHOOLS".asInstanceOf[ELEMENTARY_AND_SECONDARY_SCHOOLS]
  
  @js.native
  sealed trait EMPLOYMENT
    extends StObject
       with _Category
  inline def EMPLOYMENT: EMPLOYMENT = "EMPLOYMENT".asInstanceOf[EMPLOYMENT]
  
  @js.native
  sealed trait ENTERTAINERS
    extends StObject
       with _Category
  inline def ENTERTAINERS: ENTERTAINERS = "ENTERTAINERS".asInstanceOf[ENTERTAINERS]
  
  @js.native
  sealed trait ENTERTAINMENT_AND_MEDIA
    extends StObject
       with _Category
  inline def ENTERTAINMENT_AND_MEDIA: ENTERTAINMENT_AND_MEDIA = "ENTERTAINMENT_AND_MEDIA".asInstanceOf[ENTERTAINMENT_AND_MEDIA]
  
  @js.native
  sealed trait EQUIP_TOOL_FURNITURE_AND_APPLIANCE_RENTAL_AND_LEASING
    extends StObject
       with _Category
  inline def EQUIP_TOOL_FURNITURE_AND_APPLIANCE_RENTAL_AND_LEASING: EQUIP_TOOL_FURNITURE_AND_APPLIANCE_RENTAL_AND_LEASING = "EQUIP_TOOL_FURNITURE_AND_APPLIANCE_RENTAL_AND_LEASING".asInstanceOf[EQUIP_TOOL_FURNITURE_AND_APPLIANCE_RENTAL_AND_LEASING]
  
  @js.native
  sealed trait ESCROW
    extends StObject
       with _Category
  inline def ESCROW: ESCROW = "ESCROW".asInstanceOf[ESCROW]
  
  @js.native
  sealed trait EUR extends StObject
  inline def EUR: EUR = "EUR".asInstanceOf[EUR]
  
  @js.native
  sealed trait EVENT_AND_WEDDING_PLANNING
    extends StObject
       with _Category
  inline def EVENT_AND_WEDDING_PLANNING: EVENT_AND_WEDDING_PLANNING = "EVENT_AND_WEDDING_PLANNING".asInstanceOf[EVENT_AND_WEDDING_PLANNING]
  
  @js.native
  sealed trait EXERCISE_AND_FITNESS
    extends StObject
       with _Category
  inline def EXERCISE_AND_FITNESS: EXERCISE_AND_FITNESS = "EXERCISE_AND_FITNESS".asInstanceOf[EXERCISE_AND_FITNESS]
  
  @js.native
  sealed trait EXERCISE_EQUIPMENT
    extends StObject
       with _Category
  inline def EXERCISE_EQUIPMENT: EXERCISE_EQUIPMENT = "EXERCISE_EQUIPMENT".asInstanceOf[EXERCISE_EQUIPMENT]
  
  @js.native
  sealed trait EXPIRED
    extends StObject
       with Status
  inline def EXPIRED: EXPIRED = "EXPIRED".asInstanceOf[EXPIRED]
  
  @js.native
  sealed trait EXPRESS_CHECKOUT
    extends StObject
       with ProductCode
  inline def EXPRESS_CHECKOUT: EXPRESS_CHECKOUT = "EXPRESS_CHECKOUT".asInstanceOf[EXPRESS_CHECKOUT]
  
  @js.native
  sealed trait EXTERMINATING_AND_DISINFECTING_SERVICES
    extends StObject
       with _Category
  inline def EXTERMINATING_AND_DISINFECTING_SERVICES: EXTERMINATING_AND_DISINFECTING_SERVICES = "EXTERMINATING_AND_DISINFECTING_SERVICES".asInstanceOf[EXTERMINATING_AND_DISINFECTING_SERVICES]
  
  @js.native
  sealed trait FABRICS_AND_SEWING
    extends StObject
       with _Category
  inline def FABRICS_AND_SEWING: FABRICS_AND_SEWING = "FABRICS_AND_SEWING".asInstanceOf[FABRICS_AND_SEWING]
  
  @js.native
  sealed trait FACILITATOR
    extends StObject
       with StatusChangedBy
  inline def FACILITATOR: FACILITATOR = "FACILITATOR".asInstanceOf[FACILITATOR]
  
  @js.native
  sealed trait FAILED
    extends StObject
       with PaymentStatus
  inline def FAILED: FAILED = "FAILED".asInstanceOf[FAILED]
  
  @js.native
  sealed trait FAMILY_CLOTHING_STORES
    extends StObject
       with _Category
  inline def FAMILY_CLOTHING_STORES: FAMILY_CLOTHING_STORES = "FAMILY_CLOTHING_STORES".asInstanceOf[FAMILY_CLOTHING_STORES]
  
  @js.native
  sealed trait FASHION_JEWELRY
    extends StObject
       with _Category
  inline def FASHION_JEWELRY: FASHION_JEWELRY = "FASHION_JEWELRY".asInstanceOf[FASHION_JEWELRY]
  
  @js.native
  sealed trait FAST_FOOD_RESTAURANTS
    extends StObject
       with _Category
  inline def FAST_FOOD_RESTAURANTS: FAST_FOOD_RESTAURANTS = "FAST_FOOD_RESTAURANTS".asInstanceOf[FAST_FOOD_RESTAURANTS]
  
  @js.native
  sealed trait FICTION_AND_NONFICTION
    extends StObject
       with _Category
  inline def FICTION_AND_NONFICTION: FICTION_AND_NONFICTION = "FICTION_AND_NONFICTION".asInstanceOf[FICTION_AND_NONFICTION]
  
  @js.native
  sealed trait FINANCE_COMPANY
    extends StObject
       with _Category
  inline def FINANCE_COMPANY: FINANCE_COMPANY = "FINANCE_COMPANY".asInstanceOf[FINANCE_COMPANY]
  
  @js.native
  sealed trait FINANCIAL_AND_INVESTMENT_ADVICE
    extends StObject
       with _Category
  inline def FINANCIAL_AND_INVESTMENT_ADVICE: FINANCIAL_AND_INVESTMENT_ADVICE = "FINANCIAL_AND_INVESTMENT_ADVICE".asInstanceOf[FINANCIAL_AND_INVESTMENT_ADVICE]
  
  @js.native
  sealed trait FINANCIAL_INSTITUTIONS_MERCHANDISE_AND_SERVICES
    extends StObject
       with _Category
  inline def FINANCIAL_INSTITUTIONS_MERCHANDISE_AND_SERVICES: FINANCIAL_INSTITUTIONS_MERCHANDISE_AND_SERVICES = "FINANCIAL_INSTITUTIONS_MERCHANDISE_AND_SERVICES".asInstanceOf[FINANCIAL_INSTITUTIONS_MERCHANDISE_AND_SERVICES]
  
  @js.native
  sealed trait FIREARMS_WEAPONS_AND_KNIVES
    extends StObject
       with _Category
  inline def FIREARMS_WEAPONS_AND_KNIVES: FIREARMS_WEAPONS_AND_KNIVES = "FIREARMS_WEAPONS_AND_KNIVES".asInstanceOf[FIREARMS_WEAPONS_AND_KNIVES]
  
  @js.native
  sealed trait FIREARM_ACCESSORIES
    extends StObject
       with _Category
  inline def FIREARM_ACCESSORIES: FIREARM_ACCESSORIES = "FIREARM_ACCESSORIES".asInstanceOf[FIREARM_ACCESSORIES]
  
  @js.native
  sealed trait FIREPLACE_AND_FIREPLACE_SCREENS
    extends StObject
       with _Category
  inline def FIREPLACE_AND_FIREPLACE_SCREENS: FIREPLACE_AND_FIREPLACE_SCREENS = "FIREPLACE_AND_FIREPLACE_SCREENS".asInstanceOf[FIREPLACE_AND_FIREPLACE_SCREENS]
  
  @js.native
  sealed trait FIREWORKS
    extends StObject
       with _Category
  inline def FIREWORKS: FIREWORKS = "FIREWORKS".asInstanceOf[FIREWORKS]
  
  @js.native
  sealed trait FISHING
    extends StObject
       with _Category
  inline def FISHING: FISHING = "FISHING".asInstanceOf[FISHING]
  
  @js.native
  sealed trait FLORISTS
    extends StObject
       with _Category
  inline def FLORISTS: FLORISTS = "FLORISTS".asInstanceOf[FLORISTS]
  
  @js.native
  sealed trait FLOWERS
    extends StObject
       with _Category
  inline def FLOWERS: FLOWERS = "FLOWERS".asInstanceOf[FLOWERS]
  
  @js.native
  sealed trait FOOD_DRINK_AND_NUTRITION
    extends StObject
       with _Category
  inline def FOOD_DRINK_AND_NUTRITION: FOOD_DRINK_AND_NUTRITION = "FOOD_DRINK_AND_NUTRITION".asInstanceOf[FOOD_DRINK_AND_NUTRITION]
  
  @js.native
  sealed trait FOOD_PRODUCTS
    extends StObject
       with _Category
  inline def FOOD_PRODUCTS: FOOD_PRODUCTS = "FOOD_PRODUCTS".asInstanceOf[FOOD_PRODUCTS]
  
  @js.native
  sealed trait FOOD_RETAIL_AND_SERVICE
    extends StObject
       with _Category
  inline def FOOD_RETAIL_AND_SERVICE: FOOD_RETAIL_AND_SERVICE = "FOOD_RETAIL_AND_SERVICE".asInstanceOf[FOOD_RETAIL_AND_SERVICE]
  
  @js.native
  sealed trait FRAGRANCES_AND_PERFUMES
    extends StObject
       with _Category
  inline def FRAGRANCES_AND_PERFUMES: FRAGRANCES_AND_PERFUMES = "FRAGRANCES_AND_PERFUMES".asInstanceOf[FRAGRANCES_AND_PERFUMES]
  
  @js.native
  sealed trait FREEZER_AND_LOCKER_MEAT_PROVISIONERS
    extends StObject
       with _Category
  inline def FREEZER_AND_LOCKER_MEAT_PROVISIONERS: FREEZER_AND_LOCKER_MEAT_PROVISIONERS = "FREEZER_AND_LOCKER_MEAT_PROVISIONERS".asInstanceOf[FREEZER_AND_LOCKER_MEAT_PROVISIONERS]
  
  @js.native
  sealed trait FUEL_DEALERS_FUEL_OIL_WOOD_AND_COAL
    extends StObject
       with _Category
  inline def FUEL_DEALERS_FUEL_OIL_WOOD_AND_COAL: FUEL_DEALERS_FUEL_OIL_WOOD_AND_COAL = "FUEL_DEALERS_FUEL_OIL_WOOD_AND_COAL".asInstanceOf[FUEL_DEALERS_FUEL_OIL_WOOD_AND_COAL]
  
  @js.native
  sealed trait FUEL_DEALERS_NON_AUTOMOTIVE
    extends StObject
       with _Category
  inline def FUEL_DEALERS_NON_AUTOMOTIVE: FUEL_DEALERS_NON_AUTOMOTIVE = "FUEL_DEALERS_NON_AUTOMOTIVE".asInstanceOf[FUEL_DEALERS_NON_AUTOMOTIVE]
  
  @js.native
  sealed trait FULL_PAGE
    extends StObject
       with UserExperienceFlow
  inline def FULL_PAGE: FULL_PAGE = "FULL_PAGE".asInstanceOf[FULL_PAGE]
  
  @js.native
  sealed trait FULL_PAGE_REDIRECT
    extends StObject
       with UserExperienceFlow
  inline def FULL_PAGE_REDIRECT: FULL_PAGE_REDIRECT = "FULL_PAGE_REDIRECT".asInstanceOf[FULL_PAGE_REDIRECT]
  
  @js.native
  sealed trait FUNERAL_SERVICES_AND_CREMATORIES
    extends StObject
       with _Category
  inline def FUNERAL_SERVICES_AND_CREMATORIES: FUNERAL_SERVICES_AND_CREMATORIES = "FUNERAL_SERVICES_AND_CREMATORIES".asInstanceOf[FUNERAL_SERVICES_AND_CREMATORIES]
  
  @js.native
  sealed trait FURNISHING_AND_DECORATING
    extends StObject
       with _Category
  inline def FURNISHING_AND_DECORATING: FURNISHING_AND_DECORATING = "FURNISHING_AND_DECORATING".asInstanceOf[FURNISHING_AND_DECORATING]
  
  @js.native
  sealed trait FURNITURE
    extends StObject
       with _Category
  inline def FURNITURE: FURNITURE = "FURNITURE".asInstanceOf[FURNITURE]
  
  @js.native
  sealed trait FURRIERS_AND_FUR_SHOPS
    extends StObject
       with _Category
  inline def FURRIERS_AND_FUR_SHOPS: FURRIERS_AND_FUR_SHOPS = "FURRIERS_AND_FUR_SHOPS".asInstanceOf[FURRIERS_AND_FUR_SHOPS]
  
  @js.native
  sealed trait GADGETS_AND_OTHER_ELECTRONICS
    extends StObject
       with _Category
  inline def GADGETS_AND_OTHER_ELECTRONICS: GADGETS_AND_OTHER_ELECTRONICS = "GADGETS_AND_OTHER_ELECTRONICS".asInstanceOf[GADGETS_AND_OTHER_ELECTRONICS]
  
  @js.native
  sealed trait GAMBLING
    extends StObject
       with _Category
  inline def GAMBLING: GAMBLING = "GAMBLING".asInstanceOf[GAMBLING]
  
  @js.native
  sealed trait GAMES
    extends StObject
       with _Category
  inline def GAMES: GAMES = "GAMES".asInstanceOf[GAMES]
  
  @js.native
  sealed trait GAME_SOFTWARE
    extends StObject
       with _Category
  inline def GAME_SOFTWARE: GAME_SOFTWARE = "GAME_SOFTWARE".asInstanceOf[GAME_SOFTWARE]
  
  @js.native
  sealed trait GARDEN_SUPPLIES
    extends StObject
       with _Category
  inline def GARDEN_SUPPLIES: GARDEN_SUPPLIES = "GARDEN_SUPPLIES".asInstanceOf[GARDEN_SUPPLIES]
  
  @js.native
  sealed trait GBP extends StObject
  inline def GBP: GBP = "GBP".asInstanceOf[GBP]
  
  @js.native
  sealed trait GENERAL
    extends StObject
       with _Category
  inline def GENERAL: GENERAL = "GENERAL".asInstanceOf[GENERAL]
  
  @js.native
  sealed trait GENERAL_CONTRACTORS
    extends StObject
       with _Category
  inline def GENERAL_CONTRACTORS: GENERAL_CONTRACTORS = "GENERAL_CONTRACTORS".asInstanceOf[GENERAL_CONTRACTORS]
  
  @js.native
  sealed trait GENERAL_GOVERNMENT
    extends StObject
       with _Category
  inline def GENERAL_GOVERNMENT: GENERAL_GOVERNMENT = "GENERAL_GOVERNMENT".asInstanceOf[GENERAL_GOVERNMENT]
  
  @js.native
  sealed trait GENERAL_SOFTWARE
    extends StObject
       with _Category
  inline def GENERAL_SOFTWARE: GENERAL_SOFTWARE = "GENERAL_SOFTWARE".asInstanceOf[GENERAL_SOFTWARE]
  
  @js.native
  sealed trait GENERAL_TELECOM
    extends StObject
       with _Category
  inline def GENERAL_TELECOM: GENERAL_TELECOM = "GENERAL_TELECOM".asInstanceOf[GENERAL_TELECOM]
  
  @js.native
  sealed trait GET extends StObject
  inline def GET: GET = "GET".asInstanceOf[GET]
  
  @js.native
  sealed trait GET_FROM_FILE
    extends StObject
       with SHIPPING_PREFERENCE
  inline def GET_FROM_FILE: GET_FROM_FILE = "GET_FROM_FILE".asInstanceOf[GET_FROM_FILE]
  
  @js.native
  sealed trait GIFTS_AND_FLOWERS
    extends StObject
       with _Category
  inline def GIFTS_AND_FLOWERS: GIFTS_AND_FLOWERS = "GIFTS_AND_FLOWERS".asInstanceOf[GIFTS_AND_FLOWERS]
  
  @js.native
  sealed trait GLASSWARE_CRYSTAL_STORES
    extends StObject
       with _Category
  inline def GLASSWARE_CRYSTAL_STORES: GLASSWARE_CRYSTAL_STORES = "GLASSWARE_CRYSTAL_STORES".asInstanceOf[GLASSWARE_CRYSTAL_STORES]
  
  @js.native
  sealed trait GLASS_PAINT_AND_WALLPAPER_STORES
    extends StObject
       with _Category
  inline def GLASS_PAINT_AND_WALLPAPER_STORES: GLASS_PAINT_AND_WALLPAPER_STORES = "GLASS_PAINT_AND_WALLPAPER_STORES".asInstanceOf[GLASS_PAINT_AND_WALLPAPER_STORES]
  
  @js.native
  sealed trait GOVERNMENT
    extends StObject
       with _Category
  inline def GOVERNMENT: GOVERNMENT = "GOVERNMENT".asInstanceOf[GOVERNMENT]
  
  @js.native
  sealed trait GOVERNMENT_IDS_AND_LICENSES
    extends StObject
       with _Category
  inline def GOVERNMENT_IDS_AND_LICENSES: GOVERNMENT_IDS_AND_LICENSES = "GOVERNMENT_IDS_AND_LICENSES".asInstanceOf[GOVERNMENT_IDS_AND_LICENSES]
  
  @js.native
  sealed trait GOVERNMENT_LICENSED_ON_LINE_CASINOS_ON_LINE_GAMBLING
    extends StObject
       with _Category
  inline def GOVERNMENT_LICENSED_ON_LINE_CASINOS_ON_LINE_GAMBLING: GOVERNMENT_LICENSED_ON_LINE_CASINOS_ON_LINE_GAMBLING = "GOVERNMENT_LICENSED_ON_LINE_CASINOS_ON_LINE_GAMBLING".asInstanceOf[GOVERNMENT_LICENSED_ON_LINE_CASINOS_ON_LINE_GAMBLING]
  
  @js.native
  sealed trait GOVERNMENT_OWNED_LOTTERIES
    extends StObject
       with _Category
  inline def GOVERNMENT_OWNED_LOTTERIES: GOVERNMENT_OWNED_LOTTERIES = "GOVERNMENT_OWNED_LOTTERIES".asInstanceOf[GOVERNMENT_OWNED_LOTTERIES]
  
  @js.native
  sealed trait GOVERNMENT_SERVICES
    extends StObject
       with _Category
  inline def GOVERNMENT_SERVICES: GOVERNMENT_SERVICES = "GOVERNMENT_SERVICES".asInstanceOf[GOVERNMENT_SERVICES]
  
  @js.native
  sealed trait GRAPHIC_AND_COMMERCIAL_DESIGN
    extends StObject
       with _Category
  inline def GRAPHIC_AND_COMMERCIAL_DESIGN: GRAPHIC_AND_COMMERCIAL_DESIGN = "GRAPHIC_AND_COMMERCIAL_DESIGN".asInstanceOf[GRAPHIC_AND_COMMERCIAL_DESIGN]
  
  @js.native
  sealed trait GREETING_CARDS
    extends StObject
       with _Category
  inline def GREETING_CARDS: GREETING_CARDS = "GREETING_CARDS".asInstanceOf[GREETING_CARDS]
  
  @js.native
  sealed trait GROCERY_STORES_AND_SUPERMARKETS
    extends StObject
       with _Category
  inline def GROCERY_STORES_AND_SUPERMARKETS: GROCERY_STORES_AND_SUPERMARKETS = "GROCERY_STORES_AND_SUPERMARKETS".asInstanceOf[GROCERY_STORES_AND_SUPERMARKETS]
  
  @js.native
  sealed trait HARDWARE_AND_TOOLS
    extends StObject
       with _Category
  inline def HARDWARE_AND_TOOLS: HARDWARE_AND_TOOLS = "HARDWARE_AND_TOOLS".asInstanceOf[HARDWARE_AND_TOOLS]
  
  @js.native
  sealed trait HARDWARE_EQUIPMENT_AND_SUPPLIES
    extends StObject
       with _Category
  inline def HARDWARE_EQUIPMENT_AND_SUPPLIES: HARDWARE_EQUIPMENT_AND_SUPPLIES = "HARDWARE_EQUIPMENT_AND_SUPPLIES".asInstanceOf[HARDWARE_EQUIPMENT_AND_SUPPLIES]
  
  @js.native
  sealed trait HAZARDOUS_RESTRICTED_AND_PERISHABLE_ITEMS
    extends StObject
       with _Category
  inline def HAZARDOUS_RESTRICTED_AND_PERISHABLE_ITEMS: HAZARDOUS_RESTRICTED_AND_PERISHABLE_ITEMS = "HAZARDOUS_RESTRICTED_AND_PERISHABLE_ITEMS".asInstanceOf[HAZARDOUS_RESTRICTED_AND_PERISHABLE_ITEMS]
  
  @js.native
  sealed trait HEAD extends StObject
  inline def HEAD: HEAD = "HEAD".asInstanceOf[HEAD]
  
  @js.native
  sealed trait HEALTH_AND_BEAUTY_SPAS
    extends StObject
       with _Category
  inline def HEALTH_AND_BEAUTY_SPAS: HEALTH_AND_BEAUTY_SPAS = "HEALTH_AND_BEAUTY_SPAS".asInstanceOf[HEALTH_AND_BEAUTY_SPAS]
  
  @js.native
  sealed trait HEALTH_AND_NUTRITION
    extends StObject
       with _Category
  inline def HEALTH_AND_NUTRITION: HEALTH_AND_NUTRITION = "HEALTH_AND_NUTRITION".asInstanceOf[HEALTH_AND_NUTRITION]
  
  @js.native
  sealed trait HEALTH_AND_PERSONAL_CARE
    extends StObject
       with _Category
  inline def HEALTH_AND_PERSONAL_CARE: HEALTH_AND_PERSONAL_CARE = "HEALTH_AND_PERSONAL_CARE".asInstanceOf[HEALTH_AND_PERSONAL_CARE]
  
  @js.native
  sealed trait HEARING_AIDS_SALES_AND_SUPPLIES
    extends StObject
       with _Category
  inline def HEARING_AIDS_SALES_AND_SUPPLIES: HEARING_AIDS_SALES_AND_SUPPLIES = "HEARING_AIDS_SALES_AND_SUPPLIES".asInstanceOf[HEARING_AIDS_SALES_AND_SUPPLIES]
  
  @js.native
  sealed trait HEATING_PLUMBING_AC
    extends StObject
       with _Category
  inline def HEATING_PLUMBING_AC: HEATING_PLUMBING_AC = "HEATING_PLUMBING_AC".asInstanceOf[HEATING_PLUMBING_AC]
  
  @js.native
  sealed trait HERMES
    extends StObject
       with ProductFlow
  inline def HERMES: HERMES = "HERMES".asInstanceOf[HERMES]
  
  @js.native
  sealed trait HIGH_RISK_MERCHANT
    extends StObject
       with _Category
  inline def HIGH_RISK_MERCHANT: HIGH_RISK_MERCHANT = "HIGH_RISK_MERCHANT".asInstanceOf[HIGH_RISK_MERCHANT]
  
  @js.native
  sealed trait HIRING_SERVICES
    extends StObject
       with _Category
  inline def HIRING_SERVICES: HIRING_SERVICES = "HIRING_SERVICES".asInstanceOf[HIRING_SERVICES]
  
  @js.native
  sealed trait HOBBIES_TOYS_AND_GAMES
    extends StObject
       with _Category
  inline def HOBBIES_TOYS_AND_GAMES: HOBBIES_TOYS_AND_GAMES = "HOBBIES_TOYS_AND_GAMES".asInstanceOf[HOBBIES_TOYS_AND_GAMES]
  
  @js.native
  sealed trait HOME_AND_GARDEN
    extends StObject
       with _Category
  inline def HOME_AND_GARDEN: HOME_AND_GARDEN = "HOME_AND_GARDEN".asInstanceOf[HOME_AND_GARDEN]
  
  @js.native
  sealed trait HOME_AUDIO
    extends StObject
       with _Category
  inline def HOME_AUDIO: HOME_AUDIO = "HOME_AUDIO".asInstanceOf[HOME_AUDIO]
  
  @js.native
  sealed trait HOME_DECOR
    extends StObject
       with _Category
  inline def HOME_DECOR: HOME_DECOR = "HOME_DECOR".asInstanceOf[HOME_DECOR]
  
  @js.native
  sealed trait HOME_ELECTRONICS
    extends StObject
       with _Category
  inline def HOME_ELECTRONICS: HOME_ELECTRONICS = "HOME_ELECTRONICS".asInstanceOf[HOME_ELECTRONICS]
  
  @js.native
  sealed trait HOSPITALS
    extends StObject
       with _Category
  inline def HOSPITALS: HOSPITALS = "HOSPITALS".asInstanceOf[HOSPITALS]
  
  @js.native
  sealed trait HOTELS_MOTELS_INNS_RESORTS
    extends StObject
       with _Category
  inline def HOTELS_MOTELS_INNS_RESORTS: HOTELS_MOTELS_INNS_RESORTS = "HOTELS_MOTELS_INNS_RESORTS".asInstanceOf[HOTELS_MOTELS_INNS_RESORTS]
  
  @js.native
  sealed trait HOUSEWARES
    extends StObject
       with _Category
  inline def HOUSEWARES: HOUSEWARES = "HOUSEWARES".asInstanceOf[HOUSEWARES]
  
  @js.native
  sealed trait HUMAN_PARTS_AND_REMAINS
    extends StObject
       with _Category
  inline def HUMAN_PARTS_AND_REMAINS: HUMAN_PARTS_AND_REMAINS = "HUMAN_PARTS_AND_REMAINS".asInstanceOf[HUMAN_PARTS_AND_REMAINS]
  
  @js.native
  sealed trait HUMOROUS_GIFTS_AND_NOVELTIES
    extends StObject
       with _Category
  inline def HUMOROUS_GIFTS_AND_NOVELTIES: HUMOROUS_GIFTS_AND_NOVELTIES = "HUMOROUS_GIFTS_AND_NOVELTIES".asInstanceOf[HUMOROUS_GIFTS_AND_NOVELTIES]
  
  @js.native
  sealed trait HUNTING
    extends StObject
       with _Category
  inline def HUNTING: HUNTING = "HUNTING".asInstanceOf[HUNTING]
  
  @js.native
  sealed trait I extends StObject
  inline def I: I = "I".asInstanceOf[I]
  
  @js.native
  sealed trait IDENTITY
    extends StObject
       with API
  inline def IDENTITY: IDENTITY = "IDENTITY".asInstanceOf[IDENTITY]
  
  @js.native
  sealed trait IDS_LICENSES_AND_PASSPORTS
    extends StObject
       with _Category
  inline def IDS_LICENSES_AND_PASSPORTS: IDS_LICENSES_AND_PASSPORTS = "IDS_LICENSES_AND_PASSPORTS".asInstanceOf[IDS_LICENSES_AND_PASSPORTS]
  
  @js.native
  sealed trait ILLEGAL_DRUGS_AND_PARAPHERNALIA
    extends StObject
       with _Category
  inline def ILLEGAL_DRUGS_AND_PARAPHERNALIA: ILLEGAL_DRUGS_AND_PARAPHERNALIA = "ILLEGAL_DRUGS_AND_PARAPHERNALIA".asInstanceOf[ILLEGAL_DRUGS_AND_PARAPHERNALIA]
  
  @js.native
  sealed trait INACTIVE extends StObject
  inline def INACTIVE: INACTIVE = "INACTIVE".asInstanceOf[INACTIVE]
  
  @js.native
  sealed trait INCONTEXT
    extends StObject
       with UserExperienceFlow
  inline def INCONTEXT: INCONTEXT = "INCONTEXT".asInstanceOf[INCONTEXT]
  
  @js.native
  sealed trait INDUSTRIAL
    extends StObject
       with _Category
  inline def INDUSTRIAL: INDUSTRIAL = "INDUSTRIAL".asInstanceOf[INDUSTRIAL]
  
  @js.native
  sealed trait INDUSTRIAL_AND_MANUFACTURING_SUPPLIES
    extends StObject
       with _Category
  inline def INDUSTRIAL_AND_MANUFACTURING_SUPPLIES: INDUSTRIAL_AND_MANUFACTURING_SUPPLIES = "INDUSTRIAL_AND_MANUFACTURING_SUPPLIES".asInstanceOf[INDUSTRIAL_AND_MANUFACTURING_SUPPLIES]
  
  @js.native
  sealed trait INLINE
    extends StObject
       with UserExperienceFlow
  inline def INLINE: INLINE = "INLINE".asInstanceOf[INLINE]
  
  @js.native
  sealed trait INSTANT extends StObject
  inline def INSTANT: INSTANT = "INSTANT".asInstanceOf[INSTANT]
  
  @js.native
  sealed trait INSURANCE_AUTO_AND_HOME
    extends StObject
       with _Category
  inline def INSURANCE_AUTO_AND_HOME: INSURANCE_AUTO_AND_HOME = "INSURANCE_AUTO_AND_HOME".asInstanceOf[INSURANCE_AUTO_AND_HOME]
  
  @js.native
  sealed trait INSURANCE_DIRECT
    extends StObject
       with _Category
  inline def INSURANCE_DIRECT: INSURANCE_DIRECT = "INSURANCE_DIRECT".asInstanceOf[INSURANCE_DIRECT]
  
  @js.native
  sealed trait INSURANCE_LIFE_AND_ANNUITY
    extends StObject
       with _Category
  inline def INSURANCE_LIFE_AND_ANNUITY: INSURANCE_LIFE_AND_ANNUITY = "INSURANCE_LIFE_AND_ANNUITY".asInstanceOf[INSURANCE_LIFE_AND_ANNUITY]
  
  @js.native
  sealed trait INSURANCE_SALES_UNDERWRITING
    extends StObject
       with _Category
  inline def INSURANCE_SALES_UNDERWRITING: INSURANCE_SALES_UNDERWRITING = "INSURANCE_SALES_UNDERWRITING".asInstanceOf[INSURANCE_SALES_UNDERWRITING]
  
  @js.native
  sealed trait INSURANCE_UNDERWRITING_PREMIUMS
    extends StObject
       with _Category
  inline def INSURANCE_UNDERWRITING_PREMIUMS: INSURANCE_UNDERWRITING_PREMIUMS = "INSURANCE_UNDERWRITING_PREMIUMS".asInstanceOf[INSURANCE_UNDERWRITING_PREMIUMS]
  
  @js.native
  sealed trait INTERNAL_SERVER_ERROR
    extends StObject
       with PaymentFailureReason
  inline def INTERNAL_SERVER_ERROR: INTERNAL_SERVER_ERROR = "INTERNAL_SERVER_ERROR".asInstanceOf[INTERNAL_SERVER_ERROR]
  
  @js.native
  sealed trait INTERNET_AND_NETWORK_SERVICES
    extends StObject
       with _Category
  inline def INTERNET_AND_NETWORK_SERVICES: INTERNET_AND_NETWORK_SERVICES = "INTERNET_AND_NETWORK_SERVICES".asInstanceOf[INTERNET_AND_NETWORK_SERVICES]
  
  @js.native
  sealed trait INTRA_COMPANY_PURCHASES
    extends StObject
       with _Category
  inline def INTRA_COMPANY_PURCHASES: INTRA_COMPANY_PURCHASES = "INTRA_COMPANY_PURCHASES".asInstanceOf[INTRA_COMPANY_PURCHASES]
  
  @js.native
  sealed trait INVOICING
    extends StObject
       with ProductCode
  inline def INVOICING: INVOICING = "INVOICING".asInstanceOf[INVOICING]
  
  @js.native
  sealed trait INVOICING_V1
    extends StObject
       with API
  inline def INVOICING_V1: INVOICING_V1 = "INVOICING_V1".asInstanceOf[INVOICING_V1]
  
  @js.native
  sealed trait INVOICING_V2
    extends StObject
       with API
  inline def INVOICING_V2: INVOICING_V2 = "INVOICING_V2".asInstanceOf[INVOICING_V2]
  
  @js.native
  sealed trait IN_PROGRESS extends StObject
  inline def IN_PROGRESS: IN_PROGRESS = "IN_PROGRESS".asInstanceOf[IN_PROGRESS]
  
  @js.native
  sealed trait JS_V3
    extends StObject
       with IntegrationArtifact
  inline def JS_V3: JS_V3 = "JS_V3".asInstanceOf[JS_V3]
  
  @js.native
  sealed trait JS_V4
    extends StObject
       with IntegrationArtifact
  inline def JS_V4: JS_V4 = "JS_V4".asInstanceOf[JS_V4]
  
  @js.native
  sealed trait LABORATORIES_DENTAL_MEDICAL
    extends StObject
       with _Category
  inline def LABORATORIES_DENTAL_MEDICAL: LABORATORIES_DENTAL_MEDICAL = "LABORATORIES_DENTAL_MEDICAL".asInstanceOf[LABORATORIES_DENTAL_MEDICAL]
  
  @js.native
  sealed trait LANDSCAPING
    extends StObject
       with _Category
  inline def LANDSCAPING: LANDSCAPING = "LANDSCAPING".asInstanceOf[LANDSCAPING]
  
  @js.native
  sealed trait LANDSCAPING_AND_HORTICULTURAL_SERVICES
    extends StObject
       with _Category
  inline def LANDSCAPING_AND_HORTICULTURAL_SERVICES: LANDSCAPING_AND_HORTICULTURAL_SERVICES = "LANDSCAPING_AND_HORTICULTURAL_SERVICES".asInstanceOf[LANDSCAPING_AND_HORTICULTURAL_SERVICES]
  
  @js.native
  sealed trait LAUNDRY_CLEANING_SERVICES
    extends StObject
       with _Category
  inline def LAUNDRY_CLEANING_SERVICES: LAUNDRY_CLEANING_SERVICES = "LAUNDRY_CLEANING_SERVICES".asInstanceOf[LAUNDRY_CLEANING_SERVICES]
  
  @js.native
  sealed trait LEGACY_BILLING_API
    extends StObject
       with API
  inline def LEGACY_BILLING_API: LEGACY_BILLING_API = "LEGACY_BILLING_API".asInstanceOf[LEGACY_BILLING_API]
  
  @js.native
  sealed trait LEGACY_BILLING_CBA_API
    extends StObject
       with API
  inline def LEGACY_BILLING_CBA_API: LEGACY_BILLING_CBA_API = "LEGACY_BILLING_CBA_API".asInstanceOf[LEGACY_BILLING_CBA_API]
  
  @js.native
  sealed trait LEGACY_CHECKOUT_API
    extends StObject
       with API
  inline def LEGACY_CHECKOUT_API: LEGACY_CHECKOUT_API = "LEGACY_CHECKOUT_API".asInstanceOf[LEGACY_CHECKOUT_API]
  
  @js.native
  sealed trait LEGACY_RECURRING_PAYMENTS
    extends StObject
       with API
  inline def LEGACY_RECURRING_PAYMENTS: LEGACY_RECURRING_PAYMENTS = "LEGACY_RECURRING_PAYMENTS".asInstanceOf[LEGACY_RECURRING_PAYMENTS]
  
  @js.native
  sealed trait LEGAL
    extends StObject
       with _Category
  inline def LEGAL: LEGAL = "LEGAL".asInstanceOf[LEGAL]
  
  @js.native
  sealed trait LEGAL_SERVICES_AND_ATTORNEYS
    extends StObject
       with _Category
  inline def LEGAL_SERVICES_AND_ATTORNEYS: LEGAL_SERVICES_AND_ATTORNEYS = "LEGAL_SERVICES_AND_ATTORNEYS".asInstanceOf[LEGAL_SERVICES_AND_ATTORNEYS]
  
  @js.native
  sealed trait LOCAL_DELIVERY_SERVICE
    extends StObject
       with _Category
  inline def LOCAL_DELIVERY_SERVICE: LOCAL_DELIVERY_SERVICE = "LOCAL_DELIVERY_SERVICE".asInstanceOf[LOCAL_DELIVERY_SERVICE]
  
  @js.native
  sealed trait LOCKSMITH
    extends StObject
       with _Category
  inline def LOCKSMITH: LOCKSMITH = "LOCKSMITH".asInstanceOf[LOCKSMITH]
  
  @js.native
  sealed trait LODGING_AND_ACCOMMODATIONS
    extends StObject
       with _Category
  inline def LODGING_AND_ACCOMMODATIONS: LODGING_AND_ACCOMMODATIONS = "LODGING_AND_ACCOMMODATIONS".asInstanceOf[LODGING_AND_ACCOMMODATIONS]
  
  @js.native
  sealed trait LOGIN extends StObject
  inline def LOGIN: LOGIN = "LOGIN".asInstanceOf[LOGIN]
  
  @js.native
  sealed trait LOTTERY_AND_CONTESTS
    extends StObject
       with _Category
  inline def LOTTERY_AND_CONTESTS: LOTTERY_AND_CONTESTS = "LOTTERY_AND_CONTESTS".asInstanceOf[LOTTERY_AND_CONTESTS]
  
  @js.native
  sealed trait LUGGAGE_AND_LEATHER_GOODS
    extends StObject
       with _Category
  inline def LUGGAGE_AND_LEATHER_GOODS: LUGGAGE_AND_LEATHER_GOODS = "LUGGAGE_AND_LEATHER_GOODS".asInstanceOf[LUGGAGE_AND_LEATHER_GOODS]
  
  @js.native
  sealed trait LUMBER_AND_BUILDING_MATERIALS
    extends StObject
       with _Category
  inline def LUMBER_AND_BUILDING_MATERIALS: LUMBER_AND_BUILDING_MATERIALS = "LUMBER_AND_BUILDING_MATERIALS".asInstanceOf[LUMBER_AND_BUILDING_MATERIALS]
  
  @js.native
  sealed trait MAGAZINES
    extends StObject
       with _Category
  inline def MAGAZINES: MAGAZINES = "MAGAZINES".asInstanceOf[MAGAZINES]
  
  @js.native
  sealed trait MAINTENANCE_AND_REPAIR_SERVICES
    extends StObject
       with _Category
  inline def MAINTENANCE_AND_REPAIR_SERVICES: MAINTENANCE_AND_REPAIR_SERVICES = "MAINTENANCE_AND_REPAIR_SERVICES".asInstanceOf[MAINTENANCE_AND_REPAIR_SERVICES]
  
  @js.native
  sealed trait MAKEUP_AND_COSMETICS
    extends StObject
       with _Category
  inline def MAKEUP_AND_COSMETICS: MAKEUP_AND_COSMETICS = "MAKEUP_AND_COSMETICS".asInstanceOf[MAKEUP_AND_COSMETICS]
  
  @js.native
  sealed trait MANUAL_CASH_DISBURSEMENTS
    extends StObject
       with _Category
  inline def MANUAL_CASH_DISBURSEMENTS: MANUAL_CASH_DISBURSEMENTS = "MANUAL_CASH_DISBURSEMENTS".asInstanceOf[MANUAL_CASH_DISBURSEMENTS]
  
  @js.native
  sealed trait MASSAGE_PARLORS
    extends StObject
       with _Category
  inline def MASSAGE_PARLORS: MASSAGE_PARLORS = "MASSAGE_PARLORS".asInstanceOf[MASSAGE_PARLORS]
  
  @js.native
  sealed trait MEDICAL
    extends StObject
       with _Category
  inline def MEDICAL: MEDICAL = "MEDICAL".asInstanceOf[MEDICAL]
  
  @js.native
  sealed trait MEDICAL_AND_PHARMACEUTICAL
    extends StObject
       with _Category
  inline def MEDICAL_AND_PHARMACEUTICAL: MEDICAL_AND_PHARMACEUTICAL = "MEDICAL_AND_PHARMACEUTICAL".asInstanceOf[MEDICAL_AND_PHARMACEUTICAL]
  
  @js.native
  sealed trait MEDICAL_CARE
    extends StObject
       with _Category
  inline def MEDICAL_CARE: MEDICAL_CARE = "MEDICAL_CARE".asInstanceOf[MEDICAL_CARE]
  
  @js.native
  sealed trait MEDICAL_EQUIPMENT_AND_SUPPLIES
    extends StObject
       with _Category
  inline def MEDICAL_EQUIPMENT_AND_SUPPLIES: MEDICAL_EQUIPMENT_AND_SUPPLIES = "MEDICAL_EQUIPMENT_AND_SUPPLIES".asInstanceOf[MEDICAL_EQUIPMENT_AND_SUPPLIES]
  
  @js.native
  sealed trait MEDICAL_SERVICES
    extends StObject
       with _Category
  inline def MEDICAL_SERVICES: MEDICAL_SERVICES = "MEDICAL_SERVICES".asInstanceOf[MEDICAL_SERVICES]
  
  @js.native
  sealed trait MEETING_PLANNERS
    extends StObject
       with _Category
  inline def MEETING_PLANNERS: MEETING_PLANNERS = "MEETING_PLANNERS".asInstanceOf[MEETING_PLANNERS]
  
  @js.native
  sealed trait MEMBERSHIP_CLUBS_AND_ORGANIZATIONS
    extends StObject
       with _Category
  inline def MEMBERSHIP_CLUBS_AND_ORGANIZATIONS: MEMBERSHIP_CLUBS_AND_ORGANIZATIONS = "MEMBERSHIP_CLUBS_AND_ORGANIZATIONS".asInstanceOf[MEMBERSHIP_CLUBS_AND_ORGANIZATIONS]
  
  @js.native
  sealed trait MEMBERSHIP_COUNTRY_CLUBS_GOLF
    extends StObject
       with _Category
  inline def MEMBERSHIP_COUNTRY_CLUBS_GOLF: MEMBERSHIP_COUNTRY_CLUBS_GOLF = "MEMBERSHIP_COUNTRY_CLUBS_GOLF".asInstanceOf[MEMBERSHIP_COUNTRY_CLUBS_GOLF]
  
  @js.native
  sealed trait MEMORABILIA
    extends StObject
       with _Category
  inline def MEMORABILIA: MEMORABILIA = "MEMORABILIA".asInstanceOf[MEMORABILIA]
  
  @js.native
  sealed trait MEN_AND_BOY_CLOTHING_AND_ACCESSORY_STORES
    extends StObject
       with _Category
  inline def MEN_AND_BOY_CLOTHING_AND_ACCESSORY_STORES: MEN_AND_BOY_CLOTHING_AND_ACCESSORY_STORES = "MEN_AND_BOY_CLOTHING_AND_ACCESSORY_STORES".asInstanceOf[MEN_AND_BOY_CLOTHING_AND_ACCESSORY_STORES]
  
  @js.native
  sealed trait MEN_CLOTHING
    extends StObject
       with _Category
  inline def MEN_CLOTHING: MEN_CLOTHING = "MEN_CLOTHING".asInstanceOf[MEN_CLOTHING]
  
  @js.native
  sealed trait MERCHANDISE
    extends StObject
       with _Category
  inline def MERCHANDISE: MERCHANDISE = "MERCHANDISE".asInstanceOf[MERCHANDISE]
  
  @js.native
  sealed trait MERCHANT
    extends StObject
       with StatusChangedBy
  inline def MERCHANT: MERCHANT = "MERCHANT".asInstanceOf[MERCHANT]
  
  @js.native
  sealed trait METAPHYSICAL
    extends StObject
       with _Category
  inline def METAPHYSICAL: METAPHYSICAL = "METAPHYSICAL".asInstanceOf[METAPHYSICAL]
  
  @js.native
  sealed trait MILITARIA
    extends StObject
       with _Category
  inline def MILITARIA: MILITARIA = "MILITARIA".asInstanceOf[MILITARIA]
  
  @js.native
  sealed trait MILITARY_AND_CIVIL_SERVICE_UNIFORMS
    extends StObject
       with _Category
  inline def MILITARY_AND_CIVIL_SERVICE_UNIFORMS: MILITARY_AND_CIVIL_SERVICE_UNIFORMS = "MILITARY_AND_CIVIL_SERVICE_UNIFORMS".asInstanceOf[MILITARY_AND_CIVIL_SERVICE_UNIFORMS]
  
  @js.native
  sealed trait MISCDot_AUTOMOTIVE_AIRCRAFT_AND_FARM_EQUIPMENT_DEALERS
    extends StObject
       with _Category
  inline def MISCDot_AUTOMOTIVE_AIRCRAFT_AND_FARM_EQUIPMENT_DEALERS: MISCDot_AUTOMOTIVE_AIRCRAFT_AND_FARM_EQUIPMENT_DEALERS = "MISC._AUTOMOTIVE_AIRCRAFT_AND_FARM_EQUIPMENT_DEALERS".asInstanceOf[MISCDot_AUTOMOTIVE_AIRCRAFT_AND_FARM_EQUIPMENT_DEALERS]
  
  @js.native
  sealed trait MISCDot_GENERAL_MERCHANDISE
    extends StObject
       with _Category
  inline def MISCDot_GENERAL_MERCHANDISE: MISCDot_GENERAL_MERCHANDISE = "MISC._GENERAL_MERCHANDISE".asInstanceOf[MISCDot_GENERAL_MERCHANDISE]
  
  @js.native
  sealed trait MISCELLANEOUS_GENERAL_SERVICES
    extends StObject
       with _Category
  inline def MISCELLANEOUS_GENERAL_SERVICES: MISCELLANEOUS_GENERAL_SERVICES = "MISCELLANEOUS_GENERAL_SERVICES".asInstanceOf[MISCELLANEOUS_GENERAL_SERVICES]
  
  @js.native
  sealed trait MISCELLANEOUS_REPAIR_SHOPS_AND_RELATED_SERVICES
    extends StObject
       with _Category
  inline def MISCELLANEOUS_REPAIR_SHOPS_AND_RELATED_SERVICES: MISCELLANEOUS_REPAIR_SHOPS_AND_RELATED_SERVICES = "MISCELLANEOUS_REPAIR_SHOPS_AND_RELATED_SERVICES".asInstanceOf[MISCELLANEOUS_REPAIR_SHOPS_AND_RELATED_SERVICES]
  
  @js.native
  sealed trait MOBILE_APP extends StObject
  inline def MOBILE_APP: MOBILE_APP = "MOBILE_APP".asInstanceOf[MOBILE_APP]
  
  @js.native
  sealed trait MOBILE_WEB extends StObject
  inline def MOBILE_WEB: MOBILE_WEB = "MOBILE_WEB".asInstanceOf[MOBILE_WEB]
  
  @js.native
  sealed trait MODEL_KITS
    extends StObject
       with _Category
  inline def MODEL_KITS: MODEL_KITS = "MODEL_KITS".asInstanceOf[MODEL_KITS]
  
  @js.native
  sealed trait MONEY_TRANSFER_MEMBER_FINANCIAL_INSTITUTION
    extends StObject
       with _Category
  inline def MONEY_TRANSFER_MEMBER_FINANCIAL_INSTITUTION: MONEY_TRANSFER_MEMBER_FINANCIAL_INSTITUTION = "MONEY_TRANSFER_MEMBER_FINANCIAL_INSTITUTION".asInstanceOf[MONEY_TRANSFER_MEMBER_FINANCIAL_INSTITUTION]
  
  @js.native
  sealed trait MONEY_TRANSFER_MERCHANT
    extends StObject
       with _Category
  inline def MONEY_TRANSFER_MERCHANT: MONEY_TRANSFER_MERCHANT = "MONEY_TRANSFER_MERCHANT".asInstanceOf[MONEY_TRANSFER_MERCHANT]
  
  @js.native
  sealed trait MONTH extends StObject
  inline def MONTH: MONTH = "MONTH".asInstanceOf[MONTH]
  
  @js.native
  sealed trait MOTION_PICTURE_THEATERS
    extends StObject
       with _Category
  inline def MOTION_PICTURE_THEATERS: MOTION_PICTURE_THEATERS = "MOTION_PICTURE_THEATERS".asInstanceOf[MOTION_PICTURE_THEATERS]
  
  @js.native
  sealed trait MOTORCYCLES
    extends StObject
       with _Category
  inline def MOTORCYCLES: MOTORCYCLES = "MOTORCYCLES".asInstanceOf[MOTORCYCLES]
  
  @js.native
  sealed trait MOTORCYCLE_DEALERS
    extends StObject
       with _Category
  inline def MOTORCYCLE_DEALERS: MOTORCYCLE_DEALERS = "MOTORCYCLE_DEALERS".asInstanceOf[MOTORCYCLE_DEALERS]
  
  @js.native
  sealed trait MOTOR_FREIGHT_CARRIERS_AND_TRUCKING
    extends StObject
       with _Category
  inline def MOTOR_FREIGHT_CARRIERS_AND_TRUCKING: MOTOR_FREIGHT_CARRIERS_AND_TRUCKING = "MOTOR_FREIGHT_CARRIERS_AND_TRUCKING".asInstanceOf[MOTOR_FREIGHT_CARRIERS_AND_TRUCKING]
  
  @js.native
  sealed trait MOTOR_HOMES_DEALERS
    extends StObject
       with _Category
  inline def MOTOR_HOMES_DEALERS: MOTOR_HOMES_DEALERS = "MOTOR_HOMES_DEALERS".asInstanceOf[MOTOR_HOMES_DEALERS]
  
  @js.native
  sealed trait MOTOR_HOME_AND_RECREATIONAL_VEHICLE_RENTAL
    extends StObject
       with _Category
  inline def MOTOR_HOME_AND_RECREATIONAL_VEHICLE_RENTAL: MOTOR_HOME_AND_RECREATIONAL_VEHICLE_RENTAL = "MOTOR_HOME_AND_RECREATIONAL_VEHICLE_RENTAL".asInstanceOf[MOTOR_HOME_AND_RECREATIONAL_VEHICLE_RENTAL]
  
  @js.native
  sealed trait MOTOR_VEHICLE_SUPPLIES_AND_NEW_PARTS
    extends StObject
       with _Category
  inline def MOTOR_VEHICLE_SUPPLIES_AND_NEW_PARTS: MOTOR_VEHICLE_SUPPLIES_AND_NEW_PARTS = "MOTOR_VEHICLE_SUPPLIES_AND_NEW_PARTS".asInstanceOf[MOTOR_VEHICLE_SUPPLIES_AND_NEW_PARTS]
  
  @js.native
  sealed trait MOVIE
    extends StObject
       with _Category
  inline def MOVIE: MOVIE = "MOVIE".asInstanceOf[MOVIE]
  
  @js.native
  sealed trait MOVIE_TICKETS
    extends StObject
       with _Category
  inline def MOVIE_TICKETS: MOVIE_TICKETS = "MOVIE_TICKETS".asInstanceOf[MOVIE_TICKETS]
  
  @js.native
  sealed trait MOVING_AND_STORAGE
    extends StObject
       with _Category
  inline def MOVING_AND_STORAGE: MOVING_AND_STORAGE = "MOVING_AND_STORAGE".asInstanceOf[MOVING_AND_STORAGE]
  
  @js.native
  sealed trait MULTI_LEVEL_MARKETING
    extends StObject
       with _Category
  inline def MULTI_LEVEL_MARKETING: MULTI_LEVEL_MARKETING = "MULTI_LEVEL_MARKETING".asInstanceOf[MULTI_LEVEL_MARKETING]
  
  @js.native
  sealed trait MUSIC_CDS_CASSETTES_AND_ALBUMS
    extends StObject
       with _Category
  inline def MUSIC_CDS_CASSETTES_AND_ALBUMS: MUSIC_CDS_CASSETTES_AND_ALBUMS = "MUSIC_CDS_CASSETTES_AND_ALBUMS".asInstanceOf[MUSIC_CDS_CASSETTES_AND_ALBUMS]
  
  @js.native
  sealed trait MUSIC_STORE_INSTRUMENTS_AND_SHEET_MUSIC
    extends StObject
       with _Category
  inline def MUSIC_STORE_INSTRUMENTS_AND_SHEET_MUSIC: MUSIC_STORE_INSTRUMENTS_AND_SHEET_MUSIC = "MUSIC_STORE_INSTRUMENTS_AND_SHEET_MUSIC".asInstanceOf[MUSIC_STORE_INSTRUMENTS_AND_SHEET_MUSIC]
  
  @js.native
  sealed trait N extends StObject
  inline def N: N = "N".asInstanceOf[N]
  
  @js.native
  sealed trait NATIVE
    extends StObject
       with UserExperienceFlow
  inline def NATIVE: NATIVE = "NATIVE".asInstanceOf[NATIVE]
  
  @js.native
  sealed trait NATIVE_SDK
    extends StObject
       with IntegrationArtifact
  inline def NATIVE_SDK: NATIVE_SDK = "NATIVE_SDK".asInstanceOf[NATIVE_SDK]
  
  @js.native
  sealed trait NEGATIVE_BALANCE_COLLECTION
    extends StObject
       with ProductFlow
  inline def NEGATIVE_BALANCE_COLLECTION: NEGATIVE_BALANCE_COLLECTION = "NEGATIVE_BALANCE_COLLECTION".asInstanceOf[NEGATIVE_BALANCE_COLLECTION]
  
  @js.native
  sealed trait NETWORKING
    extends StObject
       with _Category
  inline def NETWORKING: NETWORKING = "NETWORKING".asInstanceOf[NETWORKING]
  
  @js.native
  sealed trait NEWS_DEALERS_AND_NEWSTANDS
    extends StObject
       with _Category
  inline def NEWS_DEALERS_AND_NEWSTANDS: NEWS_DEALERS_AND_NEWSTANDS = "NEWS_DEALERS_AND_NEWSTANDS".asInstanceOf[NEWS_DEALERS_AND_NEWSTANDS]
  
  @js.native
  sealed trait NEW_AGE
    extends StObject
       with _Category
  inline def NEW_AGE: NEW_AGE = "NEW_AGE".asInstanceOf[NEW_AGE]
  
  @js.native
  sealed trait NEW_PARTS_AND_SUPPLIES_MOTOR_VEHICLE
    extends StObject
       with _Category
  inline def NEW_PARTS_AND_SUPPLIES_MOTOR_VEHICLE: NEW_PARTS_AND_SUPPLIES_MOTOR_VEHICLE = "NEW_PARTS_AND_SUPPLIES_MOTOR_VEHICLE".asInstanceOf[NEW_PARTS_AND_SUPPLIES_MOTOR_VEHICLE]
  
  @js.native
  sealed trait NO extends StObject
  inline def NO: NO = "NO".asInstanceOf[NO]
  
  @js.native
  sealed trait NONE
    extends StObject
       with API
       with IntegrationArtifact
       with ProductFeature
  inline def NONE: NONE = "NONE".asInstanceOf[NONE]
  
  @js.native
  sealed trait NONPROFIT
    extends StObject
       with _Category
  inline def NONPROFIT: NONPROFIT = "NONPROFIT".asInstanceOf[NONPROFIT]
  
  @js.native
  sealed trait NON_DURABLE_GOODS
    extends StObject
       with _Category
  inline def NON_DURABLE_GOODS: NON_DURABLE_GOODS = "NON_DURABLE_GOODS".asInstanceOf[NON_DURABLE_GOODS]
  
  @js.native
  sealed trait NON_FICTION
    extends StObject
       with _Category
  inline def NON_FICTION: NON_FICTION = "NON_FICTION".asInstanceOf[NON_FICTION]
  
  @js.native
  sealed trait NON_PROFIT_POLITICAL_AND_RELIGION
    extends StObject
       with _Category
  inline def NON_PROFIT_POLITICAL_AND_RELIGION: NON_PROFIT_POLITICAL_AND_RELIGION = "NON_PROFIT_POLITICAL_AND_RELIGION".asInstanceOf[NON_PROFIT_POLITICAL_AND_RELIGION]
  
  @js.native
  sealed trait NOVELTIES
    extends StObject
       with _Category
  inline def NOVELTIES: NOVELTIES = "NOVELTIES".asInstanceOf[NOVELTIES]
  
  @js.native
  sealed trait NO_PREFERENCE extends StObject
  inline def NO_PREFERENCE: NO_PREFERENCE = "NO_PREFERENCE".asInstanceOf[NO_PREFERENCE]
  
  @js.native
  sealed trait NO_SHIPPING
    extends StObject
       with SHIPPING_PREFERENCE
  inline def NO_SHIPPING: NO_SHIPPING = "NO_SHIPPING".asInstanceOf[NO_SHIPPING]
  
  @js.native
  sealed trait OEM_SOFTWARE
    extends StObject
       with _Category
  inline def OEM_SOFTWARE: OEM_SOFTWARE = "OEM_SOFTWARE".asInstanceOf[OEM_SOFTWARE]
  
  @js.native
  sealed trait OFFICE_SUPPLIES_AND_EQUIPMENT
    extends StObject
       with _Category
  inline def OFFICE_SUPPLIES_AND_EQUIPMENT: OFFICE_SUPPLIES_AND_EQUIPMENT = "OFFICE_SUPPLIES_AND_EQUIPMENT".asInstanceOf[OFFICE_SUPPLIES_AND_EQUIPMENT]
  
  @js.native
  sealed trait ONE_TIME_PAYMENT_USING_BILLING_AGREEMENT
    extends StObject
       with ProductFlow
  inline def ONE_TIME_PAYMENT_USING_BILLING_AGREEMENT: ONE_TIME_PAYMENT_USING_BILLING_AGREEMENT = "ONE_TIME_PAYMENT_USING_BILLING_AGREEMENT".asInstanceOf[ONE_TIME_PAYMENT_USING_BILLING_AGREEMENT]
  
  @js.native
  sealed trait ONLINE_DATING
    extends StObject
       with _Category
  inline def ONLINE_DATING: ONLINE_DATING = "ONLINE_DATING".asInstanceOf[ONLINE_DATING]
  
  @js.native
  sealed trait ONLINE_GAMING
    extends StObject
       with _Category
  inline def ONLINE_GAMING: ONLINE_GAMING = "ONLINE_GAMING".asInstanceOf[ONLINE_GAMING]
  
  @js.native
  sealed trait ONLINE_GAMING_CURRENCY
    extends StObject
       with _Category
  inline def ONLINE_GAMING_CURRENCY: ONLINE_GAMING_CURRENCY = "ONLINE_GAMING_CURRENCY".asInstanceOf[ONLINE_GAMING_CURRENCY]
  
  @js.native
  sealed trait ONLINE_SERVICES
    extends StObject
       with _Category
  inline def ONLINE_SERVICES: ONLINE_SERVICES = "ONLINE_SERVICES".asInstanceOf[ONLINE_SERVICES]
  
  @js.native
  sealed trait OOUTBOUND_TELEMARKETING_MERCH
    extends StObject
       with _Category
  inline def OOUTBOUND_TELEMARKETING_MERCH: OOUTBOUND_TELEMARKETING_MERCH = "OOUTBOUND_TELEMARKETING_MERCH".asInstanceOf[OOUTBOUND_TELEMARKETING_MERCH]
  
  @js.native
  sealed trait OPHTHALMOLOGISTS_OPTOMETRIST
    extends StObject
       with _Category
  inline def OPHTHALMOLOGISTS_OPTOMETRIST: OPHTHALMOLOGISTS_OPTOMETRIST = "OPHTHALMOLOGISTS_OPTOMETRIST".asInstanceOf[OPHTHALMOLOGISTS_OPTOMETRIST]
  
  @js.native
  sealed trait OPTICIANS_AND_DISPENSING
    extends StObject
       with _Category
  inline def OPTICIANS_AND_DISPENSING: OPTICIANS_AND_DISPENSING = "OPTICIANS_AND_DISPENSING".asInstanceOf[OPTICIANS_AND_DISPENSING]
  
  @js.native
  sealed trait OPTIONS extends StObject
  inline def OPTIONS: OPTIONS = "OPTIONS".asInstanceOf[OPTIONS]
  
  @js.native
  sealed trait ORDERS
    extends StObject
       with ProductFeature
  inline def ORDERS: ORDERS = "ORDERS".asInstanceOf[ORDERS]
  
  @js.native
  sealed trait ORDERS_V1
    extends StObject
       with API
  inline def ORDERS_V1: ORDERS_V1 = "ORDERS_V1".asInstanceOf[ORDERS_V1]
  
  @js.native
  sealed trait ORDERS_V2
    extends StObject
       with API
  inline def ORDERS_V2: ORDERS_V2 = "ORDERS_V2".asInstanceOf[ORDERS_V2]
  
  @js.native
  sealed trait ORTHOPEDIC_GOODS_PROSTHETICS
    extends StObject
       with _Category
  inline def ORTHOPEDIC_GOODS_PROSTHETICS: ORTHOPEDIC_GOODS_PROSTHETICS = "ORTHOPEDIC_GOODS_PROSTHETICS".asInstanceOf[ORTHOPEDIC_GOODS_PROSTHETICS]
  
  @js.native
  sealed trait OSTEOPATHS
    extends StObject
       with _Category
  inline def OSTEOPATHS: OSTEOPATHS = "OSTEOPATHS".asInstanceOf[OSTEOPATHS]
  
  @js.native
  sealed trait OTHER
    extends StObject
       with _Category
  inline def OTHER: OTHER = "OTHER".asInstanceOf[OTHER]
  
  @js.native
  sealed trait PACKAGE_TOUR_OPERATORS
    extends StObject
       with _Category
  inline def PACKAGE_TOUR_OPERATORS: PACKAGE_TOUR_OPERATORS = "PACKAGE_TOUR_OPERATORS".asInstanceOf[PACKAGE_TOUR_OPERATORS]
  
  @js.native
  sealed trait PAINTBALL
    extends StObject
       with _Category
  inline def PAINTBALL: PAINTBALL = "PAINTBALL".asInstanceOf[PAINTBALL]
  
  @js.native
  sealed trait PAINTS_VARNISHES_AND_SUPPLIES
    extends StObject
       with _Category
  inline def PAINTS_VARNISHES_AND_SUPPLIES: PAINTS_VARNISHES_AND_SUPPLIES = "PAINTS_VARNISHES_AND_SUPPLIES".asInstanceOf[PAINTS_VARNISHES_AND_SUPPLIES]
  
  @js.native
  sealed trait PARKING_LOTS_AND_GARAGES
    extends StObject
       with _Category
  inline def PARKING_LOTS_AND_GARAGES: PARKING_LOTS_AND_GARAGES = "PARKING_LOTS_AND_GARAGES".asInstanceOf[PARKING_LOTS_AND_GARAGES]
  
  @js.native
  sealed trait PARTIALLY_REFUNDED
    extends StObject
       with PaymentStatus
  inline def PARTIALLY_REFUNDED: PARTIALLY_REFUNDED = "PARTIALLY_REFUNDED".asInstanceOf[PARTIALLY_REFUNDED]
  
  @js.native
  sealed trait PARTS_AND_ACCESSORIES
    extends StObject
       with _Category
  inline def PARTS_AND_ACCESSORIES: PARTS_AND_ACCESSORIES = "PARTS_AND_ACCESSORIES".asInstanceOf[PARTS_AND_ACCESSORIES]
  
  @js.native
  sealed trait PATCH extends StObject
  inline def PATCH: PATCH = "PATCH".asInstanceOf[PATCH]
  
  @js.native
  sealed trait PAWN_SHOPS
    extends StObject
       with _Category
  inline def PAWN_SHOPS: PAWN_SHOPS = "PAWN_SHOPS".asInstanceOf[PAWN_SHOPS]
  
  @js.native
  sealed trait PAYCHECK_LENDER_OR_CASH_ADVANCE
    extends StObject
       with _Category
  inline def PAYCHECK_LENDER_OR_CASH_ADVANCE: PAYCHECK_LENDER_OR_CASH_ADVANCE = "PAYCHECK_LENDER_OR_CASH_ADVANCE".asInstanceOf[PAYCHECK_LENDER_OR_CASH_ADVANCE]
  
  @js.native
  sealed trait PAYEE_ACCOUNT_RESTRICTED
    extends StObject
       with PaymentFailureReason
  inline def PAYEE_ACCOUNT_RESTRICTED: PAYEE_ACCOUNT_RESTRICTED = "PAYEE_ACCOUNT_RESTRICTED".asInstanceOf[PAYEE_ACCOUNT_RESTRICTED]
  
  @js.native
  sealed trait PAYER_ACCOUNT_RESTRICTED
    extends StObject
       with PaymentFailureReason
  inline def PAYER_ACCOUNT_RESTRICTED: PAYER_ACCOUNT_RESTRICTED = "PAYER_ACCOUNT_RESTRICTED".asInstanceOf[PAYER_ACCOUNT_RESTRICTED]
  
  @js.native
  sealed trait PAYER_ACTION_REQUIRED extends StObject
  inline def PAYER_ACTION_REQUIRED: PAYER_ACTION_REQUIRED = "PAYER_ACTION_REQUIRED".asInstanceOf[PAYER_ACTION_REQUIRED]
  
  @js.native
  sealed trait PAYER_CANNOT_PAY
    extends StObject
       with PaymentFailureReason
  inline def PAYER_CANNOT_PAY: PAYER_CANNOT_PAY = "PAYER_CANNOT_PAY".asInstanceOf[PAYER_CANNOT_PAY]
  
  @js.native
  sealed trait PAYMENTS_V1
    extends StObject
       with API
  inline def PAYMENTS_V1: PAYMENTS_V1 = "PAYMENTS_V1".asInstanceOf[PAYMENTS_V1]
  
  @js.native
  sealed trait PAYMENT_DENIED
    extends StObject
       with PaymentFailureReason
  inline def PAYMENT_DENIED: PAYMENT_DENIED = "PAYMENT_DENIED".asInstanceOf[PAYMENT_DENIED]
  
  @js.native
  sealed trait PAYOUTS
    extends StObject
       with ProductCode
  inline def PAYOUTS: PAYOUTS = "PAYOUTS".asInstanceOf[PAYOUTS]
  
  @js.native
  sealed trait PAYPAL extends StObject
  inline def PAYPAL: PAYPAL = "PAYPAL".asInstanceOf[PAYPAL]
  
  @js.native
  sealed trait PAYPAL_IDENTITY_LINKING
    extends StObject
       with ProductCode
  inline def PAYPAL_IDENTITY_LINKING: PAYPAL_IDENTITY_LINKING = "PAYPAL_IDENTITY_LINKING".asInstanceOf[PAYPAL_IDENTITY_LINKING]
  
  @js.native
  sealed trait PAYPAL_JS_SDK
    extends StObject
       with IntegrationArtifact
  inline def PAYPAL_JS_SDK: PAYPAL_JS_SDK = "PAYPAL_JS_SDK".asInstanceOf[PAYPAL_JS_SDK]
  
  @js.native
  sealed trait PAYPAL_PRO
    extends StObject
       with ProductCode
  inline def PAYPAL_PRO: PAYPAL_PRO = "PAYPAL_PRO".asInstanceOf[PAYPAL_PRO]
  
  @js.native
  sealed trait PAY_NOW extends StObject
  inline def PAY_NOW: PAY_NOW = "PAY_NOW".asInstanceOf[PAY_NOW]
  
  @js.native
  sealed trait PAY_WITH_ALTPAY_ALIPAY
    extends StObject
       with Payment
  inline def PAY_WITH_ALTPAY_ALIPAY: PAY_WITH_ALTPAY_ALIPAY = "PAY_WITH_ALTPAY_ALIPAY".asInstanceOf[PAY_WITH_ALTPAY_ALIPAY]
  
  @js.native
  sealed trait PAY_WITH_ALTPAY_BANCONTACT
    extends StObject
       with Payment
  inline def PAY_WITH_ALTPAY_BANCONTACT: PAY_WITH_ALTPAY_BANCONTACT = "PAY_WITH_ALTPAY_BANCONTACT".asInstanceOf[PAY_WITH_ALTPAY_BANCONTACT]
  
  @js.native
  sealed trait PAY_WITH_ALTPAY_BOLETO
    extends StObject
       with Payment
  inline def PAY_WITH_ALTPAY_BOLETO: PAY_WITH_ALTPAY_BOLETO = "PAY_WITH_ALTPAY_BOLETO".asInstanceOf[PAY_WITH_ALTPAY_BOLETO]
  
  @js.native
  sealed trait PAY_WITH_ALTPAY_EPS
    extends StObject
       with Payment
  inline def PAY_WITH_ALTPAY_EPS: PAY_WITH_ALTPAY_EPS = "PAY_WITH_ALTPAY_EPS".asInstanceOf[PAY_WITH_ALTPAY_EPS]
  
  @js.native
  sealed trait PAY_WITH_ALTPAY_GIROPAY
    extends StObject
       with Payment
  inline def PAY_WITH_ALTPAY_GIROPAY: PAY_WITH_ALTPAY_GIROPAY = "PAY_WITH_ALTPAY_GIROPAY".asInstanceOf[PAY_WITH_ALTPAY_GIROPAY]
  
  @js.native
  sealed trait PAY_WITH_ALTPAY_IDEAL
    extends StObject
       with Payment
  inline def PAY_WITH_ALTPAY_IDEAL: PAY_WITH_ALTPAY_IDEAL = "PAY_WITH_ALTPAY_IDEAL".asInstanceOf[PAY_WITH_ALTPAY_IDEAL]
  
  @js.native
  sealed trait PAY_WITH_ALTPAY_MYBANK
    extends StObject
       with Payment
  inline def PAY_WITH_ALTPAY_MYBANK: PAY_WITH_ALTPAY_MYBANK = "PAY_WITH_ALTPAY_MYBANK".asInstanceOf[PAY_WITH_ALTPAY_MYBANK]
  
  @js.native
  sealed trait PAY_WITH_ALTPAY_OXXO
    extends StObject
       with Payment
  inline def PAY_WITH_ALTPAY_OXXO: PAY_WITH_ALTPAY_OXXO = "PAY_WITH_ALTPAY_OXXO".asInstanceOf[PAY_WITH_ALTPAY_OXXO]
  
  @js.native
  sealed trait PAY_WITH_ALTPAY_P24
    extends StObject
       with Payment
  inline def PAY_WITH_ALTPAY_P24: PAY_WITH_ALTPAY_P24 = "PAY_WITH_ALTPAY_P24".asInstanceOf[PAY_WITH_ALTPAY_P24]
  
  @js.native
  sealed trait PAY_WITH_ALTPAY_SOFORT
    extends StObject
       with Payment
  inline def PAY_WITH_ALTPAY_SOFORT: PAY_WITH_ALTPAY_SOFORT = "PAY_WITH_ALTPAY_SOFORT".asInstanceOf[PAY_WITH_ALTPAY_SOFORT]
  
  @js.native
  sealed trait PAY_WITH_ALTPAY_WECHATPAY
    extends StObject
       with Payment
  inline def PAY_WITH_ALTPAY_WECHATPAY: PAY_WITH_ALTPAY_WECHATPAY = "PAY_WITH_ALTPAY_WECHATPAY".asInstanceOf[PAY_WITH_ALTPAY_WECHATPAY]
  
  @js.native
  sealed trait PAY_WITH_ALTPAY_ZIMPLER
    extends StObject
       with Payment
  inline def PAY_WITH_ALTPAY_ZIMPLER: PAY_WITH_ALTPAY_ZIMPLER = "PAY_WITH_ALTPAY_ZIMPLER".asInstanceOf[PAY_WITH_ALTPAY_ZIMPLER]
  
  @js.native
  sealed trait PAY_WITH_CARD
    extends StObject
       with Payment
  inline def PAY_WITH_CARD: PAY_WITH_CARD = "PAY_WITH_CARD".asInstanceOf[PAY_WITH_CARD]
  
  @js.native
  sealed trait PAY_WITH_CRYPTO extends StObject
  inline def PAY_WITH_CRYPTO: PAY_WITH_CRYPTO = "PAY_WITH_CRYPTO".asInstanceOf[PAY_WITH_CRYPTO]
  
  @js.native
  sealed trait PAY_WITH_PAYPAL
    extends StObject
       with Payment
  inline def PAY_WITH_PAYPAL: PAY_WITH_PAYPAL = "PAY_WITH_PAYPAL".asInstanceOf[PAY_WITH_PAYPAL]
  
  @js.native
  sealed trait PAY_WITH_PAYPAL_CREDIT
    extends StObject
       with Payment
  inline def PAY_WITH_PAYPAL_CREDIT: PAY_WITH_PAYPAL_CREDIT = "PAY_WITH_PAYPAL_CREDIT".asInstanceOf[PAY_WITH_PAYPAL_CREDIT]
  
  @js.native
  sealed trait PAY_WITH_SEPA
    extends StObject
       with Payment
  inline def PAY_WITH_SEPA: PAY_WITH_SEPA = "PAY_WITH_SEPA".asInstanceOf[PAY_WITH_SEPA]
  
  @js.native
  sealed trait PAY_WITH_VENMO
    extends StObject
       with Payment
  inline def PAY_WITH_VENMO: PAY_WITH_VENMO = "PAY_WITH_VENMO".asInstanceOf[PAY_WITH_VENMO]
  
  @js.native
  sealed trait PENDING
    extends StObject
       with PaymentStatus
  inline def PENDING: PENDING = "PENDING".asInstanceOf[PENDING]
  
  @js.native
  sealed trait PERIPHERALS
    extends StObject
       with _Category
  inline def PERIPHERALS: PERIPHERALS = "PERIPHERALS".asInstanceOf[PERIPHERALS]
  
  @js.native
  sealed trait PERSONALIZED_GIFTS
    extends StObject
       with _Category
  inline def PERSONALIZED_GIFTS: PERSONALIZED_GIFTS = "PERSONALIZED_GIFTS".asInstanceOf[PERSONALIZED_GIFTS]
  
  @js.native
  sealed trait PETROLEUM_AND_PETROLEUM_PRODUCTS
    extends StObject
       with _Category
  inline def PETROLEUM_AND_PETROLEUM_PRODUCTS: PETROLEUM_AND_PETROLEUM_PRODUCTS = "PETROLEUM_AND_PETROLEUM_PRODUCTS".asInstanceOf[PETROLEUM_AND_PETROLEUM_PRODUCTS]
  
  @js.native
  sealed trait PETS_AND_ANIMALS
    extends StObject
       with _Category
  inline def PETS_AND_ANIMALS: PETS_AND_ANIMALS = "PETS_AND_ANIMALS".asInstanceOf[PETS_AND_ANIMALS]
  
  @js.native
  sealed trait PET_SHOPS_PET_FOOD_AND_SUPPLIES
    extends StObject
       with _Category
  inline def PET_SHOPS_PET_FOOD_AND_SUPPLIES: PET_SHOPS_PET_FOOD_AND_SUPPLIES = "PET_SHOPS_PET_FOOD_AND_SUPPLIES".asInstanceOf[PET_SHOPS_PET_FOOD_AND_SUPPLIES]
  
  @js.native
  sealed trait PHOTOFINISHING_LABORATORIES_PHOTO_DEVELOPING
    extends StObject
       with _Category
  inline def PHOTOFINISHING_LABORATORIES_PHOTO_DEVELOPING: PHOTOFINISHING_LABORATORIES_PHOTO_DEVELOPING = "PHOTOFINISHING_LABORATORIES_PHOTO_DEVELOPING".asInstanceOf[PHOTOFINISHING_LABORATORIES_PHOTO_DEVELOPING]
  
  @js.native
  sealed trait PHOTOGRAPHIC_STUDIOS_PORTRAITS
    extends StObject
       with _Category
  inline def PHOTOGRAPHIC_STUDIOS_PORTRAITS: PHOTOGRAPHIC_STUDIOS_PORTRAITS = "PHOTOGRAPHIC_STUDIOS_PORTRAITS".asInstanceOf[PHOTOGRAPHIC_STUDIOS_PORTRAITS]
  
  @js.native
  sealed trait PHOTOGRAPHY
    extends StObject
       with _Category
  inline def PHOTOGRAPHY: PHOTOGRAPHY = "PHOTOGRAPHY".asInstanceOf[PHOTOGRAPHY]
  
  @js.native
  sealed trait PHYSICAL
    extends StObject
       with ProductType
  inline def PHYSICAL: PHYSICAL = "PHYSICAL".asInstanceOf[PHYSICAL]
  
  @js.native
  sealed trait PHYSICAL_GOOD
    extends StObject
       with _Category
  inline def PHYSICAL_GOOD: PHYSICAL_GOOD = "PHYSICAL_GOOD".asInstanceOf[PHYSICAL_GOOD]
  
  @js.native
  sealed trait PHYSICAL_GOODS extends StObject
  inline def PHYSICAL_GOODS: PHYSICAL_GOODS = "PHYSICAL_GOODS".asInstanceOf[PHYSICAL_GOODS]
  
  @js.native
  sealed trait PICKUP
    extends StObject
       with ShippingOptionType
  inline def PICKUP: PICKUP = "PICKUP".asInstanceOf[PICKUP]
  
  @js.native
  sealed trait PICKUP_IN_PERSON extends StObject
  inline def PICKUP_IN_PERSON: PICKUP_IN_PERSON = "PICKUP_IN_PERSON".asInstanceOf[PICKUP_IN_PERSON]
  
  @js.native
  sealed trait PICTURE_VIDEO_PRODUCTION
    extends StObject
       with _Category
  inline def PICTURE_VIDEO_PRODUCTION: PICTURE_VIDEO_PRODUCTION = "PICTURE_VIDEO_PRODUCTION".asInstanceOf[PICTURE_VIDEO_PRODUCTION]
  
  @js.native
  sealed trait PIECE_GOODS_NOTIONS_AND_OTHER_DRY_GOODS
    extends StObject
       with _Category
  inline def PIECE_GOODS_NOTIONS_AND_OTHER_DRY_GOODS: PIECE_GOODS_NOTIONS_AND_OTHER_DRY_GOODS = "PIECE_GOODS_NOTIONS_AND_OTHER_DRY_GOODS".asInstanceOf[PIECE_GOODS_NOTIONS_AND_OTHER_DRY_GOODS]
  
  @js.native
  sealed trait PLANTS_AND_SEEDS
    extends StObject
       with _Category
  inline def PLANTS_AND_SEEDS: PLANTS_AND_SEEDS = "PLANTS_AND_SEEDS".asInstanceOf[PLANTS_AND_SEEDS]
  
  @js.native
  sealed trait PLUMBING_AND_HEATING_EQUIPMENTS_AND_SUPPLIES
    extends StObject
       with _Category
  inline def PLUMBING_AND_HEATING_EQUIPMENTS_AND_SUPPLIES: PLUMBING_AND_HEATING_EQUIPMENTS_AND_SUPPLIES = "PLUMBING_AND_HEATING_EQUIPMENTS_AND_SUPPLIES".asInstanceOf[PLUMBING_AND_HEATING_EQUIPMENTS_AND_SUPPLIES]
  
  @js.native
  sealed trait POLICE_RELATED_ITEMS
    extends StObject
       with _Category
  inline def POLICE_RELATED_ITEMS: POLICE_RELATED_ITEMS = "POLICE_RELATED_ITEMS".asInstanceOf[POLICE_RELATED_ITEMS]
  
  @js.native
  sealed trait POLITICAL_ORGANIZATIONS
    extends StObject
       with _Category
  inline def POLITICAL_ORGANIZATIONS: POLITICAL_ORGANIZATIONS = "POLITICAL_ORGANIZATIONS".asInstanceOf[POLITICAL_ORGANIZATIONS]
  
  @js.native
  sealed trait POSSIBLE extends StObject
  inline def POSSIBLE: POSSIBLE = "POSSIBLE".asInstanceOf[POSSIBLE]
  
  @js.native
  sealed trait POST extends StObject
  inline def POST: POST = "POST".asInstanceOf[POST]
  
  @js.native
  sealed trait POSTAL_SERVICES_GOVERNMENT_ONLY
    extends StObject
       with _Category
  inline def POSTAL_SERVICES_GOVERNMENT_ONLY: POSTAL_SERVICES_GOVERNMENT_ONLY = "POSTAL_SERVICES_GOVERNMENT_ONLY".asInstanceOf[POSTAL_SERVICES_GOVERNMENT_ONLY]
  
  @js.native
  sealed trait POSTERS
    extends StObject
       with _Category
  inline def POSTERS: POSTERS = "POSTERS".asInstanceOf[POSTERS]
  
  @js.native
  sealed trait POSTPAID extends StObject
  inline def POSTPAID: POSTPAID = "POSTPAID".asInstanceOf[POSTPAID]
  
  @js.native
  sealed trait PREPAID extends StObject
  inline def PREPAID: PREPAID = "PREPAID".asInstanceOf[PREPAID]
  
  @js.native
  sealed trait PREPAID_AND_STORED_VALUE_CARDS
    extends StObject
       with _Category
  inline def PREPAID_AND_STORED_VALUE_CARDS: PREPAID_AND_STORED_VALUE_CARDS = "PREPAID_AND_STORED_VALUE_CARDS".asInstanceOf[PREPAID_AND_STORED_VALUE_CARDS]
  
  @js.native
  sealed trait PRESCRIPTION_DRUGS
    extends StObject
       with _Category
  inline def PRESCRIPTION_DRUGS: PRESCRIPTION_DRUGS = "PRESCRIPTION_DRUGS".asInstanceOf[PRESCRIPTION_DRUGS]
  
  @js.native
  sealed trait PROMOTIONAL_ITEMS
    extends StObject
       with _Category
  inline def PROMOTIONAL_ITEMS: PROMOTIONAL_ITEMS = "PROMOTIONAL_ITEMS".asInstanceOf[PROMOTIONAL_ITEMS]
  
  @js.native
  sealed trait PROX
    extends StObject
       with ProductFlow
  inline def PROX: PROX = "PROX".asInstanceOf[PROX]
  
  @js.native
  sealed trait PUBLIC_WAREHOUSING_AND_STORAGE
    extends StObject
       with _Category
  inline def PUBLIC_WAREHOUSING_AND_STORAGE: PUBLIC_WAREHOUSING_AND_STORAGE = "PUBLIC_WAREHOUSING_AND_STORAGE".asInstanceOf[PUBLIC_WAREHOUSING_AND_STORAGE]
  
  @js.native
  sealed trait PUBLISHING_AND_PRINTING
    extends StObject
       with _Category
  inline def PUBLISHING_AND_PRINTING: PUBLISHING_AND_PRINTING = "PUBLISHING_AND_PRINTING".asInstanceOf[PUBLISHING_AND_PRINTING]
  
  @js.native
  sealed trait PUBLISHING_SERVICES
    extends StObject
       with _Category
  inline def PUBLISHING_SERVICES: PUBLISHING_SERVICES = "PUBLISHING_SERVICES".asInstanceOf[PUBLISHING_SERVICES]
  
  @js.native
  sealed trait PUT extends StObject
  inline def PUT: PUT = "PUT".asInstanceOf[PUT]
  
  @js.native
  sealed trait Paypal_ extends StObject
  inline def Paypal_ : Paypal_ = "Paypal".asInstanceOf[Paypal_]
  
  @js.native
  sealed trait R extends StObject
  inline def R: R = "R".asInstanceOf[R]
  
  @js.native
  sealed trait RADAR_DECTORS
    extends StObject
       with _Category
  inline def RADAR_DECTORS: RADAR_DECTORS = "RADAR_DECTORS".asInstanceOf[RADAR_DECTORS]
  
  @js.native
  sealed trait RADIO_TELEVISION_AND_STEREO_REPAIR
    extends StObject
       with _Category
  inline def RADIO_TELEVISION_AND_STEREO_REPAIR: RADIO_TELEVISION_AND_STEREO_REPAIR = "RADIO_TELEVISION_AND_STEREO_REPAIR".asInstanceOf[RADIO_TELEVISION_AND_STEREO_REPAIR]
  
  @js.native
  sealed trait REAL_ESTATE
    extends StObject
       with _Category
  inline def REAL_ESTATE: REAL_ESTATE = "REAL_ESTATE".asInstanceOf[REAL_ESTATE]
  
  @js.native
  sealed trait REAL_ESTATE_AGENT
    extends StObject
       with _Category
  inline def REAL_ESTATE_AGENT: REAL_ESTATE_AGENT = "REAL_ESTATE_AGENT".asInstanceOf[REAL_ESTATE_AGENT]
  
  @js.native
  sealed trait REAL_ESTATE_AGENTS_AND_MANAGERS_RENTALS
    extends StObject
       with _Category
  inline def REAL_ESTATE_AGENTS_AND_MANAGERS_RENTALS: REAL_ESTATE_AGENTS_AND_MANAGERS_RENTALS = "REAL_ESTATE_AGENTS_AND_MANAGERS_RENTALS".asInstanceOf[REAL_ESTATE_AGENTS_AND_MANAGERS_RENTALS]
  
  @js.native
  sealed trait RECURRING_PAYMENTS_V1
    extends StObject
       with API
  inline def RECURRING_PAYMENTS_V1: RECURRING_PAYMENTS_V1 = "RECURRING_PAYMENTS_V1".asInstanceOf[RECURRING_PAYMENTS_V1]
  
  @js.native
  sealed trait REFUNDED
    extends StObject
       with PaymentStatus
  inline def REFUNDED: REFUNDED = "REFUNDED".asInstanceOf[REFUNDED]
  
  @js.native
  sealed trait REGULAR extends StObject
  inline def REGULAR: REGULAR = "REGULAR".asInstanceOf[REGULAR]
  
  @js.native
  sealed trait RELIGION_AND_SPIRITUALITY_FOR_PROFIT
    extends StObject
       with _Category
  inline def RELIGION_AND_SPIRITUALITY_FOR_PROFIT: RELIGION_AND_SPIRITUALITY_FOR_PROFIT = "RELIGION_AND_SPIRITUALITY_FOR_PROFIT".asInstanceOf[RELIGION_AND_SPIRITUALITY_FOR_PROFIT]
  
  @js.native
  sealed trait RELIGIOUS
    extends StObject
       with _Category
  inline def RELIGIOUS: RELIGIOUS = "RELIGIOUS".asInstanceOf[RELIGIOUS]
  
  @js.native
  sealed trait RELIGIOUS_ORGANIZATIONS
    extends StObject
       with _Category
  inline def RELIGIOUS_ORGANIZATIONS: RELIGIOUS_ORGANIZATIONS = "RELIGIOUS_ORGANIZATIONS".asInstanceOf[RELIGIOUS_ORGANIZATIONS]
  
  @js.native
  sealed trait REMITTANCE
    extends StObject
       with _Category
  inline def REMITTANCE: REMITTANCE = "REMITTANCE".asInstanceOf[REMITTANCE]
  
  @js.native
  sealed trait RENTAL_PROPERTY_MANAGEMENT
    extends StObject
       with _Category
  inline def RENTAL_PROPERTY_MANAGEMENT: RENTAL_PROPERTY_MANAGEMENT = "RENTAL_PROPERTY_MANAGEMENT".asInstanceOf[RENTAL_PROPERTY_MANAGEMENT]
  
  @js.native
  sealed trait RESIDENTIAL
    extends StObject
       with _Category
  inline def RESIDENTIAL: RESIDENTIAL = "RESIDENTIAL".asInstanceOf[RESIDENTIAL]
  
  @js.native
  sealed trait RETAIL
    extends StObject
       with _Category
  inline def RETAIL: RETAIL = "RETAIL".asInstanceOf[RETAIL]
  
  @js.native
  sealed trait RETAIL_FINE_JEWELRY_AND_WATCHES
    extends StObject
       with _Category
  inline def RETAIL_FINE_JEWELRY_AND_WATCHES: RETAIL_FINE_JEWELRY_AND_WATCHES = "RETAIL_FINE_JEWELRY_AND_WATCHES".asInstanceOf[RETAIL_FINE_JEWELRY_AND_WATCHES]
  
  @js.native
  sealed trait REUPHOLSTERY_AND_FURNITURE_REPAIR
    extends StObject
       with _Category
  inline def REUPHOLSTERY_AND_FURNITURE_REPAIR: REUPHOLSTERY_AND_FURNITURE_REPAIR = "REUPHOLSTERY_AND_FURNITURE_REPAIR".asInstanceOf[REUPHOLSTERY_AND_FURNITURE_REPAIR]
  
  @js.native
  sealed trait RINGS
    extends StObject
       with _Category
  inline def RINGS: RINGS = "RINGS".asInstanceOf[RINGS]
  
  @js.native
  sealed trait ROOFING_SIDING_SHEET_METAL
    extends StObject
       with _Category
  inline def ROOFING_SIDING_SHEET_METAL: ROOFING_SIDING_SHEET_METAL = "ROOFING_SIDING_SHEET_METAL".asInstanceOf[ROOFING_SIDING_SHEET_METAL]
  
  @js.native
  sealed trait RUGS_AND_CARPETS
    extends StObject
       with _Category
  inline def RUGS_AND_CARPETS: RUGS_AND_CARPETS = "RUGS_AND_CARPETS".asInstanceOf[RUGS_AND_CARPETS]
  
  @js.native
  sealed trait SAVED extends StObject
  inline def SAVED: SAVED = "SAVED".asInstanceOf[SAVED]
  
  @js.native
  sealed trait SCHOOLS_AND_COLLEGES
    extends StObject
       with _Category
  inline def SCHOOLS_AND_COLLEGES: SCHOOLS_AND_COLLEGES = "SCHOOLS_AND_COLLEGES".asInstanceOf[SCHOOLS_AND_COLLEGES]
  
  @js.native
  sealed trait SCIENCE_FICTION
    extends StObject
       with _Category
  inline def SCIENCE_FICTION: SCIENCE_FICTION = "SCIENCE_FICTION".asInstanceOf[SCIENCE_FICTION]
  
  @js.native
  sealed trait SCRAPBOOKING
    extends StObject
       with _Category
  inline def SCRAPBOOKING: SCRAPBOOKING = "SCRAPBOOKING".asInstanceOf[SCRAPBOOKING]
  
  @js.native
  sealed trait SCULPTURES
    extends StObject
       with _Category
  inline def SCULPTURES: SCULPTURES = "SCULPTURES".asInstanceOf[SCULPTURES]
  
  @js.native
  sealed trait SECURITIES_BROKERS_AND_DEALERS
    extends StObject
       with _Category
  inline def SECURITIES_BROKERS_AND_DEALERS: SECURITIES_BROKERS_AND_DEALERS = "SECURITIES_BROKERS_AND_DEALERS".asInstanceOf[SECURITIES_BROKERS_AND_DEALERS]
  
  @js.native
  sealed trait SECURITY_AND_SURVEILLANCE
    extends StObject
       with _Category
  inline def SECURITY_AND_SURVEILLANCE: SECURITY_AND_SURVEILLANCE = "SECURITY_AND_SURVEILLANCE".asInstanceOf[SECURITY_AND_SURVEILLANCE]
  
  @js.native
  sealed trait SECURITY_AND_SURVEILLANCE_EQUIPMENT
    extends StObject
       with _Category
  inline def SECURITY_AND_SURVEILLANCE_EQUIPMENT: SECURITY_AND_SURVEILLANCE_EQUIPMENT = "SECURITY_AND_SURVEILLANCE_EQUIPMENT".asInstanceOf[SECURITY_AND_SURVEILLANCE_EQUIPMENT]
  
  @js.native
  sealed trait SECURITY_BROKERS_AND_DEALERS
    extends StObject
       with _Category
  inline def SECURITY_BROKERS_AND_DEALERS: SECURITY_BROKERS_AND_DEALERS = "SECURITY_BROKERS_AND_DEALERS".asInstanceOf[SECURITY_BROKERS_AND_DEALERS]
  
  @js.native
  sealed trait SEMINARS
    extends StObject
       with _Category
  inline def SEMINARS: SEMINARS = "SEMINARS".asInstanceOf[SEMINARS]
  
  @js.native
  sealed trait SEMI_MONTH extends StObject
  inline def SEMI_MONTH: SEMI_MONTH = "SEMI_MONTH".asInstanceOf[SEMI_MONTH]
  
  @js.native
  sealed trait SENDING_LIMIT_EXCEEDED
    extends StObject
       with PaymentFailureReason
  inline def SENDING_LIMIT_EXCEEDED: SENDING_LIMIT_EXCEEDED = "SENDING_LIMIT_EXCEEDED".asInstanceOf[SENDING_LIMIT_EXCEEDED]
  
  @js.native
  sealed trait SERVICE
    extends StObject
       with ProductType
  inline def SERVICE: SERVICE = "SERVICE".asInstanceOf[SERVICE]
  
  @js.native
  sealed trait SERVICES
    extends StObject
       with _Category
  inline def SERVICES: SERVICES = "SERVICES".asInstanceOf[SERVICES]
  
  @js.native
  sealed trait SERVICE_STATIONS
    extends StObject
       with _Category
  inline def SERVICE_STATIONS: SERVICE_STATIONS = "SERVICE_STATIONS".asInstanceOf[SERVICE_STATIONS]
  
  @js.native
  sealed trait SET_PROVIDED_ADDRESS
    extends StObject
       with SHIPPING_PREFERENCE
  inline def SET_PROVIDED_ADDRESS: SET_PROVIDED_ADDRESS = "SET_PROVIDED_ADDRESS".asInstanceOf[SET_PROVIDED_ADDRESS]
  
  @js.native
  sealed trait SEWING_NEEDLEWORK_FABRIC_AND_PIECE_GOODS_STORES
    extends StObject
       with _Category
  inline def SEWING_NEEDLEWORK_FABRIC_AND_PIECE_GOODS_STORES: SEWING_NEEDLEWORK_FABRIC_AND_PIECE_GOODS_STORES = "SEWING_NEEDLEWORK_FABRIC_AND_PIECE_GOODS_STORES".asInstanceOf[SEWING_NEEDLEWORK_FABRIC_AND_PIECE_GOODS_STORES]
  
  @js.native
  sealed trait SHIPPING
    extends StObject
       with ShippingOptionType
  inline def SHIPPING: SHIPPING = "SHIPPING".asInstanceOf[SHIPPING]
  
  @js.native
  sealed trait SHIPPING_AND_PACKING
    extends StObject
       with _Category
  inline def SHIPPING_AND_PACKING: SHIPPING_AND_PACKING = "SHIPPING_AND_PACKING".asInstanceOf[SHIPPING_AND_PACKING]
  
  @js.native
  sealed trait SHOES
    extends StObject
       with _Category
  inline def SHOES: SHOES = "SHOES".asInstanceOf[SHOES]
  
  @js.native
  sealed trait SHOE_REPAIR_HAT_CLEANING
    extends StObject
       with _Category
  inline def SHOE_REPAIR_HAT_CLEANING: SHOE_REPAIR_HAT_CLEANING = "SHOE_REPAIR_HAT_CLEANING".asInstanceOf[SHOE_REPAIR_HAT_CLEANING]
  
  @js.native
  sealed trait SHOE_STORES
    extends StObject
       with _Category
  inline def SHOE_STORES: SHOE_STORES = "SHOE_STORES".asInstanceOf[SHOE_STORES]
  
  @js.native
  sealed trait SMART_PAYMENT_BUTTONS
    extends StObject
       with ProductFlow
  inline def SMART_PAYMENT_BUTTONS: SMART_PAYMENT_BUTTONS = "SMART_PAYMENT_BUTTONS".asInstanceOf[SMART_PAYMENT_BUTTONS]
  
  @js.native
  sealed trait SNOWMOBILE_DEALERS
    extends StObject
       with _Category
  inline def SNOWMOBILE_DEALERS: SNOWMOBILE_DEALERS = "SNOWMOBILE_DEALERS".asInstanceOf[SNOWMOBILE_DEALERS]
  
  @js.native
  sealed trait SOFTWARE
    extends StObject
       with _Category
  inline def SOFTWARE: SOFTWARE = "SOFTWARE".asInstanceOf[SOFTWARE]
  
  @js.native
  sealed trait SPECIALTY_AND_MISCDot_FOOD_STORES
    extends StObject
       with _Category
  inline def SPECIALTY_AND_MISCDot_FOOD_STORES: SPECIALTY_AND_MISCDot_FOOD_STORES = "SPECIALTY_AND_MISC._FOOD_STORES".asInstanceOf[SPECIALTY_AND_MISCDot_FOOD_STORES]
  
  @js.native
  sealed trait SPECIALTY_CLEANING_POLISHING_AND_SANITATION_PREPARATIONS
    extends StObject
       with _Category
  inline def SPECIALTY_CLEANING_POLISHING_AND_SANITATION_PREPARATIONS: SPECIALTY_CLEANING_POLISHING_AND_SANITATION_PREPARATIONS = "SPECIALTY_CLEANING_POLISHING_AND_SANITATION_PREPARATIONS".asInstanceOf[SPECIALTY_CLEANING_POLISHING_AND_SANITATION_PREPARATIONS]
  
  @js.native
  sealed trait SPECIALTY_OR_RARE_PETS
    extends StObject
       with _Category
  inline def SPECIALTY_OR_RARE_PETS: SPECIALTY_OR_RARE_PETS = "SPECIALTY_OR_RARE_PETS".asInstanceOf[SPECIALTY_OR_RARE_PETS]
  
  @js.native
  sealed trait SPORTING_AND_RECREATIONAL_CAMPS
    extends StObject
       with _Category
  inline def SPORTING_AND_RECREATIONAL_CAMPS: SPORTING_AND_RECREATIONAL_CAMPS = "SPORTING_AND_RECREATIONAL_CAMPS".asInstanceOf[SPORTING_AND_RECREATIONAL_CAMPS]
  
  @js.native
  sealed trait SPORTING_GOODS
    extends StObject
       with _Category
  inline def SPORTING_GOODS: SPORTING_GOODS = "SPORTING_GOODS".asInstanceOf[SPORTING_GOODS]
  
  @js.native
  sealed trait SPORTS_AND_OUTDOORS
    extends StObject
       with _Category
  inline def SPORTS_AND_OUTDOORS: SPORTS_AND_OUTDOORS = "SPORTS_AND_OUTDOORS".asInstanceOf[SPORTS_AND_OUTDOORS]
  
  @js.native
  sealed trait SPORTS_AND_RECREATION
    extends StObject
       with _Category
  inline def SPORTS_AND_RECREATION: SPORTS_AND_RECREATION = "SPORTS_AND_RECREATION".asInstanceOf[SPORTS_AND_RECREATION]
  
  @js.native
  sealed trait SPORT_GAMES_AND_TOYS
    extends StObject
       with _Category
  inline def SPORT_GAMES_AND_TOYS: SPORT_GAMES_AND_TOYS = "SPORT_GAMES_AND_TOYS".asInstanceOf[SPORT_GAMES_AND_TOYS]
  
  @js.native
  sealed trait STAMP_AND_COIN
    extends StObject
       with _Category
  inline def STAMP_AND_COIN: STAMP_AND_COIN = "STAMP_AND_COIN".asInstanceOf[STAMP_AND_COIN]
  
  @js.native
  sealed trait STATIONARY_PRINTING_AND_WRITING_PAPER
    extends StObject
       with _Category
  inline def STATIONARY_PRINTING_AND_WRITING_PAPER: STATIONARY_PRINTING_AND_WRITING_PAPER = "STATIONARY_PRINTING_AND_WRITING_PAPER".asInstanceOf[STATIONARY_PRINTING_AND_WRITING_PAPER]
  
  @js.native
  sealed trait STENOGRAPHIC_AND_SECRETARIAL_SUPPORT_SERVICES
    extends StObject
       with _Category
  inline def STENOGRAPHIC_AND_SECRETARIAL_SUPPORT_SERVICES: STENOGRAPHIC_AND_SECRETARIAL_SUPPORT_SERVICES = "STENOGRAPHIC_AND_SECRETARIAL_SUPPORT_SERVICES".asInstanceOf[STENOGRAPHIC_AND_SECRETARIAL_SUPPORT_SERVICES]
  
  @js.native
  sealed trait STOCKS_BONDS_SECURITIES_AND_RELATED_CERTIFICATES
    extends StObject
       with _Category
  inline def STOCKS_BONDS_SECURITIES_AND_RELATED_CERTIFICATES: STOCKS_BONDS_SECURITIES_AND_RELATED_CERTIFICATES = "STOCKS_BONDS_SECURITIES_AND_RELATED_CERTIFICATES".asInstanceOf[STOCKS_BONDS_SECURITIES_AND_RELATED_CERTIFICATES]
  
  @js.native
  sealed trait STORED_VALUE_CARDS
    extends StObject
       with _Category
  inline def STORED_VALUE_CARDS: STORED_VALUE_CARDS = "STORED_VALUE_CARDS".asInstanceOf[STORED_VALUE_CARDS]
  
  @js.native
  sealed trait SUBSCRIPTIONS_V1
    extends StObject
       with API
  inline def SUBSCRIPTIONS_V1: SUBSCRIPTIONS_V1 = "SUBSCRIPTIONS_V1".asInstanceOf[SUBSCRIPTIONS_V1]
  
  @js.native
  sealed trait SUPPLIES
    extends StObject
       with _Category
  inline def SUPPLIES: SUPPLIES = "SUPPLIES".asInstanceOf[SUPPLIES]
  
  @js.native
  sealed trait SUPPLIES_AND_TOYS
    extends StObject
       with _Category
  inline def SUPPLIES_AND_TOYS: SUPPLIES_AND_TOYS = "SUPPLIES_AND_TOYS".asInstanceOf[SUPPLIES_AND_TOYS]
  
  @js.native
  sealed trait SURVEILLANCE_EQUIPMENT
    extends StObject
       with _Category
  inline def SURVEILLANCE_EQUIPMENT: SURVEILLANCE_EQUIPMENT = "SURVEILLANCE_EQUIPMENT".asInstanceOf[SURVEILLANCE_EQUIPMENT]
  
  @js.native
  sealed trait SUSPENDED
    extends StObject
       with Status
  inline def SUSPENDED: SUSPENDED = "SUSPENDED".asInstanceOf[SUSPENDED]
  
  @js.native
  sealed trait SWIMMING_POOLS_AND_SPAS
    extends StObject
       with _Category
  inline def SWIMMING_POOLS_AND_SPAS: SWIMMING_POOLS_AND_SPAS = "SWIMMING_POOLS_AND_SPAS".asInstanceOf[SWIMMING_POOLS_AND_SPAS]
  
  @js.native
  sealed trait SWIMMING_POOLS_SALES_SUPPLIES_SERVICES
    extends StObject
       with _Category
  inline def SWIMMING_POOLS_SALES_SUPPLIES_SERVICES: SWIMMING_POOLS_SALES_SUPPLIES_SERVICES = "SWIMMING_POOLS_SALES_SUPPLIES_SERVICES".asInstanceOf[SWIMMING_POOLS_SALES_SUPPLIES_SERVICES]
  
  @js.native
  sealed trait SYSTEM
    extends StObject
       with StatusChangedBy
  inline def SYSTEM: SYSTEM = "SYSTEM".asInstanceOf[SYSTEM]
  
  @js.native
  sealed trait TAILORS_AND_ALTERATIONS
    extends StObject
       with _Category
  inline def TAILORS_AND_ALTERATIONS: TAILORS_AND_ALTERATIONS = "TAILORS_AND_ALTERATIONS".asInstanceOf[TAILORS_AND_ALTERATIONS]
  
  @js.native
  sealed trait TAXICABS_AND_LIMOUSINES
    extends StObject
       with _Category
  inline def TAXICABS_AND_LIMOUSINES: TAXICABS_AND_LIMOUSINES = "TAXICABS_AND_LIMOUSINES".asInstanceOf[TAXICABS_AND_LIMOUSINES]
  
  @js.native
  sealed trait TAX_PAYMENTS
    extends StObject
       with _Category
  inline def TAX_PAYMENTS: TAX_PAYMENTS = "TAX_PAYMENTS".asInstanceOf[TAX_PAYMENTS]
  
  @js.native
  sealed trait TAX_PAYMENTS_GOVERNMENT_AGENCIES
    extends StObject
       with _Category
  inline def TAX_PAYMENTS_GOVERNMENT_AGENCIES: TAX_PAYMENTS_GOVERNMENT_AGENCIES = "TAX_PAYMENTS_GOVERNMENT_AGENCIES".asInstanceOf[TAX_PAYMENTS_GOVERNMENT_AGENCIES]
  
  @js.native
  sealed trait TELECOMMUNICATION_SERVICES
    extends StObject
       with _Category
  inline def TELECOMMUNICATION_SERVICES: TELECOMMUNICATION_SERVICES = "TELECOMMUNICATION_SERVICES".asInstanceOf[TELECOMMUNICATION_SERVICES]
  
  @js.native
  sealed trait TELEPHONE_CARDS
    extends StObject
       with _Category
  inline def TELEPHONE_CARDS: TELEPHONE_CARDS = "TELEPHONE_CARDS".asInstanceOf[TELEPHONE_CARDS]
  
  @js.native
  sealed trait TELEPHONE_EQUIPMENT
    extends StObject
       with _Category
  inline def TELEPHONE_EQUIPMENT: TELEPHONE_EQUIPMENT = "TELEPHONE_EQUIPMENT".asInstanceOf[TELEPHONE_EQUIPMENT]
  
  @js.native
  sealed trait TELEPHONE_SERVICES
    extends StObject
       with _Category
  inline def TELEPHONE_SERVICES: TELEPHONE_SERVICES = "TELEPHONE_SERVICES".asInstanceOf[TELEPHONE_SERVICES]
  
  @js.native
  sealed trait THEATER
    extends StObject
       with _Category
  inline def THEATER: THEATER = "THEATER".asInstanceOf[THEATER]
  
  @js.native
  sealed trait TIERED extends StObject
  inline def TIERED: TIERED = "TIERED".asInstanceOf[TIERED]
  
  @js.native
  sealed trait TIRE_RETREADING_AND_REPAIR
    extends StObject
       with _Category
  inline def TIRE_RETREADING_AND_REPAIR: TIRE_RETREADING_AND_REPAIR = "TIRE_RETREADING_AND_REPAIR".asInstanceOf[TIRE_RETREADING_AND_REPAIR]
  
  @js.native
  sealed trait TOLL_OR_BRIDGE_FEES
    extends StObject
       with _Category
  inline def TOLL_OR_BRIDGE_FEES: TOLL_OR_BRIDGE_FEES = "TOLL_OR_BRIDGE_FEES".asInstanceOf[TOLL_OR_BRIDGE_FEES]
  
  @js.native
  sealed trait TOOLS_AND_EQUIPMENT
    extends StObject
       with _Category
  inline def TOOLS_AND_EQUIPMENT: TOOLS_AND_EQUIPMENT = "TOOLS_AND_EQUIPMENT".asInstanceOf[TOOLS_AND_EQUIPMENT]
  
  @js.native
  sealed trait TOURIST_ATTRACTIONS_AND_EXHIBITS
    extends StObject
       with _Category
  inline def TOURIST_ATTRACTIONS_AND_EXHIBITS: TOURIST_ATTRACTIONS_AND_EXHIBITS = "TOURIST_ATTRACTIONS_AND_EXHIBITS".asInstanceOf[TOURIST_ATTRACTIONS_AND_EXHIBITS]
  
  @js.native
  sealed trait TOWING_SERVICE
    extends StObject
       with _Category
  inline def TOWING_SERVICE: TOWING_SERVICE = "TOWING_SERVICE".asInstanceOf[TOWING_SERVICE]
  
  @js.native
  sealed trait TOYS_AND_GAMES
    extends StObject
       with _Category
  inline def TOYS_AND_GAMES: TOYS_AND_GAMES = "TOYS_AND_GAMES".asInstanceOf[TOYS_AND_GAMES]
  
  @js.native
  sealed trait TRADEMARK_INFRINGEMENT
    extends StObject
       with _Category
  inline def TRADEMARK_INFRINGEMENT: TRADEMARK_INFRINGEMENT = "TRADEMARK_INFRINGEMENT".asInstanceOf[TRADEMARK_INFRINGEMENT]
  
  @js.native
  sealed trait TRADE_AND_VOCATIONAL_SCHOOLS
    extends StObject
       with _Category
  inline def TRADE_AND_VOCATIONAL_SCHOOLS: TRADE_AND_VOCATIONAL_SCHOOLS = "TRADE_AND_VOCATIONAL_SCHOOLS".asInstanceOf[TRADE_AND_VOCATIONAL_SCHOOLS]
  
  @js.native
  sealed trait TRAILER_PARKS_AND_CAMPGROUNDS
    extends StObject
       with _Category
  inline def TRAILER_PARKS_AND_CAMPGROUNDS: TRAILER_PARKS_AND_CAMPGROUNDS = "TRAILER_PARKS_AND_CAMPGROUNDS".asInstanceOf[TRAILER_PARKS_AND_CAMPGROUNDS]
  
  @js.native
  sealed trait TRAINING_SERVICES
    extends StObject
       with _Category
  inline def TRAINING_SERVICES: TRAINING_SERVICES = "TRAINING_SERVICES".asInstanceOf[TRAINING_SERVICES]
  
  @js.native
  sealed trait TRANSACTION_RECEIVING_LIMIT_EXCEEDED
    extends StObject
       with PaymentFailureReason
  inline def TRANSACTION_RECEIVING_LIMIT_EXCEEDED: TRANSACTION_RECEIVING_LIMIT_EXCEEDED = "TRANSACTION_RECEIVING_LIMIT_EXCEEDED".asInstanceOf[TRANSACTION_RECEIVING_LIMIT_EXCEEDED]
  
  @js.native
  sealed trait TRANSPORTATION_SERVICES
    extends StObject
       with _Category
  inline def TRANSPORTATION_SERVICES: TRANSPORTATION_SERVICES = "TRANSPORTATION_SERVICES".asInstanceOf[TRANSPORTATION_SERVICES]
  
  @js.native
  sealed trait TRAVEL
    extends StObject
       with _Category
  inline def TRAVEL: TRAVEL = "TRAVEL".asInstanceOf[TRAVEL]
  
  @js.native
  sealed trait TRIAL extends StObject
  inline def TRIAL: TRIAL = "TRIAL".asInstanceOf[TRIAL]
  
  @js.native
  sealed trait TRUCK_AND_UTILITY_TRAILER_RENTALS
    extends StObject
       with _Category
  inline def TRUCK_AND_UTILITY_TRAILER_RENTALS: TRUCK_AND_UTILITY_TRAILER_RENTALS = "TRUCK_AND_UTILITY_TRAILER_RENTALS".asInstanceOf[TRUCK_AND_UTILITY_TRAILER_RENTALS]
  
  @js.native
  sealed trait TRUCK_STOP
    extends StObject
       with _Category
  inline def TRUCK_STOP: TRUCK_STOP = "TRUCK_STOP".asInstanceOf[TRUCK_STOP]
  
  @js.native
  sealed trait TYPESETTING_PLATE_MAKING_AND_RELATED_SERVICES
    extends StObject
       with _Category
  inline def TYPESETTING_PLATE_MAKING_AND_RELATED_SERVICES: TYPESETTING_PLATE_MAKING_AND_RELATED_SERVICES = "TYPESETTING_PLATE_MAKING_AND_RELATED_SERVICES".asInstanceOf[TYPESETTING_PLATE_MAKING_AND_RELATED_SERVICES]
  
  @js.native
  sealed trait U extends StObject
  inline def U: U = "U".asInstanceOf[U]
  
  @js.native
  sealed trait UNKNOWN
    extends StObject
       with Payment
  inline def UNKNOWN: UNKNOWN = "UNKNOWN".asInstanceOf[UNKNOWN]
  
  @js.native
  sealed trait USD extends StObject
  inline def USD: USD = "USD".asInstanceOf[USD]
  
  @js.native
  sealed trait USED_MERCHANDISE_AND_SECONDHAND_STORES
    extends StObject
       with _Category
  inline def USED_MERCHANDISE_AND_SECONDHAND_STORES: USED_MERCHANDISE_AND_SECONDHAND_STORES = "USED_MERCHANDISE_AND_SECONDHAND_STORES".asInstanceOf[USED_MERCHANDISE_AND_SECONDHAND_STORES]
  
  @js.native
  sealed trait USED_PARTS_MOTOR_VEHICLE
    extends StObject
       with _Category
  inline def USED_PARTS_MOTOR_VEHICLE: USED_PARTS_MOTOR_VEHICLE = "USED_PARTS_MOTOR_VEHICLE".asInstanceOf[USED_PARTS_MOTOR_VEHICLE]
  
  @js.native
  sealed trait UTILITIES
    extends StObject
       with _Category
  inline def UTILITIES: UTILITIES = "UTILITIES".asInstanceOf[UTILITIES]
  
  @js.native
  sealed trait UTILITIES_ELECTRIC_GAS_WATER_SANITARY
    extends StObject
       with _Category
  inline def UTILITIES_ELECTRIC_GAS_WATER_SANITARY: UTILITIES_ELECTRIC_GAS_WATER_SANITARY = "UTILITIES_ELECTRIC_GAS_WATER_SANITARY".asInstanceOf[UTILITIES_ELECTRIC_GAS_WATER_SANITARY]
  
  @js.native
  sealed trait VARIETY_STORES
    extends StObject
       with _Category
  inline def VARIETY_STORES: VARIETY_STORES = "VARIETY_STORES".asInstanceOf[VARIETY_STORES]
  
  @js.native
  sealed trait VAULT
    extends StObject
       with ProductCode
  inline def VAULT: VAULT = "VAULT".asInstanceOf[VAULT]
  
  @js.native
  sealed trait VAULT_V2
    extends StObject
       with API
  inline def VAULT_V2: VAULT_V2 = "VAULT_V2".asInstanceOf[VAULT_V2]
  
  @js.native
  sealed trait VEHICLE_SALES
    extends StObject
       with _Category
  inline def VEHICLE_SALES: VEHICLE_SALES = "VEHICLE_SALES".asInstanceOf[VEHICLE_SALES]
  
  @js.native
  sealed trait VEHICLE_SERVICE_AND_ACCESSORIES
    extends StObject
       with _Category
  inline def VEHICLE_SERVICE_AND_ACCESSORIES: VEHICLE_SERVICE_AND_ACCESSORIES = "VEHICLE_SERVICE_AND_ACCESSORIES".asInstanceOf[VEHICLE_SERVICE_AND_ACCESSORIES]
  
  @js.native
  sealed trait VENDOR extends StObject
  inline def VENDOR: VENDOR = "VENDOR".asInstanceOf[VENDOR]
  
  @js.native
  sealed trait VIDEO_EQUIPMENT
    extends StObject
       with _Category
  inline def VIDEO_EQUIPMENT: VIDEO_EQUIPMENT = "VIDEO_EQUIPMENT".asInstanceOf[VIDEO_EQUIPMENT]
  
  @js.native
  sealed trait VIDEO_GAMES_AND_SYSTEMS
    extends StObject
       with _Category
  inline def VIDEO_GAMES_AND_SYSTEMS: VIDEO_GAMES_AND_SYSTEMS = "VIDEO_GAMES_AND_SYSTEMS".asInstanceOf[VIDEO_GAMES_AND_SYSTEMS]
  
  @js.native
  sealed trait VIDEO_GAME_ARCADES_ESTABLISH
    extends StObject
       with _Category
  inline def VIDEO_GAME_ARCADES_ESTABLISH: VIDEO_GAME_ARCADES_ESTABLISH = "VIDEO_GAME_ARCADES_ESTABLISH".asInstanceOf[VIDEO_GAME_ARCADES_ESTABLISH]
  
  @js.native
  sealed trait VIDEO_TAPE_RENTAL_STORES
    extends StObject
       with _Category
  inline def VIDEO_TAPE_RENTAL_STORES: VIDEO_TAPE_RENTAL_STORES = "VIDEO_TAPE_RENTAL_STORES".asInstanceOf[VIDEO_TAPE_RENTAL_STORES]
  
  @js.native
  sealed trait VINTAGE_AND_COLLECTIBLES
    extends StObject
       with _Category
  inline def VINTAGE_AND_COLLECTIBLES: VINTAGE_AND_COLLECTIBLES = "VINTAGE_AND_COLLECTIBLES".asInstanceOf[VINTAGE_AND_COLLECTIBLES]
  
  @js.native
  sealed trait VINTAGE_AND_COLLECTIBLE_VEHICLES
    extends StObject
       with _Category
  inline def VINTAGE_AND_COLLECTIBLE_VEHICLES: VINTAGE_AND_COLLECTIBLE_VEHICLES = "VINTAGE_AND_COLLECTIBLE_VEHICLES".asInstanceOf[VINTAGE_AND_COLLECTIBLE_VEHICLES]
  
  @js.native
  sealed trait VITAMINS_AND_SUPPLEMENTS
    extends StObject
       with _Category
  inline def VITAMINS_AND_SUPPLEMENTS: VITAMINS_AND_SUPPLEMENTS = "VITAMINS_AND_SUPPLEMENTS".asInstanceOf[VITAMINS_AND_SUPPLEMENTS]
  
  @js.native
  sealed trait VOCATIONAL_AND_TRADE_SCHOOLS
    extends StObject
       with _Category
  inline def VOCATIONAL_AND_TRADE_SCHOOLS: VOCATIONAL_AND_TRADE_SCHOOLS = "VOCATIONAL_AND_TRADE_SCHOOLS".asInstanceOf[VOCATIONAL_AND_TRADE_SCHOOLS]
  
  @js.native
  sealed trait VOIDED extends StObject
  inline def VOIDED: VOIDED = "VOIDED".asInstanceOf[VOIDED]
  
  @js.native
  sealed trait VOLUME extends StObject
  inline def VOLUME: VOLUME = "VOLUME".asInstanceOf[VOLUME]
  
  @js.native
  sealed trait WATCH_CLOCK_AND_JEWELRY_REPAIR
    extends StObject
       with _Category
  inline def WATCH_CLOCK_AND_JEWELRY_REPAIR: WATCH_CLOCK_AND_JEWELRY_REPAIR = "WATCH_CLOCK_AND_JEWELRY_REPAIR".asInstanceOf[WATCH_CLOCK_AND_JEWELRY_REPAIR]
  
  @js.native
  sealed trait WEB extends StObject
  inline def WEB: WEB = "WEB".asInstanceOf[WEB]
  
  @js.native
  sealed trait WEBSITE_PAYMENTS_STANDARD
    extends StObject
       with ProductCode
  inline def WEBSITE_PAYMENTS_STANDARD: WEBSITE_PAYMENTS_STANDARD = "WEBSITE_PAYMENTS_STANDARD".asInstanceOf[WEBSITE_PAYMENTS_STANDARD]
  
  @js.native
  sealed trait WEB_HOSTING_AND_DESIGN
    extends StObject
       with _Category
  inline def WEB_HOSTING_AND_DESIGN: WEB_HOSTING_AND_DESIGN = "WEB_HOSTING_AND_DESIGN".asInstanceOf[WEB_HOSTING_AND_DESIGN]
  
  @js.native
  sealed trait WEEK extends StObject
  inline def WEEK: WEEK = "WEEK".asInstanceOf[WEEK]
  
  @js.native
  sealed trait WELDING_REPAIR
    extends StObject
       with _Category
  inline def WELDING_REPAIR: WELDING_REPAIR = "WELDING_REPAIR".asInstanceOf[WELDING_REPAIR]
  
  @js.native
  sealed trait WHOLESALE_CLUBS
    extends StObject
       with _Category
  inline def WHOLESALE_CLUBS: WHOLESALE_CLUBS = "WHOLESALE_CLUBS".asInstanceOf[WHOLESALE_CLUBS]
  
  @js.native
  sealed trait WHOLESALE_FLORIST_SUPPLIERS
    extends StObject
       with _Category
  inline def WHOLESALE_FLORIST_SUPPLIERS: WHOLESALE_FLORIST_SUPPLIERS = "WHOLESALE_FLORIST_SUPPLIERS".asInstanceOf[WHOLESALE_FLORIST_SUPPLIERS]
  
  @js.native
  sealed trait WHOLESALE_PRESCRIPTION_DRUGS
    extends StObject
       with _Category
  inline def WHOLESALE_PRESCRIPTION_DRUGS: WHOLESALE_PRESCRIPTION_DRUGS = "WHOLESALE_PRESCRIPTION_DRUGS".asInstanceOf[WHOLESALE_PRESCRIPTION_DRUGS]
  
  @js.native
  sealed trait WILDLIFE_PRODUCTS
    extends StObject
       with _Category
  inline def WILDLIFE_PRODUCTS: WILDLIFE_PRODUCTS = "WILDLIFE_PRODUCTS".asInstanceOf[WILDLIFE_PRODUCTS]
  
  @js.native
  sealed trait WIRE_TRANSFER
    extends StObject
       with _Category
  inline def WIRE_TRANSFER: WIRE_TRANSFER = "WIRE_TRANSFER".asInstanceOf[WIRE_TRANSFER]
  
  @js.native
  sealed trait WIRE_TRANSFER_AND_MONEY_ORDER
    extends StObject
       with _Category
  inline def WIRE_TRANSFER_AND_MONEY_ORDER: WIRE_TRANSFER_AND_MONEY_ORDER = "WIRE_TRANSFER_AND_MONEY_ORDER".asInstanceOf[WIRE_TRANSFER_AND_MONEY_ORDER]
  
  @js.native
  sealed trait WOMEN_ACCESSORY_SPECIALITY
    extends StObject
       with _Category
  inline def WOMEN_ACCESSORY_SPECIALITY: WOMEN_ACCESSORY_SPECIALITY = "WOMEN_ACCESSORY_SPECIALITY".asInstanceOf[WOMEN_ACCESSORY_SPECIALITY]
  
  @js.native
  sealed trait WOMEN_CLOTHING
    extends StObject
       with _Category
  inline def WOMEN_CLOTHING: WOMEN_CLOTHING = "WOMEN_CLOTHING".asInstanceOf[WOMEN_CLOTHING]
  
  @js.native
  sealed trait Y extends StObject
  inline def Y: Y = "Y".asInstanceOf[Y]
  
  @js.native
  sealed trait YEAR extends StObject
  inline def YEAR: YEAR = "YEAR".asInstanceOf[YEAR]
  
  @js.native
  sealed trait YES extends StObject
  inline def YES: YES = "YES".asInstanceOf[YES]
  
  @js.native
  sealed trait alternative extends StObject
  inline def alternative: alternative = "alternative".asInstanceOf[alternative]
  
  @js.native
  sealed trait applepay
    extends StObject
       with FUNDING_SOURCE
  inline def applepay: applepay = "applepay".asInstanceOf[applepay]
  
  @js.native
  sealed trait bancontact
    extends StObject
       with FUNDING_SOURCE
  inline def bancontact: bancontact = "bancontact".asInstanceOf[bancontact]
  
  @js.native
  sealed trait black extends StObject
  inline def black: black = "black".asInstanceOf[black]
  
  @js.native
  sealed trait blik
    extends StObject
       with FUNDING_SOURCE
  inline def blik: blik = "blik".asInstanceOf[blik]
  
  @js.native
  sealed trait blue extends StObject
  inline def blue: blue = "blue".asInstanceOf[blue]
  
  @js.native
  sealed trait boletobancario
    extends StObject
       with FUNDING_SOURCE
  inline def boletobancario: boletobancario = "boletobancario".asInstanceOf[boletobancario]
  
  @js.native
  sealed trait buynow extends StObject
  inline def buynow: buynow = "buynow".asInstanceOf[buynow]
  
  @js.native
  sealed trait card
    extends StObject
       with FUNDING_SOURCE
  inline def card: card = "card".asInstanceOf[card]
  
  @js.native
  sealed trait cart extends StObject
  inline def cart: cart = "cart".asInstanceOf[cart]
  
  @js.native
  sealed trait category extends StObject
  inline def category: category = "category".asInstanceOf[category]
  
  @js.native
  sealed trait center extends StObject
  inline def center: center = "center".asInstanceOf[center]
  
  @js.native
  sealed trait checkout extends StObject
  inline def checkout: checkout = "checkout".asInstanceOf[checkout]
  
  @js.native
  sealed trait credit
    extends StObject
       with FUNDING_SOURCE
  inline def credit: credit = "credit".asInstanceOf[credit]
  
  @js.native
  sealed trait custom extends StObject
  inline def custom: custom = "custom".asInstanceOf[custom]
  
  @js.native
  sealed trait donate extends StObject
  inline def donate: donate = "donate".asInstanceOf[donate]
  
  @js.native
  sealed trait eps
    extends StObject
       with FUNDING_SOURCE
  inline def eps: eps = "eps".asInstanceOf[eps]
  
  @js.native
  sealed trait flex extends StObject
  inline def flex: flex = "flex".asInstanceOf[flex]
  
  @js.native
  sealed trait giropay
    extends StObject
       with FUNDING_SOURCE
  inline def giropay: giropay = "giropay".asInstanceOf[giropay]
  
  @js.native
  sealed trait gold extends StObject
  inline def gold: gold = "gold".asInstanceOf[gold]
  
  @js.native
  sealed trait grayscale extends StObject
  inline def grayscale: grayscale = "grayscale".asInstanceOf[grayscale]
  
  @js.native
  sealed trait home extends StObject
  inline def home: home = "home".asInstanceOf[home]
  
  @js.native
  sealed trait horizontal extends StObject
  inline def horizontal: horizontal = "horizontal".asInstanceOf[horizontal]
  
  @js.native
  sealed trait ideal
    extends StObject
       with FUNDING_SOURCE
  inline def ideal: ideal = "ideal".asInstanceOf[ideal]
  
  @js.native
  sealed trait inline_ extends StObject
  inline def inline_ : inline_ = "inline".asInstanceOf[inline_]
  
  @js.native
  sealed trait installment extends StObject
  inline def installment: installment = "installment".asInstanceOf[installment]
  
  @js.native
  sealed trait itau
    extends StObject
       with FUNDING_SOURCE
  inline def itau: itau = "itau".asInstanceOf[itau]
  
  @js.native
  sealed trait left extends StObject
  inline def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait maxima
    extends StObject
       with FUNDING_SOURCE
  inline def maxima: maxima = "maxima".asInstanceOf[maxima]
  
  @js.native
  sealed trait mercadopago
    extends StObject
       with FUNDING_SOURCE
  inline def mercadopago: mercadopago = "mercadopago".asInstanceOf[mercadopago]
  
  @js.native
  sealed trait monochrome extends StObject
  inline def monochrome: monochrome = "monochrome".asInstanceOf[monochrome]
  
  @js.native
  sealed trait multibanco
    extends StObject
       with FUNDING_SOURCE
  inline def multibanco: multibanco = "multibanco".asInstanceOf[multibanco]
  
  @js.native
  sealed trait mybank
    extends StObject
       with FUNDING_SOURCE
  inline def mybank: mybank = "mybank".asInstanceOf[mybank]
  
  @js.native
  sealed trait none_ extends StObject
  inline def none_ : none_ = "none".asInstanceOf[none_]
  
  @js.native
  sealed trait oxxo
    extends StObject
       with FUNDING_SOURCE
  inline def oxxo: oxxo = "oxxo".asInstanceOf[oxxo]
  
  @js.native
  sealed trait p24
    extends StObject
       with FUNDING_SOURCE
  inline def p24: p24 = "p24".asInstanceOf[p24]
  
  @js.native
  sealed trait pay extends StObject
  inline def pay: pay = "pay".asInstanceOf[pay]
  
  @js.native
  sealed trait paylater
    extends StObject
       with FUNDING_SOURCE
  inline def paylater: paylater = "paylater".asInstanceOf[paylater]
  
  @js.native
  sealed trait payment extends StObject
  inline def payment: payment = "payment".asInstanceOf[payment]
  
  @js.native
  sealed trait paypal__
    extends StObject
       with FUNDING_SOURCE
  inline def paypal__ : paypal__ = "paypal".asInstanceOf[paypal__]
  
  @js.native
  sealed trait payu
    extends StObject
       with FUNDING_SOURCE
  inline def payu: payu = "payu".asInstanceOf[payu]
  
  @js.native
  sealed trait pill extends StObject
  inline def pill: pill = "pill".asInstanceOf[pill]
  
  @js.native
  sealed trait primary extends StObject
  inline def primary: primary = "primary".asInstanceOf[primary]
  
  @js.native
  sealed trait product extends StObject
  inline def product: product = "product".asInstanceOf[product]
  
  @js.native
  sealed trait rect extends StObject
  inline def rect: rect = "rect".asInstanceOf[rect]
  
  @js.native
  sealed trait right extends StObject
  inline def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait sepa
    extends StObject
       with FUNDING_SOURCE
  inline def sepa: sepa = "sepa".asInstanceOf[sepa]
  
  @js.native
  sealed trait silver extends StObject
  inline def silver: silver = "silver".asInstanceOf[silver]
  
  @js.native
  sealed trait sofort
    extends StObject
       with FUNDING_SOURCE
  inline def sofort: sofort = "sofort".asInstanceOf[sofort]
  
  @js.native
  sealed trait subscribe extends StObject
  inline def subscribe: subscribe = "subscribe".asInstanceOf[subscribe]
  
  @js.native
  sealed trait text extends StObject
  inline def text: text = "text".asInstanceOf[text]
  
  @js.native
  sealed trait top extends StObject
  inline def top: top = "top".asInstanceOf[top]
  
  @js.native
  sealed trait trustly
    extends StObject
       with FUNDING_SOURCE
  inline def trustly: trustly = "trustly".asInstanceOf[trustly]
  
  @js.native
  sealed trait venmo
    extends StObject
       with FUNDING_SOURCE
  inline def venmo: venmo = "venmo".asInstanceOf[venmo]
  
  @js.native
  sealed trait verkkopankki
    extends StObject
       with FUNDING_SOURCE
  inline def verkkopankki: verkkopankki = "verkkopankki".asInstanceOf[verkkopankki]
  
  @js.native
  sealed trait vertical extends StObject
  inline def vertical: vertical = "vertical".asInstanceOf[vertical]
  
  @js.native
  sealed trait wechatpay
    extends StObject
       with FUNDING_SOURCE
  inline def wechatpay: wechatpay = "wechatpay".asInstanceOf[wechatpay]
  
  @js.native
  sealed trait white extends StObject
  inline def white: white = "white".asInstanceOf[white]
  
  @js.native
  sealed trait zimpler
    extends StObject
       with FUNDING_SOURCE
  inline def zimpler: zimpler = "zimpler".asInstanceOf[zimpler]
}
