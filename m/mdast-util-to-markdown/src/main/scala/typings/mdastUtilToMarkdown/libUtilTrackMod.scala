package typings.mdastUtilToMarkdown

import typings.mdastUtilToMarkdown.libTypesMod.TrackFields
import typings.mdastUtilToMarkdown.libTypesMod.Tracker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilTrackMod {
  
  @JSImport("mdast-util-to-markdown/lib/util/track", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def track(info: TrackFields): Tracker = ^.asInstanceOf[js.Dynamic].applyDynamic("track")(info.asInstanceOf[js.Any]).asInstanceOf[Tracker]
  
  type CreateTracker = typings.mdastUtilToMarkdown.libTypesMod.CreateTracker
  
  type TrackCurrent = typings.mdastUtilToMarkdown.libTypesMod.TrackCurrent
  
  type TrackMove = typings.mdastUtilToMarkdown.libTypesMod.TrackMove
  
  type TrackShift = typings.mdastUtilToMarkdown.libTypesMod.TrackShift
}
