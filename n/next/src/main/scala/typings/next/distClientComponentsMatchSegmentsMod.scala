package typings.next

import typings.next.distServerAppRenderMod.Segment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientComponentsMatchSegmentsMod {
  
  @JSImport("next/dist/client/components/match-segments", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def matchSegment(existingSegment: Segment, segment: Segment): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchSegment")(existingSegment.asInstanceOf[js.Any], segment.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
