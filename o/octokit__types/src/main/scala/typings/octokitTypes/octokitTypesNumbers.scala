package typings.octokitTypes

import typings.octokitTypes.endpointsMod.EmptyResponseStatuses
import typings.octokitTypes.endpointsMod.RedirectStatuses
import typings.octokitTypes.endpointsMod.SuccessStatuses
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object octokitTypesNumbers {
  
  @js.native
  sealed trait `200`
    extends StObject
       with SuccessStatuses
  inline def `200`: `200` = 200.asInstanceOf[`200`]
  
  @js.native
  sealed trait `201`
    extends StObject
       with EmptyResponseStatuses
       with SuccessStatuses
  inline def `201`: `201` = 201.asInstanceOf[`201`]
  
  @js.native
  sealed trait `202`
    extends StObject
       with SuccessStatuses
  inline def `202`: `202` = 202.asInstanceOf[`202`]
  
  @js.native
  sealed trait `204`
    extends StObject
       with EmptyResponseStatuses
       with SuccessStatuses
  inline def `204`: `204` = 204.asInstanceOf[`204`]
  
  @js.native
  sealed trait `301`
    extends StObject
       with RedirectStatuses
  inline def `301`: `301` = 301.asInstanceOf[`301`]
  
  @js.native
  sealed trait `302`
    extends StObject
       with RedirectStatuses
  inline def `302`: `302` = 302.asInstanceOf[`302`]
}
