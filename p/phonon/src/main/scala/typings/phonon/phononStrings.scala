package typings.phonon

import typings.phonon.Phonon.PhononAjaxErrorFlag
import typings.phonon.Phonon.PhononColor
import typings.phonon.Phonon.PhononPopoverDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object phononStrings {
  
  @js.native
  sealed trait JSON_MALFORMED
    extends StObject
       with PhononAjaxErrorFlag
  inline def JSON_MALFORMED: JSON_MALFORMED = "JSON_MALFORMED".asInstanceOf[JSON_MALFORMED]
  
  @js.native
  sealed trait NO_INTERNET_ACCESS
    extends StObject
       with PhononAjaxErrorFlag
  inline def NO_INTERNET_ACCESS: NO_INTERNET_ACCESS = "NO_INTERNET_ACCESS".asInstanceOf[NO_INTERNET_ACCESS]
  
  @js.native
  sealed trait REQUEST_CANCELED
    extends StObject
       with PhononAjaxErrorFlag
  inline def REQUEST_CANCELED: REQUEST_CANCELED = "REQUEST_CANCELED".asInstanceOf[REQUEST_CANCELED]
  
  @js.native
  sealed trait TIMEOUT_EXCEEDED
    extends StObject
       with PhononAjaxErrorFlag
  inline def TIMEOUT_EXCEEDED: TIMEOUT_EXCEEDED = "TIMEOUT_EXCEEDED".asInstanceOf[TIMEOUT_EXCEEDED]
  
  @js.native
  sealed trait XMLHTTPREQUEST_UNAVAILABLE
    extends StObject
       with PhononAjaxErrorFlag
  inline def XMLHTTPREQUEST_UNAVAILABLE: XMLHTTPREQUEST_UNAVAILABLE = "XMLHTTPREQUEST_UNAVAILABLE".asInstanceOf[XMLHTTPREQUEST_UNAVAILABLE]
  
  @js.native
  sealed trait left
    extends StObject
       with PhononPopoverDirection
  inline def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait negative
    extends StObject
       with PhononColor
  inline def negative: negative = "negative".asInstanceOf[negative]
  
  @js.native
  sealed trait positive
    extends StObject
       with PhononColor
  inline def positive: positive = "positive".asInstanceOf[positive]
  
  @js.native
  sealed trait right
    extends StObject
       with PhononPopoverDirection
  inline def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait title
    extends StObject
       with PhononPopoverDirection
  inline def title: title = "title".asInstanceOf[title]
  
  @js.native
  sealed trait `title-left`
    extends StObject
       with PhononPopoverDirection
  inline def `title-left`: `title-left` = "title-left".asInstanceOf[`title-left`]
}
