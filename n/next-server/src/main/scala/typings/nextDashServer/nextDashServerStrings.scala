package typings.nextDashServer

import typings.nextDashServer.routerMod.EventName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object nextDashServerStrings {
  @js.native
  sealed trait NextModuleMapOptions extends js.Object
  
  @js.native
  sealed trait beforeHistoryChange extends EventName
  
  @js.native
  sealed trait hashChangeComplete extends EventName
  
  @js.native
  sealed trait hashChangeStart extends EventName
  
  @js.native
  sealed trait routeChangeComplete extends EventName
  
  @js.native
  sealed trait routeChangeError extends EventName
  
  @js.native
  sealed trait routeChangeStart extends EventName
  
  @scala.inline
  def NextModuleMapOptions: NextModuleMapOptions = "NextModuleMapOptions".asInstanceOf[NextModuleMapOptions]
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

