package typings
package nextDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object nextDashServerLibStrings {
  @js.native
  sealed trait beforeHistoryChange
    extends nextDashServerLib.routerMod.EventName
  
  @js.native
  sealed trait hashChangeComplete
    extends nextDashServerLib.routerMod.EventName
  
  @js.native
  sealed trait hashChangeStart
    extends nextDashServerLib.routerMod.EventName
  
  @js.native
  sealed trait routeChangeComplete
    extends nextDashServerLib.routerMod.EventName
  
  @js.native
  sealed trait routeChangeError
    extends nextDashServerLib.routerMod.EventName
  
  @js.native
  sealed trait routeChangeStart
    extends nextDashServerLib.routerMod.EventName
  
  @scala.inline
  def beforeHistoryChange: beforeHistoryChange = "beforeHistoryChange".asInstanceOf[beforeHistoryChange]
  @scala.inline
  def hashChangeComplete: hashChangeComplete = "hashChangeComplete".asInstanceOf[hashChangeComplete]
  @scala.inline
  def hashChangeStart: hashChangeStart = "hashChangeStart".asInstanceOf[hashChangeStart]
  @scala.inline
  def routeChangeComplete: routeChangeComplete = "routeChangeComplete".asInstanceOf[routeChangeComplete]
  @scala.inline
  def routeChangeError: routeChangeError = "routeChangeError".asInstanceOf[routeChangeError]
  @scala.inline
  def routeChangeStart: routeChangeStart = "routeChangeStart".asInstanceOf[routeChangeStart]
}

