package typings.onfleetNodeOnfleet

import typings.onfleetNodeOnfleet.metadataMod.MetadataSubType
import typings.onfleetNodeOnfleet.metadataMod.MetadataType
import typings.onfleetNodeOnfleet.metadataMod.MetadataVisibility
import typings.onfleetNodeOnfleet.recipientsMod.RecipientQueryKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object onfleetNodeOnfleetStrings {
  
  @js.native
  sealed trait BICYCLE extends StObject
  inline def BICYCLE: BICYCLE = "BICYCLE".asInstanceOf[BICYCLE]
  
  @js.native
  sealed trait CAR extends StObject
  inline def CAR: CAR = "CAR".asInstanceOf[CAR]
  
  @js.native
  sealed trait MOTORCYCLE extends StObject
  inline def MOTORCYCLE: MOTORCYCLE = "MOTORCYCLE".asInstanceOf[MOTORCYCLE]
  
  @js.native
  sealed trait ORGANIZATION extends StObject
  inline def ORGANIZATION: ORGANIZATION = "ORGANIZATION".asInstanceOf[ORGANIZATION]
  
  @js.native
  sealed trait TEAM extends StObject
  inline def TEAM: TEAM = "TEAM".asInstanceOf[TEAM]
  
  @js.native
  sealed trait TRUCK extends StObject
  inline def TRUCK: TRUCK = "TRUCK".asInstanceOf[TRUCK]
  
  @js.native
  sealed trait WORKER extends StObject
  inline def WORKER: WORKER = "WORKER".asInstanceOf[WORKER]
  
  @js.native
  sealed trait api
    extends StObject
       with MetadataVisibility
  inline def api: api = "api".asInstanceOf[api]
  
  @js.native
  sealed trait array
    extends StObject
       with MetadataType
  inline def array: array = "array".asInstanceOf[array]
  
  @js.native
  sealed trait boolean
    extends StObject
       with MetadataSubType
       with MetadataType
  inline def boolean: boolean = "boolean".asInstanceOf[boolean]
  
  @js.native
  sealed trait dashboard
    extends StObject
       with MetadataVisibility
  inline def dashboard: dashboard = "dashboard".asInstanceOf[dashboard]
  
  @js.native
  sealed trait name
    extends StObject
       with RecipientQueryKey
  inline def name: name = "name".asInstanceOf[name]
  
  @js.native
  sealed trait number
    extends StObject
       with MetadataSubType
       with MetadataType
  inline def number: number = "number".asInstanceOf[number]
  
  @js.native
  sealed trait `object`
    extends StObject
       with MetadataSubType
       with MetadataType
  inline def `object`: `object` = "object".asInstanceOf[`object`]
  
  @js.native
  sealed trait organizations extends StObject
  inline def organizations: organizations = "organizations".asInstanceOf[organizations]
  
  @js.native
  sealed trait phone
    extends StObject
       with RecipientQueryKey
  inline def phone: phone = "phone".asInstanceOf[phone]
  
  @js.native
  sealed trait shortId extends StObject
  inline def shortId: shortId = "shortId".asInstanceOf[shortId]
  
  @js.native
  sealed trait standard extends StObject
  inline def standard: standard = "standard".asInstanceOf[standard]
  
  @js.native
  sealed trait string
    extends StObject
       with MetadataSubType
       with MetadataType
  inline def string: string = "string".asInstanceOf[string]
  
  @js.native
  sealed trait `super` extends StObject
  inline def `super`: `super` = "super".asInstanceOf[`super`]
  
  @js.native
  sealed trait teams extends StObject
  inline def teams: teams = "teams".asInstanceOf[teams]
  
  @js.native
  sealed trait worker_
    extends StObject
       with MetadataVisibility
  inline def worker_ : worker_ = "worker".asInstanceOf[worker_]
  
  @js.native
  sealed trait workers extends StObject
  inline def workers: workers = "workers".asInstanceOf[workers]
}
