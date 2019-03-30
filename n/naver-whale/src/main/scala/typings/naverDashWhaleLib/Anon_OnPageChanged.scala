package typings
package naverDashWhaleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnPageChanged extends js.Object {
  var PageStateMatcher: org.scalablytyped.runtime.Instantiable1[
    /* options */ chromeLib.chromeNs.declarativeContentNs.PageStateMatcherProperties, 
    naverDashWhaleLib.whaleNs.declarativeContentNs.PageStateMatcher
  ]
  var PageStateMatcherProperties: org.scalablytyped.runtime.Instantiable0[naverDashWhaleLib.whaleNs.declarativeContentNs.PageStateMatcherProperties]
  var ShowPageAction: org.scalablytyped.runtime.Instantiable0[naverDashWhaleLib.whaleNs.declarativeContentNs.ShowPageAction]
  var onPageChanged: chromeLib.chromeNs.declarativeContentNs.PageChangedEvent
}

object Anon_OnPageChanged {
  @scala.inline
  def apply(
    PageStateMatcher: org.scalablytyped.runtime.Instantiable1[
      /* options */ chromeLib.chromeNs.declarativeContentNs.PageStateMatcherProperties, 
      naverDashWhaleLib.whaleNs.declarativeContentNs.PageStateMatcher
    ],
    PageStateMatcherProperties: org.scalablytyped.runtime.Instantiable0[naverDashWhaleLib.whaleNs.declarativeContentNs.PageStateMatcherProperties],
    ShowPageAction: org.scalablytyped.runtime.Instantiable0[naverDashWhaleLib.whaleNs.declarativeContentNs.ShowPageAction],
    onPageChanged: chromeLib.chromeNs.declarativeContentNs.PageChangedEvent
  ): Anon_OnPageChanged = {
    val __obj = js.Dynamic.literal(PageStateMatcher = PageStateMatcher, PageStateMatcherProperties = PageStateMatcherProperties, ShowPageAction = ShowPageAction, onPageChanged = onPageChanged)
  
    __obj.asInstanceOf[Anon_OnPageChanged]
  }
}

