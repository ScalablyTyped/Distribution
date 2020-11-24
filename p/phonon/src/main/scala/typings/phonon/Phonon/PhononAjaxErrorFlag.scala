package typings.phonon.Phonon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*** Ajax ***/
/* Rewritten from type alias, can be one of: 
  - typings.phonon.phononStrings.NO_INTERNET_ACCESS
  - typings.phonon.phononStrings.TIMEOUT_EXCEEDED
  - typings.phonon.phononStrings.XMLHTTPREQUEST_UNAVAILABLE
  - typings.phonon.phononStrings.JSON_MALFORMED
  - typings.phonon.phononStrings.REQUEST_CANCELED
*/
trait PhononAjaxErrorFlag extends js.Object
object PhononAjaxErrorFlag {
  
  @scala.inline
  def JSON_MALFORMED: typings.phonon.phononStrings.JSON_MALFORMED = "JSON_MALFORMED".asInstanceOf[typings.phonon.phononStrings.JSON_MALFORMED]
  
  @scala.inline
  def NO_INTERNET_ACCESS: typings.phonon.phononStrings.NO_INTERNET_ACCESS = "NO_INTERNET_ACCESS".asInstanceOf[typings.phonon.phononStrings.NO_INTERNET_ACCESS]
  
  @scala.inline
  def REQUEST_CANCELED: typings.phonon.phononStrings.REQUEST_CANCELED = "REQUEST_CANCELED".asInstanceOf[typings.phonon.phononStrings.REQUEST_CANCELED]
  
  @scala.inline
  def TIMEOUT_EXCEEDED: typings.phonon.phononStrings.TIMEOUT_EXCEEDED = "TIMEOUT_EXCEEDED".asInstanceOf[typings.phonon.phononStrings.TIMEOUT_EXCEEDED]
  
  @scala.inline
  def XMLHTTPREQUEST_UNAVAILABLE: typings.phonon.phononStrings.XMLHTTPREQUEST_UNAVAILABLE = "XMLHTTPREQUEST_UNAVAILABLE".asInstanceOf[typings.phonon.phononStrings.XMLHTTPREQUEST_UNAVAILABLE]
}
