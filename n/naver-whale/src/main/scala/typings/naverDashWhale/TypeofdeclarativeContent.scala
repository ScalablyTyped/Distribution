package typings.naverDashWhale

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.chrome.chromeNs.declarativeContentNs.PageChangedEvent
import typings.chrome.chromeNs.declarativeContentNs.PageStateMatcherProperties
import typings.naverDashWhale.whaleNs.declarativeContentNs.PageStateMatcher
import typings.naverDashWhale.whaleNs.declarativeContentNs.ShowPageAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofdeclarativeContent extends js.Object {
  var PageStateMatcher: Instantiable1[
    /* options */ PageStateMatcherProperties, 
    typings.naverDashWhale.whaleNs.declarativeContentNs.PageStateMatcher
  ]
  var PageStateMatcherProperties: Instantiable0[typings.naverDashWhale.whaleNs.declarativeContentNs.PageStateMatcherProperties]
  var ShowPageAction: Instantiable0[typings.naverDashWhale.whaleNs.declarativeContentNs.ShowPageAction]
  var onPageChanged: PageChangedEvent
}

object TypeofdeclarativeContent {
  @scala.inline
  def apply(
    PageStateMatcher: Instantiable1[/* options */ PageStateMatcherProperties, PageStateMatcher],
    PageStateMatcherProperties: Instantiable0[typings.naverDashWhale.whaleNs.declarativeContentNs.PageStateMatcherProperties],
    ShowPageAction: Instantiable0[ShowPageAction],
    onPageChanged: PageChangedEvent
  ): TypeofdeclarativeContent = {
    val __obj = js.Dynamic.literal(PageStateMatcher = PageStateMatcher, PageStateMatcherProperties = PageStateMatcherProperties, ShowPageAction = ShowPageAction, onPageChanged = onPageChanged)
  
    __obj.asInstanceOf[TypeofdeclarativeContent]
  }
}

