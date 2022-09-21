package typings.mraid

import typings.mraid.mod.MRAIDFeature
import typings.mraid.mod.MRAIDOrientation
import typings.mraid.mod.MRAIDPlacementType
import typings.mraid.mod.MRAIDState
import typings.mraid.mod.MRAIDVersion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mraidStrings {
  
  @js.native
  sealed trait default
    extends StObject
       with MRAIDState
  inline def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait `1Dot0`
    extends StObject
       with MRAIDVersion
  inline def `1Dot0`: `1Dot0` = "1.0".asInstanceOf[`1Dot0`]
  
  @js.native
  sealed trait `2Dot0`
    extends StObject
       with MRAIDVersion
  inline def `2Dot0`: `2Dot0` = "2.0".asInstanceOf[`2Dot0`]
  
  @js.native
  sealed trait `3Dot0`
    extends StObject
       with MRAIDVersion
  inline def `3Dot0`: `3Dot0` = "3.0".asInstanceOf[`3Dot0`]
  
  @js.native
  sealed trait `bottom-left` extends StObject
  inline def `bottom-left`: `bottom-left` = "bottom-left".asInstanceOf[`bottom-left`]
  
  @js.native
  sealed trait `bottom-right` extends StObject
  inline def `bottom-right`: `bottom-right` = "bottom-right".asInstanceOf[`bottom-right`]
  
  @js.native
  sealed trait calendar
    extends StObject
       with MRAIDFeature
  inline def calendar: calendar = "calendar".asInstanceOf[calendar]
  
  @js.native
  sealed trait expanded
    extends StObject
       with MRAIDState
  inline def expanded: expanded = "expanded".asInstanceOf[expanded]
  
  @js.native
  sealed trait hidden
    extends StObject
       with MRAIDState
  inline def hidden: hidden = "hidden".asInstanceOf[hidden]
  
  @js.native
  sealed trait `inline`
    extends StObject
       with MRAIDPlacementType
  inline def `inline`: `inline` = "inline".asInstanceOf[`inline`]
  
  @js.native
  sealed trait inlineVideo
    extends StObject
       with MRAIDFeature
  inline def inlineVideo: inlineVideo = "inlineVideo".asInstanceOf[inlineVideo]
  
  @js.native
  sealed trait interstitial
    extends StObject
       with MRAIDPlacementType
  inline def interstitial: interstitial = "interstitial".asInstanceOf[interstitial]
  
  @js.native
  sealed trait landscape
    extends StObject
       with MRAIDOrientation
  inline def landscape: landscape = "landscape".asInstanceOf[landscape]
  
  @js.native
  sealed trait loading
    extends StObject
       with MRAIDState
  inline def loading: loading = "loading".asInstanceOf[loading]
  
  @js.native
  sealed trait location
    extends StObject
       with MRAIDFeature
  inline def location: location = "location".asInstanceOf[location]
  
  @js.native
  sealed trait none extends StObject
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait portrait
    extends StObject
       with MRAIDOrientation
  inline def portrait: portrait = "portrait".asInstanceOf[portrait]
  
  @js.native
  sealed trait resized
    extends StObject
       with MRAIDState
  inline def resized: resized = "resized".asInstanceOf[resized]
  
  @js.native
  sealed trait sms
    extends StObject
       with MRAIDFeature
  inline def sms: sms = "sms".asInstanceOf[sms]
  
  @js.native
  sealed trait storePicture
    extends StObject
       with MRAIDFeature
  inline def storePicture: storePicture = "storePicture".asInstanceOf[storePicture]
  
  @js.native
  sealed trait tel
    extends StObject
       with MRAIDFeature
  inline def tel: tel = "tel".asInstanceOf[tel]
  
  @js.native
  sealed trait `top-left` extends StObject
  inline def `top-left`: `top-left` = "top-left".asInstanceOf[`top-left`]
  
  @js.native
  sealed trait `top-right` extends StObject
  inline def `top-right`: `top-right` = "top-right".asInstanceOf[`top-right`]
  
  @js.native
  sealed trait vpaid
    extends StObject
       with MRAIDFeature
  inline def vpaid: vpaid = "vpaid".asInstanceOf[vpaid]
}
